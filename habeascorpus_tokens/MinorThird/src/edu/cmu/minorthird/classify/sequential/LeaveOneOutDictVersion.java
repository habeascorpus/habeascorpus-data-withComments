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
classify	TokenNameIdentifier	 classify
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
LeaveOneOutDictTransformLearner	TokenNameIdentifier	 Leave One Out Dict Transform Learner
;	TokenNameSEMICOLON	
/** * * @author William Cohen */	TokenNameCOMMENT_JAVADOC	 * @author William Cohen 
public	TokenNamepublic	
class	TokenNameclass	
LeaveOneOutDictVersion	TokenNameIdentifier	 Leave One Out Dict Version
implements	TokenNameimplements	
BatchSegmenterLearner	TokenNameIdentifier	 Batch Segmenter Learner
{	TokenNameLBRACE	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
featurePattern	TokenNameIdentifier	 feature Pattern
;	TokenNameSEMICOLON	
private	TokenNameprivate	
BatchSegmenterLearner	TokenNameIdentifier	 Batch Segmenter Learner
innerLearner	TokenNameIdentifier	 inner Learner
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
distanceNames	TokenNameIdentifier	 distance Names
;	TokenNameSEMICOLON	
public	TokenNamepublic	
LeaveOneOutDictVersion	TokenNameIdentifier	 Leave One Out Dict Version
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
featurePattern	TokenNameIdentifier	 feature Pattern
,	TokenNameCOMMA	
BatchSegmenterLearner	TokenNameIdentifier	 Batch Segmenter Learner
innerLearner	TokenNameIdentifier	 inner Learner
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
distanceNames	TokenNameIdentifier	 distance Names
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
featurePattern	TokenNameIdentifier	 feature Pattern
=	TokenNameEQUAL	
featurePattern	TokenNameIdentifier	 feature Pattern
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
innerLearner	TokenNameIdentifier	 inner Learner
=	TokenNameEQUAL	
innerLearner	TokenNameIdentifier	 inner Learner
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
distanceNames	TokenNameIdentifier	 distance Names
=	TokenNameEQUAL	
distanceNames	TokenNameIdentifier	 distance Names
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
LeaveOneOutDictVersion	TokenNameIdentifier	 Leave One Out Dict Version
(	TokenNameLPAREN	
BatchSegmenterLearner	TokenNameIdentifier	 Batch Segmenter Learner
innerLearner	TokenNameIdentifier	 inner Learner
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
distanceNames	TokenNameIdentifier	 distance Names
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
LeaveOneOutDictTransformLearner	TokenNameIdentifier	 Leave One Out Dict Transform Learner
.	TokenNameDOT	
DEFAULT_PATTERN	TokenNameIdentifier	 DEFAULT  PATTERN
,	TokenNameCOMMA	
innerLearner	TokenNameIdentifier	 inner Learner
,	TokenNameCOMMA	
distanceNames	TokenNameIdentifier	 distance Names
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
LeaveOneOutDictVersion	TokenNameIdentifier	 Leave One Out Dict Version
(	TokenNameLPAREN	
BatchSegmenterLearner	TokenNameIdentifier	 Batch Segmenter Learner
innerLearner	TokenNameIdentifier	 inner Learner
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
LeaveOneOutDictTransformLearner	TokenNameIdentifier	 Leave One Out Dict Transform Learner
.	TokenNameDOT	
DEFAULT_PATTERN	TokenNameIdentifier	 DEFAULT  PATTERN
,	TokenNameCOMMA	
innerLearner	TokenNameIdentifier	 inner Learner
,	TokenNameCOMMA	
"Jaccard"	TokenNameStringLiteral	Jaccard
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
setSchema	TokenNameIdentifier	 set Schema
(	TokenNameLPAREN	
ExampleSchema	TokenNameIdentifier	 Example Schema
schema	TokenNameIdentifier	 schema
)	TokenNameRPAREN	
{	TokenNameLBRACE	
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
LeaveOneOutDictTransformLearner	TokenNameIdentifier	 Leave One Out Dict Transform Learner
transformLearner	TokenNameIdentifier	 transform Learner
=	TokenNameEQUAL	
new	TokenNamenew	
LeaveOneOutDictTransformLearner	TokenNameIdentifier	 Leave One Out Dict Transform Learner
(	TokenNameLPAREN	
featurePattern	TokenNameIdentifier	 feature Pattern
,	TokenNameCOMMA	
distanceNames	TokenNameIdentifier	 distance Names
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
InstanceTransform	TokenNameIdentifier	 Instance Transform
transform	TokenNameIdentifier	 transform
=	TokenNameEQUAL	
transformLearner	TokenNameIdentifier	 transform Learner
.	TokenNameDOT	
batchTrain	TokenNameIdentifier	 batch Train
(	TokenNameLPAREN	
dataset	TokenNameIdentifier	 dataset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
SegmentTransform	TokenNameIdentifier	 Segment Transform
segmentTransform	TokenNameIdentifier	 segment Transform
=	TokenNameEQUAL	
new	TokenNamenew	
SegmentTransform	TokenNameIdentifier	 Segment Transform
(	TokenNameLPAREN	
transform	TokenNameIdentifier	 transform
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
SegmentDataset	TokenNameIdentifier	 Segment Dataset
transformedDataset	TokenNameIdentifier	 transformed Dataset
=	TokenNameEQUAL	
segmentTransform	TokenNameIdentifier	 segment Transform
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
(	TokenNameLPAREN	
dataset	TokenNameIdentifier	 dataset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//new ViewerFrame("transformedDataset", new SmartVanillaViewer(transformedDataset)); 	TokenNameCOMMENT_LINE	new ViewerFrame("transformedDataset", new SmartVanillaViewer(transformedDataset)); 
Segmenter	TokenNameIdentifier	 Segmenter
segmenter	TokenNameIdentifier	 segmenter
=	TokenNameEQUAL	
innerLearner	TokenNameIdentifier	 inner Learner
.	TokenNameDOT	
batchTrain	TokenNameIdentifier	 batch Train
(	TokenNameLPAREN	
transformedDataset	TokenNameIdentifier	 transformed Dataset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
TransformingSegmenter	TokenNameIdentifier	 Transforming Segmenter
(	TokenNameLPAREN	
transform	TokenNameIdentifier	 transform
,	TokenNameCOMMA	
segmenter	TokenNameIdentifier	 segmenter
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
