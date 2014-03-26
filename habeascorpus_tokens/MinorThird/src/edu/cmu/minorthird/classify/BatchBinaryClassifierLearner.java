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
/** * Simple abstract class, getBinaryClassifier() method for a * BinaryClassifierLearner, and also a batchTrainBinary() method. * * @author William Cohen */	TokenNameCOMMENT_JAVADOC	 Simple abstract class, getBinaryClassifier() method for a BinaryClassifierLearner, and also a batchTrainBinary() method. * @author William Cohen 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
BatchBinaryClassifierLearner	TokenNameIdentifier	 Batch Binary Classifier Learner
extends	TokenNameextends	
BatchClassifierLearner	TokenNameIdentifier	 Batch Classifier Learner
implements	TokenNameimplements	
BinaryClassifierLearner	TokenNameIdentifier	 Binary Classifier Learner
{	TokenNameLBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
final	TokenNamefinal	
public	TokenNamepublic	
void	TokenNamevoid	
setSchema	TokenNameIdentifier	 set Schema
(	TokenNameLPAREN	
ExampleSchema	TokenNameIdentifier	 Example Schema
schema	TokenNameIdentifier	 schema
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
ExampleSchema	TokenNameIdentifier	 Example Schema
.	TokenNameDOT	
BINARY_EXAMPLE_SCHEMA	TokenNameIdentifier	 BINARY  EXAMPLE  SCHEMA
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
schema	TokenNameIdentifier	 schema
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalStateException	TokenNameIdentifier	 Illegal State Exception
(	TokenNameLPAREN	
"Can only learn binary example data."	TokenNameStringLiteral	Can only learn binary example data.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
final	TokenNamefinal	
public	TokenNamepublic	
ExampleSchema	TokenNameIdentifier	 Example Schema
getSchema	TokenNameIdentifier	 get Schema
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
ExampleSchema	TokenNameIdentifier	 Example Schema
.	TokenNameDOT	
BINARY_EXAMPLE_SCHEMA	TokenNameIdentifier	 BINARY  EXAMPLE  SCHEMA
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Train a binary classifier. */	TokenNameCOMMENT_JAVADOC	 Train a binary classifier. 
final	TokenNamefinal	
public	TokenNamepublic	
BinaryClassifier	TokenNameIdentifier	 Binary Classifier
batchTrainBinary	TokenNameIdentifier	 batch Train Binary
(	TokenNameLPAREN	
Dataset	TokenNameIdentifier	 Dataset
dataset	TokenNameIdentifier	 dataset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
BinaryClassifier	TokenNameIdentifier	 Binary Classifier
)	TokenNameRPAREN	
batchTrain	TokenNameIdentifier	 batch Train
(	TokenNameLPAREN	
dataset	TokenNameIdentifier	 dataset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Get the last-trained a binary classifier. */	TokenNameCOMMENT_JAVADOC	 Get the last-trained a binary classifier. 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
final	TokenNamefinal	
public	TokenNamepublic	
BinaryClassifier	TokenNameIdentifier	 Binary Classifier
getBinaryClassifier	TokenNameIdentifier	 get Binary Classifier
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
BinaryClassifier	TokenNameIdentifier	 Binary Classifier
)	TokenNameRPAREN	
getClassifier	TokenNameIdentifier	 get Classifier
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
