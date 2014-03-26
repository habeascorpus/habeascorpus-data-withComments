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
Hyperplane	TokenNameIdentifier	 Hyperplane
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
*	TokenNameMULTIPLY	
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
swing	TokenNameIdentifier	 swing
.	TokenNameDOT	
*	TokenNameMULTIPLY	
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
swing	TokenNameIdentifier	 swing
.	TokenNameDOT	
border	TokenNameIdentifier	 border
.	TokenNameDOT	
TitledBorder	TokenNameIdentifier	 Titled Border
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
Serializable	TokenNameIdentifier	 Serializable
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Iterator	TokenNameIdentifier	 Iterator
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
/** * Sequential learner based on the perceptron algorithm, as described * in Discriminative Training Methods for Hidden Markov Models: Theory * and Experiments with Perceptron Algorithms, Mike Collins, EMNLP * 2002. * * @author William Cohen */	TokenNameCOMMENT_JAVADOC	 Sequential learner based on the perceptron algorithm, as described in Discriminative Training Methods for Hidden Markov Models: Theory and Experiments with Perceptron Algorithms, Mike Collins, EMNLP 2002. * @author William Cohen 
public	TokenNamepublic	
class	TokenNameclass	
CollinsPerceptronLearner	TokenNameIdentifier	 Collins Perceptron Learner
implements	TokenNameimplements	
BatchSequenceClassifierLearner	TokenNameIdentifier	 Batch Sequence Classifier Learner
,	TokenNameCOMMA	
SequenceConstants	TokenNameIdentifier	 Sequence Constants
{	TokenNameLBRACE	
protected	TokenNameprotected	
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
protected	TokenNameprotected	
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
protected	TokenNameprotected	
int	TokenNameint	
historySize	TokenNameIdentifier	 history Size
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
int	TokenNameint	
numberOfEpochs	TokenNameIdentifier	 number Of Epochs
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
history	TokenNameIdentifier	 history
;	TokenNameSEMICOLON	
public	TokenNamepublic	
CollinsPerceptronLearner	TokenNameIdentifier	 Collins Perceptron Learner
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
5	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
CollinsPerceptronLearner	TokenNameIdentifier	 Collins Perceptron Learner
(	TokenNameLPAREN	
int	TokenNameint	
numberOfEpochs	TokenNameIdentifier	 number Of Epochs
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
numberOfEpochs	TokenNameIdentifier	 number Of Epochs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
CollinsPerceptronLearner	TokenNameIdentifier	 Collins Perceptron Learner
(	TokenNameLPAREN	
int	TokenNameint	
historySize	TokenNameIdentifier	 history Size
,	TokenNameCOMMA	
int	TokenNameint	
numberOfEpochs	TokenNameIdentifier	 number Of Epochs
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
numberOfEpochs	TokenNameIdentifier	 number Of Epochs
=	TokenNameEQUAL	
numberOfEpochs	TokenNameIdentifier	 number Of Epochs
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
// Help Button 	TokenNameCOMMENT_LINE	Help Button 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getHistorySizeHelp	TokenNameIdentifier	 get History Size Help
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"Number of tokens to look back on. <br>The predicted labels for the history are used as features to help classify the current token."	TokenNameStringLiteral	Number of tokens to look back on. <br>The predicted labels for the history are used as features to help classify the current token.
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
MultiClassVPClassifier	TokenNameIdentifier	 Multi Class VP Classifier
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
new	TokenNamenew	
MultiClassVPClassifier	TokenNameIdentifier	 Multi Class VP Classifier
(	TokenNameLPAREN	
schema	TokenNameIdentifier	 schema
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ProgressCounter	TokenNameIdentifier	 Progress Counter
pc	TokenNameIdentifier	 pc
=	TokenNameEQUAL	
new	TokenNamenew	
ProgressCounter	TokenNameIdentifier	 Progress Counter
(	TokenNameLPAREN	
"training sequence perceptron"	TokenNameStringLiteral	training sequence perceptron
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
// At this point, Collin's paper says to add Phi(sequence) - 	TokenNameCOMMENT_LINE	At this point, Collin's paper says to add Phi(sequence) - 
// Phi(viterbi) to the current weight vector W. We're doing 	TokenNameCOMMENT_LINE	Phi(viterbi) to the current weight vector W. We're doing 
// this, with two twists: (a) the features in our instance 	TokenNameCOMMENT_LINE	this, with two twists: (a) the features in our instance 
// vectors phi(sequence,i) vectors are not paired with class 	TokenNameCOMMENT_LINE	vectors phi(sequence,i) vectors are not paired with class 
// labels. Instead, we compute class-label independent features 	TokenNameCOMMENT_LINE	labels. Instead, we compute class-label independent features 
// and then attach the class label when we 'update' c. 	TokenNameCOMMENT_LINE	and then attach the class label when we 'update' c. 
// (b) rather than computing Phi(sequence), Phi(viterbi), and 	TokenNameCOMMENT_LINE	(b) rather than computing Phi(sequence), Phi(viterbi), and 
// subtracting, we compute the difference directly. 	TokenNameCOMMENT_LINE	subtracting, we compute the difference directly. 
boolean	TokenNameboolean	
errorOnThisSequence	TokenNameIdentifier	 error On This Sequence
=	TokenNameEQUAL	
false	TokenNamefalse	
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
// i.e., if phi(sequence,j) != phi(viterbi,j) 	TokenNameCOMMENT_LINE	i.e., if phi(sequence,j) != phi(viterbi,j) 
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
c	TokenNameIdentifier	 c
.	TokenNameDOT	
update	TokenNameIdentifier	 update
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
,	TokenNameCOMMA	
correctXj	TokenNameIdentifier	 correct Xj
,	TokenNameCOMMA	
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
c	TokenNameIdentifier	 c
.	TokenNameDOT	
update	TokenNameIdentifier	 update
(	TokenNameLPAREN	
viterbi	TokenNameIdentifier	 viterbi
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
.	TokenNameDOT	
bestClassName	TokenNameIdentifier	 best Class Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
wrongXj	TokenNameIdentifier	 wrong Xj
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
// our computation of Phi(sequence)-Phi(viterbi) is complete - the voting scheme 	TokenNameCOMMENT_LINE	our computation of Phi(sequence)-Phi(viterbi) is complete - the voting scheme 
// for voted perceptron needs this... 	TokenNameCOMMENT_LINE	for voted perceptron needs this... 
c	TokenNameIdentifier	 c
.	TokenNameDOT	
completeUpdate	TokenNameIdentifier	 complete Update
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
errorOnThisSequence	TokenNameIdentifier	 error On This Sequence
)	TokenNameRPAREN	
sequenceErrors	TokenNameIdentifier	 sequence Errors
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
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
c	TokenNameIdentifier	 c
.	TokenNameDOT	
setVoteMode	TokenNameIdentifier	 set Vote Mode
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// we can use a CMM here, since the classifier is constructed to the same 	TokenNameCOMMENT_LINE	we can use a CMM here, since the classifier is constructed to the same 
// beam search will work 	TokenNameCOMMENT_LINE	beam search will work 
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
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
MultiClassVPClassifier	TokenNameIdentifier	 Multi Class VP Classifier
implements	TokenNameimplements	
Classifier	TokenNameIdentifier	 Classifier
,	TokenNameCOMMA	
Visible	TokenNameIdentifier	 Visible
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
private	TokenNameprivate	
ExampleSchema	TokenNameIdentifier	 Example Schema
schema	TokenNameIdentifier	 schema
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Hyperplane	TokenNameIdentifier	 Hyperplane
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
s_t	TokenNameIdentifier	 s t
,	TokenNameCOMMA	
w_t	TokenNameIdentifier	 w t
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
numClasses	TokenNameIdentifier	 num Classes
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
voteMode	TokenNameIdentifier	 vote Mode
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
MultiClassVPClassifier	TokenNameIdentifier	 Multi Class VP Classifier
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
this	TokenNamethis	
.	TokenNameDOT	
numClasses	TokenNameIdentifier	 num Classes
=	TokenNameEQUAL	
schema	TokenNameIdentifier	 schema
.	TokenNameDOT	
getNumberOfClasses	TokenNameIdentifier	 get Number Of Classes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setVoteMode	TokenNameIdentifier	 set Vote Mode
(	TokenNameLPAREN	
boolean	TokenNameboolean	
flag	TokenNameIdentifier	 flag
)	TokenNameRPAREN	
{	TokenNameLBRACE	
voteMode	TokenNameIdentifier	 vote Mode
=	TokenNameEQUAL	
flag	TokenNameIdentifier	 flag
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Hyperplane	TokenNameIdentifier	 Hyperplane
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getHyperplanes	TokenNameIdentifier	 get Hyperplanes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
voteMode	TokenNameIdentifier	 vote Mode
?	TokenNameQUESTION	
s_t	TokenNameIdentifier	 s t
:	TokenNameCOLON	
w_t	TokenNameIdentifier	 w t
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
void	TokenNamevoid	
update	TokenNameIdentifier	 update
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
className	TokenNameIdentifier	 class Name
,	TokenNameCOMMA	
Instance	TokenNameIdentifier	 Instance
instance	TokenNameIdentifier	 instance
,	TokenNameCOMMA	
double	TokenNamedouble	
delta	TokenNameIdentifier	 delta
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
schema	TokenNameIdentifier	 schema
.	TokenNameDOT	
getClassIndex	TokenNameIdentifier	 get Class Index
(	TokenNameLPAREN	
className	TokenNameIdentifier	 class Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
w_t	TokenNameIdentifier	 w t
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
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
public	TokenNamepublic	
void	TokenNamevoid	
completeUpdate	TokenNameIdentifier	 complete Update
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
numClasses	TokenNameIdentifier	 num Classes
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
s_t	TokenNameIdentifier	 s t
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
increment	TokenNameIdentifier	 increment
(	TokenNameLPAREN	
w_t	TokenNameIdentifier	 w t
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
1.0	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
Hyperplane	TokenNameIdentifier	 Hyperplane
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
h	TokenNameIdentifier	 h
=	TokenNameEQUAL	
voteMode	TokenNameIdentifier	 vote Mode
?	TokenNameQUESTION	
s_t	TokenNameIdentifier	 s t
:	TokenNameCOLON	
w_t	TokenNameIdentifier	 w t
;	TokenNameSEMICOLON	
ClassLabel	TokenNameIdentifier	 Class Label
label	TokenNameIdentifier	 label
=	TokenNameEQUAL	
new	TokenNamenew	
ClassLabel	TokenNameIdentifier	 Class Label
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
numClasses	TokenNameIdentifier	 num Classes
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
label	TokenNameIdentifier	 label
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
schema	TokenNameIdentifier	 schema
.	TokenNameDOT	
getClassName	TokenNameIdentifier	 get Class Name
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
,	TokenNameCOMMA	
h	TokenNameIdentifier	 h
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
score	TokenNameIdentifier	 score
(	TokenNameLPAREN	
instance	TokenNameIdentifier	 instance
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
label	TokenNameIdentifier	 label
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
Hyperplane	TokenNameIdentifier	 Hyperplane
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
h	TokenNameIdentifier	 h
=	TokenNameEQUAL	
voteMode	TokenNameIdentifier	 vote Mode
?	TokenNameQUESTION	
s_t	TokenNameIdentifier	 s t
:	TokenNameCOLON	
w_t	TokenNameIdentifier	 w t
;	TokenNameSEMICOLON	
StringBuffer	TokenNameIdentifier	 String Buffer
buf	TokenNameIdentifier	 buf
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
""	TokenNameStringLiteral	 
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
numClasses	TokenNameIdentifier	 num Classes
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"Hyperplane for class "	TokenNameStringLiteral	Hyperplane for class 
+	TokenNamePLUS	
schema	TokenNameIdentifier	 schema
.	TokenNameDOT	
getClassName	TokenNameIdentifier	 get Class Name
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
+	TokenNamePLUS	
": "	TokenNameStringLiteral	: 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
h	TokenNameIdentifier	 h
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
explain	TokenNameIdentifier	 explain
(	TokenNameLPAREN	
instance	TokenNameIdentifier	 instance
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
buf	TokenNameIdentifier	 buf
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
Hyperplane	TokenNameIdentifier	 Hyperplane
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
h	TokenNameIdentifier	 h
=	TokenNameEQUAL	
voteMode	TokenNameIdentifier	 vote Mode
?	TokenNameQUESTION	
s_t	TokenNameIdentifier	 s t
:	TokenNameCOLON	
w_t	TokenNameIdentifier	 w t
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
"CollinsPerceptron Explanation"	TokenNameStringLiteral	CollinsPerceptron Explanation
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
numClasses	TokenNameIdentifier	 num Classes
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Explanation	TokenNameIdentifier	 Explanation
.	TokenNameDOT	
Node	TokenNameIdentifier	 Node
hyp	TokenNameIdentifier	 hyp
=	TokenNameEQUAL	
new	TokenNamenew	
Explanation	TokenNameIdentifier	 Explanation
.	TokenNameDOT	
Node	TokenNameIdentifier	 Node
(	TokenNameLPAREN	
"Hyperplane for class "	TokenNameStringLiteral	Hyperplane for class 
+	TokenNamePLUS	
schema	TokenNameIdentifier	 schema
.	TokenNameDOT	
getClassName	TokenNameIdentifier	 get Class Name
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
+	TokenNamePLUS	
": "	TokenNameStringLiteral	: 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Explanation	TokenNameIdentifier	 Explanation
.	TokenNameDOT	
Node	TokenNameIdentifier	 Node
explanation	TokenNameIdentifier	 explanation
=	TokenNameEQUAL	
h	TokenNameIdentifier	 h
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
getExplanation	TokenNameIdentifier	 get Explanation
(	TokenNameLPAREN	
instance	TokenNameIdentifier	 instance
)	TokenNameRPAREN	
.	TokenNameDOT	
getTopNode	TokenNameIdentifier	 get Top Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
hyp	TokenNameIdentifier	 hyp
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
explanation	TokenNameIdentifier	 explanation
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
top	TokenNameIdentifier	 top
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
hyp	TokenNameIdentifier	 hyp
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Explanation	TokenNameIdentifier	 Explanation
ex	TokenNameIdentifier	 ex
=	TokenNameEQUAL	
new	TokenNamenew	
Explanation	TokenNameIdentifier	 Explanation
(	TokenNameLPAREN	
top	TokenNameIdentifier	 top
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
ex	TokenNameIdentifier	 ex
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
Viewer	TokenNameIdentifier	 Viewer
toGUI	TokenNameIdentifier	 to GUI
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Viewer	TokenNameIdentifier	 Viewer
gui	TokenNameIdentifier	 gui
=	TokenNameEQUAL	
new	TokenNamenew	
ComponentViewer	TokenNameIdentifier	 Component Viewer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
20080207L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
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
MultiClassVPClassifier	TokenNameIdentifier	 Multi Class VP Classifier
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
(	TokenNameLPAREN	
MultiClassVPClassifier	TokenNameIdentifier	 Multi Class VP Classifier
)	TokenNameRPAREN	
o	TokenNameIdentifier	 o
;	TokenNameSEMICOLON	
JPanel	TokenNameIdentifier	 J Panel
main	TokenNameIdentifier	 main
=	TokenNameEQUAL	
new	TokenNamenew	
JPanel	TokenNameIdentifier	 J Panel
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
numClasses	TokenNameIdentifier	 num Classes
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
JPanel	TokenNameIdentifier	 J Panel
classPanel	TokenNameIdentifier	 class Panel
=	TokenNameEQUAL	
new	TokenNamenew	
JPanel	TokenNameIdentifier	 J Panel
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
classPanel	TokenNameIdentifier	 class Panel
.	TokenNameDOT	
setBorder	TokenNameIdentifier	 set Border
(	TokenNameLPAREN	
new	TokenNamenew	
TitledBorder	TokenNameIdentifier	 Titled Border
(	TokenNameLPAREN	
"Class "	TokenNameStringLiteral	Class 
+	TokenNamePLUS	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
schema	TokenNameIdentifier	 schema
.	TokenNameDOT	
getClassName	TokenNameIdentifier	 get Class Name
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Viewer	TokenNameIdentifier	 Viewer
subviewer	TokenNameIdentifier	 subviewer
=	TokenNameEQUAL	
voteMode	TokenNameIdentifier	 vote Mode
?	TokenNameQUESTION	
s_t	TokenNameIdentifier	 s t
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
toGUI	TokenNameIdentifier	 to GUI
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
w_t	TokenNameIdentifier	 w t
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
toGUI	TokenNameIdentifier	 to GUI
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
subviewer	TokenNameIdentifier	 subviewer
.	TokenNameDOT	
setSuperView	TokenNameIdentifier	 set Super View
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
classPanel	TokenNameIdentifier	 class Panel
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
subviewer	TokenNameIdentifier	 subviewer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
main	TokenNameIdentifier	 main
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
classPanel	TokenNameIdentifier	 class Panel
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
new	TokenNamenew	
JScrollPane	TokenNameIdentifier	 J Scroll Pane
(	TokenNameLPAREN	
main	TokenNameIdentifier	 main
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
gui	TokenNameIdentifier	 gui
.	TokenNameDOT	
setContent	TokenNameIdentifier	 set Content
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
gui	TokenNameIdentifier	 gui
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
s_t	TokenNameIdentifier	 s t
=	TokenNameEQUAL	
new	TokenNamenew	
Hyperplane	TokenNameIdentifier	 Hyperplane
[	TokenNameLBRACKET	
numClasses	TokenNameIdentifier	 num Classes
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
w_t	TokenNameIdentifier	 w t
=	TokenNameEQUAL	
new	TokenNamenew	
Hyperplane	TokenNameIdentifier	 Hyperplane
[	TokenNameLBRACKET	
numClasses	TokenNameIdentifier	 num Classes
]	TokenNameRBRACKET	
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
numClasses	TokenNameIdentifier	 num Classes
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
s_t	TokenNameIdentifier	 s t
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
Hyperplane	TokenNameIdentifier	 Hyperplane
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
w_t	TokenNameIdentifier	 w t
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
Hyperplane	TokenNameIdentifier	 Hyperplane
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"[MultiClassVPClassifier:"	TokenNameStringLiteral	[MultiClassVPClassifier:
+	TokenNamePLUS	
StringUtil	TokenNameIdentifier	 String Util
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
w_t	TokenNameIdentifier	 w t
,	TokenNameCOMMA	
" "	TokenNameStringLiteral	 
,	TokenNameCOMMA	
" ]"	TokenNameStringLiteral	 ]
,	TokenNameCOMMA	
" - "	TokenNameStringLiteral	 - 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
