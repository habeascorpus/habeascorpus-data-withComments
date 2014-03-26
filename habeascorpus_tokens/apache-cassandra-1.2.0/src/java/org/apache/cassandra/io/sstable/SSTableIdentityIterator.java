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
*	TokenNameMULTIPLY	
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
slf4j	TokenNameIdentifier	 slf4j
.	TokenNameDOT	
Logger	TokenNameIdentifier	 Logger
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
slf4j	TokenNameIdentifier	 slf4j
.	TokenNameDOT	
LoggerFactory	TokenNameIdentifier	 Logger Factory
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
*	TokenNameMULTIPLY	
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
ICountableColumnIterator	TokenNameIdentifier	 I Countable Column Iterator
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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
RandomAccessReader	TokenNameIdentifier	 Random Access Reader
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
BytesReadTracker	TokenNameIdentifier	 Bytes Read Tracker
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
SSTableIdentityIterator	TokenNameIdentifier	 SS Table Identity Iterator
implements	TokenNameimplements	
Comparable	TokenNameIdentifier	 Comparable
<	TokenNameLESS	
SSTableIdentityIterator	TokenNameIdentifier	 SS Table Identity Iterator
>	TokenNameGREATER	
,	TokenNameCOMMA	
ICountableColumnIterator	TokenNameIdentifier	 I Countable Column Iterator
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
=	TokenNameEQUAL	
LoggerFactory	TokenNameIdentifier	 Logger Factory
.	TokenNameDOT	
getLogger	TokenNameIdentifier	 get Logger
(	TokenNameLPAREN	
SSTableIdentityIterator	TokenNameIdentifier	 SS Table Identity Iterator
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
DecoratedKey	TokenNameIdentifier	 Decorated Key
key	TokenNameIdentifier	 key
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
DataInput	TokenNameIdentifier	 Data Input
input	TokenNameIdentifier	 input
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
long	TokenNamelong	
dataStart	TokenNameIdentifier	 data Start
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
long	TokenNamelong	
dataSize	TokenNameIdentifier	 data Size
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
IColumnSerializer	TokenNameIdentifier	 I Column Serializer
.	TokenNameDOT	
Flag	TokenNameIdentifier	 Flag
flag	TokenNameIdentifier	 flag
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
ColumnFamily	TokenNameIdentifier	 Column Family
columnFamily	TokenNameIdentifier	 column Family
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
int	TokenNameint	
columnCount	TokenNameIdentifier	 column Count
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
long	TokenNamelong	
columnPosition	TokenNameIdentifier	 column Position
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
OnDiskAtom	TokenNameIdentifier	 On Disk Atom
.	TokenNameDOT	
Serializer	TokenNameIdentifier	 Serializer
atomSerializer	TokenNameIdentifier	 atom Serializer
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
Descriptor	TokenNameIdentifier	 Descriptor
.	TokenNameDOT	
Version	TokenNameIdentifier	 Version
dataVersion	TokenNameIdentifier	 data Version
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
BytesReadTracker	TokenNameIdentifier	 Bytes Read Tracker
inputWithTracker	TokenNameIdentifier	 input With Tracker
;	TokenNameSEMICOLON	
// tracks bytes read 	TokenNameCOMMENT_LINE	tracks bytes read 
// Used by lazilyCompactedRow, so that we see the same things when deserializing the first and second time 	TokenNameCOMMENT_LINE	Used by lazilyCompactedRow, so that we see the same things when deserializing the first and second time 
private	TokenNameprivate	
final	TokenNamefinal	
int	TokenNameint	
expireBefore	TokenNameIdentifier	 expire Before
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
boolean	TokenNameboolean	
validateColumns	TokenNameIdentifier	 validate Columns
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
filename	TokenNameIdentifier	 filename
;	TokenNameSEMICOLON	
/** * Used to iterate through the columns of a row. * @param sstable SSTable we are reading ffrom. * @param file Reading using this file. * @param key Key of this row. * @param dataStart Data for this row starts at this pos. * @param dataSize length of row data * @throws IOException */	TokenNameCOMMENT_JAVADOC	 Used to iterate through the columns of a row. @param sstable SSTable we are reading ffrom. @param file Reading using this file. @param key Key of this row. @param dataStart Data for this row starts at this pos. @param dataSize length of row data @throws IOException 
public	TokenNamepublic	
SSTableIdentityIterator	TokenNameIdentifier	 SS Table Identity Iterator
(	TokenNameLPAREN	
SSTableReader	TokenNameIdentifier	 SS Table Reader
sstable	TokenNameIdentifier	 sstable
,	TokenNameCOMMA	
RandomAccessReader	TokenNameIdentifier	 Random Access Reader
file	TokenNameIdentifier	 file
,	TokenNameCOMMA	
DecoratedKey	TokenNameIdentifier	 Decorated Key
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
long	TokenNamelong	
dataStart	TokenNameIdentifier	 data Start
,	TokenNameCOMMA	
long	TokenNamelong	
dataSize	TokenNameIdentifier	 data Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
sstable	TokenNameIdentifier	 sstable
,	TokenNameCOMMA	
file	TokenNameIdentifier	 file
,	TokenNameCOMMA	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
dataStart	TokenNameIdentifier	 data Start
,	TokenNameCOMMA	
dataSize	TokenNameIdentifier	 data Size
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Used to iterate through the columns of a row. * @param sstable SSTable we are reading ffrom. * @param file Reading using this file. * @param key Key of this row. * @param dataStart Data for this row starts at this pos. * @param dataSize length of row data * @param checkData if true, do its best to deserialize and check the coherence of row data */	TokenNameCOMMENT_JAVADOC	 Used to iterate through the columns of a row. @param sstable SSTable we are reading ffrom. @param file Reading using this file. @param key Key of this row. @param dataStart Data for this row starts at this pos. @param dataSize length of row data @param checkData if true, do its best to deserialize and check the coherence of row data 
public	TokenNamepublic	
SSTableIdentityIterator	TokenNameIdentifier	 SS Table Identity Iterator
(	TokenNameLPAREN	
SSTableReader	TokenNameIdentifier	 SS Table Reader
sstable	TokenNameIdentifier	 sstable
,	TokenNameCOMMA	
RandomAccessReader	TokenNameIdentifier	 Random Access Reader
file	TokenNameIdentifier	 file
,	TokenNameCOMMA	
DecoratedKey	TokenNameIdentifier	 Decorated Key
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
long	TokenNamelong	
dataStart	TokenNameIdentifier	 data Start
,	TokenNameCOMMA	
long	TokenNamelong	
dataSize	TokenNameIdentifier	 data Size
,	TokenNameCOMMA	
boolean	TokenNameboolean	
checkData	TokenNameIdentifier	 check Data
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
sstable	TokenNameIdentifier	 sstable
.	TokenNameDOT	
metadata	TokenNameIdentifier	 metadata
,	TokenNameCOMMA	
file	TokenNameIdentifier	 file
,	TokenNameCOMMA	
file	TokenNameIdentifier	 file
.	TokenNameDOT	
getPath	TokenNameIdentifier	 get Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
dataStart	TokenNameIdentifier	 data Start
,	TokenNameCOMMA	
dataSize	TokenNameIdentifier	 data Size
,	TokenNameCOMMA	
checkData	TokenNameIdentifier	 check Data
,	TokenNameCOMMA	
sstable	TokenNameIdentifier	 sstable
,	TokenNameCOMMA	
IColumnSerializer	TokenNameIdentifier	 I Column Serializer
.	TokenNameDOT	
Flag	TokenNameIdentifier	 Flag
.	TokenNameDOT	
LOCAL	TokenNameIdentifier	 LOCAL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Must only be used against current file format 	TokenNameCOMMENT_LINE	Must only be used against current file format 
public	TokenNamepublic	
SSTableIdentityIterator	TokenNameIdentifier	 SS Table Identity Iterator
(	TokenNameLPAREN	
CFMetaData	TokenNameIdentifier	 CF Meta Data
metadata	TokenNameIdentifier	 metadata
,	TokenNameCOMMA	
DataInput	TokenNameIdentifier	 Data Input
file	TokenNameIdentifier	 file
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
filename	TokenNameIdentifier	 filename
,	TokenNameCOMMA	
DecoratedKey	TokenNameIdentifier	 Decorated Key
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
long	TokenNamelong	
dataStart	TokenNameIdentifier	 data Start
,	TokenNameCOMMA	
long	TokenNamelong	
dataSize	TokenNameIdentifier	 data Size
,	TokenNameCOMMA	
IColumnSerializer	TokenNameIdentifier	 I Column Serializer
.	TokenNameDOT	
Flag	TokenNameIdentifier	 Flag
flag	TokenNameIdentifier	 flag
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
metadata	TokenNameIdentifier	 metadata
,	TokenNameCOMMA	
file	TokenNameIdentifier	 file
,	TokenNameCOMMA	
filename	TokenNameIdentifier	 filename
,	TokenNameCOMMA	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
dataStart	TokenNameIdentifier	 data Start
,	TokenNameCOMMA	
dataSize	TokenNameIdentifier	 data Size
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
flag	TokenNameIdentifier	 flag
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// sstable may be null *if* checkData is false 	TokenNameCOMMENT_LINE	sstable may be null *if* checkData is false 
// If it is null, we assume the data is in the current file format 	TokenNameCOMMENT_LINE	If it is null, we assume the data is in the current file format 
private	TokenNameprivate	
SSTableIdentityIterator	TokenNameIdentifier	 SS Table Identity Iterator
(	TokenNameLPAREN	
CFMetaData	TokenNameIdentifier	 CF Meta Data
metadata	TokenNameIdentifier	 metadata
,	TokenNameCOMMA	
DataInput	TokenNameIdentifier	 Data Input
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
filename	TokenNameIdentifier	 filename
,	TokenNameCOMMA	
DecoratedKey	TokenNameIdentifier	 Decorated Key
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
long	TokenNamelong	
dataStart	TokenNameIdentifier	 data Start
,	TokenNameCOMMA	
long	TokenNamelong	
dataSize	TokenNameIdentifier	 data Size
,	TokenNameCOMMA	
boolean	TokenNameboolean	
checkData	TokenNameIdentifier	 check Data
,	TokenNameCOMMA	
SSTableReader	TokenNameIdentifier	 SS Table Reader
sstable	TokenNameIdentifier	 sstable
,	TokenNameCOMMA	
IColumnSerializer	TokenNameIdentifier	 I Column Serializer
.	TokenNameDOT	
Flag	TokenNameIdentifier	 Flag
flag	TokenNameIdentifier	 flag
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assert	TokenNameassert	
!	TokenNameNOT	
checkData	TokenNameIdentifier	 check Data
||	TokenNameOR_OR	
(	TokenNameLPAREN	
sstable	TokenNameIdentifier	 sstable
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
input	TokenNameIdentifier	 input
=	TokenNameEQUAL	
input	TokenNameIdentifier	 input
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
filename	TokenNameIdentifier	 filename
=	TokenNameEQUAL	
filename	TokenNameIdentifier	 filename
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
inputWithTracker	TokenNameIdentifier	 input With Tracker
=	TokenNameEQUAL	
new	TokenNamenew	
BytesReadTracker	TokenNameIdentifier	 Bytes Read Tracker
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
key	TokenNameIdentifier	 key
=	TokenNameEQUAL	
key	TokenNameIdentifier	 key
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
dataStart	TokenNameIdentifier	 data Start
=	TokenNameEQUAL	
dataStart	TokenNameIdentifier	 data Start
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
dataSize	TokenNameIdentifier	 data Size
=	TokenNameEQUAL	
dataSize	TokenNameIdentifier	 data Size
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
expireBefore	TokenNameIdentifier	 expire Before
=	TokenNameEQUAL	
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
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
flag	TokenNameIdentifier	 flag
=	TokenNameEQUAL	
flag	TokenNameIdentifier	 flag
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
validateColumns	TokenNameIdentifier	 validate Columns
=	TokenNameEQUAL	
checkData	TokenNameIdentifier	 check Data
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
dataVersion	TokenNameIdentifier	 data Version
=	TokenNameEQUAL	
sstable	TokenNameIdentifier	 sstable
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
Descriptor	TokenNameIdentifier	 Descriptor
.	TokenNameDOT	
Version	TokenNameIdentifier	 Version
.	TokenNameDOT	
CURRENT	TokenNameIdentifier	 CURRENT
:	TokenNameCOLON	
sstable	TokenNameIdentifier	 sstable
.	TokenNameDOT	
descriptor	TokenNameIdentifier	 descriptor
.	TokenNameDOT	
version	TokenNameIdentifier	 version
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
instanceof	TokenNameinstanceof	
RandomAccessReader	TokenNameIdentifier	 Random Access Reader
)	TokenNameRPAREN	
{	TokenNameLBRACE	
RandomAccessReader	TokenNameIdentifier	 Random Access Reader
file	TokenNameIdentifier	 file
=	TokenNameEQUAL	
(	TokenNameLPAREN	
RandomAccessReader	TokenNameIdentifier	 Random Access Reader
)	TokenNameRPAREN	
input	TokenNameIdentifier	 input
;	TokenNameSEMICOLON	
file	TokenNameIdentifier	 file
.	TokenNameDOT	
seek	TokenNameIdentifier	 seek
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
dataStart	TokenNameIdentifier	 data Start
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
dataStart	TokenNameIdentifier	 data Start
+	TokenNamePLUS	
dataSize	TokenNameIdentifier	 data Size
>	TokenNameGREATER	
file	TokenNameIdentifier	 file
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IOException	TokenNameIdentifier	 IO Exception
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
"dataSize of %s starting at %s would be larger than file %s length %s"	TokenNameStringLiteral	dataSize of %s starting at %s would be larger than file %s length %s
,	TokenNameCOMMA	
dataSize	TokenNameIdentifier	 data Size
,	TokenNameCOMMA	
dataStart	TokenNameIdentifier	 data Start
,	TokenNameCOMMA	
file	TokenNameIdentifier	 file
.	TokenNameDOT	
getPath	TokenNameIdentifier	 get Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
file	TokenNameIdentifier	 file
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
checkData	TokenNameIdentifier	 check Data
&&	TokenNameAND_AND	
!	TokenNameNOT	
sstable	TokenNameIdentifier	 sstable
.	TokenNameDOT	
descriptor	TokenNameIdentifier	 descriptor
.	TokenNameDOT	
version	TokenNameIdentifier	 version
.	TokenNameDOT	
hasPromotedIndexes	TokenNameIdentifier	 has Promoted Indexes
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
IndexHelper	TokenNameIdentifier	 Index Helper
.	TokenNameDOT	
defreezeBloomFilter	TokenNameIdentifier	 defreeze Bloom Filter
(	TokenNameLPAREN	
file	TokenNameIdentifier	 file
,	TokenNameCOMMA	
dataSize	TokenNameIdentifier	 data Size
,	TokenNameCOMMA	
sstable	TokenNameIdentifier	 sstable
.	TokenNameDOT	
descriptor	TokenNameIdentifier	 descriptor
.	TokenNameDOT	
version	TokenNameIdentifier	 version
.	TokenNameDOT	
filterType	TokenNameIdentifier	 filter Type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
instanceof	TokenNameinstanceof	
EOFException	TokenNameIdentifier	 EOF Exception
)	TokenNameRPAREN	
throw	TokenNamethrow	
(	TokenNameLPAREN	
EOFException	TokenNameIdentifier	 EOF Exception
)	TokenNameRPAREN	
e	TokenNameIdentifier	 e
;	TokenNameSEMICOLON	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"Invalid bloom filter in {}; will rebuild it"	TokenNameStringLiteral	Invalid bloom filter in {}; will rebuild it
,	TokenNameCOMMA	
sstable	TokenNameIdentifier	 sstable
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
// deFreeze should have left the file position ready to deserialize index 	TokenNameCOMMENT_LINE	deFreeze should have left the file position ready to deserialize index 
IndexHelper	TokenNameIdentifier	 Index Helper
.	TokenNameDOT	
deserializeIndex	TokenNameIdentifier	 deserialize Index
(	TokenNameLPAREN	
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"Invalid row summary in {}; will rebuild it"	TokenNameStringLiteral	Invalid row summary in {}; will rebuild it
,	TokenNameCOMMA	
sstable	TokenNameIdentifier	 sstable
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
file	TokenNameIdentifier	 file
.	TokenNameDOT	
seek	TokenNameIdentifier	 seek
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
dataStart	TokenNameIdentifier	 data Start
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
inputWithTracker	TokenNameIdentifier	 input With Tracker
.	TokenNameDOT	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
sstable	TokenNameIdentifier	 sstable
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
!	TokenNameNOT	
sstable	TokenNameIdentifier	 sstable
.	TokenNameDOT	
descriptor	TokenNameIdentifier	 descriptor
.	TokenNameDOT	
version	TokenNameIdentifier	 version
.	TokenNameDOT	
hasPromotedIndexes	TokenNameIdentifier	 has Promoted Indexes
)	TokenNameRPAREN	
{	TokenNameLBRACE	
IndexHelper	TokenNameIdentifier	 Index Helper
.	TokenNameDOT	
skipBloomFilter	TokenNameIdentifier	 skip Bloom Filter
(	TokenNameLPAREN	
inputWithTracker	TokenNameIdentifier	 input With Tracker
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
IndexHelper	TokenNameIdentifier	 Index Helper
.	TokenNameDOT	
skipIndex	TokenNameIdentifier	 skip Index
(	TokenNameLPAREN	
inputWithTracker	TokenNameIdentifier	 input With Tracker
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
columnFamily	TokenNameIdentifier	 column Family
=	TokenNameEQUAL	
ColumnFamily	TokenNameIdentifier	 Column Family
.	TokenNameDOT	
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
metadata	TokenNameIdentifier	 metadata
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
columnFamily	TokenNameIdentifier	 column Family
.	TokenNameDOT	
delete	TokenNameIdentifier	 delete
(	TokenNameLPAREN	
DeletionInfo	TokenNameIdentifier	 Deletion Info
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
deserializeFromSSTable	TokenNameIdentifier	 deserialize From SS Table
(	TokenNameLPAREN	
inputWithTracker	TokenNameIdentifier	 input With Tracker
,	TokenNameCOMMA	
dataVersion	TokenNameIdentifier	 data Version
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
atomSerializer	TokenNameIdentifier	 atom Serializer
=	TokenNameEQUAL	
columnFamily	TokenNameIdentifier	 column Family
.	TokenNameDOT	
getOnDiskSerializer	TokenNameIdentifier	 get On Disk Serializer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
columnCount	TokenNameIdentifier	 column Count
=	TokenNameEQUAL	
inputWithTracker	TokenNameIdentifier	 input With Tracker
.	TokenNameDOT	
readInt	TokenNameIdentifier	 read Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
columnPosition	TokenNameIdentifier	 column Position
=	TokenNameEQUAL	
dataStart	TokenNameIdentifier	 data Start
+	TokenNamePLUS	
inputWithTracker	TokenNameIdentifier	 input With Tracker
.	TokenNameDOT	
getBytesRead	TokenNameIdentifier	 get Bytes Read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
sstable	TokenNameIdentifier	 sstable
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
sstable	TokenNameIdentifier	 sstable
.	TokenNameDOT	
markSuspect	TokenNameIdentifier	 mark Suspect
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
new	TokenNamenew	
CorruptSSTableException	TokenNameIdentifier	 Corrupt SS Table Exception
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
,	TokenNameCOMMA	
filename	TokenNameIdentifier	 filename
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
columnFamily	TokenNameIdentifier	 column Family
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
inputWithTracker	TokenNameIdentifier	 input With Tracker
.	TokenNameDOT	
getBytesRead	TokenNameIdentifier	 get Bytes Read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
<	TokenNameLESS	
dataSize	TokenNameIdentifier	 data Size
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
OnDiskAtom	TokenNameIdentifier	 On Disk Atom
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
OnDiskAtom	TokenNameIdentifier	 On Disk Atom
atom	TokenNameIdentifier	 atom
=	TokenNameEQUAL	
atomSerializer	TokenNameIdentifier	 atom Serializer
.	TokenNameDOT	
deserializeFromSSTable	TokenNameIdentifier	 deserialize From SS Table
(	TokenNameLPAREN	
inputWithTracker	TokenNameIdentifier	 input With Tracker
,	TokenNameCOMMA	
flag	TokenNameIdentifier	 flag
,	TokenNameCOMMA	
expireBefore	TokenNameIdentifier	 expire Before
,	TokenNameCOMMA	
dataVersion	TokenNameIdentifier	 data Version
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
validateColumns	TokenNameIdentifier	 validate Columns
)	TokenNameRPAREN	
atom	TokenNameIdentifier	 atom
.	TokenNameDOT	
validateFields	TokenNameIdentifier	 validate Fields
(	TokenNameLPAREN	
columnFamily	TokenNameIdentifier	 column Family
.	TokenNameDOT	
metadata	TokenNameIdentifier	 metadata
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
atom	TokenNameIdentifier	 atom
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
CorruptSSTableException	TokenNameIdentifier	 Corrupt SS Table Exception
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
,	TokenNameCOMMA	
filename	TokenNameIdentifier	 filename
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
MarshalException	TokenNameIdentifier	 Marshal Exception
me	TokenNameIdentifier	 me
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
CorruptSSTableException	TokenNameIdentifier	 Corrupt SS Table Exception
(	TokenNameLPAREN	
me	TokenNameIdentifier	 me
,	TokenNameCOMMA	
filename	TokenNameIdentifier	 filename
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
{	TokenNameLBRACE	
// creator is responsible for closing file when finished 	TokenNameCOMMENT_LINE	creator is responsible for closing file when finished 
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getPath	TokenNameIdentifier	 get Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// if input is from file, then return that path, otherwise it's from streaming 	TokenNameCOMMENT_LINE	if input is from file, then return that path, otherwise it's from streaming 
if	TokenNameif	
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
instanceof	TokenNameinstanceof	
RandomAccessReader	TokenNameIdentifier	 Random Access Reader
)	TokenNameRPAREN	
{	TokenNameLBRACE	
RandomAccessReader	TokenNameIdentifier	 Random Access Reader
file	TokenNameIdentifier	 file
=	TokenNameEQUAL	
(	TokenNameLPAREN	
RandomAccessReader	TokenNameIdentifier	 Random Access Reader
)	TokenNameRPAREN	
input	TokenNameIdentifier	 input
;	TokenNameSEMICOLON	
return	TokenNamereturn	
file	TokenNameIdentifier	 file
.	TokenNameDOT	
getPath	TokenNameIdentifier	 get Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
UnsupportedOperationException	TokenNameIdentifier	 Unsupported Operation Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
ColumnFamily	TokenNameIdentifier	 Column Family
getColumnFamilyWithColumns	TokenNameIdentifier	 get Column Family With Columns
(	TokenNameLPAREN	
ISortedColumns	TokenNameIdentifier	 I Sorted Columns
.	TokenNameDOT	
Factory	TokenNameIdentifier	 Factory
containerFactory	TokenNameIdentifier	 container Factory
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
assert	TokenNameassert	
inputWithTracker	TokenNameIdentifier	 input With Tracker
.	TokenNameDOT	
getBytesRead	TokenNameIdentifier	 get Bytes Read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
headerSize	TokenNameIdentifier	 header Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ColumnFamily	TokenNameIdentifier	 Column Family
cf	TokenNameIdentifier	 cf
=	TokenNameEQUAL	
columnFamily	TokenNameIdentifier	 column Family
.	TokenNameDOT	
cloneMeShallow	TokenNameIdentifier	 clone Me Shallow
(	TokenNameLPAREN	
containerFactory	TokenNameIdentifier	 container Factory
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// since we already read column count, just pass that value and continue deserialization 	TokenNameCOMMENT_LINE	since we already read column count, just pass that value and continue deserialization 
columnFamily	TokenNameIdentifier	 column Family
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
deserializeColumnsFromSSTable	TokenNameIdentifier	 deserialize Columns From SS Table
(	TokenNameLPAREN	
inputWithTracker	TokenNameIdentifier	 input With Tracker
,	TokenNameCOMMA	
cf	TokenNameIdentifier	 cf
,	TokenNameCOMMA	
columnCount	TokenNameIdentifier	 column Count
,	TokenNameCOMMA	
flag	TokenNameIdentifier	 flag
,	TokenNameCOMMA	
expireBefore	TokenNameIdentifier	 expire Before
,	TokenNameCOMMA	
dataVersion	TokenNameIdentifier	 data Version
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
validateColumns	TokenNameIdentifier	 validate Columns
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
cf	TokenNameIdentifier	 cf
.	TokenNameDOT	
validateColumnFields	TokenNameIdentifier	 validate Column Fields
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
MarshalException	TokenNameIdentifier	 Marshal Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
"Error validating row "	TokenNameStringLiteral	Error validating row 
+	TokenNamePLUS	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
cf	TokenNameIdentifier	 cf
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
long	TokenNamelong	
headerSize	TokenNameIdentifier	 header Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
columnPosition	TokenNameIdentifier	 column Position
-	TokenNameMINUS	
dataStart	TokenNameIdentifier	 data Start
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
SSTableIdentityIterator	TokenNameIdentifier	 SS Table Identity Iterator
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
key	TokenNameIdentifier	 key
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
.	TokenNameDOT	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
instanceof	TokenNameinstanceof	
RandomAccessReader	TokenNameIdentifier	 Random Access Reader
)	TokenNameRPAREN	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
UnsupportedOperationException	TokenNameIdentifier	 Unsupported Operation Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
RandomAccessReader	TokenNameIdentifier	 Random Access Reader
file	TokenNameIdentifier	 file
=	TokenNameEQUAL	
(	TokenNameLPAREN	
RandomAccessReader	TokenNameIdentifier	 Random Access Reader
)	TokenNameRPAREN	
input	TokenNameIdentifier	 input
;	TokenNameSEMICOLON	
file	TokenNameIdentifier	 file
.	TokenNameDOT	
seek	TokenNameIdentifier	 seek
(	TokenNameLPAREN	
columnPosition	TokenNameIdentifier	 column Position
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
inputWithTracker	TokenNameIdentifier	 input With Tracker
.	TokenNameDOT	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
headerSize	TokenNameIdentifier	 header Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getColumnCount	TokenNameIdentifier	 get Column Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
columnCount	TokenNameIdentifier	 column Count
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
