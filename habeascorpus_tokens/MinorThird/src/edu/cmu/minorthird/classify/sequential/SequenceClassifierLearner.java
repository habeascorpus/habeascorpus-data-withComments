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
/** * Interface for something that learns sequence classifiers. * * @author William Cohen */	TokenNameCOMMENT_JAVADOC	 Interface for something that learns sequence classifiers. * @author William Cohen 
public	TokenNamepublic	
interface	TokenNameinterface	
SequenceClassifierLearner	TokenNameIdentifier	 Sequence Classifier Learner
{	TokenNameLBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setSchema	TokenNameIdentifier	 set Schema
(	TokenNameLPAREN	
ExampleSchema	TokenNameIdentifier	 Example Schema
schema	TokenNameIdentifier	 schema
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Return the number of previous predictions used as features in * learning. */	TokenNameCOMMENT_JAVADOC	 Return the number of previous predictions used as features in learning. 
public	TokenNamepublic	
int	TokenNameint	
getHistorySize	TokenNameIdentifier	 get History Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
