/* Copyright 2003, Carnegie Mellon, All Rights Reserved */	TokenNameCOMMENT_BLOCK	 Copyright 2003, Carnegie Mellon, All Rights Reserved 
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
/** * Trains a SequenceClassifierLearner using the information in a labeled Dataset. * * @author William Cohen * */	TokenNameCOMMENT_JAVADOC	 Trains a SequenceClassifierLearner using the information in a labeled Dataset. * @author William Cohen 
public	TokenNamepublic	
class	TokenNameclass	
DatasetSequenceClassifierTeacher	TokenNameIdentifier	 Dataset Sequence Classifier Teacher
implements	TokenNameimplements	
SequenceClassifierTeacher	TokenNameIdentifier	 Sequence Classifier Teacher
{	TokenNameLBRACE	
private	TokenNameprivate	
SequenceDataset	TokenNameIdentifier	 Sequence Dataset
dataset	TokenNameIdentifier	 dataset
;	TokenNameSEMICOLON	
public	TokenNamepublic	
DatasetSequenceClassifierTeacher	TokenNameIdentifier	 Dataset Sequence Classifier Teacher
(	TokenNameLPAREN	
SequenceDataset	TokenNameIdentifier	 Sequence Dataset
dataset	TokenNameIdentifier	 dataset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
dataset	TokenNameIdentifier	 dataset
=	TokenNameEQUAL	
dataset	TokenNameIdentifier	 dataset
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Currently, only support batch learners. */	TokenNameCOMMENT_JAVADOC	 Currently, only support batch learners. 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
SequenceClassifier	TokenNameIdentifier	 Sequence Classifier
train	TokenNameIdentifier	 train
(	TokenNameLPAREN	
SequenceClassifierLearner	TokenNameIdentifier	 Sequence Classifier Learner
learner	TokenNameIdentifier	 learner
)	TokenNameRPAREN	
{	TokenNameLBRACE	
BatchSequenceClassifierLearner	TokenNameIdentifier	 Batch Sequence Classifier Learner
batchLearner	TokenNameIdentifier	 batch Learner
=	TokenNameEQUAL	
(	TokenNameLPAREN	
BatchSequenceClassifierLearner	TokenNameIdentifier	 Batch Sequence Classifier Learner
)	TokenNameRPAREN	
learner	TokenNameIdentifier	 learner
;	TokenNameSEMICOLON	
return	TokenNamereturn	
batchLearner	TokenNameIdentifier	 batch Learner
.	TokenNameDOT	
batchTrain	TokenNameIdentifier	 batch Train
(	TokenNameLPAREN	
dataset	TokenNameIdentifier	 dataset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
