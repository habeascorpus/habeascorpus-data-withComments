/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Arrays	TokenNameIdentifier	 Arrays
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
AtomicLongArray	TokenNameIdentifier	 Atomic Long Array
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
db	TokenNameIdentifier	 db
.	TokenNameDOT	
TypeSizes	TokenNameIdentifier	 Type Sizes
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
ISerializer	TokenNameIdentifier	 I Serializer
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
EstimatedHistogram	TokenNameIdentifier	 Estimated Histogram
{	TokenNameLBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
EstimatedHistogramSerializer	TokenNameIdentifier	 Estimated Histogram Serializer
serializer	TokenNameIdentifier	 serializer
=	TokenNameEQUAL	
new	TokenNamenew	
EstimatedHistogramSerializer	TokenNameIdentifier	 Estimated Histogram Serializer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * The series of values to which the counts in `buckets` correspond: * 1, 2, 3, 4, 5, 6, 7, 8, 10, 12, 14, 17, 20, etc. * Thus, a `buckets` of [0, 0, 1, 10] would mean we had seen one value of 3 and 10 values of 4. * * The series starts at 1 and grows by 1.2 each time (rounding and removing duplicates). It goes from 1 * to around 36M by default (creating 90+1 buckets), which will give us timing resolution from microseconds to * 36 seconds, with less precision as the numbers get larger. * * Each bucket represents values from (previous bucket offset, current offset]. */	TokenNameCOMMENT_JAVADOC	 The series of values to which the counts in `buckets` correspond: 1, 2, 3, 4, 5, 6, 7, 8, 10, 12, 14, 17, 20, etc. Thus, a `buckets` of [0, 0, 1, 10] would mean we had seen one value of 3 and 10 values of 4. * The series starts at 1 and grows by 1.2 each time (rounding and removing duplicates). It goes from 1 to around 36M by default (creating 90+1 buckets), which will give us timing resolution from microseconds to 36 seconds, with less precision as the numbers get larger. * Each bucket represents values from (previous bucket offset, current offset]. 
private	TokenNameprivate	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
bucketOffsets	TokenNameIdentifier	 bucket Offsets
;	TokenNameSEMICOLON	
// buckets is one element longer than bucketOffsets -- the last element is values greater than the last offset 	TokenNameCOMMENT_LINE	buckets is one element longer than bucketOffsets -- the last element is values greater than the last offset 
final	TokenNamefinal	
AtomicLongArray	TokenNameIdentifier	 Atomic Long Array
buckets	TokenNameIdentifier	 buckets
;	TokenNameSEMICOLON	
public	TokenNamepublic	
EstimatedHistogram	TokenNameIdentifier	 Estimated Histogram
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
90	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
EstimatedHistogram	TokenNameIdentifier	 Estimated Histogram
(	TokenNameLPAREN	
int	TokenNameint	
bucketCount	TokenNameIdentifier	 bucket Count
)	TokenNameRPAREN	
{	TokenNameLBRACE	
makeOffsets	TokenNameIdentifier	 make Offsets
(	TokenNameLPAREN	
bucketCount	TokenNameIdentifier	 bucket Count
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buckets	TokenNameIdentifier	 buckets
=	TokenNameEQUAL	
new	TokenNamenew	
AtomicLongArray	TokenNameIdentifier	 Atomic Long Array
(	TokenNameLPAREN	
bucketOffsets	TokenNameIdentifier	 bucket Offsets
.	TokenNameDOT	
length	TokenNameIdentifier	 length
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
EstimatedHistogram	TokenNameIdentifier	 Estimated Histogram
(	TokenNameLPAREN	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
offsets	TokenNameIdentifier	 offsets
,	TokenNameCOMMA	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
bucketData	TokenNameIdentifier	 bucket Data
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assert	TokenNameassert	
bucketData	TokenNameIdentifier	 bucket Data
.	TokenNameDOT	
length	TokenNameIdentifier	 length
==	TokenNameEQUAL_EQUAL	
offsets	TokenNameIdentifier	 offsets
.	TokenNameDOT	
length	TokenNameIdentifier	 length
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
bucketOffsets	TokenNameIdentifier	 bucket Offsets
=	TokenNameEQUAL	
offsets	TokenNameIdentifier	 offsets
;	TokenNameSEMICOLON	
buckets	TokenNameIdentifier	 buckets
=	TokenNameEQUAL	
new	TokenNamenew	
AtomicLongArray	TokenNameIdentifier	 Atomic Long Array
(	TokenNameLPAREN	
bucketData	TokenNameIdentifier	 bucket Data
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
makeOffsets	TokenNameIdentifier	 make Offsets
(	TokenNameLPAREN	
int	TokenNameint	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
bucketOffsets	TokenNameIdentifier	 bucket Offsets
=	TokenNameEQUAL	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
size	TokenNameIdentifier	 size
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
long	TokenNamelong	
last	TokenNameIdentifier	 last
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
bucketOffsets	TokenNameIdentifier	 bucket Offsets
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
last	TokenNameIdentifier	 last
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
size	TokenNameIdentifier	 size
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
long	TokenNamelong	
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
round	TokenNameIdentifier	 round
(	TokenNameLPAREN	
last	TokenNameIdentifier	 last
*	TokenNameMULTIPLY	
1.2	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
next	TokenNameIdentifier	 next
==	TokenNameEQUAL_EQUAL	
last	TokenNameIdentifier	 last
)	TokenNameRPAREN	
next	TokenNameIdentifier	 next
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
bucketOffsets	TokenNameIdentifier	 bucket Offsets
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
next	TokenNameIdentifier	 next
;	TokenNameSEMICOLON	
last	TokenNameIdentifier	 last
=	TokenNameEQUAL	
next	TokenNameIdentifier	 next
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * @return the histogram values corresponding to each bucket index */	TokenNameCOMMENT_JAVADOC	 @return the histogram values corresponding to each bucket index 
public	TokenNamepublic	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getBucketOffsets	TokenNameIdentifier	 get Bucket Offsets
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
bucketOffsets	TokenNameIdentifier	 bucket Offsets
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Increments the count of the bucket closest to n, rounding UP. * @param n */	TokenNameCOMMENT_JAVADOC	 Increments the count of the bucket closest to n, rounding UP. @param n 
public	TokenNamepublic	
void	TokenNamevoid	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
long	TokenNamelong	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
binarySearch	TokenNameIdentifier	 binary Search
(	TokenNameLPAREN	
bucketOffsets	TokenNameIdentifier	 bucket Offsets
,	TokenNameCOMMA	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// inexact match, take the first bucket higher than n 	TokenNameCOMMENT_LINE	inexact match, take the first bucket higher than n 
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
-	TokenNameMINUS	
index	TokenNameIdentifier	 index
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// else exact match; we're good 	TokenNameCOMMENT_LINE	else exact match; we're good 
buckets	TokenNameIdentifier	 buckets
.	TokenNameDOT	
incrementAndGet	TokenNameIdentifier	 increment And Get
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return the count in the given bucket */	TokenNameCOMMENT_JAVADOC	 @return the count in the given bucket 
long	TokenNamelong	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
int	TokenNameint	
bucket	TokenNameIdentifier	 bucket
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
buckets	TokenNameIdentifier	 buckets
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
bucket	TokenNameIdentifier	 bucket
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @param reset zero out buckets afterwards if true * @return a long[] containing the current histogram buckets */	TokenNameCOMMENT_JAVADOC	 @param reset zero out buckets afterwards if true @return a long[] containing the current histogram buckets 
public	TokenNamepublic	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getBuckets	TokenNameIdentifier	 get Buckets
(	TokenNameLPAREN	
boolean	TokenNameboolean	
reset	TokenNameIdentifier	 reset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
rv	TokenNameIdentifier	 rv
=	TokenNameEQUAL	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
buckets	TokenNameIdentifier	 buckets
.	TokenNameDOT	
length	TokenNameIdentifier	 length
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
buckets	TokenNameIdentifier	 buckets
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
rv	TokenNameIdentifier	 rv
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
buckets	TokenNameIdentifier	 buckets
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
reset	TokenNameIdentifier	 reset
)	TokenNameRPAREN	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
buckets	TokenNameIdentifier	 buckets
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
buckets	TokenNameIdentifier	 buckets
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
0L	TokenNameLongLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
rv	TokenNameIdentifier	 rv
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return the smallest value that could have been added to this histogram */	TokenNameCOMMENT_JAVADOC	 @return the smallest value that could have been added to this histogram 
public	TokenNamepublic	
long	TokenNamelong	
min	TokenNameIdentifier	 min
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
buckets	TokenNameIdentifier	 buckets
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
buckets	TokenNameIdentifier	 buckets
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
i	TokenNameIdentifier	 i
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
?	TokenNameQUESTION	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
1	TokenNameIntegerLiteral	
+	TokenNamePLUS	
bucketOffsets	TokenNameIdentifier	 bucket Offsets
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return the largest value that could have been added to this histogram. If the histogram * overflowed, returns Long.MAX_VALUE. */	TokenNameCOMMENT_JAVADOC	 @return the largest value that could have been added to this histogram. If the histogram overflowed, returns Long.MAX_VALUE. 
public	TokenNamepublic	
long	TokenNamelong	
max	TokenNameIdentifier	 max
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
lastBucket	TokenNameIdentifier	 last Bucket
=	TokenNameEQUAL	
buckets	TokenNameIdentifier	 buckets
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
buckets	TokenNameIdentifier	 buckets
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
lastBucket	TokenNameIdentifier	 last Bucket
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
Long	TokenNameIdentifier	 Long
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
lastBucket	TokenNameIdentifier	 last Bucket
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
--	TokenNameMINUS_MINUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
buckets	TokenNameIdentifier	 buckets
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
bucketOffsets	TokenNameIdentifier	 bucket Offsets
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @param percentile * @return estimated value at given percentile */	TokenNameCOMMENT_JAVADOC	 @param percentile @return estimated value at given percentile 
public	TokenNamepublic	
long	TokenNamelong	
percentile	TokenNameIdentifier	 percentile
(	TokenNameLPAREN	
double	TokenNamedouble	
percentile	TokenNameIdentifier	 percentile
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assert	TokenNameassert	
percentile	TokenNameIdentifier	 percentile
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
percentile	TokenNameIdentifier	 percentile
<=	TokenNameLESS_EQUAL	
1.0	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
lastBucket	TokenNameIdentifier	 last Bucket
=	TokenNameEQUAL	
buckets	TokenNameIdentifier	 buckets
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
buckets	TokenNameIdentifier	 buckets
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
lastBucket	TokenNameIdentifier	 last Bucket
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalStateException	TokenNameIdentifier	 Illegal State Exception
(	TokenNameLPAREN	
"Unable to compute when histogram overflowed"	TokenNameStringLiteral	Unable to compute when histogram overflowed
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
long	TokenNamelong	
pcount	TokenNameIdentifier	 pcount
=	TokenNameEQUAL	
(	TokenNameLPAREN	
long	TokenNamelong	
)	TokenNameRPAREN	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
floor	TokenNameIdentifier	 floor
(	TokenNameLPAREN	
count	TokenNameIdentifier	 count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
percentile	TokenNameIdentifier	 percentile
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
pcount	TokenNameIdentifier	 pcount
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
long	TokenNamelong	
elements	TokenNameIdentifier	 elements
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
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
lastBucket	TokenNameIdentifier	 last Bucket
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
elements	TokenNameIdentifier	 elements
+=	TokenNamePLUS_EQUAL	
buckets	TokenNameIdentifier	 buckets
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
elements	TokenNameIdentifier	 elements
>=	TokenNameGREATER_EQUAL	
pcount	TokenNameIdentifier	 pcount
)	TokenNameRPAREN	
return	TokenNamereturn	
bucketOffsets	TokenNameIdentifier	 bucket Offsets
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return the mean histogram value (average of bucket offsets, weighted by count) * @throws IllegalStateException if any values were greater than the largest bucket threshold */	TokenNameCOMMENT_JAVADOC	 @return the mean histogram value (average of bucket offsets, weighted by count) @throws IllegalStateException if any values were greater than the largest bucket threshold 
public	TokenNamepublic	
long	TokenNamelong	
mean	TokenNameIdentifier	 mean
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
lastBucket	TokenNameIdentifier	 last Bucket
=	TokenNameEQUAL	
buckets	TokenNameIdentifier	 buckets
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
buckets	TokenNameIdentifier	 buckets
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
lastBucket	TokenNameIdentifier	 last Bucket
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalStateException	TokenNameIdentifier	 Illegal State Exception
(	TokenNameLPAREN	
"Unable to compute ceiling for max when histogram overflowed"	TokenNameStringLiteral	Unable to compute ceiling for max when histogram overflowed
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
long	TokenNamelong	
elements	TokenNameIdentifier	 elements
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
long	TokenNamelong	
sum	TokenNameIdentifier	 sum
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
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
lastBucket	TokenNameIdentifier	 last Bucket
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
elements	TokenNameIdentifier	 elements
+=	TokenNamePLUS_EQUAL	
buckets	TokenNameIdentifier	 buckets
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sum	TokenNameIdentifier	 sum
+=	TokenNamePLUS_EQUAL	
buckets	TokenNameIdentifier	 buckets
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
bucketOffsets	TokenNameIdentifier	 bucket Offsets
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
long	TokenNamelong	
)	TokenNameRPAREN	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
ceil	TokenNameIdentifier	 ceil
(	TokenNameLPAREN	
(	TokenNameLPAREN	
double	TokenNamedouble	
)	TokenNameRPAREN	
sum	TokenNameIdentifier	 sum
/	TokenNameDIVIDE	
elements	TokenNameIdentifier	 elements
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return the total number of non-zero values */	TokenNameCOMMENT_JAVADOC	 @return the total number of non-zero values 
public	TokenNamepublic	
long	TokenNamelong	
count	TokenNameIdentifier	 count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
long	TokenNamelong	
sum	TokenNameIdentifier	 sum
=	TokenNameEQUAL	
0L	TokenNameLongLiteral	
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
buckets	TokenNameIdentifier	 buckets
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
sum	TokenNameIdentifier	 sum
+=	TokenNamePLUS_EQUAL	
buckets	TokenNameIdentifier	 buckets
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
sum	TokenNameIdentifier	 sum
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return true if this histogram has overflowed -- that is, a value larger than our largest bucket could bound was added */	TokenNameCOMMENT_JAVADOC	 @return true if this histogram has overflowed -- that is, a value larger than our largest bucket could bound was added 
public	TokenNamepublic	
boolean	TokenNameboolean	
isOverflowed	TokenNameIdentifier	 is Overflowed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
buckets	TokenNameIdentifier	 buckets
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
buckets	TokenNameIdentifier	 buckets
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
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
this	TokenNamethis	
==	TokenNameEQUAL_EQUAL	
o	TokenNameIdentifier	 o
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
EstimatedHistogram	TokenNameIdentifier	 Estimated Histogram
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
EstimatedHistogram	TokenNameIdentifier	 Estimated Histogram
that	TokenNameIdentifier	 that
=	TokenNameEQUAL	
(	TokenNameLPAREN	
EstimatedHistogram	TokenNameIdentifier	 Estimated Histogram
)	TokenNameRPAREN	
o	TokenNameIdentifier	 o
;	TokenNameSEMICOLON	
return	TokenNamereturn	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
getBucketOffsets	TokenNameIdentifier	 get Bucket Offsets
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
that	TokenNameIdentifier	 that
.	TokenNameDOT	
getBucketOffsets	TokenNameIdentifier	 get Bucket Offsets
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
getBuckets	TokenNameIdentifier	 get Buckets
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
that	TokenNameIdentifier	 that
.	TokenNameDOT	
getBuckets	TokenNameIdentifier	 get Buckets
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
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
Objects	TokenNameIdentifier	 Objects
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
getBucketOffsets	TokenNameIdentifier	 get Bucket Offsets
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
getBuckets	TokenNameIdentifier	 get Buckets
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
EstimatedHistogramSerializer	TokenNameIdentifier	 Estimated Histogram Serializer
implements	TokenNameimplements	
ISerializer	TokenNameIdentifier	 I Serializer
<	TokenNameLESS	
EstimatedHistogram	TokenNameIdentifier	 Estimated Histogram
>	TokenNameGREATER	
{	TokenNameLBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
serialize	TokenNameIdentifier	 serialize
(	TokenNameLPAREN	
EstimatedHistogram	TokenNameIdentifier	 Estimated Histogram
eh	TokenNameIdentifier	 eh
,	TokenNameCOMMA	
DataOutput	TokenNameIdentifier	 Data Output
dos	TokenNameIdentifier	 dos
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
offsets	TokenNameIdentifier	 offsets
=	TokenNameEQUAL	
eh	TokenNameIdentifier	 eh
.	TokenNameDOT	
getBucketOffsets	TokenNameIdentifier	 get Bucket Offsets
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
buckets	TokenNameIdentifier	 buckets
=	TokenNameEQUAL	
eh	TokenNameIdentifier	 eh
.	TokenNameDOT	
getBuckets	TokenNameIdentifier	 get Buckets
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dos	TokenNameIdentifier	 dos
.	TokenNameDOT	
writeInt	TokenNameIdentifier	 write Int
(	TokenNameLPAREN	
buckets	TokenNameIdentifier	 buckets
.	TokenNameDOT	
length	TokenNameIdentifier	 length
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
buckets	TokenNameIdentifier	 buckets
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
dos	TokenNameIdentifier	 dos
.	TokenNameDOT	
writeLong	TokenNameIdentifier	 write Long
(	TokenNameLPAREN	
offsets	TokenNameIdentifier	 offsets
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
?	TokenNameQUESTION	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
i	TokenNameIdentifier	 i
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dos	TokenNameIdentifier	 dos
.	TokenNameDOT	
writeLong	TokenNameIdentifier	 write Long
(	TokenNameLPAREN	
buckets	TokenNameIdentifier	 buckets
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
EstimatedHistogram	TokenNameIdentifier	 Estimated Histogram
deserialize	TokenNameIdentifier	 deserialize
(	TokenNameLPAREN	
DataInput	TokenNameIdentifier	 Data Input
dis	TokenNameIdentifier	 dis
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
int	TokenNameint	
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
dis	TokenNameIdentifier	 dis
.	TokenNameDOT	
readInt	TokenNameIdentifier	 read Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
offsets	TokenNameIdentifier	 offsets
=	TokenNameEQUAL	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
size	TokenNameIdentifier	 size
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
buckets	TokenNameIdentifier	 buckets
=	TokenNameEQUAL	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
size	TokenNameIdentifier	 size
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
size	TokenNameIdentifier	 size
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
offsets	TokenNameIdentifier	 offsets
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
?	TokenNameQUESTION	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
i	TokenNameIdentifier	 i
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
dis	TokenNameIdentifier	 dis
.	TokenNameDOT	
readLong	TokenNameIdentifier	 read Long
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buckets	TokenNameIdentifier	 buckets
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
dis	TokenNameIdentifier	 dis
.	TokenNameDOT	
readLong	TokenNameIdentifier	 read Long
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
new	TokenNamenew	
EstimatedHistogram	TokenNameIdentifier	 Estimated Histogram
(	TokenNameLPAREN	
offsets	TokenNameIdentifier	 offsets
,	TokenNameCOMMA	
buckets	TokenNameIdentifier	 buckets
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
long	TokenNamelong	
serializedSize	TokenNameIdentifier	 serialized Size
(	TokenNameLPAREN	
EstimatedHistogram	TokenNameIdentifier	 Estimated Histogram
object	TokenNameIdentifier	 object
,	TokenNameCOMMA	
TypeSizes	TokenNameIdentifier	 Type Sizes
typeSizes	TokenNameIdentifier	 type Sizes
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
}	TokenNameRBRACE	
