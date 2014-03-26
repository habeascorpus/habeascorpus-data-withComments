package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
index	TokenNameIdentifier	 index
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
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
io	TokenNameIdentifier	 io
.	TokenNameDOT	
PrintStream	TokenNameIdentifier	 Print Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
List	TokenNameIdentifier	 List
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
Date	TokenNameIdentifier	 Date
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
Collections	TokenNameIdentifier	 Collections
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
AtomicInteger	TokenNameIdentifier	 Atomic Integer
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
search	TokenNameIdentifier	 search
.	TokenNameDOT	
DocIdSet	TokenNameIdentifier	 Doc Id Set
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
DocIdSetIterator	TokenNameIdentifier	 Doc Id Set Iterator
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
Query	TokenNameIdentifier	 Query
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
QueryWrapperFilter	TokenNameIdentifier	 Query Wrapper Filter
;	TokenNameSEMICOLON	
/* Tracks the stream of {@link BuffereDeletes}. * When DocumensWriter flushes, its buffered * deletes are appended to this stream. We later * apply these deletes (resolve them to the actual * docIDs, per segment) when a merge is started * (only to the to-be-merged segments). We * also apply to all segments when NRT reader is pulled, * commit/close is called, or when too many deletes are * buffered and must be flushed (by RAM usage or by count). * * Each packet is assigned a generation, and each flushed or * merged segment is also assigned a generation, so we can * track which BufferedDeletes packets to apply to any given * segment. */	TokenNameCOMMENT_BLOCK	 Tracks the stream of {@link BuffereDeletes}. When DocumensWriter flushes, its buffered deletes are appended to this stream. We later apply these deletes (resolve them to the actual docIDs, per segment) when a merge is started (only to the to-be-merged segments). We also apply to all segments when NRT reader is pulled, commit/close is called, or when too many deletes are buffered and must be flushed (by RAM usage or by count). * Each packet is assigned a generation, and each flushed or merged segment is also assigned a generation, so we can track which BufferedDeletes packets to apply to any given segment. 
class	TokenNameclass	
BufferedDeletesStream	TokenNameIdentifier	 Buffered Deletes Stream
{	TokenNameLBRACE	
// TODO: maybe linked list? 	TokenNameCOMMENT_LINE	TODO: maybe linked list? 
private	TokenNameprivate	
final	TokenNamefinal	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
FrozenBufferedDeletes	TokenNameIdentifier	 Frozen Buffered Deletes
>	TokenNameGREATER	
deletes	TokenNameIdentifier	 deletes
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
FrozenBufferedDeletes	TokenNameIdentifier	 Frozen Buffered Deletes
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Starts at 1 so that SegmentInfos that have never had 	TokenNameCOMMENT_LINE	Starts at 1 so that SegmentInfos that have never had 
// deletes applied (whose bufferedDelGen defaults to 0) 	TokenNameCOMMENT_LINE	deletes applied (whose bufferedDelGen defaults to 0) 
// will be correct: 	TokenNameCOMMENT_LINE	will be correct: 
private	TokenNameprivate	
long	TokenNamelong	
nextGen	TokenNameIdentifier	 next Gen
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// used only by assert 	TokenNameCOMMENT_LINE	used only by assert 
private	TokenNameprivate	
Term	TokenNameIdentifier	 Term
lastDeleteTerm	TokenNameIdentifier	 last Delete Term
;	TokenNameSEMICOLON	
private	TokenNameprivate	
PrintStream	TokenNameIdentifier	 Print Stream
infoStream	TokenNameIdentifier	 info Stream
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
private	TokenNameprivate	
final	TokenNamefinal	
AtomicInteger	TokenNameIdentifier	 Atomic Integer
numTerms	TokenNameIdentifier	 num Terms
=	TokenNameEQUAL	
new	TokenNamenew	
AtomicInteger	TokenNameIdentifier	 Atomic Integer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
int	TokenNameint	
messageID	TokenNameIdentifier	 message ID
;	TokenNameSEMICOLON	
public	TokenNamepublic	
BufferedDeletesStream	TokenNameIdentifier	 Buffered Deletes Stream
(	TokenNameLPAREN	
int	TokenNameint	
messageID	TokenNameIdentifier	 message ID
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
messageID	TokenNameIdentifier	 message ID
=	TokenNameEQUAL	
messageID	TokenNameIdentifier	 message ID
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
message	TokenNameIdentifier	 message
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
message	TokenNameIdentifier	 message
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
infoStream	TokenNameIdentifier	 info Stream
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
infoStream	TokenNameIdentifier	 info Stream
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"BD "	TokenNameStringLiteral	BD 
+	TokenNamePLUS	
messageID	TokenNameIdentifier	 message ID
+	TokenNamePLUS	
" ["	TokenNameStringLiteral	 [
+	TokenNamePLUS	
new	TokenNamenew	
Date	TokenNameIdentifier	 Date
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"; "	TokenNameStringLiteral	; 
+	TokenNamePLUS	
Thread	TokenNameIdentifier	 Thread
.	TokenNameDOT	
currentThread	TokenNameIdentifier	 current Thread
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"]: "	TokenNameStringLiteral	]: 
+	TokenNamePLUS	
message	TokenNameIdentifier	 message
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
setInfoStream	TokenNameIdentifier	 set Info Stream
(	TokenNameLPAREN	
PrintStream	TokenNameIdentifier	 Print Stream
infoStream	TokenNameIdentifier	 info Stream
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
infoStream	TokenNameIdentifier	 info Stream
=	TokenNameEQUAL	
infoStream	TokenNameIdentifier	 info Stream
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Appends a new packet of buffered deletes to the stream, 	TokenNameCOMMENT_LINE	Appends a new packet of buffered deletes to the stream, 
// setting its generation: 	TokenNameCOMMENT_LINE	setting its generation: 
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
push	TokenNameIdentifier	 push
(	TokenNameLPAREN	
FrozenBufferedDeletes	TokenNameIdentifier	 Frozen Buffered Deletes
packet	TokenNameIdentifier	 packet
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assert	TokenNameassert	
packet	TokenNameIdentifier	 packet
.	TokenNameDOT	
any	TokenNameIdentifier	 any
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
checkDeleteStats	TokenNameIdentifier	 check Delete Stats
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
packet	TokenNameIdentifier	 packet
.	TokenNameDOT	
gen	TokenNameIdentifier	 gen
<	TokenNameLESS	
nextGen	TokenNameIdentifier	 next Gen
;	TokenNameSEMICOLON	
deletes	TokenNameIdentifier	 deletes
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
packet	TokenNameIdentifier	 packet
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
numTerms	TokenNameIdentifier	 num Terms
.	TokenNameDOT	
addAndGet	TokenNameIdentifier	 add And Get
(	TokenNameLPAREN	
packet	TokenNameIdentifier	 packet
.	TokenNameDOT	
numTermDeletes	TokenNameIdentifier	 num Term Deletes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bytesUsed	TokenNameIdentifier	 bytes Used
.	TokenNameDOT	
addAndGet	TokenNameIdentifier	 add And Get
(	TokenNameLPAREN	
packet	TokenNameIdentifier	 packet
.	TokenNameDOT	
bytesUsed	TokenNameIdentifier	 bytes Used
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
infoStream	TokenNameIdentifier	 info Stream
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
message	TokenNameIdentifier	 message
(	TokenNameLPAREN	
"push deletes "	TokenNameStringLiteral	push deletes 
+	TokenNamePLUS	
packet	TokenNameIdentifier	 packet
+	TokenNamePLUS	
" delGen="	TokenNameStringLiteral	 delGen=
+	TokenNamePLUS	
packet	TokenNameIdentifier	 packet
.	TokenNameDOT	
gen	TokenNameIdentifier	 gen
+	TokenNamePLUS	
" packetCount="	TokenNameStringLiteral	 packetCount=
+	TokenNamePLUS	
deletes	TokenNameIdentifier	 deletes
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
assert	TokenNameassert	
checkDeleteStats	TokenNameIdentifier	 check Delete Stats
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
deletes	TokenNameIdentifier	 deletes
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
nextGen	TokenNameIdentifier	 next Gen
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
numTerms	TokenNameIdentifier	 num Terms
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bytesUsed	TokenNameIdentifier	 bytes Used
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
any	TokenNameIdentifier	 any
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
bytesUsed	TokenNameIdentifier	 bytes Used
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
numTerms	TokenNameIdentifier	 num Terms
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
numTerms	TokenNameIdentifier	 num Terms
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
ApplyDeletesResult	TokenNameIdentifier	 Apply Deletes Result
{	TokenNameLBRACE	
// True if any actual deletes took place: 	TokenNameCOMMENT_LINE	True if any actual deletes took place: 
public	TokenNamepublic	
final	TokenNamefinal	
boolean	TokenNameboolean	
anyDeletes	TokenNameIdentifier	 any Deletes
;	TokenNameSEMICOLON	
// Current gen, for the merged segment: 	TokenNameCOMMENT_LINE	Current gen, for the merged segment: 
public	TokenNamepublic	
final	TokenNamefinal	
long	TokenNamelong	
gen	TokenNameIdentifier	 gen
;	TokenNameSEMICOLON	
// If non-null, contains segments that are 100% deleted 	TokenNameCOMMENT_LINE	If non-null, contains segments that are 100% deleted 
public	TokenNamepublic	
final	TokenNamefinal	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
SegmentInfo	TokenNameIdentifier	 Segment Info
>	TokenNameGREATER	
allDeleted	TokenNameIdentifier	 all Deleted
;	TokenNameSEMICOLON	
ApplyDeletesResult	TokenNameIdentifier	 Apply Deletes Result
(	TokenNameLPAREN	
boolean	TokenNameboolean	
anyDeletes	TokenNameIdentifier	 any Deletes
,	TokenNameCOMMA	
long	TokenNamelong	
gen	TokenNameIdentifier	 gen
,	TokenNameCOMMA	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
SegmentInfo	TokenNameIdentifier	 Segment Info
>	TokenNameGREATER	
allDeleted	TokenNameIdentifier	 all Deleted
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
anyDeletes	TokenNameIdentifier	 any Deletes
=	TokenNameEQUAL	
anyDeletes	TokenNameIdentifier	 any Deletes
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
gen	TokenNameIdentifier	 gen
=	TokenNameEQUAL	
gen	TokenNameIdentifier	 gen
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
allDeleted	TokenNameIdentifier	 all Deleted
=	TokenNameEQUAL	
allDeleted	TokenNameIdentifier	 all Deleted
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// Sorts SegmentInfos from smallest to biggest bufferedDelGen: 	TokenNameCOMMENT_LINE	Sorts SegmentInfos from smallest to biggest bufferedDelGen: 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
Comparator	TokenNameIdentifier	 Comparator
<	TokenNameLESS	
SegmentInfo	TokenNameIdentifier	 Segment Info
>	TokenNameGREATER	
sortByDelGen	TokenNameIdentifier	 sort By Del Gen
=	TokenNameEQUAL	
new	TokenNamenew	
Comparator	TokenNameIdentifier	 Comparator
<	TokenNameLESS	
SegmentInfo	TokenNameIdentifier	 Segment Info
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// @Override -- not until Java 1.6 	TokenNameCOMMENT_LINE	@Override -- not until Java 1.6 
public	TokenNamepublic	
int	TokenNameint	
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
SegmentInfo	TokenNameIdentifier	 Segment Info
si1	TokenNameIdentifier	 si1
,	TokenNameCOMMA	
SegmentInfo	TokenNameIdentifier	 Segment Info
si2	TokenNameIdentifier	 si2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
long	TokenNamelong	
cmp	TokenNameIdentifier	 cmp
=	TokenNameEQUAL	
si1	TokenNameIdentifier	 si1
.	TokenNameDOT	
getBufferedDeletesGen	TokenNameIdentifier	 get Buffered Deletes Gen
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
si2	TokenNameIdentifier	 si2
.	TokenNameDOT	
getBufferedDeletesGen	TokenNameIdentifier	 get Buffered Deletes Gen
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
cmp	TokenNameIdentifier	 cmp
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
cmp	TokenNameIdentifier	 cmp
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
/** Resolves the buffered deleted Term/Query/docIDs, into * actual deleted docIDs in the deletedDocs BitVector for * each SegmentReader. */	TokenNameCOMMENT_JAVADOC	 Resolves the buffered deleted Term/Query/docIDs, into actual deleted docIDs in the deletedDocs BitVector for each SegmentReader. 
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
ApplyDeletesResult	TokenNameIdentifier	 Apply Deletes Result
applyDeletes	TokenNameIdentifier	 apply Deletes
(	TokenNameLPAREN	
IndexWriter	TokenNameIdentifier	 Index Writer
.	TokenNameDOT	
ReaderPool	TokenNameIdentifier	 Reader Pool
readerPool	TokenNameIdentifier	 reader Pool
,	TokenNameCOMMA	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
SegmentInfo	TokenNameIdentifier	 Segment Info
>	TokenNameGREATER	
infos	TokenNameIdentifier	 infos
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
final	TokenNamefinal	
long	TokenNamelong	
t0	TokenNameIdentifier	 t0
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
currentTimeMillis	TokenNameIdentifier	 current Time Millis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
infos	TokenNameIdentifier	 infos
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
ApplyDeletesResult	TokenNameIdentifier	 Apply Deletes Result
(	TokenNameLPAREN	
false	TokenNamefalse	
,	TokenNameCOMMA	
nextGen	TokenNameIdentifier	 next Gen
++	TokenNamePLUS_PLUS	
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
assert	TokenNameassert	
checkDeleteStats	TokenNameIdentifier	 check Delete Stats
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
any	TokenNameIdentifier	 any
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
message	TokenNameIdentifier	 message
(	TokenNameLPAREN	
"applyDeletes: no deletes; skipping"	TokenNameStringLiteral	applyDeletes: no deletes; skipping
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
ApplyDeletesResult	TokenNameIdentifier	 Apply Deletes Result
(	TokenNameLPAREN	
false	TokenNamefalse	
,	TokenNameCOMMA	
nextGen	TokenNameIdentifier	 next Gen
++	TokenNamePLUS_PLUS	
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
infoStream	TokenNameIdentifier	 info Stream
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
message	TokenNameIdentifier	 message
(	TokenNameLPAREN	
"applyDeletes: infos="	TokenNameStringLiteral	applyDeletes: infos=
+	TokenNamePLUS	
infos	TokenNameIdentifier	 infos
+	TokenNamePLUS	
" packetCount="	TokenNameStringLiteral	 packetCount=
+	TokenNamePLUS	
deletes	TokenNameIdentifier	 deletes
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
SegmentInfo	TokenNameIdentifier	 Segment Info
>	TokenNameGREATER	
infos2	TokenNameIdentifier	 infos2
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
SegmentInfo	TokenNameIdentifier	 Segment Info
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
infos2	TokenNameIdentifier	 infos2
.	TokenNameDOT	
addAll	TokenNameIdentifier	 add All
(	TokenNameLPAREN	
infos	TokenNameIdentifier	 infos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
sort	TokenNameIdentifier	 sort
(	TokenNameLPAREN	
infos2	TokenNameIdentifier	 infos2
,	TokenNameCOMMA	
sortByDelGen	TokenNameIdentifier	 sort By Del Gen
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
CoalescedDeletes	TokenNameIdentifier	 Coalesced Deletes
coalescedDeletes	TokenNameIdentifier	 coalesced Deletes
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
anyNewDeletes	TokenNameIdentifier	 any New Deletes
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
int	TokenNameint	
infosIDX	TokenNameIdentifier	 infos IDX
=	TokenNameEQUAL	
infos2	TokenNameIdentifier	 infos2
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
delIDX	TokenNameIdentifier	 del IDX
=	TokenNameEQUAL	
deletes	TokenNameIdentifier	 deletes
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
SegmentInfo	TokenNameIdentifier	 Segment Info
>	TokenNameGREATER	
allDeleted	TokenNameIdentifier	 all Deleted
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
infosIDX	TokenNameIdentifier	 infos IDX
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//System.out.println("BD: cycle delIDX=" + delIDX + " infoIDX=" + infosIDX); 	TokenNameCOMMENT_LINE	System.out.println("BD: cycle delIDX=" + delIDX + " infoIDX=" + infosIDX); 
final	TokenNamefinal	
FrozenBufferedDeletes	TokenNameIdentifier	 Frozen Buffered Deletes
packet	TokenNameIdentifier	 packet
=	TokenNameEQUAL	
delIDX	TokenNameIdentifier	 del IDX
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
?	TokenNameQUESTION	
deletes	TokenNameIdentifier	 deletes
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
delIDX	TokenNameIdentifier	 del IDX
)	TokenNameRPAREN	
:	TokenNameCOLON	
null	TokenNamenull	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
SegmentInfo	TokenNameIdentifier	 Segment Info
info	TokenNameIdentifier	 info
=	TokenNameEQUAL	
infos2	TokenNameIdentifier	 infos2
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
infosIDX	TokenNameIdentifier	 infos IDX
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
long	TokenNamelong	
segGen	TokenNameIdentifier	 seg Gen
=	TokenNameEQUAL	
info	TokenNameIdentifier	 info
.	TokenNameDOT	
getBufferedDeletesGen	TokenNameIdentifier	 get Buffered Deletes Gen
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
packet	TokenNameIdentifier	 packet
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
segGen	TokenNameIdentifier	 seg Gen
<	TokenNameLESS	
packet	TokenNameIdentifier	 packet
.	TokenNameDOT	
gen	TokenNameIdentifier	 gen
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//System.out.println(" coalesce"); 	TokenNameCOMMENT_LINE	System.out.println(" coalesce"); 
if	TokenNameif	
(	TokenNameLPAREN	
coalescedDeletes	TokenNameIdentifier	 coalesced Deletes
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
coalescedDeletes	TokenNameIdentifier	 coalesced Deletes
=	TokenNameEQUAL	
new	TokenNamenew	
CoalescedDeletes	TokenNameIdentifier	 Coalesced Deletes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
coalescedDeletes	TokenNameIdentifier	 coalesced Deletes
.	TokenNameDOT	
update	TokenNameIdentifier	 update
(	TokenNameLPAREN	
packet	TokenNameIdentifier	 packet
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
delIDX	TokenNameIdentifier	 del IDX
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
packet	TokenNameIdentifier	 packet
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
segGen	TokenNameIdentifier	 seg Gen
==	TokenNameEQUAL_EQUAL	
packet	TokenNameIdentifier	 packet
.	TokenNameDOT	
gen	TokenNameIdentifier	 gen
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//System.out.println(" eq"); 	TokenNameCOMMENT_LINE	System.out.println(" eq"); 
// Lock order: IW -> BD -> RP 	TokenNameCOMMENT_LINE	Lock order: IW -> BD -> RP 
assert	TokenNameassert	
readerPool	TokenNameIdentifier	 reader Pool
.	TokenNameDOT	
infoIsLive	TokenNameIdentifier	 info Is Live
(	TokenNameLPAREN	
info	TokenNameIdentifier	 info
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
SegmentReader	TokenNameIdentifier	 Segment Reader
reader	TokenNameIdentifier	 reader
=	TokenNameEQUAL	
readerPool	TokenNameIdentifier	 reader Pool
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
info	TokenNameIdentifier	 info
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
delCount	TokenNameIdentifier	 del Count
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
boolean	TokenNameboolean	
segAllDeletes	TokenNameIdentifier	 seg All Deletes
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
coalescedDeletes	TokenNameIdentifier	 coalesced Deletes
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//System.out.println(" del coalesced"); 	TokenNameCOMMENT_LINE	System.out.println(" del coalesced"); 
delCount	TokenNameIdentifier	 del Count
+=	TokenNamePLUS_EQUAL	
applyTermDeletes	TokenNameIdentifier	 apply Term Deletes
(	TokenNameLPAREN	
coalescedDeletes	TokenNameIdentifier	 coalesced Deletes
.	TokenNameDOT	
termsIterable	TokenNameIdentifier	 terms Iterable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
delCount	TokenNameIdentifier	 del Count
+=	TokenNamePLUS_EQUAL	
applyQueryDeletes	TokenNameIdentifier	 apply Query Deletes
(	TokenNameLPAREN	
coalescedDeletes	TokenNameIdentifier	 coalesced Deletes
.	TokenNameDOT	
queriesIterable	TokenNameIdentifier	 queries Iterable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//System.out.println(" del exact"); 	TokenNameCOMMENT_LINE	System.out.println(" del exact"); 
// Don't delete by Term here; DocumentsWriter 	TokenNameCOMMENT_LINE	Don't delete by Term here; DocumentsWriter 
// already did that on flush: 	TokenNameCOMMENT_LINE	already did that on flush: 
delCount	TokenNameIdentifier	 del Count
+=	TokenNamePLUS_EQUAL	
applyQueryDeletes	TokenNameIdentifier	 apply Query Deletes
(	TokenNameLPAREN	
packet	TokenNameIdentifier	 packet
.	TokenNameDOT	
queriesIterable	TokenNameIdentifier	 queries Iterable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
segAllDeletes	TokenNameIdentifier	 seg All Deletes
=	TokenNameEQUAL	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
numDocs	TokenNameIdentifier	 num Docs
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
readerPool	TokenNameIdentifier	 reader Pool
.	TokenNameDOT	
release	TokenNameIdentifier	 release
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
anyNewDeletes	TokenNameIdentifier	 any New Deletes
|=	TokenNameOR_EQUAL	
delCount	TokenNameIdentifier	 del Count
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
segAllDeletes	TokenNameIdentifier	 seg All Deletes
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
allDeleted	TokenNameIdentifier	 all Deleted
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
allDeleted	TokenNameIdentifier	 all Deleted
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
SegmentInfo	TokenNameIdentifier	 Segment Info
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
allDeleted	TokenNameIdentifier	 all Deleted
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
info	TokenNameIdentifier	 info
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
infoStream	TokenNameIdentifier	 info Stream
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
message	TokenNameIdentifier	 message
(	TokenNameLPAREN	
"seg="	TokenNameStringLiteral	seg=
+	TokenNamePLUS	
info	TokenNameIdentifier	 info
+	TokenNamePLUS	
" segGen="	TokenNameStringLiteral	 segGen=
+	TokenNamePLUS	
segGen	TokenNameIdentifier	 seg Gen
+	TokenNamePLUS	
" segDeletes=["	TokenNameStringLiteral	 segDeletes=[
+	TokenNamePLUS	
packet	TokenNameIdentifier	 packet
+	TokenNamePLUS	
"]; coalesced deletes=["	TokenNameStringLiteral	]; coalesced deletes=[
+	TokenNamePLUS	
(	TokenNameLPAREN	
coalescedDeletes	TokenNameIdentifier	 coalesced Deletes
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
"null"	TokenNameStringLiteral	null
:	TokenNameCOLON	
coalescedDeletes	TokenNameIdentifier	 coalesced Deletes
)	TokenNameRPAREN	
+	TokenNamePLUS	
"] delCount="	TokenNameStringLiteral	] delCount=
+	TokenNamePLUS	
delCount	TokenNameIdentifier	 del Count
+	TokenNamePLUS	
(	TokenNameLPAREN	
segAllDeletes	TokenNameIdentifier	 seg All Deletes
?	TokenNameQUESTION	
" 100% deleted"	TokenNameStringLiteral	 100% deleted
:	TokenNameCOLON	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
coalescedDeletes	TokenNameIdentifier	 coalesced Deletes
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
coalescedDeletes	TokenNameIdentifier	 coalesced Deletes
=	TokenNameEQUAL	
new	TokenNamenew	
CoalescedDeletes	TokenNameIdentifier	 Coalesced Deletes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
coalescedDeletes	TokenNameIdentifier	 coalesced Deletes
.	TokenNameDOT	
update	TokenNameIdentifier	 update
(	TokenNameLPAREN	
packet	TokenNameIdentifier	 packet
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
delIDX	TokenNameIdentifier	 del IDX
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
infosIDX	TokenNameIdentifier	 infos IDX
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
info	TokenNameIdentifier	 info
.	TokenNameDOT	
setBufferedDeletesGen	TokenNameIdentifier	 set Buffered Deletes Gen
(	TokenNameLPAREN	
nextGen	TokenNameIdentifier	 next Gen
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
//System.out.println(" gt"); 	TokenNameCOMMENT_LINE	System.out.println(" gt"); 
if	TokenNameif	
(	TokenNameLPAREN	
coalescedDeletes	TokenNameIdentifier	 coalesced Deletes
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Lock order: IW -> BD -> RP 	TokenNameCOMMENT_LINE	Lock order: IW -> BD -> RP 
assert	TokenNameassert	
readerPool	TokenNameIdentifier	 reader Pool
.	TokenNameDOT	
infoIsLive	TokenNameIdentifier	 info Is Live
(	TokenNameLPAREN	
info	TokenNameIdentifier	 info
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
SegmentReader	TokenNameIdentifier	 Segment Reader
reader	TokenNameIdentifier	 reader
=	TokenNameEQUAL	
readerPool	TokenNameIdentifier	 reader Pool
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
info	TokenNameIdentifier	 info
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
delCount	TokenNameIdentifier	 del Count
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
boolean	TokenNameboolean	
segAllDeletes	TokenNameIdentifier	 seg All Deletes
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
delCount	TokenNameIdentifier	 del Count
+=	TokenNamePLUS_EQUAL	
applyTermDeletes	TokenNameIdentifier	 apply Term Deletes
(	TokenNameLPAREN	
coalescedDeletes	TokenNameIdentifier	 coalesced Deletes
.	TokenNameDOT	
termsIterable	TokenNameIdentifier	 terms Iterable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
delCount	TokenNameIdentifier	 del Count
+=	TokenNamePLUS_EQUAL	
applyQueryDeletes	TokenNameIdentifier	 apply Query Deletes
(	TokenNameLPAREN	
coalescedDeletes	TokenNameIdentifier	 coalesced Deletes
.	TokenNameDOT	
queriesIterable	TokenNameIdentifier	 queries Iterable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
segAllDeletes	TokenNameIdentifier	 seg All Deletes
=	TokenNameEQUAL	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
numDocs	TokenNameIdentifier	 num Docs
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
readerPool	TokenNameIdentifier	 reader Pool
.	TokenNameDOT	
release	TokenNameIdentifier	 release
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
anyNewDeletes	TokenNameIdentifier	 any New Deletes
|=	TokenNameOR_EQUAL	
delCount	TokenNameIdentifier	 del Count
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
segAllDeletes	TokenNameIdentifier	 seg All Deletes
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
allDeleted	TokenNameIdentifier	 all Deleted
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
allDeleted	TokenNameIdentifier	 all Deleted
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
SegmentInfo	TokenNameIdentifier	 Segment Info
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
allDeleted	TokenNameIdentifier	 all Deleted
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
info	TokenNameIdentifier	 info
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
infoStream	TokenNameIdentifier	 info Stream
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
message	TokenNameIdentifier	 message
(	TokenNameLPAREN	
"seg="	TokenNameStringLiteral	seg=
+	TokenNamePLUS	
info	TokenNameIdentifier	 info
+	TokenNamePLUS	
" segGen="	TokenNameStringLiteral	 segGen=
+	TokenNamePLUS	
segGen	TokenNameIdentifier	 seg Gen
+	TokenNamePLUS	
" coalesced deletes=["	TokenNameStringLiteral	 coalesced deletes=[
+	TokenNamePLUS	
(	TokenNameLPAREN	
coalescedDeletes	TokenNameIdentifier	 coalesced Deletes
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
"null"	TokenNameStringLiteral	null
:	TokenNameCOLON	
coalescedDeletes	TokenNameIdentifier	 coalesced Deletes
)	TokenNameRPAREN	
+	TokenNamePLUS	
"] delCount="	TokenNameStringLiteral	] delCount=
+	TokenNamePLUS	
delCount	TokenNameIdentifier	 del Count
+	TokenNamePLUS	
(	TokenNameLPAREN	
segAllDeletes	TokenNameIdentifier	 seg All Deletes
?	TokenNameQUESTION	
" 100% deleted"	TokenNameStringLiteral	 100% deleted
:	TokenNameCOLON	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
info	TokenNameIdentifier	 info
.	TokenNameDOT	
setBufferedDeletesGen	TokenNameIdentifier	 set Buffered Deletes Gen
(	TokenNameLPAREN	
nextGen	TokenNameIdentifier	 next Gen
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
infosIDX	TokenNameIdentifier	 infos IDX
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
assert	TokenNameassert	
checkDeleteStats	TokenNameIdentifier	 check Delete Stats
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
infoStream	TokenNameIdentifier	 info Stream
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
message	TokenNameIdentifier	 message
(	TokenNameLPAREN	
"applyDeletes took "	TokenNameStringLiteral	applyDeletes took 
+	TokenNamePLUS	
(	TokenNameLPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
currentTimeMillis	TokenNameIdentifier	 current Time Millis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
t0	TokenNameIdentifier	 t0
)	TokenNameRPAREN	
+	TokenNamePLUS	
" msec"	TokenNameStringLiteral	 msec
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// assert infos != segmentInfos || !any() : "infos=" + infos + " segmentInfos=" + segmentInfos + " any=" + any; 	TokenNameCOMMENT_LINE	assert infos != segmentInfos || !any() : "infos=" + infos + " segmentInfos=" + segmentInfos + " any=" + any; 
return	TokenNamereturn	
new	TokenNamenew	
ApplyDeletesResult	TokenNameIdentifier	 Apply Deletes Result
(	TokenNameLPAREN	
anyNewDeletes	TokenNameIdentifier	 any New Deletes
,	TokenNameCOMMA	
nextGen	TokenNameIdentifier	 next Gen
++	TokenNamePLUS_PLUS	
,	TokenNameCOMMA	
allDeleted	TokenNameIdentifier	 all Deleted
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
long	TokenNamelong	
getNextGen	TokenNameIdentifier	 get Next Gen
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
nextGen	TokenNameIdentifier	 next Gen
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Lock order IW -> BD 	TokenNameCOMMENT_LINE	Lock order IW -> BD 
/* Removes any BufferedDeletes that we no longer need to * store because all segments in the index have had the * deletes applied. */	TokenNameCOMMENT_BLOCK	 Removes any BufferedDeletes that we no longer need to store because all segments in the index have had the deletes applied. 
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
prune	TokenNameIdentifier	 prune
(	TokenNameLPAREN	
SegmentInfos	TokenNameIdentifier	 Segment Infos
segmentInfos	TokenNameIdentifier	 segment Infos
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assert	TokenNameassert	
checkDeleteStats	TokenNameIdentifier	 check Delete Stats
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
long	TokenNamelong	
minGen	TokenNameIdentifier	 min Gen
=	TokenNameEQUAL	
Long	TokenNameIdentifier	 Long
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
SegmentInfo	TokenNameIdentifier	 Segment Info
info	TokenNameIdentifier	 info
:	TokenNameCOLON	
segmentInfos	TokenNameIdentifier	 segment Infos
)	TokenNameRPAREN	
{	TokenNameLBRACE	
minGen	TokenNameIdentifier	 min Gen
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
min	TokenNameIdentifier	 min
(	TokenNameLPAREN	
info	TokenNameIdentifier	 info
.	TokenNameDOT	
getBufferedDeletesGen	TokenNameIdentifier	 get Buffered Deletes Gen
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
minGen	TokenNameIdentifier	 min Gen
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
infoStream	TokenNameIdentifier	 info Stream
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
message	TokenNameIdentifier	 message
(	TokenNameLPAREN	
"prune sis="	TokenNameStringLiteral	prune sis=
+	TokenNamePLUS	
segmentInfos	TokenNameIdentifier	 segment Infos
+	TokenNamePLUS	
" minGen="	TokenNameStringLiteral	 minGen=
+	TokenNamePLUS	
minGen	TokenNameIdentifier	 min Gen
+	TokenNamePLUS	
" packetCount="	TokenNameStringLiteral	 packetCount=
+	TokenNamePLUS	
deletes	TokenNameIdentifier	 deletes
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
final	TokenNamefinal	
int	TokenNameint	
limit	TokenNameIdentifier	 limit
=	TokenNameEQUAL	
deletes	TokenNameIdentifier	 deletes
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
delIDX	TokenNameIdentifier	 del IDX
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
delIDX	TokenNameIdentifier	 del IDX
<	TokenNameLESS	
limit	TokenNameIdentifier	 limit
;	TokenNameSEMICOLON	
delIDX	TokenNameIdentifier	 del IDX
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
deletes	TokenNameIdentifier	 deletes
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
delIDX	TokenNameIdentifier	 del IDX
)	TokenNameRPAREN	
.	TokenNameDOT	
gen	TokenNameIdentifier	 gen
>=	TokenNameGREATER_EQUAL	
minGen	TokenNameIdentifier	 min Gen
)	TokenNameRPAREN	
{	TokenNameLBRACE	
prune	TokenNameIdentifier	 prune
(	TokenNameLPAREN	
delIDX	TokenNameIdentifier	 del IDX
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
checkDeleteStats	TokenNameIdentifier	 check Delete Stats
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// All deletes pruned 	TokenNameCOMMENT_LINE	All deletes pruned 
prune	TokenNameIdentifier	 prune
(	TokenNameLPAREN	
limit	TokenNameIdentifier	 limit
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
!	TokenNameNOT	
any	TokenNameIdentifier	 any
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
checkDeleteStats	TokenNameIdentifier	 check Delete Stats
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
prune	TokenNameIdentifier	 prune
(	TokenNameLPAREN	
int	TokenNameint	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
count	TokenNameIdentifier	 count
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
infoStream	TokenNameIdentifier	 info Stream
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
message	TokenNameIdentifier	 message
(	TokenNameLPAREN	
"pruneDeletes: prune "	TokenNameStringLiteral	pruneDeletes: prune 
+	TokenNamePLUS	
count	TokenNameIdentifier	 count
+	TokenNamePLUS	
" packets; "	TokenNameStringLiteral	 packets; 
+	TokenNamePLUS	
(	TokenNameLPAREN	
deletes	TokenNameIdentifier	 deletes
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
+	TokenNamePLUS	
" packets remain"	TokenNameStringLiteral	 packets remain
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
delIDX	TokenNameIdentifier	 del IDX
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
delIDX	TokenNameIdentifier	 del IDX
<	TokenNameLESS	
count	TokenNameIdentifier	 count
;	TokenNameSEMICOLON	
delIDX	TokenNameIdentifier	 del IDX
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
FrozenBufferedDeletes	TokenNameIdentifier	 Frozen Buffered Deletes
packet	TokenNameIdentifier	 packet
=	TokenNameEQUAL	
deletes	TokenNameIdentifier	 deletes
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
delIDX	TokenNameIdentifier	 del IDX
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
numTerms	TokenNameIdentifier	 num Terms
.	TokenNameDOT	
addAndGet	TokenNameIdentifier	 add And Get
(	TokenNameLPAREN	
-	TokenNameMINUS	
packet	TokenNameIdentifier	 packet
.	TokenNameDOT	
numTermDeletes	TokenNameIdentifier	 num Term Deletes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
numTerms	TokenNameIdentifier	 num Terms
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
bytesUsed	TokenNameIdentifier	 bytes Used
.	TokenNameDOT	
addAndGet	TokenNameIdentifier	 add And Get
(	TokenNameLPAREN	
-	TokenNameMINUS	
packet	TokenNameIdentifier	 packet
.	TokenNameDOT	
bytesUsed	TokenNameIdentifier	 bytes Used
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
bytesUsed	TokenNameIdentifier	 bytes Used
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
deletes	TokenNameIdentifier	 deletes
.	TokenNameDOT	
subList	TokenNameIdentifier	 sub List
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// Delete by Term 	TokenNameCOMMENT_LINE	Delete by Term 
private	TokenNameprivate	
synchronized	TokenNamesynchronized	
long	TokenNamelong	
applyTermDeletes	TokenNameIdentifier	 apply Term Deletes
(	TokenNameLPAREN	
Iterable	TokenNameIdentifier	 Iterable
<	TokenNameLESS	
Term	TokenNameIdentifier	 Term
>	TokenNameGREATER	
termsIter	TokenNameIdentifier	 terms Iter
,	TokenNameCOMMA	
SegmentReader	TokenNameIdentifier	 Segment Reader
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
long	TokenNamelong	
delCount	TokenNameIdentifier	 del Count
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
checkDeleteTerm	TokenNameIdentifier	 check Delete Term
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
TermDocs	TokenNameIdentifier	 Term Docs
docs	TokenNameIdentifier	 docs
=	TokenNameEQUAL	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
termDocs	TokenNameIdentifier	 term Docs
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Term	TokenNameIdentifier	 Term
term	TokenNameIdentifier	 term
:	TokenNameCOLON	
termsIter	TokenNameIdentifier	 terms Iter
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Since we visit terms sorted, we gain performance 	TokenNameCOMMENT_LINE	Since we visit terms sorted, we gain performance 
// by re-using the same TermsEnum and seeking only 	TokenNameCOMMENT_LINE	by re-using the same TermsEnum and seeking only 
// forwards 	TokenNameCOMMENT_LINE	forwards 
assert	TokenNameassert	
checkDeleteTerm	TokenNameIdentifier	 check Delete Term
(	TokenNameLPAREN	
term	TokenNameIdentifier	 term
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
docs	TokenNameIdentifier	 docs
.	TokenNameDOT	
seek	TokenNameIdentifier	 seek
(	TokenNameLPAREN	
term	TokenNameIdentifier	 term
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
docs	TokenNameIdentifier	 docs
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
docID	TokenNameIdentifier	 doc ID
=	TokenNameEQUAL	
docs	TokenNameIdentifier	 docs
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
deleteDocument	TokenNameIdentifier	 delete Document
(	TokenNameLPAREN	
docID	TokenNameIdentifier	 doc ID
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// TODO: we could/should change 	TokenNameCOMMENT_LINE	TODO: we could/should change 
// reader.deleteDocument to return boolean 	TokenNameCOMMENT_LINE	reader.deleteDocument to return boolean 
// true if it did in fact delete, because here 	TokenNameCOMMENT_LINE	true if it did in fact delete, because here 
// we could be deleting an already-deleted doc 	TokenNameCOMMENT_LINE	we could be deleting an already-deleted doc 
// which makes this an upper bound: 	TokenNameCOMMENT_LINE	which makes this an upper bound: 
delCount	TokenNameIdentifier	 del Count
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
delCount	TokenNameIdentifier	 del Count
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
QueryAndLimit	TokenNameIdentifier	 Query And Limit
{	TokenNameLBRACE	
public	TokenNamepublic	
final	TokenNamefinal	
Query	TokenNameIdentifier	 Query
query	TokenNameIdentifier	 query
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
int	TokenNameint	
limit	TokenNameIdentifier	 limit
;	TokenNameSEMICOLON	
public	TokenNamepublic	
QueryAndLimit	TokenNameIdentifier	 Query And Limit
(	TokenNameLPAREN	
Query	TokenNameIdentifier	 Query
query	TokenNameIdentifier	 query
,	TokenNameCOMMA	
int	TokenNameint	
limit	TokenNameIdentifier	 limit
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
query	TokenNameIdentifier	 query
=	TokenNameEQUAL	
query	TokenNameIdentifier	 query
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
limit	TokenNameIdentifier	 limit
=	TokenNameEQUAL	
limit	TokenNameIdentifier	 limit
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// Delete by query 	TokenNameCOMMENT_LINE	Delete by query 
private	TokenNameprivate	
synchronized	TokenNamesynchronized	
long	TokenNamelong	
applyQueryDeletes	TokenNameIdentifier	 apply Query Deletes
(	TokenNameLPAREN	
Iterable	TokenNameIdentifier	 Iterable
<	TokenNameLESS	
QueryAndLimit	TokenNameIdentifier	 Query And Limit
>	TokenNameGREATER	
queriesIter	TokenNameIdentifier	 queries Iter
,	TokenNameCOMMA	
SegmentReader	TokenNameIdentifier	 Segment Reader
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
long	TokenNamelong	
delCount	TokenNameIdentifier	 del Count
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
QueryAndLimit	TokenNameIdentifier	 Query And Limit
ent	TokenNameIdentifier	 ent
:	TokenNameCOLON	
queriesIter	TokenNameIdentifier	 queries Iter
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Query	TokenNameIdentifier	 Query
query	TokenNameIdentifier	 query
=	TokenNameEQUAL	
ent	TokenNameIdentifier	 ent
.	TokenNameDOT	
query	TokenNameIdentifier	 query
;	TokenNameSEMICOLON	
int	TokenNameint	
limit	TokenNameIdentifier	 limit
=	TokenNameEQUAL	
ent	TokenNameIdentifier	 ent
.	TokenNameDOT	
limit	TokenNameIdentifier	 limit
;	TokenNameSEMICOLON	
final	TokenNamefinal	
DocIdSet	TokenNameIdentifier	 Doc Id Set
docs	TokenNameIdentifier	 docs
=	TokenNameEQUAL	
new	TokenNamenew	
QueryWrapperFilter	TokenNameIdentifier	 Query Wrapper Filter
(	TokenNameLPAREN	
query	TokenNameIdentifier	 query
)	TokenNameRPAREN	
.	TokenNameDOT	
getDocIdSet	TokenNameIdentifier	 get Doc Id Set
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
docs	TokenNameIdentifier	 docs
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
DocIdSetIterator	TokenNameIdentifier	 Doc Id Set Iterator
it	TokenNameIdentifier	 it
=	TokenNameEQUAL	
docs	TokenNameIdentifier	 docs
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
it	TokenNameIdentifier	 it
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
doc	TokenNameIdentifier	 doc
=	TokenNameEQUAL	
it	TokenNameIdentifier	 it
.	TokenNameDOT	
nextDoc	TokenNameIdentifier	 next Doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
>=	TokenNameGREATER_EQUAL	
limit	TokenNameIdentifier	 limit
)	TokenNameRPAREN	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
deleteDocument	TokenNameIdentifier	 delete Document
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// TODO: we could/should change 	TokenNameCOMMENT_LINE	TODO: we could/should change 
// reader.deleteDocument to return boolean 	TokenNameCOMMENT_LINE	reader.deleteDocument to return boolean 
// true if it did in fact delete, because here 	TokenNameCOMMENT_LINE	true if it did in fact delete, because here 
// we could be deleting an already-deleted doc 	TokenNameCOMMENT_LINE	we could be deleting an already-deleted doc 
// which makes this an upper bound: 	TokenNameCOMMENT_LINE	which makes this an upper bound: 
delCount	TokenNameIdentifier	 del Count
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
delCount	TokenNameIdentifier	 del Count
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// used only by assert 	TokenNameCOMMENT_LINE	used only by assert 
private	TokenNameprivate	
boolean	TokenNameboolean	
checkDeleteTerm	TokenNameIdentifier	 check Delete Term
(	TokenNameLPAREN	
Term	TokenNameIdentifier	 Term
term	TokenNameIdentifier	 term
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
term	TokenNameIdentifier	 term
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assert	TokenNameassert	
lastDeleteTerm	TokenNameIdentifier	 last Delete Term
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
term	TokenNameIdentifier	 term
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
lastDeleteTerm	TokenNameIdentifier	 last Delete Term
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
"lastTerm="	TokenNameStringLiteral	lastTerm=
+	TokenNamePLUS	
lastDeleteTerm	TokenNameIdentifier	 last Delete Term
+	TokenNamePLUS	
" vs term="	TokenNameStringLiteral	 vs term=
+	TokenNamePLUS	
term	TokenNameIdentifier	 term
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// TODO: we re-use term now in our merged iterable, but we shouldn't clone, instead copy for this assert 	TokenNameCOMMENT_LINE	TODO: we re-use term now in our merged iterable, but we shouldn't clone, instead copy for this assert 
lastDeleteTerm	TokenNameIdentifier	 last Delete Term
=	TokenNameEQUAL	
term	TokenNameIdentifier	 term
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
null	TokenNamenull	
:	TokenNameCOLON	
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
(	TokenNameLPAREN	
term	TokenNameIdentifier	 term
.	TokenNameDOT	
field	TokenNameIdentifier	 field
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
term	TokenNameIdentifier	 term
.	TokenNameDOT	
text	TokenNameIdentifier	 text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// only for assert 	TokenNameCOMMENT_LINE	only for assert 
private	TokenNameprivate	
boolean	TokenNameboolean	
checkDeleteStats	TokenNameIdentifier	 check Delete Stats
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
numTerms2	TokenNameIdentifier	 num Terms2
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
long	TokenNamelong	
bytesUsed2	TokenNameIdentifier	 bytes Used2
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
FrozenBufferedDeletes	TokenNameIdentifier	 Frozen Buffered Deletes
packet	TokenNameIdentifier	 packet
:	TokenNameCOLON	
deletes	TokenNameIdentifier	 deletes
)	TokenNameRPAREN	
{	TokenNameLBRACE	
numTerms2	TokenNameIdentifier	 num Terms2
+=	TokenNamePLUS_EQUAL	
packet	TokenNameIdentifier	 packet
.	TokenNameDOT	
numTermDeletes	TokenNameIdentifier	 num Term Deletes
;	TokenNameSEMICOLON	
bytesUsed2	TokenNameIdentifier	 bytes Used2
+=	TokenNamePLUS_EQUAL	
packet	TokenNameIdentifier	 packet
.	TokenNameDOT	
bytesUsed	TokenNameIdentifier	 bytes Used
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
assert	TokenNameassert	
numTerms2	TokenNameIdentifier	 num Terms2
==	TokenNameEQUAL_EQUAL	
numTerms	TokenNameIdentifier	 num Terms
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
"numTerms2="	TokenNameStringLiteral	numTerms2=
+	TokenNamePLUS	
numTerms2	TokenNameIdentifier	 num Terms2
+	TokenNamePLUS	
" vs "	TokenNameStringLiteral	 vs 
+	TokenNamePLUS	
numTerms	TokenNameIdentifier	 num Terms
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
bytesUsed2	TokenNameIdentifier	 bytes Used2
==	TokenNameEQUAL_EQUAL	
bytesUsed	TokenNameIdentifier	 bytes Used
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
"bytesUsed2="	TokenNameStringLiteral	bytesUsed2=
+	TokenNamePLUS	
bytesUsed2	TokenNameIdentifier	 bytes Used2
+	TokenNamePLUS	
" vs "	TokenNameStringLiteral	 vs 
+	TokenNamePLUS	
bytesUsed	TokenNameIdentifier	 bytes Used
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
