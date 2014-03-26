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
EnumSet	TokenNameIdentifier	 Enum Set
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
Pair	TokenNameIdentifier	 Pair
;	TokenNameSEMICOLON	
/** * SSTables are made up of multiple components in separate files. Components are * identified by a type and an id, but required unique components (such as the Data * and Index files) may have implicit ids assigned to them. */	TokenNameCOMMENT_JAVADOC	 SSTables are made up of multiple components in separate files. Components are identified by a type and an id, but required unique components (such as the Data and Index files) may have implicit ids assigned to them. 
public	TokenNamepublic	
class	TokenNameclass	
Component	TokenNameIdentifier	 Component
{	TokenNameLBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
char	TokenNamechar	
separator	TokenNameIdentifier	 separator
=	TokenNameEQUAL	
'-'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
static	TokenNamestatic	
EnumSet	TokenNameIdentifier	 Enum Set
<	TokenNameLESS	
Type	TokenNameIdentifier	 Type
>	TokenNameGREATER	
TYPES	TokenNameIdentifier	 TYPES
=	TokenNameEQUAL	
EnumSet	TokenNameIdentifier	 Enum Set
.	TokenNameDOT	
allOf	TokenNameIdentifier	 all Of
(	TokenNameLPAREN	
Type	TokenNameIdentifier	 Type
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
enum	TokenNameenum	
Type	TokenNameIdentifier	 Type
{	TokenNameLBRACE	
// the base data for an sstable: the remaining components can be regenerated 	TokenNameCOMMENT_LINE	the base data for an sstable: the remaining components can be regenerated 
// based on the data component 	TokenNameCOMMENT_LINE	based on the data component 
DATA	TokenNameIdentifier	 DATA
(	TokenNameLPAREN	
"Data.db"	TokenNameStringLiteral	Data.db
)	TokenNameRPAREN	
,	TokenNameCOMMA	
// index of the row keys with pointers to their positions in the data file 	TokenNameCOMMENT_LINE	index of the row keys with pointers to their positions in the data file 
PRIMARY_INDEX	TokenNameIdentifier	 PRIMARY  INDEX
(	TokenNameLPAREN	
"Index.db"	TokenNameStringLiteral	Index.db
)	TokenNameRPAREN	
,	TokenNameCOMMA	
// serialized bloom filter for the row keys in the sstable 	TokenNameCOMMENT_LINE	serialized bloom filter for the row keys in the sstable 
FILTER	TokenNameIdentifier	 FILTER
(	TokenNameLPAREN	
"Filter.db"	TokenNameStringLiteral	Filter.db
)	TokenNameRPAREN	
,	TokenNameCOMMA	
// 0-length file that is created when an sstable is ready to be deleted 	TokenNameCOMMENT_LINE	0-length file that is created when an sstable is ready to be deleted 
// @deprecated: deletion of compacted file is based on the lineag information stored in the compacted sstabl 	TokenNameCOMMENT_LINE	@deprecated: deletion of compacted file is based on the lineag information stored in the compacted sstabl 
// metadata. This ensure we can guarantee never using a sstable and some of its parents, even in case of failure. 	TokenNameCOMMENT_LINE	metadata. This ensure we can guarantee never using a sstable and some of its parents, even in case of failure. 
COMPACTED_MARKER	TokenNameIdentifier	 COMPACTED  MARKER
(	TokenNameLPAREN	
"Compacted"	TokenNameStringLiteral	Compacted
)	TokenNameRPAREN	
,	TokenNameCOMMA	
// file to hold information about uncompressed data length, chunk offsets etc. 	TokenNameCOMMENT_LINE	file to hold information about uncompressed data length, chunk offsets etc. 
COMPRESSION_INFO	TokenNameIdentifier	 COMPRESSION  INFO
(	TokenNameLPAREN	
"CompressionInfo.db"	TokenNameStringLiteral	CompressionInfo.db
)	TokenNameRPAREN	
,	TokenNameCOMMA	
// statistical metadata about the content of the sstable 	TokenNameCOMMENT_LINE	statistical metadata about the content of the sstable 
STATS	TokenNameIdentifier	 STATS
(	TokenNameLPAREN	
"Statistics.db"	TokenNameStringLiteral	Statistics.db
)	TokenNameRPAREN	
,	TokenNameCOMMA	
// holds sha1 sum of the data file (to be checked by sha1sum) 	TokenNameCOMMENT_LINE	holds sha1 sum of the data file (to be checked by sha1sum) 
DIGEST	TokenNameIdentifier	 DIGEST
(	TokenNameLPAREN	
"Digest.sha1"	TokenNameStringLiteral	Digest.sha1
)	TokenNameRPAREN	
,	TokenNameCOMMA	
// holds SSTable Index Summary and Boundaries 	TokenNameCOMMENT_LINE	holds SSTable Index Summary and Boundaries 
SUMMARY	TokenNameIdentifier	 SUMMARY
(	TokenNameLPAREN	
"Summary.db"	TokenNameStringLiteral	Summary.db
)	TokenNameRPAREN	
,	TokenNameCOMMA	
// table of contents, stores the list of all components for the sstable 	TokenNameCOMMENT_LINE	table of contents, stores the list of all components for the sstable 
TOC	TokenNameIdentifier	 TOC
(	TokenNameLPAREN	
"TOC.txt"	TokenNameStringLiteral	TOC.txt
)	TokenNameRPAREN	
,	TokenNameCOMMA	
// custom component, used by e.g. custom compaction strategy 	TokenNameCOMMENT_LINE	custom component, used by e.g. custom compaction strategy 
CUSTOM	TokenNameIdentifier	 CUSTOM
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
repr	TokenNameIdentifier	 repr
;	TokenNameSEMICOLON	
Type	TokenNameIdentifier	 Type
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
repr	TokenNameIdentifier	 repr
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
repr	TokenNameIdentifier	 repr
=	TokenNameEQUAL	
repr	TokenNameIdentifier	 repr
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
static	TokenNamestatic	
Type	TokenNameIdentifier	 Type
fromRepresentation	TokenNameIdentifier	 from Representation
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
repr	TokenNameIdentifier	 repr
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
Type	TokenNameIdentifier	 Type
type	TokenNameIdentifier	 type
:	TokenNameCOLON	
TYPES	TokenNameIdentifier	 TYPES
)	TokenNameRPAREN	
if	TokenNameif	
(	TokenNameLPAREN	
repr	TokenNameIdentifier	 repr
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
.	TokenNameDOT	
repr	TokenNameIdentifier	 repr
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
return	TokenNamereturn	
CUSTOM	TokenNameIdentifier	 CUSTOM
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// singleton components for types that don't need ids 	TokenNameCOMMENT_LINE	singleton components for types that don't need ids 
public	TokenNamepublic	
final	TokenNamefinal	
static	TokenNamestatic	
Component	TokenNameIdentifier	 Component
DATA	TokenNameIdentifier	 DATA
=	TokenNameEQUAL	
new	TokenNamenew	
Component	TokenNameIdentifier	 Component
(	TokenNameLPAREN	
Type	TokenNameIdentifier	 Type
.	TokenNameDOT	
DATA	TokenNameIdentifier	 DATA
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
static	TokenNamestatic	
Component	TokenNameIdentifier	 Component
PRIMARY_INDEX	TokenNameIdentifier	 PRIMARY  INDEX
=	TokenNameEQUAL	
new	TokenNamenew	
Component	TokenNameIdentifier	 Component
(	TokenNameLPAREN	
Type	TokenNameIdentifier	 Type
.	TokenNameDOT	
PRIMARY_INDEX	TokenNameIdentifier	 PRIMARY  INDEX
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
static	TokenNamestatic	
Component	TokenNameIdentifier	 Component
FILTER	TokenNameIdentifier	 FILTER
=	TokenNameEQUAL	
new	TokenNamenew	
Component	TokenNameIdentifier	 Component
(	TokenNameLPAREN	
Type	TokenNameIdentifier	 Type
.	TokenNameDOT	
FILTER	TokenNameIdentifier	 FILTER
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
static	TokenNamestatic	
Component	TokenNameIdentifier	 Component
COMPACTED_MARKER	TokenNameIdentifier	 COMPACTED  MARKER
=	TokenNameEQUAL	
new	TokenNamenew	
Component	TokenNameIdentifier	 Component
(	TokenNameLPAREN	
Type	TokenNameIdentifier	 Type
.	TokenNameDOT	
COMPACTED_MARKER	TokenNameIdentifier	 COMPACTED  MARKER
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
static	TokenNamestatic	
Component	TokenNameIdentifier	 Component
COMPRESSION_INFO	TokenNameIdentifier	 COMPRESSION  INFO
=	TokenNameEQUAL	
new	TokenNamenew	
Component	TokenNameIdentifier	 Component
(	TokenNameLPAREN	
Type	TokenNameIdentifier	 Type
.	TokenNameDOT	
COMPRESSION_INFO	TokenNameIdentifier	 COMPRESSION  INFO
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
static	TokenNamestatic	
Component	TokenNameIdentifier	 Component
STATS	TokenNameIdentifier	 STATS
=	TokenNameEQUAL	
new	TokenNamenew	
Component	TokenNameIdentifier	 Component
(	TokenNameLPAREN	
Type	TokenNameIdentifier	 Type
.	TokenNameDOT	
STATS	TokenNameIdentifier	 STATS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
static	TokenNamestatic	
Component	TokenNameIdentifier	 Component
DIGEST	TokenNameIdentifier	 DIGEST
=	TokenNameEQUAL	
new	TokenNamenew	
Component	TokenNameIdentifier	 Component
(	TokenNameLPAREN	
Type	TokenNameIdentifier	 Type
.	TokenNameDOT	
DIGEST	TokenNameIdentifier	 DIGEST
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
static	TokenNamestatic	
Component	TokenNameIdentifier	 Component
SUMMARY	TokenNameIdentifier	 SUMMARY
=	TokenNameEQUAL	
new	TokenNamenew	
Component	TokenNameIdentifier	 Component
(	TokenNameLPAREN	
Type	TokenNameIdentifier	 Type
.	TokenNameDOT	
SUMMARY	TokenNameIdentifier	 SUMMARY
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
static	TokenNamestatic	
Component	TokenNameIdentifier	 Component
TOC	TokenNameIdentifier	 TOC
=	TokenNameEQUAL	
new	TokenNamenew	
Component	TokenNameIdentifier	 Component
(	TokenNameLPAREN	
Type	TokenNameIdentifier	 Type
.	TokenNameDOT	
TOC	TokenNameIdentifier	 TOC
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
Type	TokenNameIdentifier	 Type
type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
int	TokenNameint	
hashCode	TokenNameIdentifier	 hash Code
;	TokenNameSEMICOLON	
public	TokenNamepublic	
Component	TokenNameIdentifier	 Component
(	TokenNameLPAREN	
Type	TokenNameIdentifier	 Type
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
type	TokenNameIdentifier	 type
.	TokenNameDOT	
repr	TokenNameIdentifier	 repr
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
type	TokenNameIdentifier	 type
!=	TokenNameNOT_EQUAL	
Type	TokenNameIdentifier	 Type
.	TokenNameDOT	
CUSTOM	TokenNameIdentifier	 CUSTOM
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Component	TokenNameIdentifier	 Component
(	TokenNameLPAREN	
Type	TokenNameIdentifier	 Type
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assert	TokenNameassert	
name	TokenNameIdentifier	 name
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
:	TokenNameCOLON	
"Component name cannot be null"	TokenNameStringLiteral	Component name cannot be null
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
=	TokenNameEQUAL	
Objects	TokenNameIdentifier	 Objects
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return The unique (within an sstable) name for this component. */	TokenNameCOMMENT_JAVADOC	 @return The unique (within an sstable) name for this component. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Filename of the form "<ksname>/<cfname>-[tmp-][<version>-]<gen>-<component>", * @return A Descriptor for the SSTable, and a Component for this particular file. * TODO move descriptor into Component field */	TokenNameCOMMENT_JAVADOC	 Filename of the form "<ksname>/<cfname>-[tmp-][<version>-]<gen>-<component>", @return A Descriptor for the SSTable, and a Component for this particular file. TODO move descriptor into Component field 
public	TokenNamepublic	
static	TokenNamestatic	
Pair	TokenNameIdentifier	 Pair
<	TokenNameLESS	
Descriptor	TokenNameIdentifier	 Descriptor
,	TokenNameCOMMA	
Component	TokenNameIdentifier	 Component
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
Pair	TokenNameIdentifier	 Pair
<	TokenNameLESS	
Descriptor	TokenNameIdentifier	 Descriptor
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
path	TokenNameIdentifier	 path
=	TokenNameEQUAL	
Descriptor	TokenNameIdentifier	 Descriptor
.	TokenNameDOT	
fromFilename	TokenNameIdentifier	 from Filename
(	TokenNameLPAREN	
directory	TokenNameIdentifier	 directory
,	TokenNameCOMMA	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// parse the component suffix 	TokenNameCOMMENT_LINE	parse the component suffix 
Type	TokenNameIdentifier	 Type
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
Type	TokenNameIdentifier	 Type
.	TokenNameDOT	
fromRepresentation	TokenNameIdentifier	 from Representation
(	TokenNameLPAREN	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
right	TokenNameIdentifier	 right
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// build (or retrieve singleton for) the component object 	TokenNameCOMMENT_LINE	build (or retrieve singleton for) the component object 
Component	TokenNameIdentifier	 Component
component	TokenNameIdentifier	 component
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
DATA	TokenNameIdentifier	 DATA
:	TokenNameCOLON	
component	TokenNameIdentifier	 component
=	TokenNameEQUAL	
Component	TokenNameIdentifier	 Component
.	TokenNameDOT	
DATA	TokenNameIdentifier	 DATA
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
PRIMARY_INDEX	TokenNameIdentifier	 PRIMARY  INDEX
:	TokenNameCOLON	
component	TokenNameIdentifier	 component
=	TokenNameEQUAL	
Component	TokenNameIdentifier	 Component
.	TokenNameDOT	
PRIMARY_INDEX	TokenNameIdentifier	 PRIMARY  INDEX
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
FILTER	TokenNameIdentifier	 FILTER
:	TokenNameCOLON	
component	TokenNameIdentifier	 component
=	TokenNameEQUAL	
Component	TokenNameIdentifier	 Component
.	TokenNameDOT	
FILTER	TokenNameIdentifier	 FILTER
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
COMPACTED_MARKER	TokenNameIdentifier	 COMPACTED  MARKER
:	TokenNameCOLON	
component	TokenNameIdentifier	 component
=	TokenNameEQUAL	
Component	TokenNameIdentifier	 Component
.	TokenNameDOT	
COMPACTED_MARKER	TokenNameIdentifier	 COMPACTED  MARKER
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
COMPRESSION_INFO	TokenNameIdentifier	 COMPRESSION  INFO
:	TokenNameCOLON	
component	TokenNameIdentifier	 component
=	TokenNameEQUAL	
Component	TokenNameIdentifier	 Component
.	TokenNameDOT	
COMPRESSION_INFO	TokenNameIdentifier	 COMPRESSION  INFO
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
STATS	TokenNameIdentifier	 STATS
:	TokenNameCOLON	
component	TokenNameIdentifier	 component
=	TokenNameEQUAL	
Component	TokenNameIdentifier	 Component
.	TokenNameDOT	
STATS	TokenNameIdentifier	 STATS
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
DIGEST	TokenNameIdentifier	 DIGEST
:	TokenNameCOLON	
component	TokenNameIdentifier	 component
=	TokenNameEQUAL	
Component	TokenNameIdentifier	 Component
.	TokenNameDOT	
DIGEST	TokenNameIdentifier	 DIGEST
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
SUMMARY	TokenNameIdentifier	 SUMMARY
:	TokenNameCOLON	
component	TokenNameIdentifier	 component
=	TokenNameEQUAL	
Component	TokenNameIdentifier	 Component
.	TokenNameDOT	
SUMMARY	TokenNameIdentifier	 SUMMARY
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
TOC	TokenNameIdentifier	 TOC
:	TokenNameCOLON	
component	TokenNameIdentifier	 component
=	TokenNameEQUAL	
Component	TokenNameIdentifier	 Component
.	TokenNameDOT	
TOC	TokenNameIdentifier	 TOC
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
CUSTOM	TokenNameIdentifier	 CUSTOM
:	TokenNameCOLON	
component	TokenNameIdentifier	 component
=	TokenNameEQUAL	
new	TokenNamenew	
Component	TokenNameIdentifier	 Component
(	TokenNameLPAREN	
Type	TokenNameIdentifier	 Type
.	TokenNameDOT	
CUSTOM	TokenNameIdentifier	 CUSTOM
,	TokenNameCOMMA	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
right	TokenNameIdentifier	 right
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalStateException	TokenNameIdentifier	 Illegal State Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
Pair	TokenNameIdentifier	 Pair
.	TokenNameDOT	
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
left	TokenNameIdentifier	 left
,	TokenNameCOMMA	
component	TokenNameIdentifier	 component
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
this	TokenNamethis	
.	TokenNameDOT	
name	TokenNameIdentifier	 name
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
Component	TokenNameIdentifier	 Component
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
Component	TokenNameIdentifier	 Component
that	TokenNameIdentifier	 that
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Component	TokenNameIdentifier	 Component
)	TokenNameRPAREN	
o	TokenNameIdentifier	 o
;	TokenNameSEMICOLON	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
that	TokenNameIdentifier	 that
.	TokenNameDOT	
type	TokenNameIdentifier	 type
&&	TokenNameAND_AND	
this	TokenNamethis	
.	TokenNameDOT	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
that	TokenNameIdentifier	 that
.	TokenNameDOT	
name	TokenNameIdentifier	 name
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
