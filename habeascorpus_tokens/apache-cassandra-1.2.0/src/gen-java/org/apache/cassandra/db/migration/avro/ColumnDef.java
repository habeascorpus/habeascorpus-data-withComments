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
ColumnDef	TokenNameIdentifier	 Column Def
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
"{"type":"record","name":"ColumnDef","namespace":"org.apache.cassandra.db.migration.avro","fields":[{"name":"name","type":"bytes"},{"name":"validation_class","type":"string"},{"name":"index_type","type":[{"type":"enum","name":"IndexType","symbols":["KEYS","CUSTOM"],"aliases":["org.apache.cassandra.config.avro.IndexType"]},"null"]},{"name":"index_name","type":["string","null"]},{"name":"index_options","type":["null",{"type":"map","values":"string"}],"default":null}],"aliases":["org.apache.cassandra.config.avro.ColumnDef"]}"	TokenNameStringLiteral	{"type":"record","name":"ColumnDef","namespace":"org.apache.cassandra.db.migration.avro","fields":[{"name":"name","type":"bytes"},{"name":"validation_class","type":"string"},{"name":"index_type","type":[{"type":"enum","name":"IndexType","symbols":["KEYS","CUSTOM"],"aliases":["org.apache.cassandra.config.avro.IndexType"]},"null"]},{"name":"index_name","type":["string","null"]},{"name":"index_options","type":["null",{"type":"map","values":"string"}],"default":null}],"aliases":["org.apache.cassandra.config.avro.ColumnDef"]}
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
nio	TokenNameIdentifier	 nio
.	TokenNameDOT	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
public	TokenNamepublic	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
CharSequence	TokenNameIdentifier	 Char Sequence
validation_class	TokenNameIdentifier	 validation class
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
IndexType	TokenNameIdentifier	 Index Type
index_type	TokenNameIdentifier	 index type
;	TokenNameSEMICOLON	
public	TokenNamepublic	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
CharSequence	TokenNameIdentifier	 Char Sequence
index_name	TokenNameIdentifier	 index name
;	TokenNameSEMICOLON	
public	TokenNamepublic	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
CharSequence	TokenNameIdentifier	 Char Sequence
,	TokenNameCOMMA	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
CharSequence	TokenNameIdentifier	 Char Sequence
>	TokenNameGREATER	
index_options	TokenNameIdentifier	 index options
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
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
case	TokenNamecase	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
validation_class	TokenNameIdentifier	 validation class
;	TokenNameSEMICOLON	
case	TokenNamecase	
2	TokenNameIntegerLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
index_type	TokenNameIdentifier	 index type
;	TokenNameSEMICOLON	
case	TokenNamecase	
3	TokenNameIntegerLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
index_name	TokenNameIdentifier	 index name
;	TokenNameSEMICOLON	
case	TokenNamecase	
4	TokenNameIntegerLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
index_options	TokenNameIdentifier	 index options
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
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
(	TokenNameLPAREN	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
nio	TokenNameIdentifier	 nio
.	TokenNameDOT	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
)	TokenNameRPAREN	
value$	TokenNameIdentifier	 value$
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
validation_class	TokenNameIdentifier	 validation class
=	TokenNameEQUAL	
(	TokenNameLPAREN	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
CharSequence	TokenNameIdentifier	 Char Sequence
)	TokenNameRPAREN	
value$	TokenNameIdentifier	 value$
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
2	TokenNameIntegerLiteral	
:	TokenNameCOLON	
index_type	TokenNameIdentifier	 index type
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
IndexType	TokenNameIdentifier	 Index Type
)	TokenNameRPAREN	
value$	TokenNameIdentifier	 value$
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
3	TokenNameIntegerLiteral	
:	TokenNameCOLON	
index_name	TokenNameIdentifier	 index name
=	TokenNameEQUAL	
(	TokenNameLPAREN	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
CharSequence	TokenNameIdentifier	 Char Sequence
)	TokenNameRPAREN	
value$	TokenNameIdentifier	 value$
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
4	TokenNameIntegerLiteral	
:	TokenNameCOLON	
index_options	TokenNameIdentifier	 index options
=	TokenNameEQUAL	
(	TokenNameLPAREN	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
CharSequence	TokenNameIdentifier	 Char Sequence
,	TokenNameCOMMA	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
CharSequence	TokenNameIdentifier	 Char Sequence
>	TokenNameGREATER	
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