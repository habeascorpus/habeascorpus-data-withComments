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
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
SortedMap	TokenNameIdentifier	 Sorted Map
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
TreeMap	TokenNameIdentifier	 Tree Map
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
/** * Naive Bayes Negative-Binomial Classifier Learner. * * @author Edoardo Airoldi * Date: Jul 12, 2004 */	TokenNameCOMMENT_JAVADOC	 Naive Bayes Negative-Binomial Classifier Learner. * @author Edoardo Airoldi Date: Jul 12, 2004 
public	TokenNamepublic	
class	TokenNameclass	
NegativeBinomialLearner	TokenNameIdentifier	 Negative Binomial Learner
extends	TokenNameextends	
BatchBinaryClassifierLearner	TokenNameIdentifier	 Batch Binary Classifier Learner
{	TokenNameLBRACE	
// static private Logger log=Logger.getLogger(PoissonLearner.class); 	TokenNameCOMMENT_LINE	static private Logger log=Logger.getLogger(PoissonLearner.class); 
// private static final boolean LOG=true; 	TokenNameCOMMENT_LINE	private static final boolean LOG=true; 
private	TokenNameprivate	
double	TokenNamedouble	
SCALE	TokenNameIdentifier	 SCALE
;	TokenNameSEMICOLON	
public	TokenNamepublic	
NegativeBinomialLearner	TokenNameIdentifier	 Negative Binomial Learner
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
NegativeBinomialLearner	TokenNameIdentifier	 Negative Binomial Learner
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
NegativeBinomialClassifier	TokenNameIdentifier	 Negative Binomial Classifier
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
new	TokenNamenew	
NegativeBinomialClassifier	TokenNameIdentifier	 Negative Binomial Classifier
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
// J = number of examples 	TokenNameCOMMENT_LINE	J = number of examples 
int	TokenNameint	
JNeg	TokenNameIdentifier	 J Neg
=	TokenNameEQUAL	
index	TokenNameIdentifier	 index
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
"NEG"	TokenNameStringLiteral	NEG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
JPos	TokenNameIdentifier	 J Pos
=	TokenNameEQUAL	
index	TokenNameIdentifier	 index
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
"POS"	TokenNameStringLiteral	POS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
wgtNeg	TokenNameIdentifier	 wgt Neg
=	TokenNameEQUAL	
new	TokenNamenew	
double	TokenNamedouble	
[	TokenNameLBRACKET	
JNeg	TokenNameIdentifier	 J Neg
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
wgtPos	TokenNameIdentifier	 wgt Pos
=	TokenNameEQUAL	
new	TokenNamenew	
double	TokenNamedouble	
[	TokenNameLBRACKET	
JPos	TokenNameIdentifier	 J Pos
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// estimate example weights w(i) 	TokenNameCOMMENT_LINE	estimate example weights w(i) 
int	TokenNameint	
exNeg	TokenNameIdentifier	 ex Neg
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
exPos	TokenNameIdentifier	 ex Pos
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
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
Example	TokenNameIdentifier	 Example
>	TokenNameGREATER	
eloo	TokenNameIdentifier	 eloo
=	TokenNameEQUAL	
data	TokenNameIdentifier	 data
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
e	TokenNameIdentifier	 e
=	TokenNameEQUAL	
eloo	TokenNameIdentifier	 eloo
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getLabel	TokenNameIdentifier	 get Label
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
bestClassName	TokenNameIdentifier	 best Class Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"POS"	TokenNameStringLiteral	POS
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
double	TokenNamedouble	
wgtTot	TokenNameIdentifier	 wgt Tot
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
e	TokenNameIdentifier	 e
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
wgtTot	TokenNameIdentifier	 wgt Tot
+=	TokenNamePLUS_EQUAL	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getWeight	TokenNameIdentifier	 get Weight
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
wgtPos	TokenNameIdentifier	 wgt Pos
[	TokenNameLBRACKET	
exPos	TokenNameIdentifier	 ex Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
wgtTot	TokenNameIdentifier	 wgt Tot
/	TokenNameDIVIDE	
SCALE	TokenNameIdentifier	 SCALE
;	TokenNameSEMICOLON	
numPos	TokenNameIdentifier	 num Pos
+=	TokenNamePLUS_EQUAL	
wgtTot	TokenNameIdentifier	 wgt Tot
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getLabel	TokenNameIdentifier	 get Label
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
bestClassName	TokenNameIdentifier	 best Class Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"NEG"	TokenNameStringLiteral	NEG
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
double	TokenNamedouble	
wgtTot	TokenNameIdentifier	 wgt Tot
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
e	TokenNameIdentifier	 e
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
wgtTot	TokenNameIdentifier	 wgt Tot
+=	TokenNamePLUS_EQUAL	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getWeight	TokenNameIdentifier	 get Weight
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
wgtNeg	TokenNameIdentifier	 wgt Neg
[	TokenNameLBRACKET	
exNeg	TokenNameIdentifier	 ex Neg
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
wgtTot	TokenNameIdentifier	 wgt Tot
/	TokenNameDIVIDE	
SCALE	TokenNameIdentifier	 SCALE
;	TokenNameSEMICOLON	
numNeg	TokenNameIdentifier	 num Neg
+=	TokenNamePLUS_EQUAL	
wgtTot	TokenNameIdentifier	 wgt Tot
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
"error: no class found for example! "	TokenNameStringLiteral	error: no class found for example! 
+	TokenNamePLUS	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
exit	TokenNameIdentifier	 exit
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// prior for positive and negative classes, and for unseen features 	TokenNameCOMMENT_LINE	prior for positive and negative classes, and for unseen features 
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
// prior for unseen features 	TokenNameCOMMENT_LINE	prior for unseen features 
c	TokenNameIdentifier	 c
.	TokenNameDOT	
setPriorPos	TokenNameIdentifier	 set Prior Pos
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
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
setPriorNeg	TokenNameIdentifier	 set Prior Neg
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
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// estimate parameters for all features 	TokenNameCOMMENT_LINE	estimate parameters for all features 
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
vNeg	TokenNameIdentifier	 v Neg
=	TokenNameEQUAL	
new	TokenNamenew	
double	TokenNamedouble	
[	TokenNameLBRACKET	
JNeg	TokenNameIdentifier	 J Neg
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
vPos	TokenNameIdentifier	 v Pos
=	TokenNameEQUAL	
new	TokenNamenew	
double	TokenNamedouble	
[	TokenNameLBRACKET	
JPos	TokenNameIdentifier	 J Pos
]	TokenNameRBRACKET	
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
// find vector of counts for Feature f 	TokenNameCOMMENT_LINE	find vector of counts for Feature f 
Feature	TokenNameIdentifier	 Feature
f	TokenNameIdentifier	 f
=	TokenNameEQUAL	
floo	TokenNameIdentifier	 floo
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
exNeg	TokenNameIdentifier	 ex Neg
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
exPos	TokenNameIdentifier	 ex Pos
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Example	TokenNameIdentifier	 Example
>	TokenNameGREATER	
eloo	TokenNameIdentifier	 eloo
=	TokenNameEQUAL	
data	TokenNameIdentifier	 data
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
e	TokenNameIdentifier	 e
=	TokenNameEQUAL	
eloo	TokenNameIdentifier	 eloo
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getLabel	TokenNameIdentifier	 get Label
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
bestClassName	TokenNameIdentifier	 best Class Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"POS"	TokenNameStringLiteral	POS
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
vPos	TokenNameIdentifier	 v Pos
[	TokenNameLBRACKET	
exPos	TokenNameIdentifier	 ex Pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getWeight	TokenNameIdentifier	 get Weight
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getLabel	TokenNameIdentifier	 get Label
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
bestClassName	TokenNameIdentifier	 best Class Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"NEG"	TokenNameStringLiteral	NEG
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
vNeg	TokenNameIdentifier	 v Neg
[	TokenNameLBRACKET	
exNeg	TokenNameIdentifier	 ex Neg
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getWeight	TokenNameIdentifier	 get Weight
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
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
"error: no class found for example! "	TokenNameStringLiteral	error: no class found for example! 
+	TokenNamePLUS	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
exit	TokenNameIdentifier	 exit
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// estimate parameters for Feature f 	TokenNameCOMMENT_LINE	estimate parameters for Feature f 
SortedMap	TokenNameIdentifier	 Sorted Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
Double	TokenNameIdentifier	 Double
>	TokenNameGREATER	
mudeltaNeg	TokenNameIdentifier	 mudelta Neg
=	TokenNameEQUAL	
estimateNegBinMOME	TokenNameIdentifier	 estimate Neg Bin MOME
(	TokenNameLPAREN	
vNeg	TokenNameIdentifier	 v Neg
,	TokenNameCOMMA	
wgtNeg	TokenNameIdentifier	 wgt Neg
,	TokenNameCOMMA	
featurePrior	TokenNameIdentifier	 feature Prior
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
SortedMap	TokenNameIdentifier	 Sorted Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
Double	TokenNameIdentifier	 Double
>	TokenNameGREATER	
mudeltaPos	TokenNameIdentifier	 mudelta Pos
=	TokenNameEQUAL	
estimateNegBinMOME	TokenNameIdentifier	 estimate Neg Bin MOME
(	TokenNameLPAREN	
vPos	TokenNameIdentifier	 v Pos
,	TokenNameCOMMA	
wgtPos	TokenNameIdentifier	 wgt Pos
,	TokenNameCOMMA	
featurePrior	TokenNameIdentifier	 feature Prior
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
setPmsNeg	TokenNameIdentifier	 set Pms Neg
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
,	TokenNameCOMMA	
mudeltaNeg	TokenNameIdentifier	 mudelta Neg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
setPmsPos	TokenNameIdentifier	 set Pms Pos
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
,	TokenNameCOMMA	
mudeltaPos	TokenNameIdentifier	 mudelta Pos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
c	TokenNameIdentifier	 c
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
SortedMap	TokenNameIdentifier	 Sorted Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
Double	TokenNameIdentifier	 Double
>	TokenNameGREATER	
estimateNegBinMOME	TokenNameIdentifier	 estimate Neg Bin MOME
(	TokenNameLPAREN	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
vCnt	TokenNameIdentifier	 v Cnt
,	TokenNameCOMMA	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
vWgt	TokenNameIdentifier	 v Wgt
,	TokenNameCOMMA	
double	TokenNamedouble	
prior	TokenNameIdentifier	 prior
)	TokenNameRPAREN	
{	TokenNameLBRACE	
double	TokenNamedouble	
m	TokenNameIdentifier	 m
=	TokenNameEQUAL	
0.0	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
d	TokenNameIdentifier	 d
=	TokenNameEQUAL	
0.0	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
// compute mean 	TokenNameCOMMENT_LINE	compute mean 
int	TokenNameint	
N	TokenNameIdentifier	 N
=	TokenNameEQUAL	
vCnt	TokenNameIdentifier	 v Cnt
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
double	TokenNamedouble	
sumX	TokenNameIdentifier	 sum X
=	TokenNameEQUAL	
0.0	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
sumWgt	TokenNameIdentifier	 sum Wgt
=	TokenNameEQUAL	
0.0	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
sumWgt2	TokenNameIdentifier	 sum Wgt2
=	TokenNameEQUAL	
0.0	TokenNameDoubleLiteral	
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
N	TokenNameIdentifier	 N
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sumX	TokenNameIdentifier	 sum X
+=	TokenNamePLUS_EQUAL	
vCnt	TokenNameIdentifier	 v Cnt
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
sumWgt	TokenNameIdentifier	 sum Wgt
+=	TokenNamePLUS_EQUAL	
vWgt	TokenNameIdentifier	 v Wgt
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
sumWgt2	TokenNameIdentifier	 sum Wgt2
+=	TokenNamePLUS_EQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
pow	TokenNameIdentifier	 pow
(	TokenNameLPAREN	
vWgt	TokenNameIdentifier	 v Wgt
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
m	TokenNameIdentifier	 m
=	TokenNameEQUAL	
(	TokenNameLPAREN	
sumX	TokenNameIdentifier	 sum X
+	TokenNamePLUS	
prior	TokenNameIdentifier	 prior
*	TokenNameMULTIPLY	
1.0	TokenNameDoubleLiteral	
/	TokenNameDIVIDE	
SCALE	TokenNameIdentifier	 SCALE
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
(	TokenNameLPAREN	
sumWgt	TokenNameIdentifier	 sum Wgt
+	TokenNamePLUS	
1.0	TokenNameDoubleLiteral	
/	TokenNameDIVIDE	
SCALE	TokenNameIdentifier	 SCALE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// compute intermediate 	TokenNameCOMMENT_LINE	compute intermediate 
double	TokenNamedouble	
r	TokenNameIdentifier	 r
;	TokenNameSEMICOLON	
double	TokenNamedouble	
v	TokenNameIdentifier	 v
=	TokenNameEQUAL	
0.0	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
N	TokenNameIdentifier	 N
<=	TokenNameLESS_EQUAL	
1.0	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
r	TokenNameIdentifier	 r
=	TokenNameEQUAL	
0.0	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
v	TokenNameIdentifier	 v
=	TokenNameEQUAL	
0.0	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
r	TokenNameIdentifier	 r
=	TokenNameEQUAL	
(	TokenNameLPAREN	
sumWgt	TokenNameIdentifier	 sum Wgt
-	TokenNameMINUS	
sumWgt2	TokenNameIdentifier	 sum Wgt2
/	TokenNameDIVIDE	
sumWgt	TokenNameIdentifier	 sum Wgt
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
(	TokenNameLPAREN	
N	TokenNameIdentifier	 N
-	TokenNameMINUS	
1.0	TokenNameDoubleLiteral	
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
N	TokenNameIdentifier	 N
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
v	TokenNameIdentifier	 v
+=	TokenNamePLUS_EQUAL	
(	TokenNameLPAREN	
vWgt	TokenNameIdentifier	 v Wgt
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
*	TokenNameMULTIPLY	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
pow	TokenNameIdentifier	 pow
(	TokenNameLPAREN	
vCnt	TokenNameIdentifier	 v Cnt
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
/	TokenNameDIVIDE	
vWgt	TokenNameIdentifier	 v Wgt
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
-	TokenNameMINUS	
m	TokenNameIdentifier	 m
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
(	TokenNameLPAREN	
N	TokenNameIdentifier	 N
-	TokenNameMINUS	
1.0	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// compute variance 	TokenNameCOMMENT_LINE	compute variance 
d	TokenNameIdentifier	 d
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
max	TokenNameIdentifier	 max
(	TokenNameLPAREN	
0.0	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
-	TokenNameMINUS	
m	TokenNameIdentifier	 m
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
*	TokenNameMULTIPLY	
m	TokenNameIdentifier	 m
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
new	TokenNamenew	
Double	TokenNameIdentifier	 Double
(	TokenNameLPAREN	
d	TokenNameIdentifier	 d
)	TokenNameRPAREN	
.	TokenNameDOT	
isNaN	TokenNameIdentifier	 is Na N
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
d	TokenNameIdentifier	 d
=	TokenNameEQUAL	
1e-7	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// package results 	TokenNameCOMMENT_LINE	package results 
SortedMap	TokenNameIdentifier	 Sorted Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
Double	TokenNameIdentifier	 Double
>	TokenNameGREATER	
mudelta	TokenNameIdentifier	 mudelta
=	TokenNameEQUAL	
new	TokenNamenew	
TreeMap	TokenNameIdentifier	 Tree Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
Double	TokenNameIdentifier	 Double
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mudelta	TokenNameIdentifier	 mudelta
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"mu"	TokenNameStringLiteral	mu
,	TokenNameCOMMA	
new	TokenNamenew	
Double	TokenNameIdentifier	 Double
(	TokenNameLPAREN	
m	TokenNameIdentifier	 m
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mudelta	TokenNameIdentifier	 mudelta
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"delta"	TokenNameStringLiteral	delta
,	TokenNameCOMMA	
new	TokenNamenew	
Double	TokenNameIdentifier	 Double
(	TokenNameLPAREN	
d	TokenNameIdentifier	 d
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
mudelta	TokenNameIdentifier	 mudelta
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
