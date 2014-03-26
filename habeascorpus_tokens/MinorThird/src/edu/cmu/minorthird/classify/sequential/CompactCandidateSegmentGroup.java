/* Copyright 2003-2004, Carnegie Mellon, All Rights Reserved */	TokenNameCOMMENT_BLOCK	 Copyright 2003-2004, Carnegie Mellon, All Rights Reserved 
package	TokenNamepackage	
edu	TokenNameIdentifier	 edu
.	TokenNameDOT	
cmu	TokenNameIdentifier	 cmu
.	TokenNameDOT	
minorthird	TokenNameIdentifier	 minorthird
.	TokenNameDOT	
classify	TokenNameIdentifier	 classify
.	TokenNameDOT	
sequential	TokenNameIdentifier	 sequential
;	TokenNameSEMICOLON	
import	TokenNameimport	
edu	TokenNameIdentifier	 edu
.	TokenNameDOT	
cmu	TokenNameIdentifier	 cmu
.	TokenNameDOT	
minorthird	TokenNameIdentifier	 minorthird
.	TokenNameDOT	
classify	TokenNameIdentifier	 classify
.	TokenNameDOT	
*	TokenNameMULTIPLY	
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
Serializable	TokenNameIdentifier	 Serializable
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
*	TokenNameMULTIPLY	
;	TokenNameSEMICOLON	
import	TokenNameimport	
gnu	TokenNameIdentifier	 gnu
.	TokenNameDOT	
trove	TokenNameIdentifier	 trove
.	TokenNameDOT	
*	TokenNameMULTIPLY	
;	TokenNameSEMICOLON	
/** * A more space-efficient version of a CandidateSegmentGroup. * * Space is saved by explicitly storing the instances for the * unit-length segments, plus "deltas" for each non-unit length segment. * Each "delta" encodes the difference between the segment instance * and the sum of the unit-length instances it covers. * * @author William Cohen */	TokenNameCOMMENT_JAVADOC	 A more space-efficient version of a CandidateSegmentGroup. * Space is saved by explicitly storing the instances for the unit-length segments, plus "deltas" for each non-unit length segment. Each "delta" encodes the difference between the segment instance and the sum of the unit-length instances it covers. * @author William Cohen 
public	TokenNamepublic	
class	TokenNameclass	
CompactCandidateSegmentGroup	TokenNameIdentifier	 Compact Candidate Segment Group
implements	TokenNameimplements	
CandidateSegmentGroup	TokenNameIdentifier	 Candidate Segment Group
,	TokenNameCOMMA	
Serializable	TokenNameIdentifier	 Serializable
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
20080207L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
maxWindowSize	TokenNameIdentifier	 max Window Size
,	TokenNameCOMMA	
sequenceLength	TokenNameIdentifier	 sequence Length
,	TokenNameCOMMA	
totalSize	TokenNameIdentifier	 total Size
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
classNameSet	TokenNameIdentifier	 class Name Set
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
subPopId	TokenNameIdentifier	 sub Pop Id
;	TokenNameSEMICOLON	
// the segment from start to start+L is window[start][L-1]. 	TokenNameCOMMENT_LINE	the segment from start to start+L is window[start][L-1]. 
private	TokenNameprivate	
Instance	TokenNameIdentifier	 Instance
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
unitInstance	TokenNameIdentifier	 unit Instance
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Delta	TokenNameIdentifier	 Delta
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
delta	TokenNameIdentifier	 delta
;	TokenNameSEMICOLON	
private	TokenNameprivate	
ClassLabel	TokenNameIdentifier	 Class Label
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
label	TokenNameIdentifier	 label
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
segmentSource	TokenNameIdentifier	 segment Source
;	TokenNameSEMICOLON	
/** Creates a new holder for sliding-window instances. */	TokenNameCOMMENT_JAVADOC	 Creates a new holder for sliding-window instances. 
public	TokenNamepublic	
CompactCandidateSegmentGroup	TokenNameIdentifier	 Compact Candidate Segment Group
(	TokenNameLPAREN	
FeatureFactory	TokenNameIdentifier	 Feature Factory
factory	TokenNameIdentifier	 factory
,	TokenNameCOMMA	
CandidateSegmentGroup	TokenNameIdentifier	 Candidate Segment Group
group	TokenNameIdentifier	 group
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// The length of the original sequence 	TokenNameCOMMENT_LINE	The length of the original sequence 
this	TokenNamethis	
.	TokenNameDOT	
sequenceLength	TokenNameIdentifier	 sequence Length
=	TokenNameEQUAL	
group	TokenNameIdentifier	 group
.	TokenNameDOT	
getSequenceLength	TokenNameIdentifier	 get Sequence Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// The maximum length of any sliding window 	TokenNameCOMMENT_LINE	The maximum length of any sliding window 
this	TokenNamethis	
.	TokenNameDOT	
maxWindowSize	TokenNameIdentifier	 max Window Size
=	TokenNameEQUAL	
group	TokenNameIdentifier	 group
.	TokenNameDOT	
getMaxWindowSize	TokenNameIdentifier	 get Max Window Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
totalSize	TokenNameIdentifier	 total Size
=	TokenNameEQUAL	
group	TokenNameIdentifier	 group
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
classNameSet	TokenNameIdentifier	 class Name Set
=	TokenNameEQUAL	
group	TokenNameIdentifier	 group
.	TokenNameDOT	
classNameSet	TokenNameIdentifier	 class Name Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
subPopId	TokenNameIdentifier	 sub Pop Id
=	TokenNameEQUAL	
group	TokenNameIdentifier	 group
.	TokenNameDOT	
getSubpopulationId	TokenNameIdentifier	 get Subpopulation Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
unitInstance	TokenNameIdentifier	 unit Instance
=	TokenNameEQUAL	
new	TokenNamenew	
Instance	TokenNameIdentifier	 Instance
[	TokenNameLBRACKET	
sequenceLength	TokenNameIdentifier	 sequence Length
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
delta	TokenNameIdentifier	 delta
=	TokenNameEQUAL	
new	TokenNamenew	
Delta	TokenNameIdentifier	 Delta
[	TokenNameLBRACKET	
sequenceLength	TokenNameIdentifier	 sequence Length
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
maxWindowSize	TokenNameIdentifier	 max Window Size
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
label	TokenNameIdentifier	 label
=	TokenNameEQUAL	
new	TokenNamenew	
ClassLabel	TokenNameIdentifier	 Class Label
[	TokenNameLBRACKET	
sequenceLength	TokenNameIdentifier	 sequence Length
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
maxWindowSize	TokenNameIdentifier	 max Window Size
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
segmentSource	TokenNameIdentifier	 segment Source
=	TokenNameEQUAL	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
sequenceLength	TokenNameIdentifier	 sequence Length
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
maxWindowSize	TokenNameIdentifier	 max Window Size
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
sequenceLength	TokenNameIdentifier	 sequence Length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
unitInstance	TokenNameIdentifier	 unit Instance
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
factory	TokenNameIdentifier	 factory
.	TokenNameDOT	
compress	TokenNameIdentifier	 compress
(	TokenNameLPAREN	
group	TokenNameIdentifier	 group
.	TokenNameDOT	
getSubsequenceInstance	TokenNameIdentifier	 get Subsequence Instance
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
sequenceLength	TokenNameIdentifier	 sequence Length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
-	TokenNameMINUS	
i	TokenNameIdentifier	 i
<=	TokenNameLESS_EQUAL	
maxWindowSize	TokenNameIdentifier	 max Window Size
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
group	TokenNameIdentifier	 group
.	TokenNameDOT	
getSubsequenceInstance	TokenNameIdentifier	 get Subsequence Instance
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
label	TokenNameIdentifier	 label
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
-	TokenNameMINUS	
i	TokenNameIdentifier	 i
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
group	TokenNameIdentifier	 group
.	TokenNameDOT	
getSubsequenceLabel	TokenNameIdentifier	 get Subsequence Label
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
segmentSource	TokenNameIdentifier	 segment Source
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
-	TokenNameMINUS	
i	TokenNameIdentifier	 i
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
group	TokenNameIdentifier	 group
.	TokenNameDOT	
getSubsequenceInstance	TokenNameIdentifier	 get Subsequence Instance
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
.	TokenNameDOT	
getSource	TokenNameIdentifier	 get Source
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
delta	TokenNameIdentifier	 delta
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
-	TokenNameMINUS	
i	TokenNameIdentifier	 i
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
Delta	TokenNameIdentifier	 Delta
(	TokenNameLPAREN	
factory	TokenNameIdentifier	 factory
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
j	TokenNameIdentifier	 j
,	TokenNameCOMMA	
group	TokenNameIdentifier	 group
.	TokenNameDOT	
getSubsequenceInstance	TokenNameIdentifier	 get Subsequence Instance
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// 	TokenNameCOMMENT_LINE	 
// helpers to construct feature iterators and/or compute weights 	TokenNameCOMMENT_LINE	helpers to construct feature iterators and/or compute weights 
// 	TokenNameCOMMENT_LINE	 
/** The binary features in in any unitInstance between start...end * or otherInstance. Equivalently, the features in the sum of * {unitInstance[start],...,unitInstance[end-1],otherInstance} */	TokenNameCOMMENT_JAVADOC	 The binary features in in any unitInstance between start...end or otherInstance. Equivalently, the features in the sum of {unitInstance[start],...,unitInstance[end-1],otherInstance} 
private	TokenNameprivate	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
Feature	TokenNameIdentifier	 Feature
>	TokenNameGREATER	
binaryFeatureSet	TokenNameIdentifier	 binary Feature Set
(	TokenNameLPAREN	
int	TokenNameint	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
int	TokenNameint	
end	TokenNameIdentifier	 end
,	TokenNameCOMMA	
Instance	TokenNameIdentifier	 Instance
otherInstance	TokenNameIdentifier	 other Instance
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
Feature	TokenNameIdentifier	 Feature
>	TokenNameGREATER	
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
new	TokenNamenew	
HashSet	TokenNameIdentifier	 Hash Set
<	TokenNameLESS	
Feature	TokenNameIdentifier	 Feature
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
start	TokenNameIdentifier	 start
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
end	TokenNameIdentifier	 end
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
addAll	TokenNameIdentifier	 add All
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
,	TokenNameCOMMA	
unitInstance	TokenNameIdentifier	 unit Instance
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
binaryFeatureIterator	TokenNameIdentifier	 binary Feature Iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
otherInstance	TokenNameIdentifier	 other Instance
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
addAll	TokenNameIdentifier	 add All
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
,	TokenNameCOMMA	
otherInstance	TokenNameIdentifier	 other Instance
.	TokenNameDOT	
binaryFeatureIterator	TokenNameIdentifier	 binary Feature Iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
s	TokenNameIdentifier	 s
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Analogous to binaryFeatureSet */	TokenNameCOMMENT_JAVADOC	 Analogous to binaryFeatureSet 
private	TokenNameprivate	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
Feature	TokenNameIdentifier	 Feature
>	TokenNameGREATER	
numericFeatureSet	TokenNameIdentifier	 numeric Feature Set
(	TokenNameLPAREN	
int	TokenNameint	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
int	TokenNameint	
end	TokenNameIdentifier	 end
,	TokenNameCOMMA	
Instance	TokenNameIdentifier	 Instance
otherInstance	TokenNameIdentifier	 other Instance
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
Feature	TokenNameIdentifier	 Feature
>	TokenNameGREATER	
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
new	TokenNamenew	
HashSet	TokenNameIdentifier	 Hash Set
<	TokenNameLESS	
Feature	TokenNameIdentifier	 Feature
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
start	TokenNameIdentifier	 start
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
end	TokenNameIdentifier	 end
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
addAll	TokenNameIdentifier	 add All
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
,	TokenNameCOMMA	
unitInstance	TokenNameIdentifier	 unit Instance
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
numericFeatureIterator	TokenNameIdentifier	 numeric Feature Iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
otherInstance	TokenNameIdentifier	 other Instance
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
addAll	TokenNameIdentifier	 add All
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
,	TokenNameCOMMA	
otherInstance	TokenNameIdentifier	 other Instance
.	TokenNameDOT	
numericFeatureIterator	TokenNameIdentifier	 numeric Feature Iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
s	TokenNameIdentifier	 s
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Analogous to binaryFeatureSet */	TokenNameCOMMENT_JAVADOC	 Analogous to binaryFeatureSet 
private	TokenNameprivate	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
Feature	TokenNameIdentifier	 Feature
>	TokenNameGREATER	
featureSet	TokenNameIdentifier	 feature Set
(	TokenNameLPAREN	
int	TokenNameint	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
int	TokenNameint	
end	TokenNameIdentifier	 end
,	TokenNameCOMMA	
Instance	TokenNameIdentifier	 Instance
otherInstance	TokenNameIdentifier	 other Instance
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
Feature	TokenNameIdentifier	 Feature
>	TokenNameGREATER	
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
new	TokenNamenew	
HashSet	TokenNameIdentifier	 Hash Set
<	TokenNameLESS	
Feature	TokenNameIdentifier	 Feature
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
addAll	TokenNameIdentifier	 add All
(	TokenNameLPAREN	
binaryFeatureSet	TokenNameIdentifier	 binary Feature Set
(	TokenNameLPAREN	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
end	TokenNameIdentifier	 end
,	TokenNameCOMMA	
otherInstance	TokenNameIdentifier	 other Instance
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
addAll	TokenNameIdentifier	 add All
(	TokenNameLPAREN	
numericFeatureSet	TokenNameIdentifier	 numeric Feature Set
(	TokenNameLPAREN	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
end	TokenNameIdentifier	 end
,	TokenNameCOMMA	
otherInstance	TokenNameIdentifier	 other Instance
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
s	TokenNameIdentifier	 s
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
addAll	TokenNameIdentifier	 add All
(	TokenNameLPAREN	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
Feature	TokenNameIdentifier	 Feature
>	TokenNameGREATER	
s	TokenNameIdentifier	 s
,	TokenNameCOMMA	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Feature	TokenNameIdentifier	 Feature
>	TokenNameGREATER	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Get sum of weight of f over in all unitInstance between start and end */	TokenNameCOMMENT_JAVADOC	 Get sum of weight of f over in all unitInstance between start and end 
private	TokenNameprivate	
double	TokenNamedouble	
getSumWeight	TokenNameIdentifier	 get Sum Weight
(	TokenNameLPAREN	
int	TokenNameint	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
int	TokenNameint	
end	TokenNameIdentifier	 end
,	TokenNameCOMMA	
Feature	TokenNameIdentifier	 Feature
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
{	TokenNameLBRACE	
double	TokenNamedouble	
w	TokenNameIdentifier	 w
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
start	TokenNameIdentifier	 start
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
end	TokenNameIdentifier	 end
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
w	TokenNameIdentifier	 w
+=	TokenNamePLUS_EQUAL	
unitInstance	TokenNameIdentifier	 unit Instance
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
getWeight	TokenNameIdentifier	 get Weight
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
w	TokenNameIdentifier	 w
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** encode differences between a segmentInstance and the sum of the * weights of the unit instances between start and end. */	TokenNameCOMMENT_JAVADOC	 encode differences between a segmentInstance and the sum of the weights of the unit instances between start and end. 
private	TokenNameprivate	
class	TokenNameclass	
Delta	TokenNameIdentifier	 Delta
implements	TokenNameimplements	
Serializable	TokenNameIdentifier	 Serializable
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
20080207L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
TObjectDoubleHashMap	TokenNameIdentifier	 T Object Double Hash Map
deltaWeight	TokenNameIdentifier	 delta Weight
=	TokenNameEQUAL	
new	TokenNamenew	
TObjectDoubleHashMap	TokenNameIdentifier	 T Object Double Hash Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
THashSet	TokenNameIdentifier	 T Hash Set
zeroWeights	TokenNameIdentifier	 zero Weights
=	TokenNameEQUAL	
new	TokenNamenew	
THashSet	TokenNameIdentifier	 T Hash Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
Delta	TokenNameIdentifier	 Delta
(	TokenNameLPAREN	
FeatureFactory	TokenNameIdentifier	 Feature Factory
factory	TokenNameIdentifier	 factory
,	TokenNameCOMMA	
int	TokenNameint	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
int	TokenNameint	
end	TokenNameIdentifier	 end
,	TokenNameCOMMA	
Instance	TokenNameIdentifier	 Instance
segmentInstance	TokenNameIdentifier	 segment Instance
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Feature	TokenNameIdentifier	 Feature
>	TokenNameGREATER	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
featureSet	TokenNameIdentifier	 feature Set
(	TokenNameLPAREN	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
end	TokenNameIdentifier	 end
,	TokenNameCOMMA	
segmentInstance	TokenNameIdentifier	 segment Instance
)	TokenNameRPAREN	
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Feature	TokenNameIdentifier	 Feature
f	TokenNameIdentifier	 f
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// replace the feature with its canonical version, so 	TokenNameCOMMENT_LINE	replace the feature with its canonical version, so 
// that variant versions are not stored in the 	TokenNameCOMMENT_LINE	that variant versions are not stored in the 
// deltaWeight, zeroWeights hash tables 	TokenNameCOMMENT_LINE	deltaWeight, zeroWeights hash tables 
f	TokenNameIdentifier	 f
=	TokenNameEQUAL	
factory	TokenNameIdentifier	 factory
.	TokenNameDOT	
getFeature	TokenNameIdentifier	 get Feature
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
segmentWeight	TokenNameIdentifier	 segment Weight
=	TokenNameEQUAL	
segmentInstance	TokenNameIdentifier	 segment Instance
.	TokenNameDOT	
getWeight	TokenNameIdentifier	 get Weight
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
segmentWeight	TokenNameIdentifier	 segment Weight
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
zeroWeights	TokenNameIdentifier	 zero Weights
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
{	TokenNameLBRACE	
double	TokenNamedouble	
sumWeight	TokenNameIdentifier	 sum Weight
=	TokenNameEQUAL	
getSumWeight	TokenNameIdentifier	 get Sum Weight
(	TokenNameLPAREN	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
end	TokenNameIdentifier	 end
,	TokenNameCOMMA	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
segmentWeight	TokenNameIdentifier	 segment Weight
!=	TokenNameNOT_EQUAL	
sumWeight	TokenNameIdentifier	 sum Weight
)	TokenNameRPAREN	
deltaWeight	TokenNameIdentifier	 delta Weight
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
,	TokenNameCOMMA	
segmentWeight	TokenNameIdentifier	 segment Weight
-	TokenNameMINUS	
sumWeight	TokenNameIdentifier	 sum Weight
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/* System.out.println("segmentInstance: "+segmentInstance); System.out.println("deltaInstance: "+new DeltaInstance(start,end,this, segmentInstance.getSource(), segmentInstance.getSubpopulationId())); */	TokenNameCOMMENT_BLOCK	 System.out.println("segmentInstance: "+segmentInstance); System.out.println("deltaInstance: "+new DeltaInstance(start,end,this, segmentInstance.getSource(), segmentInstance.getSubpopulationId())); 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** Construct an instance from the unit instances and a delta. */	TokenNameCOMMENT_JAVADOC	 Construct an instance from the unit instances and a delta. 
private	TokenNameprivate	
class	TokenNameclass	
DeltaInstance	TokenNameIdentifier	 Delta Instance
extends	TokenNameextends	
AbstractInstance	TokenNameIdentifier	 Abstract Instance
implements	TokenNameimplements	
Serializable	TokenNameIdentifier	 Serializable
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
20080207L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
end	TokenNameIdentifier	 end
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Delta	TokenNameIdentifier	 Delta
diff	TokenNameIdentifier	 diff
;	TokenNameSEMICOLON	
public	TokenNamepublic	
DeltaInstance	TokenNameIdentifier	 Delta Instance
(	TokenNameLPAREN	
int	TokenNameint	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
int	TokenNameint	
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
start	TokenNameIdentifier	 start
=	TokenNameEQUAL	
start	TokenNameIdentifier	 start
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
end	TokenNameIdentifier	 end
=	TokenNameEQUAL	
end	TokenNameIdentifier	 end
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
diff	TokenNameIdentifier	 diff
=	TokenNameEQUAL	
delta	TokenNameIdentifier	 delta
[	TokenNameLBRACKET	
start	TokenNameIdentifier	 start
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
end	TokenNameIdentifier	 end
-	TokenNameMINUS	
start	TokenNameIdentifier	 start
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
source	TokenNameIdentifier	 source
=	TokenNameEQUAL	
segmentSource	TokenNameIdentifier	 segment Source
[	TokenNameLBRACKET	
start	TokenNameIdentifier	 start
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
end	TokenNameIdentifier	 end
-	TokenNameMINUS	
start	TokenNameIdentifier	 start
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
subpopulationId	TokenNameIdentifier	 subpopulation Id
=	TokenNameEQUAL	
subPopId	TokenNameIdentifier	 sub Pop Id
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// for debugging mostly 	TokenNameCOMMENT_LINE	for debugging mostly 
public	TokenNamepublic	
DeltaInstance	TokenNameIdentifier	 Delta Instance
(	TokenNameLPAREN	
int	TokenNameint	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
int	TokenNameint	
end	TokenNameIdentifier	 end
,	TokenNameCOMMA	
Delta	TokenNameIdentifier	 Delta
initDelta	TokenNameIdentifier	 init Delta
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
initSource	TokenNameIdentifier	 init Source
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
initSubPopId	TokenNameIdentifier	 init Sub Pop Id
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
start	TokenNameIdentifier	 start
=	TokenNameEQUAL	
start	TokenNameIdentifier	 start
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
end	TokenNameIdentifier	 end
=	TokenNameEQUAL	
end	TokenNameIdentifier	 end
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
diff	TokenNameIdentifier	 diff
=	TokenNameEQUAL	
initDelta	TokenNameIdentifier	 init Delta
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
source	TokenNameIdentifier	 source
=	TokenNameEQUAL	
initSource	TokenNameIdentifier	 init Source
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
subpopulationId	TokenNameIdentifier	 subpopulation Id
=	TokenNameEQUAL	
initSubPopId	TokenNameIdentifier	 init Sub Pop Id
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
double	TokenNamedouble	
getWeight	TokenNameIdentifier	 get Weight
(	TokenNameLPAREN	
Feature	TokenNameIdentifier	 Feature
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
diff	TokenNameIdentifier	 diff
.	TokenNameDOT	
zeroWeights	TokenNameIdentifier	 zero Weights
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
getSumWeight	TokenNameIdentifier	 get Sum Weight
(	TokenNameLPAREN	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
end	TokenNameIdentifier	 end
,	TokenNameCOMMA	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
+	TokenNamePLUS	
diff	TokenNameIdentifier	 diff
.	TokenNameDOT	
deltaWeight	TokenNameIdentifier	 delta Weight
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Feature	TokenNameIdentifier	 Feature
>	TokenNameGREATER	
binaryFeatureIterator	TokenNameIdentifier	 binary Feature Iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
adjust	TokenNameIdentifier	 adjust
(	TokenNameLPAREN	
binaryFeatureSet	TokenNameIdentifier	 binary Feature Set
(	TokenNameLPAREN	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
end	TokenNameIdentifier	 end
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
diff	TokenNameIdentifier	 diff
.	TokenNameDOT	
zeroWeights	TokenNameIdentifier	 zero Weights
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Feature	TokenNameIdentifier	 Feature
>	TokenNameGREATER	
numericFeatureIterator	TokenNameIdentifier	 numeric Feature Iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
adjust	TokenNameIdentifier	 adjust
(	TokenNameLPAREN	
numericFeatureSet	TokenNameIdentifier	 numeric Feature Set
(	TokenNameLPAREN	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
end	TokenNameIdentifier	 end
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
diff	TokenNameIdentifier	 diff
.	TokenNameDOT	
zeroWeights	TokenNameIdentifier	 zero Weights
,	TokenNameCOMMA	
diff	TokenNameIdentifier	 diff
.	TokenNameDOT	
deltaWeight	TokenNameIdentifier	 delta Weight
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Feature	TokenNameIdentifier	 Feature
>	TokenNameGREATER	
featureIterator	TokenNameIdentifier	 feature Iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
adjust	TokenNameIdentifier	 adjust
(	TokenNameLPAREN	
featureSet	TokenNameIdentifier	 feature Set
(	TokenNameLPAREN	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
end	TokenNameIdentifier	 end
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
diff	TokenNameIdentifier	 diff
.	TokenNameDOT	
zeroWeights	TokenNameIdentifier	 zero Weights
,	TokenNameCOMMA	
diff	TokenNameIdentifier	 diff
.	TokenNameDOT	
deltaWeight	TokenNameIdentifier	 delta Weight
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
numFeatures	TokenNameIdentifier	 num Features
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"numFeatures not implemented!"	TokenNameStringLiteral	numFeatures not implemented!
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Feature	TokenNameIdentifier	 Feature
>	TokenNameGREATER	
adjust	TokenNameIdentifier	 adjust
(	TokenNameLPAREN	
final	TokenNamefinal	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
Feature	TokenNameIdentifier	 Feature
>	TokenNameGREATER	
set	TokenNameIdentifier	 set
,	TokenNameCOMMA	
THashSet	TokenNameIdentifier	 T Hash Set
exclude	TokenNameIdentifier	 exclude
,	TokenNameCOMMA	
TObjectDoubleHashMap	TokenNameIdentifier	 T Object Double Hash Map
include	TokenNameIdentifier	 include
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// like set.removeAll(exclude) but faster 	TokenNameCOMMENT_LINE	like set.removeAll(exclude) but faster 
exclude	TokenNameIdentifier	 exclude
.	TokenNameDOT	
forEach	TokenNameIdentifier	 for Each
(	TokenNameLPAREN	
new	TokenNamenew	
TObjectProcedure	TokenNameIdentifier	 T Object Procedure
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
boolean	TokenNameboolean	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
{	TokenNameLBRACE	
set	TokenNameIdentifier	 set
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
// indicates it's ok to invoke this procedure again 	TokenNameCOMMENT_LINE	indicates it's ok to invoke this procedure again 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
include	TokenNameIdentifier	 include
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// like set.addAll( include ) but faster 	TokenNameCOMMENT_LINE	like set.addAll( include ) but faster 
include	TokenNameIdentifier	 include
.	TokenNameDOT	
forEachKey	TokenNameIdentifier	 for Each Key
(	TokenNameLPAREN	
new	TokenNamenew	
TObjectProcedure	TokenNameIdentifier	 T Object Procedure
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
boolean	TokenNameboolean	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
{	TokenNameLBRACE	
set	TokenNameIdentifier	 set
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Feature	TokenNameIdentifier	 Feature
)	TokenNameRPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
// indicates it's ok to invoke this procedure again 	TokenNameCOMMENT_LINE	indicates it's ok to invoke this procedure again 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
set	TokenNameIdentifier	 set
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// 	TokenNameCOMMENT_LINE	 
// implement the rest of the interface... 	TokenNameCOMMENT_LINE	implement the rest of the interface... 
// 	TokenNameCOMMENT_LINE	 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
Example	TokenNameIdentifier	 Example
getSubsequenceExample	TokenNameIdentifier	 get Subsequence Example
(	TokenNameLPAREN	
int	TokenNameint	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
int	TokenNameint	
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
end	TokenNameIdentifier	 end
-	TokenNameMINUS	
start	TokenNameIdentifier	 start
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
new	TokenNamenew	
Example	TokenNameIdentifier	 Example
(	TokenNameLPAREN	
unitInstance	TokenNameIdentifier	 unit Instance
[	TokenNameLBRACKET	
start	TokenNameIdentifier	 start
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
label	TokenNameIdentifier	 label
[	TokenNameLBRACKET	
start	TokenNameIdentifier	 start
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
delta	TokenNameIdentifier	 delta
[	TokenNameLBRACKET	
start	TokenNameIdentifier	 start
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
end	TokenNameIdentifier	 end
-	TokenNameMINUS	
start	TokenNameIdentifier	 start
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
new	TokenNamenew	
Example	TokenNameIdentifier	 Example
(	TokenNameLPAREN	
new	TokenNamenew	
DeltaInstance	TokenNameIdentifier	 Delta Instance
(	TokenNameLPAREN	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
,	TokenNameCOMMA	
label	TokenNameIdentifier	 label
[	TokenNameLBRACKET	
start	TokenNameIdentifier	 start
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
end	TokenNameIdentifier	 end
-	TokenNameMINUS	
start	TokenNameIdentifier	 start
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Return the class label associated with getSubsequenceExample(start,end). */	TokenNameCOMMENT_JAVADOC	 Return the class label associated with getSubsequenceExample(start,end). 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
ClassLabel	TokenNameIdentifier	 Class Label
getSubsequenceLabel	TokenNameIdentifier	 get Subsequence Label
(	TokenNameLPAREN	
int	TokenNameint	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
int	TokenNameint	
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
label	TokenNameIdentifier	 label
[	TokenNameLBRACKET	
start	TokenNameIdentifier	 start
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
end	TokenNameIdentifier	 end
-	TokenNameMINUS	
start	TokenNameIdentifier	 start
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Return the instance corresponding to the segment from positions start...end. */	TokenNameCOMMENT_JAVADOC	 Return the instance corresponding to the segment from positions start...end. 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
Instance	TokenNameIdentifier	 Instance
getSubsequenceInstance	TokenNameIdentifier	 get Subsequence Instance
(	TokenNameLPAREN	
int	TokenNameint	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
int	TokenNameint	
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
end	TokenNameIdentifier	 end
-	TokenNameMINUS	
start	TokenNameIdentifier	 start
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
new	TokenNamenew	
Example	TokenNameIdentifier	 Example
(	TokenNameLPAREN	
unitInstance	TokenNameIdentifier	 unit Instance
[	TokenNameLBRACKET	
start	TokenNameIdentifier	 start
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
label	TokenNameIdentifier	 label
[	TokenNameLBRACKET	
start	TokenNameIdentifier	 start
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
delta	TokenNameIdentifier	 delta
[	TokenNameLBRACKET	
start	TokenNameIdentifier	 start
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
end	TokenNameIdentifier	 end
-	TokenNameMINUS	
start	TokenNameIdentifier	 start
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
new	TokenNamenew	
DeltaInstance	TokenNameIdentifier	 Delta Instance
(	TokenNameLPAREN	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
getSequenceLength	TokenNameIdentifier	 get Sequence Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
sequenceLength	TokenNameIdentifier	 sequence Length
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
getMaxWindowSize	TokenNameIdentifier	 get Max Window Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
maxWindowSize	TokenNameIdentifier	 max Window Size
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getSubpopulationId	TokenNameIdentifier	 get Subpopulation Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
subPopId	TokenNameIdentifier	 sub Pop Id
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
totalSize	TokenNameIdentifier	 total Size
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
classNameSet	TokenNameIdentifier	 class Name Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
classNameSet	TokenNameIdentifier	 class Name Set
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
