package	TokenNamepackage	
edu	TokenNameIdentifier	 edu
.	TokenNameDOT	
cmu	TokenNameIdentifier	 cmu
.	TokenNameDOT	
minorthird	TokenNameIdentifier	 minorthird
.	TokenNameDOT	
classify	TokenNameIdentifier	 classify
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
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
SampleDatasets	TokenNameIdentifier	 Sample Datasets
;	TokenNameSEMICOLON	
/** * @author Edoardo Airoldi * Date: Nov 24, 2003 */	TokenNameCOMMENT_JAVADOC	 @author Edoardo Airoldi Date: Nov 24, 2003 
public	TokenNamepublic	
class	TokenNameclass	
T1InstanceTransformLearner	TokenNameIdentifier	 T1 Instance Transform Learner
implements	TokenNameimplements	
InstanceTransformLearner	TokenNameIdentifier	 Instance Transform Learner
{	TokenNameLBRACE	
// static private Logger log = Logger.getLogger(T1InstanceTransformLearner.class); 	TokenNameCOMMENT_LINE	static private Logger log = Logger.getLogger(T1InstanceTransformLearner.class); 
private	TokenNameprivate	
double	TokenNamedouble	
REF_LENGTH	TokenNameIdentifier	 REF  LENGTH
;	TokenNameSEMICOLON	
// word-length of the reference document 	TokenNameCOMMENT_LINE	word-length of the reference document 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
PDF	TokenNameIdentifier	 PDF
;	TokenNameSEMICOLON	
// See static methods at the bottom of this class 	TokenNameCOMMENT_LINE	See static methods at the bottom of this class 
public	TokenNamepublic	
T1InstanceTransformLearner	TokenNameIdentifier	 T1 Instance Transform Learner
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
REF_LENGTH	TokenNameIdentifier	 REF  LENGTH
=	TokenNameEQUAL	
100.0	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
PDF	TokenNameIdentifier	 PDF
=	TokenNameEQUAL	
"Poisson"	TokenNameStringLiteral	Poisson
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Accept an ExampleSchema - constraints on what the * Examples will be. */	TokenNameCOMMENT_JAVADOC	 Accept an ExampleSchema - constraints on what the Examples will be. 
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
"can only learn binary example data"	TokenNameStringLiteral	can only learn binary example data
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** Examine data, build an instance transformer */	TokenNameCOMMENT_JAVADOC	 Examine data, build an instance transformer 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
InstanceTransform	TokenNameIdentifier	 Instance Transform
batchTrain	TokenNameIdentifier	 batch Train
(	TokenNameLPAREN	
Dataset	TokenNameIdentifier	 Dataset
dataset	TokenNameIdentifier	 dataset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
T1InstanceTransform	TokenNameIdentifier	 T1 Instance Transform
T1Filter	TokenNameIdentifier	 T1 Filter
=	TokenNameEQUAL	
new	TokenNamenew	
T1InstanceTransform	TokenNameIdentifier	 T1 Instance Transform
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
BasicFeatureIndex	TokenNameIdentifier	 Basic Feature Index
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
new	TokenNamenew	
BasicFeatureIndex	TokenNameIdentifier	 Basic Feature Index
(	TokenNameLPAREN	
dataset	TokenNameIdentifier	 dataset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// prior for unseen words 	TokenNameCOMMENT_LINE	prior for unseen words 
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
// loop features 	TokenNameCOMMENT_LINE	loop features 
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
//System.out.println("feature: "+f); // DEBUG 	TokenNameCOMMENT_LINE	System.out.println("feature: "+f); // DEBUG 
// fill array of <counts_ex(feature), length_ex> for POS class 	TokenNameCOMMENT_LINE	fill array of <counts_ex(feature), length_ex> for POS class 
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
xPos	TokenNameIdentifier	 x Pos
=	TokenNameEQUAL	
new	TokenNamenew	
double	TokenNamedouble	
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
,	TokenNameCOMMA	
"POS"	TokenNameStringLiteral	POS
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
omegaPos	TokenNameIdentifier	 omega Pos
=	TokenNameEQUAL	
new	TokenNamenew	
double	TokenNamedouble	
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
,	TokenNameCOMMA	
"POS"	TokenNameStringLiteral	POS
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
position	TokenNameIdentifier	 position
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
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
e	TokenNameIdentifier	 e
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
if	TokenNameif	
(	TokenNameLPAREN	
"POS"	TokenNameStringLiteral	POS
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
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
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
xPos	TokenNameIdentifier	 x Pos
[	TokenNameLBRACKET	
position	TokenNameIdentifier	 position
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getWeight	TokenNameIdentifier	 get Weight
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
omegaPos	TokenNameIdentifier	 omega Pos
[	TokenNameLBRACKET	
position	TokenNameIdentifier	 position
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
REF_LENGTH	TokenNameIdentifier	 REF  LENGTH
;	TokenNameSEMICOLON	
position	TokenNameIdentifier	 position
+=	TokenNamePLUS_EQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// fill array of <counts(example,feature), length(example)> for NEG class 	TokenNameCOMMENT_LINE	fill array of <counts(example,feature), length(example)> for NEG class 
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
xNeg	TokenNameIdentifier	 x Neg
=	TokenNameEQUAL	
new	TokenNamenew	
double	TokenNamedouble	
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
,	TokenNameCOMMA	
"NEG"	TokenNameStringLiteral	NEG
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
omegaNeg	TokenNameIdentifier	 omega Neg
=	TokenNameEQUAL	
new	TokenNamenew	
double	TokenNamedouble	
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
,	TokenNameCOMMA	
"NEG"	TokenNameStringLiteral	NEG
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
position	TokenNameIdentifier	 position
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
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
e	TokenNameIdentifier	 e
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
if	TokenNameif	
(	TokenNameLPAREN	
"NEG"	TokenNameStringLiteral	NEG
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
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
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
xNeg	TokenNameIdentifier	 x Neg
[	TokenNameLBRACKET	
position	TokenNameIdentifier	 position
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getWeight	TokenNameIdentifier	 get Weight
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
omegaNeg	TokenNameIdentifier	 omega Neg
[	TokenNameLBRACKET	
position	TokenNameIdentifier	 position
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
REF_LENGTH	TokenNameIdentifier	 REF  LENGTH
;	TokenNameSEMICOLON	
position	TokenNameIdentifier	 position
+=	TokenNamePLUS_EQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// estimate Parameters for the two classes and update the T1-Filter 	TokenNameCOMMENT_LINE	estimate Parameters for the two classes and update the T1-Filter 
T1Filter	TokenNameIdentifier	 T1 Filter
.	TokenNameDOT	
setT1	TokenNameIdentifier	 set T1
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
,	TokenNameCOMMA	
T1	TokenNameIdentifier	 T1
(	TokenNameLPAREN	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
index	TokenNameIdentifier	 index
.	TokenNameDOT	
getCounts	TokenNameIdentifier	 get Counts
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
,	TokenNameCOMMA	
"POS"	TokenNameStringLiteral	POS
)	TokenNameRPAREN	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
index	TokenNameIdentifier	 index
.	TokenNameDOT	
getCounts	TokenNameIdentifier	 get Counts
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
,	TokenNameCOMMA	
"NEG"	TokenNameStringLiteral	NEG
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
PDF	TokenNameIdentifier	 PDF
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"Poisson"	TokenNameStringLiteral	Poisson
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// learn Poisson parameters 	TokenNameCOMMENT_LINE	learn Poisson parameters 
double	TokenNamedouble	
muPos	TokenNameIdentifier	 mu Pos
=	TokenNameEQUAL	
MaximumLikelihoodPoisson	TokenNameIdentifier	 Maximum Likelihood Poisson
(	TokenNameLPAREN	
xPos	TokenNameIdentifier	 x Pos
,	TokenNameCOMMA	
omegaPos	TokenNameIdentifier	 omega Pos
,	TokenNameCOMMA	
featurePrior	TokenNameIdentifier	 feature Prior
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
muNeg	TokenNameIdentifier	 mu Neg
=	TokenNameEQUAL	
MaximumLikelihoodPoisson	TokenNameIdentifier	 Maximum Likelihood Poisson
(	TokenNameLPAREN	
xNeg	TokenNameIdentifier	 x Neg
,	TokenNameCOMMA	
omegaNeg	TokenNameIdentifier	 omega Neg
,	TokenNameCOMMA	
featurePrior	TokenNameIdentifier	 feature Prior
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// update T1 Filter 	TokenNameCOMMENT_LINE	update T1 Filter 
T1Filter	TokenNameIdentifier	 T1 Filter
.	TokenNameDOT	
setPosMu	TokenNameIdentifier	 set Pos Mu
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
,	TokenNameCOMMA	
muPos	TokenNameIdentifier	 mu Pos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
T1Filter	TokenNameIdentifier	 T1 Filter
.	TokenNameDOT	
setNegMu	TokenNameIdentifier	 set Neg Mu
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
,	TokenNameCOMMA	
muNeg	TokenNameIdentifier	 mu Neg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
T1Filter	TokenNameIdentifier	 T1 Filter
.	TokenNameDOT	
setFeaturePdf	TokenNameIdentifier	 set Feature Pdf
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
,	TokenNameCOMMA	
"Poisson"	TokenNameStringLiteral	Poisson
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
PDF	TokenNameIdentifier	 PDF
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"Negative-Binomial"	TokenNameStringLiteral	Negative-Binomial
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// learn Negative-Binomial parameters 	TokenNameCOMMENT_LINE	learn Negative-Binomial parameters 
SortedMap	TokenNameIdentifier	 Sorted Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
Double	TokenNameIdentifier	 Double
>	TokenNameGREATER	
mudeltaPos	TokenNameIdentifier	 mudelta Pos
=	TokenNameEQUAL	
MethodOfMomentsNegBin	TokenNameIdentifier	 Method Of Moments Neg Bin
(	TokenNameLPAREN	
xPos	TokenNameIdentifier	 x Pos
,	TokenNameCOMMA	
omegaPos	TokenNameIdentifier	 omega Pos
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
mudeltaNeg	TokenNameIdentifier	 mudelta Neg
=	TokenNameEQUAL	
MethodOfMomentsNegBin	TokenNameIdentifier	 Method Of Moments Neg Bin
(	TokenNameLPAREN	
xNeg	TokenNameIdentifier	 x Neg
,	TokenNameCOMMA	
omegaNeg	TokenNameIdentifier	 omega Neg
,	TokenNameCOMMA	
featurePrior	TokenNameIdentifier	 feature Prior
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// update T1 Filter 	TokenNameCOMMENT_LINE	update T1 Filter 
T1Filter	TokenNameIdentifier	 T1 Filter
.	TokenNameDOT	
setPosMu	TokenNameIdentifier	 set Pos Mu
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
,	TokenNameCOMMA	
(	TokenNameLPAREN	
mudeltaPos	TokenNameIdentifier	 mudelta Pos
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
"mu"	TokenNameStringLiteral	mu
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
doubleValue	TokenNameIdentifier	 double Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
T1Filter	TokenNameIdentifier	 T1 Filter
.	TokenNameDOT	
setPosDelta	TokenNameIdentifier	 set Pos Delta
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
,	TokenNameCOMMA	
(	TokenNameLPAREN	
mudeltaPos	TokenNameIdentifier	 mudelta Pos
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
"delta"	TokenNameStringLiteral	delta
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
doubleValue	TokenNameIdentifier	 double Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
T1Filter	TokenNameIdentifier	 T1 Filter
.	TokenNameDOT	
setNegMu	TokenNameIdentifier	 set Neg Mu
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
,	TokenNameCOMMA	
(	TokenNameLPAREN	
mudeltaNeg	TokenNameIdentifier	 mudelta Neg
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
"mu"	TokenNameStringLiteral	mu
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
doubleValue	TokenNameIdentifier	 double Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
T1Filter	TokenNameIdentifier	 T1 Filter
.	TokenNameDOT	
setNegDelta	TokenNameIdentifier	 set Neg Delta
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
,	TokenNameCOMMA	
(	TokenNameLPAREN	
mudeltaNeg	TokenNameIdentifier	 mudelta Neg
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
"delta"	TokenNameStringLiteral	delta
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
doubleValue	TokenNameIdentifier	 double Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
mudeltaPos	TokenNameIdentifier	 mudelta Pos
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
"delta"	TokenNameStringLiteral	delta
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
doubleValue	TokenNameIdentifier	 double Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0.0	TokenNameDoubleLiteral	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
mudeltaNeg	TokenNameIdentifier	 mudelta Neg
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
"delta"	TokenNameStringLiteral	delta
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
doubleValue	TokenNameIdentifier	 double Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0.0	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
T1Filter	TokenNameIdentifier	 T1 Filter
.	TokenNameDOT	
setFeaturePdf	TokenNameIdentifier	 set Feature Pdf
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
,	TokenNameCOMMA	
"Poisson"	TokenNameStringLiteral	Poisson
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
T1Filter	TokenNameIdentifier	 T1 Filter
.	TokenNameDOT	
setFeaturePdf	TokenNameIdentifier	 set Feature Pdf
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
,	TokenNameCOMMA	
"Negative-Binomial"	TokenNameStringLiteral	Negative-Binomial
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
T1Filter	TokenNameIdentifier	 T1 Filter
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// private String expandArray(double[] vec){ 	TokenNameCOMMENT_LINE	private String expandArray(double[] vec){ 
// String buf="[ "; 	TokenNameCOMMENT_LINE	String buf="[ "; 
// for(int i=0;i<vec.length;i++){ 	TokenNameCOMMENT_LINE	for(int i=0;i<vec.length;i++){ 
// buf=buf+vec[i]+" "; 	TokenNameCOMMENT_LINE	buf=buf+vec[i]+" "; 
// } 	TokenNameCOMMENT_LINE	} 
// buf=buf+"]"; 	TokenNameCOMMENT_LINE	buf=buf+"]"; 
// return buf; 	TokenNameCOMMENT_LINE	return buf; 
// } 	TokenNameCOMMENT_LINE	} 
/** Get the total number of words in an Example */	TokenNameCOMMENT_JAVADOC	 Get the total number of words in an Example 
public	TokenNamepublic	
double	TokenNamedouble	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
Example	TokenNameIdentifier	 Example
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
double	TokenNamedouble	
len	TokenNameIdentifier	 len
=	TokenNameEQUAL	
0.0	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Feature	TokenNameIdentifier	 Feature
>	TokenNameGREATER	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
e	TokenNameIdentifier	 e
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
len	TokenNameIdentifier	 len
+=	TokenNamePLUS_EQUAL	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getWeight	TokenNameIdentifier	 get Weight
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
len	TokenNameIdentifier	 len
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Compute the T1 statistic corresponding to the counts in two texts */	TokenNameCOMMENT_JAVADOC	 Compute the T1 statistic corresponding to the counts in two texts 
public	TokenNamepublic	
double	TokenNamedouble	
T1	TokenNameIdentifier	 T1
(	TokenNameLPAREN	
int	TokenNameint	
x1	TokenNameIdentifier	 x1
,	TokenNameCOMMA	
int	TokenNameint	
x2	TokenNameIdentifier	 x2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
double	TokenNamedouble	
dx1	TokenNameIdentifier	 dx1
=	TokenNameEQUAL	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
x1	TokenNameIdentifier	 x1
)	TokenNameRPAREN	
.	TokenNameDOT	
doubleValue	TokenNameIdentifier	 double Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
dx2	TokenNameIdentifier	 dx2
=	TokenNameEQUAL	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
x2	TokenNameIdentifier	 x2
)	TokenNameRPAREN	
.	TokenNameDOT	
doubleValue	TokenNameIdentifier	 double Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
pow	TokenNameIdentifier	 pow
(	TokenNameLPAREN	
(	TokenNameLPAREN	
dx1	TokenNameIdentifier	 dx1
-	TokenNameMINUS	
dx2	TokenNameIdentifier	 dx2
)	TokenNameRPAREN	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
(	TokenNameLPAREN	
dx1	TokenNameIdentifier	 dx1
+	TokenNamePLUS	
dx2	TokenNameIdentifier	 dx2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
t	TokenNameIdentifier	 t
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Compute the maximum likelihood estimate of the rate 'mu' of a Poisson model, * using integer counts x[] from examples with different lengths omega[]. */	TokenNameCOMMENT_JAVADOC	 Compute the maximum likelihood estimate of the rate 'mu' of a Poisson model, using integer counts x[] from examples with different lengths omega[]. 
public	TokenNamepublic	
double	TokenNamedouble	
MaximumLikelihoodPoisson	TokenNameIdentifier	 Maximum Likelihood Poisson
(	TokenNameLPAREN	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
omega	TokenNameIdentifier	 omega
,	TokenNameCOMMA	
double	TokenNamedouble	
prior	TokenNameIdentifier	 prior
)	TokenNameRPAREN	
{	TokenNameLBRACE	
double	TokenNamedouble	
mu	TokenNameIdentifier	 mu
;	TokenNameSEMICOLON	
double	TokenNamedouble	
sumX	TokenNameIdentifier	 sum X
=	TokenNameEQUAL	
0.0	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
sumOmega	TokenNameIdentifier	 sum Omega
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
x	TokenNameIdentifier	 x
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sumX	TokenNameIdentifier	 sum X
+=	TokenNamePLUS_EQUAL	
x	TokenNameIdentifier	 x
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
sumOmega	TokenNameIdentifier	 sum Omega
+=	TokenNamePLUS_EQUAL	
omega	TokenNameIdentifier	 omega
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
sumX	TokenNameIdentifier	 sum X
==	TokenNameEQUAL_EQUAL	
0.0	TokenNameDoubleLiteral	
&&	TokenNameAND_AND	
sumOmega	TokenNameIdentifier	 sum Omega
==	TokenNameEQUAL_EQUAL	
0.0	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
mu	TokenNameIdentifier	 mu
=	TokenNameEQUAL	
prior	TokenNameIdentifier	 prior
/	TokenNameDIVIDE	
(	TokenNameLPAREN	
1.0	TokenNameDoubleLiteral	
/	TokenNameDIVIDE	
REF_LENGTH	TokenNameIdentifier	 REF  LENGTH
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
mu	TokenNameIdentifier	 mu
=	TokenNameEQUAL	
(	TokenNameLPAREN	
sumX	TokenNameIdentifier	 sum X
+	TokenNamePLUS	
prior	TokenNameIdentifier	 prior
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
(	TokenNameLPAREN	
sumOmega	TokenNameIdentifier	 sum Omega
+	TokenNamePLUS	
1.0	TokenNameDoubleLiteral	
/	TokenNameDIVIDE	
REF_LENGTH	TokenNameIdentifier	 REF  LENGTH
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
mu	TokenNameIdentifier	 mu
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Compute the method of moment estimates of the rate 'mu' and the parameter * which controls the variability 'delta' of a Negative-Binomial models, using * integer counts x[] from examples with different lengths omega[]. */	TokenNameCOMMENT_JAVADOC	 Compute the method of moment estimates of the rate 'mu' and the parameter which controls the variability 'delta' of a Negative-Binomial models, using integer counts x[] from examples with different lengths omega[]. 
public	TokenNamepublic	
SortedMap	TokenNameIdentifier	 Sorted Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
Double	TokenNameIdentifier	 Double
>	TokenNameGREATER	
MethodOfMomentsNegBin	TokenNameIdentifier	 Method Of Moments Neg Bin
(	TokenNameLPAREN	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
omega	TokenNameIdentifier	 omega
,	TokenNameCOMMA	
double	TokenNamedouble	
prior	TokenNameIdentifier	 prior
)	TokenNameRPAREN	
{	TokenNameLBRACE	
double	TokenNamedouble	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
x	TokenNameIdentifier	 x
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
double	TokenNamedouble	
sumX	TokenNameIdentifier	 sum X
=	TokenNameEQUAL	
0.0	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
sumOmega	TokenNameIdentifier	 sum Omega
=	TokenNameEQUAL	
0.0	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
sumOmega2	TokenNameIdentifier	 sum Omega2
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
x	TokenNameIdentifier	 x
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sumX	TokenNameIdentifier	 sum X
+=	TokenNamePLUS_EQUAL	
x	TokenNameIdentifier	 x
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
sumOmega	TokenNameIdentifier	 sum Omega
+=	TokenNamePLUS_EQUAL	
omega	TokenNameIdentifier	 omega
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
sumOmega2	TokenNameIdentifier	 sum Omega2
+=	TokenNamePLUS_EQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
pow	TokenNameIdentifier	 pow
(	TokenNameLPAREN	
omega	TokenNameIdentifier	 omega
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// compute mu 	TokenNameCOMMENT_LINE	compute mu 
double	TokenNamedouble	
mu	TokenNameIdentifier	 mu
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
sumX	TokenNameIdentifier	 sum X
==	TokenNameEQUAL_EQUAL	
0.0	TokenNameDoubleLiteral	
&&	TokenNameAND_AND	
sumOmega	TokenNameIdentifier	 sum Omega
==	TokenNameEQUAL_EQUAL	
0.0	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
mu	TokenNameIdentifier	 mu
=	TokenNameEQUAL	
prior	TokenNameIdentifier	 prior
/	TokenNameDIVIDE	
(	TokenNameLPAREN	
1.0	TokenNameDoubleLiteral	
/	TokenNameDIVIDE	
REF_LENGTH	TokenNameIdentifier	 REF  LENGTH
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
mu	TokenNameIdentifier	 mu
=	TokenNameEQUAL	
(	TokenNameLPAREN	
sumX	TokenNameIdentifier	 sum X
+	TokenNamePLUS	
prior	TokenNameIdentifier	 prior
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
(	TokenNameLPAREN	
sumOmega	TokenNameIdentifier	 sum Omega
+	TokenNamePLUS	
1.0	TokenNameDoubleLiteral	
/	TokenNameDIVIDE	
REF_LENGTH	TokenNameIdentifier	 REF  LENGTH
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
double	TokenNamedouble	
r	TokenNameIdentifier	 r
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
<=	TokenNameLESS_EQUAL	
1.0	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
r	TokenNameIdentifier	 r
=	TokenNameEQUAL	
0.0	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
r	TokenNameIdentifier	 r
=	TokenNameEQUAL	
(	TokenNameLPAREN	
sumOmega	TokenNameIdentifier	 sum Omega
-	TokenNameMINUS	
sumOmega2	TokenNameIdentifier	 sum Omega2
/	TokenNameDIVIDE	
sumOmega	TokenNameIdentifier	 sum Omega
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
-	TokenNameMINUS	
1.0	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
double	TokenNamedouble	
v	TokenNameIdentifier	 v
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
x	TokenNameIdentifier	 x
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
v	TokenNameIdentifier	 v
+=	TokenNamePLUS_EQUAL	
(	TokenNameLPAREN	
omega	TokenNameIdentifier	 omega
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
*	TokenNameMULTIPLY	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
pow	TokenNameIdentifier	 pow
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
/	TokenNameDIVIDE	
omega	TokenNameIdentifier	 omega
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
-	TokenNameMINUS	
mu	TokenNameIdentifier	 mu
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
-	TokenNameMINUS	
1.0	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
<=	TokenNameLESS_EQUAL	
1.0	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
v	TokenNameIdentifier	 v
=	TokenNameEQUAL	
0.0	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// compute delta 	TokenNameCOMMENT_LINE	compute delta 
double	TokenNamedouble	
d	TokenNameIdentifier	 d
;	TokenNameSEMICOLON	
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
mu	TokenNameIdentifier	 mu
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
*	TokenNameMULTIPLY	
mu	TokenNameIdentifier	 mu
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
mu	TokenNameIdentifier	 mu
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
// 	TokenNameCOMMENT_LINE	 
// Accessory Methods 	TokenNameCOMMENT_LINE	Accessory Methods 
// 	TokenNameCOMMENT_LINE	 
/** Set REF_LENGTH to the desired value */	TokenNameCOMMENT_JAVADOC	 Set REF_LENGTH to the desired value 
public	TokenNamepublic	
void	TokenNamevoid	
setREF_LENGTH	TokenNameIdentifier	 set REF  LENGTH
(	TokenNameLPAREN	
double	TokenNamedouble	
desiredLength	TokenNameIdentifier	 desired Length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
REF_LENGTH	TokenNameIdentifier	 REF  LENGTH
=	TokenNameEQUAL	
desiredLength	TokenNameIdentifier	 desired Length
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Set PDF to the desired value */	TokenNameCOMMENT_JAVADOC	 Set PDF to the desired value 
public	TokenNamepublic	
void	TokenNamevoid	
setPDF	TokenNameIdentifier	 set PDF
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
pdf	TokenNameIdentifier	 pdf
)	TokenNameRPAREN	
{	TokenNameLBRACE	
PDF	TokenNameIdentifier	 PDF
=	TokenNameEQUAL	
pdf	TokenNameIdentifier	 pdf
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Test T1 	TokenNameCOMMENT_LINE	Test T1 
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
SampleDatasets	TokenNameIdentifier	 Sample Datasets
.	TokenNameDOT	
sampleData	TokenNameIdentifier	 sample Data
(	TokenNameLPAREN	
"movies"	TokenNameStringLiteral	movies
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
T1InstanceTransformLearner	TokenNameIdentifier	 T1 Instance Transform Learner
learner	TokenNameIdentifier	 learner
=	TokenNameEQUAL	
new	TokenNamenew	
T1InstanceTransformLearner	TokenNameIdentifier	 T1 Instance Transform Learner
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
learner	TokenNameIdentifier	 learner
.	TokenNameDOT	
setREF_LENGTH	TokenNameIdentifier	 set REF  LENGTH
(	TokenNameLPAREN	
100.0	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
learner	TokenNameIdentifier	 learner
.	TokenNameDOT	
setPDF	TokenNameIdentifier	 set PDF
(	TokenNameLPAREN	
"Poisson"	TokenNameStringLiteral	Poisson
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//learner.setPDF("Negative-Binomial"); 	TokenNameCOMMENT_LINE	learner.setPDF("Negative-Binomial"); 
InstanceTransform	TokenNameIdentifier	 Instance Transform
filter	TokenNameIdentifier	 filter
=	TokenNameEQUAL	
learner	TokenNameIdentifier	 learner
.	TokenNameDOT	
batchTrain	TokenNameIdentifier	 batch Train
(	TokenNameLPAREN	
dataset	TokenNameIdentifier	 dataset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
T1InstanceTransform	TokenNameIdentifier	 T1 Instance Transform
)	TokenNameRPAREN	
filter	TokenNameIdentifier	 filter
)	TokenNameRPAREN	
.	TokenNameDOT	
setALPHA	TokenNameIdentifier	 set ALPHA
(	TokenNameLPAREN	
0.05	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
T1InstanceTransform	TokenNameIdentifier	 T1 Instance Transform
)	TokenNameRPAREN	
filter	TokenNameIdentifier	 filter
)	TokenNameRPAREN	
.	TokenNameDOT	
setMIN_WORDS	TokenNameIdentifier	 set MIN  WORDS
(	TokenNameLPAREN	
50	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
T1InstanceTransform	TokenNameIdentifier	 T1 Instance Transform
)	TokenNameRPAREN	
filter	TokenNameIdentifier	 filter
)	TokenNameRPAREN	
.	TokenNameDOT	
setSAMPLE	TokenNameIdentifier	 set SAMPLE
(	TokenNameLPAREN	
10000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//System.out.println( "old data:\n" + dataset ); 	TokenNameCOMMENT_LINE	System.out.println( "old data:\n" + dataset ); 
dataset	TokenNameIdentifier	 dataset
=	TokenNameEQUAL	
filter	TokenNameIdentifier	 filter
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
(	TokenNameLPAREN	
dataset	TokenNameIdentifier	 dataset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"new data: "	TokenNameStringLiteral	new data: 
+	TokenNamePLUS	
dataset	TokenNameIdentifier	 dataset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
