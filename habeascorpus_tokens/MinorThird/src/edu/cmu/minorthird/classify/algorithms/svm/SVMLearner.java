package	TokenNamepackage	
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
svm	TokenNameIdentifier	 svm
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
libsvm	TokenNameIdentifier	 libsvm
.	TokenNameDOT	
svm	TokenNameIdentifier	 svm
;	TokenNameSEMICOLON	
import	TokenNameimport	
libsvm	TokenNameIdentifier	 libsvm
.	TokenNameDOT	
svm_model	TokenNameIdentifier	 svm model
;	TokenNameSEMICOLON	
import	TokenNameimport	
libsvm	TokenNameIdentifier	 libsvm
.	TokenNameDOT	
svm_parameter	TokenNameIdentifier	 svm parameter
;	TokenNameSEMICOLON	
import	TokenNameimport	
libsvm	TokenNameIdentifier	 libsvm
.	TokenNameDOT	
svm_problem	TokenNameIdentifier	 svm problem
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
Logger	TokenNameIdentifier	 Logger
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
/** * Wraps the svm.svm_train algorithm from libsvm * (http://www.csie.ntu.edu.tw/~cjlin/libsvm/) * <p/> * Parameterization is done via an SVM object (see libsvm docs for examples/info). * <p/> * There are a few setParameterXXX methods to do some changes. Use these after calling new SVMLearner() * and before starting training. * * @author ksteppe, Frank Lin */	TokenNameCOMMENT_JAVADOC	 Wraps the svm.svm_train algorithm from libsvm (http://www.csie.ntu.edu.tw/~cjlin/libsvm/) <p/> Parameterization is done via an SVM object (see libsvm docs for examples/info). <p/> There are a few setParameterXXX methods to do some changes. Use these after calling new SVMLearner() and before starting training. * @author ksteppe, Frank Lin 
public	TokenNamepublic	
class	TokenNameclass	
SVMLearner	TokenNameIdentifier	 SVM Learner
extends	TokenNameextends	
BatchClassifierLearner	TokenNameIdentifier	 Batch Classifier Learner
{	TokenNameLBRACE	
static	TokenNamestatic	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
=	TokenNameEQUAL	
Logger	TokenNameIdentifier	 Logger
.	TokenNameDOT	
getLogger	TokenNameIdentifier	 get Logger
(	TokenNameLPAREN	
SVMLearner	TokenNameIdentifier	 SVM Learner
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
svm_parameter	TokenNameIdentifier	 svm parameter
parameters	TokenNameIdentifier	 parameters
;	TokenNameSEMICOLON	
private	TokenNameprivate	
ExampleSchema	TokenNameIdentifier	 Example Schema
schema	TokenNameIdentifier	 schema
;	TokenNameSEMICOLON	
/** * Construct learner using given params * * @param parameters parameters to the SVM */	TokenNameCOMMENT_JAVADOC	 Construct learner using given params * @param parameters parameters to the SVM 
public	TokenNamepublic	
SVMLearner	TokenNameIdentifier	 SVM Learner
(	TokenNameLPAREN	
svm_parameter	TokenNameIdentifier	 svm parameter
parameters	TokenNameIdentifier	 parameters
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
parameters	TokenNameIdentifier	 parameters
=	TokenNameEQUAL	
parameters	TokenNameIdentifier	 parameters
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * default constructor */	TokenNameCOMMENT_JAVADOC	 default constructor 
public	TokenNamepublic	
SVMLearner	TokenNameIdentifier	 SVM Learner
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
getDefaultParameters	TokenNameIdentifier	 get Default Parameters
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * sets the default parameters for the svm * <p/> * use the setParameterXXX methods to adjust them */	TokenNameCOMMENT_JAVADOC	 sets the default parameters for the svm <p/> use the setParameterXXX methods to adjust them 
protected	TokenNameprotected	
static	TokenNamestatic	
svm_parameter	TokenNameIdentifier	 svm parameter
getDefaultParameters	TokenNameIdentifier	 get Default Parameters
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
svm_parameter	TokenNameIdentifier	 svm parameter
p	TokenNameIdentifier	 p
=	TokenNameEQUAL	
new	TokenNamenew	
svm_parameter	TokenNameIdentifier	 svm parameter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// default values 	TokenNameCOMMENT_LINE	default values 
p	TokenNameIdentifier	 p
.	TokenNameDOT	
svm_type	TokenNameIdentifier	 svm type
=	TokenNameEQUAL	
svm_parameter	TokenNameIdentifier	 svm parameter
.	TokenNameDOT	
C_SVC	TokenNameIdentifier	 C  SVC
;	TokenNameSEMICOLON	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
kernel_type	TokenNameIdentifier	 kernel type
=	TokenNameEQUAL	
svm_parameter	TokenNameIdentifier	 svm parameter
.	TokenNameDOT	
LINEAR	TokenNameIdentifier	 LINEAR
;	TokenNameSEMICOLON	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
degree	TokenNameIdentifier	 degree
=	TokenNameEQUAL	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
gamma	TokenNameIdentifier	 gamma
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// 1/k 	TokenNameCOMMENT_LINE	1/k 
p	TokenNameIdentifier	 p
.	TokenNameDOT	
coef0	TokenNameIdentifier	 coef0
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
nu	TokenNameIdentifier	 nu
=	TokenNameEQUAL	
0.5	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
cache_size	TokenNameIdentifier	 cache size
=	TokenNameEQUAL	
40	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
C	TokenNameIdentifier	 C
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
eps	TokenNameIdentifier	 eps
=	TokenNameEQUAL	
1e-3	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
p	TokenNameIdentifier	 p
=	TokenNameEQUAL	
0.1	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
shrinking	TokenNameIdentifier	 shrinking
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
nr_weight	TokenNameIdentifier	 nr weight
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
weight_label	TokenNameIdentifier	 weight label
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
weight	TokenNameIdentifier	 weight
=	TokenNameEQUAL	
new	TokenNamenew	
double	TokenNamedouble	
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
probability	TokenNameIdentifier	 probability
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
p	TokenNameIdentifier	 p
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
this	TokenNamethis	
.	TokenNameDOT	
schema	TokenNameIdentifier	 schema
=	TokenNameEQUAL	
schema	TokenNameIdentifier	 schema
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
schema	TokenNameIdentifier	 schema
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Train a classifier using the given dataset. * An svm_problem object is created from the dataset. A svm_model is generated * by the svm library. That model is held by the returned Classifier. * * @param dataset Dataset representing all usable training data * @return a SVMClassifier object which wraps the libsvm prediction code */	TokenNameCOMMENT_JAVADOC	 Train a classifier using the given dataset. An svm_problem object is created from the dataset. A svm_model is generated by the svm library. That model is held by the returned Classifier. * @param dataset Dataset representing all usable training data @return a SVMClassifier object which wraps the libsvm prediction code 
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
// train the svm on the dataset 	TokenNameCOMMENT_LINE	train the svm on the dataset 
svm_problem	TokenNameIdentifier	 svm problem
problem	TokenNameIdentifier	 problem
=	TokenNameEQUAL	
SVMUtils	TokenNameIdentifier	 SVM Utils
.	TokenNameDOT	
convertToSVMProblem	TokenNameIdentifier	 convert To SVM Problem
(	TokenNameLPAREN	
dataset	TokenNameIdentifier	 dataset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
svm_model	TokenNameIdentifier	 svm model
model	TokenNameIdentifier	 model
=	TokenNameEQUAL	
svm	TokenNameIdentifier	 svm
.	TokenNameDOT	
svm_train	TokenNameIdentifier	 svm train
(	TokenNameLPAREN	
problem	TokenNameIdentifier	 problem
,	TokenNameCOMMA	
parameters	TokenNameIdentifier	 parameters
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// why do we save a model here when debugging? 	TokenNameCOMMENT_LINE	why do we save a model here when debugging? 
if	TokenNameif	
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
isDebugEnabled	TokenNameIdentifier	 is Debug Enabled
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
svm	TokenNameIdentifier	 svm
.	TokenNameDOT	
svm_save_model	TokenNameIdentifier	 svm save model
(	TokenNameLPAREN	
"./modelTest.mdl"	TokenNameStringLiteral	./modelTest.mdl
,	TokenNameCOMMA	
model	TokenNameIdentifier	 model
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
ioe	TokenNameIdentifier	 ioe
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ioe	TokenNameIdentifier	 ioe
.	TokenNameDOT	
printStackTrace	TokenNameIdentifier	 print Stack Trace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// construct a Classifier out of the svm_model 	TokenNameCOMMENT_LINE	construct a Classifier out of the svm_model 
return	TokenNamereturn	
new	TokenNamenew	
SVMClassifier	TokenNameIdentifier	 SVM Classifier
(	TokenNameLPAREN	
model	TokenNameIdentifier	 model
,	TokenNameCOMMA	
dataset	TokenNameIdentifier	 dataset
.	TokenNameDOT	
getSchema	TokenNameIdentifier	 get Schema
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
dataset	TokenNameIdentifier	 dataset
.	TokenNameDOT	
getFeatureFactory	TokenNameIdentifier	 get Feature Factory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setParameterSVMType	TokenNameIdentifier	 set Parameter SVM Type
(	TokenNameLPAREN	
int	TokenNameint	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
parameters	TokenNameIdentifier	 parameters
.	TokenNameDOT	
svm_type	TokenNameIdentifier	 svm type
=	TokenNameEQUAL	
type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getParameterSVMType	TokenNameIdentifier	 get Parameter SVM Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
parameters	TokenNameIdentifier	 parameters
.	TokenNameDOT	
svm_type	TokenNameIdentifier	 svm type
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
parameterSVMTypeHelp	TokenNameIdentifier	 parameter SVM Type Help
=	TokenNameEQUAL	
"Set the SVM type to use."	TokenNameStringLiteral	Set the SVM type to use.
;	TokenNameSEMICOLON	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getParameterSVMTypeHelp	TokenNameIdentifier	 get Parameter SVM Type Help
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
parameterSVMTypeHelp	TokenNameIdentifier	 parameter SVM Type Help
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setKernelType	TokenNameIdentifier	 set Kernel Type
(	TokenNameLPAREN	
int	TokenNameint	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
parameters	TokenNameIdentifier	 parameters
.	TokenNameDOT	
kernel_type	TokenNameIdentifier	 kernel type
=	TokenNameEQUAL	
type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getKernelType	TokenNameIdentifier	 get Kernel Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
parameters	TokenNameIdentifier	 parameters
.	TokenNameDOT	
kernel_type	TokenNameIdentifier	 kernel type
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
kernelTypeHelp	TokenNameIdentifier	 kernel Type Help
=	TokenNameEQUAL	
"Set the type of kernel function."	TokenNameStringLiteral	Set the type of kernel function.
;	TokenNameSEMICOLON	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getKernelTypeHelp	TokenNameIdentifier	 get Kernel Type Help
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
kernelTypeHelp	TokenNameIdentifier	 kernel Type Help
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setDegree	TokenNameIdentifier	 set Degree
(	TokenNameLPAREN	
int	TokenNameint	
deg	TokenNameIdentifier	 deg
)	TokenNameRPAREN	
{	TokenNameLBRACE	
parameters	TokenNameIdentifier	 parameters
.	TokenNameDOT	
degree	TokenNameIdentifier	 degree
=	TokenNameEQUAL	
deg	TokenNameIdentifier	 deg
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getDegree	TokenNameIdentifier	 get Degree
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
parameters	TokenNameIdentifier	 parameters
.	TokenNameDOT	
degree	TokenNameIdentifier	 degree
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
degreeHelp	TokenNameIdentifier	 degree Help
=	TokenNameEQUAL	
"Set the degree in kernel function."	TokenNameStringLiteral	Set the degree in kernel function.
;	TokenNameSEMICOLON	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getDegreeHelp	TokenNameIdentifier	 get Degree Help
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
degreeHelp	TokenNameIdentifier	 degree Help
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setGamma	TokenNameIdentifier	 set Gamma
(	TokenNameLPAREN	
double	TokenNamedouble	
g	TokenNameIdentifier	 g
)	TokenNameRPAREN	
{	TokenNameLBRACE	
parameters	TokenNameIdentifier	 parameters
.	TokenNameDOT	
gamma	TokenNameIdentifier	 gamma
=	TokenNameEQUAL	
g	TokenNameIdentifier	 g
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
double	TokenNamedouble	
getGamma	TokenNameIdentifier	 get Gamma
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
parameters	TokenNameIdentifier	 parameters
.	TokenNameDOT	
gamma	TokenNameIdentifier	 gamma
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
gammaHelp	TokenNameIdentifier	 gamma Help
=	TokenNameEQUAL	
"Set the gamma in kernel function."	TokenNameStringLiteral	Set the gamma in kernel function.
;	TokenNameSEMICOLON	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getGammaHelp	TokenNameIdentifier	 get Gamma Help
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
gammaHelp	TokenNameIdentifier	 gamma Help
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setCoef0	TokenNameIdentifier	 set Coef0
(	TokenNameLPAREN	
double	TokenNamedouble	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
{	TokenNameLBRACE	
parameters	TokenNameIdentifier	 parameters
.	TokenNameDOT	
coef0	TokenNameIdentifier	 coef0
=	TokenNameEQUAL	
c	TokenNameIdentifier	 c
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
double	TokenNamedouble	
getCoef0	TokenNameIdentifier	 get Coef0
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
parameters	TokenNameIdentifier	 parameters
.	TokenNameDOT	
coef0	TokenNameIdentifier	 coef0
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
coef0Help	TokenNameIdentifier	 coef0 Help
=	TokenNameEQUAL	
"Set the coef0 in kernel function."	TokenNameStringLiteral	Set the coef0 in kernel function.
;	TokenNameSEMICOLON	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getCoef0Help	TokenNameIdentifier	 get Coef0 Help
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
coef0Help	TokenNameIdentifier	 coef0 Help
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setNu	TokenNameIdentifier	 set Nu
(	TokenNameLPAREN	
double	TokenNamedouble	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
{	TokenNameLBRACE	
parameters	TokenNameIdentifier	 parameters
.	TokenNameDOT	
nu	TokenNameIdentifier	 nu
=	TokenNameEQUAL	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
double	TokenNamedouble	
getNu	TokenNameIdentifier	 get Nu
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
parameters	TokenNameIdentifier	 parameters
.	TokenNameDOT	
nu	TokenNameIdentifier	 nu
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
nuHelp	TokenNameIdentifier	 nu Help
=	TokenNameEQUAL	
"Set the parameter nu. (For nu-SVC, one-class SVM, and nu-SVR only)"	TokenNameStringLiteral	Set the parameter nu. (For nu-SVC, one-class SVM, and nu-SVR only)
;	TokenNameSEMICOLON	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getNuHelp	TokenNameIdentifier	 get Nu Help
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
nuHelp	TokenNameIdentifier	 nu Help
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setCacheSize	TokenNameIdentifier	 set Cache Size
(	TokenNameLPAREN	
double	TokenNamedouble	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
{	TokenNameLBRACE	
parameters	TokenNameIdentifier	 parameters
.	TokenNameDOT	
cache_size	TokenNameIdentifier	 cache size
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
double	TokenNamedouble	
getCacheSize	TokenNameIdentifier	 get Cache Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
parameters	TokenNameIdentifier	 parameters
.	TokenNameDOT	
cache_size	TokenNameIdentifier	 cache size
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
cacheSizeHelp	TokenNameIdentifier	 cache Size Help
=	TokenNameEQUAL	
"Set the cache memory size in MB."	TokenNameStringLiteral	Set the cache memory size in MB.
;	TokenNameSEMICOLON	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getCacheSizeHelp	TokenNameIdentifier	 get Cache Size Help
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
cacheSizeHelp	TokenNameIdentifier	 cache Size Help
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setCParameter	TokenNameIdentifier	 set C Parameter
(	TokenNameLPAREN	
double	TokenNamedouble	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
{	TokenNameLBRACE	
parameters	TokenNameIdentifier	 parameters
.	TokenNameDOT	
C	TokenNameIdentifier	 C
=	TokenNameEQUAL	
c	TokenNameIdentifier	 c
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
double	TokenNamedouble	
getCParameter	TokenNameIdentifier	 get C Parameter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
parameters	TokenNameIdentifier	 parameters
.	TokenNameDOT	
C	TokenNameIdentifier	 C
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
cParameterHelp	TokenNameIdentifier	 c Parameter Help
=	TokenNameEQUAL	
"Set the parameter C. (For C-SVC, epsilon-SVR, and nu-SVR only)"	TokenNameStringLiteral	Set the parameter C. (For C-SVC, epsilon-SVR, and nu-SVR only)
;	TokenNameSEMICOLON	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getCParameterHelp	TokenNameIdentifier	 get C Parameter Help
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
cParameterHelp	TokenNameIdentifier	 c Parameter Help
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setStoppingCriteria	TokenNameIdentifier	 set Stopping Criteria
(	TokenNameLPAREN	
double	TokenNamedouble	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
{	TokenNameLBRACE	
parameters	TokenNameIdentifier	 parameters
.	TokenNameDOT	
eps	TokenNameIdentifier	 eps
=	TokenNameEQUAL	
c	TokenNameIdentifier	 c
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
double	TokenNamedouble	
getStoppingCriteria	TokenNameIdentifier	 get Stopping Criteria
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
parameters	TokenNameIdentifier	 parameters
.	TokenNameDOT	
eps	TokenNameIdentifier	 eps
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
stoppingCriteriaHelp	TokenNameIdentifier	 stopping Criteria Help
=	TokenNameEQUAL	
"Set the tolerance of termination criterion."	TokenNameStringLiteral	Set the tolerance of termination criterion.
;	TokenNameSEMICOLON	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getStoppingCriteriaHelp	TokenNameIdentifier	 get Stopping Criteria Help
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
stoppingCriteriaHelp	TokenNameIdentifier	 stopping Criteria Help
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setLossFunctionEpsilon	TokenNameIdentifier	 set Loss Function Epsilon
(	TokenNameLPAREN	
double	TokenNamedouble	
l	TokenNameIdentifier	 l
)	TokenNameRPAREN	
{	TokenNameLBRACE	
parameters	TokenNameIdentifier	 parameters
.	TokenNameDOT	
p	TokenNameIdentifier	 p
=	TokenNameEQUAL	
l	TokenNameIdentifier	 l
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
double	TokenNamedouble	
getLossFunctionEpsilon	TokenNameIdentifier	 get Loss Function Epsilon
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
parameters	TokenNameIdentifier	 parameters
.	TokenNameDOT	
p	TokenNameIdentifier	 p
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
lossFunctionEpsilonHelp	TokenNameIdentifier	 loss Function Epsilon Help
=	TokenNameEQUAL	
"Set the epsilon in the loss function of epsilon-SVR."	TokenNameStringLiteral	Set the epsilon in the loss function of epsilon-SVR.
;	TokenNameSEMICOLON	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getLossFunctionEpsilonHelp	TokenNameIdentifier	 get Loss Function Epsilon Help
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
lossFunctionEpsilonHelp	TokenNameIdentifier	 loss Function Epsilon Help
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setUseShrinkingHeuristics	TokenNameIdentifier	 set Use Shrinking Heuristics
(	TokenNameLPAREN	
boolean	TokenNameboolean	
flag	TokenNameIdentifier	 flag
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
flag	TokenNameIdentifier	 flag
)	TokenNameRPAREN	
{	TokenNameLBRACE	
parameters	TokenNameIdentifier	 parameters
.	TokenNameDOT	
shrinking	TokenNameIdentifier	 shrinking
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
parameters	TokenNameIdentifier	 parameters
.	TokenNameDOT	
shrinking	TokenNameIdentifier	 shrinking
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
getUseShrinkingHeuristics	TokenNameIdentifier	 get Use Shrinking Heuristics
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
parameters	TokenNameIdentifier	 parameters
.	TokenNameDOT	
shrinking	TokenNameIdentifier	 shrinking
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
useShrinkingHeuristicsHelp	TokenNameIdentifier	 use Shrinking Heuristics Help
=	TokenNameEQUAL	
"Whether or not to use shrinking heuristics."	TokenNameStringLiteral	Whether or not to use shrinking heuristics.
;	TokenNameSEMICOLON	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getUseShrinkingHeuristicsHelp	TokenNameIdentifier	 get Use Shrinking Heuristics Help
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
useShrinkingHeuristicsHelp	TokenNameIdentifier	 use Shrinking Heuristics Help
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setCParameterWeight	TokenNameIdentifier	 set C Parameter Weight
(	TokenNameLPAREN	
int	TokenNameint	
w	TokenNameIdentifier	 w
)	TokenNameRPAREN	
{	TokenNameLBRACE	
parameters	TokenNameIdentifier	 parameters
.	TokenNameDOT	
nr_weight	TokenNameIdentifier	 nr weight
=	TokenNameEQUAL	
w	TokenNameIdentifier	 w
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getCParameterWeight	TokenNameIdentifier	 get C Parameter Weight
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
parameters	TokenNameIdentifier	 parameters
.	TokenNameDOT	
nr_weight	TokenNameIdentifier	 nr weight
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
cParameterWeightHelp	TokenNameIdentifier	 c Parameter Weight Help
=	TokenNameEQUAL	
"Set the parameter C of class i to weight*C for C-SVC."	TokenNameStringLiteral	Set the parameter C of class i to weight*C for C-SVC.
;	TokenNameSEMICOLON	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getCParameterWeightHelp	TokenNameIdentifier	 get C Parameter Weight Help
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
cParameterWeightHelp	TokenNameIdentifier	 c Parameter Weight Help
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tell the learner to train a classifier capable of computing probability estimates * for each class. Default to False. Turning this option on will cause the training * to take a longer time. * * @param flag Boolean value telling the learner whether or not to compute probability estimates */	TokenNameCOMMENT_JAVADOC	 Tell the learner to train a classifier capable of computing probability estimates for each class. Default to False. Turning this option on will cause the training to take a longer time. * @param flag Boolean value telling the learner whether or not to compute probability estimates 
public	TokenNamepublic	
void	TokenNamevoid	
setDoProbabilityEstimates	TokenNameIdentifier	 set Do Probability Estimates
(	TokenNameLPAREN	
boolean	TokenNameboolean	
flag	TokenNameIdentifier	 flag
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
flag	TokenNameIdentifier	 flag
)	TokenNameRPAREN	
{	TokenNameLBRACE	
parameters	TokenNameIdentifier	 parameters
.	TokenNameDOT	
probability	TokenNameIdentifier	 probability
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
parameters	TokenNameIdentifier	 parameters
.	TokenNameDOT	
probability	TokenNameIdentifier	 probability
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
getDoProbabilityEstimates	TokenNameIdentifier	 get Do Probability Estimates
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
parameters	TokenNameIdentifier	 parameters
.	TokenNameDOT	
probability	TokenNameIdentifier	 probability
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
doProbabilityEstimatesHelp	TokenNameIdentifier	 do Probability Estimates Help
=	TokenNameEQUAL	
"Whether to train for probability estimates. (For SVC and SVR models only)."	TokenNameStringLiteral	Whether to train for probability estimates. (For SVC and SVR models only).
;	TokenNameSEMICOLON	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getDoProbabilityEstimatesHelp	TokenNameIdentifier	 get Do Probability Estimates Help
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
doProbabilityEstimatesHelp	TokenNameIdentifier	 do Probability Estimates Help
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// C, gamma, kernel_type 	TokenNameCOMMENT_LINE	C, gamma, kernel_type 
/** * Default kernel type is linear * * @param type integer from the svm_parameter class */	TokenNameCOMMENT_JAVADOC	 Default kernel type is linear * @param type integer from the svm_parameter class 
public	TokenNamepublic	
void	TokenNamevoid	
setParameterKernelType	TokenNameIdentifier	 set Parameter Kernel Type
(	TokenNameLPAREN	
int	TokenNameint	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
parameters	TokenNameIdentifier	 parameters
.	TokenNameDOT	
kernel_type	TokenNameIdentifier	 kernel type
=	TokenNameEQUAL	
type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The default for Gamma is 0, which works for a linear kernel, but not for * other types of kernels * * @param gamma double to be used as the gamma parameter. Default is 0 */	TokenNameCOMMENT_JAVADOC	 The default for Gamma is 0, which works for a linear kernel, but not for other types of kernels * @param gamma double to be used as the gamma parameter. Default is 0 
public	TokenNamepublic	
void	TokenNamevoid	
setParameterGamma	TokenNameIdentifier	 set Parameter Gamma
(	TokenNameLPAREN	
double	TokenNamedouble	
gamma	TokenNameIdentifier	 gamma
)	TokenNameRPAREN	
{	TokenNameLBRACE	
parameters	TokenNameIdentifier	 parameters
.	TokenNameDOT	
gamma	TokenNameIdentifier	 gamma
=	TokenNameEQUAL	
gamma	TokenNameIdentifier	 gamma
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @param c double to be used as the C parameter. Default is 1 */	TokenNameCOMMENT_JAVADOC	 @param c double to be used as the C parameter. Default is 1 
public	TokenNamepublic	
void	TokenNamevoid	
setParameterC	TokenNameIdentifier	 set Parameter C
(	TokenNameLPAREN	
double	TokenNamedouble	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
{	TokenNameLBRACE	
parameters	TokenNameIdentifier	 parameters
.	TokenNameDOT	
C	TokenNameIdentifier	 C
=	TokenNameEQUAL	
c	TokenNameIdentifier	 c
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
