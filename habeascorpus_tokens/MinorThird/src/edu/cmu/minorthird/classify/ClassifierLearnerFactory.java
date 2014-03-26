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
/** * Generate many copies of a ClassifierLearner. * * @author William Cohen */	TokenNameCOMMENT_JAVADOC	 Generate many copies of a ClassifierLearner. * @author William Cohen 
public	TokenNamepublic	
class	TokenNameclass	
ClassifierLearnerFactory	TokenNameIdentifier	 Classifier Learner Factory
{	TokenNameLBRACE	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
learnerName	TokenNameIdentifier	 learner Name
;	TokenNameSEMICOLON	
public	TokenNamepublic	
ClassifierLearnerFactory	TokenNameIdentifier	 Classifier Learner Factory
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
learnerName	TokenNameIdentifier	 learner Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
learnerName	TokenNameIdentifier	 learner Name
=	TokenNameEQUAL	
learnerName	TokenNameIdentifier	 learner Name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Build a new copy of the learner produced by this factory. */	TokenNameCOMMENT_JAVADOC	 Build a new copy of the learner produced by this factory. 
public	TokenNamepublic	
ClassifierLearner	TokenNameIdentifier	 Classifier Learner
getLearner	TokenNameIdentifier	 get Learner
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
bsh	TokenNameIdentifier	 bsh
.	TokenNameDOT	
Interpreter	TokenNameIdentifier	 Interpreter
interp	TokenNameIdentifier	 interp
=	TokenNameEQUAL	
new	TokenNamenew	
bsh	TokenNameIdentifier	 bsh
.	TokenNameDOT	
Interpreter	TokenNameIdentifier	 Interpreter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
interp	TokenNameIdentifier	 interp
.	TokenNameDOT	
eval	TokenNameIdentifier	 eval
(	TokenNameLPAREN	
"import edu.cmu.minorthird.classify.*;"	TokenNameStringLiteral	import edu.cmu.minorthird.classify.*;
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
interp	TokenNameIdentifier	 interp
.	TokenNameDOT	
eval	TokenNameIdentifier	 eval
(	TokenNameLPAREN	
"import edu.cmu.minorthird.classify.algorithms.linear.*;"	TokenNameStringLiteral	import edu.cmu.minorthird.classify.algorithms.linear.*;
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
interp	TokenNameIdentifier	 interp
.	TokenNameDOT	
eval	TokenNameIdentifier	 eval
(	TokenNameLPAREN	
"import edu.cmu.minorthird.classify.algorithms.trees.*;"	TokenNameStringLiteral	import edu.cmu.minorthird.classify.algorithms.trees.*;
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
interp	TokenNameIdentifier	 interp
.	TokenNameDOT	
eval	TokenNameIdentifier	 eval
(	TokenNameLPAREN	
"import edu.cmu.minorthird.classify.algorithms.knn.*;"	TokenNameStringLiteral	import edu.cmu.minorthird.classify.algorithms.knn.*;
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
interp	TokenNameIdentifier	 interp
.	TokenNameDOT	
eval	TokenNameIdentifier	 eval
(	TokenNameLPAREN	
"import edu.cmu.minorthird.classify.algorithms.svm.*;"	TokenNameStringLiteral	import edu.cmu.minorthird.classify.algorithms.svm.*;
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
interp	TokenNameIdentifier	 interp
.	TokenNameDOT	
eval	TokenNameIdentifier	 eval
(	TokenNameLPAREN	
"import edu.cmu.minorthird.classify.transform.*;"	TokenNameStringLiteral	import edu.cmu.minorthird.classify.transform.*;
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
ClassifierLearner	TokenNameIdentifier	 Classifier Learner
)	TokenNameRPAREN	
interp	TokenNameIdentifier	 interp
.	TokenNameDOT	
eval	TokenNameIdentifier	 eval
(	TokenNameLPAREN	
learnerName	TokenNameIdentifier	 learner Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
bsh	TokenNameIdentifier	 bsh
.	TokenNameDOT	
EvalError	TokenNameIdentifier	 Eval Error
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"error parsing learnerName '"	TokenNameStringLiteral	error parsing learnerName '
+	TokenNamePLUS	
learnerName	TokenNameIdentifier	 learner Name
+	TokenNamePLUS	
"': "	TokenNameStringLiteral	': 
+	TokenNamePLUS	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
