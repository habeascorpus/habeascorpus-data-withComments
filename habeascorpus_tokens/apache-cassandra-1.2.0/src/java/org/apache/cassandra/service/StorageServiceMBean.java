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
net	TokenNameIdentifier	 net
.	TokenNameDOT	
UnknownHostException	TokenNameIdentifier	 Unknown Host Exception
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
Collection	TokenNameIdentifier	 Collection
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
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
concurrent	TokenNameIdentifier	 concurrent
.	TokenNameDOT	
TimeoutException	TokenNameIdentifier	 Timeout Exception
;	TokenNameSEMICOLON	
public	TokenNamepublic	
interface	TokenNameinterface	
StorageServiceMBean	TokenNameIdentifier	 Storage Service M Bean
{	TokenNameLBRACE	
/** * Retrieve the list of live nodes in the cluster, where "liveness" is * determined by the failure detector of the node being queried. * * @return set of IP addresses, as Strings */	TokenNameCOMMENT_JAVADOC	 Retrieve the list of live nodes in the cluster, where "liveness" is determined by the failure detector of the node being queried. * @return set of IP addresses, as Strings 
public	TokenNamepublic	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
getLiveNodes	TokenNameIdentifier	 get Live Nodes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Retrieve the list of unreachable nodes in the cluster, as determined * by this node's failure detector. * * @return set of IP addresses, as Strings */	TokenNameCOMMENT_JAVADOC	 Retrieve the list of unreachable nodes in the cluster, as determined by this node's failure detector. * @return set of IP addresses, as Strings 
public	TokenNamepublic	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
getUnreachableNodes	TokenNameIdentifier	 get Unreachable Nodes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Retrieve the list of nodes currently bootstrapping into the ring. * * @return set of IP addresses, as Strings */	TokenNameCOMMENT_JAVADOC	 Retrieve the list of nodes currently bootstrapping into the ring. * @return set of IP addresses, as Strings 
public	TokenNamepublic	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
getJoiningNodes	TokenNameIdentifier	 get Joining Nodes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Retrieve the list of nodes currently leaving the ring. * * @return set of IP addresses, as Strings */	TokenNameCOMMENT_JAVADOC	 Retrieve the list of nodes currently leaving the ring. * @return set of IP addresses, as Strings 
public	TokenNamepublic	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
getLeavingNodes	TokenNameIdentifier	 get Leaving Nodes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Retrieve the list of nodes currently moving in the ring. * * @return set of IP addresses, as Strings */	TokenNameCOMMENT_JAVADOC	 Retrieve the list of nodes currently moving in the ring. * @return set of IP addresses, as Strings 
public	TokenNamepublic	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
getMovingNodes	TokenNameIdentifier	 get Moving Nodes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Fetch string representations of the tokens for this node. * * @return a collection of tokens formatted as strings */	TokenNameCOMMENT_JAVADOC	 Fetch string representations of the tokens for this node. * @return a collection of tokens formatted as strings 
public	TokenNamepublic	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
getTokens	TokenNameIdentifier	 get Tokens
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Fetch string representations of the tokens for a specified node. * * @param endpoint string representation of an node * @return a collection of tokens formatted as strings */	TokenNameCOMMENT_JAVADOC	 Fetch string representations of the tokens for a specified node. * @param endpoint string representation of an node @return a collection of tokens formatted as strings 
public	TokenNamepublic	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
getTokens	TokenNameIdentifier	 get Tokens
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
endpoint	TokenNameIdentifier	 endpoint
)	TokenNameRPAREN	
throws	TokenNamethrows	
UnknownHostException	TokenNameIdentifier	 Unknown Host Exception
;	TokenNameSEMICOLON	
/** * Fetch a string representation of the Cassandra version. * @return A string representation of the Cassandra version. */	TokenNameCOMMENT_JAVADOC	 Fetch a string representation of the Cassandra version. @return A string representation of the Cassandra version. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getReleaseVersion	TokenNameIdentifier	 get Release Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Fetch a string representation of the current Schema version. * @return A string representation of the Schema version. */	TokenNameCOMMENT_JAVADOC	 Fetch a string representation of the current Schema version. @return A string representation of the Schema version. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getSchemaVersion	TokenNameIdentifier	 get Schema Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Get the list of all data file locations from conf * @return String array of all locations */	TokenNameCOMMENT_JAVADOC	 Get the list of all data file locations from conf @return String array of all locations 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getAllDataFileLocations	TokenNameIdentifier	 get All Data File Locations
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Get location of the commit log * @return a string path */	TokenNameCOMMENT_JAVADOC	 Get location of the commit log @return a string path 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getCommitLogLocation	TokenNameIdentifier	 get Commit Log Location
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Get location of the saved caches dir * @return a string path */	TokenNameCOMMENT_JAVADOC	 Get location of the saved caches dir @return a string path 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getSavedCachesLocation	TokenNameIdentifier	 get Saved Caches Location
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Retrieve a map of range to end points that describe the ring topology * of a Cassandra cluster. * * @return mapping of ranges to end points */	TokenNameCOMMENT_JAVADOC	 Retrieve a map of range to end points that describe the ring topology of a Cassandra cluster. * @return mapping of ranges to end points 
public	TokenNamepublic	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
,	TokenNameCOMMA	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>>	TokenNameRIGHT_SHIFT	
getRangeToEndpointMap	TokenNameIdentifier	 get Range To Endpoint Map
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
keyspace	TokenNameIdentifier	 keyspace
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Retrieve a map of range to rpc addresses that describe the ring topology * of a Cassandra cluster. * * @return mapping of ranges to rpc addresses */	TokenNameCOMMENT_JAVADOC	 Retrieve a map of range to rpc addresses that describe the ring topology of a Cassandra cluster. * @return mapping of ranges to rpc addresses 
public	TokenNamepublic	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
,	TokenNameCOMMA	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>>	TokenNameRIGHT_SHIFT	
getRangeToRpcaddressMap	TokenNameIdentifier	 get Range To Rpcaddress Map
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
keyspace	TokenNameIdentifier	 keyspace
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * The same as {@code describeRing(String)} but converts TokenRange to the String for JMX compatibility * * @param keyspace The keyspace to fetch information about * * @return a List of TokenRange(s) converted to String for the given keyspace */	TokenNameCOMMENT_JAVADOC	 The same as {@code describeRing(String)} but converts TokenRange to the String for JMX compatibility * @param keyspace The keyspace to fetch information about * @return a List of TokenRange(s) converted to String for the given keyspace 
public	TokenNamepublic	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
describeRingJMX	TokenNameIdentifier	 describe Ring JMX
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
keyspace	TokenNameIdentifier	 keyspace
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
/** * Returns the local node's primary range. */	TokenNameCOMMENT_JAVADOC	 Returns the local node's primary range. 
public	TokenNamepublic	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
getPrimaryRange	TokenNameIdentifier	 get Primary Range
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Retrieve a map of pending ranges to endpoints that describe the ring topology * @param keyspace the keyspace to get the pending range map for. * @return a map of pending ranges to endpoints */	TokenNameCOMMENT_JAVADOC	 Retrieve a map of pending ranges to endpoints that describe the ring topology @param keyspace the keyspace to get the pending range map for. @return a map of pending ranges to endpoints 
public	TokenNamepublic	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
,	TokenNameCOMMA	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>>	TokenNameRIGHT_SHIFT	
getPendingRangeToEndpointMap	TokenNameIdentifier	 get Pending Range To Endpoint Map
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
keyspace	TokenNameIdentifier	 keyspace
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Retrieve a map of tokens to endpoints, including the bootstrapping * ones. * * @return a map of tokens to endpoints in ascending order */	TokenNameCOMMENT_JAVADOC	 Retrieve a map of tokens to endpoints, including the bootstrapping ones. * @return a map of tokens to endpoints in ascending order 
public	TokenNamepublic	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
getTokenToEndpointMap	TokenNameIdentifier	 get Token To Endpoint Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Retrieve this hosts unique ID */	TokenNameCOMMENT_JAVADOC	 Retrieve this hosts unique ID 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getLocalHostId	TokenNameIdentifier	 get Local Host Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Retrieve the mapping of endpoint to host ID */	TokenNameCOMMENT_JAVADOC	 Retrieve the mapping of endpoint to host ID 
public	TokenNamepublic	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
getHostIdMap	TokenNameIdentifier	 get Host Id Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Numeric load value. * @see org.apache.cassandra.metrics.StorageMetrics#load */	TokenNameCOMMENT_JAVADOC	 Numeric load value. @see org.apache.cassandra.metrics.StorageMetrics#load 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
double	TokenNamedouble	
getLoad	TokenNameIdentifier	 get Load
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Human-readable load value */	TokenNameCOMMENT_JAVADOC	 Human-readable load value 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getLoadString	TokenNameIdentifier	 get Load String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Human-readable load value. Keys are IP addresses. */	TokenNameCOMMENT_JAVADOC	 Human-readable load value. Keys are IP addresses. 
public	TokenNamepublic	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
getLoadMap	TokenNameIdentifier	 get Load Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Return the generation value for this node. * * @return generation number */	TokenNameCOMMENT_JAVADOC	 Return the generation value for this node. * @return generation number 
public	TokenNamepublic	
int	TokenNameint	
getCurrentGenerationNumber	TokenNameIdentifier	 get Current Generation Number
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * This method returns the N endpoints that are responsible for storing the * specified key i.e for replication. * * @param table keyspace name also known as table * @param cf Column family name * @param key - key for which we need to find the endpoint return value - * the endpoint responsible for this key */	TokenNameCOMMENT_JAVADOC	 This method returns the N endpoints that are responsible for storing the specified key i.e for replication. * @param table keyspace name also known as table @param cf Column family name @param key - key for which we need to find the endpoint return value - the endpoint responsible for this key 
public	TokenNamepublic	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
InetAddress	TokenNameIdentifier	 Inet Address
>	TokenNameGREATER	
getNaturalEndpoints	TokenNameIdentifier	 get Natural Endpoints
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
table	TokenNameIdentifier	 table
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
cf	TokenNameIdentifier	 cf
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
InetAddress	TokenNameIdentifier	 Inet Address
>	TokenNameGREATER	
getNaturalEndpoints	TokenNameIdentifier	 get Natural Endpoints
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
table	TokenNameIdentifier	 table
,	TokenNameCOMMA	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Takes the snapshot for the given tables. A snapshot name must be specified. * * @param tag the tag given to the snapshot; may not be null or empty * @param tableNames the name of the tables to snapshot; empty means "all." */	TokenNameCOMMENT_JAVADOC	 Takes the snapshot for the given tables. A snapshot name must be specified. * @param tag the tag given to the snapshot; may not be null or empty @param tableNames the name of the tables to snapshot; empty means "all." 
public	TokenNamepublic	
void	TokenNamevoid	
takeSnapshot	TokenNameIdentifier	 take Snapshot
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
tag	TokenNameIdentifier	 tag
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
...	TokenNameELLIPSIS	
tableNames	TokenNameIdentifier	 table Names
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
/** * Takes the snapshot of a specific column family. A snapshot name must be specified. * * @param tableName the keyspace which holds the specified column family * @param columnFamilyName the column family to snapshot * @param tag the tag given to the snapshot; may not be null or empty */	TokenNameCOMMENT_JAVADOC	 Takes the snapshot of a specific column family. A snapshot name must be specified. * @param tableName the keyspace which holds the specified column family @param columnFamilyName the column family to snapshot @param tag the tag given to the snapshot; may not be null or empty 
public	TokenNamepublic	
void	TokenNamevoid	
takeColumnFamilySnapshot	TokenNameIdentifier	 take Column Family Snapshot
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
tableName	TokenNameIdentifier	 table Name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
columnFamilyName	TokenNameIdentifier	 column Family Name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
tag	TokenNameIdentifier	 tag
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
/** * Remove the snapshot with the given name from the given tables. * If no tag is specified we will remove all snapshots. */	TokenNameCOMMENT_JAVADOC	 Remove the snapshot with the given name from the given tables. If no tag is specified we will remove all snapshots. 
public	TokenNamepublic	
void	TokenNamevoid	
clearSnapshot	TokenNameIdentifier	 clear Snapshot
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
tag	TokenNameIdentifier	 tag
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
...	TokenNameELLIPSIS	
tableNames	TokenNameIdentifier	 table Names
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
/** * Forces major compaction of a single keyspace */	TokenNameCOMMENT_JAVADOC	 Forces major compaction of a single keyspace 
public	TokenNamepublic	
void	TokenNamevoid	
forceTableCompaction	TokenNameIdentifier	 force Table Compaction
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
tableName	TokenNameIdentifier	 table Name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
...	TokenNameELLIPSIS	
columnFamilies	TokenNameIdentifier	 column Families
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
,	TokenNameCOMMA	
ExecutionException	TokenNameIdentifier	 Execution Exception
,	TokenNameCOMMA	
InterruptedException	TokenNameIdentifier	 Interrupted Exception
;	TokenNameSEMICOLON	
/** * Trigger a cleanup of keys on a single keyspace */	TokenNameCOMMENT_JAVADOC	 Trigger a cleanup of keys on a single keyspace 
public	TokenNamepublic	
void	TokenNamevoid	
forceTableCleanup	TokenNameIdentifier	 force Table Cleanup
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
tableName	TokenNameIdentifier	 table Name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
...	TokenNameELLIPSIS	
columnFamilies	TokenNameIdentifier	 column Families
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
,	TokenNameCOMMA	
ExecutionException	TokenNameIdentifier	 Execution Exception
,	TokenNameCOMMA	
InterruptedException	TokenNameIdentifier	 Interrupted Exception
;	TokenNameSEMICOLON	
/** * Scrub (deserialize + reserialize at the latest version, skipping bad rows if any) the given keyspace. * If columnFamilies array is empty, all CFs are scrubbed. * * Scrubbed CFs will be snapshotted first. */	TokenNameCOMMENT_JAVADOC	 Scrub (deserialize + reserialize at the latest version, skipping bad rows if any) the given keyspace. If columnFamilies array is empty, all CFs are scrubbed. * Scrubbed CFs will be snapshotted first. 
public	TokenNamepublic	
void	TokenNamevoid	
scrub	TokenNameIdentifier	 scrub
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
tableName	TokenNameIdentifier	 table Name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
...	TokenNameELLIPSIS	
columnFamilies	TokenNameIdentifier	 column Families
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
,	TokenNameCOMMA	
ExecutionException	TokenNameIdentifier	 Execution Exception
,	TokenNameCOMMA	
InterruptedException	TokenNameIdentifier	 Interrupted Exception
;	TokenNameSEMICOLON	
/** * Rewrite all sstables to the latest version. * Unlike scrub, it doesn't skip bad rows and do not snapshot sstables first. */	TokenNameCOMMENT_JAVADOC	 Rewrite all sstables to the latest version. Unlike scrub, it doesn't skip bad rows and do not snapshot sstables first. 
public	TokenNamepublic	
void	TokenNamevoid	
upgradeSSTables	TokenNameIdentifier	 upgrade SS Tables
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
tableName	TokenNameIdentifier	 table Name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
...	TokenNameELLIPSIS	
columnFamilies	TokenNameIdentifier	 column Families
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
,	TokenNameCOMMA	
ExecutionException	TokenNameIdentifier	 Execution Exception
,	TokenNameCOMMA	
InterruptedException	TokenNameIdentifier	 Interrupted Exception
;	TokenNameSEMICOLON	
/** * Flush all memtables for the given column families, or all columnfamilies for the given table * if none are explicitly listed. * @param tableName * @param columnFamilies * @throws IOException */	TokenNameCOMMENT_JAVADOC	 Flush all memtables for the given column families, or all columnfamilies for the given table if none are explicitly listed. @param tableName @param columnFamilies @throws IOException 
public	TokenNamepublic	
void	TokenNamevoid	
forceTableFlush	TokenNameIdentifier	 force Table Flush
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
tableName	TokenNameIdentifier	 table Name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
...	TokenNameELLIPSIS	
columnFamilies	TokenNameIdentifier	 column Families
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
,	TokenNameCOMMA	
ExecutionException	TokenNameIdentifier	 Execution Exception
,	TokenNameCOMMA	
InterruptedException	TokenNameIdentifier	 Interrupted Exception
;	TokenNameSEMICOLON	
/** * Triggers proactive repair for given column families, or all columnfamilies for the given table * if none are explicitly listed. * @param tableName * @param columnFamilies * @throws IOException */	TokenNameCOMMENT_JAVADOC	 Triggers proactive repair for given column families, or all columnfamilies for the given table if none are explicitly listed. @param tableName @param columnFamilies @throws IOException 
public	TokenNamepublic	
void	TokenNamevoid	
forceTableRepair	TokenNameIdentifier	 force Table Repair
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
tableName	TokenNameIdentifier	 table Name
,	TokenNameCOMMA	
boolean	TokenNameboolean	
isSequential	TokenNameIdentifier	 is Sequential
,	TokenNameCOMMA	
boolean	TokenNameboolean	
isLocal	TokenNameIdentifier	 is Local
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
...	TokenNameELLIPSIS	
columnFamilies	TokenNameIdentifier	 column Families
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
/** * Triggers proactive repair but only for the node primary range. */	TokenNameCOMMENT_JAVADOC	 Triggers proactive repair but only for the node primary range. 
public	TokenNamepublic	
void	TokenNamevoid	
forceTableRepairPrimaryRange	TokenNameIdentifier	 force Table Repair Primary Range
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
tableName	TokenNameIdentifier	 table Name
,	TokenNameCOMMA	
boolean	TokenNameboolean	
isSequential	TokenNameIdentifier	 is Sequential
,	TokenNameCOMMA	
boolean	TokenNameboolean	
isLocal	TokenNameIdentifier	 is Local
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
...	TokenNameELLIPSIS	
columnFamilies	TokenNameIdentifier	 column Families
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
/** * Perform repair of a specific range. * * This allows incremental repair to be performed by having an external controller submitting repair jobs. * Note that the provided range much be a subset of one of the node local range. */	TokenNameCOMMENT_JAVADOC	 Perform repair of a specific range. * This allows incremental repair to be performed by having an external controller submitting repair jobs. Note that the provided range much be a subset of one of the node local range. 
public	TokenNamepublic	
void	TokenNamevoid	
forceTableRepairRange	TokenNameIdentifier	 force Table Repair Range
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
beginToken	TokenNameIdentifier	 begin Token
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
endToken	TokenNameIdentifier	 end Token
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
tableName	TokenNameIdentifier	 table Name
,	TokenNameCOMMA	
boolean	TokenNameboolean	
isSequential	TokenNameIdentifier	 is Sequential
,	TokenNameCOMMA	
boolean	TokenNameboolean	
isLocal	TokenNameIdentifier	 is Local
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
...	TokenNameELLIPSIS	
columnFamilies	TokenNameIdentifier	 column Families
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
public	TokenNamepublic	
void	TokenNamevoid	
forceTerminateAllRepairSessions	TokenNameIdentifier	 force Terminate All Repair Sessions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * transfer this node's data to other machines and remove it from service. */	TokenNameCOMMENT_JAVADOC	 transfer this node's data to other machines and remove it from service. 
public	TokenNamepublic	
void	TokenNamevoid	
decommission	TokenNameIdentifier	 decommission
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
InterruptedException	TokenNameIdentifier	 Interrupted Exception
;	TokenNameSEMICOLON	
/** * @param newToken token to move this node to. * This node will unload its data onto its neighbors, and bootstrap to the new token. */	TokenNameCOMMENT_JAVADOC	 @param newToken token to move this node to. This node will unload its data onto its neighbors, and bootstrap to the new token. 
public	TokenNamepublic	
void	TokenNamevoid	
move	TokenNameIdentifier	 move
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
newToken	TokenNameIdentifier	 new Token
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
/** * @param srcTokens tokens to move to this node */	TokenNameCOMMENT_JAVADOC	 @param srcTokens tokens to move to this node 
public	TokenNamepublic	
void	TokenNamevoid	
relocate	TokenNameIdentifier	 relocate
(	TokenNameLPAREN	
Collection	TokenNameIdentifier	 Collection
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
srcTokens	TokenNameIdentifier	 src Tokens
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
/** * removeToken removes token (and all data associated with * enpoint that had it) from the ring */	TokenNameCOMMENT_JAVADOC	 removeToken removes token (and all data associated with enpoint that had it) from the ring 
public	TokenNamepublic	
void	TokenNamevoid	
removeNode	TokenNameIdentifier	 remove Node
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
token	TokenNameIdentifier	 token
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Get the status of a token removal. */	TokenNameCOMMENT_JAVADOC	 Get the status of a token removal. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getRemovalStatus	TokenNameIdentifier	 get Removal Status
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Force a remove operation to finish. */	TokenNameCOMMENT_JAVADOC	 Force a remove operation to finish. 
public	TokenNamepublic	
void	TokenNamevoid	
forceRemoveCompletion	TokenNameIdentifier	 force Remove Completion
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** set the logging level at runtime */	TokenNameCOMMENT_JAVADOC	 set the logging level at runtime 
public	TokenNamepublic	
void	TokenNamevoid	
setLog4jLevel	TokenNameIdentifier	 set Log4j Level
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
classQualifier	TokenNameIdentifier	 class Qualifier
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
level	TokenNameIdentifier	 level
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** get the operational mode (leaving, joining, normal, decommissioned, client) **/	TokenNameCOMMENT_JAVADOC	 get the operational mode (leaving, joining, normal, decommissioned, client) *
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getOperationMode	TokenNameIdentifier	 get Operation Mode
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** get the progress of a drain operation */	TokenNameCOMMENT_JAVADOC	 get the progress of a drain operation 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getDrainProgress	TokenNameIdentifier	 get Drain Progress
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** makes node unavailable for writes, flushes memtables and replays commitlog. */	TokenNameCOMMENT_JAVADOC	 makes node unavailable for writes, flushes memtables and replays commitlog. 
public	TokenNamepublic	
void	TokenNamevoid	
drain	TokenNameIdentifier	 drain
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
,	TokenNameCOMMA	
InterruptedException	TokenNameIdentifier	 Interrupted Exception
,	TokenNameCOMMA	
ExecutionException	TokenNameIdentifier	 Execution Exception
;	TokenNameSEMICOLON	
/** * Truncates (deletes) the given columnFamily from the provided keyspace. * Calling truncate results in actual deletion of all data in the cluster * under the given columnFamily and it will fail unless all hosts are up. * All data in the given column family will be deleted, but its definition * will not be affected. * * @param keyspace The keyspace to delete from * @param columnFamily The column family to delete data from. */	TokenNameCOMMENT_JAVADOC	 Truncates (deletes) the given columnFamily from the provided keyspace. Calling truncate results in actual deletion of all data in the cluster under the given columnFamily and it will fail unless all hosts are up. All data in the given column family will be deleted, but its definition will not be affected. * @param keyspace The keyspace to delete from @param columnFamily The column family to delete data from. 
public	TokenNamepublic	
void	TokenNamevoid	
truncate	TokenNameIdentifier	 truncate
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
keyspace	TokenNameIdentifier	 keyspace
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
columnFamily	TokenNameIdentifier	 column Family
)	TokenNameRPAREN	
throws	TokenNamethrows	
TimeoutException	TokenNameIdentifier	 Timeout Exception
,	TokenNameCOMMA	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
/** * given a list of tokens (representing the nodes in the cluster), returns * a mapping from "token -> %age of cluster owned by that token" */	TokenNameCOMMENT_JAVADOC	 given a list of tokens (representing the nodes in the cluster), returns a mapping from "token -> %age of cluster owned by that token" 
public	TokenNamepublic	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
InetAddress	TokenNameIdentifier	 Inet Address
,	TokenNameCOMMA	
Float	TokenNameIdentifier	 Float
>	TokenNameGREATER	
getOwnership	TokenNameIdentifier	 get Ownership
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Effective ownership is % of the data each node owns given the keyspace * we calculate the percentage using replication factor. * If Keyspace == null, this method will try to verify if all the keyspaces * in the cluster have the same replication strategies and if yes then we will * use the first else a empty Map is returned. */	TokenNameCOMMENT_JAVADOC	 Effective ownership is % of the data each node owns given the keyspace we calculate the percentage using replication factor. If Keyspace == null, this method will try to verify if all the keyspaces in the cluster have the same replication strategies and if yes then we will use the first else a empty Map is returned. 
public	TokenNamepublic	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
InetAddress	TokenNameIdentifier	 Inet Address
,	TokenNameCOMMA	
Float	TokenNameIdentifier	 Float
>	TokenNameGREATER	
effectiveOwnership	TokenNameIdentifier	 effective Ownership
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
keyspace	TokenNameIdentifier	 keyspace
)	TokenNameRPAREN	
throws	TokenNamethrows	
IllegalStateException	TokenNameIdentifier	 Illegal State Exception
;	TokenNameSEMICOLON	
public	TokenNamepublic	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
getKeyspaces	TokenNameIdentifier	 get Keyspaces
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Change endpointsnitch class and dynamic-ness (and dynamic attributes) at runtime * @param epSnitchClassName the canonical path name for a class implementing IEndpointSnitch * @param dynamic boolean that decides whether dynamicsnitch is used or not * @param dynamicUpdateInterval integer, in ms (default 100) * @param dynamicResetInterval integer, in ms (default 600,000) * @param dynamicBadnessThreshold double, (default 0.0) */	TokenNameCOMMENT_JAVADOC	 Change endpointsnitch class and dynamic-ness (and dynamic attributes) at runtime @param epSnitchClassName the canonical path name for a class implementing IEndpointSnitch @param dynamic boolean that decides whether dynamicsnitch is used or not @param dynamicUpdateInterval integer, in ms (default 100) @param dynamicResetInterval integer, in ms (default 600,000) @param dynamicBadnessThreshold double, (default 0.0) 
public	TokenNamepublic	
void	TokenNamevoid	
updateSnitch	TokenNameIdentifier	 update Snitch
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
epSnitchClassName	TokenNameIdentifier	 ep Snitch Class Name
,	TokenNameCOMMA	
Boolean	TokenNameIdentifier	 Boolean
dynamic	TokenNameIdentifier	 dynamic
,	TokenNameCOMMA	
Integer	TokenNameIdentifier	 Integer
dynamicUpdateInterval	TokenNameIdentifier	 dynamic Update Interval
,	TokenNameCOMMA	
Integer	TokenNameIdentifier	 Integer
dynamicResetInterval	TokenNameIdentifier	 dynamic Reset Interval
,	TokenNameCOMMA	
Double	TokenNameIdentifier	 Double
dynamicBadnessThreshold	TokenNameIdentifier	 dynamic Badness Threshold
)	TokenNameRPAREN	
throws	TokenNamethrows	
ClassNotFoundException	TokenNameIdentifier	 Class Not Found Exception
;	TokenNameSEMICOLON	
// allows a user to forcibly 'kill' a sick node 	TokenNameCOMMENT_LINE	allows a user to forcibly 'kill' a sick node 
public	TokenNamepublic	
void	TokenNamevoid	
stopGossiping	TokenNameIdentifier	 stop Gossiping
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// allows a user to recover a forcibly 'killed' node 	TokenNameCOMMENT_LINE	allows a user to recover a forcibly 'killed' node 
public	TokenNamepublic	
void	TokenNamevoid	
startGossiping	TokenNameIdentifier	 start Gossiping
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// to determine if gossip is disabled 	TokenNameCOMMENT_LINE	to determine if gossip is disabled 
public	TokenNamepublic	
boolean	TokenNameboolean	
isInitialized	TokenNameIdentifier	 is Initialized
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// allows a user to disable thrift 	TokenNameCOMMENT_LINE	allows a user to disable thrift 
public	TokenNamepublic	
void	TokenNamevoid	
stopRPCServer	TokenNameIdentifier	 stop RPC Server
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// allows a user to reenable thrift 	TokenNameCOMMENT_LINE	allows a user to reenable thrift 
public	TokenNamepublic	
void	TokenNamevoid	
startRPCServer	TokenNameIdentifier	 start RPC Server
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// to determine if thrift is running 	TokenNameCOMMENT_LINE	to determine if thrift is running 
public	TokenNamepublic	
boolean	TokenNameboolean	
isRPCServerRunning	TokenNameIdentifier	 is RPC Server Running
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
void	TokenNamevoid	
stopNativeTransport	TokenNameIdentifier	 stop Native Transport
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
void	TokenNamevoid	
startNativeTransport	TokenNameIdentifier	 start Native Transport
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
boolean	TokenNameboolean	
isNativeTransportRunning	TokenNameIdentifier	 is Native Transport Running
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// allows a node that have been started without joining the ring to join it 	TokenNameCOMMENT_LINE	allows a node that have been started without joining the ring to join it 
public	TokenNamepublic	
void	TokenNamevoid	
joinRing	TokenNameIdentifier	 join Ring
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
public	TokenNamepublic	
boolean	TokenNameboolean	
isJoined	TokenNameIdentifier	 is Joined
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
int	TokenNameint	
getExceptionCount	TokenNameIdentifier	 get Exception Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
void	TokenNamevoid	
setStreamThroughputMbPerSec	TokenNameIdentifier	 set Stream Throughput Mb Per Sec
(	TokenNameLPAREN	
int	TokenNameint	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
int	TokenNameint	
getStreamThroughputMbPerSec	TokenNameIdentifier	 get Stream Throughput Mb Per Sec
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
int	TokenNameint	
getCompactionThroughputMbPerSec	TokenNameIdentifier	 get Compaction Throughput Mb Per Sec
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
void	TokenNamevoid	
setCompactionThroughputMbPerSec	TokenNameIdentifier	 set Compaction Throughput Mb Per Sec
(	TokenNameLPAREN	
int	TokenNameint	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
boolean	TokenNameboolean	
isIncrementalBackupsEnabled	TokenNameIdentifier	 is Incremental Backups Enabled
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
void	TokenNamevoid	
setIncrementalBackupsEnabled	TokenNameIdentifier	 set Incremental Backups Enabled
(	TokenNameLPAREN	
boolean	TokenNameboolean	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Initiate a process of streaming data for which we are responsible from other nodes. It is similar to bootstrap * except meant to be used on a node which is already in the cluster (typically containing no data) as an * alternative to running repair. * * @param sourceDc Name of DC from which to select sources for streaming or null to pick any node */	TokenNameCOMMENT_JAVADOC	 Initiate a process of streaming data for which we are responsible from other nodes. It is similar to bootstrap except meant to be used on a node which is already in the cluster (typically containing no data) as an alternative to running repair. * @param sourceDc Name of DC from which to select sources for streaming or null to pick any node 
public	TokenNamepublic	
void	TokenNamevoid	
rebuild	TokenNameIdentifier	 rebuild
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
sourceDc	TokenNameIdentifier	 source Dc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
void	TokenNamevoid	
bulkLoad	TokenNameIdentifier	 bulk Load
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
directory	TokenNameIdentifier	 directory
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
void	TokenNamevoid	
rescheduleFailedDeletions	TokenNameIdentifier	 reschedule Failed Deletions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Load new SSTables to the given keyspace/columnFamily * * @param ksName The parent keyspace name * @param cfName The ColumnFamily name where SSTables belong */	TokenNameCOMMENT_JAVADOC	 Load new SSTables to the given keyspace/columnFamily * @param ksName The parent keyspace name @param cfName The ColumnFamily name where SSTables belong 
public	TokenNamepublic	
void	TokenNamevoid	
loadNewSSTables	TokenNameIdentifier	 load New SS Tables
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
ksName	TokenNameIdentifier	 ks Name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
cfName	TokenNameIdentifier	 cf Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Return a List of Tokens representing a sample of keys across all ColumnFamilyStores. * * Note: this should be left as an operation, not an attribute (methods starting with "get") * to avoid sending potentially multiple MB of data when accessing this mbean by default. See CASSANDRA-4452. * * @return set of Tokens as Strings */	TokenNameCOMMENT_JAVADOC	 Return a List of Tokens representing a sample of keys across all ColumnFamilyStores. * Note: this should be left as an operation, not an attribute (methods starting with "get") to avoid sending potentially multiple MB of data when accessing this mbean by default. See CASSANDRA-4452. * @return set of Tokens as Strings 
public	TokenNamepublic	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
sampleKeyRange	TokenNameIdentifier	 sample Key Range
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * rebuild the specified indexes */	TokenNameCOMMENT_JAVADOC	 rebuild the specified indexes 
public	TokenNamepublic	
void	TokenNamevoid	
rebuildSecondaryIndex	TokenNameIdentifier	 rebuild Secondary Index
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
ksName	TokenNameIdentifier	 ks Name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
cfName	TokenNameIdentifier	 cf Name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
...	TokenNameELLIPSIS	
idxNames	TokenNameIdentifier	 idx Names
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
void	TokenNamevoid	
resetLocalSchema	TokenNameIdentifier	 reset Local Schema
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
/** * Enables/Disables tracing for the whole system. Only thrift requests can start tracing currently. * * @param probability * ]0,1[ will enable tracing on a partial number of requests with the provided probability. 0 will * disable tracing and 1 will enable tracing for all requests (which mich severely cripple the system) */	TokenNameCOMMENT_JAVADOC	 Enables/Disables tracing for the whole system. Only thrift requests can start tracing currently. * @param probability ]0,1[ will enable tracing on a partial number of requests with the provided probability. 0 will disable tracing and 1 will enable tracing for all requests (which mich severely cripple the system) 
public	TokenNamepublic	
void	TokenNamevoid	
setTraceProbability	TokenNameIdentifier	 set Trace Probability
(	TokenNameLPAREN	
double	TokenNamedouble	
probability	TokenNameIdentifier	 probability
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns the configured tracing probability. */	TokenNameCOMMENT_JAVADOC	 Returns the configured tracing probability. 
public	TokenNamepublic	
double	TokenNamedouble	
getTracingProbability	TokenNameIdentifier	 get Tracing Probability
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Begin processing of queued range transfers. */	TokenNameCOMMENT_JAVADOC	 Begin processing of queued range transfers. 
public	TokenNamepublic	
void	TokenNamevoid	
enableScheduledRangeXfers	TokenNameIdentifier	 enable Scheduled Range Xfers
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Disable processing of queued range transfers. */	TokenNameCOMMENT_JAVADOC	 Disable processing of queued range transfers. 
public	TokenNamepublic	
void	TokenNamevoid	
disableScheduledRangeXfers	TokenNameIdentifier	 disable Scheduled Range Xfers
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
