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
Vector	TokenNameIdentifier	 Vector
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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
ProgressCounter	TokenNameIdentifier	 Progress Counter
;	TokenNameSEMICOLON	
/** * Sequential learner based on the perceptron algorithm that takes the * top-k viterbi paths and subtracts those within a margin of beta of * the correct. * * @author Sunita Sarawagi */	TokenNameCOMMENT_JAVADOC	 Sequential learner based on the perceptron algorithm that takes the top-k viterbi paths and subtracts those within a margin of beta of the correct. * @author Sunita Sarawagi 
public	TokenNamepublic	
class	TokenNameclass	
MarginPerceptronLearner	TokenNameIdentifier	 Margin Perceptron Learner
extends	TokenNameextends	
CollinsPerceptronLearner	TokenNameIdentifier	 Collins Perceptron Learner
{	TokenNameLBRACE	
float	TokenNamefloat	
beta	TokenNameIdentifier	 beta
=	TokenNameEQUAL	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
0.05	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
topK	TokenNameIdentifier	 top K
=	TokenNameEQUAL	
10	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
MarginPerceptronLearner	TokenNameIdentifier	 Margin Perceptron Learner
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
5	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
0.05	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
MarginPerceptronLearner	TokenNameIdentifier	 Margin Perceptron Learner
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
,	TokenNameCOMMA	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
0.05	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
MarginPerceptronLearner	TokenNameIdentifier	 Margin Perceptron Learner
(	TokenNameLPAREN	
int	TokenNameint	
historySize	TokenNameIdentifier	 history Size
,	TokenNameCOMMA	
int	TokenNameint	
numberOfEpochs	TokenNameIdentifier	 number Of Epochs
,	TokenNameCOMMA	
float	TokenNamefloat	
beta	TokenNameIdentifier	 beta
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
historySize	TokenNameIdentifier	 history Size
,	TokenNameCOMMA	
numberOfEpochs	TokenNameIdentifier	 number Of Epochs
,	TokenNameCOMMA	
beta	TokenNameIdentifier	 beta
,	TokenNameCOMMA	
10	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
MarginPerceptronLearner	TokenNameIdentifier	 Margin Perceptron Learner
(	TokenNameLPAREN	
int	TokenNameint	
historySize	TokenNameIdentifier	 history Size
,	TokenNameCOMMA	
int	TokenNameint	
numberOfEpochs	TokenNameIdentifier	 number Of Epochs
,	TokenNameCOMMA	
float	TokenNamefloat	
beta	TokenNameIdentifier	 beta
,	TokenNameCOMMA	
int	TokenNameint	
topK	TokenNameIdentifier	 top K
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
historySize	TokenNameIdentifier	 history Size
,	TokenNameCOMMA	
numberOfEpochs	TokenNameIdentifier	 number Of Epochs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
beta	TokenNameIdentifier	 beta
=	TokenNameEQUAL	
beta	TokenNameIdentifier	 beta
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
topK	TokenNameIdentifier	 top K
=	TokenNameEQUAL	
topK	TokenNameIdentifier	 top K
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
getNumberOfEpochs	TokenNameIdentifier	 get Number Of Epochs
(	TokenNameLPAREN	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
dataset	TokenNameIdentifier	 dataset
.	TokenNameDOT	
numberOfSequences	TokenNameIdentifier	 number Of Sequences
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Vector	TokenNameIdentifier	 Vector
<	TokenNameLESS	
ClassLabel	TokenNameIdentifier	 Class Label
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
>	TokenNameGREATER	
viterbiS	TokenNameIdentifier	 viterbi S
=	TokenNameEQUAL	
new	TokenNamenew	
Vector	TokenNameIdentifier	 Vector
<	TokenNameLESS	
ClassLabel	TokenNameIdentifier	 Class Label
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
>	TokenNameGREATER	
(	TokenNameLPAREN	
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
getNumberOfEpochs	TokenNameIdentifier	 get Number Of Epochs
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
epoch	TokenNameIdentifier	 epoch
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
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
BeamSearcher	TokenNameIdentifier	 Beam Searcher
beam	TokenNameIdentifier	 beam
=	TokenNameEQUAL	
new	TokenNamenew	
BeamSearcher	TokenNameIdentifier	 Beam Searcher
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
,	TokenNameCOMMA	
getHistorySize	TokenNameIdentifier	 get History Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
schema	TokenNameIdentifier	 schema
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
beam	TokenNameIdentifier	 beam
.	TokenNameDOT	
doSearch	TokenNameIdentifier	 do Search
(	TokenNameLPAREN	
sequence	TokenNameIdentifier	 sequence
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
float	TokenNamefloat	
corrScore	TokenNameIdentifier	 corr Score
=	TokenNameEQUAL	
getScore	TokenNameIdentifier	 get Score
(	TokenNameLPAREN	
sequence	TokenNameIdentifier	 sequence
,	TokenNameCOMMA	
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
"corrScore: "	TokenNameStringLiteral	corrScore: 
+	TokenNamePLUS	
corrScore	TokenNameIdentifier	 corr Score
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
viterbiS	TokenNameIdentifier	 viterbi S
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
maxNum	TokenNameIdentifier	 max Num
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
min	TokenNameIdentifier	 min
(	TokenNameLPAREN	
beam	TokenNameIdentifier	 beam
.	TokenNameDOT	
getNumberOfSolutionsFound	TokenNameIdentifier	 get Number Of Solutions Found
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
topK	TokenNameIdentifier	 top K
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
maxNum	TokenNameIdentifier	 max Num
;	TokenNameSEMICOLON	
k	TokenNameIdentifier	 k
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ClassLabel	TokenNameIdentifier	 Class Label
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
viterbi	TokenNameIdentifier	 viterbi
=	TokenNameEQUAL	
beam	TokenNameIdentifier	 beam
.	TokenNameDOT	
viterbi	TokenNameIdentifier	 viterbi
(	TokenNameLPAREN	
k	TokenNameIdentifier	 k
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
float	TokenNamefloat	
thisScore	TokenNameIdentifier	 this Score
=	TokenNameEQUAL	
beam	TokenNameIdentifier	 beam
.	TokenNameDOT	
score	TokenNameIdentifier	 score
(	TokenNameLPAREN	
k	TokenNameIdentifier	 k
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
k	TokenNameIdentifier	 k
+	TokenNamePLUS	
" score "	TokenNameStringLiteral	 score 
+	TokenNamePLUS	
thisScore	TokenNameIdentifier	 this Score
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
sequenceToString	TokenNameIdentifier	 sequence To String
(	TokenNameLPAREN	
viterbi	TokenNameIdentifier	 viterbi
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
thisScore	TokenNameIdentifier	 this Score
<	TokenNameLESS	
corrScore	TokenNameIdentifier	 corr Score
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
-	TokenNameMINUS	
beta	TokenNameIdentifier	 beta
)	TokenNameRPAREN	
)	TokenNameRPAREN	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
isCorrect	TokenNameIdentifier	 is Correct
(	TokenNameLPAREN	
viterbi	TokenNameIdentifier	 viterbi
,	TokenNameCOMMA	
sequence	TokenNameIdentifier	 sequence
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
viterbiS	TokenNameIdentifier	 viterbi S
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
viterbi	TokenNameIdentifier	 viterbi
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG	TokenNameIdentifier	 DEBUG
)	TokenNameRPAREN	
log	TokenNameIdentifier	 log
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"added: "	TokenNameStringLiteral	added: 
+	TokenNamePLUS	
viterbiS	TokenNameIdentifier	 viterbi S
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
errorOnThisSequence	TokenNameIdentifier	 error On This Sequence
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
viterbiS	TokenNameIdentifier	 viterbi S
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
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
boolean	TokenNameboolean	
differenceAtJ	TokenNameIdentifier	 difference At J
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
s	TokenNameIdentifier	 s
<	TokenNameLESS	
viterbiS	TokenNameIdentifier	 viterbi S
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
s	TokenNameIdentifier	 s
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ClassLabel	TokenNameIdentifier	 Class Label
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
viterbi	TokenNameIdentifier	 viterbi
=	TokenNameEQUAL	
viterbiS	TokenNameIdentifier	 viterbi S
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
getHistorySize	TokenNameIdentifier	 get History Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
break	TokenNamebreak	
;	TokenNameSEMICOLON	
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
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
s	TokenNameIdentifier	 s
<	TokenNameLESS	
viterbiS	TokenNameIdentifier	 viterbi S
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
s	TokenNameIdentifier	 s
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ClassLabel	TokenNameIdentifier	 Class Label
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
viterbi	TokenNameIdentifier	 viterbi
=	TokenNameEQUAL	
viterbiS	TokenNameIdentifier	 viterbi S
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
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
/	TokenNameDIVIDE	
viterbiS	TokenNameIdentifier	 viterbi S
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// example sequence j 	TokenNameCOMMENT_LINE	example sequence j 
}	TokenNameRBRACE	
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
getHistorySize	TokenNameIdentifier	 get History Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
schema	TokenNameIdentifier	 schema
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
float	TokenNamefloat	
getScore	TokenNameIdentifier	 get Score
(	TokenNameLPAREN	
Example	TokenNameIdentifier	 Example
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
sequence	TokenNameIdentifier	 sequence
,	TokenNameCOMMA	
Classifier	TokenNameIdentifier	 Classifier
classifier	TokenNameIdentifier	 classifier
)	TokenNameRPAREN	
{	TokenNameLBRACE	
float	TokenNamefloat	
score	TokenNameIdentifier	 score
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
sequence	TokenNameIdentifier	 sequence
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
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
score	TokenNameIdentifier	 score
+=	TokenNamePLUS_EQUAL	
classifier	TokenNameIdentifier	 classifier
.	TokenNameDOT	
classification	TokenNameIdentifier	 classification
(	TokenNameLPAREN	
correctXj	TokenNameIdentifier	 correct Xj
)	TokenNameRPAREN	
.	TokenNameDOT	
getWeight	TokenNameIdentifier	 get Weight
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
}	TokenNameRBRACE	
return	TokenNamereturn	
score	TokenNameIdentifier	 score
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
boolean	TokenNameboolean	
isCorrect	TokenNameIdentifier	 is Correct
(	TokenNameLPAREN	
ClassLabel	TokenNameIdentifier	 Class Label
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
viterbi	TokenNameIdentifier	 viterbi
,	TokenNameCOMMA	
Example	TokenNameIdentifier	 Example
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
sequence	TokenNameIdentifier	 sequence
)	TokenNameRPAREN	
{	TokenNameLBRACE	
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
if	TokenNameif	
(	TokenNameLPAREN	
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
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
sequenceToString	TokenNameIdentifier	 sequence To String
(	TokenNameLPAREN	
ClassLabel	TokenNameIdentifier	 Class Label
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
viterbi	TokenNameIdentifier	 viterbi
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
path	TokenNameIdentifier	 path
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
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
viterbi	TokenNameIdentifier	 viterbi
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
path	TokenNameIdentifier	 path
+=	TokenNamePLUS_EQUAL	
(	TokenNameLPAREN	
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
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
path	TokenNameIdentifier	 path
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
