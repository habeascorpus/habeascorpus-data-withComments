package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
facet	TokenNameIdentifier	 facet
.	TokenNameDOT	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
sampling	TokenNameIdentifier	 sampling
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
logging	TokenNameIdentifier	 logging
.	TokenNameDOT	
Level	TokenNameIdentifier	 Level
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
logging	TokenNameIdentifier	 logging
.	TokenNameDOT	
Logger	TokenNameIdentifier	 Logger
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
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
facet	TokenNameIdentifier	 facet
.	TokenNameDOT	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
ScoredDocIDs	TokenNameIdentifier	 Scored Doc I Ds
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
facet	TokenNameIdentifier	 facet
.	TokenNameDOT	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
ScoredDocIDsIterator	TokenNameIdentifier	 Scored Doc I Ds Iterator
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
facet	TokenNameIdentifier	 facet
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
ScoredDocIdsUtils	TokenNameIdentifier	 Scored Doc Ids Utils
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/** * Take random samples of large collections. * @lucene.experimental */	TokenNameCOMMENT_JAVADOC	 Take random samples of large collections. @lucene.experimental 
public	TokenNamepublic	
class	TokenNameclass	
RepeatableSampler	TokenNameIdentifier	 Repeatable Sampler
extends	TokenNameextends	
Sampler	TokenNameIdentifier	 Sampler
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
=	TokenNameEQUAL	
Logger	TokenNameIdentifier	 Logger
.	TokenNameDOT	
getLogger	TokenNameIdentifier	 get Logger
(	TokenNameLPAREN	
RepeatableSampler	TokenNameIdentifier	 Repeatable Sampler
.	TokenNameDOT	
class	TokenNameclass	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
RepeatableSampler	TokenNameIdentifier	 Repeatable Sampler
(	TokenNameLPAREN	
SamplingParams	TokenNameIdentifier	 Sampling Params
params	TokenNameIdentifier	 params
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
params	TokenNameIdentifier	 params
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
SampleResult	TokenNameIdentifier	 Sample Result
createSample	TokenNameIdentifier	 create Sample
(	TokenNameLPAREN	
ScoredDocIDs	TokenNameIdentifier	 Scored Doc I Ds
docids	TokenNameIdentifier	 docids
,	TokenNameCOMMA	
int	TokenNameint	
actualSize	TokenNameIdentifier	 actual Size
,	TokenNameCOMMA	
int	TokenNameint	
sampleSetSize	TokenNameIdentifier	 sample Set Size
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
sampleSet	TokenNameIdentifier	 sample Set
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
sampleSet	TokenNameIdentifier	 sample Set
=	TokenNameEQUAL	
repeatableSample	TokenNameIdentifier	 repeatable Sample
(	TokenNameLPAREN	
docids	TokenNameIdentifier	 docids
,	TokenNameCOMMA	
actualSize	TokenNameIdentifier	 actual Size
,	TokenNameCOMMA	
sampleSetSize	TokenNameIdentifier	 sample Set Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
isLoggable	TokenNameIdentifier	 is Loggable
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
WARNING	TokenNameIdentifier	 WARNING
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
WARNING	TokenNameIdentifier	 WARNING
,	TokenNameCOMMA	
"sampling failed: "	TokenNameStringLiteral	sampling failed: 
+	TokenNamePLUS	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" - falling back to no sampling!"	TokenNameStringLiteral	 - falling back to no sampling!
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
new	TokenNamenew	
SampleResult	TokenNameIdentifier	 Sample Result
(	TokenNameLPAREN	
docids	TokenNameIdentifier	 docids
,	TokenNameCOMMA	
1d	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
ScoredDocIDs	TokenNameIdentifier	 Scored Doc I Ds
sampled	TokenNameIdentifier	 sampled
=	TokenNameEQUAL	
ScoredDocIdsUtils	TokenNameIdentifier	 Scored Doc Ids Utils
.	TokenNameDOT	
createScoredDocIDsSubset	TokenNameIdentifier	 create Scored Doc I Ds Subset
(	TokenNameLPAREN	
docids	TokenNameIdentifier	 docids
,	TokenNameCOMMA	
sampleSet	TokenNameIdentifier	 sample Set
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
isLoggable	TokenNameIdentifier	 is Loggable
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
FINEST	TokenNameIdentifier	 FINEST
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
finest	TokenNameIdentifier	 finest
(	TokenNameLPAREN	
"******************** "	TokenNameStringLiteral	******************** 
+	TokenNamePLUS	
sampled	TokenNameIdentifier	 sampled
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
new	TokenNamenew	
SampleResult	TokenNameIdentifier	 Sample Result
(	TokenNameLPAREN	
sampled	TokenNameIdentifier	 sampled
,	TokenNameCOMMA	
sampled	TokenNameIdentifier	 sampled
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
(	TokenNameLPAREN	
double	TokenNamedouble	
)	TokenNameRPAREN	
docids	TokenNameIdentifier	 docids
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns <code>sampleSize</code> values from the first <code>collectionSize</code> * locations of <code>collection</code>, chosen using * the <code>TRAVERSAL</code> algorithm. The sample values are not sorted. * @param collection The values from which a sample is wanted. * @param collectionSize The number of values (from the first) from which to draw the sample. * @param sampleSize The number of values to return. * @return An array of values chosen from the collection. * @see Algorithm#TRAVERSAL */	TokenNameCOMMENT_JAVADOC	 Returns <code>sampleSize</code> values from the first <code>collectionSize</code> locations of <code>collection</code>, chosen using the <code>TRAVERSAL</code> algorithm. The sample values are not sorted. @param collection The values from which a sample is wanted. @param collectionSize The number of values (from the first) from which to draw the sample. @param sampleSize The number of values to return. @return An array of values chosen from the collection. @see Algorithm#TRAVERSAL 
private	TokenNameprivate	
static	TokenNamestatic	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
repeatableSample	TokenNameIdentifier	 repeatable Sample
(	TokenNameLPAREN	
ScoredDocIDs	TokenNameIdentifier	 Scored Doc I Ds
collection	TokenNameIdentifier	 collection
,	TokenNameCOMMA	
int	TokenNameint	
collectionSize	TokenNameIdentifier	 collection Size
,	TokenNameCOMMA	
int	TokenNameint	
sampleSize	TokenNameIdentifier	 sample Size
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
repeatableSample	TokenNameIdentifier	 repeatable Sample
(	TokenNameLPAREN	
collection	TokenNameIdentifier	 collection
,	TokenNameCOMMA	
collectionSize	TokenNameIdentifier	 collection Size
,	TokenNameCOMMA	
sampleSize	TokenNameIdentifier	 sample Size
,	TokenNameCOMMA	
Algorithm	TokenNameIdentifier	 Algorithm
.	TokenNameDOT	
HASHING	TokenNameIdentifier	 HASHING
,	TokenNameCOMMA	
Sorted	TokenNameIdentifier	 Sorted
.	TokenNameDOT	
NO	TokenNameIdentifier	 NO
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns <code>sampleSize</code> values from the first <code>collectionSize</code> * locations of <code>collection</code>, chosen using <code>algorithm</code>. * @param collection The values from which a sample is wanted. * @param collectionSize The number of values (from the first) from which to draw the sample. * @param sampleSize The number of values to return. * @param algorithm Which algorithm to use. * @param sorted Sorted.YES to sort the sample values in ascending order before returning; * Sorted.NO to return them in essentially random order. * @return An array of values chosen from the collection. */	TokenNameCOMMENT_JAVADOC	 Returns <code>sampleSize</code> values from the first <code>collectionSize</code> locations of <code>collection</code>, chosen using <code>algorithm</code>. @param collection The values from which a sample is wanted. @param collectionSize The number of values (from the first) from which to draw the sample. @param sampleSize The number of values to return. @param algorithm Which algorithm to use. @param sorted Sorted.YES to sort the sample values in ascending order before returning; Sorted.NO to return them in essentially random order. @return An array of values chosen from the collection. 
private	TokenNameprivate	
static	TokenNamestatic	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
repeatableSample	TokenNameIdentifier	 repeatable Sample
(	TokenNameLPAREN	
ScoredDocIDs	TokenNameIdentifier	 Scored Doc I Ds
collection	TokenNameIdentifier	 collection
,	TokenNameCOMMA	
int	TokenNameint	
collectionSize	TokenNameIdentifier	 collection Size
,	TokenNameCOMMA	
int	TokenNameint	
sampleSize	TokenNameIdentifier	 sample Size
,	TokenNameCOMMA	
Algorithm	TokenNameIdentifier	 Algorithm
algorithm	TokenNameIdentifier	 algorithm
,	TokenNameCOMMA	
Sorted	TokenNameIdentifier	 Sorted
sorted	TokenNameIdentifier	 sorted
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
collection	TokenNameIdentifier	 collection
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IOException	TokenNameIdentifier	 IO Exception
(	TokenNameLPAREN	
"docIdSet is null"	TokenNameStringLiteral	docIdSet is null
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
sampleSize	TokenNameIdentifier	 sample Size
<	TokenNameLESS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IOException	TokenNameIdentifier	 IO Exception
(	TokenNameLPAREN	
"sampleSize < 1 ("	TokenNameStringLiteral	sampleSize < 1 (
+	TokenNamePLUS	
sampleSize	TokenNameIdentifier	 sample Size
+	TokenNamePLUS	
")"	TokenNameStringLiteral	)
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
collectionSize	TokenNameIdentifier	 collection Size
<	TokenNameLESS	
sampleSize	TokenNameIdentifier	 sample Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IOException	TokenNameIdentifier	 IO Exception
(	TokenNameLPAREN	
"collectionSize ("	TokenNameStringLiteral	collectionSize (
+	TokenNamePLUS	
collectionSize	TokenNameIdentifier	 collection Size
+	TokenNamePLUS	
") less than sampleSize ("	TokenNameStringLiteral	) less than sampleSize (
+	TokenNamePLUS	
sampleSize	TokenNameIdentifier	 sample Size
+	TokenNamePLUS	
")"	TokenNameStringLiteral	)
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
sample	TokenNameIdentifier	 sample
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
sampleSize	TokenNameIdentifier	 sample Size
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
times	TokenNameIdentifier	 times
=	TokenNameEQUAL	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
4	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
algorithm	TokenNameIdentifier	 algorithm
==	TokenNameEQUAL_EQUAL	
Algorithm	TokenNameIdentifier	 Algorithm
.	TokenNameDOT	
TRAVERSAL	TokenNameIdentifier	 TRAVERSAL
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sample1	TokenNameIdentifier	 sample1
(	TokenNameLPAREN	
collection	TokenNameIdentifier	 collection
,	TokenNameCOMMA	
collectionSize	TokenNameIdentifier	 collection Size
,	TokenNameCOMMA	
sample	TokenNameIdentifier	 sample
,	TokenNameCOMMA	
times	TokenNameIdentifier	 times
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
algorithm	TokenNameIdentifier	 algorithm
==	TokenNameEQUAL_EQUAL	
Algorithm	TokenNameIdentifier	 Algorithm
.	TokenNameDOT	
HASHING	TokenNameIdentifier	 HASHING
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sample2	TokenNameIdentifier	 sample2
(	TokenNameLPAREN	
collection	TokenNameIdentifier	 collection
,	TokenNameCOMMA	
collectionSize	TokenNameIdentifier	 collection Size
,	TokenNameCOMMA	
sample	TokenNameIdentifier	 sample
,	TokenNameCOMMA	
times	TokenNameIdentifier	 times
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"Invalid algorithm selection"	TokenNameStringLiteral	Invalid algorithm selection
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
sorted	TokenNameIdentifier	 sorted
==	TokenNameEQUAL_EQUAL	
Sorted	TokenNameIdentifier	 Sorted
.	TokenNameDOT	
YES	TokenNameIdentifier	 YES
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
sort	TokenNameIdentifier	 sort
(	TokenNameLPAREN	
sample	TokenNameIdentifier	 sample
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
returnTimings	TokenNameIdentifier	 return Timings
)	TokenNameRPAREN	
{	TokenNameLBRACE	
times	TokenNameIdentifier	 times
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
currentTimeMillis	TokenNameIdentifier	 current Time Millis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
isLoggable	TokenNameIdentifier	 is Loggable
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
FINEST	TokenNameIdentifier	 FINEST
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
finest	TokenNameIdentifier	 finest
(	TokenNameLPAREN	
"Times: "	TokenNameStringLiteral	Times: 
+	TokenNamePLUS	
(	TokenNameLPAREN	
times	TokenNameIdentifier	 times
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
-	TokenNameMINUS	
times	TokenNameIdentifier	 times
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"ms, "	TokenNameStringLiteral	ms, 
+	TokenNamePLUS	
(	TokenNameLPAREN	
times	TokenNameIdentifier	 times
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
-	TokenNameMINUS	
times	TokenNameIdentifier	 times
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"ms, "	TokenNameStringLiteral	ms, 
+	TokenNamePLUS	
(	TokenNameLPAREN	
times	TokenNameIdentifier	 times
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
-	TokenNameMINUS	
times	TokenNameIdentifier	 times
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"ms"	TokenNameStringLiteral	ms
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
sample	TokenNameIdentifier	 sample
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns <code>sample</code>.length values chosen from the first <code>collectionSize</code> * locations of <code>collection</code>, using the TRAVERSAL algorithm. The sample is * pseudorandom: no subset of the original collection * is in principle more likely to occur than any other, but for a given collection * and sample size, the same sample will always be returned. This algorithm walks the * original collection in a methodical way that is guaranteed not to visit any location * more than once, which makes sampling without replacement faster because removals don't * have to be tracked, and the number of operations is proportional to the sample size, * not the collection size. * Times for performance measurement * are returned in <code>times</code>, which must be an array of at least three longs, containing * nanosecond event times. The first * is set when the algorithm starts; the second, when the step size has been calculated; * and the third when the sample has been taken. * @param collection The set to be sampled. * @param collectionSize The number of values to use (starting from first). * @param sample The array in which to return the sample. * @param times The times of three events, for measuring performance. */	TokenNameCOMMENT_JAVADOC	 Returns <code>sample</code>.length values chosen from the first <code>collectionSize</code> locations of <code>collection</code>, using the TRAVERSAL algorithm. The sample is pseudorandom: no subset of the original collection is in principle more likely to occur than any other, but for a given collection and sample size, the same sample will always be returned. This algorithm walks the original collection in a methodical way that is guaranteed not to visit any location more than once, which makes sampling without replacement faster because removals don't have to be tracked, and the number of operations is proportional to the sample size, not the collection size. Times for performance measurement are returned in <code>times</code>, which must be an array of at least three longs, containing nanosecond event times. The first is set when the algorithm starts; the second, when the step size has been calculated; and the third when the sample has been taken. @param collection The set to be sampled. @param collectionSize The number of values to use (starting from first). @param sample The array in which to return the sample. @param times The times of three events, for measuring performance. 
private	TokenNameprivate	
static	TokenNamestatic	
void	TokenNamevoid	
sample1	TokenNameIdentifier	 sample1
(	TokenNameLPAREN	
ScoredDocIDs	TokenNameIdentifier	 Scored Doc I Ds
collection	TokenNameIdentifier	 collection
,	TokenNameCOMMA	
int	TokenNameint	
collectionSize	TokenNameIdentifier	 collection Size
,	TokenNameCOMMA	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
sample	TokenNameIdentifier	 sample
,	TokenNameCOMMA	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
times	TokenNameIdentifier	 times
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
ScoredDocIDsIterator	TokenNameIdentifier	 Scored Doc I Ds Iterator
it	TokenNameIdentifier	 it
=	TokenNameEQUAL	
collection	TokenNameIdentifier	 collection
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
returnTimings	TokenNameIdentifier	 return Timings
)	TokenNameRPAREN	
{	TokenNameLBRACE	
times	TokenNameIdentifier	 times
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
currentTimeMillis	TokenNameIdentifier	 current Time Millis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
sampleSize	TokenNameIdentifier	 sample Size
=	TokenNameEQUAL	
sample	TokenNameIdentifier	 sample
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
int	TokenNameint	
prime	TokenNameIdentifier	 prime
=	TokenNameEQUAL	
findGoodStepSize	TokenNameIdentifier	 find Good Step Size
(	TokenNameLPAREN	
collectionSize	TokenNameIdentifier	 collection Size
,	TokenNameCOMMA	
sampleSize	TokenNameIdentifier	 sample Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
mod	TokenNameIdentifier	 mod
=	TokenNameEQUAL	
prime	TokenNameIdentifier	 prime
%	TokenNameREMAINDER	
collectionSize	TokenNameIdentifier	 collection Size
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
returnTimings	TokenNameIdentifier	 return Timings
)	TokenNameRPAREN	
{	TokenNameLBRACE	
times	TokenNameIdentifier	 times
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
currentTimeMillis	TokenNameIdentifier	 current Time Millis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
sampleCount	TokenNameIdentifier	 sample Count
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
;	TokenNameSEMICOLON	
sampleCount	TokenNameIdentifier	 sample Count
<	TokenNameLESS	
sampleSize	TokenNameIdentifier	 sample Size
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
+	TokenNamePLUS	
mod	TokenNameIdentifier	 mod
<	TokenNameLESS	
collectionSize	TokenNameIdentifier	 collection Size
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
mod	TokenNameIdentifier	 mod
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
,	TokenNameCOMMA	
index	TokenNameIdentifier	 index
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
it	TokenNameIdentifier	 it
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
index	TokenNameIdentifier	 index
+	TokenNamePLUS	
mod	TokenNameIdentifier	 mod
-	TokenNameMINUS	
collectionSize	TokenNameIdentifier	 collection Size
;	TokenNameSEMICOLON	
it	TokenNameIdentifier	 it
=	TokenNameEQUAL	
collection	TokenNameIdentifier	 collection
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
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
index	TokenNameIdentifier	 index
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
it	TokenNameIdentifier	 it
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
sample	TokenNameIdentifier	 sample
[	TokenNameLBRACKET	
sampleCount	TokenNameIdentifier	 sample Count
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
it	TokenNameIdentifier	 it
.	TokenNameDOT	
getDocID	TokenNameIdentifier	 get Doc ID
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
returnTimings	TokenNameIdentifier	 return Timings
)	TokenNameRPAREN	
{	TokenNameLBRACE	
times	TokenNameIdentifier	 times
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
currentTimeMillis	TokenNameIdentifier	 current Time Millis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Returns a value which will allow the caller to walk * a collection of <code>collectionSize</code> values, without repeating or missing * any, and spanning the collection from beginning to end at least once with * <code>sampleSize</code> visited locations. Choosing a value * that is relatively prime to the collection size ensures that stepping by that size (modulo * the collection size) will hit all locations without repeating, eliminating the need to * track previously visited locations for a "without replacement" sample. Starting with the * square root of the collection size ensures that either the first or second prime tried will * work (they can't both divide the collection size). It also has the property that N steps of * size N will span a collection of N**2 elements once. If the sample is bigger than N, it will * wrap multiple times (without repeating). If the sample is smaller, a step size is chosen * that will result in at least one spanning of the collection. * * @param collectionSize The number of values in the collection to be sampled. * @param sampleSize The number of values wanted in the sample. * @return A good increment value for walking the collection. */	TokenNameCOMMENT_JAVADOC	 Returns a value which will allow the caller to walk a collection of <code>collectionSize</code> values, without repeating or missing any, and spanning the collection from beginning to end at least once with <code>sampleSize</code> visited locations. Choosing a value that is relatively prime to the collection size ensures that stepping by that size (modulo the collection size) will hit all locations without repeating, eliminating the need to track previously visited locations for a "without replacement" sample. Starting with the square root of the collection size ensures that either the first or second prime tried will work (they can't both divide the collection size). It also has the property that N steps of size N will span a collection of N**2 elements once. If the sample is bigger than N, it will wrap multiple times (without repeating). If the sample is smaller, a step size is chosen that will result in at least one spanning of the collection. * @param collectionSize The number of values in the collection to be sampled. @param sampleSize The number of values wanted in the sample. @return A good increment value for walking the collection. 
private	TokenNameprivate	
static	TokenNamestatic	
int	TokenNameint	
findGoodStepSize	TokenNameIdentifier	 find Good Step Size
(	TokenNameLPAREN	
int	TokenNameint	
collectionSize	TokenNameIdentifier	 collection Size
,	TokenNameCOMMA	
int	TokenNameint	
sampleSize	TokenNameIdentifier	 sample Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
sqrt	TokenNameIdentifier	 sqrt
(	TokenNameLPAREN	
collectionSize	TokenNameIdentifier	 collection Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
sampleSize	TokenNameIdentifier	 sample Size
<	TokenNameLESS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
collectionSize	TokenNameIdentifier	 collection Size
/	TokenNameDIVIDE	
sampleSize	TokenNameIdentifier	 sample Size
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
do	TokenNamedo	
{	TokenNameLBRACE	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
findNextPrimeAfter	TokenNameIdentifier	 find Next Prime After
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
collectionSize	TokenNameIdentifier	 collection Size
%	TokenNameREMAINDER	
i	TokenNameIdentifier	 i
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the first prime number that is larger than <code>n</code>. * @param n A number less than the prime to be returned. * @return The smallest prime larger than <code>n</code>. */	TokenNameCOMMENT_JAVADOC	 Returns the first prime number that is larger than <code>n</code>. @param n A number less than the prime to be returned. @return The smallest prime larger than <code>n</code>. 
private	TokenNameprivate	
static	TokenNamestatic	
int	TokenNameint	
findNextPrimeAfter	TokenNameIdentifier	 find Next Prime After
(	TokenNameLPAREN	
int	TokenNameint	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
{	TokenNameLBRACE	
n	TokenNameIdentifier	 n
+=	TokenNamePLUS_EQUAL	
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
%	TokenNameREMAINDER	
2	TokenNameIntegerLiteral	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// next odd 	TokenNameCOMMENT_LINE	next odd 
foundFactor	TokenNameIdentifier	 found Factor
:	TokenNameCOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
;	TokenNameSEMICOLON	
;	TokenNameSEMICOLON	
n	TokenNameIdentifier	 n
+=	TokenNamePLUS_EQUAL	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//TODO labels??!! 	TokenNameCOMMENT_LINE	TODO labels??!! 
int	TokenNameint	
sri	TokenNameIdentifier	 sri
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
sqrt	TokenNameIdentifier	 sqrt
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
primeIndex	TokenNameIdentifier	 prime Index
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
primeIndex	TokenNameIdentifier	 prime Index
<	TokenNameLESS	
N_PRIMES	TokenNameIdentifier	 N  PRIMES
;	TokenNameSEMICOLON	
primeIndex	TokenNameIdentifier	 prime Index
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
p	TokenNameIdentifier	 p
=	TokenNameEQUAL	
primes	TokenNameIdentifier	 primes
[	TokenNameLBRACKET	
primeIndex	TokenNameIdentifier	 prime Index
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
>	TokenNameGREATER	
sri	TokenNameIdentifier	 sri
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
%	TokenNameREMAINDER	
p	TokenNameIdentifier	 p
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
continue	TokenNamecontinue	
foundFactor	TokenNameIdentifier	 found Factor
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
p	TokenNameIdentifier	 p
=	TokenNameEQUAL	
primes	TokenNameIdentifier	 primes
[	TokenNameLBRACKET	
N_PRIMES	TokenNameIdentifier	 N  PRIMES
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
;	TokenNameSEMICOLON	
p	TokenNameIdentifier	 p
+=	TokenNamePLUS_EQUAL	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
>	TokenNameGREATER	
sri	TokenNameIdentifier	 sri
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
%	TokenNameREMAINDER	
p	TokenNameIdentifier	 p
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
continue	TokenNamecontinue	
foundFactor	TokenNameIdentifier	 found Factor
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * The first N_PRIMES primes, after 2. */	TokenNameCOMMENT_JAVADOC	 The first N_PRIMES primes, after 2. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
N_PRIMES	TokenNameIdentifier	 N  PRIMES
=	TokenNameEQUAL	
4000	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
primes	TokenNameIdentifier	 primes
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
N_PRIMES	TokenNameIdentifier	 N  PRIMES
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
{	TokenNameLBRACE	
primes	TokenNameIdentifier	 primes
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
count	TokenNameIdentifier	 count
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
count	TokenNameIdentifier	 count
<	TokenNameLESS	
N_PRIMES	TokenNameIdentifier	 N  PRIMES
;	TokenNameSEMICOLON	
count	TokenNameIdentifier	 count
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
primes	TokenNameIdentifier	 primes
[	TokenNameLBRACKET	
count	TokenNameIdentifier	 count
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
findNextPrimeAfter	TokenNameIdentifier	 find Next Prime After
(	TokenNameLPAREN	
primes	TokenNameIdentifier	 primes
[	TokenNameLBRACKET	
count	TokenNameIdentifier	 count
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Returns <code>sample</code>.length values chosen from the first <code>collectionSize</code> * locations of <code>collection</code>, using the HASHING algorithm. Performance measurements * are returned in <code>times</code>, which must be an array of at least three longs. The first * will be set when the algorithm starts; the second, when a hash key has been calculated and * inserted into the priority queue for every element in the collection; and the third when the * original elements associated with the keys remaining in the PQ have been stored in the sample * array for return. * <P> * This algorithm slows as the sample size becomes a significant fraction of the collection * size, because the PQ is as large as the sample set, and will not do early rejection of values * below the minimum until it fills up, and a larger PQ contains more small values to be purged, * resulting in less early rejection and more logN insertions. * * @param collection The set to be sampled. * @param collectionSize The number of values to use (starting from first). * @param sample The array in which to return the sample. * @param times The times of three events, for measuring performance. */	TokenNameCOMMENT_JAVADOC	 Returns <code>sample</code>.length values chosen from the first <code>collectionSize</code> locations of <code>collection</code>, using the HASHING algorithm. Performance measurements are returned in <code>times</code>, which must be an array of at least three longs. The first will be set when the algorithm starts; the second, when a hash key has been calculated and inserted into the priority queue for every element in the collection; and the third when the original elements associated with the keys remaining in the PQ have been stored in the sample array for return. <P> This algorithm slows as the sample size becomes a significant fraction of the collection size, because the PQ is as large as the sample set, and will not do early rejection of values below the minimum until it fills up, and a larger PQ contains more small values to be purged, resulting in less early rejection and more logN insertions. * @param collection The set to be sampled. @param collectionSize The number of values to use (starting from first). @param sample The array in which to return the sample. @param times The times of three events, for measuring performance. 
private	TokenNameprivate	
static	TokenNamestatic	
void	TokenNamevoid	
sample2	TokenNameIdentifier	 sample2
(	TokenNameLPAREN	
ScoredDocIDs	TokenNameIdentifier	 Scored Doc I Ds
collection	TokenNameIdentifier	 collection
,	TokenNameCOMMA	
int	TokenNameint	
collectionSize	TokenNameIdentifier	 collection Size
,	TokenNameCOMMA	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
sample	TokenNameIdentifier	 sample
,	TokenNameCOMMA	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
times	TokenNameIdentifier	 times
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
returnTimings	TokenNameIdentifier	 return Timings
)	TokenNameRPAREN	
{	TokenNameLBRACE	
times	TokenNameIdentifier	 times
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
currentTimeMillis	TokenNameIdentifier	 current Time Millis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
sampleSize	TokenNameIdentifier	 sample Size
=	TokenNameEQUAL	
sample	TokenNameIdentifier	 sample
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
IntPriorityQueue	TokenNameIdentifier	 Int Priority Queue
pq	TokenNameIdentifier	 pq
=	TokenNameEQUAL	
new	TokenNamenew	
IntPriorityQueue	TokenNameIdentifier	 Int Priority Queue
(	TokenNameLPAREN	
sampleSize	TokenNameIdentifier	 sample Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/* * Convert every value in the collection to a hashed "weight" value, and insert * into a bounded PQ (retains only sampleSize highest weights). */	TokenNameCOMMENT_BLOCK	 Convert every value in the collection to a hashed "weight" value, and insert into a bounded PQ (retains only sampleSize highest weights). 
ScoredDocIDsIterator	TokenNameIdentifier	 Scored Doc I Ds Iterator
it	TokenNameIdentifier	 it
=	TokenNameEQUAL	
collection	TokenNameIdentifier	 collection
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
it	TokenNameIdentifier	 it
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
pq	TokenNameIdentifier	 pq
.	TokenNameDOT	
insertWithReuse	TokenNameIdentifier	 insert With Reuse
(	TokenNameLPAREN	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
it	TokenNameIdentifier	 it
.	TokenNameDOT	
getDocID	TokenNameIdentifier	 get Doc ID
(	TokenNameLPAREN	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
PHI_32	TokenNameIdentifier	 PHI 32
)	TokenNameRPAREN	
&	TokenNameAND	
0x7FFFFFFF	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
returnTimings	TokenNameIdentifier	 return Timings
)	TokenNameRPAREN	
{	TokenNameLBRACE	
times	TokenNameIdentifier	 times
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
currentTimeMillis	TokenNameIdentifier	 current Time Millis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* * Extract heap, convert weights back to original values, and return as integers. */	TokenNameCOMMENT_BLOCK	 Extract heap, convert weights back to original values, and return as integers. 
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
heap	TokenNameIdentifier	 heap
=	TokenNameEQUAL	
pq	TokenNameIdentifier	 pq
.	TokenNameDOT	
getHeap	TokenNameIdentifier	 get Heap
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
si	TokenNameIdentifier	 si
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
si	TokenNameIdentifier	 si
<	TokenNameLESS	
sampleSize	TokenNameIdentifier	 sample Size
;	TokenNameSEMICOLON	
si	TokenNameIdentifier	 si
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sample	TokenNameIdentifier	 sample
[	TokenNameLBRACKET	
si	TokenNameIdentifier	 si
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
IntPriorityQueue	TokenNameIdentifier	 Int Priority Queue
.	TokenNameDOT	
MI	TokenNameIdentifier	 MI
)	TokenNameRPAREN	
(	TokenNameLPAREN	
heap	TokenNameIdentifier	 heap
[	TokenNameLBRACKET	
si	TokenNameIdentifier	 si
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
value	TokenNameIdentifier	 value
*	TokenNameMULTIPLY	
PHI_32I	TokenNameIdentifier	 PHI 32 I
)	TokenNameRPAREN	
&	TokenNameAND	
0x7FFFFFFF	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
returnTimings	TokenNameIdentifier	 return Timings
)	TokenNameRPAREN	
{	TokenNameLBRACE	
times	TokenNameIdentifier	 times
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
currentTimeMillis	TokenNameIdentifier	 current Time Millis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * A bounded priority queue for Integers, to retain a specified number of * the highest-weighted values for return as a random sample. */	TokenNameCOMMENT_JAVADOC	 A bounded priority queue for Integers, to retain a specified number of the highest-weighted values for return as a random sample. 
private	TokenNameprivate	
static	TokenNamestatic	
class	TokenNameclass	
IntPriorityQueue	TokenNameIdentifier	 Int Priority Queue
extends	TokenNameextends	
PriorityQueue	TokenNameIdentifier	 Priority Queue
<	TokenNameLESS	
Object	TokenNameIdentifier	 Object
>	TokenNameGREATER	
{	TokenNameLBRACE	
/** * Creates a bounded PQ of size <code>size</code>. * @param size The number of elements to retain. */	TokenNameCOMMENT_JAVADOC	 Creates a bounded PQ of size <code>size</code>. @param size The number of elements to retain. 
public	TokenNamepublic	
IntPriorityQueue	TokenNameIdentifier	 Int Priority Queue
(	TokenNameLPAREN	
int	TokenNameint	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
initialize	TokenNameIdentifier	 initialize
(	TokenNameLPAREN	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Inserts an integer with overflow and object reuse. */	TokenNameCOMMENT_JAVADOC	 Inserts an integer with overflow and object reuse. 
public	TokenNamepublic	
void	TokenNamevoid	
insertWithReuse	TokenNameIdentifier	 insert With Reuse
(	TokenNameLPAREN	
int	TokenNameint	
intval	TokenNameIdentifier	 intval
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
mi	TokenNameIdentifier	 mi
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
mi	TokenNameIdentifier	 mi
=	TokenNameEQUAL	
new	TokenNamenew	
MI	TokenNameIdentifier	 MI
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
mi	TokenNameIdentifier	 mi
.	TokenNameDOT	
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
intval	TokenNameIdentifier	 intval
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
mi	TokenNameIdentifier	 mi
=	TokenNameEQUAL	
(	TokenNameLPAREN	
MI	TokenNameIdentifier	 MI
)	TokenNameRPAREN	
this	TokenNamethis	
.	TokenNameDOT	
insertWithOverflow	TokenNameIdentifier	 insert With Overflow
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
mi	TokenNameIdentifier	 mi
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the underlying data structure for faster access. Extracting elements * one at a time would require N logN time, and since we want the elements sorted * in ascending order by value (not weight), the array is useful as-is. * @return The underlying heap array. */	TokenNameCOMMENT_JAVADOC	 Returns the underlying data structure for faster access. Extracting elements one at a time would require N logN time, and since we want the elements sorted in ascending order by value (not weight), the array is useful as-is. @return The underlying heap array. 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getHeap	TokenNameIdentifier	 get Heap
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getHeapArray	TokenNameIdentifier	 get Heap Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns true if <code>o1<code>'s weight is less than that of <code>o2</code>, for * ordering in the PQ. * @return True if <code>o1</code> weighs less than <code>o2</code>. */	TokenNameCOMMENT_JAVADOC	 Returns true if <code>o1<code>'s weight is less than that of <code>o2</code>, for ordering in the PQ. @return True if <code>o1</code> weighs less than <code>o2</code>. 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
boolean	TokenNameboolean	
lessThan	TokenNameIdentifier	 less Than
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
o1	TokenNameIdentifier	 o1
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
o2	TokenNameIdentifier	 o2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
MI	TokenNameIdentifier	 MI
)	TokenNameRPAREN	
o1	TokenNameIdentifier	 o1
)	TokenNameRPAREN	
.	TokenNameDOT	
value	TokenNameIdentifier	 value
<	TokenNameLESS	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
MI	TokenNameIdentifier	 MI
)	TokenNameRPAREN	
o2	TokenNameIdentifier	 o2
)	TokenNameRPAREN	
.	TokenNameDOT	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * A mutable integer that lets queue objects be reused once they start overflowing. */	TokenNameCOMMENT_JAVADOC	 A mutable integer that lets queue objects be reused once they start overflowing. 
private	TokenNameprivate	
static	TokenNamestatic	
class	TokenNameclass	
MI	TokenNameIdentifier	 MI
{	TokenNameLBRACE	
MI	TokenNameIdentifier	 MI
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The mutable integer instance for reuse after first overflow. */	TokenNameCOMMENT_JAVADOC	 The mutable integer instance for reuse after first overflow. 
private	TokenNameprivate	
MI	TokenNameIdentifier	 MI
mi	TokenNameIdentifier	 mi
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * For specifying which sampling algorithm to use. */	TokenNameCOMMENT_JAVADOC	 For specifying which sampling algorithm to use. 
private	TokenNameprivate	
enum	TokenNameenum	
Algorithm	TokenNameIdentifier	 Algorithm
{	TokenNameLBRACE	
/** * Specifies a methodical traversal algorithm, which is guaranteed to span the collection * at least once, and never to return duplicates. Faster than the hashing algorithm and * uses much less space, but the randomness of the sample may be affected by systematic * variations in the collection. Requires only an array for the sample, and visits only * the number of elements in the sample set, not the full set. */	TokenNameCOMMENT_JAVADOC	 Specifies a methodical traversal algorithm, which is guaranteed to span the collection at least once, and never to return duplicates. Faster than the hashing algorithm and uses much less space, but the randomness of the sample may be affected by systematic variations in the collection. Requires only an array for the sample, and visits only the number of elements in the sample set, not the full set. 
// TODO (Facet): This one produces a bimodal distribution (very flat around 	TokenNameCOMMENT_LINE	TODO (Facet): This one produces a bimodal distribution (very flat around 
// each peak!) for collection size 10M and sample sizes 10k and 10544. 	TokenNameCOMMENT_LINE	each peak!) for collection size 10M and sample sizes 10k and 10544. 
// Figure out why. 	TokenNameCOMMENT_LINE	Figure out why. 
TRAVERSAL	TokenNameIdentifier	 TRAVERSAL
,	TokenNameCOMMA	
/** * Specifies a Fibonacci-style hash algorithm (see Knuth, S&S), which generates a less * systematically distributed subset of the sampled collection than the traversal method, * but requires a bounded priority queue the size of the sample, and creates an object * containing a sampled value and its hash, for every element in the full set. */	TokenNameCOMMENT_JAVADOC	 Specifies a Fibonacci-style hash algorithm (see Knuth, S&S), which generates a less systematically distributed subset of the sampled collection than the traversal method, but requires a bounded priority queue the size of the sample, and creates an object containing a sampled value and its hash, for every element in the full set. 
HASHING	TokenNameIdentifier	 HASHING
}	TokenNameRBRACE	
/** * For specifying whether to sort the sample. */	TokenNameCOMMENT_JAVADOC	 For specifying whether to sort the sample. 
private	TokenNameprivate	
enum	TokenNameenum	
Sorted	TokenNameIdentifier	 Sorted
{	TokenNameLBRACE	
/** * Sort resulting sample before returning. */	TokenNameCOMMENT_JAVADOC	 Sort resulting sample before returning. 
YES	TokenNameIdentifier	 YES
,	TokenNameCOMMA	
/** *Do not sort the resulting sample. */	TokenNameCOMMENT_JAVADOC	 *Do not sort the resulting sample. 
NO	TokenNameIdentifier	 NO
}	TokenNameRBRACE	
/** * Magic number 1: prime closest to phi, in 32 bits. */	TokenNameCOMMENT_JAVADOC	 Magic number 1: prime closest to phi, in 32 bits. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
PHI_32	TokenNameIdentifier	 PHI 32
=	TokenNameEQUAL	
2654435769L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
/** * Magic number 2: multiplicative inverse of PHI_32, modulo 2**32. */	TokenNameCOMMENT_JAVADOC	 Magic number 2: multiplicative inverse of PHI_32, modulo 2**32. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
PHI_32I	TokenNameIdentifier	 PHI 32 I
=	TokenNameEQUAL	
340573321L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
/** * Switch to cause methods to return timings. */	TokenNameCOMMENT_JAVADOC	 Switch to cause methods to return timings. 
private	TokenNameprivate	
static	TokenNamestatic	
boolean	TokenNameboolean	
returnTimings	TokenNameIdentifier	 return Timings
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
