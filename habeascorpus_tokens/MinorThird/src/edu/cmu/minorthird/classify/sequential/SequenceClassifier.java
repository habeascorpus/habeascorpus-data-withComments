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
Explanation	TokenNameIdentifier	 Explanation
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
ClassLabel	TokenNameIdentifier	 Class Label
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
/** * Interface for a sequence classifier. * * @author William Cohen */	TokenNameCOMMENT_JAVADOC	 Interface for a sequence classifier. * @author William Cohen 
public	TokenNamepublic	
interface	TokenNameinterface	
SequenceClassifier	TokenNameIdentifier	 Sequence Classifier
{	TokenNameLBRACE	
/** Return a predicted type for each element of the sequence. */	TokenNameCOMMENT_JAVADOC	 Return a predicted type for each element of the sequence. 
public	TokenNamepublic	
ClassLabel	TokenNameIdentifier	 Class Label
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
classification	TokenNameIdentifier	 classification
(	TokenNameLPAREN	
Instance	TokenNameIdentifier	 Instance
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
sequence	TokenNameIdentifier	 sequence
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Return some string that 'explains' the classification */	TokenNameCOMMENT_JAVADOC	 Return some string that 'explains' the classification 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
explain	TokenNameIdentifier	 explain
(	TokenNameLPAREN	
Instance	TokenNameIdentifier	 Instance
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
sequence	TokenNameIdentifier	 sequence
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Return and explanation for a classification */	TokenNameCOMMENT_JAVADOC	 Return and explanation for a classification 
public	TokenNamepublic	
Explanation	TokenNameIdentifier	 Explanation
getExplanation	TokenNameIdentifier	 get Explanation
(	TokenNameLPAREN	
Instance	TokenNameIdentifier	 Instance
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
sequence	TokenNameIdentifier	 sequence
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
