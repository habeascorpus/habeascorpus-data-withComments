// Some algorithms for Hidden Markov Models (Chapter 3): Viterbi, 	TokenNameCOMMENT_LINE	Some algorithms for Hidden Markov Models (Chapter 3): Viterbi, 
// Forward, Backward, Baum-Welch. We compute with log probabilities. 	TokenNameCOMMENT_LINE	Forward, Backward, Baum-Welch. We compute with log probabilities. 
// Notational conventions: 	TokenNameCOMMENT_LINE	Notational conventions: 
// i = 1,...,L indexes x, the observed string, x_0 not a symbol 	TokenNameCOMMENT_LINE	i = 1,...,L indexes x, the observed string, x_0 not a symbol 
// k,ell = 0,...,hmm.nstate-1 indexes hmm.state(k) a_0 is the start state 	TokenNameCOMMENT_LINE	k,ell = 0,...,hmm.nstate-1 indexes hmm.state(k) a_0 is the start state 
//Zhenzhen Kou 	TokenNameCOMMENT_LINE	Zhenzhen Kou 
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
ExampleSchema	TokenNameIdentifier	 Example Schema
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
HMMLearner	TokenNameIdentifier	 HMM Learner
implements	TokenNameimplements	
BatchSequenceClassifierLearner	TokenNameIdentifier	 Batch Sequence Classifier Learner
,	TokenNameCOMMA	
SequenceConstants	TokenNameIdentifier	 Sequence Constants
{	TokenNameLBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
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
protected	TokenNameprotected	
int	TokenNameint	
historySize	TokenNameIdentifier	 history Size
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
history	TokenNameIdentifier	 history
;	TokenNameSEMICOLON	
int	TokenNameint	
numClasses	TokenNameIdentifier	 num Classes
;	TokenNameSEMICOLON	
HMM	TokenNameIdentifier	 HMM
hmmModel	TokenNameIdentifier	 hmm Model
;	TokenNameSEMICOLON	
/* // some key factors in a HMM, these can be obtained in Batchtrain via parsing the dataset // state = array of state names (except initial state), nstate: number of states // amat = matrix of transition probabilities (except initial state) // esym = string of emission names, nesym: number of emissions // emat = matrix of emission probabilities */	TokenNameCOMMENT_BLOCK	 // some key factors in a HMM, these can be obtained in Batchtrain via parsing the dataset // state = array of state names (except initial state), nstate: number of states // amat = matrix of transition probabilities (except initial state) // esym = string of emission names, nesym: number of emissions // emat = matrix of emission probabilities 
public	TokenNamepublic	
HMMLearner	TokenNameIdentifier	 HMM Learner
(	TokenNameLPAREN	
int	TokenNameint	
historySize	TokenNameIdentifier	 history Size
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
HMMLearner	TokenNameIdentifier	 HMM Learner
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
numberOfEpochs	TokenNameIdentifier	 number Of Epochs
;	TokenNameSEMICOLON	
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
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
" batch train is called "	TokenNameStringLiteral	 batch train is called 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ExampleSchema	TokenNameIdentifier	 Example Schema
schema	TokenNameIdentifier	 schema
=	TokenNameEQUAL	
dataset	TokenNameIdentifier	 dataset
.	TokenNameDOT	
getSchema	TokenNameIdentifier	 get Schema
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
//// so here when you call the MultiClassHMMClassifier, it's like return MultiClassHMMClassifier( dataset) 	TokenNameCOMMENT_LINE	// so here when you call the MultiClassHMMClassifier, it's like return MultiClassHMMClassifier( dataset) 
MultiClassHMMClassifier	TokenNameIdentifier	 Multi Class HMM Classifier
hmm	TokenNameIdentifier	 hmm
=	TokenNameEQUAL	
new	TokenNamenew	
MultiClassHMMClassifier	TokenNameIdentifier	 Multi Class HMM Classifier
(	TokenNameLPAREN	
dataset	TokenNameIdentifier	 dataset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
hmm	TokenNameIdentifier	 hmm
.	TokenNameDOT	
baumwelch	TokenNameIdentifier	 baumwelch
(	TokenNameLPAREN	
0.00001	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// hmm.hmmModel.print(new SystemOut()); 	TokenNameCOMMENT_LINE	hmm.hmmModel.print(new SystemOut()); 
return	TokenNamereturn	
hmm	TokenNameIdentifier	 hmm
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
