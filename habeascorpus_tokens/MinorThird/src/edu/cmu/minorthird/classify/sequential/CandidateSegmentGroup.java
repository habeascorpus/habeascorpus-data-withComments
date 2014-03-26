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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
*	TokenNameMULTIPLY	
;	TokenNameSEMICOLON	
/** * A group of sliding windows associated with a sequence. * * <p>In more detail: just as a SequenceDataset holds a set of * Example[] objects, a SegmentDataset holds a set of * CandidateSegmentGroup objects. Each CandidateSegmentGroup is * derived from a sequence of source objects s1....sN. The * CandidateSegmentGroup holds an instance for each subsequence of up * to K adjacent source objects (the subsequence is called a * <i>segment</i>, or a <i>sliding window</i>). Here K is the "maxWindowSize", and N * is the "sequenceLength". * *<p>To illustrate, suppose the original sequence is a,b,c,d,e and K=3. * Then the sliding window will hold instances created from these * subsequences: a,b,c,d,e,ab,bc,cd,de,abc,bcd,cde. * * @author William Cohen */	TokenNameCOMMENT_JAVADOC	 A group of sliding windows associated with a sequence. * <p>In more detail: just as a SequenceDataset holds a set of Example[] objects, a SegmentDataset holds a set of CandidateSegmentGroup objects. Each CandidateSegmentGroup is derived from a sequence of source objects s1....sN. The CandidateSegmentGroup holds an instance for each subsequence of up to K adjacent source objects (the subsequence is called a <i>segment</i>, or a <i>sliding window</i>). Here K is the "maxWindowSize", and N is the "sequenceLength". *<p>To illustrate, suppose the original sequence is a,b,c,d,e and K=3. Then the sliding window will hold instances created from these subsequences: a,b,c,d,e,ab,bc,cd,de,abc,bcd,cde. * @author William Cohen 
public	TokenNamepublic	
interface	TokenNameinterface	
CandidateSegmentGroup	TokenNameIdentifier	 Candidate Segment Group
extends	TokenNameextends	
HasSubpopulationId	TokenNameIdentifier	 Has Subpopulation Id
{	TokenNameLBRACE	
/** Return the length of the original sequence that the segments * were derived from. */	TokenNameCOMMENT_JAVADOC	 Return the length of the original sequence that the segments were derived from. 
public	TokenNamepublic	
int	TokenNameint	
getSequenceLength	TokenNameIdentifier	 get Sequence Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Return the maximum segment length. */	TokenNameCOMMENT_JAVADOC	 Return the maximum segment length. 
public	TokenNamepublic	
int	TokenNameint	
getMaxWindowSize	TokenNameIdentifier	 get Max Window Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Number of instances stored. */	TokenNameCOMMENT_JAVADOC	 Number of instances stored. 
public	TokenNamepublic	
int	TokenNameint	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Return the example corresponding to the segment from positions start..end */	TokenNameCOMMENT_JAVADOC	 Return the example corresponding to the segment from positions start..end 
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
;	TokenNameSEMICOLON	
/** Return the class label associated with getSubsequenceExample(start,end). */	TokenNameCOMMENT_JAVADOC	 Return the class label associated with getSubsequenceExample(start,end). 
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
;	TokenNameSEMICOLON	
/** Return the instance corresponding to the segment from positions start...end. */	TokenNameCOMMENT_JAVADOC	 Return the instance corresponding to the segment from positions start...end. 
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
;	TokenNameSEMICOLON	
/** Return the set of strings associated with ClassLabels on any of the stored segments. */	TokenNameCOMMENT_JAVADOC	 Return the set of strings associated with ClassLabels on any of the stored segments. 
public	TokenNamepublic	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
classNameSet	TokenNameIdentifier	 class Name Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Return the subpopulationId for the original sequence. */	TokenNameCOMMENT_JAVADOC	 Return the subpopulationId for the original sequence. 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getSubpopulationId	TokenNameIdentifier	 get Subpopulation Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
