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
*	TokenNameMULTIPLY	
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
security	TokenNameIdentifier	 security
.	TokenNameDOT	
MessageDigest	TokenNameIdentifier	 Message Digest
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
CFMetaData	TokenNameIdentifier	 CF Meta Data
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
marshal	TokenNameIdentifier	 marshal
.	TokenNameDOT	
MarshalException	TokenNameIdentifier	 Marshal Exception
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
IColumnSerializer	TokenNameIdentifier	 I Column Serializer
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
ISSTableSerializer	TokenNameIdentifier	 ISS Table Serializer
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
Descriptor	TokenNameIdentifier	 Descriptor
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
public	TokenNamepublic	
interface	TokenNameinterface	
OnDiskAtom	TokenNameIdentifier	 On Disk Atom
{	TokenNameLBRACE	
public	TokenNamepublic	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
name	TokenNameIdentifier	 name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * For a standard column, this is the same as timestamp(). * For a super column, this is the max column timestamp of the sub columns. */	TokenNameCOMMENT_JAVADOC	 For a standard column, this is the same as timestamp(). For a super column, this is the max column timestamp of the sub columns. 
public	TokenNamepublic	
long	TokenNamelong	
maxTimestamp	TokenNameIdentifier	 max Timestamp
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
int	TokenNameint	
getLocalDeletionTime	TokenNameIdentifier	 get Local Deletion Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// for tombstone GC, so int is sufficient granularity 	TokenNameCOMMENT_LINE	for tombstone GC, so int is sufficient granularity 
public	TokenNamepublic	
int	TokenNameint	
serializedSize	TokenNameIdentifier	 serialized Size
(	TokenNameLPAREN	
TypeSizes	TokenNameIdentifier	 Type Sizes
typeSizes	TokenNameIdentifier	 type Sizes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
long	TokenNamelong	
serializedSizeForSSTable	TokenNameIdentifier	 serialized Size For SS Table
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
void	TokenNamevoid	
validateFields	TokenNameIdentifier	 validate Fields
(	TokenNameLPAREN	
CFMetaData	TokenNameIdentifier	 CF Meta Data
metadata	TokenNameIdentifier	 metadata
)	TokenNameRPAREN	
throws	TokenNamethrows	
MarshalException	TokenNameIdentifier	 Marshal Exception
;	TokenNameSEMICOLON	
public	TokenNamepublic	
void	TokenNamevoid	
updateDigest	TokenNameIdentifier	 update Digest
(	TokenNameLPAREN	
MessageDigest	TokenNameIdentifier	 Message Digest
digest	TokenNameIdentifier	 digest
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
Serializer	TokenNameIdentifier	 Serializer
implements	TokenNameimplements	
ISSTableSerializer	TokenNameIdentifier	 ISS Table Serializer
<	TokenNameLESS	
OnDiskAtom	TokenNameIdentifier	 On Disk Atom
>	TokenNameGREATER	
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
IColumnSerializer	TokenNameIdentifier	 I Column Serializer
columnSerializer	TokenNameIdentifier	 column Serializer
;	TokenNameSEMICOLON	
public	TokenNamepublic	
Serializer	TokenNameIdentifier	 Serializer
(	TokenNameLPAREN	
IColumnSerializer	TokenNameIdentifier	 I Column Serializer
columnSerializer	TokenNameIdentifier	 column Serializer
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
columnSerializer	TokenNameIdentifier	 column Serializer
=	TokenNameEQUAL	
columnSerializer	TokenNameIdentifier	 column Serializer
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
serializeForSSTable	TokenNameIdentifier	 serialize For SS Table
(	TokenNameLPAREN	
OnDiskAtom	TokenNameIdentifier	 On Disk Atom
atom	TokenNameIdentifier	 atom
,	TokenNameCOMMA	
DataOutput	TokenNameIdentifier	 Data Output
dos	TokenNameIdentifier	 dos
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
atom	TokenNameIdentifier	 atom
instanceof	TokenNameinstanceof	
IColumn	TokenNameIdentifier	 I Column
)	TokenNameRPAREN	
{	TokenNameLBRACE	
columnSerializer	TokenNameIdentifier	 column Serializer
.	TokenNameDOT	
serialize	TokenNameIdentifier	 serialize
(	TokenNameLPAREN	
(	TokenNameLPAREN	
IColumn	TokenNameIdentifier	 I Column
)	TokenNameRPAREN	
atom	TokenNameIdentifier	 atom
,	TokenNameCOMMA	
dos	TokenNameIdentifier	 dos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
assert	TokenNameassert	
atom	TokenNameIdentifier	 atom
instanceof	TokenNameinstanceof	
RangeTombstone	TokenNameIdentifier	 Range Tombstone
;	TokenNameSEMICOLON	
RangeTombstone	TokenNameIdentifier	 Range Tombstone
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
serializeForSSTable	TokenNameIdentifier	 serialize For SS Table
(	TokenNameLPAREN	
(	TokenNameLPAREN	
RangeTombstone	TokenNameIdentifier	 Range Tombstone
)	TokenNameRPAREN	
atom	TokenNameIdentifier	 atom
,	TokenNameCOMMA	
dos	TokenNameIdentifier	 dos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
OnDiskAtom	TokenNameIdentifier	 On Disk Atom
deserializeFromSSTable	TokenNameIdentifier	 deserialize From SS Table
(	TokenNameLPAREN	
DataInput	TokenNameIdentifier	 Data Input
dis	TokenNameIdentifier	 dis
,	TokenNameCOMMA	
Descriptor	TokenNameIdentifier	 Descriptor
.	TokenNameDOT	
Version	TokenNameIdentifier	 Version
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
deserializeFromSSTable	TokenNameIdentifier	 deserialize From SS Table
(	TokenNameLPAREN	
dis	TokenNameIdentifier	 dis
,	TokenNameCOMMA	
IColumnSerializer	TokenNameIdentifier	 I Column Serializer
.	TokenNameDOT	
Flag	TokenNameIdentifier	 Flag
.	TokenNameDOT	
LOCAL	TokenNameIdentifier	 LOCAL
,	TokenNameCOMMA	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
currentTimeMillis	TokenNameIdentifier	 current Time Millis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
1000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
OnDiskAtom	TokenNameIdentifier	 On Disk Atom
deserializeFromSSTable	TokenNameIdentifier	 deserialize From SS Table
(	TokenNameLPAREN	
DataInput	TokenNameIdentifier	 Data Input
dis	TokenNameIdentifier	 dis
,	TokenNameCOMMA	
IColumnSerializer	TokenNameIdentifier	 I Column Serializer
.	TokenNameDOT	
Flag	TokenNameIdentifier	 Flag
flag	TokenNameIdentifier	 flag
,	TokenNameCOMMA	
int	TokenNameint	
expireBefore	TokenNameIdentifier	 expire Before
,	TokenNameCOMMA	
Descriptor	TokenNameIdentifier	 Descriptor
.	TokenNameDOT	
Version	TokenNameIdentifier	 Version
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
columnSerializer	TokenNameIdentifier	 column Serializer
instanceof	TokenNameinstanceof	
SuperColumnSerializer	TokenNameIdentifier	 Super Column Serializer
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
columnSerializer	TokenNameIdentifier	 column Serializer
.	TokenNameDOT	
deserialize	TokenNameIdentifier	 deserialize
(	TokenNameLPAREN	
dis	TokenNameIdentifier	 dis
,	TokenNameCOMMA	
flag	TokenNameIdentifier	 flag
,	TokenNameCOMMA	
expireBefore	TokenNameIdentifier	 expire Before
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
ByteBufferUtil	TokenNameIdentifier	 Byte Buffer Util
.	TokenNameDOT	
readWithShortLength	TokenNameIdentifier	 read With Short Length
(	TokenNameLPAREN	
dis	TokenNameIdentifier	 dis
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
remaining	TokenNameIdentifier	 remaining
(	TokenNameLPAREN	
)	TokenNameRPAREN	
<=	TokenNameLESS_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
throw	TokenNamethrow	
ColumnSerializer	TokenNameIdentifier	 Column Serializer
.	TokenNameDOT	
CorruptColumnException	TokenNameIdentifier	 Corrupt Column Exception
.	TokenNameDOT	
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
dis	TokenNameIdentifier	 dis
,	TokenNameCOMMA	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
b	TokenNameIdentifier	 b
=	TokenNameEQUAL	
dis	TokenNameIdentifier	 dis
.	TokenNameDOT	
readUnsignedByte	TokenNameIdentifier	 read Unsigned Byte
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
&	TokenNameAND	
ColumnSerializer	TokenNameIdentifier	 Column Serializer
.	TokenNameDOT	
RANGE_TOMBSTONE_MASK	TokenNameIdentifier	 RANGE  TOMBSTONE  MASK
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
RangeTombstone	TokenNameIdentifier	 Range Tombstone
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
deserializeBody	TokenNameIdentifier	 deserialize Body
(	TokenNameLPAREN	
dis	TokenNameIdentifier	 dis
,	TokenNameCOMMA	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
ColumnSerializer	TokenNameIdentifier	 Column Serializer
)	TokenNameRPAREN	
columnSerializer	TokenNameIdentifier	 column Serializer
)	TokenNameRPAREN	
.	TokenNameDOT	
deserializeColumnBody	TokenNameIdentifier	 deserialize Column Body
(	TokenNameLPAREN	
dis	TokenNameIdentifier	 dis
,	TokenNameCOMMA	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
b	TokenNameIdentifier	 b
,	TokenNameCOMMA	
flag	TokenNameIdentifier	 flag
,	TokenNameCOMMA	
expireBefore	TokenNameIdentifier	 expire Before
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
