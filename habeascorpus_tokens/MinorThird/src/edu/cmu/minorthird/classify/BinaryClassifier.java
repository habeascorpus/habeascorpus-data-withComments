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
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
Serializable	TokenNameIdentifier	 Serializable
;	TokenNameSEMICOLON	
/** * A Classifier which associates instances with a real number. * Positive numbers indicate a positive class, negative numbers * indicate a negative class. * * @author William Cohen */	TokenNameCOMMENT_JAVADOC	 A Classifier which associates instances with a real number. Positive numbers indicate a positive class, negative numbers indicate a negative class. * @author William Cohen 
abstract	TokenNameabstract	
public	TokenNamepublic	
class	TokenNameclass	
BinaryClassifier	TokenNameIdentifier	 Binary Classifier
implements	TokenNameimplements	
Classifier	TokenNameIdentifier	 Classifier
,	TokenNameCOMMA	
Serializable	TokenNameIdentifier	 Serializable
{	TokenNameLBRACE	
static	TokenNamestatic	
private	TokenNameprivate	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
ClassifierLearner	TokenNameIdentifier	 Classifier Learner
classifierLearner	TokenNameIdentifier	 classifier Learner
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
void	TokenNamevoid	
setClassifierLearner	TokenNameIdentifier	 set Classifier Learner
(	TokenNameLPAREN	
ClassifierLearner	TokenNameIdentifier	 Classifier Learner
cl	TokenNameIdentifier	 cl
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
classifierLearner	TokenNameIdentifier	 classifier Learner
=	TokenNameEQUAL	
cl	TokenNameIdentifier	 cl
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
ClassifierLearner	TokenNameIdentifier	 Classifier Learner
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
ClassLabel	TokenNameIdentifier	 Class Label
classification	TokenNameIdentifier	 classification
(	TokenNameLPAREN	
Instance	TokenNameIdentifier	 Instance
instance	TokenNameIdentifier	 instance
)	TokenNameRPAREN	
{	TokenNameLBRACE	
double	TokenNamedouble	
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
score	TokenNameIdentifier	 score
(	TokenNameLPAREN	
instance	TokenNameIdentifier	 instance
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
s	TokenNameIdentifier	 s
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
?	TokenNameQUESTION	
ClassLabel	TokenNameIdentifier	 Class Label
.	TokenNameDOT	
positiveLabel	TokenNameIdentifier	 positive Label
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
:	TokenNameCOLON	
ClassLabel	TokenNameIdentifier	 Class Label
.	TokenNameDOT	
negativeLabel	TokenNameIdentifier	 negative Label
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Get the weight for an instance being in the positive class. */	TokenNameCOMMENT_JAVADOC	 Get the weight for an instance being in the positive class. 
abstract	TokenNameabstract	
public	TokenNamepublic	
double	TokenNamedouble	
score	TokenNameIdentifier	 score
(	TokenNameLPAREN	
Instance	TokenNameIdentifier	 Instance
instance	TokenNameIdentifier	 instance
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
