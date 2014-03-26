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
edu	TokenNameIdentifier	 edu
.	TokenNameDOT	
cmu	TokenNameIdentifier	 cmu
.	TokenNameDOT	
minorthird	TokenNameIdentifier	 minorthird
.	TokenNameDOT	
classify	TokenNameIdentifier	 classify
.	TokenNameDOT	
BatchClassifierLearner	TokenNameIdentifier	 Batch Classifier Learner
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
classify	TokenNameIdentifier	 classify
.	TokenNameDOT	
Dataset	TokenNameIdentifier	 Dataset
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
import	TokenNameimport	
edu	TokenNameIdentifier	 edu
.	TokenNameDOT	
cmu	TokenNameIdentifier	 cmu
.	TokenNameDOT	
minorthird	TokenNameIdentifier	 minorthird
.	TokenNameDOT	
classify	TokenNameIdentifier	 classify
.	TokenNameDOT	
algorithms	TokenNameIdentifier	 algorithms
.	TokenNameDOT	
linear	TokenNameIdentifier	 linear
.	TokenNameDOT	
MaxEntLearner	TokenNameIdentifier	 Max Ent Learner
;	TokenNameSEMICOLON	
/** * Learns to first transforming data with an InstanceTransform, then classify * it. * * @author William Cohen */	TokenNameCOMMENT_JAVADOC	 Learns to first transforming data with an InstanceTransform, then classify it. * @author William Cohen 
public	TokenNamepublic	
class	TokenNameclass	
TransformingBatchLearner	TokenNameIdentifier	 Transforming Batch Learner
extends	TokenNameextends	
BatchClassifierLearner	TokenNameIdentifier	 Batch Classifier Learner
{	TokenNameLBRACE	
private	TokenNameprivate	
InstanceTransformLearner	TokenNameIdentifier	 Instance Transform Learner
transformLearner	TokenNameIdentifier	 transform Learner
;	TokenNameSEMICOLON	
private	TokenNameprivate	
BatchClassifierLearner	TokenNameIdentifier	 Batch Classifier Learner
classifierLearner	TokenNameIdentifier	 classifier Learner
;	TokenNameSEMICOLON	
public	TokenNamepublic	
TransformingBatchLearner	TokenNameIdentifier	 Transforming Batch Learner
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
new	TokenNamenew	
FrequencyBasedTransformLearner	TokenNameIdentifier	 Frequency Based Transform Learner
(	TokenNameLPAREN	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
MaxEntLearner	TokenNameIdentifier	 Max Ent Learner
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setTransformLearner	TokenNameIdentifier	 set Transform Learner
(	TokenNameLPAREN	
InstanceTransformLearner	TokenNameIdentifier	 Instance Transform Learner
learner	TokenNameIdentifier	 learner
)	TokenNameRPAREN	
{	TokenNameLBRACE	
transformLearner	TokenNameIdentifier	 transform Learner
=	TokenNameEQUAL	
learner	TokenNameIdentifier	 learner
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
InstanceTransformLearner	TokenNameIdentifier	 Instance Transform Learner
getTransformLearner	TokenNameIdentifier	 get Transform Learner
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
transformLearner	TokenNameIdentifier	 transform Learner
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setClassifierLearner	TokenNameIdentifier	 set Classifier Learner
(	TokenNameLPAREN	
BatchClassifierLearner	TokenNameIdentifier	 Batch Classifier Learner
learner	TokenNameIdentifier	 learner
)	TokenNameRPAREN	
{	TokenNameLBRACE	
classifierLearner	TokenNameIdentifier	 classifier Learner
=	TokenNameEQUAL	
learner	TokenNameIdentifier	 learner
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
BatchClassifierLearner	TokenNameIdentifier	 Batch Classifier Learner
getClassifierLearner	TokenNameIdentifier	 get Classifier Learner
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
classifierLearner	TokenNameIdentifier	 classifier Learner
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
setSchema	TokenNameIdentifier	 set Schema
(	TokenNameLPAREN	
ExampleSchema	TokenNameIdentifier	 Example Schema
schema	TokenNameIdentifier	 schema
)	TokenNameRPAREN	
{	TokenNameLBRACE	
classifierLearner	TokenNameIdentifier	 classifier Learner
.	TokenNameDOT	
setSchema	TokenNameIdentifier	 set Schema
(	TokenNameLPAREN	
schema	TokenNameIdentifier	 schema
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
ExampleSchema	TokenNameIdentifier	 Example Schema
getSchema	TokenNameIdentifier	 get Schema
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
classifierLearner	TokenNameIdentifier	 classifier Learner
.	TokenNameDOT	
getSchema	TokenNameIdentifier	 get Schema
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
TransformingBatchLearner	TokenNameIdentifier	 Transforming Batch Learner
(	TokenNameLPAREN	
InstanceTransformLearner	TokenNameIdentifier	 Instance Transform Learner
transformLearner	TokenNameIdentifier	 transform Learner
,	TokenNameCOMMA	
BatchClassifierLearner	TokenNameIdentifier	 Batch Classifier Learner
classifierLearner	TokenNameIdentifier	 classifier Learner
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
transformLearner	TokenNameIdentifier	 transform Learner
=	TokenNameEQUAL	
transformLearner	TokenNameIdentifier	 transform Learner
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
classifierLearner	TokenNameIdentifier	 classifier Learner
=	TokenNameEQUAL	
classifierLearner	TokenNameIdentifier	 classifier Learner
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
Classifier	TokenNameIdentifier	 Classifier
batchTrain	TokenNameIdentifier	 batch Train
(	TokenNameLPAREN	
Dataset	TokenNameIdentifier	 Dataset
dataset	TokenNameIdentifier	 dataset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
InstanceTransform	TokenNameIdentifier	 Instance Transform
transformer	TokenNameIdentifier	 transformer
=	TokenNameEQUAL	
transformLearner	TokenNameIdentifier	 transform Learner
.	TokenNameDOT	
batchTrain	TokenNameIdentifier	 batch Train
(	TokenNameLPAREN	
dataset	TokenNameIdentifier	 dataset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
Classifier	TokenNameIdentifier	 Classifier
classifier	TokenNameIdentifier	 classifier
=	TokenNameEQUAL	
classifierLearner	TokenNameIdentifier	 classifier Learner
.	TokenNameDOT	
batchTrain	TokenNameIdentifier	 batch Train
(	TokenNameLPAREN	
transformer	TokenNameIdentifier	 transformer
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
(	TokenNameLPAREN	
dataset	TokenNameIdentifier	 dataset
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// ViewerFrame f1 = new ViewerFrame("classifier", new 	TokenNameCOMMENT_LINE	ViewerFrame f1 = new ViewerFrame("classifier", new 
// SmartVanillaViewer(classifier)); 	TokenNameCOMMENT_LINE	SmartVanillaViewer(classifier)); 
// ViewerFrame f2 = new ViewerFrame("dataset", new 	TokenNameCOMMENT_LINE	ViewerFrame f2 = new ViewerFrame("dataset", new 
// SmartVanillaViewer(transformer.transform(dataset))); 	TokenNameCOMMENT_LINE	SmartVanillaViewer(transformer.transform(dataset))); 
return	TokenNamereturn	
new	TokenNamenew	
TransformingClassifier	TokenNameIdentifier	 Transforming Classifier
(	TokenNameLPAREN	
classifier	TokenNameIdentifier	 classifier
,	TokenNameCOMMA	
transformer	TokenNameIdentifier	 transformer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
