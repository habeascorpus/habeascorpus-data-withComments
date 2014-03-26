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
edu	TokenNameIdentifier	 edu
.	TokenNameDOT	
cmu	TokenNameIdentifier	 cmu
.	TokenNameDOT	
minorthird	TokenNameIdentifier	 minorthird
.	TokenNameDOT	
classify	TokenNameIdentifier	 classify
.	TokenNameDOT	
*	TokenNameMULTIPLY	
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
*	TokenNameMULTIPLY	
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
*	TokenNameMULTIPLY	
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
*	TokenNameMULTIPLY	
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
*	TokenNameMULTIPLY	
;	TokenNameSEMICOLON	
/** * 'Generic' version of Collin's voted perceptron learner. * * <p>As of May 9, 2004, this is a different algorithm, which is much * more like Collin's original method. The 'old' implementation is in * GenericCollinsLearnerV1. * * @author William Cohen */	TokenNameCOMMENT_JAVADOC	 'Generic' version of Collin's voted perceptron learner. * <p>As of May 9, 2004, this is a different algorithm, which is much more like Collin's original method. The 'old' implementation is in GenericCollinsLearnerV1. * @author William Cohen 
public	TokenNamepublic	
class	TokenNameclass	
GenericCollinsLearner	TokenNameIdentifier	 Generic Collins Learner
implements	TokenNameimplements	
BatchSequenceClassifierLearner	TokenNameIdentifier	 Batch Sequence Classifier Learner
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
historySize	TokenNameIdentifier	 history Size
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
numberOfEpochs	TokenNameIdentifier	 number Of Epochs
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
history	TokenNameIdentifier	 history
;	TokenNameSEMICOLON	
public	TokenNamepublic	
GenericCollinsLearner	TokenNameIdentifier	 Generic Collins Learner
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
GenericCollinsLearner	TokenNameIdentifier	 Generic Collins Learner
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
GenericCollinsLearner	TokenNameIdentifier	 Generic Collins Learner
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
GenericCollinsLearner	TokenNameIdentifier	 Generic Collins Learner
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
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
epochs	TokenNameIdentifier	 epochs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
GenericCollinsLearner	TokenNameIdentifier	 Generic Collins Learner
(	TokenNameLPAREN	
OnlineClassifierLearner	TokenNameIdentifier	 Online Classifier Learner
innerLearner	TokenNameIdentifier	 inner Learner
,	TokenNameCOMMA	
int	TokenNameint	
historySize	TokenNameIdentifier	 history Size
,	TokenNameCOMMA	
int	TokenNameint	
epochs	TokenNameIdentifier	 epochs
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
historySize	TokenNameIdentifier	 history Size
=	TokenNameEQUAL	
historySize	TokenNameIdentifier	 history Size
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
this	TokenNamethis	
.	TokenNameDOT	
history	TokenNameIdentifier	 history
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
historySize	TokenNameIdentifier	 history Size
]	TokenNameRBRACKET	
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
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
getHistorySize	TokenNameIdentifier	 get History Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
historySize	TokenNameIdentifier	 history Size
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setHistorySize	TokenNameIdentifier	 set History Size
(	TokenNameLPAREN	
int	TokenNameint	
newHistorySize	TokenNameIdentifier	 new History Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
historySize	TokenNameIdentifier	 history Size
=	TokenNameEQUAL	
newHistorySize	TokenNameIdentifier	 new History Size
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
SequenceClassifier	TokenNameIdentifier	 Sequence Classifier
batchTrain	TokenNameIdentifier	 batch Train
(	TokenNameLPAREN	
SequenceDataset	TokenNameIdentifier	 Sequence Dataset
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
"training sequential "	TokenNameStringLiteral	training sequential 
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
numberOfSequences	TokenNameIdentifier	 number Of Sequences
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
dataset	TokenNameIdentifier	 dataset
.	TokenNameDOT	
shuffle	TokenNameIdentifier	 shuffle
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
Example	TokenNameIdentifier	 Example
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
>	TokenNameGREATER	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
dataset	TokenNameIdentifier	 dataset
.	TokenNameDOT	
sequenceIterator	TokenNameIdentifier	 sequence Iterator
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
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
sequence	TokenNameIdentifier	 sequence
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
ClassLabel	TokenNameIdentifier	 Class Label
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
viterbi	TokenNameIdentifier	 viterbi
=	TokenNameEQUAL	
new	TokenNamenew	
BeamSearcher	TokenNameIdentifier	 Beam Searcher
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
,	TokenNameCOMMA	
historySize	TokenNameIdentifier	 history Size
,	TokenNameCOMMA	
schema	TokenNameIdentifier	 schema
)	TokenNameRPAREN	
.	TokenNameDOT	
bestLabelSequence	TokenNameIdentifier	 best Label Sequence
(	TokenNameLPAREN	
sequence	TokenNameIdentifier	 sequence
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
"classifier: "	TokenNameStringLiteral	classifier: 
+	TokenNamePLUS	
c	TokenNameIdentifier	 c
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
"viterbi: "	TokenNameStringLiteral	viterbi: 
+	TokenNamePLUS	
StringUtil	TokenNameIdentifier	 String Util
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
viterbi	TokenNameIdentifier	 viterbi
)	TokenNameRPAREN	
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
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
sequence	TokenNameIdentifier	 sequence
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// is the instance at sequence[j] associated with a difference in the sum 	TokenNameCOMMENT_LINE	is the instance at sequence[j] associated with a difference in the sum 
// of feature values over the viterbi sequence and the actual one? 	TokenNameCOMMENT_LINE	of feature values over the viterbi sequence and the actual one? 
boolean	TokenNameboolean	
differenceAtJ	TokenNameIdentifier	 difference At J
=	TokenNameEQUAL	
!	TokenNameNOT	
viterbi	TokenNameIdentifier	 viterbi
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
.	TokenNameDOT	
isCorrect	TokenNameIdentifier	 is Correct
(	TokenNameLPAREN	
sequence	TokenNameIdentifier	 sequence
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
.	TokenNameDOT	
getLabel	TokenNameIdentifier	 get Label
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//System.out.println("differenceAtJ for J="+j+" "+differenceAtJ+" - label"); 	TokenNameCOMMENT_LINE	System.out.println("differenceAtJ for J="+j+" "+differenceAtJ+" - label"); 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
k	TokenNameIdentifier	 k
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
-	TokenNameMINUS	
k	TokenNameIdentifier	 k
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
!	TokenNameNOT	
differenceAtJ	TokenNameIdentifier	 difference At J
&&	TokenNameAND_AND	
k	TokenNameIdentifier	 k
<=	TokenNameLESS_EQUAL	
historySize	TokenNameIdentifier	 history Size
;	TokenNameSEMICOLON	
k	TokenNameIdentifier	 k
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
viterbi	TokenNameIdentifier	 viterbi
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
-	TokenNameMINUS	
k	TokenNameIdentifier	 k
]	TokenNameRBRACKET	
.	TokenNameDOT	
isCorrect	TokenNameIdentifier	 is Correct
(	TokenNameLPAREN	
sequence	TokenNameIdentifier	 sequence
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
-	TokenNameMINUS	
k	TokenNameIdentifier	 k
]	TokenNameRBRACKET	
.	TokenNameDOT	
getLabel	TokenNameIdentifier	 get Label
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//System.out.println("differenceAtJ for J="+j+" true: k="+k); 	TokenNameCOMMENT_LINE	System.out.println("differenceAtJ for J="+j+" true: k="+k); 
differenceAtJ	TokenNameIdentifier	 difference At J
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
differenceAtJ	TokenNameIdentifier	 difference At J
)	TokenNameRPAREN	
{	TokenNameLBRACE	
transitionErrors	TokenNameIdentifier	 transition Errors
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
errorOnThisSequence	TokenNameIdentifier	 error On This Sequence
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
InstanceFromSequence	TokenNameIdentifier	 Instance From Sequence
.	TokenNameDOT	
fillHistory	TokenNameIdentifier	 fill History
(	TokenNameLPAREN	
history	TokenNameIdentifier	 history
,	TokenNameCOMMA	
sequence	TokenNameIdentifier	 sequence
,	TokenNameCOMMA	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Instance	TokenNameIdentifier	 Instance
correctXj	TokenNameIdentifier	 correct Xj
=	TokenNameEQUAL	
new	TokenNamenew	
InstanceFromSequence	TokenNameIdentifier	 Instance From Sequence
(	TokenNameLPAREN	
sequence	TokenNameIdentifier	 sequence
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
history	TokenNameIdentifier	 history
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
correctClassIndex	TokenNameIdentifier	 correct Class Index
=	TokenNameEQUAL	
schema	TokenNameIdentifier	 schema
.	TokenNameDOT	
getClassIndex	TokenNameIdentifier	 get Class Index
(	TokenNameLPAREN	
sequence	TokenNameIdentifier	 sequence
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
.	TokenNameDOT	
getLabel	TokenNameIdentifier	 get Label
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
bestClassName	TokenNameIdentifier	 best Class Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
accumPos	TokenNameIdentifier	 accum Pos
[	TokenNameLBRACKET	
correctClassIndex	TokenNameIdentifier	 correct Class Index
]	TokenNameRBRACKET	
.	TokenNameDOT	
increment	TokenNameIdentifier	 increment
(	TokenNameLPAREN	
correctXj	TokenNameIdentifier	 correct Xj
,	TokenNameCOMMA	
+	TokenNamePLUS	
1.0	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
accumNeg	TokenNameIdentifier	 accum Neg
[	TokenNameLBRACKET	
correctClassIndex	TokenNameIdentifier	 correct Class Index
]	TokenNameRBRACKET	
.	TokenNameDOT	
increment	TokenNameIdentifier	 increment
(	TokenNameLPAREN	
correctXj	TokenNameIdentifier	 correct Xj
,	TokenNameCOMMA	
-	TokenNameMINUS	
1.0	TokenNameDoubleLiteral	
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
"+ update "	TokenNameStringLiteral	+ update 
+	TokenNamePLUS	
sequence	TokenNameIdentifier	 sequence
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
.	TokenNameDOT	
getLabel	TokenNameIdentifier	 get Label
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
bestClassName	TokenNameIdentifier	 best Class Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
correctXj	TokenNameIdentifier	 correct Xj
.	TokenNameDOT	
getSource	TokenNameIdentifier	 get Source
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
";"	TokenNameStringLiteral	;
+	TokenNamePLUS	
correctXj	TokenNameIdentifier	 correct Xj
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
InstanceFromSequence	TokenNameIdentifier	 Instance From Sequence
.	TokenNameDOT	
fillHistory	TokenNameIdentifier	 fill History
(	TokenNameLPAREN	
history	TokenNameIdentifier	 history
,	TokenNameCOMMA	
viterbi	TokenNameIdentifier	 viterbi
,	TokenNameCOMMA	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Instance	TokenNameIdentifier	 Instance
wrongXj	TokenNameIdentifier	 wrong Xj
=	TokenNameEQUAL	
new	TokenNamenew	
InstanceFromSequence	TokenNameIdentifier	 Instance From Sequence
(	TokenNameLPAREN	
sequence	TokenNameIdentifier	 sequence
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
history	TokenNameIdentifier	 history
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
wrongClassIndex	TokenNameIdentifier	 wrong Class Index
=	TokenNameEQUAL	
schema	TokenNameIdentifier	 schema
.	TokenNameDOT	
getClassIndex	TokenNameIdentifier	 get Class Index
(	TokenNameLPAREN	
viterbi	TokenNameIdentifier	 viterbi
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
.	TokenNameDOT	
bestClassName	TokenNameIdentifier	 best Class Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
accumPos	TokenNameIdentifier	 accum Pos
[	TokenNameLBRACKET	
wrongClassIndex	TokenNameIdentifier	 wrong Class Index
]	TokenNameRBRACKET	
.	TokenNameDOT	
increment	TokenNameIdentifier	 increment
(	TokenNameLPAREN	
wrongXj	TokenNameIdentifier	 wrong Xj
,	TokenNameCOMMA	
-	TokenNameMINUS	
1.0	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
accumNeg	TokenNameIdentifier	 accum Neg
[	TokenNameLBRACKET	
wrongClassIndex	TokenNameIdentifier	 wrong Class Index
]	TokenNameRBRACKET	
.	TokenNameDOT	
increment	TokenNameIdentifier	 increment
(	TokenNameLPAREN	
wrongXj	TokenNameIdentifier	 wrong Xj
,	TokenNameCOMMA	
+	TokenNamePLUS	
1.0	TokenNameDoubleLiteral	
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
"- update "	TokenNameStringLiteral	- update 
+	TokenNamePLUS	
viterbi	TokenNameIdentifier	 viterbi
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
.	TokenNameDOT	
bestClassName	TokenNameIdentifier	 best Class Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
wrongXj	TokenNameIdentifier	 wrong Xj
.	TokenNameDOT	
getSource	TokenNameIdentifier	 get Source
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// example sequence j 	TokenNameCOMMENT_LINE	example sequence j 
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
sequence	TokenNameIdentifier	 sequence
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
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
sequence	TokenNameIdentifier	 sequence
.	TokenNameDOT	
length	TokenNameIdentifier	 length
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
// we can use a CMM here, since the classifier is constructed so 	TokenNameCOMMENT_LINE	we can use a CMM here, since the classifier is constructed so 
// that the same beam search will work 	TokenNameCOMMENT_LINE	that the same beam search will work 
return	TokenNamereturn	
new	TokenNamenew	
CMM	TokenNameIdentifier	 CMM
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
,	TokenNameCOMMA	
historySize	TokenNameIdentifier	 history Size
,	TokenNameCOMMA	
schema	TokenNameIdentifier	 schema
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
