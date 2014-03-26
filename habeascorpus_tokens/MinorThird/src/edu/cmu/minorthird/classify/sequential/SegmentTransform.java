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
Instance	TokenNameIdentifier	 Instance
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
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
InstanceTransform	TokenNameIdentifier	 Instance Transform
;	TokenNameSEMICOLON	
import	TokenNameimport	
edu	TokenNameIdentifier	 edu
.	TokenNameDOT	
cmu	TokenNameIdentifier	 cmu
.	TokenNameDOT	
minorthird	TokenNameIdentifier	 minorthird
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
ProgressCounter	TokenNameIdentifier	 Progress Counter
;	TokenNameSEMICOLON	
/*package*/	TokenNameCOMMENT_BLOCK	package
class	TokenNameclass	
SegmentTransform	TokenNameIdentifier	 Segment Transform
{	TokenNameLBRACE	
private	TokenNameprivate	
InstanceTransform	TokenNameIdentifier	 Instance Transform
innerTransform	TokenNameIdentifier	 inner Transform
;	TokenNameSEMICOLON	
public	TokenNamepublic	
SegmentTransform	TokenNameIdentifier	 Segment Transform
(	TokenNameLPAREN	
InstanceTransform	TokenNameIdentifier	 Instance Transform
innerTransform	TokenNameIdentifier	 inner Transform
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
innerTransform	TokenNameIdentifier	 inner Transform
=	TokenNameEQUAL	
innerTransform	TokenNameIdentifier	 inner Transform
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
SegmentDataset	TokenNameIdentifier	 Segment Dataset
transform	TokenNameIdentifier	 transform
(	TokenNameLPAREN	
SegmentDataset	TokenNameIdentifier	 Segment Dataset
dataset	TokenNameIdentifier	 dataset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ProgressCounter	TokenNameIdentifier	 Progress Counter
pc	TokenNameIdentifier	 pc
=	TokenNameEQUAL	
new	TokenNamenew	
ProgressCounter	TokenNameIdentifier	 Progress Counter
(	TokenNameLPAREN	
"adding dictionary distances"	TokenNameStringLiteral	adding dictionary distances
,	TokenNameCOMMA	
"segment group"	TokenNameStringLiteral	segment group
,	TokenNameCOMMA	
dataset	TokenNameIdentifier	 dataset
.	TokenNameDOT	
getNumberOfSegmentGroups	TokenNameIdentifier	 get Number Of Segment Groups
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
SegmentDataset	TokenNameIdentifier	 Segment Dataset
transformed	TokenNameIdentifier	 transformed
=	TokenNameEQUAL	
new	TokenNamenew	
SegmentDataset	TokenNameIdentifier	 Segment Dataset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
CandidateSegmentGroup	TokenNameIdentifier	 Candidate Segment Group
>	TokenNameGREATER	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
dataset	TokenNameIdentifier	 dataset
.	TokenNameDOT	
candidateSegmentGroupIterator	TokenNameIdentifier	 candidate Segment Group Iterator
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
transformed	TokenNameIdentifier	 transformed
.	TokenNameDOT	
addCandidateSegmentGroup	TokenNameIdentifier	 add Candidate Segment Group
(	TokenNameLPAREN	
transform	TokenNameIdentifier	 transform
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pc	TokenNameIdentifier	 pc
.	TokenNameDOT	
progress	TokenNameIdentifier	 progress
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
pc	TokenNameIdentifier	 pc
.	TokenNameDOT	
finished	TokenNameIdentifier	 finished
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
transformed	TokenNameIdentifier	 transformed
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
CandidateSegmentGroup	TokenNameIdentifier	 Candidate Segment Group
transform	TokenNameIdentifier	 transform
(	TokenNameLPAREN	
CandidateSegmentGroup	TokenNameIdentifier	 Candidate Segment Group
g	TokenNameIdentifier	 g
)	TokenNameRPAREN	
{	TokenNameLBRACE	
MutableCandidateSegmentGroup	TokenNameIdentifier	 Mutable Candidate Segment Group
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
new	TokenNamenew	
MutableCandidateSegmentGroup	TokenNameIdentifier	 Mutable Candidate Segment Group
(	TokenNameLPAREN	
g	TokenNameIdentifier	 g
.	TokenNameDOT	
getMaxWindowSize	TokenNameIdentifier	 get Max Window Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
g	TokenNameIdentifier	 g
.	TokenNameDOT	
getSequenceLength	TokenNameIdentifier	 get Sequence Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
lo	TokenNameIdentifier	 lo
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
lo	TokenNameIdentifier	 lo
<	TokenNameLESS	
g	TokenNameIdentifier	 g
.	TokenNameDOT	
getSequenceLength	TokenNameIdentifier	 get Sequence Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lo	TokenNameIdentifier	 lo
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
len	TokenNameIdentifier	 len
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
len	TokenNameIdentifier	 len
<=	TokenNameLESS_EQUAL	
g	TokenNameIdentifier	 g
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
gInstance	TokenNameIdentifier	 g Instance
=	TokenNameEQUAL	
g	TokenNameIdentifier	 g
.	TokenNameDOT	
getSubsequenceInstance	TokenNameIdentifier	 get Subsequence Instance
(	TokenNameLPAREN	
lo	TokenNameIdentifier	 lo
,	TokenNameCOMMA	
lo	TokenNameIdentifier	 lo
+	TokenNamePLUS	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
gInstance	TokenNameIdentifier	 g Instance
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Instance	TokenNameIdentifier	 Instance
tInstance	TokenNameIdentifier	 t Instance
=	TokenNameEQUAL	
innerTransform	TokenNameIdentifier	 inner Transform
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
(	TokenNameLPAREN	
gInstance	TokenNameIdentifier	 g Instance
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//Feature f = new Feature("distToSome POS"); 	TokenNameCOMMENT_LINE	Feature f = new Feature("distToSome POS"); 
//if (tInstance.getWeight(f)!=0) System.out.println("useful instance: "+tInstance); 	TokenNameCOMMENT_LINE	if (tInstance.getWeight(f)!=0) System.out.println("useful instance: "+tInstance); 
result	TokenNameIdentifier	 result
.	TokenNameDOT	
setSubsequence	TokenNameIdentifier	 set Subsequence
(	TokenNameLPAREN	
lo	TokenNameIdentifier	 lo
,	TokenNameCOMMA	
lo	TokenNameIdentifier	 lo
+	TokenNamePLUS	
len	TokenNameIdentifier	 len
,	TokenNameCOMMA	
tInstance	TokenNameIdentifier	 t Instance
,	TokenNameCOMMA	
g	TokenNameIdentifier	 g
.	TokenNameDOT	
getSubsequenceLabel	TokenNameIdentifier	 get Subsequence Label
(	TokenNameLPAREN	
lo	TokenNameIdentifier	 lo
,	TokenNameCOMMA	
lo	TokenNameIdentifier	 lo
+	TokenNamePLUS	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
