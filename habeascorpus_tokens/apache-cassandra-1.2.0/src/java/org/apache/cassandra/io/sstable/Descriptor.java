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
File	TokenNameIdentifier	 File
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
StringTokenizer	TokenNameIdentifier	 String Tokenizer
;	TokenNameSEMICOLON	
import	TokenNameimport	
com	TokenNameIdentifier	 com
.	TokenNameDOT	
google	TokenNameIdentifier	 google
.	TokenNameDOT	
common	TokenNameIdentifier	 common
.	TokenNameDOT	
base	TokenNameIdentifier	 base
.	TokenNameDOT	
Objects	TokenNameIdentifier	 Objects
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
FilterFactory	TokenNameIdentifier	 Filter Factory
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
Pair	TokenNameIdentifier	 Pair
;	TokenNameSEMICOLON	
import	TokenNameimport	
static	TokenNamestatic	
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
Component	TokenNameIdentifier	 Component
.	TokenNameDOT	
separator	TokenNameIdentifier	 separator
;	TokenNameSEMICOLON	
/** * A SSTable is described by the keyspace and column family it contains data * for, a generation (where higher generations contain more recent data) and * an alphabetic version string. * * A descriptor can be marked as temporary, which influences generated filenames. */	TokenNameCOMMENT_JAVADOC	 A SSTable is described by the keyspace and column family it contains data for, a generation (where higher generations contain more recent data) and an alphabetic version string. * A descriptor can be marked as temporary, which influences generated filenames. 
public	TokenNamepublic	
class	TokenNameclass	
Descriptor	TokenNameIdentifier	 Descriptor
{	TokenNameLBRACE	
// versions are denoted as [major][minor]. Minor versions must be forward-compatible: 	TokenNameCOMMENT_LINE	versions are denoted as [major][minor]. Minor versions must be forward-compatible: 
// new fields are allowed in e.g. the metadata component, but fields can't be removed 	TokenNameCOMMENT_LINE	new fields are allowed in e.g. the metadata component, but fields can't be removed 
// or have their size changed. 	TokenNameCOMMENT_LINE	or have their size changed. 
// 	TokenNameCOMMENT_LINE	 
// Minor versions were introduced with version "hb" for Cassandra 1.0.3; prior to that, 	TokenNameCOMMENT_LINE	Minor versions were introduced with version "hb" for Cassandra 1.0.3; prior to that, 
// we always incremented the major version. In particular, versions g and h are 	TokenNameCOMMENT_LINE	we always incremented the major version. In particular, versions g and h are 
// forwards-compatible with version f, so if the above convention had been followed, 	TokenNameCOMMENT_LINE	forwards-compatible with version f, so if the above convention had been followed, 
// we would have labeled them fb and fc. 	TokenNameCOMMENT_LINE	we would have labeled them fb and fc. 
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
Version	TokenNameIdentifier	 Version
{	TokenNameLBRACE	
// This needs to be at the begining for initialization sake 	TokenNameCOMMENT_LINE	This needs to be at the begining for initialization sake 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
current_version	TokenNameIdentifier	 current version
=	TokenNameEQUAL	
"ia"	TokenNameStringLiteral	ia
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
Version	TokenNameIdentifier	 Version
LEGACY	TokenNameIdentifier	 LEGACY
=	TokenNameEQUAL	
new	TokenNamenew	
Version	TokenNameIdentifier	 Version
(	TokenNameLPAREN	
"a"	TokenNameStringLiteral	a
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// "pre-history" 	TokenNameCOMMENT_LINE	"pre-history" 
// b (0.7.0): added version to sstable filenames 	TokenNameCOMMENT_LINE	b (0.7.0): added version to sstable filenames 
// c (0.7.0): bloom filter component computes hashes over raw key bytes instead of strings 	TokenNameCOMMENT_LINE	c (0.7.0): bloom filter component computes hashes over raw key bytes instead of strings 
// d (0.7.0): row size in data component becomes a long instead of int 	TokenNameCOMMENT_LINE	d (0.7.0): row size in data component becomes a long instead of int 
// e (0.7.0): stores undecorated keys in data and index components 	TokenNameCOMMENT_LINE	e (0.7.0): stores undecorated keys in data and index components 
// f (0.7.0): switched bloom filter implementations in data component 	TokenNameCOMMENT_LINE	f (0.7.0): switched bloom filter implementations in data component 
// g (0.8): tracks flushed-at context in metadata component 	TokenNameCOMMENT_LINE	g (0.8): tracks flushed-at context in metadata component 
// h (1.0): tracks max client timestamp in metadata component 	TokenNameCOMMENT_LINE	h (1.0): tracks max client timestamp in metadata component 
// hb (1.0.3): records compression ration in metadata component 	TokenNameCOMMENT_LINE	hb (1.0.3): records compression ration in metadata component 
// hc (1.0.4): records partitioner in metadata component 	TokenNameCOMMENT_LINE	hc (1.0.4): records partitioner in metadata component 
// hd (1.0.10): includes row tombstones in maxtimestamp 	TokenNameCOMMENT_LINE	hd (1.0.10): includes row tombstones in maxtimestamp 
// he (1.1.3): includes ancestors generation in metadata component 	TokenNameCOMMENT_LINE	he (1.1.3): includes ancestors generation in metadata component 
// hf (1.1.6): marker that replay position corresponds to 1.1.5+ millis-based id (see CASSANDRA-4782) 	TokenNameCOMMENT_LINE	hf (1.1.6): marker that replay position corresponds to 1.1.5+ millis-based id (see CASSANDRA-4782) 
// ia (1.2.0): column indexes are promoted to the index file 	TokenNameCOMMENT_LINE	ia (1.2.0): column indexes are promoted to the index file 
// records estimated histogram of deletion times in tombstones 	TokenNameCOMMENT_LINE	records estimated histogram of deletion times in tombstones 
// bloom filter (keys and columns) upgraded to Murmur3 	TokenNameCOMMENT_LINE	bloom filter (keys and columns) upgraded to Murmur3 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
Version	TokenNameIdentifier	 Version
CURRENT	TokenNameIdentifier	 CURRENT
=	TokenNameEQUAL	
new	TokenNamenew	
Version	TokenNameIdentifier	 Version
(	TokenNameLPAREN	
current_version	TokenNameIdentifier	 current version
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
version	TokenNameIdentifier	 version
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
boolean	TokenNameboolean	
hasStringsInBloomFilter	TokenNameIdentifier	 has Strings In Bloom Filter
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
boolean	TokenNameboolean	
hasIntRowSize	TokenNameIdentifier	 has Int Row Size
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
boolean	TokenNameboolean	
hasEncodedKeys	TokenNameIdentifier	 has Encoded Keys
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
boolean	TokenNameboolean	
isLatestVersion	TokenNameIdentifier	 is Latest Version
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
boolean	TokenNameboolean	
metadataIncludesReplayPosition	TokenNameIdentifier	 metadata Includes Replay Position
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
boolean	TokenNameboolean	
metadataIncludesModernReplayPosition	TokenNameIdentifier	 metadata Includes Modern Replay Position
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
boolean	TokenNameboolean	
tracksMaxTimestamp	TokenNameIdentifier	 tracks Max Timestamp
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
boolean	TokenNameboolean	
hasCompressionRatio	TokenNameIdentifier	 has Compression Ratio
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
boolean	TokenNameboolean	
hasPartitioner	TokenNameIdentifier	 has Partitioner
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
boolean	TokenNameboolean	
tracksTombstones	TokenNameIdentifier	 tracks Tombstones
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
boolean	TokenNameboolean	
hasPromotedIndexes	TokenNameIdentifier	 has Promoted Indexes
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
FilterFactory	TokenNameIdentifier	 Filter Factory
.	TokenNameDOT	
Type	TokenNameIdentifier	 Type
filterType	TokenNameIdentifier	 filter Type
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
boolean	TokenNameboolean	
hasAncestors	TokenNameIdentifier	 has Ancestors
;	TokenNameSEMICOLON	
public	TokenNamepublic	
Version	TokenNameIdentifier	 Version
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
version	TokenNameIdentifier	 version
=	TokenNameEQUAL	
version	TokenNameIdentifier	 version
;	TokenNameSEMICOLON	
hasStringsInBloomFilter	TokenNameIdentifier	 has Strings In Bloom Filter
=	TokenNameEQUAL	
version	TokenNameIdentifier	 version
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
"c"	TokenNameStringLiteral	c
)	TokenNameRPAREN	
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
hasIntRowSize	TokenNameIdentifier	 has Int Row Size
=	TokenNameEQUAL	
version	TokenNameIdentifier	 version
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
"d"	TokenNameStringLiteral	d
)	TokenNameRPAREN	
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
hasEncodedKeys	TokenNameIdentifier	 has Encoded Keys
=	TokenNameEQUAL	
version	TokenNameIdentifier	 version
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
"e"	TokenNameStringLiteral	e
)	TokenNameRPAREN	
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
metadataIncludesReplayPosition	TokenNameIdentifier	 metadata Includes Replay Position
=	TokenNameEQUAL	
version	TokenNameIdentifier	 version
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
"g"	TokenNameStringLiteral	g
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
hasCompressionRatio	TokenNameIdentifier	 has Compression Ratio
=	TokenNameEQUAL	
version	TokenNameIdentifier	 version
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
"hb"	TokenNameStringLiteral	hb
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
hasPartitioner	TokenNameIdentifier	 has Partitioner
=	TokenNameEQUAL	
version	TokenNameIdentifier	 version
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
"hc"	TokenNameStringLiteral	hc
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
tracksMaxTimestamp	TokenNameIdentifier	 tracks Max Timestamp
=	TokenNameEQUAL	
version	TokenNameIdentifier	 version
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
"hd"	TokenNameStringLiteral	hd
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
hasAncestors	TokenNameIdentifier	 has Ancestors
=	TokenNameEQUAL	
version	TokenNameIdentifier	 version
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
"he"	TokenNameStringLiteral	he
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
metadataIncludesModernReplayPosition	TokenNameIdentifier	 metadata Includes Modern Replay Position
=	TokenNameEQUAL	
version	TokenNameIdentifier	 version
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
"hf"	TokenNameStringLiteral	hf
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
tracksTombstones	TokenNameIdentifier	 tracks Tombstones
=	TokenNameEQUAL	
version	TokenNameIdentifier	 version
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
"ia"	TokenNameStringLiteral	ia
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
hasPromotedIndexes	TokenNameIdentifier	 has Promoted Indexes
=	TokenNameEQUAL	
version	TokenNameIdentifier	 version
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
"ia"	TokenNameStringLiteral	ia
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
isLatestVersion	TokenNameIdentifier	 is Latest Version
=	TokenNameEQUAL	
version	TokenNameIdentifier	 version
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
current_version	TokenNameIdentifier	 current version
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
version	TokenNameIdentifier	 version
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
"f"	TokenNameStringLiteral	f
)	TokenNameRPAREN	
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
filterType	TokenNameIdentifier	 filter Type
=	TokenNameEQUAL	
FilterFactory	TokenNameIdentifier	 Filter Factory
.	TokenNameDOT	
Type	TokenNameIdentifier	 Type
.	TokenNameDOT	
SHA	TokenNameIdentifier	 SHA
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
version	TokenNameIdentifier	 version
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
"ia"	TokenNameStringLiteral	ia
)	TokenNameRPAREN	
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
filterType	TokenNameIdentifier	 filter Type
=	TokenNameEQUAL	
FilterFactory	TokenNameIdentifier	 Filter Factory
.	TokenNameDOT	
Type	TokenNameIdentifier	 Type
.	TokenNameDOT	
MURMUR2	TokenNameIdentifier	 MURMU R2
;	TokenNameSEMICOLON	
else	TokenNameelse	
filterType	TokenNameIdentifier	 filter Type
=	TokenNameEQUAL	
FilterFactory	TokenNameIdentifier	 Filter Factory
.	TokenNameDOT	
Type	TokenNameIdentifier	 Type
.	TokenNameDOT	
MURMUR3	TokenNameIdentifier	 MURMU R3
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @param ver SSTable version * @return True if the given version string matches the format. * @see #version */	TokenNameCOMMENT_JAVADOC	 @param ver SSTable version @return True if the given version string matches the format. @see #version 
static	TokenNamestatic	
boolean	TokenNameboolean	
validate	TokenNameIdentifier	 validate
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
ver	TokenNameIdentifier	 ver
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
ver	TokenNameIdentifier	 ver
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
ver	TokenNameIdentifier	 ver
.	TokenNameDOT	
matches	TokenNameIdentifier	 matches
(	TokenNameLPAREN	
"[a-z]+"	TokenNameStringLiteral	[a-z]+
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
isCompatible	TokenNameIdentifier	 is Compatible
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
version	TokenNameIdentifier	 version
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
<=	TokenNameLESS_EQUAL	
CURRENT	TokenNameIdentifier	 CURRENT
.	TokenNameDOT	
version	TokenNameIdentifier	 version
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
isStreamCompatible	TokenNameIdentifier	 is Stream Compatible
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// we could add compatibility for earlier versions with the new single-pass streaming 	TokenNameCOMMENT_LINE	we could add compatibility for earlier versions with the new single-pass streaming 
// (see SSTableWriter.appendFromStream) but versions earlier than 0.7.1 don't have the 	TokenNameCOMMENT_LINE	(see SSTableWriter.appendFromStream) but versions earlier than 0.7.1 don't have the 
// MessagingService version awareness anyway so there's no point. 	TokenNameCOMMENT_LINE	MessagingService version awareness anyway so there's no point. 
return	TokenNamereturn	
isCompatible	TokenNameIdentifier	 is Compatible
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
version	TokenNameIdentifier	 version
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
'i'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Versions [h..hc] contained a timestamp value that was computed incorrectly, ignoring row tombstones. * containsTimestamp returns true if there is a timestamp value in the metadata file; to know if it * actually contains a *correct* timestamp, see tracksMaxTimestamp. */	TokenNameCOMMENT_JAVADOC	 Versions [h..hc] contained a timestamp value that was computed incorrectly, ignoring row tombstones. containsTimestamp returns true if there is a timestamp value in the metadata file; to know if it actually contains a *correct* timestamp, see tracksMaxTimestamp. 
public	TokenNamepublic	
boolean	TokenNameboolean	
containsTimestamp	TokenNameIdentifier	 contains Timestamp
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
version	TokenNameIdentifier	 version
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
"h"	TokenNameStringLiteral	h
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
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
version	TokenNameIdentifier	 version
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
boolean	TokenNameboolean	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
==	TokenNameEQUAL_EQUAL	
this	TokenNamethis	
)	TokenNameRPAREN	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
instanceof	TokenNameinstanceof	
Version	TokenNameIdentifier	 Version
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
version	TokenNameIdentifier	 version
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Version	TokenNameIdentifier	 Version
)	TokenNameRPAREN	
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
.	TokenNameDOT	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
version	TokenNameIdentifier	 version
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
final	TokenNamefinal	
File	TokenNameIdentifier	 File
directory	TokenNameIdentifier	 directory
;	TokenNameSEMICOLON	
/** version has the following format: <code>[a-z]+</code> */	TokenNameCOMMENT_JAVADOC	 version has the following format: <code>[a-z]+</code> 
public	TokenNamepublic	
final	TokenNamefinal	
Version	TokenNameIdentifier	 Version
version	TokenNameIdentifier	 version
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ksname	TokenNameIdentifier	 ksname
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
cfname	TokenNameIdentifier	 cfname
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
int	TokenNameint	
generation	TokenNameIdentifier	 generation
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
boolean	TokenNameboolean	
temporary	TokenNameIdentifier	 temporary
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
int	TokenNameint	
hashCode	TokenNameIdentifier	 hash Code
;	TokenNameSEMICOLON	
/** * A descriptor that assumes CURRENT_VERSION. */	TokenNameCOMMENT_JAVADOC	 A descriptor that assumes CURRENT_VERSION. 
public	TokenNamepublic	
Descriptor	TokenNameIdentifier	 Descriptor
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
directory	TokenNameIdentifier	 directory
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
ksname	TokenNameIdentifier	 ksname
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
cfname	TokenNameIdentifier	 cfname
,	TokenNameCOMMA	
int	TokenNameint	
generation	TokenNameIdentifier	 generation
,	TokenNameCOMMA	
boolean	TokenNameboolean	
temp	TokenNameIdentifier	 temp
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
Version	TokenNameIdentifier	 Version
.	TokenNameDOT	
CURRENT	TokenNameIdentifier	 CURRENT
,	TokenNameCOMMA	
directory	TokenNameIdentifier	 directory
,	TokenNameCOMMA	
ksname	TokenNameIdentifier	 ksname
,	TokenNameCOMMA	
cfname	TokenNameIdentifier	 cfname
,	TokenNameCOMMA	
generation	TokenNameIdentifier	 generation
,	TokenNameCOMMA	
temp	TokenNameIdentifier	 temp
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Descriptor	TokenNameIdentifier	 Descriptor
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
version	TokenNameIdentifier	 version
,	TokenNameCOMMA	
File	TokenNameIdentifier	 File
directory	TokenNameIdentifier	 directory
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
ksname	TokenNameIdentifier	 ksname
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
cfname	TokenNameIdentifier	 cfname
,	TokenNameCOMMA	
int	TokenNameint	
generation	TokenNameIdentifier	 generation
,	TokenNameCOMMA	
boolean	TokenNameboolean	
temp	TokenNameIdentifier	 temp
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
new	TokenNamenew	
Version	TokenNameIdentifier	 Version
(	TokenNameLPAREN	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
,	TokenNameCOMMA	
directory	TokenNameIdentifier	 directory
,	TokenNameCOMMA	
ksname	TokenNameIdentifier	 ksname
,	TokenNameCOMMA	
cfname	TokenNameIdentifier	 cfname
,	TokenNameCOMMA	
generation	TokenNameIdentifier	 generation
,	TokenNameCOMMA	
temp	TokenNameIdentifier	 temp
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Descriptor	TokenNameIdentifier	 Descriptor
(	TokenNameLPAREN	
Version	TokenNameIdentifier	 Version
version	TokenNameIdentifier	 version
,	TokenNameCOMMA	
File	TokenNameIdentifier	 File
directory	TokenNameIdentifier	 directory
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
ksname	TokenNameIdentifier	 ksname
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
cfname	TokenNameIdentifier	 cfname
,	TokenNameCOMMA	
int	TokenNameint	
generation	TokenNameIdentifier	 generation
,	TokenNameCOMMA	
boolean	TokenNameboolean	
temp	TokenNameIdentifier	 temp
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assert	TokenNameassert	
version	TokenNameIdentifier	 version
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
directory	TokenNameIdentifier	 directory
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
ksname	TokenNameIdentifier	 ksname
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
cfname	TokenNameIdentifier	 cfname
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
version	TokenNameIdentifier	 version
=	TokenNameEQUAL	
version	TokenNameIdentifier	 version
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
directory	TokenNameIdentifier	 directory
=	TokenNameEQUAL	
directory	TokenNameIdentifier	 directory
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
ksname	TokenNameIdentifier	 ksname
=	TokenNameEQUAL	
ksname	TokenNameIdentifier	 ksname
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
cfname	TokenNameIdentifier	 cfname
=	TokenNameEQUAL	
cfname	TokenNameIdentifier	 cfname
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
generation	TokenNameIdentifier	 generation
=	TokenNameEQUAL	
generation	TokenNameIdentifier	 generation
;	TokenNameSEMICOLON	
temporary	TokenNameIdentifier	 temporary
=	TokenNameEQUAL	
temp	TokenNameIdentifier	 temp
;	TokenNameSEMICOLON	
hashCode	TokenNameIdentifier	 hash Code
=	TokenNameEQUAL	
Objects	TokenNameIdentifier	 Objects
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
directory	TokenNameIdentifier	 directory
,	TokenNameCOMMA	
generation	TokenNameIdentifier	 generation
,	TokenNameCOMMA	
ksname	TokenNameIdentifier	 ksname
,	TokenNameCOMMA	
cfname	TokenNameIdentifier	 cfname
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Descriptor	TokenNameIdentifier	 Descriptor
withGeneration	TokenNameIdentifier	 with Generation
(	TokenNameLPAREN	
int	TokenNameint	
newGeneration	TokenNameIdentifier	 new Generation
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
Descriptor	TokenNameIdentifier	 Descriptor
(	TokenNameLPAREN	
version	TokenNameIdentifier	 version
,	TokenNameCOMMA	
directory	TokenNameIdentifier	 directory
,	TokenNameCOMMA	
ksname	TokenNameIdentifier	 ksname
,	TokenNameCOMMA	
cfname	TokenNameIdentifier	 cfname
,	TokenNameCOMMA	
newGeneration	TokenNameIdentifier	 new Generation
,	TokenNameCOMMA	
temporary	TokenNameIdentifier	 temporary
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
filenameFor	TokenNameIdentifier	 filename For
(	TokenNameLPAREN	
Component	TokenNameIdentifier	 Component
component	TokenNameIdentifier	 component
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
filenameFor	TokenNameIdentifier	 filename For
(	TokenNameLPAREN	
component	TokenNameIdentifier	 component
.	TokenNameDOT	
name	TokenNameIdentifier	 name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
baseFilename	TokenNameIdentifier	 base Filename
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StringBuilder	TokenNameIdentifier	 String Builder
buff	TokenNameIdentifier	 buff
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuilder	TokenNameIdentifier	 String Builder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buff	TokenNameIdentifier	 buff
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
directory	TokenNameIdentifier	 directory
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
.	TokenNameDOT	
separatorChar	TokenNameIdentifier	 separator Char
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buff	TokenNameIdentifier	 buff
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
ksname	TokenNameIdentifier	 ksname
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
separator	TokenNameIdentifier	 separator
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buff	TokenNameIdentifier	 buff
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
cfname	TokenNameIdentifier	 cfname
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
separator	TokenNameIdentifier	 separator
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
temporary	TokenNameIdentifier	 temporary
)	TokenNameRPAREN	
buff	TokenNameIdentifier	 buff
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
SSTable	TokenNameIdentifier	 SS Table
.	TokenNameDOT	
TEMPFILE_MARKER	TokenNameIdentifier	 TEMPFILE  MARKER
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
separator	TokenNameIdentifier	 separator
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
Version	TokenNameIdentifier	 Version
.	TokenNameDOT	
LEGACY	TokenNameIdentifier	 LEGACY
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
)	TokenNameRPAREN	
buff	TokenNameIdentifier	 buff
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
separator	TokenNameIdentifier	 separator
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buff	TokenNameIdentifier	 buff
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
generation	TokenNameIdentifier	 generation
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
buff	TokenNameIdentifier	 buff
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @param suffix A component suffix, such as 'Data.db'/'Index.db'/etc * @return A filename for this descriptor with the given suffix. */	TokenNameCOMMENT_JAVADOC	 @param suffix A component suffix, such as 'Data.db'/'Index.db'/etc @return A filename for this descriptor with the given suffix. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
filenameFor	TokenNameIdentifier	 filename For
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
suffix	TokenNameIdentifier	 suffix
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
baseFilename	TokenNameIdentifier	 base Filename
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
separator	TokenNameIdentifier	 separator
+	TokenNamePLUS	
suffix	TokenNameIdentifier	 suffix
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see #fromFilename(File directory, String name) * @param filename The SSTable filename * @return Descriptor of the SSTable initialized from filename */	TokenNameCOMMENT_JAVADOC	 @see #fromFilename(File directory, String name) @param filename The SSTable filename @return Descriptor of the SSTable initialized from filename 
public	TokenNamepublic	
static	TokenNamestatic	
Descriptor	TokenNameIdentifier	 Descriptor
fromFilename	TokenNameIdentifier	 from Filename
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
filename	TokenNameIdentifier	 filename
)	TokenNameRPAREN	
{	TokenNameLBRACE	
File	TokenNameIdentifier	 File
file	TokenNameIdentifier	 file
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
filename	TokenNameIdentifier	 filename
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
fromFilename	TokenNameIdentifier	 from Filename
(	TokenNameLPAREN	
file	TokenNameIdentifier	 file
.	TokenNameDOT	
getParentFile	TokenNameIdentifier	 get Parent File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
file	TokenNameIdentifier	 file
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
left	TokenNameIdentifier	 left
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Filename of the form "<ksname>-<cfname>-[tmp-][<version>-]<gen>-<component>" * * @param directory The directory of the SSTable files * @param name The name of the SSTable file * * @return A Descriptor for the SSTable, and the Component remainder. */	TokenNameCOMMENT_JAVADOC	 Filename of the form "<ksname>-<cfname>-[tmp-][<version>-]<gen>-<component>" * @param directory The directory of the SSTable files @param name The name of the SSTable file * @return A Descriptor for the SSTable, and the Component remainder. 
public	TokenNamepublic	
static	TokenNamestatic	
Pair	TokenNameIdentifier	 Pair
<	TokenNameLESS	
Descriptor	TokenNameIdentifier	 Descriptor
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
fromFilename	TokenNameIdentifier	 from Filename
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
directory	TokenNameIdentifier	 directory
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// tokenize the filename 	TokenNameCOMMENT_LINE	tokenize the filename 
StringTokenizer	TokenNameIdentifier	 String Tokenizer
st	TokenNameIdentifier	 st
=	TokenNameEQUAL	
new	TokenNamenew	
StringTokenizer	TokenNameIdentifier	 String Tokenizer
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
separator	TokenNameIdentifier	 separator
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
nexttok	TokenNameIdentifier	 nexttok
;	TokenNameSEMICOLON	
// all filenames must start with keyspace and column family 	TokenNameCOMMENT_LINE	all filenames must start with keyspace and column family 
String	TokenNameIdentifier	 String
ksname	TokenNameIdentifier	 ksname
=	TokenNameEQUAL	
st	TokenNameIdentifier	 st
.	TokenNameDOT	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
cfname	TokenNameIdentifier	 cfname
=	TokenNameEQUAL	
st	TokenNameIdentifier	 st
.	TokenNameDOT	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// optional temporary marker 	TokenNameCOMMENT_LINE	optional temporary marker 
nexttok	TokenNameIdentifier	 nexttok
=	TokenNameEQUAL	
st	TokenNameIdentifier	 st
.	TokenNameDOT	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
temporary	TokenNameIdentifier	 temporary
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
nexttok	TokenNameIdentifier	 nexttok
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
SSTable	TokenNameIdentifier	 SS Table
.	TokenNameDOT	
TEMPFILE_MARKER	TokenNameIdentifier	 TEMPFILE  MARKER
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
temporary	TokenNameIdentifier	 temporary
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
nexttok	TokenNameIdentifier	 nexttok
=	TokenNameEQUAL	
st	TokenNameIdentifier	 st
.	TokenNameDOT	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// optional version string 	TokenNameCOMMENT_LINE	optional version string 
Version	TokenNameIdentifier	 Version
version	TokenNameIdentifier	 version
=	TokenNameEQUAL	
Version	TokenNameIdentifier	 Version
.	TokenNameDOT	
LEGACY	TokenNameIdentifier	 LEGACY
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
Version	TokenNameIdentifier	 Version
.	TokenNameDOT	
validate	TokenNameIdentifier	 validate
(	TokenNameLPAREN	
nexttok	TokenNameIdentifier	 nexttok
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
version	TokenNameIdentifier	 version
=	TokenNameEQUAL	
new	TokenNamenew	
Version	TokenNameIdentifier	 Version
(	TokenNameLPAREN	
nexttok	TokenNameIdentifier	 nexttok
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
nexttok	TokenNameIdentifier	 nexttok
=	TokenNameEQUAL	
st	TokenNameIdentifier	 st
.	TokenNameDOT	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
generation	TokenNameIdentifier	 generation
=	TokenNameEQUAL	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
parseInt	TokenNameIdentifier	 parse Int
(	TokenNameLPAREN	
nexttok	TokenNameIdentifier	 nexttok
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// component suffix 	TokenNameCOMMENT_LINE	component suffix 
String	TokenNameIdentifier	 String
component	TokenNameIdentifier	 component
=	TokenNameEQUAL	
st	TokenNameIdentifier	 st
.	TokenNameDOT	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
directory	TokenNameIdentifier	 directory
=	TokenNameEQUAL	
directory	TokenNameIdentifier	 directory
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
directory	TokenNameIdentifier	 directory
:	TokenNameCOLON	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
"."	TokenNameStringLiteral	.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
Pair	TokenNameIdentifier	 Pair
.	TokenNameDOT	
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
new	TokenNamenew	
Descriptor	TokenNameIdentifier	 Descriptor
(	TokenNameLPAREN	
version	TokenNameIdentifier	 version
,	TokenNameCOMMA	
directory	TokenNameIdentifier	 directory
,	TokenNameCOMMA	
ksname	TokenNameIdentifier	 ksname
,	TokenNameCOMMA	
cfname	TokenNameIdentifier	 cfname
,	TokenNameCOMMA	
generation	TokenNameIdentifier	 generation
,	TokenNameCOMMA	
temporary	TokenNameIdentifier	 temporary
)	TokenNameRPAREN	
,	TokenNameCOMMA	
component	TokenNameIdentifier	 component
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @param temporary temporary flag * @return A clone of this descriptor with the given 'temporary' status. */	TokenNameCOMMENT_JAVADOC	 @param temporary temporary flag @return A clone of this descriptor with the given 'temporary' status. 
public	TokenNamepublic	
Descriptor	TokenNameIdentifier	 Descriptor
asTemporary	TokenNameIdentifier	 as Temporary
(	TokenNameLPAREN	
boolean	TokenNameboolean	
temporary	TokenNameIdentifier	 temporary
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
Descriptor	TokenNameIdentifier	 Descriptor
(	TokenNameLPAREN	
version	TokenNameIdentifier	 version
,	TokenNameCOMMA	
directory	TokenNameIdentifier	 directory
,	TokenNameCOMMA	
ksname	TokenNameIdentifier	 ksname
,	TokenNameCOMMA	
cfname	TokenNameIdentifier	 cfname
,	TokenNameCOMMA	
generation	TokenNameIdentifier	 generation
,	TokenNameCOMMA	
temporary	TokenNameIdentifier	 temporary
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return true if the current Cassandra version can read the given sstable version */	TokenNameCOMMENT_JAVADOC	 @return true if the current Cassandra version can read the given sstable version 
public	TokenNamepublic	
boolean	TokenNameboolean	
isCompatible	TokenNameIdentifier	 is Compatible
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
version	TokenNameIdentifier	 version
.	TokenNameDOT	
isCompatible	TokenNameIdentifier	 is Compatible
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return true if the current Cassandra version can stream the given sstable version * from another node. This is stricter than opening it locally [isCompatible] because * streaming needs to rebuild all the non-data components, and it only knows how to write * the latest version. */	TokenNameCOMMENT_JAVADOC	 @return true if the current Cassandra version can stream the given sstable version from another node. This is stricter than opening it locally [isCompatible] because streaming needs to rebuild all the non-data components, and it only knows how to write the latest version. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isStreamCompatible	TokenNameIdentifier	 is Stream Compatible
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
version	TokenNameIdentifier	 version
.	TokenNameDOT	
isStreamCompatible	TokenNameIdentifier	 is Stream Compatible
(	TokenNameLPAREN	
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
baseFilename	TokenNameIdentifier	 base Filename
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
boolean	TokenNameboolean	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
==	TokenNameEQUAL_EQUAL	
this	TokenNamethis	
)	TokenNameRPAREN	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
instanceof	TokenNameinstanceof	
Descriptor	TokenNameIdentifier	 Descriptor
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
Descriptor	TokenNameIdentifier	 Descriptor
that	TokenNameIdentifier	 that
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Descriptor	TokenNameIdentifier	 Descriptor
)	TokenNameRPAREN	
o	TokenNameIdentifier	 o
;	TokenNameSEMICOLON	
return	TokenNamereturn	
that	TokenNameIdentifier	 that
.	TokenNameDOT	
directory	TokenNameIdentifier	 directory
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
directory	TokenNameIdentifier	 directory
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
that	TokenNameIdentifier	 that
.	TokenNameDOT	
generation	TokenNameIdentifier	 generation
==	TokenNameEQUAL_EQUAL	
this	TokenNamethis	
.	TokenNameDOT	
generation	TokenNameIdentifier	 generation
&&	TokenNameAND_AND	
that	TokenNameIdentifier	 that
.	TokenNameDOT	
ksname	TokenNameIdentifier	 ksname
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
ksname	TokenNameIdentifier	 ksname
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
that	TokenNameIdentifier	 that
.	TokenNameDOT	
cfname	TokenNameIdentifier	 cfname
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
cfname	TokenNameIdentifier	 cfname
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
hashCode	TokenNameIdentifier	 hash Code
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
