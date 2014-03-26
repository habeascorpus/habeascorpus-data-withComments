package	TokenNamepackage	
edu	TokenNameIdentifier	 edu
.	TokenNameDOT	
cmu	TokenNameIdentifier	 cmu
.	TokenNameDOT	
minorthird	TokenNameIdentifier	 minorthird
.	TokenNameDOT	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
learn	TokenNameIdentifier	 learn
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
Classifier	TokenNameIdentifier	 Classifier
;	TokenNameSEMICOLON	
import	TokenNameimport	
edu	TokenNameIdentifier	 edu
.	TokenNameDOT	
cmu	TokenNameIdentifier	 cmu
.	TokenNameDOT	
minorthird	TokenNameIdentifier	 minorthird
.	TokenNameDOT	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
TextLabels	TokenNameIdentifier	 Text Labels
;	TokenNameSEMICOLON	
/** Interface for OnlineLearner. Allows you to add to a learner by specifying a string rather than a Span. * Can return a TextClassifier, which scores a String rather than a span. * * @author Cameron Williams */	TokenNameCOMMENT_JAVADOC	 Interface for OnlineLearner. Allows you to add to a learner by specifying a string rather than a Span. Can return a TextClassifier, which scores a String rather than a span. * @author Cameron Williams 
public	TokenNamepublic	
interface	TokenNameinterface	
OnlineTextClassifierLearner	TokenNameIdentifier	 Online Text Classifier Learner
{	TokenNameLBRACE	
/** Provide document string with a label and add to the learner*/	TokenNameCOMMENT_JAVADOC	 Provide document string with a label and add to the learner
public	TokenNamepublic	
void	TokenNamevoid	
addDocument	TokenNameIdentifier	 add Document
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
label	TokenNameIdentifier	 label
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
text	TokenNameIdentifier	 text
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Returns the TextClassifier */	TokenNameCOMMENT_JAVADOC	 Returns the TextClassifier 
public	TokenNamepublic	
TextClassifier	TokenNameIdentifier	 Text Classifier
getTextClassifier	TokenNameIdentifier	 get Text Classifier
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Returns the Classifier */	TokenNameCOMMENT_JAVADOC	 Returns the Classifier 
public	TokenNamepublic	
Classifier	TokenNameIdentifier	 Classifier
getClassifier	TokenNameIdentifier	 get Classifier
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Tells the learner that no more examples are coming */	TokenNameCOMMENT_JAVADOC	 Tells the learner that no more examples are coming 
public	TokenNamepublic	
void	TokenNamevoid	
completeTraining	TokenNameIdentifier	 complete Training
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Erases all previous data from the learner */	TokenNameCOMMENT_JAVADOC	 Erases all previous data from the learner 
public	TokenNamepublic	
void	TokenNamevoid	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Returns an array of spanTypes that can be added to the learner */	TokenNameCOMMENT_JAVADOC	 Returns an array of spanTypes that can be added to the learner 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getTypes	TokenNameIdentifier	 get Types
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Returns an annotated copy of TextLabels */	TokenNameCOMMENT_JAVADOC	 Returns an annotated copy of TextLabels 
public	TokenNamepublic	
TextLabels	TokenNameIdentifier	 Text Labels
annotatedCopy	TokenNameIdentifier	 annotated Copy
(	TokenNameLPAREN	
TextLabels	TokenNameIdentifier	 Text Labels
labels	TokenNameIdentifier	 labels
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
ClassifierAnnotator	TokenNameIdentifier	 Classifier Annotator
getAnnotator	TokenNameIdentifier	 get Annotator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
