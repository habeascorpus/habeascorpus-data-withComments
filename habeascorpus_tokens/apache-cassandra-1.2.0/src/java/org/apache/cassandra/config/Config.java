/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
config	TokenNameIdentifier	 config
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
cache	TokenNameIdentifier	 cache
.	TokenNameDOT	
SerializingCacheProvider	TokenNameIdentifier	 Serializing Cache Provider
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
EncryptionOptions	TokenNameIdentifier	 Encryption Options
.	TokenNameDOT	
ClientEncryptionOptions	TokenNameIdentifier	 Client Encryption Options
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
EncryptionOptions	TokenNameIdentifier	 Encryption Options
.	TokenNameDOT	
ServerEncryptionOptions	TokenNameIdentifier	 Server Encryption Options
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
/** * A class that contains configuration properties for the cassandra node it runs within. * * Properties declared as volatile can be mutated via JMX. */	TokenNameCOMMENT_JAVADOC	 A class that contains configuration properties for the cassandra node it runs within. * Properties declared as volatile can be mutated via JMX. 
public	TokenNamepublic	
class	TokenNameclass	
Config	TokenNameIdentifier	 Config
{	TokenNameLBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
cluster_name	TokenNameIdentifier	 cluster name
=	TokenNameEQUAL	
"Test Cluster"	TokenNameStringLiteral	Test Cluster
;	TokenNameSEMICOLON	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
authenticator	TokenNameIdentifier	 authenticator
;	TokenNameSEMICOLON	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
authority	TokenNameIdentifier	 authority
;	TokenNameSEMICOLON	
// for backwards compatibility - will log a warning. 	TokenNameCOMMENT_LINE	for backwards compatibility - will log a warning. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
authorizer	TokenNameIdentifier	 authorizer
;	TokenNameSEMICOLON	
/* Hashing strategy Random or OPHF */	TokenNameCOMMENT_BLOCK	 Hashing strategy Random or OPHF 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
partitioner	TokenNameIdentifier	 partitioner
;	TokenNameSEMICOLON	
public	TokenNamepublic	
Boolean	TokenNameIdentifier	 Boolean
auto_bootstrap	TokenNameIdentifier	 auto bootstrap
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
volatile	TokenNamevolatile	
Boolean	TokenNameIdentifier	 Boolean
hinted_handoff_enabled	TokenNameIdentifier	 hinted handoff enabled
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
volatile	TokenNamevolatile	
Integer	TokenNameIdentifier	 Integer
max_hint_window_in_ms	TokenNameIdentifier	 max hint window in ms
=	TokenNameEQUAL	
3600	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
1000	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// one hour 	TokenNameCOMMENT_LINE	one hour 
public	TokenNamepublic	
SeedProviderDef	TokenNameIdentifier	 Seed Provider Def
seed_provider	TokenNameIdentifier	 seed provider
;	TokenNameSEMICOLON	
public	TokenNamepublic	
DiskAccessMode	TokenNameIdentifier	 Disk Access Mode
disk_access_mode	TokenNameIdentifier	 disk access mode
=	TokenNameEQUAL	
DiskAccessMode	TokenNameIdentifier	 Disk Access Mode
.	TokenNameDOT	
auto	TokenNameIdentifier	 auto
;	TokenNameSEMICOLON	
public	TokenNamepublic	
DiskFailurePolicy	TokenNameIdentifier	 Disk Failure Policy
disk_failure_policy	TokenNameIdentifier	 disk failure policy
=	TokenNameEQUAL	
DiskFailurePolicy	TokenNameIdentifier	 Disk Failure Policy
.	TokenNameDOT	
ignore	TokenNameIdentifier	 ignore
;	TokenNameSEMICOLON	
/* initial token in the ring */	TokenNameCOMMENT_BLOCK	 initial token in the ring 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
initial_token	TokenNameIdentifier	 initial token
;	TokenNameSEMICOLON	
public	TokenNamepublic	
Integer	TokenNameIdentifier	 Integer
num_tokens	TokenNameIdentifier	 num tokens
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
volatile	TokenNamevolatile	
Long	TokenNameIdentifier	 Long
request_timeout_in_ms	TokenNameIdentifier	 request timeout in ms
=	TokenNameEQUAL	
new	TokenNamenew	
Long	TokenNameIdentifier	 Long
(	TokenNameLPAREN	
10000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
Long	TokenNameIdentifier	 Long
read_request_timeout_in_ms	TokenNameIdentifier	 read request timeout in ms
=	TokenNameEQUAL	
new	TokenNamenew	
Long	TokenNameIdentifier	 Long
(	TokenNameLPAREN	
10000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
Long	TokenNameIdentifier	 Long
range_request_timeout_in_ms	TokenNameIdentifier	 range request timeout in ms
=	TokenNameEQUAL	
new	TokenNamenew	
Long	TokenNameIdentifier	 Long
(	TokenNameLPAREN	
10000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
Long	TokenNameIdentifier	 Long
write_request_timeout_in_ms	TokenNameIdentifier	 write request timeout in ms
=	TokenNameEQUAL	
new	TokenNamenew	
Long	TokenNameIdentifier	 Long
(	TokenNameLPAREN	
10000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
Long	TokenNameIdentifier	 Long
truncate_request_timeout_in_ms	TokenNameIdentifier	 truncate request timeout in ms
=	TokenNameEQUAL	
new	TokenNamenew	
Long	TokenNameIdentifier	 Long
(	TokenNameLPAREN	
60000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
Integer	TokenNameIdentifier	 Integer
streaming_socket_timeout_in_ms	TokenNameIdentifier	 streaming socket timeout in ms
=	TokenNameEQUAL	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
boolean	TokenNameboolean	
cross_node_timeout	TokenNameIdentifier	 cross node timeout
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
volatile	TokenNamevolatile	
Double	TokenNameIdentifier	 Double
phi_convict_threshold	TokenNameIdentifier	 phi convict threshold
=	TokenNameEQUAL	
8.0	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
Integer	TokenNameIdentifier	 Integer
concurrent_reads	TokenNameIdentifier	 concurrent reads
=	TokenNameEQUAL	
8	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
Integer	TokenNameIdentifier	 Integer
concurrent_writes	TokenNameIdentifier	 concurrent writes
=	TokenNameEQUAL	
32	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
Integer	TokenNameIdentifier	 Integer
concurrent_replicates	TokenNameIdentifier	 concurrent replicates
=	TokenNameEQUAL	
32	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
Integer	TokenNameIdentifier	 Integer
memtable_flush_writers	TokenNameIdentifier	 memtable flush writers
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// will get set to the length of data dirs in DatabaseDescriptor 	TokenNameCOMMENT_LINE	will get set to the length of data dirs in DatabaseDescriptor 
public	TokenNamepublic	
Integer	TokenNameIdentifier	 Integer
memtable_total_space_in_mb	TokenNameIdentifier	 memtable total space in mb
;	TokenNameSEMICOLON	
public	TokenNamepublic	
Integer	TokenNameIdentifier	 Integer
storage_port	TokenNameIdentifier	 storage port
=	TokenNameEQUAL	
7000	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
Integer	TokenNameIdentifier	 Integer
ssl_storage_port	TokenNameIdentifier	 ssl storage port
=	TokenNameEQUAL	
7001	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
listen_address	TokenNameIdentifier	 listen address
;	TokenNameSEMICOLON	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
broadcast_address	TokenNameIdentifier	 broadcast address
;	TokenNameSEMICOLON	
public	TokenNamepublic	
Boolean	TokenNameIdentifier	 Boolean
start_rpc	TokenNameIdentifier	 start rpc
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
rpc_address	TokenNameIdentifier	 rpc address
;	TokenNameSEMICOLON	
public	TokenNamepublic	
Integer	TokenNameIdentifier	 Integer
rpc_port	TokenNameIdentifier	 rpc port
=	TokenNameEQUAL	
9160	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
rpc_server_type	TokenNameIdentifier	 rpc server type
=	TokenNameEQUAL	
"sync"	TokenNameStringLiteral	sync
;	TokenNameSEMICOLON	
public	TokenNamepublic	
Boolean	TokenNameIdentifier	 Boolean
rpc_keepalive	TokenNameIdentifier	 rpc keepalive
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
Integer	TokenNameIdentifier	 Integer
rpc_min_threads	TokenNameIdentifier	 rpc min threads
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
Integer	TokenNameIdentifier	 Integer
rpc_max_threads	TokenNameIdentifier	 rpc max threads
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
Integer	TokenNameIdentifier	 Integer
rpc_send_buff_size_in_bytes	TokenNameIdentifier	 rpc send buff size in bytes
;	TokenNameSEMICOLON	
public	TokenNamepublic	
Integer	TokenNameIdentifier	 Integer
rpc_recv_buff_size_in_bytes	TokenNameIdentifier	 rpc recv buff size in bytes
;	TokenNameSEMICOLON	
public	TokenNamepublic	
Boolean	TokenNameIdentifier	 Boolean
start_native_transport	TokenNameIdentifier	 start native transport
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
Integer	TokenNameIdentifier	 Integer
native_transport_port	TokenNameIdentifier	 native transport port
=	TokenNameEQUAL	
8000	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
Integer	TokenNameIdentifier	 Integer
native_transport_min_threads	TokenNameIdentifier	 native transport min threads
=	TokenNameEQUAL	
16	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
Integer	TokenNameIdentifier	 Integer
native_transport_max_threads	TokenNameIdentifier	 native transport max threads
=	TokenNameEQUAL	
128	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
Integer	TokenNameIdentifier	 Integer
thrift_max_message_length_in_mb	TokenNameIdentifier	 thrift max message length in mb
=	TokenNameEQUAL	
16	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
Integer	TokenNameIdentifier	 Integer
thrift_framed_transport_size_in_mb	TokenNameIdentifier	 thrift framed transport size in mb
=	TokenNameEQUAL	
15	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
Boolean	TokenNameIdentifier	 Boolean
snapshot_before_compaction	TokenNameIdentifier	 snapshot before compaction
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
Boolean	TokenNameIdentifier	 Boolean
auto_snapshot	TokenNameIdentifier	 auto snapshot
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
/* if the size of columns or super-columns are more than this, indexing will kick in */	TokenNameCOMMENT_BLOCK	 if the size of columns or super-columns are more than this, indexing will kick in 
public	TokenNamepublic	
Integer	TokenNameIdentifier	 Integer
column_index_size_in_kb	TokenNameIdentifier	 column index size in kb
=	TokenNameEQUAL	
64	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
Integer	TokenNameIdentifier	 Integer
in_memory_compaction_limit_in_mb	TokenNameIdentifier	 in memory compaction limit in mb
=	TokenNameEQUAL	
64	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
Integer	TokenNameIdentifier	 Integer
concurrent_compactors	TokenNameIdentifier	 concurrent compactors
=	TokenNameEQUAL	
FBUtilities	TokenNameIdentifier	 FB Utilities
.	TokenNameDOT	
getAvailableProcessors	TokenNameIdentifier	 get Available Processors
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
volatile	TokenNamevolatile	
Integer	TokenNameIdentifier	 Integer
compaction_throughput_mb_per_sec	TokenNameIdentifier	 compaction throughput mb per sec
=	TokenNameEQUAL	
16	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
Boolean	TokenNameIdentifier	 Boolean
multithreaded_compaction	TokenNameIdentifier	 multithreaded compaction
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
Integer	TokenNameIdentifier	 Integer
max_streaming_retries	TokenNameIdentifier	 max streaming retries
=	TokenNameEQUAL	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
volatile	TokenNamevolatile	
Integer	TokenNameIdentifier	 Integer
stream_throughput_outbound_megabits_per_sec	TokenNameIdentifier	 stream throughput outbound megabits per sec
;	TokenNameSEMICOLON	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
data_file_directories	TokenNameIdentifier	 data file directories
;	TokenNameSEMICOLON	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
saved_caches_directory	TokenNameIdentifier	 saved caches directory
;	TokenNameSEMICOLON	
// Commit Log 	TokenNameCOMMENT_LINE	Commit Log 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
commitlog_directory	TokenNameIdentifier	 commitlog directory
;	TokenNameSEMICOLON	
public	TokenNamepublic	
Integer	TokenNameIdentifier	 Integer
commitlog_total_space_in_mb	TokenNameIdentifier	 commitlog total space in mb
;	TokenNameSEMICOLON	
public	TokenNamepublic	
CommitLogSync	TokenNameIdentifier	 Commit Log Sync
commitlog_sync	TokenNameIdentifier	 commitlog sync
;	TokenNameSEMICOLON	
public	TokenNamepublic	
Double	TokenNameIdentifier	 Double
commitlog_sync_batch_window_in_ms	TokenNameIdentifier	 commitlog sync batch window in ms
;	TokenNameSEMICOLON	
public	TokenNamepublic	
Integer	TokenNameIdentifier	 Integer
commitlog_sync_period_in_ms	TokenNameIdentifier	 commitlog sync period in ms
;	TokenNameSEMICOLON	
public	TokenNamepublic	
int	TokenNameint	
commitlog_segment_size_in_mb	TokenNameIdentifier	 commitlog segment size in mb
=	TokenNameEQUAL	
32	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
endpoint_snitch	TokenNameIdentifier	 endpoint snitch
;	TokenNameSEMICOLON	
public	TokenNamepublic	
Boolean	TokenNameIdentifier	 Boolean
dynamic_snitch	TokenNameIdentifier	 dynamic snitch
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
Integer	TokenNameIdentifier	 Integer
dynamic_snitch_update_interval_in_ms	TokenNameIdentifier	 dynamic snitch update interval in ms
=	TokenNameEQUAL	
100	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
Integer	TokenNameIdentifier	 Integer
dynamic_snitch_reset_interval_in_ms	TokenNameIdentifier	 dynamic snitch reset interval in ms
=	TokenNameEQUAL	
600000	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
Double	TokenNameIdentifier	 Double
dynamic_snitch_badness_threshold	TokenNameIdentifier	 dynamic snitch badness threshold
=	TokenNameEQUAL	
0.1	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
request_scheduler	TokenNameIdentifier	 request scheduler
;	TokenNameSEMICOLON	
public	TokenNamepublic	
RequestSchedulerId	TokenNameIdentifier	 Request Scheduler Id
request_scheduler_id	TokenNameIdentifier	 request scheduler id
;	TokenNameSEMICOLON	
public	TokenNamepublic	
RequestSchedulerOptions	TokenNameIdentifier	 Request Scheduler Options
request_scheduler_options	TokenNameIdentifier	 request scheduler options
;	TokenNameSEMICOLON	
public	TokenNamepublic	
ServerEncryptionOptions	TokenNameIdentifier	 Server Encryption Options
server_encryption_options	TokenNameIdentifier	 server encryption options
=	TokenNameEQUAL	
new	TokenNamenew	
ServerEncryptionOptions	TokenNameIdentifier	 Server Encryption Options
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
ClientEncryptionOptions	TokenNameIdentifier	 Client Encryption Options
client_encryption_options	TokenNameIdentifier	 client encryption options
=	TokenNameEQUAL	
new	TokenNamenew	
ClientEncryptionOptions	TokenNameIdentifier	 Client Encryption Options
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// this encOptions is for backward compatibility (a warning is logged by DatabaseDescriptor) 	TokenNameCOMMENT_LINE	this encOptions is for backward compatibility (a warning is logged by DatabaseDescriptor) 
public	TokenNamepublic	
ServerEncryptionOptions	TokenNameIdentifier	 Server Encryption Options
encryption_options	TokenNameIdentifier	 encryption options
;	TokenNameSEMICOLON	
public	TokenNamepublic	
InternodeCompression	TokenNameIdentifier	 Internode Compression
internode_compression	TokenNameIdentifier	 internode compression
=	TokenNameEQUAL	
InternodeCompression	TokenNameIdentifier	 Internode Compression
.	TokenNameDOT	
none	TokenNameIdentifier	 none
;	TokenNameSEMICOLON	
public	TokenNamepublic	
Integer	TokenNameIdentifier	 Integer
index_interval	TokenNameIdentifier	 index interval
=	TokenNameEQUAL	
128	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
Double	TokenNameIdentifier	 Double
flush_largest_memtables_at	TokenNameIdentifier	 flush largest memtables at
=	TokenNameEQUAL	
1.0	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
Double	TokenNameIdentifier	 Double
reduce_cache_sizes_at	TokenNameIdentifier	 reduce cache sizes at
=	TokenNameEQUAL	
1.0	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
double	TokenNamedouble	
reduce_cache_capacity_to	TokenNameIdentifier	 reduce cache capacity to
=	TokenNameEQUAL	
0.6	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
int	TokenNameint	
hinted_handoff_throttle_in_kb	TokenNameIdentifier	 hinted handoff throttle in kb
=	TokenNameEQUAL	
1024	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
int	TokenNameint	
max_hints_delivery_threads	TokenNameIdentifier	 max hints delivery threads
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
boolean	TokenNameboolean	
compaction_preheat_key_cache	TokenNameIdentifier	 compaction preheat key cache
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
volatile	TokenNamevolatile	
boolean	TokenNameboolean	
incremental_backups	TokenNameIdentifier	 incremental backups
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
int	TokenNameint	
memtable_flush_queue_size	TokenNameIdentifier	 memtable flush queue size
=	TokenNameEQUAL	
4	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
boolean	TokenNameboolean	
trickle_fsync	TokenNameIdentifier	 trickle fsync
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
int	TokenNameint	
trickle_fsync_interval_in_kb	TokenNameIdentifier	 trickle fsync interval in kb
=	TokenNameEQUAL	
10240	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
Long	TokenNameIdentifier	 Long
key_cache_size_in_mb	TokenNameIdentifier	 key cache size in mb
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
volatile	TokenNamevolatile	
int	TokenNameint	
key_cache_save_period	TokenNameIdentifier	 key cache save period
=	TokenNameEQUAL	
14400	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
int	TokenNameint	
key_cache_keys_to_save	TokenNameIdentifier	 key cache keys to save
=	TokenNameEQUAL	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
;	TokenNameSEMICOLON	
public	TokenNamepublic	
long	TokenNamelong	
row_cache_size_in_mb	TokenNameIdentifier	 row cache size in mb
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
volatile	TokenNamevolatile	
int	TokenNameint	
row_cache_save_period	TokenNameIdentifier	 row cache save period
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
int	TokenNameint	
row_cache_keys_to_save	TokenNameIdentifier	 row cache keys to save
=	TokenNameEQUAL	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
;	TokenNameSEMICOLON	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
row_cache_provider	TokenNameIdentifier	 row cache provider
=	TokenNameEQUAL	
SerializingCacheProvider	TokenNameIdentifier	 Serializing Cache Provider
.	TokenNameDOT	
class	TokenNameclass	
.	TokenNameDOT	
getSimpleName	TokenNameIdentifier	 get Simple Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
boolean	TokenNameboolean	
populate_io_cache_on_flush	TokenNameIdentifier	 populate io cache on flush
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
boolean	TokenNameboolean	
loadYaml	TokenNameIdentifier	 load Yaml
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
boolean	TokenNameboolean	
outboundBindAny	TokenNameIdentifier	 outbound Bind Any
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
boolean	TokenNameboolean	
getOutboundBindAny	TokenNameIdentifier	 get Outbound Bind Any
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
outboundBindAny	TokenNameIdentifier	 outbound Bind Any
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
setOutboundBindAny	TokenNameIdentifier	 set Outbound Bind Any
(	TokenNameLPAREN	
boolean	TokenNameboolean	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
outboundBindAny	TokenNameIdentifier	 outbound Bind Any
=	TokenNameEQUAL	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
boolean	TokenNameboolean	
getLoadYaml	TokenNameIdentifier	 get Load Yaml
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
loadYaml	TokenNameIdentifier	 load Yaml
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
setLoadYaml	TokenNameIdentifier	 set Load Yaml
(	TokenNameLPAREN	
boolean	TokenNameboolean	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
loadYaml	TokenNameIdentifier	 load Yaml
=	TokenNameEQUAL	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
enum	TokenNameenum	
CommitLogSync	TokenNameIdentifier	 Commit Log Sync
{	TokenNameLBRACE	
periodic	TokenNameIdentifier	 periodic
,	TokenNameCOMMA	
batch	TokenNameIdentifier	 batch
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
enum	TokenNameenum	
InternodeCompression	TokenNameIdentifier	 Internode Compression
{	TokenNameLBRACE	
all	TokenNameIdentifier	 all
,	TokenNameCOMMA	
none	TokenNameIdentifier	 none
,	TokenNameCOMMA	
dc	TokenNameIdentifier	 dc
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
enum	TokenNameenum	
DiskAccessMode	TokenNameIdentifier	 Disk Access Mode
{	TokenNameLBRACE	
auto	TokenNameIdentifier	 auto
,	TokenNameCOMMA	
mmap	TokenNameIdentifier	 mmap
,	TokenNameCOMMA	
mmap_index_only	TokenNameIdentifier	 mmap index only
,	TokenNameCOMMA	
standard	TokenNameIdentifier	 standard
,	TokenNameCOMMA	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
enum	TokenNameenum	
DiskFailurePolicy	TokenNameIdentifier	 Disk Failure Policy
{	TokenNameLBRACE	
best_effort	TokenNameIdentifier	 best effort
,	TokenNameCOMMA	
stop	TokenNameIdentifier	 stop
,	TokenNameCOMMA	
ignore	TokenNameIdentifier	 ignore
,	TokenNameCOMMA	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
enum	TokenNameenum	
RequestSchedulerId	TokenNameIdentifier	 Request Scheduler Id
{	TokenNameLBRACE	
keyspace	TokenNameIdentifier	 keyspace
}	TokenNameRBRACE	
}	TokenNameRBRACE	
