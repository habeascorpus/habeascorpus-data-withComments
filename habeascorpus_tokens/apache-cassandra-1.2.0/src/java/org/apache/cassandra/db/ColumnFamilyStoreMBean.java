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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
List	TokenNameIdentifier	 List
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Map	TokenNameIdentifier	 Map
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
concurrent	TokenNameIdentifier	 concurrent
.	TokenNameDOT	
ExecutionException	TokenNameIdentifier	 Execution Exception
;	TokenNameSEMICOLON	
/** * The MBean interface for ColumnFamilyStore */	TokenNameCOMMENT_JAVADOC	 The MBean interface for ColumnFamilyStore 
public	TokenNamepublic	
interface	TokenNameinterface	
ColumnFamilyStoreMBean	TokenNameIdentifier	 Column Family Store M Bean
{	TokenNameLBRACE	
/** * @return the name of the column family */	TokenNameCOMMENT_JAVADOC	 @return the name of the column family 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getColumnFamilyName	TokenNameIdentifier	 get Column Family Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns the total amount of data stored in the memtable, including * column related overhead. * * @see org.apache.cassandra.metrics.ColumnFamilyMetrics#memtableDataSize * @return The size in bytes. * @deprecated */	TokenNameCOMMENT_JAVADOC	 Returns the total amount of data stored in the memtable, including column related overhead. * @see org.apache.cassandra.metrics.ColumnFamilyMetrics#memtableDataSize @return The size in bytes. @deprecated 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
long	TokenNamelong	
getMemtableDataSize	TokenNameIdentifier	 get Memtable Data Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns the total number of columns present in the memtable. * * @see org.apache.cassandra.metrics.ColumnFamilyMetrics#memtableColumnsCount * @return The number of columns. */	TokenNameCOMMENT_JAVADOC	 Returns the total number of columns present in the memtable. * @see org.apache.cassandra.metrics.ColumnFamilyMetrics#memtableColumnsCount @return The number of columns. 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
long	TokenNamelong	
getMemtableColumnsCount	TokenNameIdentifier	 get Memtable Columns Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns the number of times that a flush has resulted in the * memtable being switched out. * * @see org.apache.cassandra.metrics.ColumnFamilyMetrics#memtableSwitchCount * @return the number of memtable switches */	TokenNameCOMMENT_JAVADOC	 Returns the number of times that a flush has resulted in the memtable being switched out. * @see org.apache.cassandra.metrics.ColumnFamilyMetrics#memtableSwitchCount @return the number of memtable switches 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
int	TokenNameint	
getMemtableSwitchCount	TokenNameIdentifier	 get Memtable Switch Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * @see org.apache.cassandra.metrics.ColumnFamilyMetrics#recentSSTablesPerRead * @return a histogram of the number of sstable data files accessed per read: reading this property resets it */	TokenNameCOMMENT_JAVADOC	 @see org.apache.cassandra.metrics.ColumnFamilyMetrics#recentSSTablesPerRead @return a histogram of the number of sstable data files accessed per read: reading this property resets it 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getRecentSSTablesPerReadHistogram	TokenNameIdentifier	 get Recent SS Tables Per Read Histogram
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * @see org.apache.cassandra.metrics.ColumnFamilyMetrics#sstablesPerReadHistogram * @return a histogram of the number of sstable data files accessed per read */	TokenNameCOMMENT_JAVADOC	 @see org.apache.cassandra.metrics.ColumnFamilyMetrics#sstablesPerReadHistogram @return a histogram of the number of sstable data files accessed per read 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getSSTablesPerReadHistogram	TokenNameIdentifier	 get SS Tables Per Read Histogram
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * @see org.apache.cassandra.metrics.ColumnFamilyMetrics#readLatency * @return the number of read operations on this column family */	TokenNameCOMMENT_JAVADOC	 @see org.apache.cassandra.metrics.ColumnFamilyMetrics#readLatency @return the number of read operations on this column family 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
long	TokenNamelong	
getReadCount	TokenNameIdentifier	 get Read Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * @see org.apache.cassandra.metrics.ColumnFamilyMetrics#readLatency * @return total read latency (divide by getReadCount() for average) */	TokenNameCOMMENT_JAVADOC	 @see org.apache.cassandra.metrics.ColumnFamilyMetrics#readLatency @return total read latency (divide by getReadCount() for average) 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
long	TokenNamelong	
getTotalReadLatencyMicros	TokenNameIdentifier	 get Total Read Latency Micros
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * @see org.apache.cassandra.metrics.ColumnFamilyMetrics#readLatency * @return an array representing the latency histogram */	TokenNameCOMMENT_JAVADOC	 @see org.apache.cassandra.metrics.ColumnFamilyMetrics#readLatency @return an array representing the latency histogram 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getLifetimeReadLatencyHistogramMicros	TokenNameIdentifier	 get Lifetime Read Latency Histogram Micros
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * @see org.apache.cassandra.metrics.ColumnFamilyMetrics#readLatency * @return an array representing the latency histogram */	TokenNameCOMMENT_JAVADOC	 @see org.apache.cassandra.metrics.ColumnFamilyMetrics#readLatency @return an array representing the latency histogram 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getRecentReadLatencyHistogramMicros	TokenNameIdentifier	 get Recent Read Latency Histogram Micros
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * @see org.apache.cassandra.metrics.ColumnFamilyMetrics#readLatency * @return average latency per read operation since the last call */	TokenNameCOMMENT_JAVADOC	 @see org.apache.cassandra.metrics.ColumnFamilyMetrics#readLatency @return average latency per read operation since the last call 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
double	TokenNamedouble	
getRecentReadLatencyMicros	TokenNameIdentifier	 get Recent Read Latency Micros
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * @see org.apache.cassandra.metrics.ColumnFamilyMetrics#writeLatency * @return the number of write operations on this column family */	TokenNameCOMMENT_JAVADOC	 @see org.apache.cassandra.metrics.ColumnFamilyMetrics#writeLatency @return the number of write operations on this column family 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
long	TokenNamelong	
getWriteCount	TokenNameIdentifier	 get Write Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * @see org.apache.cassandra.metrics.ColumnFamilyMetrics#writeLatency * @return total write latency (divide by getReadCount() for average) */	TokenNameCOMMENT_JAVADOC	 @see org.apache.cassandra.metrics.ColumnFamilyMetrics#writeLatency @return total write latency (divide by getReadCount() for average) 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
long	TokenNamelong	
getTotalWriteLatencyMicros	TokenNameIdentifier	 get Total Write Latency Micros
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * @see org.apache.cassandra.metrics.ColumnFamilyMetrics#writeLatency * @return an array representing the latency histogram */	TokenNameCOMMENT_JAVADOC	 @see org.apache.cassandra.metrics.ColumnFamilyMetrics#writeLatency @return an array representing the latency histogram 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getLifetimeWriteLatencyHistogramMicros	TokenNameIdentifier	 get Lifetime Write Latency Histogram Micros
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * @see org.apache.cassandra.metrics.ColumnFamilyMetrics#writeLatency * @return an array representing the latency histogram */	TokenNameCOMMENT_JAVADOC	 @see org.apache.cassandra.metrics.ColumnFamilyMetrics#writeLatency @return an array representing the latency histogram 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getRecentWriteLatencyHistogramMicros	TokenNameIdentifier	 get Recent Write Latency Histogram Micros
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * @see org.apache.cassandra.metrics.ColumnFamilyMetrics#writeLatency * @return average latency per write operation since the last call */	TokenNameCOMMENT_JAVADOC	 @see org.apache.cassandra.metrics.ColumnFamilyMetrics#writeLatency @return average latency per write operation since the last call 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
double	TokenNamedouble	
getRecentWriteLatencyMicros	TokenNameIdentifier	 get Recent Write Latency Micros
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * @see org.apache.cassandra.metrics.ColumnFamilyMetrics#pendingTasks * @return the estimated number of tasks pending for this column family */	TokenNameCOMMENT_JAVADOC	 @see org.apache.cassandra.metrics.ColumnFamilyMetrics#pendingTasks @return the estimated number of tasks pending for this column family 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
int	TokenNameint	
getPendingTasks	TokenNameIdentifier	 get Pending Tasks
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * @see org.apache.cassandra.metrics.ColumnFamilyMetrics#liveSSTableCount * @return the number of SSTables on disk for this CF */	TokenNameCOMMENT_JAVADOC	 @see org.apache.cassandra.metrics.ColumnFamilyMetrics#liveSSTableCount @return the number of SSTables on disk for this CF 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
int	TokenNameint	
getLiveSSTableCount	TokenNameIdentifier	 get Live SS Table Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * @see org.apache.cassandra.metrics.ColumnFamilyMetrics#liveDiskSpaceUsed * @return disk space used by SSTables belonging to this CF */	TokenNameCOMMENT_JAVADOC	 @see org.apache.cassandra.metrics.ColumnFamilyMetrics#liveDiskSpaceUsed @return disk space used by SSTables belonging to this CF 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
long	TokenNamelong	
getLiveDiskSpaceUsed	TokenNameIdentifier	 get Live Disk Space Used
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * @see org.apache.cassandra.metrics.ColumnFamilyMetrics#totalDiskSpaceUsed * @return total disk space used by SSTables belonging to this CF, including obsolete ones waiting to be GC'd */	TokenNameCOMMENT_JAVADOC	 @see org.apache.cassandra.metrics.ColumnFamilyMetrics#totalDiskSpaceUsed @return total disk space used by SSTables belonging to this CF, including obsolete ones waiting to be GC'd 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
long	TokenNamelong	
getTotalDiskSpaceUsed	TokenNameIdentifier	 get Total Disk Space Used
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * force a major compaction of this column family */	TokenNameCOMMENT_JAVADOC	 force a major compaction of this column family 
public	TokenNamepublic	
void	TokenNamevoid	
forceMajorCompaction	TokenNameIdentifier	 force Major Compaction
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
ExecutionException	TokenNameIdentifier	 Execution Exception
,	TokenNameCOMMA	
InterruptedException	TokenNameIdentifier	 Interrupted Exception
;	TokenNameSEMICOLON	
/** * @see org.apache.cassandra.metrics.ColumnFamilyMetrics#minRowSize * @return the size of the smallest compacted row */	TokenNameCOMMENT_JAVADOC	 @see org.apache.cassandra.metrics.ColumnFamilyMetrics#minRowSize @return the size of the smallest compacted row 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
long	TokenNamelong	
getMinRowSize	TokenNameIdentifier	 get Min Row Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * @see org.apache.cassandra.metrics.ColumnFamilyMetrics#maxRowSize * @return the size of the largest compacted row */	TokenNameCOMMENT_JAVADOC	 @see org.apache.cassandra.metrics.ColumnFamilyMetrics#maxRowSize @return the size of the largest compacted row 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
long	TokenNamelong	
getMaxRowSize	TokenNameIdentifier	 get Max Row Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * @see org.apache.cassandra.metrics.ColumnFamilyMetrics#meanRowSize * @return the size of the smallest compacted row */	TokenNameCOMMENT_JAVADOC	 @see org.apache.cassandra.metrics.ColumnFamilyMetrics#meanRowSize @return the size of the smallest compacted row 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
long	TokenNamelong	
getMeanRowSize	TokenNameIdentifier	 get Mean Row Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * @see org.apache.cassandra.metrics.ColumnFamilyMetrics#bloomFilterFalsePositives */	TokenNameCOMMENT_JAVADOC	 @see org.apache.cassandra.metrics.ColumnFamilyMetrics#bloomFilterFalsePositives 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
long	TokenNamelong	
getBloomFilterFalsePositives	TokenNameIdentifier	 get Bloom Filter False Positives
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * @see org.apache.cassandra.metrics.ColumnFamilyMetrics#recentBloomFilterFalsePositives */	TokenNameCOMMENT_JAVADOC	 @see org.apache.cassandra.metrics.ColumnFamilyMetrics#recentBloomFilterFalsePositives 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
long	TokenNamelong	
getRecentBloomFilterFalsePositives	TokenNameIdentifier	 get Recent Bloom Filter False Positives
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * @see org.apache.cassandra.metrics.ColumnFamilyMetrics#bloomFilterFalseRatio */	TokenNameCOMMENT_JAVADOC	 @see org.apache.cassandra.metrics.ColumnFamilyMetrics#bloomFilterFalseRatio 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
double	TokenNamedouble	
getBloomFilterFalseRatio	TokenNameIdentifier	 get Bloom Filter False Ratio
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * @see org.apache.cassandra.metrics.ColumnFamilyMetrics#recentBloomFilterFalseRatio */	TokenNameCOMMENT_JAVADOC	 @see org.apache.cassandra.metrics.ColumnFamilyMetrics#recentBloomFilterFalseRatio 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
double	TokenNamedouble	
getRecentBloomFilterFalseRatio	TokenNameIdentifier	 get Recent Bloom Filter False Ratio
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * @see org.apache.cassandra.metrics.ColumnFamilyMetrics#bloomFilterDiskSpaceUsed */	TokenNameCOMMENT_JAVADOC	 @see org.apache.cassandra.metrics.ColumnFamilyMetrics#bloomFilterDiskSpaceUsed 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
long	TokenNamelong	
getBloomFilterDiskSpaceUsed	TokenNameIdentifier	 get Bloom Filter Disk Space Used
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Gets the minimum number of sstables in queue before compaction kicks off */	TokenNameCOMMENT_JAVADOC	 Gets the minimum number of sstables in queue before compaction kicks off 
public	TokenNamepublic	
int	TokenNameint	
getMinimumCompactionThreshold	TokenNameIdentifier	 get Minimum Compaction Threshold
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Sets the minimum number of sstables in queue before compaction kicks off */	TokenNameCOMMENT_JAVADOC	 Sets the minimum number of sstables in queue before compaction kicks off 
public	TokenNamepublic	
void	TokenNamevoid	
setMinimumCompactionThreshold	TokenNameIdentifier	 set Minimum Compaction Threshold
(	TokenNameLPAREN	
int	TokenNameint	
threshold	TokenNameIdentifier	 threshold
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Gets the maximum number of sstables in queue before compaction kicks off */	TokenNameCOMMENT_JAVADOC	 Gets the maximum number of sstables in queue before compaction kicks off 
public	TokenNamepublic	
int	TokenNameint	
getMaximumCompactionThreshold	TokenNameIdentifier	 get Maximum Compaction Threshold
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Sets the maximum and maximum number of SSTables in queue before compaction kicks off */	TokenNameCOMMENT_JAVADOC	 Sets the maximum and maximum number of SSTables in queue before compaction kicks off 
public	TokenNamepublic	
void	TokenNamevoid	
setCompactionThresholds	TokenNameIdentifier	 set Compaction Thresholds
(	TokenNameLPAREN	
int	TokenNameint	
minThreshold	TokenNameIdentifier	 min Threshold
,	TokenNameCOMMA	
int	TokenNameint	
maxThreshold	TokenNameIdentifier	 max Threshold
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Sets the maximum number of sstables in queue before compaction kicks off */	TokenNameCOMMENT_JAVADOC	 Sets the maximum number of sstables in queue before compaction kicks off 
public	TokenNamepublic	
void	TokenNamevoid	
setMaximumCompactionThreshold	TokenNameIdentifier	 set Maximum Compaction Threshold
(	TokenNameLPAREN	
int	TokenNameint	
threshold	TokenNameIdentifier	 threshold
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Sets the compaction strategy by class name * @param className the name of the compaction strategy class */	TokenNameCOMMENT_JAVADOC	 Sets the compaction strategy by class name @param className the name of the compaction strategy class 
public	TokenNamepublic	
void	TokenNamevoid	
setCompactionStrategyClass	TokenNameIdentifier	 set Compaction Strategy Class
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
className	TokenNameIdentifier	 class Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Gets the compaction strategy class name */	TokenNameCOMMENT_JAVADOC	 Gets the compaction strategy class name 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getCompactionStrategyClass	TokenNameIdentifier	 get Compaction Strategy Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Get the compression parameters */	TokenNameCOMMENT_JAVADOC	 Get the compression parameters 
public	TokenNamepublic	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
getCompressionParameters	TokenNameIdentifier	 get Compression Parameters
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Set the compression parameters * @param opts map of string names to values */	TokenNameCOMMENT_JAVADOC	 Set the compression parameters @param opts map of string names to values 
public	TokenNamepublic	
void	TokenNamevoid	
setCompressionParameters	TokenNameIdentifier	 set Compression Parameters
(	TokenNameLPAREN	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
opts	TokenNameIdentifier	 opts
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Set new crc check chance */	TokenNameCOMMENT_JAVADOC	 Set new crc check chance 
public	TokenNamepublic	
void	TokenNamevoid	
setCrcCheckChance	TokenNameIdentifier	 set Crc Check Chance
(	TokenNameLPAREN	
double	TokenNamedouble	
crcCheckChance	TokenNameIdentifier	 crc Check Chance
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Disable automatic compaction. */	TokenNameCOMMENT_JAVADOC	 Disable automatic compaction. 
public	TokenNamepublic	
void	TokenNamevoid	
disableAutoCompaction	TokenNameIdentifier	 disable Auto Compaction
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
long	TokenNamelong	
estimateKeys	TokenNameIdentifier	 estimate Keys
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * @see org.apache.cassandra.metrics.ColumnFamilyMetrics#estimatedRowSizeHistogram */	TokenNameCOMMENT_JAVADOC	 @see org.apache.cassandra.metrics.ColumnFamilyMetrics#estimatedRowSizeHistogram 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getEstimatedRowSizeHistogram	TokenNameIdentifier	 get Estimated Row Size Histogram
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * @see org.apache.cassandra.metrics.ColumnFamilyMetrics#estimatedColumnCountHistogram */	TokenNameCOMMENT_JAVADOC	 @see org.apache.cassandra.metrics.ColumnFamilyMetrics#estimatedColumnCountHistogram 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getEstimatedColumnCountHistogram	TokenNameIdentifier	 get Estimated Column Count Histogram
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * @see org.apache.cassandra.metrics.ColumnFamilyMetrics#compressionRatio */	TokenNameCOMMENT_JAVADOC	 @see org.apache.cassandra.metrics.ColumnFamilyMetrics#compressionRatio 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
double	TokenNamedouble	
getCompressionRatio	TokenNameIdentifier	 get Compression Ratio
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns a list of the names of the built column indexes for current store * @return list of the index names */	TokenNameCOMMENT_JAVADOC	 Returns a list of the names of the built column indexes for current store @return list of the index names 
public	TokenNamepublic	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
getBuiltIndexes	TokenNameIdentifier	 get Built Indexes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns a list of filenames that contain the given key on this node * @param key * @return list of filenames containing the key */	TokenNameCOMMENT_JAVADOC	 Returns a list of filenames that contain the given key on this node @param key @return list of filenames containing the key 
public	TokenNamepublic	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
getSSTablesForKey	TokenNameIdentifier	 get SS Tables For Key
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Scan through Keyspace/ColumnFamily's data directory * determine which SSTables should be loaded and load them */	TokenNameCOMMENT_JAVADOC	 Scan through Keyspace/ColumnFamily's data directory determine which SSTables should be loaded and load them 
public	TokenNamepublic	
void	TokenNamevoid	
loadNewSSTables	TokenNameIdentifier	 load New SS Tables
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * @return the number of SSTables in L0. Always return 0 if Leveled compaction is not enabled. */	TokenNameCOMMENT_JAVADOC	 @return the number of SSTables in L0. Always return 0 if Leveled compaction is not enabled. 
public	TokenNamepublic	
int	TokenNameint	
getUnleveledSSTables	TokenNameIdentifier	 get Unleveled SS Tables
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * @return sstable count for each level. null unless leveled compaction is used. * array index corresponds to level(int[0] is for level 0, ...). */	TokenNameCOMMENT_JAVADOC	 @return sstable count for each level. null unless leveled compaction is used. array index corresponds to level(int[0] is for level 0, ...). 
public	TokenNamepublic	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getSSTableCountPerLevel	TokenNameIdentifier	 get SS Table Count Per Level
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
