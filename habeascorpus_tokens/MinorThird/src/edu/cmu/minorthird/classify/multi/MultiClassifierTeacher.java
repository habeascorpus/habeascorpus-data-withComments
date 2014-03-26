package	TokenNamepackage	
edu	TokenNameIdentifier	 edu
.	TokenNameDOT	
cmu	TokenNameIdentifier	 cmu
.	TokenNameDOT	
minorthird	TokenNameIdentifier	 minorthird
.	TokenNameDOT	
classify	TokenNameIdentifier	 classify
.	TokenNameDOT	
multi	TokenNameIdentifier	 multi
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
ClassifierLearner	TokenNameIdentifier	 Classifier Learner
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
/** * Interface for something that trains multi label classifiers. * * @author Cameron Williams */	TokenNameCOMMENT_JAVADOC	 Interface for something that trains multi label classifiers. * @author Cameron Williams 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
MultiClassifierTeacher	TokenNameIdentifier	 Multi Classifier Teacher
{	TokenNameLBRACE	
/** Train a ClassifierLearner and return the learned Classifier, using * some unspecified source of information to get labels. */	TokenNameCOMMENT_JAVADOC	 Train a ClassifierLearner and return the learned Classifier, using some unspecified source of information to get labels. 
final	TokenNamefinal	
public	TokenNamepublic	
MultiClassifier	TokenNameIdentifier	 Multi Classifier
train	TokenNameIdentifier	 train
(	TokenNameLPAREN	
ClassifierLearner	TokenNameIdentifier	 Classifier Learner
learner	TokenNameIdentifier	 learner
)	TokenNameRPAREN	
{	TokenNameLBRACE	
MultiLearner	TokenNameIdentifier	 Multi Learner
multiLearner	TokenNameIdentifier	 multi Learner
=	TokenNameEQUAL	
new	TokenNamenew	
MultiLearner	TokenNameIdentifier	 Multi Learner
(	TokenNameLPAREN	
learner	TokenNameIdentifier	 learner
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// initialize the multiLearner for a new problem 	TokenNameCOMMENT_LINE	initialize the multiLearner for a new problem 
multiLearner	TokenNameIdentifier	 multi Learner
.	TokenNameDOT	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// tell multiLearner the schema of examples 	TokenNameCOMMENT_LINE	tell multiLearner the schema of examples 
multiLearner	TokenNameIdentifier	 multi Learner
.	TokenNameDOT	
setMultiSchema	TokenNameIdentifier	 set Multi Schema
(	TokenNameLPAREN	
schema	TokenNameIdentifier	 schema
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// provide unlabeled examples to the multiLearner, for unsupervised 	TokenNameCOMMENT_LINE	provide unlabeled examples to the multiLearner, for unsupervised 
// training, semi-supervised training, or active multiLearner 	TokenNameCOMMENT_LINE	training, semi-supervised training, or active multiLearner 
multiLearner	TokenNameIdentifier	 multi Learner
.	TokenNameDOT	
setInstancePool	TokenNameIdentifier	 set Instance Pool
(	TokenNameLPAREN	
instancePool	TokenNameIdentifier	 instance Pool
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// passive learning from already-available labeled data 	TokenNameCOMMENT_LINE	passive learning from already-available labeled data 
for	TokenNamefor	
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
MultiExample	TokenNameIdentifier	 Multi Example
>	TokenNameGREATER	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
examplePool	TokenNameIdentifier	 example Pool
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
multiLearner	TokenNameIdentifier	 multi Learner
.	TokenNameDOT	
addMultiExample	TokenNameIdentifier	 add Multi Example
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// active learning 	TokenNameCOMMENT_LINE	active learning 
while	TokenNamewhile	
(	TokenNameLPAREN	
multiLearner	TokenNameIdentifier	 multi Learner
.	TokenNameDOT	
hasNextQuery	TokenNameIdentifier	 has Next Query
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
hasAnswers	TokenNameIdentifier	 has Answers
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Instance	TokenNameIdentifier	 Instance
query	TokenNameIdentifier	 query
=	TokenNameEQUAL	
multiLearner	TokenNameIdentifier	 multi Learner
.	TokenNameDOT	
nextQuery	TokenNameIdentifier	 next Query
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
MultiExample	TokenNameIdentifier	 Multi Example
answeredQuery	TokenNameIdentifier	 answered Query
=	TokenNameEQUAL	
labelInstance	TokenNameIdentifier	 label Instance
(	TokenNameLPAREN	
query	TokenNameIdentifier	 query
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
answeredQuery	TokenNameIdentifier	 answered Query
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
multiLearner	TokenNameIdentifier	 multi Learner
.	TokenNameDOT	
addMultiExample	TokenNameIdentifier	 add Multi Example
(	TokenNameLPAREN	
answeredQuery	TokenNameIdentifier	 answered Query
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// signal that there's no more data available 	TokenNameCOMMENT_LINE	signal that there's no more data available 
multiLearner	TokenNameIdentifier	 multi Learner
.	TokenNameDOT	
completeTraining	TokenNameIdentifier	 complete Training
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// final result 	TokenNameCOMMENT_LINE	final result 
return	TokenNamereturn	
multiLearner	TokenNameIdentifier	 multi Learner
.	TokenNameDOT	
getMultiClassifier	TokenNameIdentifier	 get Multi Classifier
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// 	TokenNameCOMMENT_LINE	 
// subclasses implement these steps 	TokenNameCOMMENT_LINE	subclasses implement these steps 
// 	TokenNameCOMMENT_LINE	 
/** The set of classes that will be used. */	TokenNameCOMMENT_JAVADOC	 The set of classes that will be used. 
abstract	TokenNameabstract	
protected	TokenNameprotected	
MultiExampleSchema	TokenNameIdentifier	 Multi Example Schema
schema	TokenNameIdentifier	 schema
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Labeled instances that will be sent to the multiLearner * via a call to addExample(). */	TokenNameCOMMENT_JAVADOC	 Labeled instances that will be sent to the multiLearner via a call to addExample(). 
abstract	TokenNameabstract	
protected	TokenNameprotected	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
MultiExample	TokenNameIdentifier	 Multi Example
>	TokenNameGREATER	
examplePool	TokenNameIdentifier	 example Pool
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Unlabeled instances, which will be provided to the multiLearner via * setInstancePool(). These can be used for semi-supervised * multiLearner, or to form queries for active learning. . */	TokenNameCOMMENT_JAVADOC	 Unlabeled instances, which will be provided to the multiLearner via setInstancePool(). These can be used for semi-supervised multiLearner, or to form queries for active learning. . 
abstract	TokenNameabstract	
protected	TokenNameprotected	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Instance	TokenNameIdentifier	 Instance
>	TokenNameGREATER	
instancePool	TokenNameIdentifier	 instance Pool
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Label an Instance chosen by the multiLearner. Return null if the * query can't be answered, otherwise return a labeled version of * the instance (an Example). */	TokenNameCOMMENT_JAVADOC	 Label an Instance chosen by the multiLearner. Return null if the query can't be answered, otherwise return a labeled version of the instance (an Example). 
abstract	TokenNameabstract	
protected	TokenNameprotected	
MultiExample	TokenNameIdentifier	 Multi Example
labelInstance	TokenNameIdentifier	 label Instance
(	TokenNameLPAREN	
Instance	TokenNameIdentifier	 Instance
query	TokenNameIdentifier	 query
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Return true if this teacher can answer more queries. */	TokenNameCOMMENT_JAVADOC	 Return true if this teacher can answer more queries. 
abstract	TokenNameabstract	
protected	TokenNameprotected	
boolean	TokenNameboolean	
hasAnswers	TokenNameIdentifier	 has Answers
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
