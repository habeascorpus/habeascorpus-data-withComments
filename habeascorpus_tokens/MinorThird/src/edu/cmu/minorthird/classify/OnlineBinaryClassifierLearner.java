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
/** * Abstract class which implements the 'getBinaryClassifier' method of BinaryClassifierLearner's. * * @author William Cohen */	TokenNameCOMMENT_JAVADOC	 Abstract class which implements the 'getBinaryClassifier' method of BinaryClassifierLearner's. * @author William Cohen 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
OnlineBinaryClassifierLearner	TokenNameIdentifier	 Online Binary Classifier Learner
extends	TokenNameextends	
OnlineClassifierLearner	TokenNameIdentifier	 Online Classifier Learner
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
"can only learn binary example data: requested schema is "	TokenNameStringLiteral	can only learn binary example data: requested schema is 
+	TokenNamePLUS	
schema	TokenNameIdentifier	 schema
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
