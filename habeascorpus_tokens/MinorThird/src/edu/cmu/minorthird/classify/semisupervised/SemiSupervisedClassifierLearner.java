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
/** * Interface for something that learns sequence classifiers. * * @author Edoardo Airoldi * Date: Jul 19, 2004 */	TokenNameCOMMENT_JAVADOC	 Interface for something that learns sequence classifiers. * @author Edoardo Airoldi Date: Jul 19, 2004 
public	TokenNamepublic	
interface	TokenNameinterface	
SemiSupervisedClassifierLearner	TokenNameIdentifier	 Semi Supervised Classifier Learner
{	TokenNameLBRACE	
//public SemiSupervisedClassifier batchTrain(SemiSupervisedDataset dataset); 	TokenNameCOMMENT_LINE	public SemiSupervisedClassifier batchTrain(SemiSupervisedDataset dataset); 
public	TokenNamepublic	
void	TokenNamevoid	
setSchema	TokenNameIdentifier	 set Schema
(	TokenNameLPAREN	
ExampleSchema	TokenNameIdentifier	 Example Schema
schema	TokenNameIdentifier	 schema
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
