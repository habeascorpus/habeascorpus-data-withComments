/* Copyright 2003, Carnegie Mellon, All Rights Reserved */	TokenNameCOMMENT_BLOCK	 Copyright 2003, Carnegie Mellon, All Rights Reserved 
package	TokenNamepackage	
edu	TokenNameIdentifier	 edu
.	TokenNameDOT	
cmu	TokenNameIdentifier	 cmu
.	TokenNameDOT	
minorthird	TokenNameIdentifier	 minorthird
.	TokenNameDOT	
classify	TokenNameIdentifier	 classify
;	TokenNameSEMICOLON	
/** * Interface for a classifier. This is specialized to BinaryClassifier and KWayClassifier. * * @author William Cohen */	TokenNameCOMMENT_JAVADOC	 Interface for a classifier. This is specialized to BinaryClassifier and KWayClassifier. * @author William Cohen 
public	TokenNamepublic	
interface	TokenNameinterface	
Classifier	TokenNameIdentifier	 Classifier
{	TokenNameLBRACE	
/** Return a predicted type for the span, as a class label. */	TokenNameCOMMENT_JAVADOC	 Return a predicted type for the span, as a class label. 
public	TokenNamepublic	
ClassLabel	TokenNameIdentifier	 Class Label
classification	TokenNameIdentifier	 classification
(	TokenNameLPAREN	
Instance	TokenNameIdentifier	 Instance
instance	TokenNameIdentifier	 instance
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Return some string that 'explains' the classification */	TokenNameCOMMENT_JAVADOC	 Return some string that 'explains' the classification 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
explain	TokenNameIdentifier	 explain
(	TokenNameLPAREN	
Instance	TokenNameIdentifier	 Instance
instance	TokenNameIdentifier	 instance
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Return an Explanation for the classification */	TokenNameCOMMENT_JAVADOC	 Return an Explanation for the classification 
public	TokenNamepublic	
Explanation	TokenNameIdentifier	 Explanation
getExplanation	TokenNameIdentifier	 get Explanation
(	TokenNameLPAREN	
Instance	TokenNameIdentifier	 Instance
instance	TokenNameIdentifier	 instance
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
