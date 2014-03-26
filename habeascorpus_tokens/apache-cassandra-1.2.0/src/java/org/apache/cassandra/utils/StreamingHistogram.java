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
*	TokenNameMULTIPLY	
;	TokenNameSEMICOLON	
/** * Histogram that can be constructed from streaming of data. * * The algorithm is taken from following paper: * Yael Ben-Haim and Elad Tom-Tov, "A Streaming Parallel Decision Tree Algorithm" (2010) * http://jmlr.csail.mit.edu/papers/volume11/ben-haim10a/ben-haim10a.pdf */	TokenNameCOMMENT_JAVADOC	 Histogram that can be constructed from streaming of data. * The algorithm is taken from following paper: Yael Ben-Haim and Elad Tom-Tov, "A Streaming Parallel Decision Tree Algorithm" (2010) http://jmlr.csail.mit.edu/papers/volume11/ben-haim10a/ben-haim10a.pdf 
public	TokenNamepublic	
class	TokenNameclass	
StreamingHistogram	TokenNameIdentifier	 Streaming Histogram
{	TokenNameLBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
StreamingHistogramSerializer	TokenNameIdentifier	 Streaming Histogram Serializer
serializer	TokenNameIdentifier	 serializer
=	TokenNameEQUAL	
new	TokenNamenew	
StreamingHistogramSerializer	TokenNameIdentifier	 Streaming Histogram Serializer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// TreeMap to hold bins of histogram. 	TokenNameCOMMENT_LINE	TreeMap to hold bins of histogram. 
private	TokenNameprivate	
final	TokenNamefinal	
TreeMap	TokenNameIdentifier	 Tree Map
<	TokenNameLESS	
Double	TokenNameIdentifier	 Double
,	TokenNameCOMMA	
Long	TokenNameIdentifier	 Long
>	TokenNameGREATER	
bin	TokenNameIdentifier	 bin
;	TokenNameSEMICOLON	
// maximum bin size for this histogram 	TokenNameCOMMENT_LINE	maximum bin size for this histogram 
private	TokenNameprivate	
final	TokenNamefinal	
int	TokenNameint	
maxBinSize	TokenNameIdentifier	 max Bin Size
;	TokenNameSEMICOLON	
/** * Creates a new histogram with max bin size of maxBinSize * @param maxBinSize maximum number of bins this histogram can have */	TokenNameCOMMENT_JAVADOC	 Creates a new histogram with max bin size of maxBinSize @param maxBinSize maximum number of bins this histogram can have 
public	TokenNamepublic	
StreamingHistogram	TokenNameIdentifier	 Streaming Histogram
(	TokenNameLPAREN	
int	TokenNameint	
maxBinSize	TokenNameIdentifier	 max Bin Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
maxBinSize	TokenNameIdentifier	 max Bin Size
=	TokenNameEQUAL	
maxBinSize	TokenNameIdentifier	 max Bin Size
;	TokenNameSEMICOLON	
bin	TokenNameIdentifier	 bin
=	TokenNameEQUAL	
new	TokenNamenew	
TreeMap	TokenNameIdentifier	 Tree Map
<	TokenNameLESS	
Double	TokenNameIdentifier	 Double
,	TokenNameCOMMA	
Long	TokenNameIdentifier	 Long
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
StreamingHistogram	TokenNameIdentifier	 Streaming Histogram
(	TokenNameLPAREN	
int	TokenNameint	
maxBinSize	TokenNameIdentifier	 max Bin Size
,	TokenNameCOMMA	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
Double	TokenNameIdentifier	 Double
,	TokenNameCOMMA	
Long	TokenNameIdentifier	 Long
>	TokenNameGREATER	
bin	TokenNameIdentifier	 bin
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
maxBinSize	TokenNameIdentifier	 max Bin Size
=	TokenNameEQUAL	
maxBinSize	TokenNameIdentifier	 max Bin Size
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
bin	TokenNameIdentifier	 bin
=	TokenNameEQUAL	
new	TokenNamenew	
TreeMap	TokenNameIdentifier	 Tree Map
<	TokenNameLESS	
Double	TokenNameIdentifier	 Double
,	TokenNameCOMMA	
Long	TokenNameIdentifier	 Long
>	TokenNameGREATER	
(	TokenNameLPAREN	
bin	TokenNameIdentifier	 bin
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Adds new point p to this histogram. * @param p */	TokenNameCOMMENT_JAVADOC	 Adds new point p to this histogram. @param p 
public	TokenNamepublic	
void	TokenNamevoid	
update	TokenNameIdentifier	 update
(	TokenNameLPAREN	
double	TokenNamedouble	
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
{	TokenNameLBRACE	
update	TokenNameIdentifier	 update
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Adds new point p with value m to this histogram. * @param p * @param m */	TokenNameCOMMENT_JAVADOC	 Adds new point p with value m to this histogram. @param p @param m 
public	TokenNamepublic	
void	TokenNamevoid	
update	TokenNameIdentifier	 update
(	TokenNameLPAREN	
double	TokenNamedouble	
p	TokenNameIdentifier	 p
,	TokenNameCOMMA	
long	TokenNamelong	
m	TokenNameIdentifier	 m
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Long	TokenNameIdentifier	 Long
mi	TokenNameIdentifier	 mi
=	TokenNameEQUAL	
bin	TokenNameIdentifier	 bin
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
mi	TokenNameIdentifier	 mi
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// we found the same p so increment that counter 	TokenNameCOMMENT_LINE	we found the same p so increment that counter 
bin	TokenNameIdentifier	 bin
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
,	TokenNameCOMMA	
mi	TokenNameIdentifier	 mi
+	TokenNamePLUS	
m	TokenNameIdentifier	 m
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
bin	TokenNameIdentifier	 bin
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
,	TokenNameCOMMA	
m	TokenNameIdentifier	 m
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// if bin size exceeds maximum bin size then trim down to max size 	TokenNameCOMMENT_LINE	if bin size exceeds maximum bin size then trim down to max size 
while	TokenNamewhile	
(	TokenNameLPAREN	
bin	TokenNameIdentifier	 bin
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
maxBinSize	TokenNameIdentifier	 max Bin Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// find points p1, p2 which have smallest difference 	TokenNameCOMMENT_LINE	find points p1, p2 which have smallest difference 
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Double	TokenNameIdentifier	 Double
>	TokenNameGREATER	
keys	TokenNameIdentifier	 keys
=	TokenNameEQUAL	
bin	TokenNameIdentifier	 bin
.	TokenNameDOT	
keySet	TokenNameIdentifier	 key Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
p1	TokenNameIdentifier	 p1
=	TokenNameEQUAL	
keys	TokenNameIdentifier	 keys
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
p2	TokenNameIdentifier	 p2
=	TokenNameEQUAL	
keys	TokenNameIdentifier	 keys
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
smallestDiff	TokenNameIdentifier	 smallest Diff
=	TokenNameEQUAL	
p2	TokenNameIdentifier	 p2
-	TokenNameMINUS	
p1	TokenNameIdentifier	 p1
;	TokenNameSEMICOLON	
double	TokenNamedouble	
q1	TokenNameIdentifier	 q1
=	TokenNameEQUAL	
p1	TokenNameIdentifier	 p1
,	TokenNameCOMMA	
q2	TokenNameIdentifier	 q2
=	TokenNameEQUAL	
p2	TokenNameIdentifier	 p2
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
keys	TokenNameIdentifier	 keys
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
p1	TokenNameIdentifier	 p1
=	TokenNameEQUAL	
p2	TokenNameIdentifier	 p2
;	TokenNameSEMICOLON	
p2	TokenNameIdentifier	 p2
=	TokenNameEQUAL	
keys	TokenNameIdentifier	 keys
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
diff	TokenNameIdentifier	 diff
=	TokenNameEQUAL	
p2	TokenNameIdentifier	 p2
-	TokenNameMINUS	
p1	TokenNameIdentifier	 p1
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
diff	TokenNameIdentifier	 diff
<	TokenNameLESS	
smallestDiff	TokenNameIdentifier	 smallest Diff
)	TokenNameRPAREN	
{	TokenNameLBRACE	
smallestDiff	TokenNameIdentifier	 smallest Diff
=	TokenNameEQUAL	
diff	TokenNameIdentifier	 diff
;	TokenNameSEMICOLON	
q1	TokenNameIdentifier	 q1
=	TokenNameEQUAL	
p1	TokenNameIdentifier	 p1
;	TokenNameSEMICOLON	
q2	TokenNameIdentifier	 q2
=	TokenNameEQUAL	
p2	TokenNameIdentifier	 p2
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// merge those two 	TokenNameCOMMENT_LINE	merge those two 
long	TokenNamelong	
k1	TokenNameIdentifier	 k1
=	TokenNameEQUAL	
bin	TokenNameIdentifier	 bin
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
q1	TokenNameIdentifier	 q1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
long	TokenNamelong	
k2	TokenNameIdentifier	 k2
=	TokenNameEQUAL	
bin	TokenNameIdentifier	 bin
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
q2	TokenNameIdentifier	 q2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bin	TokenNameIdentifier	 bin
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
(	TokenNameLPAREN	
q1	TokenNameIdentifier	 q1
*	TokenNameMULTIPLY	
k1	TokenNameIdentifier	 k1
+	TokenNamePLUS	
q2	TokenNameIdentifier	 q2
*	TokenNameMULTIPLY	
k2	TokenNameIdentifier	 k2
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
(	TokenNameLPAREN	
k1	TokenNameIdentifier	 k1
+	TokenNamePLUS	
k2	TokenNameIdentifier	 k2
)	TokenNameRPAREN	
,	TokenNameCOMMA	
k1	TokenNameIdentifier	 k1
+	TokenNamePLUS	
k2	TokenNameIdentifier	 k2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Merges given histogram with this histogram. * * @param other histogram to merge */	TokenNameCOMMENT_JAVADOC	 Merges given histogram with this histogram. * @param other histogram to merge 
public	TokenNamepublic	
void	TokenNamevoid	
merge	TokenNameIdentifier	 merge
(	TokenNameLPAREN	
StreamingHistogram	TokenNameIdentifier	 Streaming Histogram
other	TokenNameIdentifier	 other
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
other	TokenNameIdentifier	 other
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Map	TokenNameIdentifier	 Map
.	TokenNameDOT	
Entry	TokenNameIdentifier	 Entry
<	TokenNameLESS	
Double	TokenNameIdentifier	 Double
,	TokenNameCOMMA	
Long	TokenNameIdentifier	 Long
>	TokenNameGREATER	
entry	TokenNameIdentifier	 entry
:	TokenNameCOLON	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
getAsMap	TokenNameIdentifier	 get As Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
entrySet	TokenNameIdentifier	 entry Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
update	TokenNameIdentifier	 update
(	TokenNameLPAREN	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
getKey	TokenNameIdentifier	 get Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Calculates estimated number of points in interval [-inf,b]. * * @param b upper bound of a interval to calculate sum * @return estimated number of points in a interval [-inf,b]. */	TokenNameCOMMENT_JAVADOC	 Calculates estimated number of points in interval [-inf,b]. * @param b upper bound of a interval to calculate sum @return estimated number of points in a interval [-inf,b]. 
public	TokenNamepublic	
double	TokenNamedouble	
sum	TokenNameIdentifier	 sum
(	TokenNameLPAREN	
double	TokenNamedouble	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
{	TokenNameLBRACE	
double	TokenNamedouble	
sum	TokenNameIdentifier	 sum
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// find the points pi, pnext which satisfy pi <= b < pnext 	TokenNameCOMMENT_LINE	find the points pi, pnext which satisfy pi <= b < pnext 
Map	TokenNameIdentifier	 Map
.	TokenNameDOT	
Entry	TokenNameIdentifier	 Entry
<	TokenNameLESS	
Double	TokenNameIdentifier	 Double
,	TokenNameCOMMA	
Long	TokenNameIdentifier	 Long
>	TokenNameGREATER	
pnext	TokenNameIdentifier	 pnext
=	TokenNameEQUAL	
bin	TokenNameIdentifier	 bin
.	TokenNameDOT	
higherEntry	TokenNameIdentifier	 higher Entry
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
pnext	TokenNameIdentifier	 pnext
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// if b is greater than any key in this histogram, 	TokenNameCOMMENT_LINE	if b is greater than any key in this histogram, 
// just count all appearance and return 	TokenNameCOMMENT_LINE	just count all appearance and return 
for	TokenNamefor	
(	TokenNameLPAREN	
Long	TokenNameIdentifier	 Long
value	TokenNameIdentifier	 value
:	TokenNameCOLON	
bin	TokenNameIdentifier	 bin
.	TokenNameDOT	
values	TokenNameIdentifier	 values
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
sum	TokenNameIdentifier	 sum
+=	TokenNamePLUS_EQUAL	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
Map	TokenNameIdentifier	 Map
.	TokenNameDOT	
Entry	TokenNameIdentifier	 Entry
<	TokenNameLESS	
Double	TokenNameIdentifier	 Double
,	TokenNameCOMMA	
Long	TokenNameIdentifier	 Long
>	TokenNameGREATER	
pi	TokenNameIdentifier	 pi
=	TokenNameEQUAL	
bin	TokenNameIdentifier	 bin
.	TokenNameDOT	
floorEntry	TokenNameIdentifier	 floor Entry
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
pi	TokenNameIdentifier	 pi
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// calculate estimated count mb for point b 	TokenNameCOMMENT_LINE	calculate estimated count mb for point b 
double	TokenNamedouble	
weight	TokenNameIdentifier	 weight
=	TokenNameEQUAL	
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
-	TokenNameMINUS	
pi	TokenNameIdentifier	 pi
.	TokenNameDOT	
getKey	TokenNameIdentifier	 get Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
(	TokenNameLPAREN	
pnext	TokenNameIdentifier	 pnext
.	TokenNameDOT	
getKey	TokenNameIdentifier	 get Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
pi	TokenNameIdentifier	 pi
.	TokenNameDOT	
getKey	TokenNameIdentifier	 get Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
mb	TokenNameIdentifier	 mb
=	TokenNameEQUAL	
pi	TokenNameIdentifier	 pi
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
(	TokenNameLPAREN	
pnext	TokenNameIdentifier	 pnext
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
pi	TokenNameIdentifier	 pi
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
weight	TokenNameIdentifier	 weight
;	TokenNameSEMICOLON	
sum	TokenNameIdentifier	 sum
+=	TokenNamePLUS_EQUAL	
(	TokenNameLPAREN	
pi	TokenNameIdentifier	 pi
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
mb	TokenNameIdentifier	 mb
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
weight	TokenNameIdentifier	 weight
/	TokenNameDIVIDE	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
sum	TokenNameIdentifier	 sum
+=	TokenNamePLUS_EQUAL	
pi	TokenNameIdentifier	 pi
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
2.0	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Long	TokenNameIdentifier	 Long
value	TokenNameIdentifier	 value
:	TokenNameCOLON	
bin	TokenNameIdentifier	 bin
.	TokenNameDOT	
headMap	TokenNameIdentifier	 head Map
(	TokenNameLPAREN	
pi	TokenNameIdentifier	 pi
.	TokenNameDOT	
getKey	TokenNameIdentifier	 get Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
.	TokenNameDOT	
values	TokenNameIdentifier	 values
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
sum	TokenNameIdentifier	 sum
+=	TokenNamePLUS_EQUAL	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
sum	TokenNameIdentifier	 sum
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
Double	TokenNameIdentifier	 Double
,	TokenNameCOMMA	
Long	TokenNameIdentifier	 Long
>	TokenNameGREATER	
getAsMap	TokenNameIdentifier	 get As Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
unmodifiableMap	TokenNameIdentifier	 unmodifiable Map
(	TokenNameLPAREN	
bin	TokenNameIdentifier	 bin
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
StreamingHistogramSerializer	TokenNameIdentifier	 Streaming Histogram Serializer
implements	TokenNameimplements	
ISerializer	TokenNameIdentifier	 I Serializer
<	TokenNameLESS	
StreamingHistogram	TokenNameIdentifier	 Streaming Histogram
>	TokenNameGREATER	
{	TokenNameLBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
serialize	TokenNameIdentifier	 serialize
(	TokenNameLPAREN	
StreamingHistogram	TokenNameIdentifier	 Streaming Histogram
histogram	TokenNameIdentifier	 histogram
,	TokenNameCOMMA	
DataOutput	TokenNameIdentifier	 Data Output
dos	TokenNameIdentifier	 dos
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
dos	TokenNameIdentifier	 dos
.	TokenNameDOT	
writeInt	TokenNameIdentifier	 write Int
(	TokenNameLPAREN	
histogram	TokenNameIdentifier	 histogram
.	TokenNameDOT	
maxBinSize	TokenNameIdentifier	 max Bin Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
Double	TokenNameIdentifier	 Double
,	TokenNameCOMMA	
Long	TokenNameIdentifier	 Long
>	TokenNameGREATER	
entries	TokenNameIdentifier	 entries
=	TokenNameEQUAL	
histogram	TokenNameIdentifier	 histogram
.	TokenNameDOT	
getAsMap	TokenNameIdentifier	 get As Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dos	TokenNameIdentifier	 dos
.	TokenNameDOT	
writeInt	TokenNameIdentifier	 write Int
(	TokenNameLPAREN	
entries	TokenNameIdentifier	 entries
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Map	TokenNameIdentifier	 Map
.	TokenNameDOT	
Entry	TokenNameIdentifier	 Entry
<	TokenNameLESS	
Double	TokenNameIdentifier	 Double
,	TokenNameCOMMA	
Long	TokenNameIdentifier	 Long
>	TokenNameGREATER	
entry	TokenNameIdentifier	 entry
:	TokenNameCOLON	
entries	TokenNameIdentifier	 entries
.	TokenNameDOT	
entrySet	TokenNameIdentifier	 entry Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
dos	TokenNameIdentifier	 dos
.	TokenNameDOT	
writeDouble	TokenNameIdentifier	 write Double
(	TokenNameLPAREN	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
getKey	TokenNameIdentifier	 get Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dos	TokenNameIdentifier	 dos
.	TokenNameDOT	
writeLong	TokenNameIdentifier	 write Long
(	TokenNameLPAREN	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
StreamingHistogram	TokenNameIdentifier	 Streaming Histogram
deserialize	TokenNameIdentifier	 deserialize
(	TokenNameLPAREN	
DataInput	TokenNameIdentifier	 Data Input
dis	TokenNameIdentifier	 dis
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
int	TokenNameint	
maxBinSize	TokenNameIdentifier	 max Bin Size
=	TokenNameEQUAL	
dis	TokenNameIdentifier	 dis
.	TokenNameDOT	
readInt	TokenNameIdentifier	 read Int
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
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
Double	TokenNameIdentifier	 Double
,	TokenNameCOMMA	
Long	TokenNameIdentifier	 Long
>	TokenNameGREATER	
tmp	TokenNameIdentifier	 tmp
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
<	TokenNameLESS	
Double	TokenNameIdentifier	 Double
,	TokenNameCOMMA	
Long	TokenNameIdentifier	 Long
>	TokenNameGREATER	
(	TokenNameLPAREN	
size	TokenNameIdentifier	 size
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
{	TokenNameLBRACE	
tmp	TokenNameIdentifier	 tmp
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
dis	TokenNameIdentifier	 dis
.	TokenNameDOT	
readDouble	TokenNameIdentifier	 read Double
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
dis	TokenNameIdentifier	 dis
.	TokenNameDOT	
readLong	TokenNameIdentifier	 read Long
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
new	TokenNamenew	
StreamingHistogram	TokenNameIdentifier	 Streaming Histogram
(	TokenNameLPAREN	
maxBinSize	TokenNameIdentifier	 max Bin Size
,	TokenNameCOMMA	
tmp	TokenNameIdentifier	 tmp
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
long	TokenNamelong	
serializedSize	TokenNameIdentifier	 serialized Size
(	TokenNameLPAREN	
StreamingHistogram	TokenNameIdentifier	 Streaming Histogram
histogram	TokenNameIdentifier	 histogram
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
