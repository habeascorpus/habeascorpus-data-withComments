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
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Iterator	TokenNameIdentifier	 Iterator
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
ClassLabel	TokenNameIdentifier	 Class Label
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
ExampleSchema	TokenNameIdentifier	 Example Schema
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
Feature	TokenNameIdentifier	 Feature
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
Instance	TokenNameIdentifier	 Instance
;	TokenNameSEMICOLON	
/** * Sequential learner based on the CRF algorithm. Source for the iitb.CRF * package available from http://crf.sourceforge.net. * This class implements the semi-markov version of CRF * * @author Sunita Sarawagi */	TokenNameCOMMENT_JAVADOC	 Sequential learner based on the CRF algorithm. Source for the iitb.CRF package available from http://crf.sourceforge.net. This class implements the semi-markov version of CRF * @author Sunita Sarawagi 
public	TokenNamepublic	
class	TokenNameclass	
SegmentCRFLearner	TokenNameIdentifier	 Segment CRF Learner
extends	TokenNameextends	
CRFLearner	TokenNameIdentifier	 CRF Learner
implements	TokenNameimplements	
BatchSegmenterLearner	TokenNameIdentifier	 Batch Segmenter Learner
,	TokenNameCOMMA	
SequenceConstants	TokenNameIdentifier	 Sequence Constants
,	TokenNameCOMMA	
Segmenter	TokenNameIdentifier	 Segmenter
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
20080207L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
int	TokenNameint	
negativeClass	TokenNameIdentifier	 negative Class
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
maxMemory	TokenNameIdentifier	 max Memory
;	TokenNameSEMICOLON	
public	TokenNamepublic	
SegmentCRFLearner	TokenNameIdentifier	 Segment CRF Learner
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
SegmentCRFLearner	TokenNameIdentifier	 Segment CRF Learner
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
args	TokenNameIdentifier	 args
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
class	TokenNameclass	
SegmentDataSequence	TokenNameIdentifier	 Segment Data Sequence
implements	TokenNameimplements	
iitb	TokenNameIdentifier	 iitb
.	TokenNameDOT	
CRF	TokenNameIdentifier	 CRF
.	TokenNameDOT	
SegmentDataSequence	TokenNameIdentifier	 Segment Data Sequence
{	TokenNameLBRACE	
CandidateSegmentGroup	TokenNameIdentifier	 Candidate Segment Group
segs	TokenNameIdentifier	 segs
;	TokenNameSEMICOLON	
int	TokenNameint	
labels	TokenNameIdentifier	 labels
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
int	TokenNameint	
segLengths	TokenNameIdentifier	 seg Lengths
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
SegmentDataSequence	TokenNameIdentifier	 Segment Data Sequence
(	TokenNameLPAREN	
CandidateSegmentGroup	TokenNameIdentifier	 Candidate Segment Group
tokens	TokenNameIdentifier	 tokens
)	TokenNameRPAREN	
{	TokenNameLBRACE	
segs	TokenNameIdentifier	 segs
=	TokenNameEQUAL	
tokens	TokenNameIdentifier	 tokens
;	TokenNameSEMICOLON	
alloc	TokenNameIdentifier	 alloc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
SegmentDataSequence	TokenNameIdentifier	 Segment Data Sequence
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
void	TokenNamevoid	
alloc	TokenNameIdentifier	 alloc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
labels	TokenNameIdentifier	 labels
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
labels	TokenNameIdentifier	 labels
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
labels	TokenNameIdentifier	 labels
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
segLengths	TokenNameIdentifier	 seg Lengths
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
segs	TokenNameIdentifier	 segs
.	TokenNameDOT	
getSequenceLength	TokenNameIdentifier	 get Sequence Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
void	TokenNamevoid	
init	TokenNameIdentifier	 init
(	TokenNameLPAREN	
CandidateSegmentGroup	TokenNameIdentifier	 Candidate Segment Group
tokens	TokenNameIdentifier	 tokens
)	TokenNameRPAREN	
{	TokenNameLBRACE	
segs	TokenNameIdentifier	 segs
=	TokenNameEQUAL	
tokens	TokenNameIdentifier	 tokens
;	TokenNameSEMICOLON	
alloc	TokenNameIdentifier	 alloc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
pos	TokenNameIdentifier	 pos
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
pos	TokenNameIdentifier	 pos
<	TokenNameLESS	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pos	TokenNameIdentifier	 pos
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
labels	TokenNameIdentifier	 labels
[	TokenNameLBRACKET	
pos	TokenNameIdentifier	 pos
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
negativeClass	TokenNameIdentifier	 negative Class
;	TokenNameSEMICOLON	
segLengths	TokenNameIdentifier	 seg Lengths
[	TokenNameLBRACKET	
pos	TokenNameIdentifier	 pos
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
len	TokenNameIdentifier	 len
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
len	TokenNameIdentifier	 len
<=	TokenNameLESS_EQUAL	
tokens	TokenNameIdentifier	 tokens
.	TokenNameDOT	
getMaxWindowSize	TokenNameIdentifier	 get Max Window Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
len	TokenNameIdentifier	 len
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Instance	TokenNameIdentifier	 Instance
inst	TokenNameIdentifier	 inst
=	TokenNameEQUAL	
tokens	TokenNameIdentifier	 tokens
.	TokenNameDOT	
getSubsequenceInstance	TokenNameIdentifier	 get Subsequence Instance
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
,	TokenNameCOMMA	
pos	TokenNameIdentifier	 pos
+	TokenNamePLUS	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ClassLabel	TokenNameIdentifier	 Class Label
label	TokenNameIdentifier	 label
=	TokenNameEQUAL	
tokens	TokenNameIdentifier	 tokens
.	TokenNameDOT	
getSubsequenceLabel	TokenNameIdentifier	 get Subsequence Label
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
,	TokenNameCOMMA	
pos	TokenNameIdentifier	 pos
+	TokenNamePLUS	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
inst	TokenNameIdentifier	 inst
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
!	TokenNameNOT	
label	TokenNameIdentifier	 label
.	TokenNameDOT	
isNegative	TokenNameIdentifier	 is Negative
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
k	TokenNameIdentifier	 k
=	TokenNameEQUAL	
pos	TokenNameIdentifier	 pos
;	TokenNameSEMICOLON	
k	TokenNameIdentifier	 k
<	TokenNameLESS	
pos	TokenNameIdentifier	 pos
+	TokenNamePLUS	
len	TokenNameIdentifier	 len
;	TokenNameSEMICOLON	
segLengths	TokenNameIdentifier	 seg Lengths
[	TokenNameLBRACKET	
k	TokenNameIdentifier	 k
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
labels	TokenNameIdentifier	 labels
[	TokenNameLBRACKET	
k	TokenNameIdentifier	 k
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
schema	TokenNameIdentifier	 schema
.	TokenNameDOT	
getClassIndex	TokenNameIdentifier	 get Class Index
(	TokenNameLPAREN	
label	TokenNameIdentifier	 label
.	TokenNameDOT	
bestClassName	TokenNameIdentifier	 best Class Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
segLengths	TokenNameIdentifier	 seg Lengths
[	TokenNameLBRACKET	
pos	TokenNameIdentifier	 pos
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
len	TokenNameIdentifier	 len
;	TokenNameSEMICOLON	
pos	TokenNameIdentifier	 pos
+=	TokenNamePLUS_EQUAL	
(	TokenNameLPAREN	
len	TokenNameIdentifier	 len
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
y	TokenNameIdentifier	 y
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
labels	TokenNameIdentifier	 labels
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
x	TokenNameIdentifier	 x
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
set_y	TokenNameIdentifier	 set y
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
int	TokenNameint	
label	TokenNameIdentifier	 label
)	TokenNameRPAREN	
{	TokenNameLBRACE	
labels	TokenNameIdentifier	 labels
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
label	TokenNameIdentifier	 label
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Segmentation	TokenNameIdentifier	 Segmentation
getSegments	TokenNameIdentifier	 get Segments
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Segmentation	TokenNameIdentifier	 Segmentation
segs	TokenNameIdentifier	 segs
=	TokenNameEQUAL	
new	TokenNamenew	
Segmentation	TokenNameIdentifier	 Segmentation
(	TokenNameLPAREN	
schema	TokenNameIdentifier	 schema
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
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
+=	TokenNamePLUS_EQUAL	
segLengths	TokenNameIdentifier	 seg Lengths
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
segs	TokenNameIdentifier	 segs
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
Segmentation	TokenNameIdentifier	 Segmentation
.	TokenNameDOT	
Segment	TokenNameIdentifier	 Segment
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
segLengths	TokenNameIdentifier	 seg Lengths
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
labels	TokenNameIdentifier	 labels
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
segs	TokenNameIdentifier	 segs
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
getSegmentEnd	TokenNameIdentifier	 get Segment End
(	TokenNameLPAREN	
int	TokenNameint	
segmentStart	TokenNameIdentifier	 segment Start
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
segLengths	TokenNameIdentifier	 seg Lengths
[	TokenNameLBRACKET	
segmentStart	TokenNameIdentifier	 segment Start
]	TokenNameRBRACKET	
+	TokenNamePLUS	
segmentStart	TokenNameIdentifier	 segment Start
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
setSegment	TokenNameIdentifier	 set Segment
(	TokenNameLPAREN	
int	TokenNameint	
segmentStart	TokenNameIdentifier	 segment Start
,	TokenNameCOMMA	
int	TokenNameint	
segmentEnd	TokenNameIdentifier	 segment End
,	TokenNameCOMMA	
int	TokenNameint	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
pos	TokenNameIdentifier	 pos
=	TokenNameEQUAL	
segmentStart	TokenNameIdentifier	 segment Start
;	TokenNameSEMICOLON	
pos	TokenNameIdentifier	 pos
<=	TokenNameLESS_EQUAL	
segmentEnd	TokenNameIdentifier	 segment End
;	TokenNameSEMICOLON	
pos	TokenNameIdentifier	 pos
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
labels	TokenNameIdentifier	 labels
[	TokenNameLBRACKET	
pos	TokenNameIdentifier	 pos
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
y	TokenNameIdentifier	 y
;	TokenNameSEMICOLON	
segLengths	TokenNameIdentifier	 seg Lengths
[	TokenNameLBRACKET	
pos	TokenNameIdentifier	 pos
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
segLengths	TokenNameIdentifier	 seg Lengths
[	TokenNameLBRACKET	
segmentStart	TokenNameIdentifier	 segment Start
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
segmentEnd	TokenNameIdentifier	 segment End
-	TokenNameMINUS	
segmentStart	TokenNameIdentifier	 segment Start
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
class	TokenNameclass	
CRFSegmentDataIter	TokenNameIdentifier	 CRF Segment Data Iter
implements	TokenNameimplements	
iitb	TokenNameIdentifier	 iitb
.	TokenNameDOT	
CRF	TokenNameIdentifier	 CRF
.	TokenNameDOT	
DataIter	TokenNameIdentifier	 Data Iter
{	TokenNameLBRACE	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
CandidateSegmentGroup	TokenNameIdentifier	 Candidate Segment Group
>	TokenNameGREATER	
iter	TokenNameIdentifier	 iter
;	TokenNameSEMICOLON	
SegmentDataset	TokenNameIdentifier	 Segment Dataset
dataset	TokenNameIdentifier	 dataset
;	TokenNameSEMICOLON	
SegmentDataSequence	TokenNameIdentifier	 Segment Data Sequence
segData	TokenNameIdentifier	 seg Data
;	TokenNameSEMICOLON	
CRFSegmentDataIter	TokenNameIdentifier	 CRF Segment Data Iter
(	TokenNameLPAREN	
SegmentDataset	TokenNameIdentifier	 Segment Dataset
ds	TokenNameIdentifier	 ds
)	TokenNameRPAREN	
{	TokenNameLBRACE	
dataset	TokenNameIdentifier	 dataset
=	TokenNameEQUAL	
ds	TokenNameIdentifier	 ds
;	TokenNameSEMICOLON	
segData	TokenNameIdentifier	 seg Data
=	TokenNameEQUAL	
new	TokenNamenew	
SegmentDataSequence	TokenNameIdentifier	 Segment Data Sequence
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
startScan	TokenNameIdentifier	 start Scan
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
iter	TokenNameIdentifier	 iter
=	TokenNameEQUAL	
dataset	TokenNameIdentifier	 dataset
.	TokenNameDOT	
candidateSegmentGroupIterator	TokenNameIdentifier	 candidate Segment Group Iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
boolean	TokenNameboolean	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
iter	TokenNameIdentifier	 iter
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
iitb	TokenNameIdentifier	 iitb
.	TokenNameDOT	
CRF	TokenNameIdentifier	 CRF
.	TokenNameDOT	
DataSequence	TokenNameIdentifier	 Data Sequence
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
segData	TokenNameIdentifier	 seg Data
.	TokenNameDOT	
init	TokenNameIdentifier	 init
(	TokenNameLPAREN	
iter	TokenNameIdentifier	 iter
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
segData	TokenNameIdentifier	 seg Data
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
class	TokenNameclass	
NestedMTFeatureTypes	TokenNameIdentifier	 Nested MT Feature Types
extends	TokenNameextends	
MTFeatureTypes	TokenNameIdentifier	 MT Feature Types
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
20080207L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
NestedMTFeatureTypes	TokenNameIdentifier	 Nested MT Feature Types
(	TokenNameLPAREN	
iitb	TokenNameIdentifier	 iitb
.	TokenNameDOT	
Model	TokenNameIdentifier	 Model
.	TokenNameDOT	
NestedFeatureGenImpl	TokenNameIdentifier	 Nested Feature Gen Impl
gen	TokenNameIdentifier	 gen
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
gen	TokenNameIdentifier	 gen
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
boolean	TokenNameboolean	
startScanFeaturesAt	TokenNameIdentifier	 start Scan Features At
(	TokenNameLPAREN	
iitb	TokenNameIdentifier	 iitb
.	TokenNameDOT	
CRF	TokenNameIdentifier	 CRF
.	TokenNameDOT	
DataSequence	TokenNameIdentifier	 Data Sequence
data	TokenNameIdentifier	 data
,	TokenNameCOMMA	
int	TokenNameint	
prevPos	TokenNameIdentifier	 prev Pos
,	TokenNameCOMMA	
int	TokenNameint	
pos	TokenNameIdentifier	 pos
)	TokenNameRPAREN	
{	TokenNameLBRACE	
SegmentDataSequence	TokenNameIdentifier	 Segment Data Sequence
segData	TokenNameIdentifier	 seg Data
=	TokenNameEQUAL	
(	TokenNameLPAREN	
SegmentDataSequence	TokenNameIdentifier	 Segment Data Sequence
)	TokenNameRPAREN	
data	TokenNameIdentifier	 data
;	TokenNameSEMICOLON	
example	TokenNameIdentifier	 example
=	TokenNameEQUAL	
segData	TokenNameIdentifier	 seg Data
.	TokenNameDOT	
segs	TokenNameIdentifier	 segs
.	TokenNameDOT	
getSubsequenceInstance	TokenNameIdentifier	 get Subsequence Instance
(	TokenNameLPAREN	
prevPos	TokenNameIdentifier	 prev Pos
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
pos	TokenNameIdentifier	 pos
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
featureLooper	TokenNameIdentifier	 feature Looper
=	TokenNameEQUAL	
example	TokenNameIdentifier	 example
.	TokenNameDOT	
featureIterator	TokenNameIdentifier	 feature Iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
startScan	TokenNameIdentifier	 start Scan
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
SemiMTFeatureGenImpl	TokenNameIdentifier	 Semi MT Feature Gen Impl
extends	TokenNameextends	
iitb	TokenNameIdentifier	 iitb
.	TokenNameDOT	
Model	TokenNameIdentifier	 Model
.	TokenNameDOT	
NestedFeatureGenImpl	TokenNameIdentifier	 Nested Feature Gen Impl
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
20080207L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
SemiMTFeatureGenImpl	TokenNameIdentifier	 Semi MT Feature Gen Impl
(	TokenNameLPAREN	
int	TokenNameint	
numLabels	TokenNameIdentifier	 num Labels
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
labelNames	TokenNameIdentifier	 label Names
,	TokenNameCOMMA	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Properties	TokenNameIdentifier	 Properties
options	TokenNameIdentifier	 options
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
numLabels	TokenNameIdentifier	 num Labels
,	TokenNameCOMMA	
options	TokenNameIdentifier	 options
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Feature	TokenNameIdentifier	 Feature
features	TokenNameIdentifier	 features
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
Feature	TokenNameIdentifier	 Feature
[	TokenNameLBRACKET	
labelNames	TokenNameIdentifier	 label Names
.	TokenNameDOT	
length	TokenNameIdentifier	 length
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
labelNames	TokenNameIdentifier	 label Names
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
features	TokenNameIdentifier	 features
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
Feature	TokenNameIdentifier	 Feature
(	TokenNameLPAREN	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
HISTORY_FEATURE	TokenNameIdentifier	 HISTORY  FEATURE
,	TokenNameCOMMA	
"1"	TokenNameStringLiteral	1
,	TokenNameCOMMA	
labelNames	TokenNameIdentifier	 label Names
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
addFeature	TokenNameIdentifier	 add Feature
(	TokenNameLPAREN	
new	TokenNamenew	
iitb	TokenNameIdentifier	 iitb
.	TokenNameDOT	
Model	TokenNameIdentifier	 Model
.	TokenNameDOT	
EdgeFeatures	TokenNameIdentifier	 Edge Features
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
features	TokenNameIdentifier	 features
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
addFeature	TokenNameIdentifier	 add Feature
(	TokenNameLPAREN	
new	TokenNamenew	
iitb	TokenNameIdentifier	 iitb
.	TokenNameDOT	
Model	TokenNameIdentifier	 Model
.	TokenNameDOT	
StartFeatures	TokenNameIdentifier	 Start Features
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
new	TokenNamenew	
Feature	TokenNameIdentifier	 Feature
(	TokenNameLPAREN	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
HISTORY_FEATURE	TokenNameIdentifier	 HISTORY  FEATURE
,	TokenNameCOMMA	
"1"	TokenNameStringLiteral	1
,	TokenNameCOMMA	
NULL_CLASS_NAME	TokenNameIdentifier	 NULL  CLASS  NAME
}	TokenNameRBRACE	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//addFeature(new iitb.Model.EndFeatures(model, new Feature("E"))); 	TokenNameCOMMENT_LINE	addFeature(new iitb.Model.EndFeatures(model, new Feature("E"))); 
addFeature	TokenNameIdentifier	 add Feature
(	TokenNameLPAREN	
new	TokenNamenew	
NestedMTFeatureTypes	TokenNameIdentifier	 Nested MT Feature Types
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
iitb	TokenNameIdentifier	 iitb
.	TokenNameDOT	
CRF	TokenNameIdentifier	 CRF
.	TokenNameDOT	
NestedCRF	TokenNameIdentifier	 Nested CRF
nestedCrfModel	TokenNameIdentifier	 nested Crf Model
;	TokenNameSEMICOLON	
iitb	TokenNameIdentifier	 iitb
.	TokenNameDOT	
CRF	TokenNameIdentifier	 CRF
.	TokenNameDOT	
DataIter	TokenNameIdentifier	 Data Iter
allocModel	TokenNameIdentifier	 alloc Model
(	TokenNameLPAREN	
SegmentDataset	TokenNameIdentifier	 Segment Dataset
dataset	TokenNameIdentifier	 dataset
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
maxMemory	TokenNameIdentifier	 max Memory
=	TokenNameEQUAL	
dataset	TokenNameIdentifier	 dataset
.	TokenNameDOT	
getMaxWindowSize	TokenNameIdentifier	 get Max Window Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
options	TokenNameIdentifier	 options
.	TokenNameDOT	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
"MaxMemory"	TokenNameStringLiteral	MaxMemory
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
+	TokenNamePLUS	
maxMemory	TokenNameIdentifier	 max Memory
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
negativeClass	TokenNameIdentifier	 negative Class
=	TokenNameEQUAL	
schema	TokenNameIdentifier	 schema
.	TokenNameDOT	
getClassIndex	TokenNameIdentifier	 get Class Index
(	TokenNameLPAREN	
ExampleSchema	TokenNameIdentifier	 Example Schema
.	TokenNameDOT	
NEG_CLASS_NAME	TokenNameIdentifier	 NEG  CLASS  NAME
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
featureGen	TokenNameIdentifier	 feature Gen
=	TokenNameEQUAL	
new	TokenNamenew	
SemiMTFeatureGenImpl	TokenNameIdentifier	 Semi MT Feature Gen Impl
(	TokenNameLPAREN	
schema	TokenNameIdentifier	 schema
.	TokenNameDOT	
getNumberOfClasses	TokenNameIdentifier	 get Number Of Classes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
schema	TokenNameIdentifier	 schema
.	TokenNameDOT	
validClassNames	TokenNameIdentifier	 valid Class Names
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
options	TokenNameIdentifier	 options
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
nestedCrfModel	TokenNameIdentifier	 nested Crf Model
=	TokenNameEQUAL	
new	TokenNamenew	
iitb	TokenNameIdentifier	 iitb
.	TokenNameDOT	
CRF	TokenNameIdentifier	 CRF
.	TokenNameDOT	
NestedCRF	TokenNameIdentifier	 Nested CRF
(	TokenNameLPAREN	
featureGen	TokenNameIdentifier	 feature Gen
.	TokenNameDOT	
numStates	TokenNameIdentifier	 num States
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
featureGen	TokenNameIdentifier	 feature Gen
,	TokenNameCOMMA	
options	TokenNameIdentifier	 options
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
crfModel	TokenNameIdentifier	 crf Model
=	TokenNameEQUAL	
nestedCrfModel	TokenNameIdentifier	 nested Crf Model
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
CRFSegmentDataIter	TokenNameIdentifier	 CRF Segment Data Iter
(	TokenNameLPAREN	
dataset	TokenNameIdentifier	 dataset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
Segmenter	TokenNameIdentifier	 Segmenter
batchTrain	TokenNameIdentifier	 batch Train
(	TokenNameLPAREN	
SegmentDataset	TokenNameIdentifier	 Segment Dataset
dataset	TokenNameIdentifier	 dataset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
schema	TokenNameIdentifier	 schema
=	TokenNameEQUAL	
dataset	TokenNameIdentifier	 dataset
.	TokenNameDOT	
getSchema	TokenNameIdentifier	 get Schema
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
doTrain	TokenNameIdentifier	 do Train
(	TokenNameLPAREN	
allocModel	TokenNameIdentifier	 alloc Model
(	TokenNameLPAREN	
dataset	TokenNameIdentifier	 dataset
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
printStackTrace	TokenNameIdentifier	 print Stack Trace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalStateException	TokenNameIdentifier	 Illegal State Exception
(	TokenNameLPAREN	
"error in CRF: "	TokenNameStringLiteral	error in CRF: 
+	TokenNamePLUS	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** Return a predicted type for each element of the sequence. */	TokenNameCOMMENT_JAVADOC	 Return a predicted type for each element of the sequence. 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
Segmentation	TokenNameIdentifier	 Segmentation
segmentation	TokenNameIdentifier	 segmentation
(	TokenNameLPAREN	
CandidateSegmentGroup	TokenNameIdentifier	 Candidate Segment Group
g	TokenNameIdentifier	 g
)	TokenNameRPAREN	
{	TokenNameLBRACE	
SegmentDataSequence	TokenNameIdentifier	 Segment Data Sequence
seq	TokenNameIdentifier	 seq
=	TokenNameEQUAL	
new	TokenNamenew	
SegmentDataSequence	TokenNameIdentifier	 Segment Data Sequence
(	TokenNameLPAREN	
g	TokenNameIdentifier	 g
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
nestedCrfModel	TokenNameIdentifier	 nested Crf Model
.	TokenNameDOT	
apply	TokenNameIdentifier	 apply
(	TokenNameLPAREN	
seq	TokenNameIdentifier	 seq
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// featureGen.mapStatesToLabels(seq); 	TokenNameCOMMENT_LINE	featureGen.mapStatesToLabels(seq); 
return	TokenNamereturn	
seq	TokenNameIdentifier	 seq
.	TokenNameDOT	
getSegments	TokenNameIdentifier	 get Segments
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Return some string that 'explains' the classification */	TokenNameCOMMENT_JAVADOC	 Return some string that 'explains' the classification 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
String	TokenNameIdentifier	 String
explain	TokenNameIdentifier	 explain
(	TokenNameLPAREN	
CandidateSegmentGroup	TokenNameIdentifier	 Candidate Segment Group
g	TokenNameIdentifier	 g
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"not supported"	TokenNameStringLiteral	not supported
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
