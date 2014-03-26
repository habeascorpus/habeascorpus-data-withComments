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
linear	TokenNameIdentifier	 linear
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
BatchBinaryClassifierLearner	TokenNameIdentifier	 Batch Binary Classifier Learner
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
Feature	TokenNameIdentifier	 Feature
;	TokenNameSEMICOLON	
/** * Naive Bayes Poisson Classifier. * * @author Edoardo Airoldi */	TokenNameCOMMENT_JAVADOC	 Naive Bayes Poisson Classifier. * @author Edoardo Airoldi 
/* * classify with maximum value of of Pr(class|instance) * * Pr(class|instance) = Pr(instance|class)*Pr(class) * = log Pr(instance|class)*Pr(class) * = log prod_f Pr(f|class)*Pr(class) * = sum_f log Pr(f|class) + log Pr(class) * * score is log odds = log( Pr(+|instance) / Pr(-|instance) ) * = sum_f log [Pr(f|+)-Pr(f|-)] + log Pr(+) - log Pr(-i) * = sum_f { -mu(+) +mu(-) + f_counts * [ log mu(+) - log mu(-) ] } + log Pr(+) - log Pr(-) * * where: * f_counts = {counts for feature f over all the examples} * f_in_ex(.) = {counts for feature f in example ex of class .} * MLE for mu(.) = [ sum_ex(.) f_in_ex(.) ] / [ sum_ex(.) sum_f f_in_ex(.) ] */	TokenNameCOMMENT_BLOCK	 classify with maximum value of of Pr(class|instance) * Pr(class|instance) = Pr(instance|class)*Pr(class) = log Pr(instance|class)*Pr(class) = log prod_f Pr(f|class)*Pr(class) = sum_f log Pr(f|class) + log Pr(class) * score is log odds = log( Pr(+|instance) / Pr(-|instance) ) = sum_f log [Pr(f|+)-Pr(f|-)] + log Pr(+) - log Pr(-i) = sum_f { -mu(+) +mu(-) + f_counts [ log mu(+) - log mu(-) ] } + log Pr(+) - log Pr(-) * where: f_counts = {counts for feature f over all the examples} f_in_ex(.) = {counts for feature f in example ex of class .} MLE for mu(.) = [ sum_ex(.) f_in_ex(.) ] / [ sum_ex(.) sum_f f_in_ex(.) ] 
public	TokenNamepublic	
class	TokenNameclass	
PoissonLearner	TokenNameIdentifier	 Poisson Learner
extends	TokenNameextends	
BatchBinaryClassifierLearner	TokenNameIdentifier	 Batch Binary Classifier Learner
{	TokenNameLBRACE	
// static private Logger log = Logger.getLogger(PoissonLearner.class); 	TokenNameCOMMENT_LINE	static private Logger log = Logger.getLogger(PoissonLearner.class); 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
boolean	TokenNameboolean	
LOG	TokenNameIdentifier	 LOG
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
double	TokenNamedouble	
SCALE	TokenNameIdentifier	 SCALE
;	TokenNameSEMICOLON	
public	TokenNamepublic	
PoissonLearner	TokenNameIdentifier	 Poisson Learner
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
SCALE	TokenNameIdentifier	 SCALE
=	TokenNameEQUAL	
10.0	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
PoissonLearner	TokenNameIdentifier	 Poisson Learner
(	TokenNameLPAREN	
double	TokenNamedouble	
scale	TokenNameIdentifier	 scale
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
SCALE	TokenNameIdentifier	 SCALE
=	TokenNameEQUAL	
scale	TokenNameIdentifier	 scale
;	TokenNameSEMICOLON	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
Classifier	TokenNameIdentifier	 Classifier
batchTrain	TokenNameIdentifier	 batch Train
(	TokenNameLPAREN	
Dataset	TokenNameIdentifier	 Dataset
data	TokenNameIdentifier	 data
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// temp-filter 	TokenNameCOMMENT_LINE	temp-filter 
//int featureToKeep = 1000; String model = "document"; // or "word" 	TokenNameCOMMENT_LINE	int featureToKeep = 1000; String model = "document"; // or "word" 
//System.out.println("Filter Features with Info-Gain"); 	TokenNameCOMMENT_LINE	System.out.println("Filter Features with Info-Gain"); 
//InfoGainTransformLearner filter = new InfoGainTransformLearner( model ); 	TokenNameCOMMENT_LINE	InfoGainTransformLearner filter = new InfoGainTransformLearner( model ); 
//InfoGainInstanceTransform infoGain = (InfoGainInstanceTransform)filter.batchTrain( data ); 	TokenNameCOMMENT_LINE	InfoGainInstanceTransform infoGain = (InfoGainInstanceTransform)filter.batchTrain( data ); 
//infoGain.setNumberOfFeatures( featureToKeep ); 	TokenNameCOMMENT_LINE	infoGain.setNumberOfFeatures( featureToKeep ); 
//data = infoGain.transform( data ); 	TokenNameCOMMENT_LINE	data = infoGain.transform( data ); 
//System.out.println("in batchTrain"); 	TokenNameCOMMENT_LINE	System.out.println("in batchTrain"); 
BasicFeatureIndex	TokenNameIdentifier	 Basic Feature Index
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
new	TokenNamenew	
BasicFeatureIndex	TokenNameIdentifier	 Basic Feature Index
(	TokenNameLPAREN	
data	TokenNameIdentifier	 data
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//System.out.println( "Dataset:\n # examples = "+data.size() ); 	TokenNameCOMMENT_LINE	System.out.println( "Dataset:\n # examples = "+data.size() ); 
//System.out.println( " # features = "+index.numberOfFeatures() ); 	TokenNameCOMMENT_LINE	System.out.println( " # features = "+index.numberOfFeatures() ); 
PoissonClassifier	TokenNameIdentifier	 Poisson Classifier
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
new	TokenNamenew	
PoissonClassifier	TokenNameIdentifier	 Poisson Classifier
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
setScale	TokenNameIdentifier	 set Scale
(	TokenNameLPAREN	
SCALE	TokenNameIdentifier	 SCALE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
numPos	TokenNameIdentifier	 num Pos
=	TokenNameEQUAL	
0.0	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
numNeg	TokenNameIdentifier	 num Neg
=	TokenNameEQUAL	
0.0	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Feature	TokenNameIdentifier	 Feature
>	TokenNameGREATER	
floo	TokenNameIdentifier	 floo
=	TokenNameEQUAL	
index	TokenNameIdentifier	 index
.	TokenNameDOT	
featureIterator	TokenNameIdentifier	 feature Iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
floo	TokenNameIdentifier	 floo
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
floo	TokenNameIdentifier	 floo
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
boolean	TokenNameboolean	
isPos	TokenNameIdentifier	 is Pos
=	TokenNameEQUAL	
ex	TokenNameIdentifier	 ex
.	TokenNameDOT	
getLabel	TokenNameIdentifier	 get Label
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
isPositive	TokenNameIdentifier	 is Positive
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
isPos	TokenNameIdentifier	 is Pos
)	TokenNameRPAREN	
numPos	TokenNameIdentifier	 num Pos
+=	TokenNamePLUS_EQUAL	
ex	TokenNameIdentifier	 ex
.	TokenNameDOT	
getWeight	TokenNameIdentifier	 get Weight
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
numNeg	TokenNameIdentifier	 num Neg
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
//System.out.println("n.Pos="+numPos+" n.Neg="+numNeg); 	TokenNameCOMMENT_LINE	System.out.println("n.Pos="+numPos+" n.Neg="+numNeg); 
double	TokenNamedouble	
featurePrior	TokenNameIdentifier	 feature Prior
=	TokenNameEQUAL	
1.0	TokenNameDoubleLiteral	
/	TokenNameDIVIDE	
index	TokenNameIdentifier	 index
.	TokenNameDOT	
numberOfFeatures	TokenNameIdentifier	 number Of Features
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//System.out.println("size=" + index.numberOfFeatures() + " prior=" +featurePrior); 	TokenNameCOMMENT_LINE	System.out.println("size=" + index.numberOfFeatures() + " prior=" +featurePrior); 
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
double	TokenNamedouble	
ngp	TokenNameIdentifier	 ngp
=	TokenNameEQUAL	
index	TokenNameIdentifier	 index
.	TokenNameDOT	
getCounts	TokenNameIdentifier	 get Counts
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
,	TokenNameCOMMA	
"POS"	TokenNameStringLiteral	POS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
ngn	TokenNameIdentifier	 ngn
=	TokenNameEQUAL	
index	TokenNameIdentifier	 index
.	TokenNameDOT	
getCounts	TokenNameIdentifier	 get Counts
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
,	TokenNameCOMMA	
"NEG"	TokenNameStringLiteral	NEG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//System.out.println("feature="+f+" n|Pos="+ngp+" n|Neg="+ngn); 	TokenNameCOMMENT_LINE	System.out.println("feature="+f+" n|Pos="+ngp+" n|Neg="+ngn); 
//System.out.println(c.getScale()); 	TokenNameCOMMENT_LINE	System.out.println(c.getScale()); 
double	TokenNamedouble	
pweight	TokenNameIdentifier	 pweight
=	TokenNameEQUAL	
estimatedProb	TokenNameIdentifier	 estimated Prob
(	TokenNameLPAREN	
ngp	TokenNameIdentifier	 ngp
,	TokenNameCOMMA	
numPos	TokenNameIdentifier	 num Pos
/	TokenNameDIVIDE	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
getScale	TokenNameIdentifier	 get Scale
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
featurePrior	TokenNameIdentifier	 feature Prior
,	TokenNameCOMMA	
1.0	TokenNameDoubleLiteral	
/	TokenNameDIVIDE	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
getScale	TokenNameIdentifier	 get Scale
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
nweight	TokenNameIdentifier	 nweight
=	TokenNameEQUAL	
estimatedProb	TokenNameIdentifier	 estimated Prob
(	TokenNameLPAREN	
ngn	TokenNameIdentifier	 ngn
,	TokenNameCOMMA	
numNeg	TokenNameIdentifier	 num Neg
/	TokenNameDIVIDE	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
getScale	TokenNameIdentifier	 get Scale
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
featurePrior	TokenNameIdentifier	 feature Prior
,	TokenNameCOMMA	
1.0	TokenNameDoubleLiteral	
/	TokenNameDIVIDE	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
getScale	TokenNameIdentifier	 get Scale
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//System.out.println("w|Pos="+pweight+" w|Neg="+nweight); 	TokenNameCOMMENT_LINE	System.out.println("w|Pos="+pweight+" w|Neg="+nweight); 
c	TokenNameIdentifier	 c
.	TokenNameDOT	
increment	TokenNameIdentifier	 increment
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
,	TokenNameCOMMA	
-	TokenNameMINUS	
pweight	TokenNameIdentifier	 pweight
+	TokenNamePLUS	
nweight	TokenNameIdentifier	 nweight
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pweight	TokenNameIdentifier	 pweight
=	TokenNameEQUAL	
estimatedProb	TokenNameIdentifier	 estimated Prob
(	TokenNameLPAREN	
ngp	TokenNameIdentifier	 ngp
,	TokenNameCOMMA	
numPos	TokenNameIdentifier	 num Pos
/	TokenNameDIVIDE	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
getScale	TokenNameIdentifier	 get Scale
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
featurePrior	TokenNameIdentifier	 feature Prior
,	TokenNameCOMMA	
1.0	TokenNameDoubleLiteral	
/	TokenNameDIVIDE	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
getScale	TokenNameIdentifier	 get Scale
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
LOG	TokenNameIdentifier	 LOG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
nweight	TokenNameIdentifier	 nweight
=	TokenNameEQUAL	
estimatedProb	TokenNameIdentifier	 estimated Prob
(	TokenNameLPAREN	
ngn	TokenNameIdentifier	 ngn
,	TokenNameCOMMA	
numNeg	TokenNameIdentifier	 num Neg
/	TokenNameDIVIDE	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
getScale	TokenNameIdentifier	 get Scale
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
featurePrior	TokenNameIdentifier	 feature Prior
,	TokenNameCOMMA	
1.0	TokenNameDoubleLiteral	
/	TokenNameDIVIDE	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
getScale	TokenNameIdentifier	 get Scale
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
LOG	TokenNameIdentifier	 LOG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//System.out.println("w|Pos="+pweight+" w|Neg="+nweight); 	TokenNameCOMMENT_LINE	System.out.println("w|Pos="+pweight+" w|Neg="+nweight); 
c	TokenNameIdentifier	 c
.	TokenNameDOT	
increment	TokenNameIdentifier	 increment
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
,	TokenNameCOMMA	
+	TokenNamePLUS	
pweight	TokenNameIdentifier	 pweight
-	TokenNameMINUS	
nweight	TokenNameIdentifier	 nweight
,	TokenNameCOMMA	
LOG	TokenNameIdentifier	 LOG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//System.out.println( "prior pos = "+estimatedProb(numPos, numPos+numNeg, 0.5, 1.0, LOG ) ); 	TokenNameCOMMENT_LINE	System.out.println( "prior pos = "+estimatedProb(numPos, numPos+numNeg, 0.5, 1.0, LOG ) ); 
//System.out.println( "prior neg = "+estimatedProb(numNeg, numPos+numNeg, 0.5, 1.0, LOG ) ); 	TokenNameCOMMENT_LINE	System.out.println( "prior neg = "+estimatedProb(numNeg, numPos+numNeg, 0.5, 1.0, LOG ) ); 
c	TokenNameIdentifier	 c
.	TokenNameDOT	
incrementBias	TokenNameIdentifier	 increment Bias
(	TokenNameLPAREN	
+	TokenNamePLUS	
estimatedProb	TokenNameIdentifier	 estimated Prob
(	TokenNameLPAREN	
numPos	TokenNameIdentifier	 num Pos
,	TokenNameCOMMA	
numPos	TokenNameIdentifier	 num Pos
+	TokenNamePLUS	
numNeg	TokenNameIdentifier	 num Neg
,	TokenNameCOMMA	
0.5	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
1.0	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
LOG	TokenNameIdentifier	 LOG
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
incrementBias	TokenNameIdentifier	 increment Bias
(	TokenNameLPAREN	
-	TokenNameMINUS	
estimatedProb	TokenNameIdentifier	 estimated Prob
(	TokenNameLPAREN	
numNeg	TokenNameIdentifier	 num Neg
,	TokenNameCOMMA	
numPos	TokenNameIdentifier	 num Pos
+	TokenNamePLUS	
numNeg	TokenNameIdentifier	 num Neg
,	TokenNameCOMMA	
0.5	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
1.0	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
LOG	TokenNameIdentifier	 LOG
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//System.out.println("out of batchTrain\n"); 	TokenNameCOMMENT_LINE	System.out.println("out of batchTrain\n"); 
return	TokenNamereturn	
c	TokenNameIdentifier	 c
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
double	TokenNamedouble	
estimatedProb	TokenNameIdentifier	 estimated Prob
(	TokenNameLPAREN	
double	TokenNamedouble	
k	TokenNameIdentifier	 k
,	TokenNameCOMMA	
double	TokenNamedouble	
n	TokenNameIdentifier	 n
,	TokenNameCOMMA	
double	TokenNamedouble	
prior	TokenNameIdentifier	 prior
,	TokenNameCOMMA	
double	TokenNamedouble	
pseudoCounts	TokenNameIdentifier	 pseudo Counts
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//System.out.println("psudoCounts:" + k); 	TokenNameCOMMENT_LINE	System.out.println("psudoCounts:" + k); 
return	TokenNamereturn	
(	TokenNameLPAREN	
k	TokenNameIdentifier	 k
+	TokenNamePLUS	
prior	TokenNameIdentifier	 prior
*	TokenNameMULTIPLY	
pseudoCounts	TokenNameIdentifier	 pseudo Counts
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
+	TokenNamePLUS	
pseudoCounts	TokenNameIdentifier	 pseudo Counts
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
double	TokenNamedouble	
estimatedProb	TokenNameIdentifier	 estimated Prob
(	TokenNameLPAREN	
double	TokenNamedouble	
k	TokenNameIdentifier	 k
,	TokenNameCOMMA	
double	TokenNamedouble	
n	TokenNameIdentifier	 n
,	TokenNameCOMMA	
double	TokenNamedouble	
prior	TokenNameIdentifier	 prior
,	TokenNameCOMMA	
double	TokenNamedouble	
pseudoCounts	TokenNameIdentifier	 pseudo Counts
,	TokenNameCOMMA	
boolean	TokenNameboolean	
log	TokenNameIdentifier	 log
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//.out.println("psudoCounts:" + k); 	TokenNameCOMMENT_LINE	.out.println("psudoCounts:" + k); 
return	TokenNamereturn	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
(	TokenNameLPAREN	
k	TokenNameIdentifier	 k
+	TokenNamePLUS	
prior	TokenNameIdentifier	 prior
*	TokenNameMULTIPLY	
pseudoCounts	TokenNameIdentifier	 pseudo Counts
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
+	TokenNamePLUS	
pseudoCounts	TokenNameIdentifier	 pseudo Counts
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
