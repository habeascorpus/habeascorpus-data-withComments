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
Serializable	TokenNameIdentifier	 Serializable
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
swing	TokenNameIdentifier	 swing
.	TokenNameDOT	
JComponent	TokenNameIdentifier	 J Component
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
svm_node	TokenNameIdentifier	 svm node
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
Explanation	TokenNameIdentifier	 Explanation
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
FeatureFactory	TokenNameIdentifier	 Feature Factory
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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
gui	TokenNameIdentifier	 gui
.	TokenNameDOT	
ComponentViewer	TokenNameIdentifier	 Component Viewer
;	TokenNameSEMICOLON	
import	TokenNameimport	
edu	TokenNameIdentifier	 edu
.	TokenNameDOT	
cmu	TokenNameIdentifier	 cmu
.	TokenNameDOT	
minorthird	TokenNameIdentifier	 minorthird
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
gui	TokenNameIdentifier	 gui
.	TokenNameDOT	
Viewer	TokenNameIdentifier	 Viewer
;	TokenNameSEMICOLON	
import	TokenNameimport	
edu	TokenNameIdentifier	 edu
.	TokenNameDOT	
cmu	TokenNameIdentifier	 cmu
.	TokenNameDOT	
minorthird	TokenNameIdentifier	 minorthird
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
gui	TokenNameIdentifier	 gui
.	TokenNameDOT	
Visible	TokenNameIdentifier	 Visible
;	TokenNameSEMICOLON	
/** * SVMClassifier wrapps the prediction code from the libsvm library for binary or multi-class problems. * A SVMClassifier must be built from a model, using the svm_model class from libsvm. * This is best done by running the learner. <br> * <br> * Note that due to the way libsvm computes probabilities you may get different * predictions for the same instance if you turn on probabilities compared to * when you leave it turned off. See the libsvm home page for more details. * * @author qcm, Frank Lin */	TokenNameCOMMENT_JAVADOC	 SVMClassifier wrapps the prediction code from the libsvm library for binary or multi-class problems. A SVMClassifier must be built from a model, using the svm_model class from libsvm. This is best done by running the learner. <br> <br> Note that due to the way libsvm computes probabilities you may get different predictions for the same instance if you turn on probabilities compared to when you leave it turned off. See the libsvm home page for more details. * @author qcm, Frank Lin 
public	TokenNamepublic	
class	TokenNameclass	
SVMClassifier	TokenNameIdentifier	 SVM Classifier
implements	TokenNameimplements	
Classifier	TokenNameIdentifier	 Classifier
,	TokenNameCOMMA	
Serializable	TokenNameIdentifier	 Serializable
,	TokenNameCOMMA	
Visible	TokenNameIdentifier	 Visible
{	TokenNameLBRACE	
// private static Logger log=Logger.getLogger(SVMClassifier.class); 	TokenNameCOMMENT_LINE	private static Logger log=Logger.getLogger(SVMClassifier.class); 
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
20071130L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
svm_model	TokenNameIdentifier	 svm model
model	TokenNameIdentifier	 model
;	TokenNameSEMICOLON	
private	TokenNameprivate	
ExampleSchema	TokenNameIdentifier	 Example Schema
schema	TokenNameIdentifier	 schema
;	TokenNameSEMICOLON	
private	TokenNameprivate	
FeatureFactory	TokenNameIdentifier	 Feature Factory
featureFactory	TokenNameIdentifier	 feature Factory
;	TokenNameSEMICOLON	
//this is a hack for displaying explanations 	TokenNameCOMMENT_LINE	this is a hack for displaying explanations 
private	TokenNameprivate	
VisibleSVM	TokenNameIdentifier	 Visible SVM
vSVM	TokenNameIdentifier	 v SVM
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
SVMClassifier	TokenNameIdentifier	 SVM Classifier
(	TokenNameLPAREN	
svm_model	TokenNameIdentifier	 svm model
model	TokenNameIdentifier	 model
,	TokenNameCOMMA	
ExampleSchema	TokenNameIdentifier	 Example Schema
schema	TokenNameIdentifier	 schema
,	TokenNameCOMMA	
FeatureFactory	TokenNameIdentifier	 Feature Factory
featureFactory	TokenNameIdentifier	 feature Factory
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
model	TokenNameIdentifier	 model
=	TokenNameEQUAL	
model	TokenNameIdentifier	 model
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
schema	TokenNameIdentifier	 schema
=	TokenNameEQUAL	
schema	TokenNameIdentifier	 schema
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
featureFactory	TokenNameIdentifier	 feature Factory
=	TokenNameEQUAL	
featureFactory	TokenNameIdentifier	 feature Factory
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
String	TokenNameIdentifier	 String
explain	TokenNameIdentifier	 explain
(	TokenNameLPAREN	
Instance	TokenNameIdentifier	 Instance
instance	TokenNameIdentifier	 instance
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
vSVM	TokenNameIdentifier	 v SVM
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
vSVM	TokenNameIdentifier	 v SVM
=	TokenNameEQUAL	
new	TokenNamenew	
VisibleSVM	TokenNameIdentifier	 Visible SVM
(	TokenNameLPAREN	
model	TokenNameIdentifier	 model
,	TokenNameCOMMA	
featureFactory	TokenNameIdentifier	 feature Factory
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
numHyperplanes	TokenNameIdentifier	 num Hyperplanes
=	TokenNameEQUAL	
schema	TokenNameIdentifier	 schema
.	TokenNameDOT	
getNumberOfClasses	TokenNameIdentifier	 get Number Of Classes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
StringBuilder	TokenNameIdentifier	 String Builder
b	TokenNameIdentifier	 b
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuilder	TokenNameIdentifier	 String Builder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
numHyperplanes	TokenNameIdentifier	 num Hyperplanes
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"Hyperplane "	TokenNameStringLiteral	Hyperplane 
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
":"	TokenNameStringLiteral	:
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
vSVM	TokenNameIdentifier	 v SVM
.	TokenNameDOT	
getHyperplane	TokenNameIdentifier	 get Hyperplane
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
.	TokenNameDOT	
explain	TokenNameIdentifier	 explain
(	TokenNameLPAREN	
instance	TokenNameIdentifier	 instance
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
Explanation	TokenNameIdentifier	 Explanation
getExplanation	TokenNameIdentifier	 get Explanation
(	TokenNameLPAREN	
Instance	TokenNameIdentifier	 Instance
instance	TokenNameIdentifier	 instance
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
vSVM	TokenNameIdentifier	 v SVM
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
vSVM	TokenNameIdentifier	 v SVM
=	TokenNameEQUAL	
new	TokenNamenew	
VisibleSVM	TokenNameIdentifier	 Visible SVM
(	TokenNameLPAREN	
model	TokenNameIdentifier	 model
,	TokenNameCOMMA	
featureFactory	TokenNameIdentifier	 feature Factory
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
numHyperplanes	TokenNameIdentifier	 num Hyperplanes
=	TokenNameEQUAL	
schema	TokenNameIdentifier	 schema
.	TokenNameDOT	
getNumberOfClasses	TokenNameIdentifier	 get Number Of Classes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
Explanation	TokenNameIdentifier	 Explanation
.	TokenNameDOT	
Node	TokenNameIdentifier	 Node
top	TokenNameIdentifier	 top
=	TokenNameEQUAL	
new	TokenNamenew	
Explanation	TokenNameIdentifier	 Explanation
.	TokenNameDOT	
Node	TokenNameIdentifier	 Node
(	TokenNameLPAREN	
"Hyperplanes"	TokenNameStringLiteral	Hyperplanes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
numHyperplanes	TokenNameIdentifier	 num Hyperplanes
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Explanation	TokenNameIdentifier	 Explanation
ex	TokenNameIdentifier	 ex
=	TokenNameEQUAL	
vSVM	TokenNameIdentifier	 v SVM
.	TokenNameDOT	
getHyperplane	TokenNameIdentifier	 get Hyperplane
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
.	TokenNameDOT	
getExplanation	TokenNameIdentifier	 get Explanation
(	TokenNameLPAREN	
instance	TokenNameIdentifier	 instance
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ex	TokenNameIdentifier	 ex
.	TokenNameDOT	
getTopNode	TokenNameIdentifier	 get Top Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setUserObject	TokenNameIdentifier	 set User Object
(	TokenNameLPAREN	
"Hyperplane "	TokenNameStringLiteral	Hyperplane 
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
top	TokenNameIdentifier	 top
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
ex	TokenNameIdentifier	 ex
.	TokenNameDOT	
getTopNode	TokenNameIdentifier	 get Top Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
new	TokenNamenew	
Explanation	TokenNameIdentifier	 Explanation
(	TokenNameLPAREN	
top	TokenNameIdentifier	 top
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
svm_model	TokenNameIdentifier	 svm model
getSVMModel	TokenNameIdentifier	 get SVM Model
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
model	TokenNameIdentifier	 model
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
public	TokenNamepublic	
FeatureFactory	TokenNameIdentifier	 Feature Factory
getFeatureFactory	TokenNameIdentifier	 get Feature Factory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
featureFactory	TokenNameIdentifier	 feature Factory
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
// make sure to compress the instance first, otherwise things go to crap 	TokenNameCOMMENT_LINE	make sure to compress the instance first, otherwise things go to crap 
instance	TokenNameIdentifier	 instance
=	TokenNameEQUAL	
featureFactory	TokenNameIdentifier	 feature Factory
.	TokenNameDOT	
compress	TokenNameIdentifier	 compress
(	TokenNameLPAREN	
instance	TokenNameIdentifier	 instance
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// convert compressed instance to node array 	TokenNameCOMMENT_LINE	convert compressed instance to node array 
svm_node	TokenNameIdentifier	 svm node
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
nodeArray	TokenNameIdentifier	 node Array
=	TokenNameEQUAL	
SVMUtils	TokenNameIdentifier	 SVM Utils
.	TokenNameDOT	
instanceToNodeArray	TokenNameIdentifier	 instance To Node Array
(	TokenNameLPAREN	
instance	TokenNameIdentifier	 instance
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
prediction	TokenNameIdentifier	 prediction
;	TokenNameSEMICOLON	
ClassLabel	TokenNameIdentifier	 Class Label
label	TokenNameIdentifier	 label
=	TokenNameEQUAL	
new	TokenNamenew	
ClassLabel	TokenNameIdentifier	 Class Label
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
svm	TokenNameIdentifier	 svm
.	TokenNameDOT	
svm_check_probability_model	TokenNameIdentifier	 svm check probability model
(	TokenNameLPAREN	
model	TokenNameIdentifier	 model
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
/* If the model is set to calcualte probabilities then create an array * to store them and call the appropriate prediction method. */	TokenNameCOMMENT_BLOCK	 If the model is set to calcualte probabilities then create an array to store them and call the appropriate prediction method. 
if	TokenNameif	
(	TokenNameLPAREN	
schema	TokenNameIdentifier	 schema
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
(	TokenNameLPAREN	
ExampleSchema	TokenNameIdentifier	 Example Schema
.	TokenNameDOT	
BINARY_EXAMPLE_SCHEMA	TokenNameIdentifier	 BINARY  EXAMPLE  SCHEMA
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
/* For the binary case, definitely more complicated than it needs to be; * create an array of doubles of length 2 (because this is a binary classifier) * and use the predict_probability method which returns that class and fills in * the probability array passed in. */	TokenNameCOMMENT_BLOCK	 For the binary case, definitely more complicated than it needs to be; create an array of doubles of length 2 (because this is a binary classifier) and use the predict_probability method which returns that class and fills in the probability array passed in. 
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
probs	TokenNameIdentifier	 probs
=	TokenNameEQUAL	
new	TokenNamenew	
double	TokenNamedouble	
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
prediction	TokenNameIdentifier	 prediction
=	TokenNameEQUAL	
svm	TokenNameIdentifier	 svm
.	TokenNameDOT	
svm_predict_probability	TokenNameIdentifier	 svm predict probability
(	TokenNameLPAREN	
model	TokenNameIdentifier	 model
,	TokenNameCOMMA	
nodeArray	TokenNameIdentifier	 node Array
,	TokenNameCOMMA	
probs	TokenNameIdentifier	 probs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/* We want to return the probability estimates embedded in the prediction. The actual * value will go into the ClassLabel as the labels weight and since this is a binary * classifier the probability estimate of the other class is 1 - |prediction|. * Also, the svm_predict_* methods return 1 or -1 for the binary case, but we need the * probability of the prediction (given in the prob[]), then we need to convert this * probability into logits (logit = p/1-p). Finally we need to multiply by the * prediction (1 or -1) to embedd the predicted class into the weight. */	TokenNameCOMMENT_BLOCK	 We want to return the probability estimates embedded in the prediction. The actual value will go into the ClassLabel as the labels weight and since this is a binary classifier the probability estimate of the other class is 1 - |prediction|. Also, the svm_predict_* methods return 1 or -1 for the binary case, but we need the probability of the prediction (given in the prob[]), then we need to convert this probability into logits (logit = p/1-p). Finally we need to multiply by the prediction (1 or -1) to embedd the predicted class into the weight. 
if	TokenNameif	
(	TokenNameLPAREN	
probs	TokenNameIdentifier	 probs
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
>	TokenNameGREATER	
probs	TokenNameIdentifier	 probs
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
prediction	TokenNameIdentifier	 prediction
=	TokenNameEQUAL	
prediction	TokenNameIdentifier	 prediction
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
probs	TokenNameIdentifier	 probs
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
/	TokenNameDIVIDE	
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
-	TokenNameMINUS	
probs	TokenNameIdentifier	 probs
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
prediction	TokenNameIdentifier	 prediction
=	TokenNameEQUAL	
prediction	TokenNameIdentifier	 prediction
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
probs	TokenNameIdentifier	 probs
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
/	TokenNameDIVIDE	
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
-	TokenNameMINUS	
probs	TokenNameIdentifier	 probs
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* Score results in label */	TokenNameCOMMENT_BLOCK	 Score results in label 
if	TokenNameif	
(	TokenNameLPAREN	
prediction	TokenNameIdentifier	 prediction
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
label	TokenNameIdentifier	 label
=	TokenNameEQUAL	
ClassLabel	TokenNameIdentifier	 Class Label
.	TokenNameDOT	
positiveLabel	TokenNameIdentifier	 positive Label
(	TokenNameLPAREN	
prediction	TokenNameIdentifier	 prediction
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
label	TokenNameIdentifier	 label
=	TokenNameEQUAL	
ClassLabel	TokenNameIdentifier	 Class Label
.	TokenNameDOT	
negativeLabel	TokenNameIdentifier	 negative Label
(	TokenNameLPAREN	
prediction	TokenNameIdentifier	 prediction
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// For the multi-class case 	TokenNameCOMMENT_LINE	For the multi-class case 
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
probs	TokenNameIdentifier	 probs
=	TokenNameEQUAL	
new	TokenNamenew	
double	TokenNamedouble	
[	TokenNameLBRACKET	
svm	TokenNameIdentifier	 svm
.	TokenNameDOT	
svm_get_nr_class	TokenNameIdentifier	 svm get nr class
(	TokenNameLPAREN	
model	TokenNameIdentifier	 model
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
svm	TokenNameIdentifier	 svm
.	TokenNameDOT	
svm_predict_probability	TokenNameIdentifier	 svm predict probability
(	TokenNameLPAREN	
model	TokenNameIdentifier	 model
,	TokenNameCOMMA	
nodeArray	TokenNameIdentifier	 node Array
,	TokenNameCOMMA	
probs	TokenNameIdentifier	 probs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// get the labels 	TokenNameCOMMENT_LINE	get the labels 
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
labels	TokenNameIdentifier	 labels
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
svm	TokenNameIdentifier	 svm
.	TokenNameDOT	
svm_get_nr_class	TokenNameIdentifier	 svm get nr class
(	TokenNameLPAREN	
model	TokenNameIdentifier	 model
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
svm	TokenNameIdentifier	 svm
.	TokenNameDOT	
svm_get_labels	TokenNameIdentifier	 svm get labels
(	TokenNameLPAREN	
model	TokenNameIdentifier	 model
,	TokenNameCOMMA	
labels	TokenNameIdentifier	 labels
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// update ClassLabel object with labels and probabilities. 	TokenNameCOMMENT_LINE	update ClassLabel object with labels and probabilities. 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
labels	TokenNameIdentifier	 labels
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// wanted to use log-odds as specified in ClassLabel, but test code doesn't like it - frank 	TokenNameCOMMENT_LINE	wanted to use log-odds as specified in ClassLabel, but test code doesn't like it - frank 
// double logOdds=Math.log(probs[i]/(1.0-probs[i])); 	TokenNameCOMMENT_LINE	double logOdds=Math.log(probs[i]/(1.0-probs[i])); 
double	TokenNamedouble	
logOdds	TokenNameIdentifier	 log Odds
=	TokenNameEQUAL	
probs	TokenNameIdentifier	 probs
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
label	TokenNameIdentifier	 label
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
schema	TokenNameIdentifier	 schema
.	TokenNameDOT	
getClassName	TokenNameIdentifier	 get Class Name
(	TokenNameLPAREN	
labels	TokenNameIdentifier	 labels
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
logOdds	TokenNameIdentifier	 log Odds
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
/* Otherwise just call the predict method, which simply returns the class. * This method is faster than predict_probability. */	TokenNameCOMMENT_BLOCK	 Otherwise just call the predict method, which simply returns the class. This method is faster than predict_probability. 
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
predValues	TokenNameIdentifier	 pred Values
=	TokenNameEQUAL	
new	TokenNamenew	
double	TokenNamedouble	
[	TokenNameLBRACKET	
schema	TokenNameIdentifier	 schema
.	TokenNameDOT	
getNumberOfClasses	TokenNameIdentifier	 get Number Of Classes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
prediction	TokenNameIdentifier	 prediction
=	TokenNameEQUAL	
svm	TokenNameIdentifier	 svm
.	TokenNameDOT	
svm_predict_values	TokenNameIdentifier	 svm predict values
(	TokenNameLPAREN	
model	TokenNameIdentifier	 model
,	TokenNameCOMMA	
nodeArray	TokenNameIdentifier	 node Array
,	TokenNameCOMMA	
predValues	TokenNameIdentifier	 pred Values
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// log.info("==="); 	TokenNameCOMMENT_LINE	log.info("==="); 
// log.info("svm labels: "+Arrays.toString(model.label)); 	TokenNameCOMMENT_LINE	log.info("svm labels: "+Arrays.toString(model.label)); 
// log.info("svm pred val: "+Arrays.toString(predValues)); 	TokenNameCOMMENT_LINE	log.info("svm pred val: "+Arrays.toString(predValues)); 
if	TokenNameif	
(	TokenNameLPAREN	
schema	TokenNameIdentifier	 schema
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
ExampleSchema	TokenNameIdentifier	 Example Schema
.	TokenNameDOT	
BINARY_EXAMPLE_SCHEMA	TokenNameIdentifier	 BINARY  EXAMPLE  SCHEMA
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
double	TokenNamedouble	
diff	TokenNameIdentifier	 diff
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
max	TokenNameIdentifier	 max
(	TokenNameLPAREN	
predValues	TokenNameIdentifier	 pred Values
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
predValues	TokenNameIdentifier	 pred Values
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
-	TokenNameMINUS	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
min	TokenNameIdentifier	 min
(	TokenNameLPAREN	
predValues	TokenNameIdentifier	 pred Values
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
predValues	TokenNameIdentifier	 pred Values
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
prediction	TokenNameIdentifier	 prediction
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
label	TokenNameIdentifier	 label
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
ExampleSchema	TokenNameIdentifier	 Example Schema
.	TokenNameDOT	
NEG_CLASS_NAME	TokenNameIdentifier	 NEG  CLASS  NAME
,	TokenNameCOMMA	
diff	TokenNameIdentifier	 diff
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
label	TokenNameIdentifier	 label
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
ExampleSchema	TokenNameIdentifier	 Example Schema
.	TokenNameDOT	
POS_CLASS_NAME	TokenNameIdentifier	 POS  CLASS  NAME
,	TokenNameCOMMA	
diff	TokenNameIdentifier	 diff
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// log.info("svm pred dist: "+label.bestWeight()); 	TokenNameCOMMENT_LINE	log.info("svm pred dist: "+label.bestWeight()); 
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
label	TokenNameIdentifier	 label
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
schema	TokenNameIdentifier	 schema
.	TokenNameDOT	
getClassName	TokenNameIdentifier	 get Class Name
(	TokenNameLPAREN	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
prediction	TokenNameIdentifier	 prediction
)	TokenNameRPAREN	
,	TokenNameCOMMA	
predValues	TokenNameIdentifier	 pred Values
[	TokenNameLBRACKET	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
prediction	TokenNameIdentifier	 prediction
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// log.info(label); 	TokenNameCOMMENT_LINE	log.info(label); 
}	TokenNameRBRACE	
return	TokenNamereturn	
label	TokenNameIdentifier	 label
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * GUI stuff */	TokenNameCOMMENT_JAVADOC	 GUI stuff 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
Viewer	TokenNameIdentifier	 Viewer
toGUI	TokenNameIdentifier	 to GUI
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
SVMViewer	TokenNameIdentifier	 SVM Viewer
svmViewer	TokenNameIdentifier	 svm Viewer
=	TokenNameEQUAL	
new	TokenNamenew	
SVMViewer	TokenNameIdentifier	 SVM Viewer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
svmViewer	TokenNameIdentifier	 svm Viewer
.	TokenNameDOT	
setContent	TokenNameIdentifier	 set Content
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
svmViewer	TokenNameIdentifier	 svm Viewer
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
class	TokenNameclass	
SVMViewer	TokenNameIdentifier	 SVM Viewer
extends	TokenNameextends	
ComponentViewer	TokenNameIdentifier	 Component Viewer
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
20071130L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
boolean	TokenNameboolean	
canReceive	TokenNameIdentifier	 can Receive
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
o	TokenNameIdentifier	 o
instanceof	TokenNameinstanceof	
SVMClassifier	TokenNameIdentifier	 SVM Classifier
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
JComponent	TokenNameIdentifier	 J Component
componentFor	TokenNameIdentifier	 component For
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
SVMClassifier	TokenNameIdentifier	 SVM Classifier
svmClassifier	TokenNameIdentifier	 svm Classifier
=	TokenNameEQUAL	
(	TokenNameLPAREN	
SVMClassifier	TokenNameIdentifier	 SVM Classifier
)	TokenNameRPAREN	
o	TokenNameIdentifier	 o
;	TokenNameSEMICOLON	
// transform to visible SVM 	TokenNameCOMMENT_LINE	transform to visible SVM 
VisibleSVM	TokenNameIdentifier	 Visible SVM
vsSVMtemp	TokenNameIdentifier	 vs SV Mtemp
=	TokenNameEQUAL	
new	TokenNamenew	
VisibleSVM	TokenNameIdentifier	 Visible SVM
(	TokenNameLPAREN	
svmClassifier	TokenNameIdentifier	 svm Classifier
.	TokenNameDOT	
getSVMModel	TokenNameIdentifier	 get SVM Model
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
svmClassifier	TokenNameIdentifier	 svm Classifier
.	TokenNameDOT	
getFeatureFactory	TokenNameIdentifier	 get Feature Factory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
vsSVMtemp	TokenNameIdentifier	 vs SV Mtemp
.	TokenNameDOT	
toGUI	TokenNameIdentifier	 to GUI
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
