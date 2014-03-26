package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
suggest	TokenNameIdentifier	 suggest
.	TokenNameDOT	
fst	TokenNameIdentifier	 fst
;	TokenNameSEMICOLON	
/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
*	TokenNameMULTIPLY	
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
suggest	TokenNameIdentifier	 suggest
.	TokenNameDOT	
BytesRefList	TokenNameIdentifier	 Bytes Ref List
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
*	TokenNameMULTIPLY	
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
PriorityQueue	TokenNameIdentifier	 Priority Queue
;	TokenNameSEMICOLON	
/** * On-disk sorting of byte arrays. Each byte array (entry) is a composed of the following * fields: * <ul> * <li>(two bytes) length of the following byte array, * <li>exactly the above count of bytes for the sequence to be sorted. * </ul> * * @see #sort(File, File) * @lucene.experimental * @lucene.internal */	TokenNameCOMMENT_JAVADOC	 On-disk sorting of byte arrays. Each byte array (entry) is a composed of the following fields: <ul> <li>(two bytes) length of the following byte array, <li>exactly the above count of bytes for the sequence to be sorted. </ul> * @see #sort(File, File) @lucene.experimental @lucene.internal 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
Sort	TokenNameIdentifier	 Sort
{	TokenNameLBRACE	
public	TokenNamepublic	
final	TokenNamefinal	
static	TokenNamestatic	
long	TokenNamelong	
MB	TokenNameIdentifier	 MB
=	TokenNameEQUAL	
1024	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
1024	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
static	TokenNamestatic	
long	TokenNamelong	
GB	TokenNameIdentifier	 GB
=	TokenNameEQUAL	
MB	TokenNameIdentifier	 MB
*	TokenNameMULTIPLY	
1024	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Minimum recommended buffer size for sorting. */	TokenNameCOMMENT_JAVADOC	 Minimum recommended buffer size for sorting. 
public	TokenNamepublic	
final	TokenNamefinal	
static	TokenNamestatic	
long	TokenNamelong	
MIN_BUFFER_SIZE_MB	TokenNameIdentifier	 MIN  BUFFER  SIZE  MB
=	TokenNameEQUAL	
32	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Absolute minimum required buffer size for sorting. */	TokenNameCOMMENT_JAVADOC	 Absolute minimum required buffer size for sorting. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
ABSOLUTE_MIN_SORT_BUFFER_SIZE	TokenNameIdentifier	 ABSOLUTE  MIN  SORT  BUFFER  SIZE
=	TokenNameEQUAL	
MB	TokenNameIdentifier	 MB
/	TokenNameDIVIDE	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
MIN_BUFFER_SIZE_MSG	TokenNameIdentifier	 MIN  BUFFER  SIZE  MSG
=	TokenNameEQUAL	
"At least 0.5MB RAM buffer is needed"	TokenNameStringLiteral	At least 0.5MB RAM buffer is needed
;	TokenNameSEMICOLON	
/** * Maximum number of temporary files before doing an intermediate merge. */	TokenNameCOMMENT_JAVADOC	 Maximum number of temporary files before doing an intermediate merge. 
public	TokenNamepublic	
final	TokenNamefinal	
static	TokenNamestatic	
int	TokenNameint	
MAX_TEMPFILES	TokenNameIdentifier	 MAX  TEMPFILES
=	TokenNameEQUAL	
128	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * A bit more descriptive unit for constructors. * * @see #automatic() * @see #megabytes(long) */	TokenNameCOMMENT_JAVADOC	 A bit more descriptive unit for constructors. * @see #automatic() @see #megabytes(long) 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
class	TokenNameclass	
BufferSize	TokenNameIdentifier	 Buffer Size
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
bytes	TokenNameIdentifier	 bytes
;	TokenNameSEMICOLON	
private	TokenNameprivate	
BufferSize	TokenNameIdentifier	 Buffer Size
(	TokenNameLPAREN	
long	TokenNamelong	
bytes	TokenNameIdentifier	 bytes
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
bytes	TokenNameIdentifier	 bytes
>	TokenNameGREATER	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"Buffer too large for Java ("	TokenNameStringLiteral	Buffer too large for Java (
+	TokenNamePLUS	
(	TokenNameLPAREN	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
/	TokenNameDIVIDE	
MB	TokenNameIdentifier	 MB
)	TokenNameRPAREN	
+	TokenNamePLUS	
"mb max): "	TokenNameStringLiteral	mb max): 
+	TokenNamePLUS	
bytes	TokenNameIdentifier	 bytes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
bytes	TokenNameIdentifier	 bytes
<	TokenNameLESS	
ABSOLUTE_MIN_SORT_BUFFER_SIZE	TokenNameIdentifier	 ABSOLUTE  MIN  SORT  BUFFER  SIZE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
MIN_BUFFER_SIZE_MSG	TokenNameIdentifier	 MIN  BUFFER  SIZE  MSG
+	TokenNamePLUS	
": "	TokenNameStringLiteral	: 
+	TokenNamePLUS	
bytes	TokenNameIdentifier	 bytes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
bytes	TokenNameIdentifier	 bytes
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
bytes	TokenNameIdentifier	 bytes
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates a {@link BufferSize} in MB. The given * values must be $gt; 0 and &lt; 2048. */	TokenNameCOMMENT_JAVADOC	 Creates a {@link BufferSize} in MB. The given values must be $gt; 0 and &lt; 2048. 
public	TokenNamepublic	
static	TokenNamestatic	
BufferSize	TokenNameIdentifier	 Buffer Size
megabytes	TokenNameIdentifier	 megabytes
(	TokenNameLPAREN	
long	TokenNamelong	
mb	TokenNameIdentifier	 mb
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
BufferSize	TokenNameIdentifier	 Buffer Size
(	TokenNameLPAREN	
mb	TokenNameIdentifier	 mb
*	TokenNameMULTIPLY	
MB	TokenNameIdentifier	 MB
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Approximately half of the currently available free heap, but no less * than {@link #ABSOLUTE_MIN_SORT_BUFFER_SIZE}. However if current heap allocation * is insufficient or if there is a large portion of unallocated heap-space available * for sorting consult with max allowed heap size. */	TokenNameCOMMENT_JAVADOC	 Approximately half of the currently available free heap, but no less than {@link #ABSOLUTE_MIN_SORT_BUFFER_SIZE}. However if current heap allocation is insufficient or if there is a large portion of unallocated heap-space available for sorting consult with max allowed heap size. 
public	TokenNamepublic	
static	TokenNamestatic	
BufferSize	TokenNameIdentifier	 Buffer Size
automatic	TokenNameIdentifier	 automatic
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Runtime	TokenNameIdentifier	 Runtime
rt	TokenNameIdentifier	 rt
=	TokenNameEQUAL	
Runtime	TokenNameIdentifier	 Runtime
.	TokenNameDOT	
getRuntime	TokenNameIdentifier	 get Runtime
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// take sizes in "conservative" order 	TokenNameCOMMENT_LINE	take sizes in "conservative" order 
final	TokenNamefinal	
long	TokenNamelong	
max	TokenNameIdentifier	 max
=	TokenNameEQUAL	
rt	TokenNameIdentifier	 rt
.	TokenNameDOT	
maxMemory	TokenNameIdentifier	 max Memory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// max allocated 	TokenNameCOMMENT_LINE	max allocated 
final	TokenNamefinal	
long	TokenNamelong	
total	TokenNameIdentifier	 total
=	TokenNameEQUAL	
rt	TokenNameIdentifier	 rt
.	TokenNameDOT	
totalMemory	TokenNameIdentifier	 total Memory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// currently allocated 	TokenNameCOMMENT_LINE	currently allocated 
final	TokenNamefinal	
long	TokenNamelong	
free	TokenNameIdentifier	 free
=	TokenNameEQUAL	
rt	TokenNameIdentifier	 rt
.	TokenNameDOT	
freeMemory	TokenNameIdentifier	 free Memory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// unused portion of currently allocated 	TokenNameCOMMENT_LINE	unused portion of currently allocated 
final	TokenNamefinal	
long	TokenNamelong	
totalAvailableBytes	TokenNameIdentifier	 total Available Bytes
=	TokenNameEQUAL	
max	TokenNameIdentifier	 max
-	TokenNameMINUS	
total	TokenNameIdentifier	 total
+	TokenNamePLUS	
free	TokenNameIdentifier	 free
;	TokenNameSEMICOLON	
// by free mem (attempting to not grow the heap for this) 	TokenNameCOMMENT_LINE	by free mem (attempting to not grow the heap for this) 
long	TokenNamelong	
sortBufferByteSize	TokenNameIdentifier	 sort Buffer Byte Size
=	TokenNameEQUAL	
free	TokenNameIdentifier	 free
/	TokenNameDIVIDE	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
long	TokenNamelong	
minBufferSizeBytes	TokenNameIdentifier	 min Buffer Size Bytes
=	TokenNameEQUAL	
MIN_BUFFER_SIZE_MB	TokenNameIdentifier	 MIN  BUFFER  SIZE  MB
*	TokenNameMULTIPLY	
MB	TokenNameIdentifier	 MB
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
sortBufferByteSize	TokenNameIdentifier	 sort Buffer Byte Size
<	TokenNameLESS	
minBufferSizeBytes	TokenNameIdentifier	 min Buffer Size Bytes
||	TokenNameOR_OR	
totalAvailableBytes	TokenNameIdentifier	 total Available Bytes
>	TokenNameGREATER	
10	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
minBufferSizeBytes	TokenNameIdentifier	 min Buffer Size Bytes
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// lets see if we need/should to grow the heap 	TokenNameCOMMENT_LINE	lets see if we need/should to grow the heap 
if	TokenNameif	
(	TokenNameLPAREN	
totalAvailableBytes	TokenNameIdentifier	 total Available Bytes
/	TokenNameDIVIDE	
2	TokenNameIntegerLiteral	
>	TokenNameGREATER	
minBufferSizeBytes	TokenNameIdentifier	 min Buffer Size Bytes
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// there is enough mem for a reasonable buffer 	TokenNameCOMMENT_LINE	there is enough mem for a reasonable buffer 
sortBufferByteSize	TokenNameIdentifier	 sort Buffer Byte Size
=	TokenNameEQUAL	
totalAvailableBytes	TokenNameIdentifier	 total Available Bytes
/	TokenNameDIVIDE	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// grow the heap 	TokenNameCOMMENT_LINE	grow the heap 
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
//heap seems smallish lets be conservative fall back to the free/2 	TokenNameCOMMENT_LINE	heap seems smallish lets be conservative fall back to the free/2 
sortBufferByteSize	TokenNameIdentifier	 sort Buffer Byte Size
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
max	TokenNameIdentifier	 max
(	TokenNameLPAREN	
ABSOLUTE_MIN_SORT_BUFFER_SIZE	TokenNameIdentifier	 ABSOLUTE  MIN  SORT  BUFFER  SIZE
,	TokenNameCOMMA	
sortBufferByteSize	TokenNameIdentifier	 sort Buffer Byte Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
new	TokenNamenew	
BufferSize	TokenNameIdentifier	 Buffer Size
(	TokenNameLPAREN	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
min	TokenNameIdentifier	 min
(	TokenNameLPAREN	
(	TokenNameLPAREN	
long	TokenNamelong	
)	TokenNameRPAREN	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
,	TokenNameCOMMA	
sortBufferByteSize	TokenNameIdentifier	 sort Buffer Byte Size
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Sort info (debugging mostly). */	TokenNameCOMMENT_JAVADOC	 Sort info (debugging mostly). 
public	TokenNamepublic	
class	TokenNameclass	
SortInfo	TokenNameIdentifier	 Sort Info
{	TokenNameLBRACE	
public	TokenNamepublic	
int	TokenNameint	
tempMergeFiles	TokenNameIdentifier	 temp Merge Files
;	TokenNameSEMICOLON	
public	TokenNamepublic	
int	TokenNameint	
mergeRounds	TokenNameIdentifier	 merge Rounds
;	TokenNameSEMICOLON	
public	TokenNamepublic	
int	TokenNameint	
lines	TokenNameIdentifier	 lines
;	TokenNameSEMICOLON	
public	TokenNamepublic	
long	TokenNamelong	
mergeTime	TokenNameIdentifier	 merge Time
;	TokenNameSEMICOLON	
public	TokenNamepublic	
long	TokenNamelong	
sortTime	TokenNameIdentifier	 sort Time
;	TokenNameSEMICOLON	
public	TokenNamepublic	
long	TokenNamelong	
totalTime	TokenNameIdentifier	 total Time
;	TokenNameSEMICOLON	
public	TokenNamepublic	
long	TokenNamelong	
readTime	TokenNameIdentifier	 read Time
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
long	TokenNamelong	
bufferSize	TokenNameIdentifier	 buffer Size
=	TokenNameEQUAL	
ramBufferSize	TokenNameIdentifier	 ram Buffer Size
.	TokenNameDOT	
bytes	TokenNameIdentifier	 bytes
;	TokenNameSEMICOLON	
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
Locale	TokenNameIdentifier	 Locale
.	TokenNameDOT	
ENGLISH	TokenNameIdentifier	 ENGLISH
,	TokenNameCOMMA	
"time=%.2f sec. total (%.2f reading, %.2f sorting, %.2f merging), lines=%d, temp files=%d, merges=%d, soft ram limit=%.2f MB"	TokenNameStringLiteral	time=%.2f sec. total (%.2f reading, %.2f sorting, %.2f merging), lines=%d, temp files=%d, merges=%d, soft ram limit=%.2f MB
,	TokenNameCOMMA	
totalTime	TokenNameIdentifier	 total Time
/	TokenNameDIVIDE	
1000.0d	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
readTime	TokenNameIdentifier	 read Time
/	TokenNameDIVIDE	
1000.0d	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
sortTime	TokenNameIdentifier	 sort Time
/	TokenNameDIVIDE	
1000.0d	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
mergeTime	TokenNameIdentifier	 merge Time
/	TokenNameDIVIDE	
1000.0d	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
lines	TokenNameIdentifier	 lines
,	TokenNameCOMMA	
tempMergeFiles	TokenNameIdentifier	 temp Merge Files
,	TokenNameCOMMA	
mergeRounds	TokenNameIdentifier	 merge Rounds
,	TokenNameCOMMA	
(	TokenNameLPAREN	
double	TokenNamedouble	
)	TokenNameRPAREN	
bufferSize	TokenNameIdentifier	 buffer Size
/	TokenNameDIVIDE	
MB	TokenNameIdentifier	 MB
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
BufferSize	TokenNameIdentifier	 Buffer Size
ramBufferSize	TokenNameIdentifier	 ram Buffer Size
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
File	TokenNameIdentifier	 File
tempDirectory	TokenNameIdentifier	 temp Directory
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
BytesRefList	TokenNameIdentifier	 Bytes Ref List
buffer	TokenNameIdentifier	 buffer
=	TokenNameEQUAL	
new	TokenNamenew	
BytesRefList	TokenNameIdentifier	 Bytes Ref List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
SortInfo	TokenNameIdentifier	 Sort Info
sortInfo	TokenNameIdentifier	 sort Info
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
maxTempFiles	TokenNameIdentifier	 max Temp Files
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
Comparator	TokenNameIdentifier	 Comparator
<	TokenNameLESS	
BytesRef	TokenNameIdentifier	 Bytes Ref
>	TokenNameGREATER	
comparator	TokenNameIdentifier	 comparator
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
Comparator	TokenNameIdentifier	 Comparator
<	TokenNameLESS	
BytesRef	TokenNameIdentifier	 Bytes Ref
>	TokenNameGREATER	
DEFAULT_COMPARATOR	TokenNameIdentifier	 DEFAULT  COMPARATOR
=	TokenNameEQUAL	
BytesRef	TokenNameIdentifier	 Bytes Ref
.	TokenNameDOT	
getUTF8SortedAsUnicodeComparator	TokenNameIdentifier	 get UT F8 Sorted As Unicode Comparator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Defaults constructor. * * @see #defaultTempDir() * @see BufferSize#automatic() */	TokenNameCOMMENT_JAVADOC	 Defaults constructor. * @see #defaultTempDir() @see BufferSize#automatic() 
public	TokenNamepublic	
Sort	TokenNameIdentifier	 Sort
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
DEFAULT_COMPARATOR	TokenNameIdentifier	 DEFAULT  COMPARATOR
,	TokenNameCOMMA	
BufferSize	TokenNameIdentifier	 Buffer Size
.	TokenNameDOT	
automatic	TokenNameIdentifier	 automatic
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
defaultTempDir	TokenNameIdentifier	 default Temp Dir
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
MAX_TEMPFILES	TokenNameIdentifier	 MAX  TEMPFILES
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Sort	TokenNameIdentifier	 Sort
(	TokenNameLPAREN	
Comparator	TokenNameIdentifier	 Comparator
<	TokenNameLESS	
BytesRef	TokenNameIdentifier	 Bytes Ref
>	TokenNameGREATER	
comparator	TokenNameIdentifier	 comparator
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
comparator	TokenNameIdentifier	 comparator
,	TokenNameCOMMA	
BufferSize	TokenNameIdentifier	 Buffer Size
.	TokenNameDOT	
automatic	TokenNameIdentifier	 automatic
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
defaultTempDir	TokenNameIdentifier	 default Temp Dir
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
MAX_TEMPFILES	TokenNameIdentifier	 MAX  TEMPFILES
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * All-details constructor. */	TokenNameCOMMENT_JAVADOC	 All-details constructor. 
public	TokenNamepublic	
Sort	TokenNameIdentifier	 Sort
(	TokenNameLPAREN	
Comparator	TokenNameIdentifier	 Comparator
<	TokenNameLESS	
BytesRef	TokenNameIdentifier	 Bytes Ref
>	TokenNameGREATER	
comparator	TokenNameIdentifier	 comparator
,	TokenNameCOMMA	
BufferSize	TokenNameIdentifier	 Buffer Size
ramBufferSize	TokenNameIdentifier	 ram Buffer Size
,	TokenNameCOMMA	
File	TokenNameIdentifier	 File
tempDirectory	TokenNameIdentifier	 temp Directory
,	TokenNameCOMMA	
int	TokenNameint	
maxTempfiles	TokenNameIdentifier	 max Tempfiles
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
ramBufferSize	TokenNameIdentifier	 ram Buffer Size
.	TokenNameDOT	
bytes	TokenNameIdentifier	 bytes
<	TokenNameLESS	
ABSOLUTE_MIN_SORT_BUFFER_SIZE	TokenNameIdentifier	 ABSOLUTE  MIN  SORT  BUFFER  SIZE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
MIN_BUFFER_SIZE_MSG	TokenNameIdentifier	 MIN  BUFFER  SIZE  MSG
+	TokenNamePLUS	
": "	TokenNameStringLiteral	: 
+	TokenNamePLUS	
ramBufferSize	TokenNameIdentifier	 ram Buffer Size
.	TokenNameDOT	
bytes	TokenNameIdentifier	 bytes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
maxTempfiles	TokenNameIdentifier	 max Tempfiles
<	TokenNameLESS	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"maxTempFiles must be >= 2"	TokenNameStringLiteral	maxTempFiles must be >= 2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
ramBufferSize	TokenNameIdentifier	 ram Buffer Size
=	TokenNameEQUAL	
ramBufferSize	TokenNameIdentifier	 ram Buffer Size
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
tempDirectory	TokenNameIdentifier	 temp Directory
=	TokenNameEQUAL	
tempDirectory	TokenNameIdentifier	 temp Directory
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
maxTempFiles	TokenNameIdentifier	 max Temp Files
=	TokenNameEQUAL	
maxTempfiles	TokenNameIdentifier	 max Tempfiles
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
comparator	TokenNameIdentifier	 comparator
=	TokenNameEQUAL	
comparator	TokenNameIdentifier	 comparator
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sort input to output, explicit hint for the buffer size. The amount of allocated * memory may deviate from the hint (may be smaller or larger). */	TokenNameCOMMENT_JAVADOC	 Sort input to output, explicit hint for the buffer size. The amount of allocated memory may deviate from the hint (may be smaller or larger). 
public	TokenNamepublic	
SortInfo	TokenNameIdentifier	 Sort Info
sort	TokenNameIdentifier	 sort
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
File	TokenNameIdentifier	 File
output	TokenNameIdentifier	 output
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
sortInfo	TokenNameIdentifier	 sort Info
=	TokenNameEQUAL	
new	TokenNamenew	
SortInfo	TokenNameIdentifier	 Sort Info
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sortInfo	TokenNameIdentifier	 sort Info
.	TokenNameDOT	
totalTime	TokenNameIdentifier	 total Time
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
currentTimeMillis	TokenNameIdentifier	 current Time Millis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
output	TokenNameIdentifier	 output
.	TokenNameDOT	
delete	TokenNameIdentifier	 delete
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
File	TokenNameIdentifier	 File
>	TokenNameGREATER	
merges	TokenNameIdentifier	 merges
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
File	TokenNameIdentifier	 File
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
success2	TokenNameIdentifier	 success2
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
ByteSequencesReader	TokenNameIdentifier	 Byte Sequences Reader
is	TokenNameIdentifier	 is
=	TokenNameEQUAL	
new	TokenNamenew	
ByteSequencesReader	TokenNameIdentifier	 Byte Sequences Reader
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
success	TokenNameIdentifier	 success
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
int	TokenNameint	
lines	TokenNameIdentifier	 lines
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
lines	TokenNameIdentifier	 lines
=	TokenNameEQUAL	
readPartition	TokenNameIdentifier	 read Partition
(	TokenNameLPAREN	
is	TokenNameIdentifier	 is
)	TokenNameRPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
merges	TokenNameIdentifier	 merges
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
sortPartition	TokenNameIdentifier	 sort Partition
(	TokenNameLPAREN	
lines	TokenNameIdentifier	 lines
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sortInfo	TokenNameIdentifier	 sort Info
.	TokenNameDOT	
tempMergeFiles	TokenNameIdentifier	 temp Merge Files
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
sortInfo	TokenNameIdentifier	 sort Info
.	TokenNameDOT	
lines	TokenNameIdentifier	 lines
+=	TokenNamePLUS_EQUAL	
lines	TokenNameIdentifier	 lines
;	TokenNameSEMICOLON	
// Handle intermediate merges. 	TokenNameCOMMENT_LINE	Handle intermediate merges. 
if	TokenNameif	
(	TokenNameLPAREN	
merges	TokenNameIdentifier	 merges
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
maxTempFiles	TokenNameIdentifier	 max Temp Files
)	TokenNameRPAREN	
{	TokenNameLBRACE	
File	TokenNameIdentifier	 File
intermediate	TokenNameIdentifier	 intermediate
=	TokenNameEQUAL	
File	TokenNameIdentifier	 File
.	TokenNameDOT	
createTempFile	TokenNameIdentifier	 create Temp File
(	TokenNameLPAREN	
"sort"	TokenNameStringLiteral	sort
,	TokenNameCOMMA	
"intermediate"	TokenNameStringLiteral	intermediate
,	TokenNameCOMMA	
tempDirectory	TokenNameIdentifier	 temp Directory
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
mergePartitions	TokenNameIdentifier	 merge Partitions
(	TokenNameLPAREN	
merges	TokenNameIdentifier	 merges
,	TokenNameCOMMA	
intermediate	TokenNameIdentifier	 intermediate
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
file	TokenNameIdentifier	 file
:	TokenNameCOLON	
merges	TokenNameIdentifier	 merges
)	TokenNameRPAREN	
{	TokenNameLBRACE	
file	TokenNameIdentifier	 file
.	TokenNameDOT	
delete	TokenNameIdentifier	 delete
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
merges	TokenNameIdentifier	 merges
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
merges	TokenNameIdentifier	 merges
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
intermediate	TokenNameIdentifier	 intermediate
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
sortInfo	TokenNameIdentifier	 sort Info
.	TokenNameDOT	
tempMergeFiles	TokenNameIdentifier	 temp Merge Files
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
success	TokenNameIdentifier	 success
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
success	TokenNameIdentifier	 success
)	TokenNameRPAREN	
IOUtils	TokenNameIdentifier	 IO Utils
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
is	TokenNameIdentifier	 is
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
IOUtils	TokenNameIdentifier	 IO Utils
.	TokenNameDOT	
closeWhileHandlingException	TokenNameIdentifier	 close While Handling Exception
(	TokenNameLPAREN	
is	TokenNameIdentifier	 is
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// One partition, try to rename or copy if unsuccessful. 	TokenNameCOMMENT_LINE	One partition, try to rename or copy if unsuccessful. 
if	TokenNameif	
(	TokenNameLPAREN	
merges	TokenNameIdentifier	 merges
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
File	TokenNameIdentifier	 File
single	TokenNameIdentifier	 single
=	TokenNameEQUAL	
merges	TokenNameIdentifier	 merges
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// If simple rename doesn't work this means the output is 	TokenNameCOMMENT_LINE	If simple rename doesn't work this means the output is 
// on a different volume or something. Copy the input then. 	TokenNameCOMMENT_LINE	on a different volume or something. Copy the input then. 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
single	TokenNameIdentifier	 single
.	TokenNameDOT	
renameTo	TokenNameIdentifier	 rename To
(	TokenNameLPAREN	
output	TokenNameIdentifier	 output
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
copy	TokenNameIdentifier	 copy
(	TokenNameLPAREN	
single	TokenNameIdentifier	 single
,	TokenNameCOMMA	
output	TokenNameIdentifier	 output
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// otherwise merge the partitions with a priority queue. 	TokenNameCOMMENT_LINE	otherwise merge the partitions with a priority queue. 
mergePartitions	TokenNameIdentifier	 merge Partitions
(	TokenNameLPAREN	
merges	TokenNameIdentifier	 merges
,	TokenNameCOMMA	
output	TokenNameIdentifier	 output
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
success2	TokenNameIdentifier	 success2
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
file	TokenNameIdentifier	 file
:	TokenNameCOLON	
merges	TokenNameIdentifier	 merges
)	TokenNameRPAREN	
{	TokenNameLBRACE	
file	TokenNameIdentifier	 file
.	TokenNameDOT	
delete	TokenNameIdentifier	 delete
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
success2	TokenNameIdentifier	 success2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
output	TokenNameIdentifier	 output
.	TokenNameDOT	
delete	TokenNameIdentifier	 delete
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
sortInfo	TokenNameIdentifier	 sort Info
.	TokenNameDOT	
totalTime	TokenNameIdentifier	 total Time
=	TokenNameEQUAL	
(	TokenNameLPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
currentTimeMillis	TokenNameIdentifier	 current Time Millis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
sortInfo	TokenNameIdentifier	 sort Info
.	TokenNameDOT	
totalTime	TokenNameIdentifier	 total Time
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
sortInfo	TokenNameIdentifier	 sort Info
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the default temporary directory. By default, java.io.tmpdir. If not accessible * or not available, an IOException is thrown */	TokenNameCOMMENT_JAVADOC	 Returns the default temporary directory. By default, java.io.tmpdir. If not accessible or not available, an IOException is thrown 
public	TokenNamepublic	
static	TokenNamestatic	
File	TokenNameIdentifier	 File
defaultTempDir	TokenNameIdentifier	 default Temp Dir
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
tempDirPath	TokenNameIdentifier	 temp Dir Path
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"java.io.tmpdir"	TokenNameStringLiteral	java.io.tmpdir
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
tempDirPath	TokenNameIdentifier	 temp Dir Path
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IOException	TokenNameIdentifier	 IO Exception
(	TokenNameLPAREN	
"Java has no temporary folder property (java.io.tmpdir)?"	TokenNameStringLiteral	Java has no temporary folder property (java.io.tmpdir)?
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
File	TokenNameIdentifier	 File
tempDirectory	TokenNameIdentifier	 temp Directory
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
tempDirPath	TokenNameIdentifier	 temp Dir Path
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
tempDirectory	TokenNameIdentifier	 temp Directory
.	TokenNameDOT	
exists	TokenNameIdentifier	 exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
!	TokenNameNOT	
tempDirectory	TokenNameIdentifier	 temp Directory
.	TokenNameDOT	
canWrite	TokenNameIdentifier	 can Write
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IOException	TokenNameIdentifier	 IO Exception
(	TokenNameLPAREN	
"Java's temporary folder not present or writeable?: "	TokenNameStringLiteral	Java's temporary folder not present or writeable?: 
+	TokenNamePLUS	
tempDirectory	TokenNameIdentifier	 temp Directory
.	TokenNameDOT	
getAbsolutePath	TokenNameIdentifier	 get Absolute Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
tempDirectory	TokenNameIdentifier	 temp Directory
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Copies one file to another. */	TokenNameCOMMENT_JAVADOC	 Copies one file to another. 
private	TokenNameprivate	
static	TokenNamestatic	
void	TokenNamevoid	
copy	TokenNameIdentifier	 copy
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
file	TokenNameIdentifier	 file
,	TokenNameCOMMA	
File	TokenNameIdentifier	 File
output	TokenNameIdentifier	 output
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
// 64kb copy buffer (empirical pick). 	TokenNameCOMMENT_LINE	64kb copy buffer (empirical pick). 
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
buffer	TokenNameIdentifier	 buffer
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
16	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
1024	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
InputStream	TokenNameIdentifier	 Input Stream
is	TokenNameIdentifier	 is
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
OutputStream	TokenNameIdentifier	 Output Stream
os	TokenNameIdentifier	 os
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
is	TokenNameIdentifier	 is
=	TokenNameEQUAL	
new	TokenNamenew	
FileInputStream	TokenNameIdentifier	 File Input Stream
(	TokenNameLPAREN	
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
os	TokenNameIdentifier	 os
=	TokenNameEQUAL	
new	TokenNamenew	
FileOutputStream	TokenNameIdentifier	 File Output Stream
(	TokenNameLPAREN	
output	TokenNameIdentifier	 output
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
is	TokenNameIdentifier	 is
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
)	TokenNameRPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
os	TokenNameIdentifier	 os
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
IOUtils	TokenNameIdentifier	 IO Utils
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
is	TokenNameIdentifier	 is
,	TokenNameCOMMA	
os	TokenNameIdentifier	 os
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** Sort a single partition in-memory. */	TokenNameCOMMENT_JAVADOC	 Sort a single partition in-memory. 
protected	TokenNameprotected	
File	TokenNameIdentifier	 File
sortPartition	TokenNameIdentifier	 sort Partition
(	TokenNameLPAREN	
int	TokenNameint	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
BytesRefList	TokenNameIdentifier	 Bytes Ref List
data	TokenNameIdentifier	 data
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
buffer	TokenNameIdentifier	 buffer
;	TokenNameSEMICOLON	
File	TokenNameIdentifier	 File
tempFile	TokenNameIdentifier	 temp File
=	TokenNameEQUAL	
File	TokenNameIdentifier	 File
.	TokenNameDOT	
createTempFile	TokenNameIdentifier	 create Temp File
(	TokenNameLPAREN	
"sort"	TokenNameStringLiteral	sort
,	TokenNameCOMMA	
"partition"	TokenNameStringLiteral	partition
,	TokenNameCOMMA	
tempDirectory	TokenNameIdentifier	 temp Directory
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
long	TokenNamelong	
start	TokenNameIdentifier	 start
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
currentTimeMillis	TokenNameIdentifier	 current Time Millis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sortInfo	TokenNameIdentifier	 sort Info
.	TokenNameDOT	
sortTime	TokenNameIdentifier	 sort Time
+=	TokenNamePLUS_EQUAL	
(	TokenNameLPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
currentTimeMillis	TokenNameIdentifier	 current Time Millis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
start	TokenNameIdentifier	 start
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
ByteSequencesWriter	TokenNameIdentifier	 Byte Sequences Writer
out	TokenNameIdentifier	 out
=	TokenNameEQUAL	
new	TokenNamenew	
ByteSequencesWriter	TokenNameIdentifier	 Byte Sequences Writer
(	TokenNameLPAREN	
tempFile	TokenNameIdentifier	 temp File
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
BytesRef	TokenNameIdentifier	 Bytes Ref
spare	TokenNameIdentifier	 spare
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
BytesRefIterator	TokenNameIdentifier	 Bytes Ref Iterator
iter	TokenNameIdentifier	 iter
=	TokenNameEQUAL	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
comparator	TokenNameIdentifier	 comparator
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
spare	TokenNameIdentifier	 spare
=	TokenNameEQUAL	
iter	TokenNameIdentifier	 iter
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assert	TokenNameassert	
spare	TokenNameIdentifier	 spare
.	TokenNameDOT	
length	TokenNameIdentifier	 length
<=	TokenNameLESS_EQUAL	
Short	TokenNameIdentifier	 Short
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
spare	TokenNameIdentifier	 spare
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Clean up the buffer for the next partition. 	TokenNameCOMMENT_LINE	Clean up the buffer for the next partition. 
data	TokenNameIdentifier	 data
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
tempFile	TokenNameIdentifier	 temp File
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
IOUtils	TokenNameIdentifier	 IO Utils
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
out	TokenNameIdentifier	 out
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** Merge a list of sorted temporary files (partitions) into an output file */	TokenNameCOMMENT_JAVADOC	 Merge a list of sorted temporary files (partitions) into an output file 
void	TokenNamevoid	
mergePartitions	TokenNameIdentifier	 merge Partitions
(	TokenNameLPAREN	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
File	TokenNameIdentifier	 File
>	TokenNameGREATER	
merges	TokenNameIdentifier	 merges
,	TokenNameCOMMA	
File	TokenNameIdentifier	 File
outputFile	TokenNameIdentifier	 output File
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
long	TokenNamelong	
start	TokenNameIdentifier	 start
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
currentTimeMillis	TokenNameIdentifier	 current Time Millis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ByteSequencesWriter	TokenNameIdentifier	 Byte Sequences Writer
out	TokenNameIdentifier	 out
=	TokenNameEQUAL	
new	TokenNamenew	
ByteSequencesWriter	TokenNameIdentifier	 Byte Sequences Writer
(	TokenNameLPAREN	
outputFile	TokenNameIdentifier	 output File
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
merges	TokenNameIdentifier	 merges
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
PriorityQueue	TokenNameIdentifier	 Priority Queue
<	TokenNameLESS	
FileAndTop	TokenNameIdentifier	 File And Top
>	TokenNameGREATER	
queue	TokenNameIdentifier	 queue
=	TokenNameEQUAL	
new	TokenNamenew	
PriorityQueue	TokenNameIdentifier	 Priority Queue
<	TokenNameLESS	
FileAndTop	TokenNameIdentifier	 File And Top
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
{	TokenNameLBRACE	
initialize	TokenNameIdentifier	 initialize
(	TokenNameLPAREN	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
boolean	TokenNameboolean	
lessThan	TokenNameIdentifier	 less Than
(	TokenNameLPAREN	
FileAndTop	TokenNameIdentifier	 File And Top
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
FileAndTop	TokenNameIdentifier	 File And Top
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
comparator	TokenNameIdentifier	 comparator
.	TokenNameDOT	
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
.	TokenNameDOT	
current	TokenNameIdentifier	 current
,	TokenNameCOMMA	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
ByteSequencesReader	TokenNameIdentifier	 Byte Sequences Reader
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
streams	TokenNameIdentifier	 streams
=	TokenNameEQUAL	
new	TokenNamenew	
ByteSequencesReader	TokenNameIdentifier	 Byte Sequences Reader
[	TokenNameLBRACKET	
merges	TokenNameIdentifier	 merges
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
// Open streams and read the top for each file 	TokenNameCOMMENT_LINE	Open streams and read the top for each file 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
merges	TokenNameIdentifier	 merges
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
streams	TokenNameIdentifier	 streams
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
ByteSequencesReader	TokenNameIdentifier	 Byte Sequences Reader
(	TokenNameLPAREN	
merges	TokenNameIdentifier	 merges
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
byte	TokenNamebyte	
line	TokenNameIdentifier	 line
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
streams	TokenNameIdentifier	 streams
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
line	TokenNameIdentifier	 line
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
queue	TokenNameIdentifier	 queue
.	TokenNameDOT	
insertWithOverflow	TokenNameIdentifier	 insert With Overflow
(	TokenNameLPAREN	
new	TokenNamenew	
FileAndTop	TokenNameIdentifier	 File And Top
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
line	TokenNameIdentifier	 line
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// Unix utility sort() uses ordered array of files to pick the next line from, updating 	TokenNameCOMMENT_LINE	Unix utility sort() uses ordered array of files to pick the next line from, updating 
// it as it reads new lines. The PQ used here is a more elegant solution and has 	TokenNameCOMMENT_LINE	it as it reads new lines. The PQ used here is a more elegant solution and has 
// a nicer theoretical complexity bound :) The entire sorting process is I/O bound anyway 	TokenNameCOMMENT_LINE	a nicer theoretical complexity bound :) The entire sorting process is I/O bound anyway 
// so it shouldn't make much of a difference (didn't check). 	TokenNameCOMMENT_LINE	so it shouldn't make much of a difference (didn't check). 
FileAndTop	TokenNameIdentifier	 File And Top
top	TokenNameIdentifier	 top
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
top	TokenNameIdentifier	 top
=	TokenNameEQUAL	
queue	TokenNameIdentifier	 queue
.	TokenNameDOT	
top	TokenNameIdentifier	 top
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
top	TokenNameIdentifier	 top
.	TokenNameDOT	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
streams	TokenNameIdentifier	 streams
[	TokenNameLBRACKET	
top	TokenNameIdentifier	 top
.	TokenNameDOT	
fd	TokenNameIdentifier	 fd
]	TokenNameRBRACKET	
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
top	TokenNameIdentifier	 top
.	TokenNameDOT	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
queue	TokenNameIdentifier	 queue
.	TokenNameDOT	
pop	TokenNameIdentifier	 pop
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
queue	TokenNameIdentifier	 queue
.	TokenNameDOT	
updateTop	TokenNameIdentifier	 update Top
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
sortInfo	TokenNameIdentifier	 sort Info
.	TokenNameDOT	
mergeTime	TokenNameIdentifier	 merge Time
+=	TokenNamePLUS_EQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
currentTimeMillis	TokenNameIdentifier	 current Time Millis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
start	TokenNameIdentifier	 start
;	TokenNameSEMICOLON	
sortInfo	TokenNameIdentifier	 sort Info
.	TokenNameDOT	
mergeRounds	TokenNameIdentifier	 merge Rounds
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
// The logic below is: if an exception occurs in closing out, it has a priority over exceptions 	TokenNameCOMMENT_LINE	The logic below is: if an exception occurs in closing out, it has a priority over exceptions 
// happening in closing streams. 	TokenNameCOMMENT_LINE	happening in closing streams. 
try	TokenNametry	
{	TokenNameLBRACE	
IOUtils	TokenNameIdentifier	 IO Utils
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
streams	TokenNameIdentifier	 streams
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
IOUtils	TokenNameIdentifier	 IO Utils
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
out	TokenNameIdentifier	 out
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** Read in a single partition of data */	TokenNameCOMMENT_JAVADOC	 Read in a single partition of data 
int	TokenNameint	
readPartition	TokenNameIdentifier	 read Partition
(	TokenNameLPAREN	
ByteSequencesReader	TokenNameIdentifier	 Byte Sequences Reader
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
long	TokenNamelong	
start	TokenNameIdentifier	 start
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
currentTimeMillis	TokenNameIdentifier	 current Time Millis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
BytesRef	TokenNameIdentifier	 Bytes Ref
scratch	TokenNameIdentifier	 scratch
=	TokenNameEQUAL	
new	TokenNamenew	
BytesRef	TokenNameIdentifier	 Bytes Ref
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
scratch	TokenNameIdentifier	 scratch
.	TokenNameDOT	
bytes	TokenNameIdentifier	 bytes
=	TokenNameEQUAL	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
scratch	TokenNameIdentifier	 scratch
.	TokenNameDOT	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
scratch	TokenNameIdentifier	 scratch
.	TokenNameDOT	
bytes	TokenNameIdentifier	 bytes
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
scratch	TokenNameIdentifier	 scratch
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Account for the created objects. 	TokenNameCOMMENT_LINE	Account for the created objects. 
// (buffer slots do not account to buffer size.) 	TokenNameCOMMENT_LINE	(buffer slots do not account to buffer size.) 
if	TokenNameif	
(	TokenNameLPAREN	
ramBufferSize	TokenNameIdentifier	 ram Buffer Size
.	TokenNameDOT	
bytes	TokenNameIdentifier	 bytes
<	TokenNameLESS	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
bytesUsed	TokenNameIdentifier	 bytes Used
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
sortInfo	TokenNameIdentifier	 sort Info
.	TokenNameDOT	
readTime	TokenNameIdentifier	 read Time
+=	TokenNamePLUS_EQUAL	
(	TokenNameLPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
currentTimeMillis	TokenNameIdentifier	 current Time Millis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
start	TokenNameIdentifier	 start
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
static	TokenNamestatic	
class	TokenNameclass	
FileAndTop	TokenNameIdentifier	 File And Top
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
fd	TokenNameIdentifier	 fd
;	TokenNameSEMICOLON	
final	TokenNamefinal	
BytesRef	TokenNameIdentifier	 Bytes Ref
current	TokenNameIdentifier	 current
;	TokenNameSEMICOLON	
FileAndTop	TokenNameIdentifier	 File And Top
(	TokenNameLPAREN	
int	TokenNameint	
fd	TokenNameIdentifier	 fd
,	TokenNameCOMMA	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
firstLine	TokenNameIdentifier	 first Line
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
fd	TokenNameIdentifier	 fd
=	TokenNameEQUAL	
fd	TokenNameIdentifier	 fd
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
current	TokenNameIdentifier	 current
=	TokenNameEQUAL	
new	TokenNamenew	
BytesRef	TokenNameIdentifier	 Bytes Ref
(	TokenNameLPAREN	
firstLine	TokenNameIdentifier	 first Line
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Utility class to emit length-prefixed byte[] entries to an output stream for sorting. * Complementary to {@link ByteSequencesReader}. */	TokenNameCOMMENT_JAVADOC	 Utility class to emit length-prefixed byte[] entries to an output stream for sorting. Complementary to {@link ByteSequencesReader}. 
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
ByteSequencesWriter	TokenNameIdentifier	 Byte Sequences Writer
implements	TokenNameimplements	
Closeable	TokenNameIdentifier	 Closeable
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
DataOutput	TokenNameIdentifier	 Data Output
os	TokenNameIdentifier	 os
;	TokenNameSEMICOLON	
public	TokenNamepublic	
ByteSequencesWriter	TokenNameIdentifier	 Byte Sequences Writer
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
new	TokenNamenew	
DataOutputStream	TokenNameIdentifier	 Data Output Stream
(	TokenNameLPAREN	
new	TokenNamenew	
BufferedOutputStream	TokenNameIdentifier	 Buffered Output Stream
(	TokenNameLPAREN	
new	TokenNamenew	
FileOutputStream	TokenNameIdentifier	 File Output Stream
(	TokenNameLPAREN	
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
ByteSequencesWriter	TokenNameIdentifier	 Byte Sequences Writer
(	TokenNameLPAREN	
DataOutput	TokenNameIdentifier	 Data Output
os	TokenNameIdentifier	 os
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
os	TokenNameIdentifier	 os
=	TokenNameEQUAL	
os	TokenNameIdentifier	 os
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
BytesRef	TokenNameIdentifier	 Bytes Ref
ref	TokenNameIdentifier	 ref
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
assert	TokenNameassert	
ref	TokenNameIdentifier	 ref
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
ref	TokenNameIdentifier	 ref
.	TokenNameDOT	
bytes	TokenNameIdentifier	 bytes
,	TokenNameCOMMA	
ref	TokenNameIdentifier	 ref
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
ref	TokenNameIdentifier	 ref
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
bytes	TokenNameIdentifier	 bytes
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
bytes	TokenNameIdentifier	 bytes
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
bytes	TokenNameIdentifier	 bytes
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
bytes	TokenNameIdentifier	 bytes
,	TokenNameCOMMA	
int	TokenNameint	
off	TokenNameIdentifier	 off
,	TokenNameCOMMA	
int	TokenNameint	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
assert	TokenNameassert	
bytes	TokenNameIdentifier	 bytes
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
off	TokenNameIdentifier	 off
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
off	TokenNameIdentifier	 off
+	TokenNamePLUS	
len	TokenNameIdentifier	 len
<=	TokenNameLESS_EQUAL	
bytes	TokenNameIdentifier	 bytes
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
assert	TokenNameassert	
len	TokenNameIdentifier	 len
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
os	TokenNameIdentifier	 os
.	TokenNameDOT	
writeShort	TokenNameIdentifier	 write Short
(	TokenNameLPAREN	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
os	TokenNameIdentifier	 os
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
bytes	TokenNameIdentifier	 bytes
,	TokenNameCOMMA	
off	TokenNameIdentifier	 off
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Closes the provided {@link DataOutput} if it is {@link Closeable}. */	TokenNameCOMMENT_JAVADOC	 Closes the provided {@link DataOutput} if it is {@link Closeable}. 
//@Override - not until Java 6 	TokenNameCOMMENT_LINE	@Override - not until Java 6 
public	TokenNamepublic	
void	TokenNamevoid	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
os	TokenNameIdentifier	 os
instanceof	TokenNameinstanceof	
Closeable	TokenNameIdentifier	 Closeable
)	TokenNameRPAREN	
{	TokenNameLBRACE	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Closeable	TokenNameIdentifier	 Closeable
)	TokenNameRPAREN	
os	TokenNameIdentifier	 os
)	TokenNameRPAREN	
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Utility class to read length-prefixed byte[] entries from an input. * Complementary to {@link ByteSequencesWriter}. */	TokenNameCOMMENT_JAVADOC	 Utility class to read length-prefixed byte[] entries from an input. Complementary to {@link ByteSequencesWriter}. 
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
ByteSequencesReader	TokenNameIdentifier	 Byte Sequences Reader
implements	TokenNameimplements	
Closeable	TokenNameIdentifier	 Closeable
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
DataInput	TokenNameIdentifier	 Data Input
is	TokenNameIdentifier	 is
;	TokenNameSEMICOLON	
public	TokenNamepublic	
ByteSequencesReader	TokenNameIdentifier	 Byte Sequences Reader
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
new	TokenNamenew	
DataInputStream	TokenNameIdentifier	 Data Input Stream
(	TokenNameLPAREN	
new	TokenNamenew	
BufferedInputStream	TokenNameIdentifier	 Buffered Input Stream
(	TokenNameLPAREN	
new	TokenNamenew	
FileInputStream	TokenNameIdentifier	 File Input Stream
(	TokenNameLPAREN	
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
ByteSequencesReader	TokenNameIdentifier	 Byte Sequences Reader
(	TokenNameLPAREN	
DataInput	TokenNameIdentifier	 Data Input
is	TokenNameIdentifier	 is
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
is	TokenNameIdentifier	 is
=	TokenNameEQUAL	
is	TokenNameIdentifier	 is
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Reads the next entry into the provided {@link BytesRef}. The internal * storage is resized if needed. * * @return Returns <code>false</code> if EOF occurred when trying to read * the header of the next sequence. Returns <code>true</code> otherwise. * @throws EOFException if the file ends before the full sequence is read. */	TokenNameCOMMENT_JAVADOC	 Reads the next entry into the provided {@link BytesRef}. The internal storage is resized if needed. * @return Returns <code>false</code> if EOF occurred when trying to read the header of the next sequence. Returns <code>true</code> otherwise. @throws EOFException if the file ends before the full sequence is read. 
public	TokenNamepublic	
boolean	TokenNameboolean	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
BytesRef	TokenNameIdentifier	 Bytes Ref
ref	TokenNameIdentifier	 ref
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
short	TokenNameshort	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
is	TokenNameIdentifier	 is
.	TokenNameDOT	
readShort	TokenNameIdentifier	 read Short
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
EOFException	TokenNameIdentifier	 EOF Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
ref	TokenNameIdentifier	 ref
.	TokenNameDOT	
grow	TokenNameIdentifier	 grow
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ref	TokenNameIdentifier	 ref
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
ref	TokenNameIdentifier	 ref
.	TokenNameDOT	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
is	TokenNameIdentifier	 is
.	TokenNameDOT	
readFully	TokenNameIdentifier	 read Fully
(	TokenNameLPAREN	
ref	TokenNameIdentifier	 ref
.	TokenNameDOT	
bytes	TokenNameIdentifier	 bytes
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Reads the next entry and returns it if successful. * * @see #read(BytesRef) * * @return Returns <code>null</code> if EOF occurred before the next entry * could be read. * @throws EOFException if the file ends before the full sequence is read. */	TokenNameCOMMENT_JAVADOC	 Reads the next entry and returns it if successful. * @see #read(BytesRef) * @return Returns <code>null</code> if EOF occurred before the next entry could be read. @throws EOFException if the file ends before the full sequence is read. 
public	TokenNamepublic	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
short	TokenNameshort	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
is	TokenNameIdentifier	 is
.	TokenNameDOT	
readShort	TokenNameIdentifier	 read Short
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
EOFException	TokenNameIdentifier	 EOF Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
assert	TokenNameassert	
length	TokenNameIdentifier	 length
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
"Sanity: sequence length < 0: "	TokenNameStringLiteral	Sanity: sequence length < 0: 
+	TokenNamePLUS	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
length	TokenNameIdentifier	 length
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
is	TokenNameIdentifier	 is
.	TokenNameDOT	
readFully	TokenNameIdentifier	 read Fully
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Closes the provided {@link DataInput} if it is {@link Closeable}. */	TokenNameCOMMENT_JAVADOC	 Closes the provided {@link DataInput} if it is {@link Closeable}. 
//@Override - not until Java 6 	TokenNameCOMMENT_LINE	@Override - not until Java 6 
public	TokenNamepublic	
void	TokenNamevoid	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
is	TokenNameIdentifier	 is
instanceof	TokenNameinstanceof	
Closeable	TokenNameIdentifier	 Closeable
)	TokenNameRPAREN	
{	TokenNameLBRACE	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Closeable	TokenNameIdentifier	 Closeable
)	TokenNameRPAREN	
is	TokenNameIdentifier	 is
)	TokenNameRPAREN	
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
Comparator	TokenNameIdentifier	 Comparator
<	TokenNameLESS	
BytesRef	TokenNameIdentifier	 Bytes Ref
>	TokenNameGREATER	
getComparator	TokenNameIdentifier	 get Comparator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
comparator	TokenNameIdentifier	 comparator
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
