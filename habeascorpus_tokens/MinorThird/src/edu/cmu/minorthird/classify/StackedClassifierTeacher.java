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
edu	TokenNameIdentifier	 edu
.	TokenNameDOT	
cmu	TokenNameIdentifier	 cmu
.	TokenNameDOT	
minorthird	TokenNameIdentifier	 minorthird
.	TokenNameDOT	
classify	TokenNameIdentifier	 classify
.	TokenNameDOT	
relational	TokenNameIdentifier	 relational
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
/** * Implements the teacher's side of the learner-teacher protocol for SGM. * * @author Zhenzhen Kou * */	TokenNameCOMMENT_JAVADOC	 Implements the teacher's side of the learner-teacher protocol for SGM. * @author Zhenzhen Kou 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
StackedClassifierTeacher	TokenNameIdentifier	 Stacked Classifier Teacher
extends	TokenNameextends	
ClassifierTeacher	TokenNameIdentifier	 Classifier Teacher
{	TokenNameLBRACE	
/** Train a StackedGraphicalLearner and return the learned Classifier, using * some unspecified source of information to get labels. */	TokenNameCOMMENT_JAVADOC	 Train a StackedGraphicalLearner and return the learned Classifier, using some unspecified source of information to get labels. 
final	TokenNamefinal	
public	TokenNamepublic	
Classifier	TokenNameIdentifier	 Classifier
trainStacked	TokenNameIdentifier	 train Stacked
(	TokenNameLPAREN	
StackedBatchClassifierLearner	TokenNameIdentifier	 Stacked Batch Classifier Learner
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
// I am commenting out the two lines below because they don't do anything - frank 	TokenNameCOMMENT_LINE	I am commenting out the two lines below because they don't do anything - frank 
// learner.RelDataset.setAggregators(this.getAggregators()); 	TokenNameCOMMENT_LINE	learner.RelDataset.setAggregators(this.getAggregators()); 
// learner.RelDataset.setLinksMap(this.getLinksMap()); 	TokenNameCOMMENT_LINE	learner.RelDataset.setLinksMap(this.getLinksMap()); 
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
/** The linkMaps for stacked graphical learning */	TokenNameCOMMENT_JAVADOC	 The linkMaps for stacked graphical learning 
abstract	TokenNameabstract	
protected	TokenNameprotected	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
getLinksMap	TokenNameIdentifier	 get Links Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** The Aggregators for stacked graphical learning */	TokenNameCOMMENT_JAVADOC	 The Aggregators for stacked graphical learning 
abstract	TokenNameabstract	
protected	TokenNameprotected	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>>	TokenNameRIGHT_SHIFT	
getAggregators	TokenNameIdentifier	 get Aggregators
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
