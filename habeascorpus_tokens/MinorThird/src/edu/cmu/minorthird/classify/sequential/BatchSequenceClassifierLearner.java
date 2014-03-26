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
/** * A SequenceClassifierLearner that trains itself in batch mode. * * @author William Cohen */	TokenNameCOMMENT_JAVADOC	 A SequenceClassifierLearner that trains itself in batch mode. * @author William Cohen 
public	TokenNamepublic	
interface	TokenNameinterface	
BatchSequenceClassifierLearner	TokenNameIdentifier	 Batch Sequence Classifier Learner
extends	TokenNameextends	
SequenceClassifierLearner	TokenNameIdentifier	 Sequence Classifier Learner
{	TokenNameLBRACE	
public	TokenNamepublic	
SequenceClassifier	TokenNameIdentifier	 Sequence Classifier
batchTrain	TokenNameIdentifier	 batch Train
(	TokenNameLPAREN	
SequenceDataset	TokenNameIdentifier	 Sequence Dataset
dataset	TokenNameIdentifier	 dataset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
