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
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with this * work for additional information regarding copyright ownership. The ASF * licenses this file to You under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the * License for the specific language governing permissions and limitations under * the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Arrays	TokenNameIdentifier	 Arrays
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Comparator	TokenNameIdentifier	 Comparator
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
concurrent	TokenNameIdentifier	 concurrent
.	TokenNameDOT	
atomic	TokenNameIdentifier	 atomic
.	TokenNameDOT	
AtomicLong	TokenNameIdentifier	 Atomic Long
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
ArrayUtil	TokenNameIdentifier	 Array Util
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
ByteBlockPool	TokenNameIdentifier	 Byte Block Pool
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
BytesRef	TokenNameIdentifier	 Bytes Ref
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
BytesRefIterator	TokenNameIdentifier	 Bytes Ref Iterator
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
RamUsageEstimator	TokenNameIdentifier	 Ram Usage Estimator
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
SorterTemplate	TokenNameIdentifier	 Sorter Template
;	TokenNameSEMICOLON	
/** * A simple append only random-access {@link BytesRef} array that stores full * copies of the appended bytes in a {@link ByteBlockPool}. * * * <b>Note: This class is not Thread-Safe!</b> * * @lucene.internal * @lucene.experimental */	TokenNameCOMMENT_JAVADOC	 A simple append only random-access {@link BytesRef} array that stores full copies of the appended bytes in a {@link ByteBlockPool}. * <b>Note: This class is not Thread-Safe!</b> * @lucene.internal @lucene.experimental 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
BytesRefList	TokenNameIdentifier	 Bytes Ref List
{	TokenNameLBRACE	
// TODO rename to BytesRefArray 	TokenNameCOMMENT_LINE	TODO rename to BytesRefArray 
private	TokenNameprivate	
final	TokenNamefinal	
ByteBlockPool	TokenNameIdentifier	 Byte Block Pool
pool	TokenNameIdentifier	 pool
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
offsets	TokenNameIdentifier	 offsets
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
lastElement	TokenNameIdentifier	 last Element
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
currentOffset	TokenNameIdentifier	 current Offset
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
AtomicLong	TokenNameIdentifier	 Atomic Long
bytesUsed	TokenNameIdentifier	 bytes Used
=	TokenNameEQUAL	
new	TokenNamenew	
AtomicLong	TokenNameIdentifier	 Atomic Long
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Creates a new {@link BytesRefList} */	TokenNameCOMMENT_JAVADOC	 Creates a new {@link BytesRefList} 
public	TokenNamepublic	
BytesRefList	TokenNameIdentifier	 Bytes Ref List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
pool	TokenNameIdentifier	 pool
=	TokenNameEQUAL	
new	TokenNamenew	
ByteBlockPool	TokenNameIdentifier	 Byte Block Pool
(	TokenNameLPAREN	
new	TokenNamenew	
ByteBlockPool	TokenNameIdentifier	 Byte Block Pool
.	TokenNameDOT	
DirectTrackingAllocator	TokenNameIdentifier	 Direct Tracking Allocator
(	TokenNameLPAREN	
bytesUsed	TokenNameIdentifier	 bytes Used
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pool	TokenNameIdentifier	 pool
.	TokenNameDOT	
nextBuffer	TokenNameIdentifier	 next Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bytesUsed	TokenNameIdentifier	 bytes Used
.	TokenNameDOT	
addAndGet	TokenNameIdentifier	 add And Get
(	TokenNameLPAREN	
RamUsageEstimator	TokenNameIdentifier	 Ram Usage Estimator
.	TokenNameDOT	
NUM_BYTES_ARRAY_HEADER	TokenNameIdentifier	 NUM  BYTES  ARRAY  HEADER
+	TokenNamePLUS	
RamUsageEstimator	TokenNameIdentifier	 Ram Usage Estimator
.	TokenNameDOT	
NUM_BYTES_INT	TokenNameIdentifier	 NUM  BYTES  INT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Clears this {@link BytesRefList} */	TokenNameCOMMENT_JAVADOC	 Clears this {@link BytesRefList} 
public	TokenNamepublic	
void	TokenNamevoid	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
lastElement	TokenNameIdentifier	 last Element
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
currentOffset	TokenNameIdentifier	 current Offset
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
fill	TokenNameIdentifier	 fill
(	TokenNameLPAREN	
offsets	TokenNameIdentifier	 offsets
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pool	TokenNameIdentifier	 pool
.	TokenNameDOT	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Appends a copy of the given {@link BytesRef} to this {@link BytesRefList}. * @param bytes the bytes to append * @return the ordinal of the appended bytes */	TokenNameCOMMENT_JAVADOC	 Appends a copy of the given {@link BytesRef} to this {@link BytesRefList}. @param bytes the bytes to append @return the ordinal of the appended bytes 
public	TokenNamepublic	
int	TokenNameint	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
BytesRef	TokenNameIdentifier	 Bytes Ref
bytes	TokenNameIdentifier	 bytes
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
lastElement	TokenNameIdentifier	 last Element
>=	TokenNameGREATER_EQUAL	
offsets	TokenNameIdentifier	 offsets
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
oldLen	TokenNameIdentifier	 old Len
=	TokenNameEQUAL	
offsets	TokenNameIdentifier	 offsets
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
offsets	TokenNameIdentifier	 offsets
=	TokenNameEQUAL	
ArrayUtil	TokenNameIdentifier	 Array Util
.	TokenNameDOT	
grow	TokenNameIdentifier	 grow
(	TokenNameLPAREN	
offsets	TokenNameIdentifier	 offsets
,	TokenNameCOMMA	
offsets	TokenNameIdentifier	 offsets
.	TokenNameDOT	
length	TokenNameIdentifier	 length
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bytesUsed	TokenNameIdentifier	 bytes Used
.	TokenNameDOT	
addAndGet	TokenNameIdentifier	 add And Get
(	TokenNameLPAREN	
(	TokenNameLPAREN	
offsets	TokenNameIdentifier	 offsets
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
oldLen	TokenNameIdentifier	 old Len
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
RamUsageEstimator	TokenNameIdentifier	 Ram Usage Estimator
.	TokenNameDOT	
NUM_BYTES_INT	TokenNameIdentifier	 NUM  BYTES  INT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
pool	TokenNameIdentifier	 pool
.	TokenNameDOT	
copy	TokenNameIdentifier	 copy
(	TokenNameLPAREN	
bytes	TokenNameIdentifier	 bytes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
offsets	TokenNameIdentifier	 offsets
[	TokenNameLBRACKET	
lastElement	TokenNameIdentifier	 last Element
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
currentOffset	TokenNameIdentifier	 current Offset
;	TokenNameSEMICOLON	
currentOffset	TokenNameIdentifier	 current Offset
+=	TokenNamePLUS_EQUAL	
bytes	TokenNameIdentifier	 bytes
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
return	TokenNamereturn	
lastElement	TokenNameIdentifier	 last Element
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the current size of this {@link BytesRefList} * @return the current size of this {@link BytesRefList} */	TokenNameCOMMENT_JAVADOC	 Returns the current size of this {@link BytesRefList} @return the current size of this {@link BytesRefList} 
public	TokenNamepublic	
int	TokenNameint	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
lastElement	TokenNameIdentifier	 last Element
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the <i>n'th</i> element of this {@link BytesRefList} * @param spare a spare {@link BytesRef} instance * @param ord the elements ordinal to retrieve * @return the <i>n'th</i> element of this {@link BytesRefList} */	TokenNameCOMMENT_JAVADOC	 Returns the <i>n'th</i> element of this {@link BytesRefList} @param spare a spare {@link BytesRef} instance @param ord the elements ordinal to retrieve @return the <i>n'th</i> element of this {@link BytesRefList} 
public	TokenNamepublic	
BytesRef	TokenNameIdentifier	 Bytes Ref
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
BytesRef	TokenNameIdentifier	 Bytes Ref
spare	TokenNameIdentifier	 spare
,	TokenNameCOMMA	
int	TokenNameint	
ord	TokenNameIdentifier	 ord
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
lastElement	TokenNameIdentifier	 last Element
>	TokenNameGREATER	
ord	TokenNameIdentifier	 ord
)	TokenNameRPAREN	
{	TokenNameLBRACE	
spare	TokenNameIdentifier	 spare
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
offsets	TokenNameIdentifier	 offsets
[	TokenNameLBRACKET	
ord	TokenNameIdentifier	 ord
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
spare	TokenNameIdentifier	 spare
.	TokenNameDOT	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
ord	TokenNameIdentifier	 ord
==	TokenNameEQUAL_EQUAL	
lastElement	TokenNameIdentifier	 last Element
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
?	TokenNameQUESTION	
currentOffset	TokenNameIdentifier	 current Offset
-	TokenNameMINUS	
spare	TokenNameIdentifier	 spare
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
:	TokenNameCOLON	
offsets	TokenNameIdentifier	 offsets
[	TokenNameLBRACKET	
ord	TokenNameIdentifier	 ord
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
-	TokenNameMINUS	
spare	TokenNameIdentifier	 spare
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
;	TokenNameSEMICOLON	
pool	TokenNameIdentifier	 pool
.	TokenNameDOT	
copyFrom	TokenNameIdentifier	 copy From
(	TokenNameLPAREN	
spare	TokenNameIdentifier	 spare
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
spare	TokenNameIdentifier	 spare
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IndexOutOfBoundsException	TokenNameIdentifier	 Index Out Of Bounds Exception
(	TokenNameLPAREN	
"index "	TokenNameStringLiteral	index 
+	TokenNamePLUS	
ord	TokenNameIdentifier	 ord
+	TokenNamePLUS	
" must be less than the size: "	TokenNameStringLiteral	 must be less than the size: 
+	TokenNamePLUS	
lastElement	TokenNameIdentifier	 last Element
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the number internally used bytes to hold the appended bytes in * memory * * @return the number internally used bytes to hold the appended bytes in * memory */	TokenNameCOMMENT_JAVADOC	 Returns the number internally used bytes to hold the appended bytes in memory * @return the number internally used bytes to hold the appended bytes in memory 
public	TokenNamepublic	
long	TokenNamelong	
bytesUsed	TokenNameIdentifier	 bytes Used
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
bytesUsed	TokenNameIdentifier	 bytes Used
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
sort	TokenNameIdentifier	 sort
(	TokenNameLPAREN	
final	TokenNamefinal	
Comparator	TokenNameIdentifier	 Comparator
<	TokenNameLESS	
BytesRef	TokenNameIdentifier	 Bytes Ref
>	TokenNameGREATER	
comp	TokenNameIdentifier	 comp
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
orderdEntries	TokenNameIdentifier	 orderd Entries
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
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
orderdEntries	TokenNameIdentifier	 orderd Entries
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
orderdEntries	TokenNameIdentifier	 orderd Entries
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
new	TokenNamenew	
SorterTemplate	TokenNameIdentifier	 Sorter Template
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
void	TokenNamevoid	
swap	TokenNameIdentifier	 swap
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
int	TokenNameint	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
o	TokenNameIdentifier	 o
=	TokenNameEQUAL	
orderdEntries	TokenNameIdentifier	 orderd Entries
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
orderdEntries	TokenNameIdentifier	 orderd Entries
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
orderdEntries	TokenNameIdentifier	 orderd Entries
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
orderdEntries	TokenNameIdentifier	 orderd Entries
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
o	TokenNameIdentifier	 o
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
int	TokenNameint	
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
int	TokenNameint	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
ord1	TokenNameIdentifier	 ord1
=	TokenNameEQUAL	
orderdEntries	TokenNameIdentifier	 orderd Entries
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
ord2	TokenNameIdentifier	 ord2
=	TokenNameEQUAL	
orderdEntries	TokenNameIdentifier	 orderd Entries
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
comp	TokenNameIdentifier	 comp
.	TokenNameDOT	
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
scratch1	TokenNameIdentifier	 scratch1
,	TokenNameCOMMA	
ord1	TokenNameIdentifier	 ord1
)	TokenNameRPAREN	
,	TokenNameCOMMA	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
scratch2	TokenNameIdentifier	 scratch2
,	TokenNameCOMMA	
ord2	TokenNameIdentifier	 ord2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
void	TokenNamevoid	
setPivot	TokenNameIdentifier	 set Pivot
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
ord	TokenNameIdentifier	 ord
=	TokenNameEQUAL	
orderdEntries	TokenNameIdentifier	 orderd Entries
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
pivot	TokenNameIdentifier	 pivot
,	TokenNameCOMMA	
ord	TokenNameIdentifier	 ord
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
int	TokenNameint	
comparePivot	TokenNameIdentifier	 compare Pivot
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
ord	TokenNameIdentifier	 ord
=	TokenNameEQUAL	
orderdEntries	TokenNameIdentifier	 orderd Entries
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
comp	TokenNameIdentifier	 comp
.	TokenNameDOT	
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
pivot	TokenNameIdentifier	 pivot
,	TokenNameCOMMA	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
scratch2	TokenNameIdentifier	 scratch2
,	TokenNameCOMMA	
ord	TokenNameIdentifier	 ord
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
BytesRef	TokenNameIdentifier	 Bytes Ref
pivot	TokenNameIdentifier	 pivot
=	TokenNameEQUAL	
new	TokenNamenew	
BytesRef	TokenNameIdentifier	 Bytes Ref
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
scratch1	TokenNameIdentifier	 scratch1
=	TokenNameEQUAL	
new	TokenNamenew	
BytesRef	TokenNameIdentifier	 Bytes Ref
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
scratch2	TokenNameIdentifier	 scratch2
=	TokenNameEQUAL	
new	TokenNamenew	
BytesRef	TokenNameIdentifier	 Bytes Ref
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
.	TokenNameDOT	
quickSort	TokenNameIdentifier	 quick Sort
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
orderdEntries	TokenNameIdentifier	 orderd Entries
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * sugar for {@link #iterator(Comparator)} with a <code>null</code> comparator */	TokenNameCOMMENT_JAVADOC	 sugar for {@link #iterator(Comparator)} with a <code>null</code> comparator 
public	TokenNamepublic	
BytesRefIterator	TokenNameIdentifier	 Bytes Ref Iterator
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <p> * Returns a {@link BytesRefIterator} with point in time semantics. The * iterator provides access to all so far appended {@link BytesRef} instances. * </p> * <p> * If a non <code>null</code> {@link Comparator} is provided the iterator will * iterate the byte values in the order specified by the comparator. Otherwise * the order is the same as the values were appended. * </p> * <p> * This is a non-destructive operation. * </p> */	TokenNameCOMMENT_JAVADOC	 <p> Returns a {@link BytesRefIterator} with point in time semantics. The iterator provides access to all so far appended {@link BytesRef} instances. </p> <p> If a non <code>null</code> {@link Comparator} is provided the iterator will iterate the byte values in the order specified by the comparator. Otherwise the order is the same as the values were appended. </p> <p> This is a non-destructive operation. </p> 
public	TokenNamepublic	
BytesRefIterator	TokenNameIdentifier	 Bytes Ref Iterator
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
final	TokenNamefinal	
Comparator	TokenNameIdentifier	 Comparator
<	TokenNameLESS	
BytesRef	TokenNameIdentifier	 Bytes Ref
>	TokenNameGREATER	
comp	TokenNameIdentifier	 comp
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
BytesRef	TokenNameIdentifier	 Bytes Ref
spare	TokenNameIdentifier	 spare
=	TokenNameEQUAL	
new	TokenNamenew	
BytesRef	TokenNameIdentifier	 Bytes Ref
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
ords	TokenNameIdentifier	 ords
=	TokenNameEQUAL	
comp	TokenNameIdentifier	 comp
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
null	TokenNamenull	
:	TokenNameCOLON	
sort	TokenNameIdentifier	 sort
(	TokenNameLPAREN	
comp	TokenNameIdentifier	 comp
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
BytesRefIterator	TokenNameIdentifier	 Bytes Ref Iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
pos	TokenNameIdentifier	 pos
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
//@Override - not until Java 6 	TokenNameCOMMENT_LINE	@Override - not until Java 6 
public	TokenNamepublic	
BytesRef	TokenNameIdentifier	 Bytes Ref
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
<	TokenNameLESS	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
spare	TokenNameIdentifier	 spare
,	TokenNameCOMMA	
ords	TokenNameIdentifier	 ords
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
pos	TokenNameIdentifier	 pos
++	TokenNamePLUS_PLUS	
:	TokenNameCOLON	
ords	TokenNameIdentifier	 ords
[	TokenNameLBRACKET	
pos	TokenNameIdentifier	 pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//@Override - not until Java 6 	TokenNameCOMMENT_LINE	@Override - not until Java 6 
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
comp	TokenNameIdentifier	 comp
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
