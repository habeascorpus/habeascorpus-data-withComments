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
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
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
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
StreamingHistogram	TokenNameIdentifier	 Streaming Histogram
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
db	TokenNameIdentifier	 db
.	TokenNameDOT	
commitlog	TokenNameIdentifier	 commitlog
.	TokenNameDOT	
ReplayPosition	TokenNameIdentifier	 Replay Position
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
FileUtils	TokenNameIdentifier	 File Utils
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
EstimatedHistogram	TokenNameIdentifier	 Estimated Histogram
;	TokenNameSEMICOLON	
/** * Metadata for a SSTable. * Metadata includes: * - estimated row size histogram * - estimated column count histogram * - replay position * - max column timestamp * - compression ratio * - partitioner * - generations of sstables from which this sstable was compacted, if any * - tombstone drop time histogram * * An SSTableMetadata should be instantiated via the Collector, openFromDescriptor() * or createDefaultInstance() */	TokenNameCOMMENT_JAVADOC	 Metadata for a SSTable. Metadata includes: - estimated row size histogram - estimated column count histogram - replay position - max column timestamp - compression ratio - partitioner - generations of sstables from which this sstable was compacted, if any - tombstone drop time histogram * An SSTableMetadata should be instantiated via the Collector, openFromDescriptor() or createDefaultInstance() 
public	TokenNamepublic	
class	TokenNameclass	
SSTableMetadata	TokenNameIdentifier	 SS Table Metadata
{	TokenNameLBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
double	TokenNamedouble	
NO_COMPRESSION_RATIO	TokenNameIdentifier	 NO  COMPRESSION  RATIO
=	TokenNameEQUAL	
-	TokenNameMINUS	
1.0	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
SSTableMetadataSerializer	TokenNameIdentifier	 SS Table Metadata Serializer
serializer	TokenNameIdentifier	 serializer
=	TokenNameEQUAL	
new	TokenNamenew	
SSTableMetadataSerializer	TokenNameIdentifier	 SS Table Metadata Serializer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
EstimatedHistogram	TokenNameIdentifier	 Estimated Histogram
estimatedRowSize	TokenNameIdentifier	 estimated Row Size
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
EstimatedHistogram	TokenNameIdentifier	 Estimated Histogram
estimatedColumnCount	TokenNameIdentifier	 estimated Column Count
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
ReplayPosition	TokenNameIdentifier	 Replay Position
replayPosition	TokenNameIdentifier	 replay Position
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
long	TokenNamelong	
maxTimestamp	TokenNameIdentifier	 max Timestamp
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
double	TokenNamedouble	
compressionRatio	TokenNameIdentifier	 compression Ratio
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
partitioner	TokenNameIdentifier	 partitioner
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
>	TokenNameGREATER	
ancestors	TokenNameIdentifier	 ancestors
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
StreamingHistogram	TokenNameIdentifier	 Streaming Histogram
estimatedTombstoneDropTime	TokenNameIdentifier	 estimated Tombstone Drop Time
;	TokenNameSEMICOLON	
private	TokenNameprivate	
SSTableMetadata	TokenNameIdentifier	 SS Table Metadata
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
defaultRowSizeHistogram	TokenNameIdentifier	 default Row Size Histogram
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
defaultColumnCountHistogram	TokenNameIdentifier	 default Column Count Histogram
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
ReplayPosition	TokenNameIdentifier	 Replay Position
.	TokenNameDOT	
NONE	TokenNameIdentifier	 NONE
,	TokenNameCOMMA	
Long	TokenNameIdentifier	 Long
.	TokenNameDOT	
MIN_VALUE	TokenNameIdentifier	 MIN  VALUE
,	TokenNameCOMMA	
NO_COMPRESSION_RATIO	TokenNameIdentifier	 NO  COMPRESSION  RATIO
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
>	TokenNameGREATER	
emptySet	TokenNameIdentifier	 empty Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
defaultTombstoneDropTimeHistogram	TokenNameIdentifier	 default Tombstone Drop Time Histogram
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
SSTableMetadata	TokenNameIdentifier	 SS Table Metadata
(	TokenNameLPAREN	
EstimatedHistogram	TokenNameIdentifier	 Estimated Histogram
rowSizes	TokenNameIdentifier	 row Sizes
,	TokenNameCOMMA	
EstimatedHistogram	TokenNameIdentifier	 Estimated Histogram
columnCounts	TokenNameIdentifier	 column Counts
,	TokenNameCOMMA	
ReplayPosition	TokenNameIdentifier	 Replay Position
replayPosition	TokenNameIdentifier	 replay Position
,	TokenNameCOMMA	
long	TokenNamelong	
maxTimestamp	TokenNameIdentifier	 max Timestamp
,	TokenNameCOMMA	
double	TokenNamedouble	
cr	TokenNameIdentifier	 cr
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
partitioner	TokenNameIdentifier	 partitioner
,	TokenNameCOMMA	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
>	TokenNameGREATER	
ancestors	TokenNameIdentifier	 ancestors
,	TokenNameCOMMA	
StreamingHistogram	TokenNameIdentifier	 Streaming Histogram
estimatedTombstoneDropTime	TokenNameIdentifier	 estimated Tombstone Drop Time
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
estimatedRowSize	TokenNameIdentifier	 estimated Row Size
=	TokenNameEQUAL	
rowSizes	TokenNameIdentifier	 row Sizes
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
estimatedColumnCount	TokenNameIdentifier	 estimated Column Count
=	TokenNameEQUAL	
columnCounts	TokenNameIdentifier	 column Counts
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
replayPosition	TokenNameIdentifier	 replay Position
=	TokenNameEQUAL	
replayPosition	TokenNameIdentifier	 replay Position
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
maxTimestamp	TokenNameIdentifier	 max Timestamp
=	TokenNameEQUAL	
maxTimestamp	TokenNameIdentifier	 max Timestamp
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
compressionRatio	TokenNameIdentifier	 compression Ratio
=	TokenNameEQUAL	
cr	TokenNameIdentifier	 cr
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
partitioner	TokenNameIdentifier	 partitioner
=	TokenNameEQUAL	
partitioner	TokenNameIdentifier	 partitioner
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
ancestors	TokenNameIdentifier	 ancestors
=	TokenNameEQUAL	
ancestors	TokenNameIdentifier	 ancestors
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
estimatedTombstoneDropTime	TokenNameIdentifier	 estimated Tombstone Drop Time
=	TokenNameEQUAL	
estimatedTombstoneDropTime	TokenNameIdentifier	 estimated Tombstone Drop Time
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
SSTableMetadata	TokenNameIdentifier	 SS Table Metadata
createDefaultInstance	TokenNameIdentifier	 create Default Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
SSTableMetadata	TokenNameIdentifier	 SS Table Metadata
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
Collector	TokenNameIdentifier	 Collector
createCollector	TokenNameIdentifier	 create Collector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
Collector	TokenNameIdentifier	 Collector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
static	TokenNamestatic	
EstimatedHistogram	TokenNameIdentifier	 Estimated Histogram
defaultColumnCountHistogram	TokenNameIdentifier	 default Column Count Histogram
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// EH of 114 can track a max value of 2395318855, i.e., > 2B columns 	TokenNameCOMMENT_LINE	EH of 114 can track a max value of 2395318855, i.e., > 2B columns 
return	TokenNamereturn	
new	TokenNamenew	
EstimatedHistogram	TokenNameIdentifier	 Estimated Histogram
(	TokenNameLPAREN	
114	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
static	TokenNamestatic	
EstimatedHistogram	TokenNameIdentifier	 Estimated Histogram
defaultRowSizeHistogram	TokenNameIdentifier	 default Row Size Histogram
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// EH of 150 can track a max value of 1697806495183, i.e., > 1.5PB 	TokenNameCOMMENT_LINE	EH of 150 can track a max value of 1697806495183, i.e., > 1.5PB 
return	TokenNamereturn	
new	TokenNamenew	
EstimatedHistogram	TokenNameIdentifier	 Estimated Histogram
(	TokenNameLPAREN	
150	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
static	TokenNamestatic	
StreamingHistogram	TokenNameIdentifier	 Streaming Histogram
defaultTombstoneDropTimeHistogram	TokenNameIdentifier	 default Tombstone Drop Time Histogram
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
StreamingHistogram	TokenNameIdentifier	 Streaming Histogram
(	TokenNameLPAREN	
SSTable	TokenNameIdentifier	 SS Table
.	TokenNameDOT	
TOMBSTONE_HISTOGRAM_BIN_SIZE	TokenNameIdentifier	 TOMBSTONE  HISTOGRAM  BIN  SIZE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @param gcBefore * @return estimated droppable tombstone ratio at given gcBefore time. */	TokenNameCOMMENT_JAVADOC	 @param gcBefore @return estimated droppable tombstone ratio at given gcBefore time. 
public	TokenNamepublic	
double	TokenNamedouble	
getEstimatedDroppableTombstoneRatio	TokenNameIdentifier	 get Estimated Droppable Tombstone Ratio
(	TokenNameLPAREN	
int	TokenNameint	
gcBefore	TokenNameIdentifier	 gc Before
)	TokenNameRPAREN	
{	TokenNameLBRACE	
long	TokenNamelong	
estimatedColumnCount	TokenNameIdentifier	 estimated Column Count
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
estimatedColumnCount	TokenNameIdentifier	 estimated Column Count
.	TokenNameDOT	
mean	TokenNameIdentifier	 mean
(	TokenNameLPAREN	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
this	TokenNamethis	
.	TokenNameDOT	
estimatedColumnCount	TokenNameIdentifier	 estimated Column Count
.	TokenNameDOT	
count	TokenNameIdentifier	 count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
estimatedColumnCount	TokenNameIdentifier	 estimated Column Count
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
double	TokenNamedouble	
droppable	TokenNameIdentifier	 droppable
=	TokenNameEQUAL	
estimatedTombstoneDropTime	TokenNameIdentifier	 estimated Tombstone Drop Time
.	TokenNameDOT	
sum	TokenNameIdentifier	 sum
(	TokenNameLPAREN	
gcBefore	TokenNameIdentifier	 gc Before
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
droppable	TokenNameIdentifier	 droppable
/	TokenNameDIVIDE	
estimatedColumnCount	TokenNameIdentifier	 estimated Column Count
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
0.0f	TokenNameFloatingPointLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
Collector	TokenNameIdentifier	 Collector
{	TokenNameLBRACE	
protected	TokenNameprotected	
EstimatedHistogram	TokenNameIdentifier	 Estimated Histogram
estimatedRowSize	TokenNameIdentifier	 estimated Row Size
=	TokenNameEQUAL	
defaultRowSizeHistogram	TokenNameIdentifier	 default Row Size Histogram
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
EstimatedHistogram	TokenNameIdentifier	 Estimated Histogram
estimatedColumnCount	TokenNameIdentifier	 estimated Column Count
=	TokenNameEQUAL	
defaultColumnCountHistogram	TokenNameIdentifier	 default Column Count Histogram
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
ReplayPosition	TokenNameIdentifier	 Replay Position
replayPosition	TokenNameIdentifier	 replay Position
=	TokenNameEQUAL	
ReplayPosition	TokenNameIdentifier	 Replay Position
.	TokenNameDOT	
NONE	TokenNameIdentifier	 NONE
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
long	TokenNamelong	
maxTimestamp	TokenNameIdentifier	 max Timestamp
=	TokenNameEQUAL	
Long	TokenNameIdentifier	 Long
.	TokenNameDOT	
MIN_VALUE	TokenNameIdentifier	 MIN  VALUE
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
double	TokenNamedouble	
compressionRatio	TokenNameIdentifier	 compression Ratio
=	TokenNameEQUAL	
NO_COMPRESSION_RATIO	TokenNameIdentifier	 NO  COMPRESSION  RATIO
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
>	TokenNameGREATER	
ancestors	TokenNameIdentifier	 ancestors
=	TokenNameEQUAL	
new	TokenNamenew	
HashSet	TokenNameIdentifier	 Hash Set
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
StreamingHistogram	TokenNameIdentifier	 Streaming Histogram
estimatedTombstoneDropTime	TokenNameIdentifier	 estimated Tombstone Drop Time
=	TokenNameEQUAL	
defaultTombstoneDropTimeHistogram	TokenNameIdentifier	 default Tombstone Drop Time Histogram
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
void	TokenNamevoid	
addRowSize	TokenNameIdentifier	 add Row Size
(	TokenNameLPAREN	
long	TokenNamelong	
rowSize	TokenNameIdentifier	 row Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
estimatedRowSize	TokenNameIdentifier	 estimated Row Size
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
rowSize	TokenNameIdentifier	 row Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
addColumnCount	TokenNameIdentifier	 add Column Count
(	TokenNameLPAREN	
long	TokenNamelong	
columnCount	TokenNameIdentifier	 column Count
)	TokenNameRPAREN	
{	TokenNameLBRACE	
estimatedColumnCount	TokenNameIdentifier	 estimated Column Count
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
columnCount	TokenNameIdentifier	 column Count
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
mergeTombstoneHistogram	TokenNameIdentifier	 merge Tombstone Histogram
(	TokenNameLPAREN	
StreamingHistogram	TokenNameIdentifier	 Streaming Histogram
histogram	TokenNameIdentifier	 histogram
)	TokenNameRPAREN	
{	TokenNameLBRACE	
estimatedTombstoneDropTime	TokenNameIdentifier	 estimated Tombstone Drop Time
.	TokenNameDOT	
merge	TokenNameIdentifier	 merge
(	TokenNameLPAREN	
histogram	TokenNameIdentifier	 histogram
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Ratio is compressed/uncompressed and it is * if you have 1.x then compression isn't helping */	TokenNameCOMMENT_JAVADOC	 Ratio is compressed/uncompressed and it is if you have 1.x then compression isn't helping 
public	TokenNamepublic	
void	TokenNamevoid	
addCompressionRatio	TokenNameIdentifier	 add Compression Ratio
(	TokenNameLPAREN	
long	TokenNamelong	
compressed	TokenNameIdentifier	 compressed
,	TokenNameCOMMA	
long	TokenNamelong	
uncompressed	TokenNameIdentifier	 uncompressed
)	TokenNameRPAREN	
{	TokenNameLBRACE	
compressionRatio	TokenNameIdentifier	 compression Ratio
=	TokenNameEQUAL	
(	TokenNameLPAREN	
double	TokenNamedouble	
)	TokenNameRPAREN	
compressed	TokenNameIdentifier	 compressed
/	TokenNameDIVIDE	
uncompressed	TokenNameIdentifier	 uncompressed
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
updateMaxTimestamp	TokenNameIdentifier	 update Max Timestamp
(	TokenNameLPAREN	
long	TokenNamelong	
potentialMax	TokenNameIdentifier	 potential Max
)	TokenNameRPAREN	
{	TokenNameLBRACE	
maxTimestamp	TokenNameIdentifier	 max Timestamp
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
max	TokenNameIdentifier	 max
(	TokenNameLPAREN	
maxTimestamp	TokenNameIdentifier	 max Timestamp
,	TokenNameCOMMA	
potentialMax	TokenNameIdentifier	 potential Max
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
SSTableMetadata	TokenNameIdentifier	 SS Table Metadata
finalizeMetadata	TokenNameIdentifier	 finalize Metadata
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
partitioner	TokenNameIdentifier	 partitioner
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
SSTableMetadata	TokenNameIdentifier	 SS Table Metadata
(	TokenNameLPAREN	
estimatedRowSize	TokenNameIdentifier	 estimated Row Size
,	TokenNameCOMMA	
estimatedColumnCount	TokenNameIdentifier	 estimated Column Count
,	TokenNameCOMMA	
replayPosition	TokenNameIdentifier	 replay Position
,	TokenNameCOMMA	
maxTimestamp	TokenNameIdentifier	 max Timestamp
,	TokenNameCOMMA	
compressionRatio	TokenNameIdentifier	 compression Ratio
,	TokenNameCOMMA	
partitioner	TokenNameIdentifier	 partitioner
,	TokenNameCOMMA	
ancestors	TokenNameIdentifier	 ancestors
,	TokenNameCOMMA	
estimatedTombstoneDropTime	TokenNameIdentifier	 estimated Tombstone Drop Time
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Collector	TokenNameIdentifier	 Collector
estimatedRowSize	TokenNameIdentifier	 estimated Row Size
(	TokenNameLPAREN	
EstimatedHistogram	TokenNameIdentifier	 Estimated Histogram
estimatedRowSize	TokenNameIdentifier	 estimated Row Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
estimatedRowSize	TokenNameIdentifier	 estimated Row Size
=	TokenNameEQUAL	
estimatedRowSize	TokenNameIdentifier	 estimated Row Size
;	TokenNameSEMICOLON	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Collector	TokenNameIdentifier	 Collector
estimatedColumnCount	TokenNameIdentifier	 estimated Column Count
(	TokenNameLPAREN	
EstimatedHistogram	TokenNameIdentifier	 Estimated Histogram
estimatedColumnCount	TokenNameIdentifier	 estimated Column Count
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
estimatedColumnCount	TokenNameIdentifier	 estimated Column Count
=	TokenNameEQUAL	
estimatedColumnCount	TokenNameIdentifier	 estimated Column Count
;	TokenNameSEMICOLON	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Collector	TokenNameIdentifier	 Collector
replayPosition	TokenNameIdentifier	 replay Position
(	TokenNameLPAREN	
ReplayPosition	TokenNameIdentifier	 Replay Position
replayPosition	TokenNameIdentifier	 replay Position
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
replayPosition	TokenNameIdentifier	 replay Position
=	TokenNameEQUAL	
replayPosition	TokenNameIdentifier	 replay Position
;	TokenNameSEMICOLON	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Collector	TokenNameIdentifier	 Collector
addAncestor	TokenNameIdentifier	 add Ancestor
(	TokenNameLPAREN	
int	TokenNameint	
generation	TokenNameIdentifier	 generation
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
ancestors	TokenNameIdentifier	 ancestors
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
generation	TokenNameIdentifier	 generation
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
void	TokenNamevoid	
update	TokenNameIdentifier	 update
(	TokenNameLPAREN	
long	TokenNamelong	
size	TokenNameIdentifier	 size
,	TokenNameCOMMA	
ColumnStats	TokenNameIdentifier	 Column Stats
stats	TokenNameIdentifier	 stats
)	TokenNameRPAREN	
{	TokenNameLBRACE	
/* * The max timestamp is not always collected here (more precisely, row.maxTimestamp() may return Long.MIN_VALUE), * to avoid deserializing an EchoedRow. * This is the reason why it is collected first when calling ColumnFamilyStore.createCompactionWriter * However, for old sstables without timestamp, we still want to update the timestamp (and we know * that in this case we will not use EchoedRow, since CompactionControler.needsDeserialize() will be true). */	TokenNameCOMMENT_BLOCK	 The max timestamp is not always collected here (more precisely, row.maxTimestamp() may return Long.MIN_VALUE), to avoid deserializing an EchoedRow. This is the reason why it is collected first when calling ColumnFamilyStore.createCompactionWriter However, for old sstables without timestamp, we still want to update the timestamp (and we know that in this case we will not use EchoedRow, since CompactionControler.needsDeserialize() will be true). 
updateMaxTimestamp	TokenNameIdentifier	 update Max Timestamp
(	TokenNameLPAREN	
stats	TokenNameIdentifier	 stats
.	TokenNameDOT	
maxTimestamp	TokenNameIdentifier	 max Timestamp
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
addRowSize	TokenNameIdentifier	 add Row Size
(	TokenNameLPAREN	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
addColumnCount	TokenNameIdentifier	 add Column Count
(	TokenNameLPAREN	
stats	TokenNameIdentifier	 stats
.	TokenNameDOT	
columnCount	TokenNameIdentifier	 column Count
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mergeTombstoneHistogram	TokenNameIdentifier	 merge Tombstone Histogram
(	TokenNameLPAREN	
stats	TokenNameIdentifier	 stats
.	TokenNameDOT	
tombstoneHistogram	TokenNameIdentifier	 tombstone Histogram
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
SSTableMetadataSerializer	TokenNameIdentifier	 SS Table Metadata Serializer
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
SSTableMetadataSerializer	TokenNameIdentifier	 SS Table Metadata Serializer
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
void	TokenNamevoid	
serialize	TokenNameIdentifier	 serialize
(	TokenNameLPAREN	
SSTableMetadata	TokenNameIdentifier	 SS Table Metadata
sstableStats	TokenNameIdentifier	 sstable Stats
,	TokenNameCOMMA	
DataOutput	TokenNameIdentifier	 Data Output
dos	TokenNameIdentifier	 dos
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
assert	TokenNameassert	
sstableStats	TokenNameIdentifier	 sstable Stats
.	TokenNameDOT	
partitioner	TokenNameIdentifier	 partitioner
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
EstimatedHistogram	TokenNameIdentifier	 Estimated Histogram
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
serialize	TokenNameIdentifier	 serialize
(	TokenNameLPAREN	
sstableStats	TokenNameIdentifier	 sstable Stats
.	TokenNameDOT	
estimatedRowSize	TokenNameIdentifier	 estimated Row Size
,	TokenNameCOMMA	
dos	TokenNameIdentifier	 dos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
EstimatedHistogram	TokenNameIdentifier	 Estimated Histogram
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
serialize	TokenNameIdentifier	 serialize
(	TokenNameLPAREN	
sstableStats	TokenNameIdentifier	 sstable Stats
.	TokenNameDOT	
estimatedColumnCount	TokenNameIdentifier	 estimated Column Count
,	TokenNameCOMMA	
dos	TokenNameIdentifier	 dos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ReplayPosition	TokenNameIdentifier	 Replay Position
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
serialize	TokenNameIdentifier	 serialize
(	TokenNameLPAREN	
sstableStats	TokenNameIdentifier	 sstable Stats
.	TokenNameDOT	
replayPosition	TokenNameIdentifier	 replay Position
,	TokenNameCOMMA	
dos	TokenNameIdentifier	 dos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dos	TokenNameIdentifier	 dos
.	TokenNameDOT	
writeLong	TokenNameIdentifier	 write Long
(	TokenNameLPAREN	
sstableStats	TokenNameIdentifier	 sstable Stats
.	TokenNameDOT	
maxTimestamp	TokenNameIdentifier	 max Timestamp
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dos	TokenNameIdentifier	 dos
.	TokenNameDOT	
writeDouble	TokenNameIdentifier	 write Double
(	TokenNameLPAREN	
sstableStats	TokenNameIdentifier	 sstable Stats
.	TokenNameDOT	
compressionRatio	TokenNameIdentifier	 compression Ratio
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dos	TokenNameIdentifier	 dos
.	TokenNameDOT	
writeUTF	TokenNameIdentifier	 write UTF
(	TokenNameLPAREN	
sstableStats	TokenNameIdentifier	 sstable Stats
.	TokenNameDOT	
partitioner	TokenNameIdentifier	 partitioner
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dos	TokenNameIdentifier	 dos
.	TokenNameDOT	
writeInt	TokenNameIdentifier	 write Int
(	TokenNameLPAREN	
sstableStats	TokenNameIdentifier	 sstable Stats
.	TokenNameDOT	
ancestors	TokenNameIdentifier	 ancestors
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Integer	TokenNameIdentifier	 Integer
g	TokenNameIdentifier	 g
:	TokenNameCOLON	
sstableStats	TokenNameIdentifier	 sstable Stats
.	TokenNameDOT	
ancestors	TokenNameIdentifier	 ancestors
)	TokenNameRPAREN	
dos	TokenNameIdentifier	 dos
.	TokenNameDOT	
writeInt	TokenNameIdentifier	 write Int
(	TokenNameLPAREN	
g	TokenNameIdentifier	 g
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
StreamingHistogram	TokenNameIdentifier	 Streaming Histogram
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
serialize	TokenNameIdentifier	 serialize
(	TokenNameLPAREN	
sstableStats	TokenNameIdentifier	 sstable Stats
.	TokenNameDOT	
estimatedTombstoneDropTime	TokenNameIdentifier	 estimated Tombstone Drop Time
,	TokenNameCOMMA	
dos	TokenNameIdentifier	 dos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
SSTableMetadata	TokenNameIdentifier	 SS Table Metadata
deserialize	TokenNameIdentifier	 deserialize
(	TokenNameLPAREN	
Descriptor	TokenNameIdentifier	 Descriptor
descriptor	TokenNameIdentifier	 descriptor
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"Load metadata for {}"	TokenNameStringLiteral	Load metadata for {}
,	TokenNameCOMMA	
descriptor	TokenNameIdentifier	 descriptor
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
File	TokenNameIdentifier	 File
statsFile	TokenNameIdentifier	 stats File
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
descriptor	TokenNameIdentifier	 descriptor
.	TokenNameDOT	
filenameFor	TokenNameIdentifier	 filename For
(	TokenNameLPAREN	
SSTable	TokenNameIdentifier	 SS Table
.	TokenNameDOT	
COMPONENT_STATS	TokenNameIdentifier	 COMPONENT  STATS
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
statsFile	TokenNameIdentifier	 stats File
.	TokenNameDOT	
exists	TokenNameIdentifier	 exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"No sstable stats for {}"	TokenNameStringLiteral	No sstable stats for {}
,	TokenNameCOMMA	
descriptor	TokenNameIdentifier	 descriptor
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
SSTableMetadata	TokenNameIdentifier	 SS Table Metadata
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
DataInputStream	TokenNameIdentifier	 Data Input Stream
dis	TokenNameIdentifier	 dis
=	TokenNameEQUAL	
new	TokenNamenew	
DataInputStream	TokenNameIdentifier	 Data Input Stream
(	TokenNameLPAREN	
new	TokenNamenew	
BufferedInputStream	TokenNameIdentifier	 Buffered Input Stream
(	TokenNameLPAREN	
new	TokenNamenew	
FileInputStream	TokenNameIdentifier	 File Input Stream
(	TokenNameLPAREN	
statsFile	TokenNameIdentifier	 stats File
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
return	TokenNamereturn	
deserialize	TokenNameIdentifier	 deserialize
(	TokenNameLPAREN	
dis	TokenNameIdentifier	 dis
,	TokenNameCOMMA	
descriptor	TokenNameIdentifier	 descriptor
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
FileUtils	TokenNameIdentifier	 File Utils
.	TokenNameDOT	
closeQuietly	TokenNameIdentifier	 close Quietly
(	TokenNameLPAREN	
dis	TokenNameIdentifier	 dis
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
SSTableMetadata	TokenNameIdentifier	 SS Table Metadata
deserialize	TokenNameIdentifier	 deserialize
(	TokenNameLPAREN	
DataInputStream	TokenNameIdentifier	 Data Input Stream
dis	TokenNameIdentifier	 dis
,	TokenNameCOMMA	
Descriptor	TokenNameIdentifier	 Descriptor
desc	TokenNameIdentifier	 desc
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
EstimatedHistogram	TokenNameIdentifier	 Estimated Histogram
rowSizes	TokenNameIdentifier	 row Sizes
=	TokenNameEQUAL	
EstimatedHistogram	TokenNameIdentifier	 Estimated Histogram
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
deserialize	TokenNameIdentifier	 deserialize
(	TokenNameLPAREN	
dis	TokenNameIdentifier	 dis
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
EstimatedHistogram	TokenNameIdentifier	 Estimated Histogram
columnCounts	TokenNameIdentifier	 column Counts
=	TokenNameEQUAL	
EstimatedHistogram	TokenNameIdentifier	 Estimated Histogram
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
deserialize	TokenNameIdentifier	 deserialize
(	TokenNameLPAREN	
dis	TokenNameIdentifier	 dis
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ReplayPosition	TokenNameIdentifier	 Replay Position
replayPosition	TokenNameIdentifier	 replay Position
=	TokenNameEQUAL	
desc	TokenNameIdentifier	 desc
.	TokenNameDOT	
version	TokenNameIdentifier	 version
.	TokenNameDOT	
metadataIncludesReplayPosition	TokenNameIdentifier	 metadata Includes Replay Position
?	TokenNameQUESTION	
ReplayPosition	TokenNameIdentifier	 Replay Position
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
deserialize	TokenNameIdentifier	 deserialize
(	TokenNameLPAREN	
dis	TokenNameIdentifier	 dis
)	TokenNameRPAREN	
:	TokenNameCOLON	
ReplayPosition	TokenNameIdentifier	 Replay Position
.	TokenNameDOT	
NONE	TokenNameIdentifier	 NONE
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
desc	TokenNameIdentifier	 desc
.	TokenNameDOT	
version	TokenNameIdentifier	 version
.	TokenNameDOT	
metadataIncludesModernReplayPosition	TokenNameIdentifier	 metadata Includes Modern Replay Position
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// replay position may be "from the future" thanks to older versions generating them with nanotime. 	TokenNameCOMMENT_LINE	replay position may be "from the future" thanks to older versions generating them with nanotime. 
// make sure we don't omit replaying something that we should. see CASSANDRA-4782 	TokenNameCOMMENT_LINE	make sure we don't omit replaying something that we should. see CASSANDRA-4782 
replayPosition	TokenNameIdentifier	 replay Position
=	TokenNameEQUAL	
ReplayPosition	TokenNameIdentifier	 Replay Position
.	TokenNameDOT	
NONE	TokenNameIdentifier	 NONE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
long	TokenNamelong	
maxTimestamp	TokenNameIdentifier	 max Timestamp
=	TokenNameEQUAL	
desc	TokenNameIdentifier	 desc
.	TokenNameDOT	
version	TokenNameIdentifier	 version
.	TokenNameDOT	
containsTimestamp	TokenNameIdentifier	 contains Timestamp
(	TokenNameLPAREN	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
dis	TokenNameIdentifier	 dis
.	TokenNameDOT	
readLong	TokenNameIdentifier	 read Long
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
Long	TokenNameIdentifier	 Long
.	TokenNameDOT	
MIN_VALUE	TokenNameIdentifier	 MIN  VALUE
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
desc	TokenNameIdentifier	 desc
.	TokenNameDOT	
version	TokenNameIdentifier	 version
.	TokenNameDOT	
tracksMaxTimestamp	TokenNameIdentifier	 tracks Max Timestamp
)	TokenNameRPAREN	
// see javadoc to Descriptor.containsTimestamp 	TokenNameCOMMENT_LINE	see javadoc to Descriptor.containsTimestamp 
maxTimestamp	TokenNameIdentifier	 max Timestamp
=	TokenNameEQUAL	
Long	TokenNameIdentifier	 Long
.	TokenNameDOT	
MIN_VALUE	TokenNameIdentifier	 MIN  VALUE
;	TokenNameSEMICOLON	
double	TokenNamedouble	
compressionRatio	TokenNameIdentifier	 compression Ratio
=	TokenNameEQUAL	
desc	TokenNameIdentifier	 desc
.	TokenNameDOT	
version	TokenNameIdentifier	 version
.	TokenNameDOT	
hasCompressionRatio	TokenNameIdentifier	 has Compression Ratio
?	TokenNameQUESTION	
dis	TokenNameIdentifier	 dis
.	TokenNameDOT	
readDouble	TokenNameIdentifier	 read Double
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
NO_COMPRESSION_RATIO	TokenNameIdentifier	 NO  COMPRESSION  RATIO
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
partitioner	TokenNameIdentifier	 partitioner
=	TokenNameEQUAL	
desc	TokenNameIdentifier	 desc
.	TokenNameDOT	
version	TokenNameIdentifier	 version
.	TokenNameDOT	
hasPartitioner	TokenNameIdentifier	 has Partitioner
?	TokenNameQUESTION	
dis	TokenNameIdentifier	 dis
.	TokenNameDOT	
readUTF	TokenNameIdentifier	 read UTF
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
null	TokenNamenull	
;	TokenNameSEMICOLON	
int	TokenNameint	
nbAncestors	TokenNameIdentifier	 nb Ancestors
=	TokenNameEQUAL	
desc	TokenNameIdentifier	 desc
.	TokenNameDOT	
version	TokenNameIdentifier	 version
.	TokenNameDOT	
hasAncestors	TokenNameIdentifier	 has Ancestors
?	TokenNameQUESTION	
dis	TokenNameIdentifier	 dis
.	TokenNameDOT	
readInt	TokenNameIdentifier	 read Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
>	TokenNameGREATER	
ancestors	TokenNameIdentifier	 ancestors
=	TokenNameEQUAL	
new	TokenNamenew	
HashSet	TokenNameIdentifier	 Hash Set
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
>	TokenNameGREATER	
(	TokenNameLPAREN	
nbAncestors	TokenNameIdentifier	 nb Ancestors
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
nbAncestors	TokenNameIdentifier	 nb Ancestors
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
ancestors	TokenNameIdentifier	 ancestors
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
dis	TokenNameIdentifier	 dis
.	TokenNameDOT	
readInt	TokenNameIdentifier	 read Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
StreamingHistogram	TokenNameIdentifier	 Streaming Histogram
tombstoneHistogram	TokenNameIdentifier	 tombstone Histogram
=	TokenNameEQUAL	
desc	TokenNameIdentifier	 desc
.	TokenNameDOT	
version	TokenNameIdentifier	 version
.	TokenNameDOT	
tracksTombstones	TokenNameIdentifier	 tracks Tombstones
?	TokenNameQUESTION	
StreamingHistogram	TokenNameIdentifier	 Streaming Histogram
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
deserialize	TokenNameIdentifier	 deserialize
(	TokenNameLPAREN	
dis	TokenNameIdentifier	 dis
)	TokenNameRPAREN	
:	TokenNameCOLON	
defaultTombstoneDropTimeHistogram	TokenNameIdentifier	 default Tombstone Drop Time Histogram
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
SSTableMetadata	TokenNameIdentifier	 SS Table Metadata
(	TokenNameLPAREN	
rowSizes	TokenNameIdentifier	 row Sizes
,	TokenNameCOMMA	
columnCounts	TokenNameIdentifier	 column Counts
,	TokenNameCOMMA	
replayPosition	TokenNameIdentifier	 replay Position
,	TokenNameCOMMA	
maxTimestamp	TokenNameIdentifier	 max Timestamp
,	TokenNameCOMMA	
compressionRatio	TokenNameIdentifier	 compression Ratio
,	TokenNameCOMMA	
partitioner	TokenNameIdentifier	 partitioner
,	TokenNameCOMMA	
ancestors	TokenNameIdentifier	 ancestors
,	TokenNameCOMMA	
tombstoneHistogram	TokenNameIdentifier	 tombstone Histogram
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
