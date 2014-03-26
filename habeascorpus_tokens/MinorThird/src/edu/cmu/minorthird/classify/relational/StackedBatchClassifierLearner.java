package	TokenNamepackage	
edu	TokenNameIdentifier	 edu
.	TokenNameDOT	
cmu	TokenNameIdentifier	 cmu
.	TokenNameDOT	
minorthird	TokenNameIdentifier	 minorthird
.	TokenNameDOT	
classify	TokenNameIdentifier	 classify
.	TokenNameDOT	
relational	TokenNameIdentifier	 relational
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Iterator	TokenNameIdentifier	 Iterator
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
ClassifierLearner	TokenNameIdentifier	 Classifier Learner
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
Example	TokenNameIdentifier	 Example
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
SGMExample	TokenNameIdentifier	 SGM Example
;	TokenNameSEMICOLON	
/** * Abstract ClassifierLearner which instantiates the teacher-learner protocol * so as to implement a stacked batch learner. * * @author Zhenzhen Kou */	TokenNameCOMMENT_JAVADOC	 Abstract ClassifierLearner which instantiates the teacher-learner protocol so as to implement a stacked batch learner. * @author Zhenzhen Kou 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
StackedBatchClassifierLearner	TokenNameIdentifier	 Stacked Batch Classifier Learner
implements	TokenNameimplements	
ClassifierLearner	TokenNameIdentifier	 Classifier Learner
{	TokenNameLBRACE	
/** This variable saves the last classifier produced by batchTrain. * If it is non-null, then it will be returned by class to * getClassifier(). Implementations of batchTrain should save the * returned classifier to avoid extra work. */	TokenNameCOMMENT_JAVADOC	 This variable saves the last classifier produced by batchTrain. If it is non-null, then it will be returned by class to getClassifier(). Implementations of batchTrain should save the returned classifier to avoid extra work. 
protected	TokenNameprotected	
RealRelationalDataset	TokenNameIdentifier	 Real Relational Dataset
dataset	TokenNameIdentifier	 dataset
=	TokenNameEQUAL	
new	TokenNamenew	
RealRelationalDataset	TokenNameIdentifier	 Real Relational Dataset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
Classifier	TokenNameIdentifier	 Classifier
classifier	TokenNameIdentifier	 classifier
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
final	TokenNamefinal	
public	TokenNamepublic	
void	TokenNamevoid	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
dataset	TokenNameIdentifier	 dataset
=	TokenNameEQUAL	
new	TokenNamenew	
RealRelationalDataset	TokenNameIdentifier	 Real Relational Dataset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
classifier	TokenNameIdentifier	 classifier
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
final	TokenNamefinal	
public	TokenNamepublic	
void	TokenNamevoid	
setInstancePool	TokenNameIdentifier	 set Instance Pool
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Instance	TokenNameIdentifier	 Instance
>	TokenNameGREATER	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
final	TokenNamefinal	
public	TokenNamepublic	
boolean	TokenNameboolean	
hasNextQuery	TokenNameIdentifier	 has Next Query
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
final	TokenNamefinal	
public	TokenNamepublic	
Instance	TokenNameIdentifier	 Instance
nextQuery	TokenNameIdentifier	 next Query
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
final	TokenNamefinal	
public	TokenNamepublic	
void	TokenNamevoid	
addExample	TokenNameIdentifier	 add Example
(	TokenNameLPAREN	
Example	TokenNameIdentifier	 Example
answeredQuery	TokenNameIdentifier	 answered Query
)	TokenNameRPAREN	
{	TokenNameLBRACE	
dataset	TokenNameIdentifier	 dataset
.	TokenNameDOT	
addSGM	TokenNameIdentifier	 add SGM
(	TokenNameLPAREN	
(	TokenNameLPAREN	
SGMExample	TokenNameIdentifier	 SGM Example
)	TokenNameRPAREN	
answeredQuery	TokenNameIdentifier	 answered Query
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
classifier	TokenNameIdentifier	 classifier
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
final	TokenNamefinal	
public	TokenNamepublic	
void	TokenNamevoid	
completeTraining	TokenNameIdentifier	 complete Training
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
classifier	TokenNameIdentifier	 classifier
=	TokenNameEQUAL	
batchTrain	TokenNameIdentifier	 batch Train
(	TokenNameLPAREN	
dataset	TokenNameIdentifier	 dataset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
final	TokenNamefinal	
public	TokenNamepublic	
Classifier	TokenNameIdentifier	 Classifier
getClassifier	TokenNameIdentifier	 get Classifier
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
classifier	TokenNameIdentifier	 classifier
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
classifier	TokenNameIdentifier	 classifier
=	TokenNameEQUAL	
batchTrain	TokenNameIdentifier	 batch Train
(	TokenNameLPAREN	
dataset	TokenNameIdentifier	 dataset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
classifier	TokenNameIdentifier	 classifier
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
ClassifierLearner	TokenNameIdentifier	 Classifier Learner
copy	TokenNameIdentifier	 copy
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StackedBatchClassifierLearner	TokenNameIdentifier	 Stacked Batch Classifier Learner
bcl	TokenNameIdentifier	 bcl
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
bcl	TokenNameIdentifier	 bcl
=	TokenNameEQUAL	
(	TokenNameLPAREN	
StackedBatchClassifierLearner	TokenNameIdentifier	 Stacked Batch Classifier Learner
)	TokenNameRPAREN	
this	TokenNamethis	
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bcl	TokenNameIdentifier	 bcl
.	TokenNameDOT	
dataset	TokenNameIdentifier	 dataset
=	TokenNameEQUAL	
new	TokenNamenew	
RealRelationalDataset	TokenNameIdentifier	 Real Relational Dataset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bcl	TokenNameIdentifier	 bcl
.	TokenNameDOT	
classifier	TokenNameIdentifier	 classifier
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Cannot clone "	TokenNameStringLiteral	Cannot clone 
+	TokenNamePLUS	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
printStackTrace	TokenNameIdentifier	 print Stack Trace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bcl	TokenNameIdentifier	 bcl
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
bcl	TokenNameIdentifier	 bcl
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** subclasses should use this method to implement a batch supervised learning algorithm. */	TokenNameCOMMENT_JAVADOC	 subclasses should use this method to implement a batch supervised learning algorithm. 
abstract	TokenNameabstract	
public	TokenNamepublic	
Classifier	TokenNameIdentifier	 Classifier
batchTrain	TokenNameIdentifier	 batch Train
(	TokenNameLPAREN	
RealRelationalDataset	TokenNameIdentifier	 Real Relational Dataset
RelDataset	TokenNameIdentifier	 Rel Dataset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
