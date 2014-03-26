package	TokenNamepackage	
edu	TokenNameIdentifier	 edu
.	TokenNameDOT	
cmu	TokenNameIdentifier	 cmu
.	TokenNameDOT	
minorthird	TokenNameIdentifier	 minorthird
.	TokenNameDOT	
classify	TokenNameIdentifier	 classify
.	TokenNameDOT	
semisupervised	TokenNameIdentifier	 semisupervised
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
/** * Trains a SemiSuperisedClassifierLearner using the information in a labeled Dataset. * * @author Edoardo Airoldi * Date: Jul 19, 2004 */	TokenNameCOMMENT_JAVADOC	 Trains a SemiSuperisedClassifierLearner using the information in a labeled Dataset. * @author Edoardo Airoldi Date: Jul 19, 2004 
public	TokenNamepublic	
class	TokenNameclass	
DatasetSemiSupervisedClassifierTeacher	TokenNameIdentifier	 Dataset Semi Supervised Classifier Teacher
implements	TokenNameimplements	
SemiSupervisedClassifierTeacher	TokenNameIdentifier	 Semi Supervised Classifier Teacher
{	TokenNameLBRACE	
private	TokenNameprivate	
SemiSupervisedDataset	TokenNameIdentifier	 Semi Supervised Dataset
dataset	TokenNameIdentifier	 dataset
;	TokenNameSEMICOLON	
public	TokenNamepublic	
DatasetSemiSupervisedClassifierTeacher	TokenNameIdentifier	 Dataset Semi Supervised Classifier Teacher
(	TokenNameLPAREN	
SemiSupervisedDataset	TokenNameIdentifier	 Semi Supervised Dataset
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
SemiSupervisedClassifier	TokenNameIdentifier	 Semi Supervised Classifier
train	TokenNameIdentifier	 train
(	TokenNameLPAREN	
SemiSupervisedClassifierLearner	TokenNameIdentifier	 Semi Supervised Classifier Learner
learner	TokenNameIdentifier	 learner
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//System.out.println("in SemiSupervisedClassifier.train()"); 	TokenNameCOMMENT_LINE	System.out.println("in SemiSupervisedClassifier.train()"); 
SemiSupervisedBatchClassifierLearner	TokenNameIdentifier	 Semi Supervised Batch Classifier Learner
batchLearner	TokenNameIdentifier	 batch Learner
=	TokenNameEQUAL	
(	TokenNameLPAREN	
SemiSupervisedBatchClassifierLearner	TokenNameIdentifier	 Semi Supervised Batch Classifier Learner
)	TokenNameRPAREN	
learner	TokenNameIdentifier	 learner
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
SemiSupervisedClassifier	TokenNameIdentifier	 Semi Supervised Classifier
)	TokenNameRPAREN	
batchLearner	TokenNameIdentifier	 batch Learner
.	TokenNameDOT	
batchTrain	TokenNameIdentifier	 batch Train
(	TokenNameLPAREN	
dataset	TokenNameIdentifier	 dataset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Instance	TokenNameIdentifier	 Instance
>	TokenNameGREATER	
instancePool	TokenNameIdentifier	 instance Pool
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//System.out.println("in instancePool()"); 	TokenNameCOMMENT_LINE	System.out.println("in instancePool()"); 
// (Edoardo Airoldi) this itearator is empty whenever there are no 	TokenNameCOMMENT_LINE	(Edoardo Airoldi) this itearator is empty whenever there are no 
// unlabeled examples available for semi-supervised learning. 	TokenNameCOMMENT_LINE	unlabeled examples available for semi-supervised learning. 
return	TokenNamereturn	
dataset	TokenNameIdentifier	 dataset
.	TokenNameDOT	
iteratorOverUnlabeled	TokenNameIdentifier	 iterator Over Unlabeled
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
