/* Copyright 2003, Carnegie Mellon, All Rights Reserved */	TokenNameCOMMENT_BLOCK	 Copyright 2003, Carnegie Mellon, All Rights Reserved 
package	TokenNamepackage	
edu	TokenNameIdentifier	 edu
.	TokenNameDOT	
cmu	TokenNameIdentifier	 cmu
.	TokenNameDOT	
minorthird	TokenNameIdentifier	 minorthird
.	TokenNameDOT	
classify	TokenNameIdentifier	 classify
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
Serializable	TokenNameIdentifier	 Serializable
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
import	TokenNameimport	
edu	TokenNameIdentifier	 edu
.	TokenNameDOT	
cmu	TokenNameIdentifier	 cmu
.	TokenNameDOT	
minorthird	TokenNameIdentifier	 minorthird
.	TokenNameDOT	
classify	TokenNameIdentifier	 classify
.	TokenNameDOT	
multi	TokenNameIdentifier	 multi
.	TokenNameDOT	
InstanceFromPrediction	TokenNameIdentifier	 Instance From Prediction
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
multi	TokenNameIdentifier	 multi
.	TokenNameDOT	
MultiClassLabel	TokenNameIdentifier	 Multi Class Label
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
multi	TokenNameIdentifier	 multi
.	TokenNameDOT	
MultiClassifier	TokenNameIdentifier	 Multi Classifier
;	TokenNameSEMICOLON	
/** * @author Cameron Williams * Date: October 11, 2005 * Stores a learned multiClassifier and uses that to predict a multiLabel * for each instance. Each label from the multiLabel is then added as * a feature to each instance. */	TokenNameCOMMENT_JAVADOC	 @author Cameron Williams Date: October 11, 2005 Stores a learned multiClassifier and uses that to predict a multiLabel for each instance. Each label from the multiLabel is then added as a feature to each instance. 
public	TokenNamepublic	
class	TokenNameclass	
PredictedClassTransform	TokenNameIdentifier	 Predicted Class Transform
extends	TokenNameextends	
AbstractInstanceTransform	TokenNameIdentifier	 Abstract Instance Transform
implements	TokenNameimplements	
Serializable	TokenNameIdentifier	 Serializable
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
20080201L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
MultiClassifier	TokenNameIdentifier	 Multi Classifier
multiClassifier	TokenNameIdentifier	 multi Classifier
;	TokenNameSEMICOLON	
public	TokenNamepublic	
PredictedClassTransform	TokenNameIdentifier	 Predicted Class Transform
(	TokenNameLPAREN	
MultiClassifier	TokenNameIdentifier	 Multi Classifier
multiClassifier	TokenNameIdentifier	 multi Classifier
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
multiClassifier	TokenNameIdentifier	 multi Classifier
=	TokenNameEQUAL	
multiClassifier	TokenNameIdentifier	 multi Classifier
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* Adds the predicted multiClassLabel as features to the instance */	TokenNameCOMMENT_BLOCK	 Adds the predicted multiClassLabel as features to the instance 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
Instance	TokenNameIdentifier	 Instance
transform	TokenNameIdentifier	 transform
(	TokenNameLPAREN	
Instance	TokenNameIdentifier	 Instance
instance	TokenNameIdentifier	 instance
)	TokenNameRPAREN	
{	TokenNameLBRACE	
MultiClassLabel	TokenNameIdentifier	 Multi Class Label
predicted	TokenNameIdentifier	 predicted
=	TokenNameEQUAL	
multiClassifier	TokenNameIdentifier	 multi Classifier
.	TokenNameDOT	
multiLabelClassification	TokenNameIdentifier	 multi Label Classification
(	TokenNameLPAREN	
instance	TokenNameIdentifier	 instance
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Instance	TokenNameIdentifier	 Instance
annotatedInstance	TokenNameIdentifier	 annotated Instance
=	TokenNameEQUAL	
new	TokenNamenew	
InstanceFromPrediction	TokenNameIdentifier	 Instance From Prediction
(	TokenNameLPAREN	
instance	TokenNameIdentifier	 instance
,	TokenNameCOMMA	
predicted	TokenNameIdentifier	 predicted
.	TokenNameDOT	
bestClassName	TokenNameIdentifier	 best Class Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
annotatedInstance	TokenNameIdentifier	 annotated Instance
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
