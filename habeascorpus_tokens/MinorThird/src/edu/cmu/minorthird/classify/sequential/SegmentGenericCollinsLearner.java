/* Copyright 2003-2004, Carnegie Mellon, All Rights Reserved */	TokenNameCOMMENT_BLOCK	 Copyright 2003-2004, Carnegie Mellon, All Rights Reserved 
package	TokenNamepackage	
edu	TokenNameIdentifier	 edu
.	TokenNameDOT	
cmu	TokenNameIdentifier	 cmu
.	TokenNameDOT	
minorthird	TokenNameIdentifier	 minorthird
.	TokenNameDOT	
classify	TokenNameIdentifier	 classify
.	TokenNameDOT	
sequential	TokenNameIdentifier	 sequential
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
Map	TokenNameIdentifier	 Map
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
TreeMap	TokenNameIdentifier	 Tree Map
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
OnlineClassifierLearner	TokenNameIdentifier	 Online Classifier Learner
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
algorithms	TokenNameIdentifier	 algorithms
.	TokenNameDOT	
linear	TokenNameIdentifier	 linear
.	TokenNameDOT	
Hyperplane	TokenNameIdentifier	 Hyperplane
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
algorithms	TokenNameIdentifier	 algorithms
.	TokenNameDOT	
linear	TokenNameIdentifier	 linear
.	TokenNameDOT	
MarginPerceptron	TokenNameIdentifier	 Margin Perceptron
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
sequential	TokenNameIdentifier	 sequential
.	TokenNameDOT	
Segmentation	TokenNameIdentifier	 Segmentation
.	TokenNameDOT	
Segment	TokenNameIdentifier	 Segment
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
ProgressCounter	TokenNameIdentifier	 Progress Counter
;	TokenNameSEMICOLON	
/** * * Semi-markov version of GenericCollinsLearner. * * @author William Cohen */	TokenNameCOMMENT_JAVADOC	 * Semi-markov version of GenericCollinsLearner. * @author William Cohen 
public	TokenNamepublic	
class	TokenNameclass	
SegmentGenericCollinsLearner	TokenNameIdentifier	 Segment Generic Collins Learner
implements	TokenNameimplements	
BatchSegmenterLearner	TokenNameIdentifier	 Batch Segmenter Learner
,	TokenNameCOMMA	
SequenceConstants	TokenNameIdentifier	 Sequence Constants
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
Logger	TokenNameIdentifier	 Logger
log	TokenNameIdentifier	 log
=	TokenNameEQUAL	
Logger	TokenNameIdentifier	 Logger
.	TokenNameDOT	
getLogger	TokenNameIdentifier	 get Logger
(	TokenNameLPAREN	
CollinsPerceptronLearner	TokenNameIdentifier	 Collins Perceptron Learner
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
boolean	TokenNameboolean	
DEBUG	TokenNameIdentifier	 DEBUG
=	TokenNameEQUAL	
log	TokenNameIdentifier	 log
.	TokenNameDOT	
isDebugEnabled	TokenNameIdentifier	 is Debug Enabled
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
OnlineClassifierLearner	TokenNameIdentifier	 Online Classifier Learner
innerLearnerPrototype	TokenNameIdentifier	 inner Learner Prototype
;	TokenNameSEMICOLON	
private	TokenNameprivate	
OnlineClassifierLearner	TokenNameIdentifier	 Online Classifier Learner
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
innerLearner	TokenNameIdentifier	 inner Learner
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
numberOfEpochs	TokenNameIdentifier	 number Of Epochs
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
maxSegmentSize	TokenNameIdentifier	 max Segment Size
;	TokenNameSEMICOLON	
public	TokenNamepublic	
SegmentGenericCollinsLearner	TokenNameIdentifier	 Segment Generic Collins Learner
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
new	TokenNamenew	
MarginPerceptron	TokenNameIdentifier	 Margin Perceptron
(	TokenNameLPAREN	
0.0	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
SegmentGenericCollinsLearner	TokenNameIdentifier	 Segment Generic Collins Learner
(	TokenNameLPAREN	
OnlineClassifierLearner	TokenNameIdentifier	 Online Classifier Learner
innerLearner	TokenNameIdentifier	 inner Learner
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
innerLearner	TokenNameIdentifier	 inner Learner
,	TokenNameCOMMA	
5	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
SegmentGenericCollinsLearner	TokenNameIdentifier	 Segment Generic Collins Learner
(	TokenNameLPAREN	
int	TokenNameint	
epochs	TokenNameIdentifier	 epochs
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
new	TokenNamenew	
MarginPerceptron	TokenNameIdentifier	 Margin Perceptron
(	TokenNameLPAREN	
0.0	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
epochs	TokenNameIdentifier	 epochs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
SegmentGenericCollinsLearner	TokenNameIdentifier	 Segment Generic Collins Learner
(	TokenNameLPAREN	
OnlineClassifierLearner	TokenNameIdentifier	 Online Classifier Learner
innerLearner	TokenNameIdentifier	 inner Learner
,	TokenNameCOMMA	
int	TokenNameint	
epochs	TokenNameIdentifier	 epochs
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
innerLearner	TokenNameIdentifier	 inner Learner
,	TokenNameCOMMA	
4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
epochs	TokenNameIdentifier	 epochs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
SegmentGenericCollinsLearner	TokenNameIdentifier	 Segment Generic Collins Learner
(	TokenNameLPAREN	
OnlineClassifierLearner	TokenNameIdentifier	 Online Classifier Learner
innerLearner	TokenNameIdentifier	 inner Learner
,	TokenNameCOMMA	
int	TokenNameint	
maxSegmentSize	TokenNameIdentifier	 max Segment Size
,	TokenNameCOMMA	
int	TokenNameint	
epochs	TokenNameIdentifier	 epochs
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
maxSegmentSize	TokenNameIdentifier	 max Segment Size
=	TokenNameEQUAL	
maxSegmentSize	TokenNameIdentifier	 max Segment Size
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
innerLearnerPrototype	TokenNameIdentifier	 inner Learner Prototype
=	TokenNameEQUAL	
innerLearner	TokenNameIdentifier	 inner Learner
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
numberOfEpochs	TokenNameIdentifier	 number Of Epochs
=	TokenNameEQUAL	
epochs	TokenNameIdentifier	 epochs
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
// 	TokenNameCOMMENT_LINE	 
// accessors 	TokenNameCOMMENT_LINE	accessors 
// 	TokenNameCOMMENT_LINE	 
public	TokenNamepublic	
OnlineClassifierLearner	TokenNameIdentifier	 Online Classifier Learner
getInnerLearner	TokenNameIdentifier	 get Inner Learner
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
innerLearnerPrototype	TokenNameIdentifier	 inner Learner Prototype
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setInnerLearner	TokenNameIdentifier	 set Inner Learner
(	TokenNameLPAREN	
OnlineClassifierLearner	TokenNameIdentifier	 Online Classifier Learner
newInnerLearner	TokenNameIdentifier	 new Inner Learner
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
innerLearnerPrototype	TokenNameIdentifier	 inner Learner Prototype
=	TokenNameEQUAL	
newInnerLearner	TokenNameIdentifier	 new Inner Learner
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getHistorySize	TokenNameIdentifier	 get History Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getNumberOfEpochs	TokenNameIdentifier	 get Number Of Epochs
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
numberOfEpochs	TokenNameIdentifier	 number Of Epochs
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setNumberOfEpochs	TokenNameIdentifier	 set Number Of Epochs
(	TokenNameLPAREN	
int	TokenNameint	
newNumberOfEpochs	TokenNameIdentifier	 new Number Of Epochs
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
numberOfEpochs	TokenNameIdentifier	 number Of Epochs
=	TokenNameEQUAL	
newNumberOfEpochs	TokenNameIdentifier	 new Number Of Epochs
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
Segmenter	TokenNameIdentifier	 Segmenter
batchTrain	TokenNameIdentifier	 batch Train
(	TokenNameLPAREN	
SegmentDataset	TokenNameIdentifier	 Segment Dataset
dataset	TokenNameIdentifier	 dataset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ExampleSchema	TokenNameIdentifier	 Example Schema
schema	TokenNameIdentifier	 schema
=	TokenNameEQUAL	
dataset	TokenNameIdentifier	 dataset
.	TokenNameDOT	
getSchema	TokenNameIdentifier	 get Schema
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
innerLearner	TokenNameIdentifier	 inner Learner
=	TokenNameEQUAL	
SequenceUtils	TokenNameIdentifier	 Sequence Utils
.	TokenNameDOT	
duplicatePrototypeLearner	TokenNameIdentifier	 duplicate Prototype Learner
(	TokenNameLPAREN	
innerLearnerPrototype	TokenNameIdentifier	 inner Learner Prototype
,	TokenNameCOMMA	
schema	TokenNameIdentifier	 schema
.	TokenNameDOT	
getNumberOfClasses	TokenNameIdentifier	 get Number Of Classes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ProgressCounter	TokenNameIdentifier	 Progress Counter
pc	TokenNameIdentifier	 pc
=	TokenNameEQUAL	
new	TokenNamenew	
ProgressCounter	TokenNameIdentifier	 Progress Counter
(	TokenNameLPAREN	
"training segments "	TokenNameStringLiteral	training segments 
+	TokenNamePLUS	
innerLearnerPrototype	TokenNameIdentifier	 inner Learner Prototype
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"sequence"	TokenNameStringLiteral	sequence
,	TokenNameCOMMA	
numberOfEpochs	TokenNameIdentifier	 number Of Epochs
*	TokenNameMULTIPLY	
dataset	TokenNameIdentifier	 dataset
.	TokenNameDOT	
getNumberOfSegmentGroups	TokenNameIdentifier	 get Number Of Segment Groups
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
epoch	TokenNameIdentifier	 epoch
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
epoch	TokenNameIdentifier	 epoch
<	TokenNameLESS	
numberOfEpochs	TokenNameIdentifier	 number Of Epochs
;	TokenNameSEMICOLON	
epoch	TokenNameIdentifier	 epoch
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//dataset.shuffle(); 	TokenNameCOMMENT_LINE	dataset.shuffle(); 
// statistics for curious researchers 	TokenNameCOMMENT_LINE	statistics for curious researchers 
int	TokenNameint	
sequenceErrors	TokenNameIdentifier	 sequence Errors
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
transitionErrors	TokenNameIdentifier	 transition Errors
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
transitions	TokenNameIdentifier	 transitions
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
CandidateSegmentGroup	TokenNameIdentifier	 Candidate Segment Group
>	TokenNameGREATER	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
dataset	TokenNameIdentifier	 dataset
.	TokenNameDOT	
candidateSegmentGroupIterator	TokenNameIdentifier	 candidate Segment Group Iterator
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
Classifier	TokenNameIdentifier	 Classifier
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
new	TokenNamenew	
SequenceUtils	TokenNameIdentifier	 Sequence Utils
.	TokenNameDOT	
MultiClassClassifier	TokenNameIdentifier	 Multi Class Classifier
(	TokenNameLPAREN	
schema	TokenNameIdentifier	 schema
,	TokenNameCOMMA	
innerLearner	TokenNameIdentifier	 inner Learner
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG	TokenNameIdentifier	 DEBUG
)	TokenNameRPAREN	
log	TokenNameIdentifier	 log
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"classifier is: "	TokenNameStringLiteral	classifier is: 
+	TokenNamePLUS	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
CandidateSegmentGroup	TokenNameIdentifier	 Candidate Segment Group
g	TokenNameIdentifier	 g
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Segmentation	TokenNameIdentifier	 Segmentation
viterbi	TokenNameIdentifier	 viterbi
=	TokenNameEQUAL	
new	TokenNamenew	
SegmentCollinsPerceptronLearner	TokenNameIdentifier	 Segment Collins Perceptron Learner
.	TokenNameDOT	
ViterbiSearcher	TokenNameIdentifier	 Viterbi Searcher
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
,	TokenNameCOMMA	
schema	TokenNameIdentifier	 schema
,	TokenNameCOMMA	
maxSegmentSize	TokenNameIdentifier	 max Segment Size
)	TokenNameRPAREN	
.	TokenNameDOT	
bestSegments	TokenNameIdentifier	 best Segments
(	TokenNameLPAREN	
g	TokenNameIdentifier	 g
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG	TokenNameIdentifier	 DEBUG
)	TokenNameRPAREN	
log	TokenNameIdentifier	 log
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"viterbi "	TokenNameStringLiteral	viterbi 
+	TokenNamePLUS	
maxSegmentSize	TokenNameIdentifier	 max Segment Size
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
viterbi	TokenNameIdentifier	 viterbi
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Segmentation	TokenNameIdentifier	 Segmentation
correct	TokenNameIdentifier	 correct
=	TokenNameEQUAL	
correctSegments	TokenNameIdentifier	 correct Segments
(	TokenNameLPAREN	
g	TokenNameIdentifier	 g
,	TokenNameCOMMA	
schema	TokenNameIdentifier	 schema
,	TokenNameCOMMA	
maxSegmentSize	TokenNameIdentifier	 max Segment Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG	TokenNameIdentifier	 DEBUG
)	TokenNameRPAREN	
log	TokenNameIdentifier	 log
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"correct segments: "	TokenNameStringLiteral	correct segments: 
+	TokenNamePLUS	
correct	TokenNameIdentifier	 correct
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
errorOnThisSequence	TokenNameIdentifier	 error On This Sequence
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
// accumulate weights for transitions associated with each class k 	TokenNameCOMMENT_LINE	accumulate weights for transitions associated with each class k 
Hyperplane	TokenNameIdentifier	 Hyperplane
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
accumPos	TokenNameIdentifier	 accum Pos
=	TokenNameEQUAL	
new	TokenNamenew	
Hyperplane	TokenNameIdentifier	 Hyperplane
[	TokenNameLBRACKET	
schema	TokenNameIdentifier	 schema
.	TokenNameDOT	
getNumberOfClasses	TokenNameIdentifier	 get Number Of Classes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
Hyperplane	TokenNameIdentifier	 Hyperplane
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
accumNeg	TokenNameIdentifier	 accum Neg
=	TokenNameEQUAL	
new	TokenNamenew	
Hyperplane	TokenNameIdentifier	 Hyperplane
[	TokenNameLBRACKET	
schema	TokenNameIdentifier	 schema
.	TokenNameDOT	
getNumberOfClasses	TokenNameIdentifier	 get Number Of Classes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
k	TokenNameIdentifier	 k
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
k	TokenNameIdentifier	 k
<	TokenNameLESS	
schema	TokenNameIdentifier	 schema
.	TokenNameDOT	
getNumberOfClasses	TokenNameIdentifier	 get Number Of Classes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
k	TokenNameIdentifier	 k
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
accumPos	TokenNameIdentifier	 accum Pos
[	TokenNameLBRACKET	
k	TokenNameIdentifier	 k
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
Hyperplane	TokenNameIdentifier	 Hyperplane
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
accumNeg	TokenNameIdentifier	 accum Neg
[	TokenNameLBRACKET	
k	TokenNameIdentifier	 k
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
Hyperplane	TokenNameIdentifier	 Hyperplane
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
fp	TokenNameIdentifier	 fp
=	TokenNameEQUAL	
compareSegmentsAndIncrement	TokenNameIdentifier	 compare Segments And Increment
(	TokenNameLPAREN	
schema	TokenNameIdentifier	 schema
,	TokenNameCOMMA	
viterbi	TokenNameIdentifier	 viterbi
,	TokenNameCOMMA	
correct	TokenNameIdentifier	 correct
,	TokenNameCOMMA	
accumNeg	TokenNameIdentifier	 accum Neg
,	TokenNameCOMMA	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
g	TokenNameIdentifier	 g
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fp	TokenNameIdentifier	 fp
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
errorOnThisSequence	TokenNameIdentifier	 error On This Sequence
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
int	TokenNameint	
fn	TokenNameIdentifier	 fn
=	TokenNameEQUAL	
compareSegmentsAndIncrement	TokenNameIdentifier	 compare Segments And Increment
(	TokenNameLPAREN	
schema	TokenNameIdentifier	 schema
,	TokenNameCOMMA	
correct	TokenNameIdentifier	 correct
,	TokenNameCOMMA	
viterbi	TokenNameIdentifier	 viterbi
,	TokenNameCOMMA	
accumPos	TokenNameIdentifier	 accum Pos
,	TokenNameCOMMA	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
g	TokenNameIdentifier	 g
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fn	TokenNameIdentifier	 fn
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
errorOnThisSequence	TokenNameIdentifier	 error On This Sequence
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
errorOnThisSequence	TokenNameIdentifier	 error On This Sequence
)	TokenNameRPAREN	
sequenceErrors	TokenNameIdentifier	 sequence Errors
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
transitionErrors	TokenNameIdentifier	 transition Errors
+=	TokenNamePLUS_EQUAL	
fp	TokenNameIdentifier	 fp
+	TokenNamePLUS	
fn	TokenNameIdentifier	 fn
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
errorOnThisSequence	TokenNameIdentifier	 error On This Sequence
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sequenceErrors	TokenNameIdentifier	 sequence Errors
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
subPopId	TokenNameIdentifier	 sub Pop Id
=	TokenNameEQUAL	
g	TokenNameIdentifier	 g
.	TokenNameDOT	
getSubpopulationId	TokenNameIdentifier	 get Subpopulation Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Object	TokenNameIdentifier	 Object
source	TokenNameIdentifier	 source
=	TokenNameEQUAL	
"no source"	TokenNameStringLiteral	no source
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
k	TokenNameIdentifier	 k
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
k	TokenNameIdentifier	 k
<	TokenNameLESS	
schema	TokenNameIdentifier	 schema
.	TokenNameDOT	
getNumberOfClasses	TokenNameIdentifier	 get Number Of Classes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
k	TokenNameIdentifier	 k
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//System.out.println("adding class="+k+" example: "+accumPos[k]); 	TokenNameCOMMENT_LINE	System.out.println("adding class="+k+" example: "+accumPos[k]); 
innerLearner	TokenNameIdentifier	 inner Learner
[	TokenNameLBRACKET	
k	TokenNameIdentifier	 k
]	TokenNameRBRACKET	
.	TokenNameDOT	
addExample	TokenNameIdentifier	 add Example
(	TokenNameLPAREN	
new	TokenNamenew	
Example	TokenNameIdentifier	 Example
(	TokenNameLPAREN	
new	TokenNamenew	
HyperplaneInstance	TokenNameIdentifier	 Hyperplane Instance
(	TokenNameLPAREN	
accumPos	TokenNameIdentifier	 accum Pos
[	TokenNameLBRACKET	
k	TokenNameIdentifier	 k
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
subPopId	TokenNameIdentifier	 sub Pop Id
,	TokenNameCOMMA	
source	TokenNameIdentifier	 source
)	TokenNameRPAREN	
,	TokenNameCOMMA	
ClassLabel	TokenNameIdentifier	 Class Label
.	TokenNameDOT	
positiveLabel	TokenNameIdentifier	 positive Label
(	TokenNameLPAREN	
+	TokenNamePLUS	
1.0	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
innerLearner	TokenNameIdentifier	 inner Learner
[	TokenNameLBRACKET	
k	TokenNameIdentifier	 k
]	TokenNameRBRACKET	
.	TokenNameDOT	
addExample	TokenNameIdentifier	 add Example
(	TokenNameLPAREN	
new	TokenNamenew	
Example	TokenNameIdentifier	 Example
(	TokenNameLPAREN	
new	TokenNamenew	
HyperplaneInstance	TokenNameIdentifier	 Hyperplane Instance
(	TokenNameLPAREN	
accumNeg	TokenNameIdentifier	 accum Neg
[	TokenNameLBRACKET	
k	TokenNameIdentifier	 k
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
subPopId	TokenNameIdentifier	 sub Pop Id
,	TokenNameCOMMA	
source	TokenNameIdentifier	 source
)	TokenNameRPAREN	
,	TokenNameCOMMA	
ClassLabel	TokenNameIdentifier	 Class Label
.	TokenNameDOT	
negativeLabel	TokenNameIdentifier	 negative Label
(	TokenNameLPAREN	
-	TokenNameMINUS	
1.0	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
transitions	TokenNameIdentifier	 transitions
+=	TokenNamePLUS_EQUAL	
correct	TokenNameIdentifier	 correct
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pc	TokenNameIdentifier	 pc
.	TokenNameDOT	
progress	TokenNameIdentifier	 progress
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// sequence i 	TokenNameCOMMENT_LINE	sequence i 
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Epoch "	TokenNameStringLiteral	Epoch 
+	TokenNamePLUS	
epoch	TokenNameIdentifier	 epoch
+	TokenNamePLUS	
": sequenceErr="	TokenNameStringLiteral	: sequenceErr=
+	TokenNamePLUS	
sequenceErrors	TokenNameIdentifier	 sequence Errors
+	TokenNamePLUS	
" transitionErrors="	TokenNameStringLiteral	 transitionErrors=
+	TokenNamePLUS	
transitionErrors	TokenNameIdentifier	 transition Errors
+	TokenNamePLUS	
"/"	TokenNameStringLiteral	/
+	TokenNamePLUS	
transitions	TokenNameIdentifier	 transitions
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
transitionErrors	TokenNameIdentifier	 transition Errors
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// epoch 	TokenNameCOMMENT_LINE	epoch 
pc	TokenNameIdentifier	 pc
.	TokenNameDOT	
finished	TokenNameIdentifier	 finished
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
k	TokenNameIdentifier	 k
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
k	TokenNameIdentifier	 k
<	TokenNameLESS	
schema	TokenNameIdentifier	 schema
.	TokenNameDOT	
getNumberOfClasses	TokenNameIdentifier	 get Number Of Classes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
k	TokenNameIdentifier	 k
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
innerLearner	TokenNameIdentifier	 inner Learner
[	TokenNameLBRACKET	
k	TokenNameIdentifier	 k
]	TokenNameRBRACKET	
.	TokenNameDOT	
completeTraining	TokenNameIdentifier	 complete Training
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Classifier	TokenNameIdentifier	 Classifier
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
new	TokenNamenew	
SequenceUtils	TokenNameIdentifier	 Sequence Utils
.	TokenNameDOT	
MultiClassClassifier	TokenNameIdentifier	 Multi Class Classifier
(	TokenNameLPAREN	
schema	TokenNameIdentifier	 schema
,	TokenNameCOMMA	
innerLearner	TokenNameIdentifier	 inner Learner
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
SegmentCollinsPerceptronLearner	TokenNameIdentifier	 Segment Collins Perceptron Learner
.	TokenNameDOT	
ViterbiSegmenter	TokenNameIdentifier	 Viterbi Segmenter
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
,	TokenNameCOMMA	
schema	TokenNameIdentifier	 schema
,	TokenNameCOMMA	
maxSegmentSize	TokenNameIdentifier	 max Segment Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Compare the target segments to the 'otherSegments', and update * the classifier by sum_x [delta*x], for each example x * corresponding to a target segment that's not in otherSegments. */	TokenNameCOMMENT_JAVADOC	 Compare the target segments to the 'otherSegments', and update the classifier by sum_x [delta*x], for each example x corresponding to a target segment that's not in otherSegments. 
private	TokenNameprivate	
int	TokenNameint	
compareSegmentsAndIncrement	TokenNameIdentifier	 compare Segments And Increment
(	TokenNameLPAREN	
ExampleSchema	TokenNameIdentifier	 Example Schema
schema	TokenNameIdentifier	 schema
,	TokenNameCOMMA	
Segmentation	TokenNameIdentifier	 Segmentation
segments	TokenNameIdentifier	 segments
,	TokenNameCOMMA	
Segmentation	TokenNameIdentifier	 Segmentation
otherSegments	TokenNameIdentifier	 other Segments
,	TokenNameCOMMA	
Hyperplane	TokenNameIdentifier	 Hyperplane
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
accum	TokenNameIdentifier	 accum
,	TokenNameCOMMA	
double	TokenNamedouble	
delta	TokenNameIdentifier	 delta
,	TokenNameCOMMA	
CandidateSegmentGroup	TokenNameIdentifier	 Candidate Segment Group
g	TokenNameIdentifier	 g
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
errors	TokenNameIdentifier	 errors
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// first, work out the name of the previous class for each segment 	TokenNameCOMMENT_LINE	first, work out the name of the previous class for each segment 
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
Segment	TokenNameIdentifier	 Segment
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
map	TokenNameIdentifier	 map
=	TokenNameEQUAL	
previousClassMap	TokenNameIdentifier	 previous Class Map
(	TokenNameLPAREN	
segments	TokenNameIdentifier	 segments
,	TokenNameCOMMA	
schema	TokenNameIdentifier	 schema
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
Segment	TokenNameIdentifier	 Segment
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
otherMap	TokenNameIdentifier	 other Map
=	TokenNameEQUAL	
previousClassMap	TokenNameIdentifier	 previous Class Map
(	TokenNameLPAREN	
otherSegments	TokenNameIdentifier	 other Segments
,	TokenNameCOMMA	
schema	TokenNameIdentifier	 schema
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
history	TokenNameIdentifier	 history
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Segment	TokenNameIdentifier	 Segment
>	TokenNameGREATER	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
segments	TokenNameIdentifier	 segments
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
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
Segmentation	TokenNameIdentifier	 Segmentation
.	TokenNameDOT	
Segment	TokenNameIdentifier	 Segment
seg	TokenNameIdentifier	 seg
=	TokenNameEQUAL	
j	TokenNameIdentifier	 j
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
previousClass	TokenNameIdentifier	 previous Class
=	TokenNameEQUAL	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
seg	TokenNameIdentifier	 seg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
seg	TokenNameIdentifier	 seg
.	TokenNameDOT	
lo	TokenNameIdentifier	 lo
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
!	TokenNameNOT	
otherSegments	TokenNameIdentifier	 other Segments
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
seg	TokenNameIdentifier	 seg
)	TokenNameRPAREN	
||	TokenNameOR_OR	
!	TokenNameNOT	
otherMap	TokenNameIdentifier	 other Map
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
seg	TokenNameIdentifier	 seg
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
previousClass	TokenNameIdentifier	 previous Class
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
errors	TokenNameIdentifier	 errors
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
history	TokenNameIdentifier	 history
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
previousClass	TokenNameIdentifier	 previous Class
;	TokenNameSEMICOLON	
Instance	TokenNameIdentifier	 Instance
instance	TokenNameIdentifier	 instance
=	TokenNameEQUAL	
new	TokenNamenew	
InstanceFromSequence	TokenNameIdentifier	 Instance From Sequence
(	TokenNameLPAREN	
g	TokenNameIdentifier	 g
.	TokenNameDOT	
getSubsequenceExample	TokenNameIdentifier	 get Subsequence Example
(	TokenNameLPAREN	
seg	TokenNameIdentifier	 seg
.	TokenNameDOT	
lo	TokenNameIdentifier	 lo
,	TokenNameCOMMA	
seg	TokenNameIdentifier	 seg
.	TokenNameDOT	
hi	TokenNameIdentifier	 hi
)	TokenNameRPAREN	
,	TokenNameCOMMA	
history	TokenNameIdentifier	 history
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG	TokenNameIdentifier	 DEBUG
)	TokenNameRPAREN	
log	TokenNameIdentifier	 log
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"class "	TokenNameStringLiteral	class 
+	TokenNamePLUS	
schema	TokenNameIdentifier	 schema
.	TokenNameDOT	
getClassName	TokenNameIdentifier	 get Class Name
(	TokenNameLPAREN	
seg	TokenNameIdentifier	 seg
.	TokenNameDOT	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
+	TokenNamePLUS	
" update "	TokenNameStringLiteral	 update 
+	TokenNamePLUS	
delta	TokenNameIdentifier	 delta
+	TokenNamePLUS	
" for: "	TokenNameStringLiteral	 for: 
+	TokenNamePLUS	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
getSource	TokenNameIdentifier	 get Source
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
accum	TokenNameIdentifier	 accum
[	TokenNameLBRACKET	
seg	TokenNameIdentifier	 seg
.	TokenNameDOT	
y	TokenNameIdentifier	 y
]	TokenNameRBRACKET	
.	TokenNameDOT	
increment	TokenNameIdentifier	 increment
(	TokenNameLPAREN	
instance	TokenNameIdentifier	 instance
,	TokenNameCOMMA	
delta	TokenNameIdentifier	 delta
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
errors	TokenNameIdentifier	 errors
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Build a mapping from segment to string name of previous segment. * This should let you look up segments which are logically * equivalent, as well as ones which are pointer-equivalent (==) */	TokenNameCOMMENT_JAVADOC	 Build a mapping from segment to string name of previous segment. This should let you look up segments which are logically equivalent, as well as ones which are pointer-equivalent (==) 
private	TokenNameprivate	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
Segment	TokenNameIdentifier	 Segment
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
previousClassMap	TokenNameIdentifier	 previous Class Map
(	TokenNameLPAREN	
Segmentation	TokenNameIdentifier	 Segmentation
segments	TokenNameIdentifier	 segments
,	TokenNameCOMMA	
ExampleSchema	TokenNameIdentifier	 Example Schema
schema	TokenNameIdentifier	 schema
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// use a treemap so that logically equivalent segments be mapped to same previousClass 	TokenNameCOMMENT_LINE	use a treemap so that logically equivalent segments be mapped to same previousClass 
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
Segment	TokenNameIdentifier	 Segment
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
map	TokenNameIdentifier	 map
=	TokenNameEQUAL	
new	TokenNamenew	
TreeMap	TokenNameIdentifier	 Tree Map
<	TokenNameLESS	
Segment	TokenNameIdentifier	 Segment
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Segmentation	TokenNameIdentifier	 Segmentation
.	TokenNameDOT	
Segment	TokenNameIdentifier	 Segment
previousSeg	TokenNameIdentifier	 previous Seg
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Segment	TokenNameIdentifier	 Segment
>	TokenNameGREATER	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
segments	TokenNameIdentifier	 segments
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
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
Segmentation	TokenNameIdentifier	 Segmentation
.	TokenNameDOT	
Segment	TokenNameIdentifier	 Segment
seg	TokenNameIdentifier	 seg
=	TokenNameEQUAL	
j	TokenNameIdentifier	 j
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
previousClassName	TokenNameIdentifier	 previous Class Name
=	TokenNameEQUAL	
previousSeg	TokenNameIdentifier	 previous Seg
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
NULL_CLASS_NAME	TokenNameIdentifier	 NULL  CLASS  NAME
:	TokenNameCOLON	
schema	TokenNameIdentifier	 schema
.	TokenNameDOT	
getClassName	TokenNameIdentifier	 get Class Name
(	TokenNameLPAREN	
previousSeg	TokenNameIdentifier	 previous Seg
.	TokenNameDOT	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
seg	TokenNameIdentifier	 seg
,	TokenNameCOMMA	
previousClassName	TokenNameIdentifier	 previous Class Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
previousSeg	TokenNameIdentifier	 previous Seg
=	TokenNameEQUAL	
seg	TokenNameIdentifier	 seg
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
map	TokenNameIdentifier	 map
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Collect the correct segments for this example. These are defined as * all segments with non-NEGATIVE labels, and all unit-length negative labels * not inside a positives label. */	TokenNameCOMMENT_JAVADOC	 Collect the correct segments for this example. These are defined as all segments with non-NEGATIVE labels, and all unit-length negative labels not inside a positives label. 
private	TokenNameprivate	
Segmentation	TokenNameIdentifier	 Segmentation
correctSegments	TokenNameIdentifier	 correct Segments
(	TokenNameLPAREN	
CandidateSegmentGroup	TokenNameIdentifier	 Candidate Segment Group
g	TokenNameIdentifier	 g
,	TokenNameCOMMA	
ExampleSchema	TokenNameIdentifier	 Example Schema
schema	TokenNameIdentifier	 schema
,	TokenNameCOMMA	
int	TokenNameint	
maxSegmentSize	TokenNameIdentifier	 max Segment Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Segmentation	TokenNameIdentifier	 Segmentation
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
new	TokenNamenew	
Segmentation	TokenNameIdentifier	 Segmentation
(	TokenNameLPAREN	
schema	TokenNameIdentifier	 schema
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
pos	TokenNameIdentifier	 pos
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
pos	TokenNameIdentifier	 pos
<	TokenNameLESS	
g	TokenNameIdentifier	 g
.	TokenNameDOT	
getSequenceLength	TokenNameIdentifier	 get Sequence Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
boolean	TokenNameboolean	
addedASegmentStartingAtPos	TokenNameIdentifier	 added A Segment Starting At Pos
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
len	TokenNameIdentifier	 len
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
!	TokenNameNOT	
addedASegmentStartingAtPos	TokenNameIdentifier	 added A Segment Starting At Pos
&&	TokenNameAND_AND	
len	TokenNameIdentifier	 len
<=	TokenNameLESS_EQUAL	
maxSegmentSize	TokenNameIdentifier	 max Segment Size
;	TokenNameSEMICOLON	
len	TokenNameIdentifier	 len
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Instance	TokenNameIdentifier	 Instance
inst	TokenNameIdentifier	 inst
=	TokenNameEQUAL	
g	TokenNameIdentifier	 g
.	TokenNameDOT	
getSubsequenceInstance	TokenNameIdentifier	 get Subsequence Instance
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
,	TokenNameCOMMA	
pos	TokenNameIdentifier	 pos
+	TokenNamePLUS	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ClassLabel	TokenNameIdentifier	 Class Label
label	TokenNameIdentifier	 label
=	TokenNameEQUAL	
g	TokenNameIdentifier	 g
.	TokenNameDOT	
getSubsequenceLabel	TokenNameIdentifier	 get Subsequence Label
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
,	TokenNameCOMMA	
pos	TokenNameIdentifier	 pos
+	TokenNamePLUS	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
inst	TokenNameIdentifier	 inst
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
!	TokenNameNOT	
label	TokenNameIdentifier	 label
.	TokenNameDOT	
isNegative	TokenNameIdentifier	 is Negative
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
Segmentation	TokenNameIdentifier	 Segmentation
.	TokenNameDOT	
Segment	TokenNameIdentifier	 Segment
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
,	TokenNameCOMMA	
pos	TokenNameIdentifier	 pos
+	TokenNamePLUS	
len	TokenNameIdentifier	 len
,	TokenNameCOMMA	
schema	TokenNameIdentifier	 schema
.	TokenNameDOT	
getClassIndex	TokenNameIdentifier	 get Class Index
(	TokenNameLPAREN	
label	TokenNameIdentifier	 label
.	TokenNameDOT	
bestClassName	TokenNameIdentifier	 best Class Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
addedASegmentStartingAtPos	TokenNameIdentifier	 added A Segment Starting At Pos
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
pos	TokenNameIdentifier	 pos
+=	TokenNamePLUS_EQUAL	
len	TokenNameIdentifier	 len
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
addedASegmentStartingAtPos	TokenNameIdentifier	 added A Segment Starting At Pos
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Instance inst = g.getSubsequenceInstance(pos,pos+1); 	TokenNameCOMMENT_LINE	Instance inst = g.getSubsequenceInstance(pos,pos+1); 
// ClassLabel label = g.getSubsequenceLabel(pos,pos+1); 	TokenNameCOMMENT_LINE	ClassLabel label = g.getSubsequenceLabel(pos,pos+1); 
result	TokenNameIdentifier	 result
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
Segmentation	TokenNameIdentifier	 Segmentation
.	TokenNameDOT	
Segment	TokenNameIdentifier	 Segment
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
,	TokenNameCOMMA	
pos	TokenNameIdentifier	 pos
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
schema	TokenNameIdentifier	 schema
.	TokenNameDOT	
getClassIndex	TokenNameIdentifier	 get Class Index
(	TokenNameLPAREN	
ExampleSchema	TokenNameIdentifier	 Example Schema
.	TokenNameDOT	
NEG_CLASS_NAME	TokenNameIdentifier	 NEG  CLASS  NAME
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pos	TokenNameIdentifier	 pos
+=	TokenNamePLUS_EQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
