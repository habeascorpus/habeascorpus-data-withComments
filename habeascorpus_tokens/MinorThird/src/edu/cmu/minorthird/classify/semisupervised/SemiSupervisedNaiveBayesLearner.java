package	TokenNamepackage	
edu	TokenNameIdentifier	 edu
.	TokenNameDOT	
cmu	TokenNameIdentifier	 cmu
.	TokenNameDOT	
minorthird	TokenNameIdentifier	 minorthird
.	TokenNameDOT	
classify	TokenNameIdentifier	 classify
.	TokenNameDOT	
semisupervised	TokenNameIdentifier	 semisupervised
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
BasicDataset	TokenNameIdentifier	 Basic Dataset
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
BasicFeatureIndex	TokenNameIdentifier	 Basic Feature Index
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
Feature	TokenNameIdentifier	 Feature
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
SampleDatasets	TokenNameIdentifier	 Sample Datasets
;	TokenNameSEMICOLON	
/** * Implementation of the methods described in: * K. Nigam, A. McCallum, S. Thrun and T. Mitchell. Text Classifiaction from * labeled and unlabeled documents using EM. W. Choen editor, Machine Learning, * 1999. * * @author Edoardo Airoldi * Date: Mar 13, 2004 */	TokenNameCOMMENT_JAVADOC	 Implementation of the methods described in: K. Nigam, A. McCallum, S. Thrun and T. Mitchell. Text Classifiaction from labeled and unlabeled documents using EM. W. Choen editor, Machine Learning, 1999. * @author Edoardo Airoldi Date: Mar 13, 2004 
public	TokenNamepublic	
class	TokenNameclass	
SemiSupervisedNaiveBayesLearner	TokenNameIdentifier	 Semi Supervised Naive Bayes Learner
extends	TokenNameextends	
SemiSupervisedBatchClassifierLearner	TokenNameIdentifier	 Semi Supervised Batch Classifier Learner
{	TokenNameLBRACE	
private	TokenNameprivate	
int	TokenNameint	
MAX_ITER	TokenNameIdentifier	 MAX  ITER
=	TokenNameEQUAL	
1000	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Instance	TokenNameIdentifier	 Instance
>	TokenNameGREATER	
iteratorOverUnlabeled	TokenNameIdentifier	 iterator Over Unlabeled
;	TokenNameSEMICOLON	
// constructors 	TokenNameCOMMENT_LINE	constructors 
public	TokenNamepublic	
SemiSupervisedNaiveBayesLearner	TokenNameIdentifier	 Semi Supervised Naive Bayes Learner
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
SemiSupervisedNaiveBayesLearner	TokenNameIdentifier	 Semi Supervised Naive Bayes Learner
(	TokenNameLPAREN	
int	TokenNameint	
iterations	TokenNameIdentifier	 iterations
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
MAX_ITER	TokenNameIdentifier	 MAX  ITER
=	TokenNameEQUAL	
iterations	TokenNameIdentifier	 iterations
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
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
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
this	TokenNamethis	
.	TokenNameDOT	
iteratorOverUnlabeled	TokenNameIdentifier	 iterator Over Unlabeled
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
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
null	TokenNamenull	
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
ClassifierLearner	TokenNameIdentifier	 Classifier Learner
learner	TokenNameIdentifier	 learner
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
learner	TokenNameIdentifier	 learner
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ClassifierLearner	TokenNameIdentifier	 Classifier Learner
)	TokenNameRPAREN	
this	TokenNamethis	
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
learner	TokenNameIdentifier	 learner
.	TokenNameDOT	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
printStackTrace	TokenNameIdentifier	 print Stack Trace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
learner	TokenNameIdentifier	 learner
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
Classifier	TokenNameIdentifier	 Classifier
batchTrain	TokenNameIdentifier	 batch Train
(	TokenNameLPAREN	
SemiSupervisedDataset	TokenNameIdentifier	 Semi Supervised Dataset
dataset	TokenNameIdentifier	 dataset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Classifier	TokenNameIdentifier	 Classifier
mc	TokenNameIdentifier	 mc
=	TokenNameEQUAL	
new	TokenNamenew	
MultinomialClassifier	TokenNameIdentifier	 Multinomial Classifier
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//System.out.println(dataset); 	TokenNameCOMMENT_LINE	System.out.println(dataset); 
// 1. retrieve valid class names 	TokenNameCOMMENT_LINE	1. retrieve valid class names 
int	TokenNameint	
numberOfClasses	TokenNameIdentifier	 number Of Classes
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Example	TokenNameIdentifier	 Example
>	TokenNameGREATER	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
dataset	TokenNameIdentifier	 dataset
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Example	TokenNameIdentifier	 Example
ex	TokenNameIdentifier	 ex
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
MultinomialClassifier	TokenNameIdentifier	 Multinomial Classifier
)	TokenNameRPAREN	
mc	TokenNameIdentifier	 mc
)	TokenNameRPAREN	
.	TokenNameDOT	
isPresent	TokenNameIdentifier	 is Present
(	TokenNameLPAREN	
ex	TokenNameIdentifier	 ex
.	TokenNameDOT	
getLabel	TokenNameIdentifier	 get Label
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
MultinomialClassifier	TokenNameIdentifier	 Multinomial Classifier
)	TokenNameRPAREN	
mc	TokenNameIdentifier	 mc
)	TokenNameRPAREN	
.	TokenNameDOT	
addValidLabel	TokenNameIdentifier	 add Valid Label
(	TokenNameLPAREN	
ex	TokenNameIdentifier	 ex
.	TokenNameDOT	
getLabel	TokenNameIdentifier	 get Label
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
numberOfClasses	TokenNameIdentifier	 number Of Classes
+=	TokenNamePLUS_EQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// 2. estimate parameters using labeled examples 	TokenNameCOMMENT_LINE	2. estimate parameters using labeled examples 
BasicFeatureIndex	TokenNameIdentifier	 Basic Feature Index
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
new	TokenNamenew	
BasicFeatureIndex	TokenNameIdentifier	 Basic Feature Index
(	TokenNameLPAREN	
dataset	TokenNameIdentifier	 dataset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
countsGivenClass	TokenNameIdentifier	 counts Given Class
=	TokenNameEQUAL	
new	TokenNamenew	
double	TokenNamedouble	
[	TokenNameLBRACKET	
numberOfClasses	TokenNameIdentifier	 number Of Classes
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
examplesGivenClass	TokenNameIdentifier	 examples Given Class
=	TokenNameEQUAL	
new	TokenNamenew	
double	TokenNamedouble	
[	TokenNameLBRACKET	
numberOfClasses	TokenNameIdentifier	 number Of Classes
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
;	TokenNameSEMICOLON	
// 2.1. toStal counts 	TokenNameCOMMENT_LINE	2.1. toStal counts 
double	TokenNamedouble	
numberOfExamples	TokenNameIdentifier	 number Of Examples
=	TokenNameEQUAL	
(	TokenNameLPAREN	
dataset	TokenNameIdentifier	 dataset
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
numberOfFeatures	TokenNameIdentifier	 number Of Features
=	TokenNameEQUAL	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
.	TokenNameDOT	
numberOfFeatures	TokenNameIdentifier	 number Of Features
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Example	TokenNameIdentifier	 Example
>	TokenNameGREATER	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
dataset	TokenNameIdentifier	 dataset
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Example	TokenNameIdentifier	 Example
ex	TokenNameIdentifier	 ex
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
classIndex	TokenNameIdentifier	 class Index
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
MultinomialClassifier	TokenNameIdentifier	 Multinomial Classifier
)	TokenNameRPAREN	
mc	TokenNameIdentifier	 mc
)	TokenNameRPAREN	
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
ex	TokenNameIdentifier	 ex
.	TokenNameDOT	
getLabel	TokenNameIdentifier	 get Label
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//System.out.println("cllassIndex="+classIndex); 	TokenNameCOMMENT_LINE	System.out.println("cllassIndex="+classIndex); 
examplesGivenClass	TokenNameIdentifier	 examples Given Class
[	TokenNameLBRACKET	
classIndex	TokenNameIdentifier	 class Index
]	TokenNameRBRACKET	
+=	TokenNamePLUS_EQUAL	
1.0	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Feature	TokenNameIdentifier	 Feature
>	TokenNameGREATER	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
index	TokenNameIdentifier	 index
.	TokenNameDOT	
featureIterator	TokenNameIdentifier	 feature Iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Feature	TokenNameIdentifier	 Feature
f	TokenNameIdentifier	 f
=	TokenNameEQUAL	
j	TokenNameIdentifier	 j
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
countsGivenClass	TokenNameIdentifier	 counts Given Class
[	TokenNameLBRACKET	
classIndex	TokenNameIdentifier	 class Index
]	TokenNameRBRACKET	
+=	TokenNamePLUS_EQUAL	
ex	TokenNameIdentifier	 ex
.	TokenNameDOT	
getWeight	TokenNameIdentifier	 get Weight
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
numberOfClasses	TokenNameIdentifier	 number Of Classes
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//System.out.println("classes="+numberOfClasses+" ex|class="+examplesGivenClass[j]+" examples="+numberOfExamples); 	TokenNameCOMMENT_LINE	System.out.println("classes="+numberOfClasses+" ex|class="+examplesGivenClass[j]+" examples="+numberOfExamples); 
double	TokenNamedouble	
probabilityOfOccurrence	TokenNameIdentifier	 probability Of Occurrence
=	TokenNameEQUAL	
estimateClassProbMLE	TokenNameIdentifier	 estimate Class Prob MLE
(	TokenNameLPAREN	
1.0	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
numberOfClasses	TokenNameIdentifier	 number Of Classes
,	TokenNameCOMMA	
examplesGivenClass	TokenNameIdentifier	 examples Given Class
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
numberOfExamples	TokenNameIdentifier	 number Of Examples
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
MultinomialClassifier	TokenNameIdentifier	 Multinomial Classifier
)	TokenNameRPAREN	
mc	TokenNameIdentifier	 mc
)	TokenNameRPAREN	
.	TokenNameDOT	
setClassParameter	TokenNameIdentifier	 set Class Parameter
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
,	TokenNameCOMMA	
probabilityOfOccurrence	TokenNameIdentifier	 probability Of Occurrence
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//System.out.println("classP="+probabilityOfOccurrence); 	TokenNameCOMMENT_LINE	System.out.println("classP="+probabilityOfOccurrence); 
}	TokenNameRBRACE	
// 2.2. loop features 	TokenNameCOMMENT_LINE	2.2. loop features 
for	TokenNamefor	
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Feature	TokenNameIdentifier	 Feature
>	TokenNameGREATER	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
index	TokenNameIdentifier	 index
.	TokenNameDOT	
featureIterator	TokenNameIdentifier	 feature Iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Feature	TokenNameIdentifier	 Feature
f	TokenNameIdentifier	 f
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// 2.2.1. retrieve counts by feature 	TokenNameCOMMENT_LINE	2.2.1. retrieve counts by feature 
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
countsFeatureGivenClass	TokenNameIdentifier	 counts Feature Given Class
=	TokenNameEQUAL	
new	TokenNamenew	
double	TokenNamedouble	
[	TokenNameLBRACKET	
numberOfClasses	TokenNameIdentifier	 number Of Classes
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
index	TokenNameIdentifier	 index
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Example	TokenNameIdentifier	 Example
ex	TokenNameIdentifier	 ex
=	TokenNameEQUAL	
index	TokenNameIdentifier	 index
.	TokenNameDOT	
getExample	TokenNameIdentifier	 get Example
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
,	TokenNameCOMMA	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
classIndex	TokenNameIdentifier	 class Index
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
MultinomialClassifier	TokenNameIdentifier	 Multinomial Classifier
)	TokenNameRPAREN	
mc	TokenNameIdentifier	 mc
)	TokenNameRPAREN	
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
ex	TokenNameIdentifier	 ex
.	TokenNameDOT	
getLabel	TokenNameIdentifier	 get Label
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
countsFeatureGivenClass	TokenNameIdentifier	 counts Feature Given Class
[	TokenNameLBRACKET	
classIndex	TokenNameIdentifier	 class Index
]	TokenNameRBRACKET	
+=	TokenNamePLUS_EQUAL	
ex	TokenNameIdentifier	 ex
.	TokenNameDOT	
getWeight	TokenNameIdentifier	 get Weight
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// 2.2.2. estimate parameters of MultinomialClassifier for a certain (feature,class) 	TokenNameCOMMENT_LINE	2.2.2. estimate parameters of MultinomialClassifier for a certain (feature,class) 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
numberOfClasses	TokenNameIdentifier	 number Of Classes
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//System.out.println("feature="+f+" class="+j+" label="+((MultinomialClassifier)mc).getLabel(j)); 	TokenNameCOMMENT_LINE	System.out.println("feature="+f+" class="+j+" label="+((MultinomialClassifier)mc).getLabel(j)); 
//System.out.println("features="+numberOfFeatures+" fCnt|class="+countsFeatureGivenClass[j]+" cnt|class="+countsGivenClass[j]); 	TokenNameCOMMENT_LINE	System.out.println("features="+numberOfFeatures+" fCnt|class="+countsFeatureGivenClass[j]+" cnt|class="+countsGivenClass[j]); 
double	TokenNamedouble	
probabilityOfOccurrence	TokenNameIdentifier	 probability Of Occurrence
=	TokenNameEQUAL	
estimateFeatureProbMLE	TokenNameIdentifier	 estimate Feature Prob MLE
(	TokenNameLPAREN	
1.0	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
numberOfFeatures	TokenNameIdentifier	 number Of Features
,	TokenNameCOMMA	
countsFeatureGivenClass	TokenNameIdentifier	 counts Feature Given Class
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
countsGivenClass	TokenNameIdentifier	 counts Given Class
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
MultinomialClassifier	TokenNameIdentifier	 Multinomial Classifier
)	TokenNameRPAREN	
mc	TokenNameIdentifier	 mc
)	TokenNameRPAREN	
.	TokenNameDOT	
setFeatureGivenClassParameter	TokenNameIdentifier	 set Feature Given Class Parameter
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
,	TokenNameCOMMA	
j	TokenNameIdentifier	 j
,	TokenNameCOMMA	
probabilityOfOccurrence	TokenNameIdentifier	 probability Of Occurrence
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//System.out.println("prob="+probabilityOfOccurrence); 	TokenNameCOMMENT_LINE	System.out.println("prob="+probabilityOfOccurrence); 
}	TokenNameRBRACE	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
MultinomialClassifier	TokenNameIdentifier	 Multinomial Classifier
)	TokenNameRPAREN	
mc	TokenNameIdentifier	 mc
)	TokenNameRPAREN	
.	TokenNameDOT	
setFeatureModel	TokenNameIdentifier	 set Feature Model
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
,	TokenNameCOMMA	
"Binomial"	TokenNameStringLiteral	Binomial
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// 3. assign lables using classifier 	TokenNameCOMMENT_LINE	3. assign lables using classifier 
Dataset	TokenNameIdentifier	 Dataset
unlabeledDataset	TokenNameIdentifier	 unlabeled Dataset
=	TokenNameEQUAL	
new	TokenNamenew	
BasicDataset	TokenNameIdentifier	 Basic Dataset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Instance	TokenNameIdentifier	 Instance
>	TokenNameGREATER	
il	TokenNameIdentifier	 il
=	TokenNameEQUAL	
iteratorOverUnlabeled	TokenNameIdentifier	 iterator Over Unlabeled
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Instance	TokenNameIdentifier	 Instance
>	TokenNameGREATER	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
il	TokenNameIdentifier	 il
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Instance	TokenNameIdentifier	 Instance
mi	TokenNameIdentifier	 mi
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
mi	TokenNameIdentifier	 mi
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ClassLabel	TokenNameIdentifier	 Class Label
estimatedClassLabel	TokenNameIdentifier	 estimated Class Label
=	TokenNameEQUAL	
mc	TokenNameIdentifier	 mc
.	TokenNameDOT	
classification	TokenNameIdentifier	 classification
(	TokenNameLPAREN	
mi	TokenNameIdentifier	 mi
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
unlabeledDataset	TokenNameIdentifier	 unlabeled Dataset
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
Example	TokenNameIdentifier	 Example
(	TokenNameLPAREN	
mi	TokenNameIdentifier	 mi
,	TokenNameCOMMA	
estimatedClassLabel	TokenNameIdentifier	 estimated Class Label
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//System.out.println(unlabeledDataset); 	TokenNameCOMMENT_LINE	System.out.println(unlabeledDataset); 
// 4. initialize log-likelihood 	TokenNameCOMMENT_LINE	4. initialize log-likelihood 
double	TokenNamedouble	
logLik	TokenNameIdentifier	 log Lik
=	TokenNameEQUAL	
Double	TokenNameIdentifier	 Double
.	TokenNameDOT	
NEGATIVE_INFINITY	TokenNameIdentifier	 NEGATIVE  INFINITY
;	TokenNameSEMICOLON	
double	TokenNamedouble	
previousLogLik	TokenNameIdentifier	 previous Log Lik
;	TokenNameSEMICOLON	
// 5. loop until convergence 	TokenNameCOMMENT_LINE	5. loop until convergence 
int	TokenNameint	
iter	TokenNameIdentifier	 iter
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
hasConverged	TokenNameIdentifier	 has Converged
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
iter	TokenNameIdentifier	 iter
<	TokenNameLESS	
MAX_ITER	TokenNameIdentifier	 MAX  ITER
&	TokenNameAND	
!	TokenNameNOT	
hasConverged	TokenNameIdentifier	 has Converged
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// 5.1. initialization 	TokenNameCOMMENT_LINE	5.1. initialization 
previousLogLik	TokenNameIdentifier	 previous Log Lik
=	TokenNameEQUAL	
logLik	TokenNameIdentifier	 log Lik
;	TokenNameSEMICOLON	
logLik	TokenNameIdentifier	 log Lik
=	TokenNameEQUAL	
0.0	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
//Example.Looper el = new Example.Looper( dataset.iterator() ); 	TokenNameCOMMENT_LINE	Example.Looper el = new Example.Looper( dataset.iterator() ); 
Dataset	TokenNameIdentifier	 Dataset
combinedDataset	TokenNameIdentifier	 combined Dataset
=	TokenNameEQUAL	
new	TokenNamenew	
BasicDataset	TokenNameIdentifier	 Basic Dataset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Example	TokenNameIdentifier	 Example
>	TokenNameGREATER	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
dataset	TokenNameIdentifier	 dataset
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
combinedDataset	TokenNameIdentifier	 combined Dataset
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//el = new Example.Looper( unlabeledDataset.iterator() ); 	TokenNameCOMMENT_LINE	el = new Example.Looper( unlabeledDataset.iterator() ); 
for	TokenNamefor	
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Example	TokenNameIdentifier	 Example
>	TokenNameGREATER	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
unlabeledDataset	TokenNameIdentifier	 unlabeled Dataset
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
combinedDataset	TokenNameIdentifier	 combined Dataset
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//System.out.println(combinedDataset); 	TokenNameCOMMENT_LINE	System.out.println(combinedDataset); 
// 5.2. estimates parameters using all examples 	TokenNameCOMMENT_LINE	5.2. estimates parameters using all examples 
(	TokenNameLPAREN	
(	TokenNameLPAREN	
MultinomialClassifier	TokenNameIdentifier	 Multinomial Classifier
)	TokenNameRPAREN	
mc	TokenNameIdentifier	 mc
)	TokenNameRPAREN	
.	TokenNameDOT	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
new	TokenNamenew	
BasicFeatureIndex	TokenNameIdentifier	 Basic Feature Index
(	TokenNameLPAREN	
combinedDataset	TokenNameIdentifier	 combined Dataset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
countsGivenClass	TokenNameIdentifier	 counts Given Class
=	TokenNameEQUAL	
new	TokenNamenew	
double	TokenNamedouble	
[	TokenNameLBRACKET	
numberOfClasses	TokenNameIdentifier	 number Of Classes
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
examplesGivenClass	TokenNameIdentifier	 examples Given Class
=	TokenNameEQUAL	
new	TokenNamenew	
double	TokenNamedouble	
[	TokenNameLBRACKET	
numberOfClasses	TokenNameIdentifier	 number Of Classes
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
;	TokenNameSEMICOLON	
// 5.2.1. toStal counts 	TokenNameCOMMENT_LINE	5.2.1. toStal counts 
numberOfExamples	TokenNameIdentifier	 number Of Examples
=	TokenNameEQUAL	
(	TokenNameLPAREN	
combinedDataset	TokenNameIdentifier	 combined Dataset
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
numberOfFeatures	TokenNameIdentifier	 number Of Features
=	TokenNameEQUAL	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
.	TokenNameDOT	
numberOfFeatures	TokenNameIdentifier	 number Of Features
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//el = new Example.Looper( dataset.iterator() ); 	TokenNameCOMMENT_LINE	el = new Example.Looper( dataset.iterator() ); 
for	TokenNamefor	
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Example	TokenNameIdentifier	 Example
>	TokenNameGREATER	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
dataset	TokenNameIdentifier	 dataset
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Example	TokenNameIdentifier	 Example
ex	TokenNameIdentifier	 ex
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
classIndex	TokenNameIdentifier	 class Index
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
MultinomialClassifier	TokenNameIdentifier	 Multinomial Classifier
)	TokenNameRPAREN	
mc	TokenNameIdentifier	 mc
)	TokenNameRPAREN	
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
ex	TokenNameIdentifier	 ex
.	TokenNameDOT	
getLabel	TokenNameIdentifier	 get Label
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//System.out.println("cllassIndex="+classIndex); 	TokenNameCOMMENT_LINE	System.out.println("cllassIndex="+classIndex); 
examplesGivenClass	TokenNameIdentifier	 examples Given Class
[	TokenNameLBRACKET	
classIndex	TokenNameIdentifier	 class Index
]	TokenNameRBRACKET	
+=	TokenNamePLUS_EQUAL	
1.0	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Feature	TokenNameIdentifier	 Feature
>	TokenNameGREATER	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
index	TokenNameIdentifier	 index
.	TokenNameDOT	
featureIterator	TokenNameIdentifier	 feature Iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Feature	TokenNameIdentifier	 Feature
f	TokenNameIdentifier	 f
=	TokenNameEQUAL	
j	TokenNameIdentifier	 j
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
countsGivenClass	TokenNameIdentifier	 counts Given Class
[	TokenNameLBRACKET	
classIndex	TokenNameIdentifier	 class Index
]	TokenNameRBRACKET	
+=	TokenNamePLUS_EQUAL	
ex	TokenNameIdentifier	 ex
.	TokenNameDOT	
getWeight	TokenNameIdentifier	 get Weight
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
numberOfClasses	TokenNameIdentifier	 number Of Classes
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//System.out.println("classes="+numberOfClasses+" ex|class="+examplesGivenClass[j]+" examples="+numberOfExamples); 	TokenNameCOMMENT_LINE	System.out.println("classes="+numberOfClasses+" ex|class="+examplesGivenClass[j]+" examples="+numberOfExamples); 
double	TokenNamedouble	
probabilityOfOccurrence	TokenNameIdentifier	 probability Of Occurrence
=	TokenNameEQUAL	
estimateClassProbMLE	TokenNameIdentifier	 estimate Class Prob MLE
(	TokenNameLPAREN	
1.0	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
numberOfClasses	TokenNameIdentifier	 number Of Classes
,	TokenNameCOMMA	
examplesGivenClass	TokenNameIdentifier	 examples Given Class
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
numberOfExamples	TokenNameIdentifier	 number Of Examples
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
MultinomialClassifier	TokenNameIdentifier	 Multinomial Classifier
)	TokenNameRPAREN	
mc	TokenNameIdentifier	 mc
)	TokenNameRPAREN	
.	TokenNameDOT	
setClassParameter	TokenNameIdentifier	 set Class Parameter
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
,	TokenNameCOMMA	
probabilityOfOccurrence	TokenNameIdentifier	 probability Of Occurrence
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//System.out.println("classP="+probabilityOfOccurrence); 	TokenNameCOMMENT_LINE	System.out.println("classP="+probabilityOfOccurrence); 
}	TokenNameRBRACE	
// 5.2.2. loop features 	TokenNameCOMMENT_LINE	5.2.2. loop features 
for	TokenNamefor	
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Feature	TokenNameIdentifier	 Feature
>	TokenNameGREATER	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
index	TokenNameIdentifier	 index
.	TokenNameDOT	
featureIterator	TokenNameIdentifier	 feature Iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Feature	TokenNameIdentifier	 Feature
f	TokenNameIdentifier	 f
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// 5.2.2.1. retrieve counts by feature 	TokenNameCOMMENT_LINE	5.2.2.1. retrieve counts by feature 
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
countsFeatureGivenClass	TokenNameIdentifier	 counts Feature Given Class
=	TokenNameEQUAL	
new	TokenNamenew	
double	TokenNamedouble	
[	TokenNameLBRACKET	
numberOfClasses	TokenNameIdentifier	 number Of Classes
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
index	TokenNameIdentifier	 index
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Example	TokenNameIdentifier	 Example
ex	TokenNameIdentifier	 ex
=	TokenNameEQUAL	
index	TokenNameIdentifier	 index
.	TokenNameDOT	
getExample	TokenNameIdentifier	 get Example
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
,	TokenNameCOMMA	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
classIndex	TokenNameIdentifier	 class Index
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
MultinomialClassifier	TokenNameIdentifier	 Multinomial Classifier
)	TokenNameRPAREN	
mc	TokenNameIdentifier	 mc
)	TokenNameRPAREN	
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
ex	TokenNameIdentifier	 ex
.	TokenNameDOT	
getLabel	TokenNameIdentifier	 get Label
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
countsFeatureGivenClass	TokenNameIdentifier	 counts Feature Given Class
[	TokenNameLBRACKET	
classIndex	TokenNameIdentifier	 class Index
]	TokenNameRBRACKET	
+=	TokenNamePLUS_EQUAL	
ex	TokenNameIdentifier	 ex
.	TokenNameDOT	
getWeight	TokenNameIdentifier	 get Weight
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// 5.5.2.2. estimate parameters of MultinomialClassifier for a certain (feature,class) 	TokenNameCOMMENT_LINE	5.5.2.2. estimate parameters of MultinomialClassifier for a certain (feature,class) 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
numberOfClasses	TokenNameIdentifier	 number Of Classes
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//System.out.println("feature="+f+" class="+j+" label="+((MultinomialClassifier)mc).getLabel(j)); 	TokenNameCOMMENT_LINE	System.out.println("feature="+f+" class="+j+" label="+((MultinomialClassifier)mc).getLabel(j)); 
//System.out.println("features="+numberOfFeatures+" fCnt|class="+countsFeatureGivenClass[j]+" cnt|class="+countsGivenClass[j]); 	TokenNameCOMMENT_LINE	System.out.println("features="+numberOfFeatures+" fCnt|class="+countsFeatureGivenClass[j]+" cnt|class="+countsGivenClass[j]); 
double	TokenNamedouble	
probabilityOfOccurrence	TokenNameIdentifier	 probability Of Occurrence
=	TokenNameEQUAL	
estimateFeatureProbMLE	TokenNameIdentifier	 estimate Feature Prob MLE
(	TokenNameLPAREN	
1.0	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
numberOfFeatures	TokenNameIdentifier	 number Of Features
,	TokenNameCOMMA	
countsFeatureGivenClass	TokenNameIdentifier	 counts Feature Given Class
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
countsGivenClass	TokenNameIdentifier	 counts Given Class
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
MultinomialClassifier	TokenNameIdentifier	 Multinomial Classifier
)	TokenNameRPAREN	
mc	TokenNameIdentifier	 mc
)	TokenNameRPAREN	
.	TokenNameDOT	
setFeatureGivenClassParameter	TokenNameIdentifier	 set Feature Given Class Parameter
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
,	TokenNameCOMMA	
j	TokenNameIdentifier	 j
,	TokenNameCOMMA	
probabilityOfOccurrence	TokenNameIdentifier	 probability Of Occurrence
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//System.out.println("prob="+probabilityOfOccurrence); 	TokenNameCOMMENT_LINE	System.out.println("prob="+probabilityOfOccurrence); 
}	TokenNameRBRACE	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
MultinomialClassifier	TokenNameIdentifier	 Multinomial Classifier
)	TokenNameRPAREN	
mc	TokenNameIdentifier	 mc
)	TokenNameRPAREN	
.	TokenNameDOT	
setFeatureModel	TokenNameIdentifier	 set Feature Model
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
,	TokenNameCOMMA	
"Binomial"	TokenNameStringLiteral	Binomial
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// 5.3. re-assign labels using current value of parameters 	TokenNameCOMMENT_LINE	5.3. re-assign labels using current value of parameters 
//unlabeledDataset = new BasicDataset(); 	TokenNameCOMMENT_LINE	unlabeledDataset = new BasicDataset(); 
il	TokenNameIdentifier	 il
=	TokenNameEQUAL	
iteratorOverUnlabeled	TokenNameIdentifier	 iterator Over Unlabeled
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Instance	TokenNameIdentifier	 Instance
>	TokenNameGREATER	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
il	TokenNameIdentifier	 il
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Instance	TokenNameIdentifier	 Instance
mi	TokenNameIdentifier	 mi
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
mi	TokenNameIdentifier	 mi
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ClassLabel	TokenNameIdentifier	 Class Label
estimatedClassLabel	TokenNameIdentifier	 estimated Class Label
=	TokenNameEQUAL	
mc	TokenNameIdentifier	 mc
.	TokenNameDOT	
classification	TokenNameIdentifier	 classification
(	TokenNameLPAREN	
mi	TokenNameIdentifier	 mi
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
unlabeledDataset	TokenNameIdentifier	 unlabeled Dataset
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
Example	TokenNameIdentifier	 Example
(	TokenNameLPAREN	
mi	TokenNameIdentifier	 mi
,	TokenNameCOMMA	
estimatedClassLabel	TokenNameIdentifier	 estimated Class Label
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// 5.4. compute the log-lik of complete data 	TokenNameCOMMENT_LINE	5.4. compute the log-lik of complete data 
logLik	TokenNameIdentifier	 log Lik
=	TokenNameEQUAL	
0.0	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Example	TokenNameIdentifier	 Example
>	TokenNameGREATER	
eloo	TokenNameIdentifier	 eloo
=	TokenNameEQUAL	
combinedDataset	TokenNameIdentifier	 combined Dataset
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
eloo	TokenNameIdentifier	 eloo
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Example	TokenNameIdentifier	 Example
example	TokenNameIdentifier	 example
=	TokenNameEQUAL	
eloo	TokenNameIdentifier	 eloo
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
logLik	TokenNameIdentifier	 log Lik
+=	TokenNamePLUS_EQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
MultinomialClassifier	TokenNameIdentifier	 Multinomial Classifier
)	TokenNameRPAREN	
mc	TokenNameIdentifier	 mc
)	TokenNameRPAREN	
.	TokenNameDOT	
getLogLikelihood	TokenNameIdentifier	 get Log Likelihood
(	TokenNameLPAREN	
example	TokenNameIdentifier	 example
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// 5.5. check convergence and iterate 	TokenNameCOMMENT_LINE	5.5. check convergence and iterate 
if	TokenNameif	
(	TokenNameLPAREN	
EMconverged	TokenNameIdentifier	 E Mconverged
(	TokenNameLPAREN	
logLik	TokenNameIdentifier	 log Lik
,	TokenNameCOMMA	
previousLogLik	TokenNameIdentifier	 previous Log Lik
,	TokenNameCOMMA	
1e-7	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
hasConverged	TokenNameIdentifier	 has Converged
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"EM converged!"	TokenNameStringLiteral	EM converged!
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"iteration="	TokenNameStringLiteral	iteration=
+	TokenNamePLUS	
(	TokenNameLPAREN	
iter	TokenNameIdentifier	 iter
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" log-likelihood="	TokenNameStringLiteral	 log-likelihood=
+	TokenNamePLUS	
logLik	TokenNameIdentifier	 log Lik
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
iter	TokenNameIdentifier	 iter
+=	TokenNamePLUS_EQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// 6. return classifier 	TokenNameCOMMENT_LINE	6. return classifier 
return	TokenNamereturn	
mc	TokenNameIdentifier	 mc
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// 	TokenNameCOMMENT_LINE	 
// private methods 	TokenNameCOMMENT_LINE	private methods 
// 	TokenNameCOMMENT_LINE	 
private	TokenNameprivate	
double	TokenNamedouble	
estimateClassProbMLE	TokenNameIdentifier	 estimate Class Prob MLE
(	TokenNameLPAREN	
double	TokenNamedouble	
classPrior	TokenNameIdentifier	 class Prior
,	TokenNameCOMMA	
double	TokenNamedouble	
numberOfClasses	TokenNameIdentifier	 number Of Classes
,	TokenNameCOMMA	
double	TokenNamedouble	
observedCounts	TokenNameIdentifier	 observed Counts
,	TokenNameCOMMA	
double	TokenNamedouble	
totalCounts	TokenNameIdentifier	 total Counts
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
classPrior	TokenNameIdentifier	 class Prior
+	TokenNamePLUS	
observedCounts	TokenNameIdentifier	 observed Counts
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
(	TokenNameLPAREN	
numberOfClasses	TokenNameIdentifier	 number Of Classes
+	TokenNamePLUS	
totalCounts	TokenNameIdentifier	 total Counts
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
double	TokenNamedouble	
estimateFeatureProbMLE	TokenNameIdentifier	 estimate Feature Prob MLE
(	TokenNameLPAREN	
double	TokenNamedouble	
featurePrior	TokenNameIdentifier	 feature Prior
,	TokenNameCOMMA	
double	TokenNamedouble	
numberOfFeatures	TokenNameIdentifier	 number Of Features
,	TokenNameCOMMA	
double	TokenNamedouble	
observedCounts	TokenNameIdentifier	 observed Counts
,	TokenNameCOMMA	
double	TokenNamedouble	
totalCounts	TokenNameIdentifier	 total Counts
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
featurePrior	TokenNameIdentifier	 feature Prior
+	TokenNamePLUS	
observedCounts	TokenNameIdentifier	 observed Counts
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
(	TokenNameLPAREN	
numberOfFeatures	TokenNameIdentifier	 number Of Features
+	TokenNamePLUS	
totalCounts	TokenNameIdentifier	 total Counts
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* We have converged if the slope of the log-likelihood function falls below 'threshold', * i.e., |f(t) - f(t-1)| / avg < threshold, where avg = (|f(t)| + |f(t-1)|)/2 and * f(t) is log lik at iteration t. 'threshold' defaults to 1e-4. * * This stopping criterion is from Numerical Recipes in C p423 * * Note: If we are doing MAP estimation (using priors), the likelihood can decrase, even * though the mode of the posterior is increasing. */	TokenNameCOMMENT_BLOCK	 We have converged if the slope of the log-likelihood function falls below 'threshold', i.e., |f(t) - f(t-1)| / avg < threshold, where avg = (|f(t)| + |f(t-1)|)/2 and f(t) is log lik at iteration t. 'threshold' defaults to 1e-4. * This stopping criterion is from Numerical Recipes in C p423 * Note: If we are doing MAP estimation (using priors), the likelihood can decrase, even though the mode of the posterior is increasing. 
private	TokenNameprivate	
boolean	TokenNameboolean	
EMconverged	TokenNameIdentifier	 E Mconverged
(	TokenNameLPAREN	
double	TokenNamedouble	
loglik	TokenNameIdentifier	 loglik
,	TokenNameCOMMA	
double	TokenNamedouble	
previousLoglik	TokenNameIdentifier	 previous Loglik
,	TokenNameCOMMA	
double	TokenNamedouble	
threshold	TokenNameIdentifier	 threshold
,	TokenNameCOMMA	
boolean	TokenNameboolean	
checkIncreased	TokenNameIdentifier	 check Increased
)	TokenNameRPAREN	
{	TokenNameLBRACE	
double	TokenNamedouble	
epsilon	TokenNameIdentifier	 epsilon
=	TokenNameEQUAL	
2.2204e-16	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
converged	TokenNameIdentifier	 converged
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
checkIncreased	TokenNameIdentifier	 check Increased
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
loglik	TokenNameIdentifier	 loglik
-	TokenNameMINUS	
previousLoglik	TokenNameIdentifier	 previous Loglik
<	TokenNameLESS	
-	TokenNameMINUS	
1e-3	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
// allow for a little imprecision 	TokenNameCOMMENT_LINE	allow for a little imprecision 
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"******likelihood decreased from "	TokenNameStringLiteral	******likelihood decreased from 
+	TokenNamePLUS	
previousLoglik	TokenNameIdentifier	 previous Loglik
+	TokenNamePLUS	
" to "	TokenNameStringLiteral	 to 
+	TokenNamePLUS	
loglik	TokenNameIdentifier	 loglik
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
double	TokenNamedouble	
deltaLoglik	TokenNameIdentifier	 delta Loglik
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
abs	TokenNameIdentifier	 abs
(	TokenNameLPAREN	
loglik	TokenNameIdentifier	 loglik
-	TokenNameMINUS	
previousLoglik	TokenNameIdentifier	 previous Loglik
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
avgLoglik	TokenNameIdentifier	 avg Loglik
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
abs	TokenNameIdentifier	 abs
(	TokenNameLPAREN	
loglik	TokenNameIdentifier	 loglik
)	TokenNameRPAREN	
+	TokenNamePLUS	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
abs	TokenNameIdentifier	 abs
(	TokenNameLPAREN	
previousLoglik	TokenNameIdentifier	 previous Loglik
)	TokenNameRPAREN	
+	TokenNamePLUS	
epsilon	TokenNameIdentifier	 epsilon
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
deltaLoglik	TokenNameIdentifier	 delta Loglik
/	TokenNameDIVIDE	
avgLoglik	TokenNameIdentifier	 avg Loglik
)	TokenNameRPAREN	
<	TokenNameLESS	
threshold	TokenNameIdentifier	 threshold
)	TokenNameRPAREN	
{	TokenNameLBRACE	
converged	TokenNameIdentifier	 converged
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
converged	TokenNameIdentifier	 converged
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// 	TokenNameCOMMENT_LINE	 
// Test SemiSupervisedNaiveBayesLearner 	TokenNameCOMMENT_LINE	Test SemiSupervisedNaiveBayesLearner 
// 	TokenNameCOMMENT_LINE	 
static	TokenNamestatic	
public	TokenNamepublic	
void	TokenNamevoid	
main	TokenNameIdentifier	 main
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
args	TokenNameIdentifier	 args
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Dataset	TokenNameIdentifier	 Dataset
dataset	TokenNameIdentifier	 dataset
=	TokenNameEQUAL	
new	TokenNamenew	
BasicDataset	TokenNameIdentifier	 Basic Dataset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/*try { // load counts from file File fileOfCounts = new File("/Users/eairoldi/cmu.research/minorthird/apps/unlabeledDataset.3rd"); dataset = DatasetLoader.loadFile(fileOfCounts); } catch (Exception e) { log.error(e, e); System.exit(1); } System.out.println( "DatasetLoader:\n" + dataset );*/	TokenNameCOMMENT_BLOCK	try { // load counts from file File fileOfCounts = new File("/Users/eairoldi/cmu.research/minorthird/apps/unlabeledDataset.3rd"); dataset = DatasetLoader.loadFile(fileOfCounts); } catch (Exception e) { log.error(e, e); System.exit(1); } System.out.println( "DatasetLoader:\n" + dataset );
dataset	TokenNameIdentifier	 dataset
=	TokenNameEQUAL	
SampleDatasets	TokenNameIdentifier	 Sample Datasets
.	TokenNameDOT	
sampleData	TokenNameIdentifier	 sample Data
(	TokenNameLPAREN	
"bayesUnlabeled"	TokenNameStringLiteral	bayesUnlabeled
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"SampleDatasets (bayesUnlabeled): "	TokenNameStringLiteral	SampleDatasets (bayesUnlabeled): 
+	TokenNamePLUS	
dataset	TokenNameIdentifier	 dataset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
