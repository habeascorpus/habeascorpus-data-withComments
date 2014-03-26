/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
cql3	TokenNameIdentifier	 cql3
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
compaction	TokenNameIdentifier	 compaction
.	TokenNameDOT	
AbstractCompactionStrategy	TokenNameIdentifier	 Abstract Compaction Strategy
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
exceptions	TokenNameIdentifier	 exceptions
.	TokenNameDOT	
ConfigurationException	TokenNameIdentifier	 Configuration Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
exceptions	TokenNameIdentifier	 exceptions
.	TokenNameDOT	
SyntaxException	TokenNameIdentifier	 Syntax Exception
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
compress	TokenNameIdentifier	 compress
.	TokenNameDOT	
CompressionParameters	TokenNameIdentifier	 Compression Parameters
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
CFPropDefs	TokenNameIdentifier	 CF Prop Defs
extends	TokenNameextends	
PropertyDefinitions	TokenNameIdentifier	 Property Definitions
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
CFPropDefs	TokenNameIdentifier	 CF Prop Defs
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
KW_COMMENT	TokenNameIdentifier	 KW  COMMENT
=	TokenNameEQUAL	
"comment"	TokenNameStringLiteral	comment
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
KW_READREPAIRCHANCE	TokenNameIdentifier	 KW  READREPAIRCHANCE
=	TokenNameEQUAL	
"read_repair_chance"	TokenNameStringLiteral	read_repair_chance
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
KW_DCLOCALREADREPAIRCHANCE	TokenNameIdentifier	 KW  DCLOCALREADREPAIRCHANCE
=	TokenNameEQUAL	
"dclocal_read_repair_chance"	TokenNameStringLiteral	dclocal_read_repair_chance
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
KW_GCGRACESECONDS	TokenNameIdentifier	 KW  GCGRACESECONDS
=	TokenNameEQUAL	
"gc_grace_seconds"	TokenNameStringLiteral	gc_grace_seconds
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
KW_MINCOMPACTIONTHRESHOLD	TokenNameIdentifier	 KW  MINCOMPACTIONTHRESHOLD
=	TokenNameEQUAL	
"min_threshold"	TokenNameStringLiteral	min_threshold
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
KW_MAXCOMPACTIONTHRESHOLD	TokenNameIdentifier	 KW  MAXCOMPACTIONTHRESHOLD
=	TokenNameEQUAL	
"max_threshold"	TokenNameStringLiteral	max_threshold
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
KW_REPLICATEONWRITE	TokenNameIdentifier	 KW  REPLICATEONWRITE
=	TokenNameEQUAL	
"replicate_on_write"	TokenNameStringLiteral	replicate_on_write
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
KW_CACHING	TokenNameIdentifier	 KW  CACHING
=	TokenNameEQUAL	
"caching"	TokenNameStringLiteral	caching
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
KW_BF_FP_CHANCE	TokenNameIdentifier	 KW  BF  FP  CHANCE
=	TokenNameEQUAL	
"bloom_filter_fp_chance"	TokenNameStringLiteral	bloom_filter_fp_chance
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
KW_COMPACTION	TokenNameIdentifier	 KW  COMPACTION
=	TokenNameEQUAL	
"compaction"	TokenNameStringLiteral	compaction
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
KW_COMPRESSION	TokenNameIdentifier	 KW  COMPRESSION
=	TokenNameEQUAL	
"compression"	TokenNameStringLiteral	compression
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
COMPACTION_STRATEGY_CLASS_KEY	TokenNameIdentifier	 COMPACTION  STRATEGY  CLASS  KEY
=	TokenNameEQUAL	
"class"	TokenNameStringLiteral	class
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
keywords	TokenNameIdentifier	 keywords
=	TokenNameEQUAL	
new	TokenNamenew	
HashSet	TokenNameIdentifier	 Hash Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
obsoleteKeywords	TokenNameIdentifier	 obsolete Keywords
=	TokenNameEQUAL	
new	TokenNamenew	
HashSet	TokenNameIdentifier	 Hash Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
{	TokenNameLBRACE	
keywords	TokenNameIdentifier	 keywords
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
KW_COMMENT	TokenNameIdentifier	 KW  COMMENT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
keywords	TokenNameIdentifier	 keywords
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
KW_READREPAIRCHANCE	TokenNameIdentifier	 KW  READREPAIRCHANCE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
keywords	TokenNameIdentifier	 keywords
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
KW_DCLOCALREADREPAIRCHANCE	TokenNameIdentifier	 KW  DCLOCALREADREPAIRCHANCE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
keywords	TokenNameIdentifier	 keywords
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
KW_GCGRACESECONDS	TokenNameIdentifier	 KW  GCGRACESECONDS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
keywords	TokenNameIdentifier	 keywords
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
KW_REPLICATEONWRITE	TokenNameIdentifier	 KW  REPLICATEONWRITE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
keywords	TokenNameIdentifier	 keywords
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
KW_CACHING	TokenNameIdentifier	 KW  CACHING
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
keywords	TokenNameIdentifier	 keywords
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
KW_BF_FP_CHANCE	TokenNameIdentifier	 KW  BF  FP  CHANCE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
keywords	TokenNameIdentifier	 keywords
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
KW_COMPACTION	TokenNameIdentifier	 KW  COMPACTION
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
keywords	TokenNameIdentifier	 keywords
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
KW_COMPRESSION	TokenNameIdentifier	 KW  COMPRESSION
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
obsoleteKeywords	TokenNameIdentifier	 obsolete Keywords
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"compaction_strategy_class"	TokenNameStringLiteral	compaction_strategy_class
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
obsoleteKeywords	TokenNameIdentifier	 obsolete Keywords
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"compaction_strategy_options"	TokenNameStringLiteral	compaction_strategy_options
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
obsoleteKeywords	TokenNameIdentifier	 obsolete Keywords
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"min_compaction_threshold"	TokenNameStringLiteral	min_compaction_threshold
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
obsoleteKeywords	TokenNameIdentifier	 obsolete Keywords
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"max_compaction_threshold"	TokenNameStringLiteral	max_compaction_threshold
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
obsoleteKeywords	TokenNameIdentifier	 obsolete Keywords
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"compaction_parameters"	TokenNameStringLiteral	compaction_parameters
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
obsoleteKeywords	TokenNameIdentifier	 obsolete Keywords
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"compression_parameters"	TokenNameStringLiteral	compression_parameters
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
Class	TokenNameIdentifier	 Class
<	TokenNameLESS	
?	TokenNameQUESTION	
extends	TokenNameextends	
AbstractCompactionStrategy	TokenNameIdentifier	 Abstract Compaction Strategy
>	TokenNameGREATER	
compactionStrategyClass	TokenNameIdentifier	 compaction Strategy Class
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
void	TokenNamevoid	
validate	TokenNameIdentifier	 validate
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
ConfigurationException	TokenNameIdentifier	 Configuration Exception
,	TokenNameCOMMA	
SyntaxException	TokenNameIdentifier	 Syntax Exception
{	TokenNameLBRACE	
validate	TokenNameIdentifier	 validate
(	TokenNameLPAREN	
keywords	TokenNameIdentifier	 keywords
,	TokenNameCOMMA	
obsoleteKeywords	TokenNameIdentifier	 obsolete Keywords
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
compactionOptions	TokenNameIdentifier	 compaction Options
=	TokenNameEQUAL	
getCompactionOptions	TokenNameIdentifier	 get Compaction Options
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
compactionOptions	TokenNameIdentifier	 compaction Options
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
strategy	TokenNameIdentifier	 strategy
=	TokenNameEQUAL	
compactionOptions	TokenNameIdentifier	 compaction Options
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
COMPACTION_STRATEGY_CLASS_KEY	TokenNameIdentifier	 COMPACTION  STRATEGY  CLASS  KEY
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
strategy	TokenNameIdentifier	 strategy
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
ConfigurationException	TokenNameIdentifier	 Configuration Exception
(	TokenNameLPAREN	
"Missing sub-option '"	TokenNameStringLiteral	Missing sub-option '
+	TokenNamePLUS	
COMPACTION_STRATEGY_CLASS_KEY	TokenNameIdentifier	 COMPACTION  STRATEGY  CLASS  KEY
+	TokenNamePLUS	
"' for the '"	TokenNameStringLiteral	' for the '
+	TokenNamePLUS	
KW_COMPACTION	TokenNameIdentifier	 KW  COMPACTION
+	TokenNamePLUS	
"' option."	TokenNameStringLiteral	' option.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
compactionStrategyClass	TokenNameIdentifier	 compaction Strategy Class
=	TokenNameEQUAL	
CFMetaData	TokenNameIdentifier	 CF Meta Data
.	TokenNameDOT	
createCompactionStrategy	TokenNameIdentifier	 create Compaction Strategy
(	TokenNameLPAREN	
strategy	TokenNameIdentifier	 strategy
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
compactionOptions	TokenNameIdentifier	 compaction Options
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
COMPACTION_STRATEGY_CLASS_KEY	TokenNameIdentifier	 COMPACTION  STRATEGY  CLASS  KEY
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
getCompactionOptions	TokenNameIdentifier	 get Compaction Options
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
SyntaxException	TokenNameIdentifier	 Syntax Exception
{	TokenNameLBRACE	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
compactionOptions	TokenNameIdentifier	 compaction Options
=	TokenNameEQUAL	
getMap	TokenNameIdentifier	 get Map
(	TokenNameLPAREN	
KW_COMPACTION	TokenNameIdentifier	 KW  COMPACTION
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
compactionOptions	TokenNameIdentifier	 compaction Options
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
emptyMap	TokenNameIdentifier	 empty Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
compactionOptions	TokenNameIdentifier	 compaction Options
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
getCompressionOptions	TokenNameIdentifier	 get Compression Options
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
SyntaxException	TokenNameIdentifier	 Syntax Exception
{	TokenNameLBRACE	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
compressionOptions	TokenNameIdentifier	 compression Options
=	TokenNameEQUAL	
getMap	TokenNameIdentifier	 get Map
(	TokenNameLPAREN	
KW_COMPRESSION	TokenNameIdentifier	 KW  COMPRESSION
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
compressionOptions	TokenNameIdentifier	 compression Options
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
compressionOptions	TokenNameIdentifier	 compression Options
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
applyToCFMetadata	TokenNameIdentifier	 apply To CF Metadata
(	TokenNameLPAREN	
CFMetaData	TokenNameIdentifier	 CF Meta Data
cfm	TokenNameIdentifier	 cfm
)	TokenNameRPAREN	
throws	TokenNamethrows	
ConfigurationException	TokenNameIdentifier	 Configuration Exception
,	TokenNameCOMMA	
SyntaxException	TokenNameIdentifier	 Syntax Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
hasProperty	TokenNameIdentifier	 has Property
(	TokenNameLPAREN	
KW_COMMENT	TokenNameIdentifier	 KW  COMMENT
)	TokenNameRPAREN	
)	TokenNameRPAREN	
cfm	TokenNameIdentifier	 cfm
.	TokenNameDOT	
comment	TokenNameIdentifier	 comment
(	TokenNameLPAREN	
getString	TokenNameIdentifier	 get String
(	TokenNameLPAREN	
KW_COMMENT	TokenNameIdentifier	 KW  COMMENT
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cfm	TokenNameIdentifier	 cfm
.	TokenNameDOT	
readRepairChance	TokenNameIdentifier	 read Repair Chance
(	TokenNameLPAREN	
getDouble	TokenNameIdentifier	 get Double
(	TokenNameLPAREN	
KW_READREPAIRCHANCE	TokenNameIdentifier	 KW  READREPAIRCHANCE
,	TokenNameCOMMA	
cfm	TokenNameIdentifier	 cfm
.	TokenNameDOT	
getReadRepairChance	TokenNameIdentifier	 get Read Repair Chance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cfm	TokenNameIdentifier	 cfm
.	TokenNameDOT	
dcLocalReadRepairChance	TokenNameIdentifier	 dc Local Read Repair Chance
(	TokenNameLPAREN	
getDouble	TokenNameIdentifier	 get Double
(	TokenNameLPAREN	
KW_DCLOCALREADREPAIRCHANCE	TokenNameIdentifier	 KW  DCLOCALREADREPAIRCHANCE
,	TokenNameCOMMA	
cfm	TokenNameIdentifier	 cfm
.	TokenNameDOT	
getDcLocalReadRepair	TokenNameIdentifier	 get Dc Local Read Repair
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cfm	TokenNameIdentifier	 cfm
.	TokenNameDOT	
gcGraceSeconds	TokenNameIdentifier	 gc Grace Seconds
(	TokenNameLPAREN	
getInt	TokenNameIdentifier	 get Int
(	TokenNameLPAREN	
KW_GCGRACESECONDS	TokenNameIdentifier	 KW  GCGRACESECONDS
,	TokenNameCOMMA	
cfm	TokenNameIdentifier	 cfm
.	TokenNameDOT	
getGcGraceSeconds	TokenNameIdentifier	 get Gc Grace Seconds
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cfm	TokenNameIdentifier	 cfm
.	TokenNameDOT	
replicateOnWrite	TokenNameIdentifier	 replicate On Write
(	TokenNameLPAREN	
getBoolean	TokenNameIdentifier	 get Boolean
(	TokenNameLPAREN	
KW_REPLICATEONWRITE	TokenNameIdentifier	 KW  REPLICATEONWRITE
,	TokenNameCOMMA	
cfm	TokenNameIdentifier	 cfm
.	TokenNameDOT	
getReplicateOnWrite	TokenNameIdentifier	 get Replicate On Write
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cfm	TokenNameIdentifier	 cfm
.	TokenNameDOT	
minCompactionThreshold	TokenNameIdentifier	 min Compaction Threshold
(	TokenNameLPAREN	
toInt	TokenNameIdentifier	 to Int
(	TokenNameLPAREN	
KW_MINCOMPACTIONTHRESHOLD	TokenNameIdentifier	 KW  MINCOMPACTIONTHRESHOLD
,	TokenNameCOMMA	
getCompactionOptions	TokenNameIdentifier	 get Compaction Options
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
KW_MINCOMPACTIONTHRESHOLD	TokenNameIdentifier	 KW  MINCOMPACTIONTHRESHOLD
)	TokenNameRPAREN	
,	TokenNameCOMMA	
cfm	TokenNameIdentifier	 cfm
.	TokenNameDOT	
getMinCompactionThreshold	TokenNameIdentifier	 get Min Compaction Threshold
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cfm	TokenNameIdentifier	 cfm
.	TokenNameDOT	
maxCompactionThreshold	TokenNameIdentifier	 max Compaction Threshold
(	TokenNameLPAREN	
toInt	TokenNameIdentifier	 to Int
(	TokenNameLPAREN	
KW_MAXCOMPACTIONTHRESHOLD	TokenNameIdentifier	 KW  MAXCOMPACTIONTHRESHOLD
,	TokenNameCOMMA	
getCompactionOptions	TokenNameIdentifier	 get Compaction Options
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
KW_MAXCOMPACTIONTHRESHOLD	TokenNameIdentifier	 KW  MAXCOMPACTIONTHRESHOLD
)	TokenNameRPAREN	
,	TokenNameCOMMA	
cfm	TokenNameIdentifier	 cfm
.	TokenNameDOT	
getMaxCompactionThreshold	TokenNameIdentifier	 get Max Compaction Threshold
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cfm	TokenNameIdentifier	 cfm
.	TokenNameDOT	
caching	TokenNameIdentifier	 caching
(	TokenNameLPAREN	
CFMetaData	TokenNameIdentifier	 CF Meta Data
.	TokenNameDOT	
Caching	TokenNameIdentifier	 Caching
.	TokenNameDOT	
fromString	TokenNameIdentifier	 from String
(	TokenNameLPAREN	
getString	TokenNameIdentifier	 get String
(	TokenNameLPAREN	
KW_CACHING	TokenNameIdentifier	 KW  CACHING
,	TokenNameCOMMA	
cfm	TokenNameIdentifier	 cfm
.	TokenNameDOT	
getCaching	TokenNameIdentifier	 get Caching
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
compactionStrategyClass	TokenNameIdentifier	 compaction Strategy Class
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
cfm	TokenNameIdentifier	 cfm
.	TokenNameDOT	
compactionStrategyClass	TokenNameIdentifier	 compaction Strategy Class
(	TokenNameLPAREN	
compactionStrategyClass	TokenNameIdentifier	 compaction Strategy Class
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cfm	TokenNameIdentifier	 cfm
.	TokenNameDOT	
compactionStrategyOptions	TokenNameIdentifier	 compaction Strategy Options
(	TokenNameLPAREN	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
(	TokenNameLPAREN	
getCompactionOptions	TokenNameIdentifier	 get Compaction Options
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
cfm	TokenNameIdentifier	 cfm
.	TokenNameDOT	
bloomFilterFpChance	TokenNameIdentifier	 bloom Filter Fp Chance
(	TokenNameLPAREN	
getDouble	TokenNameIdentifier	 get Double
(	TokenNameLPAREN	
KW_BF_FP_CHANCE	TokenNameIdentifier	 KW  BF  FP  CHANCE
,	TokenNameCOMMA	
cfm	TokenNameIdentifier	 cfm
.	TokenNameDOT	
getBloomFilterFpChance	TokenNameIdentifier	 get Bloom Filter Fp Chance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
getCompressionOptions	TokenNameIdentifier	 get Compression Options
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
cfm	TokenNameIdentifier	 cfm
.	TokenNameDOT	
compressionParameters	TokenNameIdentifier	 compression Parameters
(	TokenNameLPAREN	
CompressionParameters	TokenNameIdentifier	 Compression Parameters
.	TokenNameDOT	
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
getCompressionOptions	TokenNameIdentifier	 get Compression Options
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
"CFPropDefs(%s)"	TokenNameStringLiteral	CFPropDefs(%s)
,	TokenNameCOMMA	
properties	TokenNameIdentifier	 properties
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
