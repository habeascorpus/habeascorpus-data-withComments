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
util	TokenNameIdentifier	 util
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
DataInput	TokenNameIdentifier	 Data Input
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
DataOutput	TokenNameIdentifier	 Data Output
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
nio	TokenNameIdentifier	 nio
.	TokenNameDOT	
MappedByteBuffer	TokenNameIdentifier	 Mapped Byte Buffer
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Iterator	TokenNameIdentifier	 Iterator
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
NoSuchElementException	TokenNameIdentifier	 No Such Element Exception
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
Config	TokenNameIdentifier	 Config
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
DatabaseDescriptor	TokenNameIdentifier	 Database Descriptor
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
FSReadError	TokenNameIdentifier	 FS Read Error
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
/** * Abstracts a read-only file that has been split into segments, each of which can be represented by an independent * FileDataInput. Allows for iteration over the FileDataInputs, or random access to the FileDataInput for a given * position. * * The JVM can only map up to 2GB at a time, so each segment is at most that size when using mmap i/o. If a segment * would need to be longer than 2GB, that segment will not be mmap'd, and a new RandomAccessFile will be created for * each access to that segment. */	TokenNameCOMMENT_JAVADOC	 Abstracts a read-only file that has been split into segments, each of which can be represented by an independent FileDataInput. Allows for iteration over the FileDataInputs, or random access to the FileDataInput for a given position. * The JVM can only map up to 2GB at a time, so each segment is at most that size when using mmap i/o. If a segment would need to be longer than 2GB, that segment will not be mmap'd, and a new RandomAccessFile will be created for each access to that segment. 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
SegmentedFile	TokenNameIdentifier	 Segmented File
{	TokenNameLBRACE	
public	TokenNamepublic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
path	TokenNameIdentifier	 path
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
long	TokenNamelong	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
// This differs from length for compressed files (but we still need length for 	TokenNameCOMMENT_LINE	This differs from length for compressed files (but we still need length for 
// SegmentIterator because offsets in the file are relative to the uncompressed size) 	TokenNameCOMMENT_LINE	SegmentIterator because offsets in the file are relative to the uncompressed size) 
public	TokenNamepublic	
final	TokenNamefinal	
long	TokenNamelong	
onDiskLength	TokenNameIdentifier	 on Disk Length
;	TokenNameSEMICOLON	
/** * Use getBuilder to get a Builder to construct a SegmentedFile. */	TokenNameCOMMENT_JAVADOC	 Use getBuilder to get a Builder to construct a SegmentedFile. 
SegmentedFile	TokenNameIdentifier	 Segmented File
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
path	TokenNameIdentifier	 path
,	TokenNameCOMMA	
long	TokenNamelong	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
path	TokenNameIdentifier	 path
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
SegmentedFile	TokenNameIdentifier	 Segmented File
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
path	TokenNameIdentifier	 path
,	TokenNameCOMMA	
long	TokenNamelong	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
long	TokenNamelong	
onDiskLength	TokenNameIdentifier	 on Disk Length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
path	TokenNameIdentifier	 path
=	TokenNameEQUAL	
path	TokenNameIdentifier	 path
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
onDiskLength	TokenNameIdentifier	 on Disk Length
=	TokenNameEQUAL	
onDiskLength	TokenNameIdentifier	 on Disk Length
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return A SegmentedFile.Builder. */	TokenNameCOMMENT_JAVADOC	 @return A SegmentedFile.Builder. 
public	TokenNamepublic	
static	TokenNamestatic	
Builder	TokenNameIdentifier	 Builder
getBuilder	TokenNameIdentifier	 get Builder
(	TokenNameLPAREN	
Config	TokenNameIdentifier	 Config
.	TokenNameDOT	
DiskAccessMode	TokenNameIdentifier	 Disk Access Mode
mode	TokenNameIdentifier	 mode
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
mode	TokenNameIdentifier	 mode
==	TokenNameEQUAL_EQUAL	
Config	TokenNameIdentifier	 Config
.	TokenNameDOT	
DiskAccessMode	TokenNameIdentifier	 Disk Access Mode
.	TokenNameDOT	
mmap	TokenNameIdentifier	 mmap
?	TokenNameQUESTION	
new	TokenNamenew	
MmappedSegmentedFile	TokenNameIdentifier	 Mmapped Segmented File
.	TokenNameDOT	
Builder	TokenNameIdentifier	 Builder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
new	TokenNamenew	
BufferedSegmentedFile	TokenNameIdentifier	 Buffered Segmented File
.	TokenNameDOT	
Builder	TokenNameIdentifier	 Builder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
Builder	TokenNameIdentifier	 Builder
getCompressedBuilder	TokenNameIdentifier	 get Compressed Builder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
CompressedSegmentedFile	TokenNameIdentifier	 Compressed Segmented File
.	TokenNameDOT	
Builder	TokenNameIdentifier	 Builder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
abstract	TokenNameabstract	
FileDataInput	TokenNameIdentifier	 File Data Input
getSegment	TokenNameIdentifier	 get Segment
(	TokenNameLPAREN	
long	TokenNamelong	
position	TokenNameIdentifier	 position
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * @return An Iterator over segments, beginning with the segment containing the given position: each segment must be closed after use. */	TokenNameCOMMENT_JAVADOC	 @return An Iterator over segments, beginning with the segment containing the given position: each segment must be closed after use. 
public	TokenNamepublic	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
FileDataInput	TokenNameIdentifier	 File Data Input
>	TokenNameGREATER	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
long	TokenNamelong	
position	TokenNameIdentifier	 position
,	TokenNameCOMMA	
int	TokenNameint	
bufferSize	TokenNameIdentifier	 buffer Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
SegmentIterator	TokenNameIdentifier	 Segment Iterator
(	TokenNameLPAREN	
position	TokenNameIdentifier	 position
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Do whatever action is needed to reclaim ressources used by this SegmentedFile. */	TokenNameCOMMENT_JAVADOC	 Do whatever action is needed to reclaim ressources used by this SegmentedFile. 
public	TokenNamepublic	
abstract	TokenNameabstract	
void	TokenNamevoid	
cleanup	TokenNameIdentifier	 cleanup
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Collects potential segmentation points in an underlying file, and builds a SegmentedFile to represent it. */	TokenNameCOMMENT_JAVADOC	 Collects potential segmentation points in an underlying file, and builds a SegmentedFile to represent it. 
public	TokenNamepublic	
static	TokenNamestatic	
abstract	TokenNameabstract	
class	TokenNameclass	
Builder	TokenNameIdentifier	 Builder
{	TokenNameLBRACE	
/** * Adds a position that would be a safe place for a segment boundary in the file. For a block/row based file * format, safe boundaries are block/row edges. * @param boundary The absolute position of the potential boundary in the file. */	TokenNameCOMMENT_JAVADOC	 Adds a position that would be a safe place for a segment boundary in the file. For a block/row based file format, safe boundaries are block/row edges. @param boundary The absolute position of the potential boundary in the file. 
public	TokenNamepublic	
abstract	TokenNameabstract	
void	TokenNamevoid	
addPotentialBoundary	TokenNameIdentifier	 add Potential Boundary
(	TokenNameLPAREN	
long	TokenNamelong	
boundary	TokenNameIdentifier	 boundary
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Called after all potential boundaries have been added to apply this Builder to a concrete file on disk. * @param path The file on disk. */	TokenNameCOMMENT_JAVADOC	 Called after all potential boundaries have been added to apply this Builder to a concrete file on disk. @param path The file on disk. 
public	TokenNamepublic	
abstract	TokenNameabstract	
SegmentedFile	TokenNameIdentifier	 Segmented File
complete	TokenNameIdentifier	 complete
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
path	TokenNameIdentifier	 path
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
void	TokenNamevoid	
serializeBounds	TokenNameIdentifier	 serialize Bounds
(	TokenNameLPAREN	
DataOutput	TokenNameIdentifier	 Data Output
dos	TokenNameIdentifier	 dos
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
dos	TokenNameIdentifier	 dos
.	TokenNameDOT	
writeUTF	TokenNameIdentifier	 write UTF
(	TokenNameLPAREN	
DatabaseDescriptor	TokenNameIdentifier	 Database Descriptor
.	TokenNameDOT	
getDiskAccessMode	TokenNameIdentifier	 get Disk Access Mode
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
name	TokenNameIdentifier	 name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
deserializeBounds	TokenNameIdentifier	 deserialize Bounds
(	TokenNameLPAREN	
DataInput	TokenNameIdentifier	 Data Input
dis	TokenNameIdentifier	 dis
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
dis	TokenNameIdentifier	 dis
.	TokenNameDOT	
readUTF	TokenNameIdentifier	 read UTF
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
DatabaseDescriptor	TokenNameIdentifier	 Database Descriptor
.	TokenNameDOT	
getDiskAccessMode	TokenNameIdentifier	 get Disk Access Mode
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
name	TokenNameIdentifier	 name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IOException	TokenNameIdentifier	 IO Exception
(	TokenNameLPAREN	
"Cannot deserialize SSTable Summary component because the DiskAccessMode was changed!"	TokenNameStringLiteral	Cannot deserialize SSTable Summary component because the DiskAccessMode was changed!
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
class	TokenNameclass	
Segment	TokenNameIdentifier	 Segment
extends	TokenNameextends	
Pair	TokenNameIdentifier	 Pair
<	TokenNameLESS	
Long	TokenNameIdentifier	 Long
,	TokenNameCOMMA	
MappedByteBuffer	TokenNameIdentifier	 Mapped Byte Buffer
>	TokenNameGREATER	
implements	TokenNameimplements	
Comparable	TokenNameIdentifier	 Comparable
<	TokenNameLESS	
Segment	TokenNameIdentifier	 Segment
>	TokenNameGREATER	
{	TokenNameLBRACE	
public	TokenNamepublic	
Segment	TokenNameIdentifier	 Segment
(	TokenNameLPAREN	
long	TokenNamelong	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
MappedByteBuffer	TokenNameIdentifier	 Mapped Byte Buffer
segment	TokenNameIdentifier	 segment
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
segment	TokenNameIdentifier	 segment
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
final	TokenNamefinal	
int	TokenNameint	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
Segment	TokenNameIdentifier	 Segment
that	TokenNameIdentifier	 that
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
signum	TokenNameIdentifier	 signum
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
left	TokenNameIdentifier	 left
-	TokenNameMINUS	
that	TokenNameIdentifier	 that
.	TokenNameDOT	
left	TokenNameIdentifier	 left
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * A lazy Iterator over segments in forward order from the given position. */	TokenNameCOMMENT_JAVADOC	 A lazy Iterator over segments in forward order from the given position. 
final	TokenNamefinal	
class	TokenNameclass	
SegmentIterator	TokenNameIdentifier	 Segment Iterator
implements	TokenNameimplements	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
FileDataInput	TokenNameIdentifier	 File Data Input
>	TokenNameGREATER	
{	TokenNameLBRACE	
private	TokenNameprivate	
long	TokenNamelong	
nextpos	TokenNameIdentifier	 nextpos
;	TokenNameSEMICOLON	
public	TokenNamepublic	
SegmentIterator	TokenNameIdentifier	 Segment Iterator
(	TokenNameLPAREN	
long	TokenNamelong	
position	TokenNameIdentifier	 position
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
nextpos	TokenNameIdentifier	 nextpos
=	TokenNameEQUAL	
position	TokenNameIdentifier	 position
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
nextpos	TokenNameIdentifier	 nextpos
<	TokenNameLESS	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
FileDataInput	TokenNameIdentifier	 File Data Input
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
long	TokenNamelong	
position	TokenNameIdentifier	 position
=	TokenNameEQUAL	
nextpos	TokenNameIdentifier	 nextpos
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
position	TokenNameIdentifier	 position
>=	TokenNameGREATER_EQUAL	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
NoSuchElementException	TokenNameIdentifier	 No Such Element Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FileDataInput	TokenNameIdentifier	 File Data Input
segment	TokenNameIdentifier	 segment
=	TokenNameEQUAL	
getSegment	TokenNameIdentifier	 get Segment
(	TokenNameLPAREN	
nextpos	TokenNameIdentifier	 nextpos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
nextpos	TokenNameIdentifier	 nextpos
=	TokenNameEQUAL	
nextpos	TokenNameIdentifier	 nextpos
+	TokenNamePLUS	
segment	TokenNameIdentifier	 segment
.	TokenNameDOT	
bytesRemaining	TokenNameIdentifier	 bytes Remaining
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
throw	TokenNamethrow	
new	TokenNamenew	
FSReadError	TokenNameIdentifier	 FS Read Error
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
,	TokenNameCOMMA	
path	TokenNameIdentifier	 path
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
segment	TokenNameIdentifier	 segment
;	TokenNameSEMICOLON	
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
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getSimpleName	TokenNameIdentifier	 get Simple Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"(path='"	TokenNameStringLiteral	(path='
+	TokenNamePLUS	
path	TokenNameIdentifier	 path
+	TokenNamePLUS	
"'"	TokenNameStringLiteral	'
+	TokenNamePLUS	
", length="	TokenNameStringLiteral	, length=
+	TokenNamePLUS	
length	TokenNameIdentifier	 length
+	TokenNamePLUS	
")"	TokenNameStringLiteral	)
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
