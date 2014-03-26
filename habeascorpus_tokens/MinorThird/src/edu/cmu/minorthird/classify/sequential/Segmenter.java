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
/** * @author William Cohen */	TokenNameCOMMENT_JAVADOC	 @author William Cohen 
public	TokenNamepublic	
interface	TokenNameinterface	
Segmenter	TokenNameIdentifier	 Segmenter
{	TokenNameLBRACE	
/** Return a predicted type for each element of the sequence. */	TokenNameCOMMENT_JAVADOC	 Return a predicted type for each element of the sequence. 
public	TokenNamepublic	
Segmentation	TokenNameIdentifier	 Segmentation
segmentation	TokenNameIdentifier	 segmentation
(	TokenNameLPAREN	
CandidateSegmentGroup	TokenNameIdentifier	 Candidate Segment Group
group	TokenNameIdentifier	 group
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Return some string that 'explains' the classification */	TokenNameCOMMENT_JAVADOC	 Return some string that 'explains' the classification 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
explain	TokenNameIdentifier	 explain
(	TokenNameLPAREN	
CandidateSegmentGroup	TokenNameIdentifier	 Candidate Segment Group
group	TokenNameIdentifier	 group
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
