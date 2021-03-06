package	TokenNamepackage	
edu	TokenNameIdentifier	 edu
.	TokenNameDOT	
cmu	TokenNameIdentifier	 cmu
.	TokenNameDOT	
minorthird	TokenNameIdentifier	 minorthird
.	TokenNameDOT	
classify	TokenNameIdentifier	 classify
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Iterator	TokenNameIdentifier	 Iterator
;	TokenNameSEMICOLON	
/** * Implements the teacher's side of the learner-teacher protocol. * * @author William Cohen * */	TokenNameCOMMENT_JAVADOC	 Implements the teacher's side of the learner-teacher protocol. * @author William Cohen 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
ClassifierTeacher	TokenNameIdentifier	 Classifier Teacher
{	TokenNameLBRACE	
/** Train a ClassifierLearner and return the learned Classifier, using * some unspecified source of information to get labels. */	TokenNameCOMMENT_JAVADOC	 Train a ClassifierLearner and return the learned Classifier, using some unspecified source of information to get labels. 
final	TokenNamefinal	
public	TokenNamepublic	
Classifier	TokenNameIdentifier	 Classifier
train	TokenNameIdentifier	 train
(	TokenNameLPAREN	
ClassifierLearner	TokenNameIdentifier	 Classifier Learner
learner	TokenNameIdentifier	 learner
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// initialize the learner for a new problem 	TokenNameCOMMENT_LINE	initialize the learner for a new problem 
learner	TokenNameIdentifier	 learner
.	TokenNameDOT	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// tell learner the schema of examples 	TokenNameCOMMENT_LINE	tell learner the schema of examples 
learner	TokenNameIdentifier	 learner
.	TokenNameDOT	
setSchema	TokenNameIdentifier	 set Schema
(	TokenNameLPAREN	
schema	TokenNameIdentifier	 schema
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// provide unlabeled examples to the learner, for unsupervised 	TokenNameCOMMENT_LINE	provide unlabeled examples to the learner, for unsupervised 
// training, semi-supervised training, or active learner 	TokenNameCOMMENT_LINE	training, semi-supervised training, or active learner 
learner	TokenNameIdentifier	 learner
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
Example	TokenNameIdentifier	 Example
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
learner	TokenNameIdentifier	 learner
.	TokenNameDOT	
addExample	TokenNameIdentifier	 add Example
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
learner	TokenNameIdentifier	 learner
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
learner	TokenNameIdentifier	 learner
.	TokenNameDOT	
nextQuery	TokenNameIdentifier	 next Query
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Example	TokenNameIdentifier	 Example
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
learner	TokenNameIdentifier	 learner
.	TokenNameDOT	
addExample	TokenNameIdentifier	 add Example
(	TokenNameLPAREN	
answeredQuery	TokenNameIdentifier	 answered Query
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// signal that there's no more data available 	TokenNameCOMMENT_LINE	signal that there's no more data available 
learner	TokenNameIdentifier	 learner
.	TokenNameDOT	
completeTraining	TokenNameIdentifier	 complete Training
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// final result 	TokenNameCOMMENT_LINE	final result 
return	TokenNamereturn	
learner	TokenNameIdentifier	 learner
.	TokenNameDOT	
getClassifier	TokenNameIdentifier	 get Classifier
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
ExampleSchema	TokenNameIdentifier	 Example Schema
schema	TokenNameIdentifier	 schema
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Labeled instances that will be sent to the learner * via a call to addExample(). */	TokenNameCOMMENT_JAVADOC	 Labeled instances that will be sent to the learner via a call to addExample(). 
abstract	TokenNameabstract	
protected	TokenNameprotected	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Example	TokenNameIdentifier	 Example
>	TokenNameGREATER	
examplePool	TokenNameIdentifier	 example Pool
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Unlabeled instances, which will be provided to the learner via * setInstancePool(). These can be used for semi-supervised * learner, or to form queries for active learning. . */	TokenNameCOMMENT_JAVADOC	 Unlabeled instances, which will be provided to the learner via setInstancePool(). These can be used for semi-supervised learner, or to form queries for active learning. . 
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
/** Label an Instance chosen by the learner. Return null if the * query can't be answered, otherwise return a labeled version of * the instance (an Example). */	TokenNameCOMMENT_JAVADOC	 Label an Instance chosen by the learner. Return null if the query can't be answered, otherwise return a labeled version of the instance (an Example). 
abstract	TokenNameabstract	
protected	TokenNameprotected	
Example	TokenNameIdentifier	 Example
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
