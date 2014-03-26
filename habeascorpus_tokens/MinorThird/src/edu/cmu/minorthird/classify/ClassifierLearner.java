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
/** * Learn an Classifier. This describes the learner's side of the * protocol used to communicate between "learners" and "teachers". * * @author William Cohen */	TokenNameCOMMENT_JAVADOC	 Learn an Classifier. This describes the learner's side of the protocol used to communicate between "learners" and "teachers". * @author William Cohen 
public	TokenNamepublic	
interface	TokenNameinterface	
ClassifierLearner	TokenNameIdentifier	 Classifier Learner
extends	TokenNameextends	
Cloneable	TokenNameIdentifier	 Cloneable
{	TokenNameLBRACE	
/** * Accept an ExampleSchema - constraints on what the * Examples will be. */	TokenNameCOMMENT_JAVADOC	 Accept an ExampleSchema - constraints on what the Examples will be. 
public	TokenNamepublic	
void	TokenNamevoid	
setSchema	TokenNameIdentifier	 set Schema
(	TokenNameLPAREN	
ExampleSchema	TokenNameIdentifier	 Example Schema
schema	TokenNameIdentifier	 schema
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns the ExampleSchema - constraints on what the * Examples will be. */	TokenNameCOMMENT_JAVADOC	 Returns the ExampleSchema - constraints on what the Examples will be. 
public	TokenNamepublic	
ExampleSchema	TokenNameIdentifier	 Example Schema
getSchema	TokenNameIdentifier	 get Schema
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Forget everything and prepare for a new learning session. */	TokenNameCOMMENT_JAVADOC	 Forget everything and prepare for a new learning session. 
public	TokenNamepublic	
void	TokenNamevoid	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Make a copy of the learner. * Note: This will reset the learner, erasing previous data! */	TokenNameCOMMENT_JAVADOC	 Make a copy of the learner. Note: This will reset the learner, erasing previous data! 
public	TokenNamepublic	
ClassifierLearner	TokenNameIdentifier	 Classifier Learner
copy	TokenNameIdentifier	 copy
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Accept a set of unlabeled instances. These might be used in * formulating queries in active learning, or for semi-supervised * learning. Queries are made with the methods hasNextQuery(), * nextQuery(), and setAnswer(). * <p> * Learners need not make use of the instance pool. */	TokenNameCOMMENT_JAVADOC	 Accept a set of unlabeled instances. These might be used in formulating queries in active learning, or for semi-supervised learning. Queries are made with the methods hasNextQuery(), nextQuery(), and setAnswer(). <p> Learners need not make use of the instance pool. 
public	TokenNamepublic	
void	TokenNamevoid	
setInstancePool	TokenNameIdentifier	 set Instance Pool
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Instance	TokenNameIdentifier	 Instance
>	TokenNameGREATER	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns true if the learner has more queries to answer. * <p> * Learners may always return 'false', if they are not active. */	TokenNameCOMMENT_JAVADOC	 Returns true if the learner has more queries to answer. <p> Learners may always return 'false', if they are not active. 
public	TokenNamepublic	
boolean	TokenNameboolean	
hasNextQuery	TokenNameIdentifier	 has Next Query
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns an Instance for which the learner would like a label. * <p> * This will only be called if hasNextQuery() returns true. */	TokenNameCOMMENT_JAVADOC	 Returns an Instance for which the learner would like a label. <p> This will only be called if hasNextQuery() returns true. 
public	TokenNamepublic	
Instance	TokenNameIdentifier	 Instance
nextQuery	TokenNameIdentifier	 next Query
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Accept a labeled example. The example might be the answer to the last query, * or it may be an example chosen by the teacher. * <p> * All learners must provide a non-trivial implementation of addExample. */	TokenNameCOMMENT_JAVADOC	 Accept a labeled example. The example might be the answer to the last query, or it may be an example chosen by the teacher. <p> All learners must provide a non-trivial implementation of addExample. 
public	TokenNamepublic	
void	TokenNamevoid	
addExample	TokenNameIdentifier	 add Example
(	TokenNameLPAREN	
Example	TokenNameIdentifier	 Example
answeredQuery	TokenNameIdentifier	 answered Query
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Accept a signal that no more training data is available. This * would trigger any additional computation that might be useful * to speed up or improve the results of getClassifier(). */	TokenNameCOMMENT_JAVADOC	 Accept a signal that no more training data is available. This would trigger any additional computation that might be useful to speed up or improve the results of getClassifier(). 
public	TokenNamepublic	
void	TokenNamevoid	
completeTraining	TokenNameIdentifier	 complete Training
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Return the learned classifier. The classifier should take advantage of * all information sent by the teacher to date. Teachers can assume that * multiple calls to getClassifier() without intervening calls to addExample() * will return the same object, and do little computation. Teachers can * not assume that this object is immutable: for instance, in the case of * an on-line learning method, the classifier that is returned might * change after more examples are learned. * <p> * All learners must implement this method. */	TokenNameCOMMENT_JAVADOC	 Return the learned classifier. The classifier should take advantage of all information sent by the teacher to date. Teachers can assume that multiple calls to getClassifier() without intervening calls to addExample() will return the same object, and do little computation. Teachers can not assume that this object is immutable: for instance, in the case of an on-line learning method, the classifier that is returned might change after more examples are learned. <p> All learners must implement this method. 
public	TokenNamepublic	
Classifier	TokenNameIdentifier	 Classifier
getClassifier	TokenNameIdentifier	 get Classifier
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
