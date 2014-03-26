/** * Autogenerated by Avro * * DO NOT EDIT DIRECTLY */	TokenNameCOMMENT_JAVADOC	 Autogenerated by Avro * DO NOT EDIT DIRECTLY 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
db	TokenNameIdentifier	 db
.	TokenNameDOT	
migration	TokenNameIdentifier	 migration
.	TokenNameDOT	
avro	TokenNameIdentifier	 avro
;	TokenNameSEMICOLON	
@	TokenNameAT	
SuppressWarnings	TokenNameIdentifier	 Suppress Warnings
(	TokenNameLPAREN	
"all"	TokenNameStringLiteral	all
)	TokenNameRPAREN	
public	TokenNamepublic	
class	TokenNameclass	
AddKeyspace	TokenNameIdentifier	 Add Keyspace
extends	TokenNameextends	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
avro	TokenNameIdentifier	 avro
.	TokenNameDOT	
specific	TokenNameIdentifier	 specific
.	TokenNameDOT	
SpecificRecordBase	TokenNameIdentifier	 Specific Record Base
implements	TokenNameimplements	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
avro	TokenNameIdentifier	 avro
.	TokenNameDOT	
specific	TokenNameIdentifier	 specific
.	TokenNameDOT	
SpecificRecord	TokenNameIdentifier	 Specific Record
{	TokenNameLBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
avro	TokenNameIdentifier	 avro
.	TokenNameDOT	
Schema	TokenNameIdentifier	 Schema
SCHEMA$	TokenNameIdentifier	 SCHEM A$
=	TokenNameEQUAL	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
avro	TokenNameIdentifier	 avro
.	TokenNameDOT	
Schema	TokenNameIdentifier	 Schema
.	TokenNameDOT	
parse	TokenNameIdentifier	 parse
(	TokenNameLPAREN	
"{"type":"record","name":"AddKeyspace","namespace":"org.apache.cassandra.db.migration.avro","fields":[{"name":"ks","type":{"type":"record","name":"KsDef","fields":[{"name":"name","type":"string"},{"name":"strategy_class","type":"string"},{"name":"strategy_options","type":[{"type":"map","values":"string"},"null"]},{"name":"replication_factor","type":["int","null"]},{"name":"cf_defs","type":{"type":"array","items":{"type":"record","name":"CfDef","fields":[{"name":"keyspace","type":"string"},{"name":"name","type":"string"},{"name":"column_type","type":["string","null"]},{"name":"comparator_type","type":["string","null"]},{"name":"subcomparator_type","type":["string","null"]},{"name":"comment","type":["string","null"]},{"name":"read_repair_chance","type":["double","null"]},{"name":"replicate_on_write","type":"boolean","default":false},{"name":"gc_grace_seconds","type":["int","null"]},{"name":"default_validation_class","type":["null","string"],"default":null},{"name":"key_validation_class","type":["null","string"],"default":null},{"name":"min_compaction_threshold","type":["null","int"],"default":null},{"name":"max_compaction_threshold","type":["null","int"],"default":null},{"name":"merge_shards_chance","type":["null","double"],"default":null},{"name":"id","type":["int","null"]},{"name":"column_metadata","type":[{"type":"array","items":{"type":"record","name":"ColumnDef","fields":[{"name":"name","type":"bytes"},{"name":"validation_class","type":"string"},{"name":"index_type","type":[{"type":"enum","name":"IndexType","symbols":["KEYS","CUSTOM"],"aliases":["org.apache.cassandra.config.avro.IndexType"]},"null"]},{"name":"index_name","type":["string","null"]},{"name":"index_options","type":["null",{"type":"map","values":"string"}],"default":null}],"aliases":["org.apache.cassandra.config.avro.ColumnDef"]}},"null"]},{"name":"key_alias","type":["null","bytes"],"default":null},{"name":"compaction_strategy","type":["null","string"],"default":null},{"name":"compaction_strategy_options","type":["null",{"type":"map","values":"string"}],"default":null},{"name":"compression_options","type":["null",{"type":"map","values":"string"}],"default":null},{"name":"bloom_filter_fp_chance","type":["null","double"],"default":null},{"name":"caching","type":["null","string"],"default":null},{"name":"column_aliases","type":["null",{"type":"array","items":"bytes"}],"default":null},{"name":"value_alias","type":["null","bytes"],"default":null},{"name":"dclocal_read_repair_chance","type":["double","null"],"default":0.0},{"name":"row_cache_size","type":["double","null"]},{"name":"key_cache_size","type":["double","null"]}],"aliases":["org.apache.cassandra.config.avro.CfDef"]}}},{"name":"durable_writes","type":"boolean","default":true}],"aliases":["org.apache.cassandra.config.avro.KsDef"]}}]}"	TokenNameStringLiteral	{"type":"record","name":"AddKeyspace","namespace":"org.apache.cassandra.db.migration.avro","fields":[{"name":"ks","type":{"type":"record","name":"KsDef","fields":[{"name":"name","type":"string"},{"name":"strategy_class","type":"string"},{"name":"strategy_options","type":[{"type":"map","values":"string"},"null"]},{"name":"replication_factor","type":["int","null"]},{"name":"cf_defs","type":{"type":"array","items":{"type":"record","name":"CfDef","fields":[{"name":"keyspace","type":"string"},{"name":"name","type":"string"},{"name":"column_type","type":["string","null"]},{"name":"comparator_type","type":["string","null"]},{"name":"subcomparator_type","type":["string","null"]},{"name":"comment","type":["string","null"]},{"name":"read_repair_chance","type":["double","null"]},{"name":"replicate_on_write","type":"boolean","default":false},{"name":"gc_grace_seconds","type":["int","null"]},{"name":"default_validation_class","type":["null","string"],"default":null},{"name":"key_validation_class","type":["null","string"],"default":null},{"name":"min_compaction_threshold","type":["null","int"],"default":null},{"name":"max_compaction_threshold","type":["null","int"],"default":null},{"name":"merge_shards_chance","type":["null","double"],"default":null},{"name":"id","type":["int","null"]},{"name":"column_metadata","type":[{"type":"array","items":{"type":"record","name":"ColumnDef","fields":[{"name":"name","type":"bytes"},{"name":"validation_class","type":"string"},{"name":"index_type","type":[{"type":"enum","name":"IndexType","symbols":["KEYS","CUSTOM"],"aliases":["org.apache.cassandra.config.avro.IndexType"]},"null"]},{"name":"index_name","type":["string","null"]},{"name":"index_options","type":["null",{"type":"map","values":"string"}],"default":null}],"aliases":["org.apache.cassandra.config.avro.ColumnDef"]}},"null"]},{"name":"key_alias","type":["null","bytes"],"default":null},{"name":"compaction_strategy","type":["null","string"],"default":null},{"name":"compaction_strategy_options","type":["null",{"type":"map","values":"string"}],"default":null},{"name":"compression_options","type":["null",{"type":"map","values":"string"}],"default":null},{"name":"bloom_filter_fp_chance","type":["null","double"],"default":null},{"name":"caching","type":["null","string"],"default":null},{"name":"column_aliases","type":["null",{"type":"array","items":"bytes"}],"default":null},{"name":"value_alias","type":["null","bytes"],"default":null},{"name":"dclocal_read_repair_chance","type":["double","null"],"default":0.0},{"name":"row_cache_size","type":["double","null"]},{"name":"key_cache_size","type":["double","null"]}],"aliases":["org.apache.cassandra.config.avro.CfDef"]}}},{"name":"durable_writes","type":"boolean","default":true}],"aliases":["org.apache.cassandra.config.avro.KsDef"]}}]}
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
db	TokenNameIdentifier	 db
.	TokenNameDOT	
migration	TokenNameIdentifier	 migration
.	TokenNameDOT	
avro	TokenNameIdentifier	 avro
.	TokenNameDOT	
KsDef	TokenNameIdentifier	 Ks Def
ks	TokenNameIdentifier	 ks
;	TokenNameSEMICOLON	
public	TokenNamepublic	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
avro	TokenNameIdentifier	 avro
.	TokenNameDOT	
Schema	TokenNameIdentifier	 Schema
getSchema	TokenNameIdentifier	 get Schema
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
SCHEMA$	TokenNameIdentifier	 SCHEM A$
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Used by DatumWriter. Applications should not call. 	TokenNameCOMMENT_LINE	Used by DatumWriter. Applications should not call. 
public	TokenNamepublic	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
Object	TokenNameIdentifier	 Object
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
int	TokenNameint	
field$	TokenNameIdentifier	 field$
)	TokenNameRPAREN	
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
field$	TokenNameIdentifier	 field$
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
ks	TokenNameIdentifier	 ks
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
throw	TokenNamethrow	
new	TokenNamenew	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
avro	TokenNameIdentifier	 avro
.	TokenNameDOT	
AvroRuntimeException	TokenNameIdentifier	 Avro Runtime Exception
(	TokenNameLPAREN	
"Bad index"	TokenNameStringLiteral	Bad index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// Used by DatumReader. Applications should not call. 	TokenNameCOMMENT_LINE	Used by DatumReader. Applications should not call. 
@	TokenNameAT	
SuppressWarnings	TokenNameIdentifier	 Suppress Warnings
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
"unchecked"	TokenNameStringLiteral	unchecked
)	TokenNameRPAREN	
public	TokenNamepublic	
void	TokenNamevoid	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
int	TokenNameint	
field$	TokenNameIdentifier	 field$
,	TokenNameCOMMA	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
Object	TokenNameIdentifier	 Object
value$	TokenNameIdentifier	 value$
)	TokenNameRPAREN	
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
field$	TokenNameIdentifier	 field$
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
ks	TokenNameIdentifier	 ks
=	TokenNameEQUAL	
(	TokenNameLPAREN	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
db	TokenNameIdentifier	 db
.	TokenNameDOT	
migration	TokenNameIdentifier	 migration
.	TokenNameDOT	
avro	TokenNameIdentifier	 avro
.	TokenNameDOT	
KsDef	TokenNameIdentifier	 Ks Def
)	TokenNameRPAREN	
value$	TokenNameIdentifier	 value$
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
throw	TokenNamethrow	
new	TokenNamenew	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
avro	TokenNameIdentifier	 avro
.	TokenNameDOT	
AvroRuntimeException	TokenNameIdentifier	 Avro Runtime Exception
(	TokenNameLPAREN	
"Bad index"	TokenNameStringLiteral	Bad index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	