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
/** Remaps docIDs after a merge has completed, where the * merged segments had at least one deletion. This is used * to renumber the buffered deletes in IndexWriter when a * merge of segments with deletions commits. */	TokenNameCOMMENT_JAVADOC	 Remaps docIDs after a merge has completed, where the merged segments had at least one deletion. This is used to renumber the buffered deletes in IndexWriter when a merge of segments with deletions commits. 
final	TokenNamefinal	
class	TokenNameclass	
MergeDocIDRemapper	TokenNameIdentifier	 Merge Doc ID Remapper
{	TokenNameLBRACE	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
starts	TokenNameIdentifier	 starts
;	TokenNameSEMICOLON	
// used for binary search of mapped docID 	TokenNameCOMMENT_LINE	used for binary search of mapped docID 
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
newStarts	TokenNameIdentifier	 new Starts
;	TokenNameSEMICOLON	
// starts, minus the deletes 	TokenNameCOMMENT_LINE	starts, minus the deletes 
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
docMaps	TokenNameIdentifier	 doc Maps
;	TokenNameSEMICOLON	
// maps docIDs in the merged set 	TokenNameCOMMENT_LINE	maps docIDs in the merged set 
int	TokenNameint	
minDocID	TokenNameIdentifier	 min Doc ID
;	TokenNameSEMICOLON	
// minimum docID that needs renumbering 	TokenNameCOMMENT_LINE	minimum docID that needs renumbering 
int	TokenNameint	
maxDocID	TokenNameIdentifier	 max Doc ID
;	TokenNameSEMICOLON	
// 1+ the max docID that needs renumbering 	TokenNameCOMMENT_LINE	1+ the max docID that needs renumbering 
int	TokenNameint	
docShift	TokenNameIdentifier	 doc Shift
;	TokenNameSEMICOLON	
// total # deleted docs that were compacted by this merge 	TokenNameCOMMENT_LINE	total # deleted docs that were compacted by this merge 
public	TokenNamepublic	
MergeDocIDRemapper	TokenNameIdentifier	 Merge Doc ID Remapper
(	TokenNameLPAREN	
SegmentInfos	TokenNameIdentifier	 Segment Infos
infos	TokenNameIdentifier	 infos
,	TokenNameCOMMA	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
docMaps	TokenNameIdentifier	 doc Maps
,	TokenNameCOMMA	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
delCounts	TokenNameIdentifier	 del Counts
,	TokenNameCOMMA	
MergePolicy	TokenNameIdentifier	 Merge Policy
.	TokenNameDOT	
OneMerge	TokenNameIdentifier	 One Merge
merge	TokenNameIdentifier	 merge
,	TokenNameCOMMA	
int	TokenNameint	
mergedDocCount	TokenNameIdentifier	 merged Doc Count
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
docMaps	TokenNameIdentifier	 doc Maps
=	TokenNameEQUAL	
docMaps	TokenNameIdentifier	 doc Maps
;	TokenNameSEMICOLON	
SegmentInfo	TokenNameIdentifier	 Segment Info
firstSegment	TokenNameIdentifier	 first Segment
=	TokenNameEQUAL	
merge	TokenNameIdentifier	 merge
.	TokenNameDOT	
segments	TokenNameIdentifier	 segments
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
SegmentInfo	TokenNameIdentifier	 Segment Info
info	TokenNameIdentifier	 info
=	TokenNameEQUAL	
infos	TokenNameIdentifier	 infos
.	TokenNameDOT	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
info	TokenNameIdentifier	 info
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
firstSegment	TokenNameIdentifier	 first Segment
)	TokenNameRPAREN	
)	TokenNameRPAREN	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
minDocID	TokenNameIdentifier	 min Doc ID
+=	TokenNamePLUS_EQUAL	
info	TokenNameIdentifier	 info
.	TokenNameDOT	
docCount	TokenNameIdentifier	 doc Count
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
numDocs	TokenNameIdentifier	 num Docs
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
docMaps	TokenNameIdentifier	 doc Maps
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
,	TokenNameCOMMA	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
numDocs	TokenNameIdentifier	 num Docs
+=	TokenNamePLUS_EQUAL	
infos	TokenNameIdentifier	 infos
.	TokenNameDOT	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
.	TokenNameDOT	
docCount	TokenNameIdentifier	 doc Count
;	TokenNameSEMICOLON	
assert	TokenNameassert	
infos	TokenNameIdentifier	 infos
.	TokenNameDOT	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
merge	TokenNameIdentifier	 merge
.	TokenNameDOT	
segments	TokenNameIdentifier	 segments
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
maxDocID	TokenNameIdentifier	 max Doc ID
=	TokenNameEQUAL	
minDocID	TokenNameIdentifier	 min Doc ID
+	TokenNamePLUS	
numDocs	TokenNameIdentifier	 num Docs
;	TokenNameSEMICOLON	
starts	TokenNameIdentifier	 starts
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
docMaps	TokenNameIdentifier	 doc Maps
.	TokenNameDOT	
length	TokenNameIdentifier	 length
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
newStarts	TokenNameIdentifier	 new Starts
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
docMaps	TokenNameIdentifier	 doc Maps
.	TokenNameDOT	
length	TokenNameIdentifier	 length
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
starts	TokenNameIdentifier	 starts
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
minDocID	TokenNameIdentifier	 min Doc ID
;	TokenNameSEMICOLON	
newStarts	TokenNameIdentifier	 new Starts
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
minDocID	TokenNameIdentifier	 min Doc ID
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
docMaps	TokenNameIdentifier	 doc Maps
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
lastDocCount	TokenNameIdentifier	 last Doc Count
=	TokenNameEQUAL	
merge	TokenNameIdentifier	 merge
.	TokenNameDOT	
segments	TokenNameIdentifier	 segments
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
docCount	TokenNameIdentifier	 doc Count
;	TokenNameSEMICOLON	
starts	TokenNameIdentifier	 starts
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
starts	TokenNameIdentifier	 starts
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+	TokenNamePLUS	
lastDocCount	TokenNameIdentifier	 last Doc Count
;	TokenNameSEMICOLON	
newStarts	TokenNameIdentifier	 new Starts
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
newStarts	TokenNameIdentifier	 new Starts
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+	TokenNamePLUS	
lastDocCount	TokenNameIdentifier	 last Doc Count
-	TokenNameMINUS	
delCounts	TokenNameIdentifier	 del Counts
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
docShift	TokenNameIdentifier	 doc Shift
=	TokenNameEQUAL	
numDocs	TokenNameIdentifier	 num Docs
-	TokenNameMINUS	
mergedDocCount	TokenNameIdentifier	 merged Doc Count
;	TokenNameSEMICOLON	
// There are rare cases when docShift is 0. It happens 	TokenNameCOMMENT_LINE	There are rare cases when docShift is 0. It happens 
// if you try to delete a docID that's out of bounds, 	TokenNameCOMMENT_LINE	if you try to delete a docID that's out of bounds, 
// because the SegmentReader still allocates deletedDocs 	TokenNameCOMMENT_LINE	because the SegmentReader still allocates deletedDocs 
// and pretends it has deletions ... so we can't make 	TokenNameCOMMENT_LINE	and pretends it has deletions ... so we can't make 
// this assert here 	TokenNameCOMMENT_LINE	this assert here 
// assert docShift > 0; 	TokenNameCOMMENT_LINE	assert docShift > 0; 
// Make sure it all adds up: 	TokenNameCOMMENT_LINE	Make sure it all adds up: 
assert	TokenNameassert	
docShift	TokenNameIdentifier	 doc Shift
==	TokenNameEQUAL_EQUAL	
maxDocID	TokenNameIdentifier	 max Doc ID
-	TokenNameMINUS	
(	TokenNameLPAREN	
newStarts	TokenNameIdentifier	 new Starts
[	TokenNameLBRACKET	
docMaps	TokenNameIdentifier	 doc Maps
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+	TokenNamePLUS	
merge	TokenNameIdentifier	 merge
.	TokenNameDOT	
segments	TokenNameIdentifier	 segments
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
docMaps	TokenNameIdentifier	 doc Maps
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
docCount	TokenNameIdentifier	 doc Count
-	TokenNameMINUS	
delCounts	TokenNameIdentifier	 del Counts
[	TokenNameLBRACKET	
docMaps	TokenNameIdentifier	 doc Maps
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
remap	TokenNameIdentifier	 remap
(	TokenNameLPAREN	
int	TokenNameint	
oldDocID	TokenNameIdentifier	 old Doc ID
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
oldDocID	TokenNameIdentifier	 old Doc ID
<	TokenNameLESS	
minDocID	TokenNameIdentifier	 min Doc ID
)	TokenNameRPAREN	
// Unaffected by merge 	TokenNameCOMMENT_LINE	Unaffected by merge 
return	TokenNamereturn	
oldDocID	TokenNameIdentifier	 old Doc ID
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
oldDocID	TokenNameIdentifier	 old Doc ID
>=	TokenNameGREATER_EQUAL	
maxDocID	TokenNameIdentifier	 max Doc ID
)	TokenNameRPAREN	
// This doc was "after" the merge, so simple shift 	TokenNameCOMMENT_LINE	This doc was "after" the merge, so simple shift 
return	TokenNamereturn	
oldDocID	TokenNameIdentifier	 old Doc ID
-	TokenNameMINUS	
docShift	TokenNameIdentifier	 doc Shift
;	TokenNameSEMICOLON	
else	TokenNameelse	
{	TokenNameLBRACE	
// Binary search to locate this document & find its new docID 	TokenNameCOMMENT_LINE	Binary search to locate this document & find its new docID 
int	TokenNameint	
lo	TokenNameIdentifier	 lo
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// search starts array 	TokenNameCOMMENT_LINE	search starts array 
int	TokenNameint	
hi	TokenNameIdentifier	 hi
=	TokenNameEQUAL	
docMaps	TokenNameIdentifier	 doc Maps
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// for first element less 	TokenNameCOMMENT_LINE	for first element less 
while	TokenNamewhile	
(	TokenNameLPAREN	
hi	TokenNameIdentifier	 hi
>=	TokenNameGREATER_EQUAL	
lo	TokenNameIdentifier	 lo
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
mid	TokenNameIdentifier	 mid
=	TokenNameEQUAL	
(	TokenNameLPAREN	
lo	TokenNameIdentifier	 lo
+	TokenNamePLUS	
hi	TokenNameIdentifier	 hi
)	TokenNameRPAREN	
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
midValue	TokenNameIdentifier	 mid Value
=	TokenNameEQUAL	
starts	TokenNameIdentifier	 starts
[	TokenNameLBRACKET	
mid	TokenNameIdentifier	 mid
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
oldDocID	TokenNameIdentifier	 old Doc ID
<	TokenNameLESS	
midValue	TokenNameIdentifier	 mid Value
)	TokenNameRPAREN	
hi	TokenNameIdentifier	 hi
=	TokenNameEQUAL	
mid	TokenNameIdentifier	 mid
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
oldDocID	TokenNameIdentifier	 old Doc ID
>	TokenNameGREATER	
midValue	TokenNameIdentifier	 mid Value
)	TokenNameRPAREN	
lo	TokenNameIdentifier	 lo
=	TokenNameEQUAL	
mid	TokenNameIdentifier	 mid
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
else	TokenNameelse	
{	TokenNameLBRACE	
// found a match 	TokenNameCOMMENT_LINE	found a match 
while	TokenNamewhile	
(	TokenNameLPAREN	
mid	TokenNameIdentifier	 mid
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
<	TokenNameLESS	
docMaps	TokenNameIdentifier	 doc Maps
.	TokenNameDOT	
length	TokenNameIdentifier	 length
&&	TokenNameAND_AND	
starts	TokenNameIdentifier	 starts
[	TokenNameLBRACKET	
mid	TokenNameIdentifier	 mid
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
midValue	TokenNameIdentifier	 mid Value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
mid	TokenNameIdentifier	 mid
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
// scan to last match 	TokenNameCOMMENT_LINE	scan to last match 
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
docMaps	TokenNameIdentifier	 doc Maps
[	TokenNameLBRACKET	
mid	TokenNameIdentifier	 mid
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
newStarts	TokenNameIdentifier	 new Starts
[	TokenNameLBRACKET	
mid	TokenNameIdentifier	 mid
]	TokenNameRBRACKET	
+	TokenNamePLUS	
docMaps	TokenNameIdentifier	 doc Maps
[	TokenNameLBRACKET	
mid	TokenNameIdentifier	 mid
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
oldDocID	TokenNameIdentifier	 old Doc ID
-	TokenNameMINUS	
starts	TokenNameIdentifier	 starts
[	TokenNameLBRACKET	
mid	TokenNameIdentifier	 mid
]	TokenNameRBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
newStarts	TokenNameIdentifier	 new Starts
[	TokenNameLBRACKET	
mid	TokenNameIdentifier	 mid
]	TokenNameRBRACKET	
+	TokenNamePLUS	
oldDocID	TokenNameIdentifier	 old Doc ID
-	TokenNameMINUS	
starts	TokenNameIdentifier	 starts
[	TokenNameLBRACKET	
mid	TokenNameIdentifier	 mid
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
docMaps	TokenNameIdentifier	 doc Maps
[	TokenNameLBRACKET	
hi	TokenNameIdentifier	 hi
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
newStarts	TokenNameIdentifier	 new Starts
[	TokenNameLBRACKET	
hi	TokenNameIdentifier	 hi
]	TokenNameRBRACKET	
+	TokenNamePLUS	
docMaps	TokenNameIdentifier	 doc Maps
[	TokenNameLBRACKET	
hi	TokenNameIdentifier	 hi
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
oldDocID	TokenNameIdentifier	 old Doc ID
-	TokenNameMINUS	
starts	TokenNameIdentifier	 starts
[	TokenNameLBRACKET	
hi	TokenNameIdentifier	 hi
]	TokenNameRBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
newStarts	TokenNameIdentifier	 new Starts
[	TokenNameLBRACKET	
hi	TokenNameIdentifier	 hi
]	TokenNameRBRACKET	
+	TokenNamePLUS	
oldDocID	TokenNameIdentifier	 old Doc ID
-	TokenNameMINUS	
starts	TokenNameIdentifier	 starts
[	TokenNameLBRACKET	
hi	TokenNameIdentifier	 hi
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
