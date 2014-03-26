package	TokenNamepackage	
edu	TokenNameIdentifier	 edu
.	TokenNameDOT	
cmu	TokenNameIdentifier	 cmu
.	TokenNameDOT	
minorthird	TokenNameIdentifier	 minorthird
.	TokenNameDOT	
classify	TokenNameIdentifier	 classify
;	TokenNameSEMICOLON	
/** * Batch version of an OnlineBinaryClassifierLearner * * @author William Cohen */	TokenNameCOMMENT_JAVADOC	 Batch version of an OnlineBinaryClassifierLearner * @author William Cohen 
public	TokenNamepublic	
class	TokenNameclass	
BinaryBatchVersion	TokenNameIdentifier	 Binary Batch Version
extends	TokenNameextends	
BatchVersion	TokenNameIdentifier	 Batch Version
implements	TokenNameimplements	
BinaryClassifierLearner	TokenNameIdentifier	 Binary Classifier Learner
{	TokenNameLBRACE	
public	TokenNamepublic	
BinaryBatchVersion	TokenNameIdentifier	 Binary Batch Version
(	TokenNameLPAREN	
OnlineBinaryClassifierLearner	TokenNameIdentifier	 Online Binary Classifier Learner
innerLearner	TokenNameIdentifier	 inner Learner
,	TokenNameCOMMA	
int	TokenNameint	
numberOfEpochs	TokenNameIdentifier	 number Of Epochs
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
innerLearner	TokenNameIdentifier	 inner Learner
,	TokenNameCOMMA	
numberOfEpochs	TokenNameIdentifier	 number Of Epochs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
BinaryBatchVersion	TokenNameIdentifier	 Binary Batch Version
(	TokenNameLPAREN	
OnlineBinaryClassifierLearner	TokenNameIdentifier	 Online Binary Classifier Learner
innerLearner	TokenNameIdentifier	 inner Learner
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
innerLearner	TokenNameIdentifier	 inner Learner
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
final	TokenNamefinal	
public	TokenNamepublic	
BinaryClassifier	TokenNameIdentifier	 Binary Classifier
getBinaryClassifier	TokenNameIdentifier	 get Binary Classifier
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
BinaryClassifier	TokenNameIdentifier	 Binary Classifier
)	TokenNameRPAREN	
getClassifier	TokenNameIdentifier	 get Classifier
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
