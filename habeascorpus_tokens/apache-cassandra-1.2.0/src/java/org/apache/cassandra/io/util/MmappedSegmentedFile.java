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
*	TokenNameMULTIPLY	
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
nio	TokenNameIdentifier	 nio
.	TokenNameDOT	
channels	TokenNameIdentifier	 channels
.	TokenNameDOT	
FileChannel	TokenNameIdentifier	 File Channel
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
ArrayList	TokenNameIdentifier	 Array List
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Arrays	TokenNameIdentifier	 Arrays
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
List	TokenNameIdentifier	 List
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
io	TokenNameIdentifier	 io
.	TokenNameDOT	
FSReadError	TokenNameIdentifier	 FS Read Error
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
MmappedSegmentedFile	TokenNameIdentifier	 Mmapped Segmented File
extends	TokenNameextends	
SegmentedFile	TokenNameIdentifier	 Segmented File
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
MmappedSegmentedFile	TokenNameIdentifier	 Mmapped Segmented File
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// in a perfect world, MAX_SEGMENT_SIZE would be final, but we need to test with a smaller size to stay sane. 	TokenNameCOMMENT_LINE	in a perfect world, MAX_SEGMENT_SIZE would be final, but we need to test with a smaller size to stay sane. 
public	TokenNamepublic	
static	TokenNamestatic	
long	TokenNamelong	
MAX_SEGMENT_SIZE	TokenNameIdentifier	 MAX  SEGMENT  SIZE
=	TokenNameEQUAL	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
;	TokenNameSEMICOLON	
/** * Sorted array of segment offsets and MappedByteBuffers for segments. If mmap is completely disabled, or if the * segment would be too long to mmap, the value for an offset will be null, indicating that we need to fall back * to a RandomAccessFile. */	TokenNameCOMMENT_JAVADOC	 Sorted array of segment offsets and MappedByteBuffers for segments. If mmap is completely disabled, or if the segment would be too long to mmap, the value for an offset will be null, indicating that we need to fall back to a RandomAccessFile. 
private	TokenNameprivate	
final	TokenNamefinal	
Segment	TokenNameIdentifier	 Segment
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
segments	TokenNameIdentifier	 segments
;	TokenNameSEMICOLON	
public	TokenNamepublic	
MmappedSegmentedFile	TokenNameIdentifier	 Mmapped Segmented File
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
path	TokenNameIdentifier	 path
,	TokenNameCOMMA	
long	TokenNamelong	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
Segment	TokenNameIdentifier	 Segment
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
segments	TokenNameIdentifier	 segments
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
path	TokenNameIdentifier	 path
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
segments	TokenNameIdentifier	 segments
=	TokenNameEQUAL	
segments	TokenNameIdentifier	 segments
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return The segment entry for the given position. */	TokenNameCOMMENT_JAVADOC	 @return The segment entry for the given position. 
private	TokenNameprivate	
Segment	TokenNameIdentifier	 Segment
floor	TokenNameIdentifier	 floor
(	TokenNameLPAREN	
long	TokenNamelong	
position	TokenNameIdentifier	 position
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assert	TokenNameassert	
0	TokenNameIntegerLiteral	
<=	TokenNameLESS_EQUAL	
position	TokenNameIdentifier	 position
&&	TokenNameAND_AND	
position	TokenNameIdentifier	 position
<	TokenNameLESS	
length	TokenNameIdentifier	 length
:	TokenNameCOLON	
position	TokenNameIdentifier	 position
+	TokenNamePLUS	
" vs "	TokenNameStringLiteral	 vs 
+	TokenNamePLUS	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
Segment	TokenNameIdentifier	 Segment
seg	TokenNameIdentifier	 seg
=	TokenNameEQUAL	
new	TokenNamenew	
Segment	TokenNameIdentifier	 Segment
(	TokenNameLPAREN	
position	TokenNameIdentifier	 position
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
idx	TokenNameIdentifier	 idx
=	TokenNameEQUAL	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
binarySearch	TokenNameIdentifier	 binary Search
(	TokenNameLPAREN	
segments	TokenNameIdentifier	 segments
,	TokenNameCOMMA	
seg	TokenNameIdentifier	 seg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
idx	TokenNameIdentifier	 idx
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
"Bad position "	TokenNameStringLiteral	Bad position 
+	TokenNamePLUS	
position	TokenNameIdentifier	 position
+	TokenNamePLUS	
" in segments "	TokenNameStringLiteral	 in segments 
+	TokenNamePLUS	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
segments	TokenNameIdentifier	 segments
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
idx	TokenNameIdentifier	 idx
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
// round down to entry at insertion point 	TokenNameCOMMENT_LINE	round down to entry at insertion point 
idx	TokenNameIdentifier	 idx
=	TokenNameEQUAL	
-	TokenNameMINUS	
(	TokenNameLPAREN	
idx	TokenNameIdentifier	 idx
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
segments	TokenNameIdentifier	 segments
[	TokenNameLBRACKET	
idx	TokenNameIdentifier	 idx
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return The segment containing the given position: must be closed after use. */	TokenNameCOMMENT_JAVADOC	 @return The segment containing the given position: must be closed after use. 
public	TokenNamepublic	
FileDataInput	TokenNameIdentifier	 File Data Input
getSegment	TokenNameIdentifier	 get Segment
(	TokenNameLPAREN	
long	TokenNamelong	
position	TokenNameIdentifier	 position
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Segment	TokenNameIdentifier	 Segment
segment	TokenNameIdentifier	 segment
=	TokenNameEQUAL	
floor	TokenNameIdentifier	 floor
(	TokenNameLPAREN	
position	TokenNameIdentifier	 position
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
segment	TokenNameIdentifier	 segment
.	TokenNameDOT	
right	TokenNameIdentifier	 right
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// segment is mmap'd 	TokenNameCOMMENT_LINE	segment is mmap'd 
return	TokenNamereturn	
new	TokenNamenew	
MappedFileDataInput	TokenNameIdentifier	 Mapped File Data Input
(	TokenNameLPAREN	
segment	TokenNameIdentifier	 segment
.	TokenNameDOT	
right	TokenNameIdentifier	 right
,	TokenNameCOMMA	
path	TokenNameIdentifier	 path
,	TokenNameCOMMA	
segment	TokenNameIdentifier	 segment
.	TokenNameDOT	
left	TokenNameIdentifier	 left
,	TokenNameCOMMA	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
position	TokenNameIdentifier	 position
-	TokenNameMINUS	
segment	TokenNameIdentifier	 segment
.	TokenNameDOT	
left	TokenNameIdentifier	 left
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// not mmap'd: open a braf covering the segment 	TokenNameCOMMENT_LINE	not mmap'd: open a braf covering the segment 
// FIXME: brafs are unbounded, so this segment will cover the rest of the file, rather than just the row 	TokenNameCOMMENT_LINE	FIXME: brafs are unbounded, so this segment will cover the rest of the file, rather than just the row 
RandomAccessReader	TokenNameIdentifier	 Random Access Reader
file	TokenNameIdentifier	 file
=	TokenNameEQUAL	
RandomAccessReader	TokenNameIdentifier	 Random Access Reader
.	TokenNameDOT	
open	TokenNameIdentifier	 open
(	TokenNameLPAREN	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
path	TokenNameIdentifier	 path
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
file	TokenNameIdentifier	 file
.	TokenNameDOT	
seek	TokenNameIdentifier	 seek
(	TokenNameLPAREN	
position	TokenNameIdentifier	 position
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
file	TokenNameIdentifier	 file
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
cleanup	TokenNameIdentifier	 cleanup
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
FileUtils	TokenNameIdentifier	 File Utils
.	TokenNameDOT	
isCleanerAvailable	TokenNameIdentifier	 is Cleaner Available
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
/* * Try forcing the unmapping of segments using undocumented unsafe sun APIs. * If this fails (non Sun JVM), we'll have to wait for the GC to finalize the mapping. * If this works and a thread tries to access any segment, hell will unleash on earth. */	TokenNameCOMMENT_BLOCK	 Try forcing the unmapping of segments using undocumented unsafe sun APIs. If this fails (non Sun JVM), we'll have to wait for the GC to finalize the mapping. If this works and a thread tries to access any segment, hell will unleash on earth. 
try	TokenNametry	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
Segment	TokenNameIdentifier	 Segment
segment	TokenNameIdentifier	 segment
:	TokenNameCOLON	
segments	TokenNameIdentifier	 segments
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
segment	TokenNameIdentifier	 segment
.	TokenNameDOT	
right	TokenNameIdentifier	 right
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
FileUtils	TokenNameIdentifier	 File Utils
.	TokenNameDOT	
clean	TokenNameIdentifier	 clean
(	TokenNameLPAREN	
segment	TokenNameIdentifier	 segment
.	TokenNameDOT	
right	TokenNameIdentifier	 right
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"All segments have been unmapped successfully"	TokenNameStringLiteral	All segments have been unmapped successfully
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// This is not supposed to happen 	TokenNameCOMMENT_LINE	This is not supposed to happen 
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
"Error while unmapping segments"	TokenNameStringLiteral	Error while unmapping segments
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Overrides the default behaviour to create segments of a maximum size. */	TokenNameCOMMENT_JAVADOC	 Overrides the default behaviour to create segments of a maximum size. 
static	TokenNamestatic	
class	TokenNameclass	
Builder	TokenNameIdentifier	 Builder
extends	TokenNameextends	
SegmentedFile	TokenNameIdentifier	 Segmented File
.	TokenNameDOT	
Builder	TokenNameIdentifier	 Builder
{	TokenNameLBRACE	
// planned segment boundaries 	TokenNameCOMMENT_LINE	planned segment boundaries 
private	TokenNameprivate	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Long	TokenNameIdentifier	 Long
>	TokenNameGREATER	
boundaries	TokenNameIdentifier	 boundaries
;	TokenNameSEMICOLON	
// offset of the open segment (first segment begins at 0). 	TokenNameCOMMENT_LINE	offset of the open segment (first segment begins at 0). 
private	TokenNameprivate	
long	TokenNamelong	
currentStart	TokenNameIdentifier	 current Start
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// current length of the open segment. 	TokenNameCOMMENT_LINE	current length of the open segment. 
// used to allow merging multiple too-large-to-mmap segments, into a single buffered segment. 	TokenNameCOMMENT_LINE	used to allow merging multiple too-large-to-mmap segments, into a single buffered segment. 
private	TokenNameprivate	
long	TokenNamelong	
currentSize	TokenNameIdentifier	 current Size
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
Builder	TokenNameIdentifier	 Builder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boundaries	TokenNameIdentifier	 boundaries
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
Long	TokenNameIdentifier	 Long
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boundaries	TokenNameIdentifier	 boundaries
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
0L	TokenNameLongLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
addPotentialBoundary	TokenNameIdentifier	 add Potential Boundary
(	TokenNameLPAREN	
long	TokenNamelong	
boundary	TokenNameIdentifier	 boundary
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
boundary	TokenNameIdentifier	 boundary
-	TokenNameMINUS	
currentStart	TokenNameIdentifier	 current Start
<=	TokenNameLESS_EQUAL	
MAX_SEGMENT_SIZE	TokenNameIdentifier	 MAX  SEGMENT  SIZE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// boundary fits into current segment: expand it 	TokenNameCOMMENT_LINE	boundary fits into current segment: expand it 
currentSize	TokenNameIdentifier	 current Size
=	TokenNameEQUAL	
boundary	TokenNameIdentifier	 boundary
-	TokenNameMINUS	
currentStart	TokenNameIdentifier	 current Start
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// close the current segment to try and make room for the boundary 	TokenNameCOMMENT_LINE	close the current segment to try and make room for the boundary 
if	TokenNameif	
(	TokenNameLPAREN	
currentSize	TokenNameIdentifier	 current Size
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
currentStart	TokenNameIdentifier	 current Start
+=	TokenNamePLUS_EQUAL	
currentSize	TokenNameIdentifier	 current Size
;	TokenNameSEMICOLON	
boundaries	TokenNameIdentifier	 boundaries
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
currentStart	TokenNameIdentifier	 current Start
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
currentSize	TokenNameIdentifier	 current Size
=	TokenNameEQUAL	
boundary	TokenNameIdentifier	 boundary
-	TokenNameMINUS	
currentStart	TokenNameIdentifier	 current Start
;	TokenNameSEMICOLON	
// if we couldn't make room, the boundary needs its own segment 	TokenNameCOMMENT_LINE	if we couldn't make room, the boundary needs its own segment 
if	TokenNameif	
(	TokenNameLPAREN	
currentSize	TokenNameIdentifier	 current Size
>	TokenNameGREATER	
MAX_SEGMENT_SIZE	TokenNameIdentifier	 MAX  SEGMENT  SIZE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
currentStart	TokenNameIdentifier	 current Start
=	TokenNameEQUAL	
boundary	TokenNameIdentifier	 boundary
;	TokenNameSEMICOLON	
boundaries	TokenNameIdentifier	 boundaries
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
currentStart	TokenNameIdentifier	 current Start
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
currentSize	TokenNameIdentifier	 current Size
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
SegmentedFile	TokenNameIdentifier	 Segmented File
complete	TokenNameIdentifier	 complete
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
path	TokenNameIdentifier	 path
)	TokenNameRPAREN	
{	TokenNameLBRACE	
long	TokenNamelong	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
path	TokenNameIdentifier	 path
)	TokenNameRPAREN	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// add a sentinel value == length 	TokenNameCOMMENT_LINE	add a sentinel value == length 
if	TokenNameif	
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
!=	TokenNameNOT_EQUAL	
boundaries	TokenNameIdentifier	 boundaries
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
boundaries	TokenNameIdentifier	 boundaries
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
boundaries	TokenNameIdentifier	 boundaries
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// create the segments 	TokenNameCOMMENT_LINE	create the segments 
return	TokenNamereturn	
new	TokenNamenew	
MmappedSegmentedFile	TokenNameIdentifier	 Mmapped Segmented File
(	TokenNameLPAREN	
path	TokenNameIdentifier	 path
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
createSegments	TokenNameIdentifier	 create Segments
(	TokenNameLPAREN	
path	TokenNameIdentifier	 path
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
Segment	TokenNameIdentifier	 Segment
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
createSegments	TokenNameIdentifier	 create Segments
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
path	TokenNameIdentifier	 path
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
segcount	TokenNameIdentifier	 segcount
=	TokenNameEQUAL	
boundaries	TokenNameIdentifier	 boundaries
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
Segment	TokenNameIdentifier	 Segment
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
segments	TokenNameIdentifier	 segments
=	TokenNameEQUAL	
new	TokenNamenew	
Segment	TokenNameIdentifier	 Segment
[	TokenNameLBRACKET	
segcount	TokenNameIdentifier	 segcount
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
RandomAccessFile	TokenNameIdentifier	 Random Access File
raf	TokenNameIdentifier	 raf
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
raf	TokenNameIdentifier	 raf
=	TokenNameEQUAL	
new	TokenNamenew	
RandomAccessFile	TokenNameIdentifier	 Random Access File
(	TokenNameLPAREN	
path	TokenNameIdentifier	 path
,	TokenNameCOMMA	
"r"	TokenNameStringLiteral	r
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
FileNotFoundException	TokenNameIdentifier	 File Not Found Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
segcount	TokenNameIdentifier	 segcount
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
long	TokenNamelong	
start	TokenNameIdentifier	 start
=	TokenNameEQUAL	
boundaries	TokenNameIdentifier	 boundaries
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
long	TokenNamelong	
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
boundaries	TokenNameIdentifier	 boundaries
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
-	TokenNameMINUS	
start	TokenNameIdentifier	 start
;	TokenNameSEMICOLON	
MappedByteBuffer	TokenNameIdentifier	 Mapped Byte Buffer
segment	TokenNameIdentifier	 segment
=	TokenNameEQUAL	
size	TokenNameIdentifier	 size
<=	TokenNameLESS_EQUAL	
MAX_SEGMENT_SIZE	TokenNameIdentifier	 MAX  SEGMENT  SIZE
?	TokenNameQUESTION	
raf	TokenNameIdentifier	 raf
.	TokenNameDOT	
getChannel	TokenNameIdentifier	 get Channel
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
map	TokenNameIdentifier	 map
(	TokenNameLPAREN	
FileChannel	TokenNameIdentifier	 File Channel
.	TokenNameDOT	
MapMode	TokenNameIdentifier	 Map Mode
.	TokenNameDOT	
READ_ONLY	TokenNameIdentifier	 READ  ONLY
,	TokenNameCOMMA	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
:	TokenNameCOLON	
null	TokenNamenull	
;	TokenNameSEMICOLON	
segments	TokenNameIdentifier	 segments
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
Segment	TokenNameIdentifier	 Segment
(	TokenNameLPAREN	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
segment	TokenNameIdentifier	 segment
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
finally	TokenNamefinally	
{	TokenNameLBRACE	
FileUtils	TokenNameIdentifier	 File Utils
.	TokenNameDOT	
closeQuietly	TokenNameIdentifier	 close Quietly
(	TokenNameLPAREN	
raf	TokenNameIdentifier	 raf
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
segments	TokenNameIdentifier	 segments
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
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
super	TokenNamesuper	
.	TokenNameDOT	
serializeBounds	TokenNameIdentifier	 serialize Bounds
(	TokenNameLPAREN	
dos	TokenNameIdentifier	 dos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dos	TokenNameIdentifier	 dos
.	TokenNameDOT	
writeInt	TokenNameIdentifier	 write Int
(	TokenNameLPAREN	
boundaries	TokenNameIdentifier	 boundaries
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
long	TokenNamelong	
position	TokenNameIdentifier	 position
:	TokenNameCOLON	
boundaries	TokenNameIdentifier	 boundaries
)	TokenNameRPAREN	
dos	TokenNameIdentifier	 dos
.	TokenNameDOT	
writeLong	TokenNameIdentifier	 write Long
(	TokenNameLPAREN	
position	TokenNameIdentifier	 position
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
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
super	TokenNamesuper	
.	TokenNameDOT	
deserializeBounds	TokenNameIdentifier	 deserialize Bounds
(	TokenNameLPAREN	
dis	TokenNameIdentifier	 dis
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Long	TokenNameIdentifier	 Long
>	TokenNameGREATER	
temp	TokenNameIdentifier	 temp
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
Long	TokenNameIdentifier	 Long
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
dis	TokenNameIdentifier	 dis
.	TokenNameDOT	
readInt	TokenNameIdentifier	 read Int
(	TokenNameLPAREN	
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
size	TokenNameIdentifier	 size
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
temp	TokenNameIdentifier	 temp
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
dis	TokenNameIdentifier	 dis
.	TokenNameDOT	
readLong	TokenNameIdentifier	 read Long
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boundaries	TokenNameIdentifier	 boundaries
=	TokenNameEQUAL	
temp	TokenNameIdentifier	 temp
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
