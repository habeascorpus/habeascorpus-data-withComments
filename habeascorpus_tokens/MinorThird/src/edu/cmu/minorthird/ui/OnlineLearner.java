package	TokenNamepackage	
edu	TokenNameIdentifier	 edu
.	TokenNameDOT	
cmu	TokenNameIdentifier	 cmu
.	TokenNameDOT	
minorthird	TokenNameIdentifier	 minorthird
.	TokenNameDOT	
ui	TokenNameIdentifier	 ui
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
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
OnlineBinaryClassifierLearner	TokenNameIdentifier	 Online Binary Classifier Learner
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
text	TokenNameIdentifier	 text
.	TokenNameDOT	
learn	TokenNameIdentifier	 learn
.	TokenNameDOT	
OnlineBinaryTextClassifierLearner	TokenNameIdentifier	 Online Binary Text Classifier Learner
;	TokenNameSEMICOLON	
import	TokenNameimport	
edu	TokenNameIdentifier	 edu
.	TokenNameDOT	
cmu	TokenNameIdentifier	 cmu
.	TokenNameDOT	
minorthird	TokenNameIdentifier	 minorthird
.	TokenNameDOT	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
learn	TokenNameIdentifier	 learn
.	TokenNameDOT	
OnlineTextClassifierLearner	TokenNameIdentifier	 Online Text Classifier Learner
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
CommandLineProcessor	TokenNameIdentifier	 Command Line Processor
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
IOUtil	TokenNameIdentifier	 IO Util
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
JointCommandLineProcessor	TokenNameIdentifier	 Joint Command Line Processor
;	TokenNameSEMICOLON	
/** * Start an Online Learner * * @author Cameron Williams */	TokenNameCOMMENT_JAVADOC	 Start an Online Learner * @author Cameron Williams 
public	TokenNamepublic	
class	TokenNameclass	
OnlineLearner	TokenNameIdentifier	 Online Learner
extends	TokenNameextends	
UIMain	TokenNameIdentifier	 UI Main
{	TokenNameLBRACE	
// private data needed to train a classifier 	TokenNameCOMMENT_LINE	private data needed to train a classifier 
protected	TokenNameprotected	
CommandLineUtil	TokenNameIdentifier	 Command Line Util
.	TokenNameDOT	
OnlineBaseParams	TokenNameIdentifier	 Online Base Params
labeledData	TokenNameIdentifier	 labeled Data
=	TokenNameEQUAL	
new	TokenNamenew	
CommandLineUtil	TokenNameIdentifier	 Command Line Util
.	TokenNameDOT	
OnlineBaseParams	TokenNameIdentifier	 Online Base Params
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
CommandLineUtil	TokenNameIdentifier	 Command Line Util
.	TokenNameDOT	
OnlineSignalParams	TokenNameIdentifier	 Online Signal Params
signal	TokenNameIdentifier	 signal
=	TokenNameEQUAL	
new	TokenNamenew	
CommandLineUtil	TokenNameIdentifier	 Command Line Util
.	TokenNameDOT	
OnlineSignalParams	TokenNameIdentifier	 Online Signal Params
(	TokenNameLPAREN	
labeledData	TokenNameIdentifier	 labeled Data
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
CommandLineUtil	TokenNameIdentifier	 Command Line Util
.	TokenNameDOT	
TrainClassifierParams	TokenNameIdentifier	 Train Classifier Params
train	TokenNameIdentifier	 train
=	TokenNameEQUAL	
new	TokenNamenew	
CommandLineUtil	TokenNameIdentifier	 Command Line Util
.	TokenNameDOT	
TrainClassifierParams	TokenNameIdentifier	 Train Classifier Params
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
CommandLineUtil	TokenNameIdentifier	 Command Line Util
.	TokenNameDOT	
TestClassifierParams	TokenNameIdentifier	 Test Classifier Params
test	TokenNameIdentifier	 test
=	TokenNameEQUAL	
new	TokenNamenew	
CommandLineUtil	TokenNameIdentifier	 Command Line Util
.	TokenNameDOT	
TestClassifierParams	TokenNameIdentifier	 Test Classifier Params
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
OnlineTextClassifierLearner	TokenNameIdentifier	 Online Text Classifier Learner
textLearner	TokenNameIdentifier	 text Learner
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
//private Classifier classifier=null; 	TokenNameCOMMENT_LINE	private Classifier classifier=null; 
public	TokenNamepublic	
CommandLineUtil	TokenNameIdentifier	 Command Line Util
.	TokenNameDOT	
OnlineBaseParams	TokenNameIdentifier	 Online Base Params
get_LabeledDataParameters	TokenNameIdentifier	 get  Labeled Data Parameters
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
labeledData	TokenNameIdentifier	 labeled Data
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
set_LabeledDataParameters	TokenNameIdentifier	 set  Labeled Data Parameters
(	TokenNameLPAREN	
CommandLineUtil	TokenNameIdentifier	 Command Line Util
.	TokenNameDOT	
OnlineBaseParams	TokenNameIdentifier	 Online Base Params
labeledData	TokenNameIdentifier	 labeled Data
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
labeledData	TokenNameIdentifier	 labeled Data
=	TokenNameEQUAL	
labeledData	TokenNameIdentifier	 labeled Data
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
CommandLineUtil	TokenNameIdentifier	 Command Line Util
.	TokenNameDOT	
OnlineSignalParams	TokenNameIdentifier	 Online Signal Params
getSignalParameters	TokenNameIdentifier	 get Signal Parameters
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
signal	TokenNameIdentifier	 signal
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setSignalParameters	TokenNameIdentifier	 set Signal Parameters
(	TokenNameLPAREN	
CommandLineUtil	TokenNameIdentifier	 Command Line Util
.	TokenNameDOT	
OnlineSignalParams	TokenNameIdentifier	 Online Signal Params
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
{	TokenNameLBRACE	
signal	TokenNameIdentifier	 signal
=	TokenNameEQUAL	
p	TokenNameIdentifier	 p
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
CommandLineUtil	TokenNameIdentifier	 Command Line Util
.	TokenNameDOT	
TrainClassifierParams	TokenNameIdentifier	 Train Classifier Params
getAdditionalParameters	TokenNameIdentifier	 get Additional Parameters
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
train	TokenNameIdentifier	 train
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setAdditionalParameters	TokenNameIdentifier	 set Additional Parameters
(	TokenNameLPAREN	
CommandLineUtil	TokenNameIdentifier	 Command Line Util
.	TokenNameDOT	
TrainClassifierParams	TokenNameIdentifier	 Train Classifier Params
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
{	TokenNameLBRACE	
train	TokenNameIdentifier	 train
=	TokenNameEQUAL	
p	TokenNameIdentifier	 p
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
CommandLineUtil	TokenNameIdentifier	 Command Line Util
.	TokenNameDOT	
TestClassifierParams	TokenNameIdentifier	 Test Classifier Params
getTextLearnerParameters	TokenNameIdentifier	 get Text Learner Parameters
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
test	TokenNameIdentifier	 test
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setTextLearnerParameters	TokenNameIdentifier	 set Text Learner Parameters
(	TokenNameLPAREN	
CommandLineUtil	TokenNameIdentifier	 Command Line Util
.	TokenNameDOT	
TestClassifierParams	TokenNameIdentifier	 Test Classifier Params
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
{	TokenNameLBRACE	
test	TokenNameIdentifier	 test
=	TokenNameEQUAL	
p	TokenNameIdentifier	 p
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
CommandLineProcessor	TokenNameIdentifier	 Command Line Processor
getCLP	TokenNameIdentifier	 get CLP
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
JointCommandLineProcessor	TokenNameIdentifier	 Joint Command Line Processor
(	TokenNameLPAREN	
new	TokenNamenew	
CommandLineProcessor	TokenNameIdentifier	 Command Line Processor
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
gui	TokenNameIdentifier	 gui
,	TokenNameCOMMA	
base	TokenNameIdentifier	 base
,	TokenNameCOMMA	
labeledData	TokenNameIdentifier	 labeled Data
,	TokenNameCOMMA	
signal	TokenNameIdentifier	 signal
,	TokenNameCOMMA	
train	TokenNameIdentifier	 train
,	TokenNameCOMMA	
test	TokenNameIdentifier	 test
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// 	TokenNameCOMMENT_LINE	 
// do the experiment 	TokenNameCOMMENT_LINE	do the experiment 
// 	TokenNameCOMMENT_LINE	 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
doMain	TokenNameIdentifier	 do Main
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// check that inputs are valid 	TokenNameCOMMENT_LINE	check that inputs are valid 
if	TokenNameif	
(	TokenNameLPAREN	
train	TokenNameIdentifier	 train
.	TokenNameDOT	
learner	TokenNameIdentifier	 learner
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"-learner must be specified"	TokenNameStringLiteral	-learner must be specified
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
signal	TokenNameIdentifier	 signal
.	TokenNameDOT	
spanType	TokenNameIdentifier	 span Type
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"-spanType must be specified"	TokenNameStringLiteral	-spanType must be specified
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
(	TokenNameLPAREN	
train	TokenNameIdentifier	 train
.	TokenNameDOT	
learner	TokenNameIdentifier	 learner
instanceof	TokenNameinstanceof	
OnlineBinaryClassifierLearner	TokenNameIdentifier	 Online Binary Classifier Learner
)	TokenNameRPAREN	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"The learner must be an OnlineBinaryClassifierLearner"	TokenNameStringLiteral	The learner must be an OnlineBinaryClassifierLearner
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//String outputType=signal.getOutputType(train.output); 	TokenNameCOMMENT_LINE	String outputType=signal.getOutputType(train.output); 
if	TokenNameif	
(	TokenNameLPAREN	
test	TokenNameIdentifier	 test
.	TokenNameDOT	
loadFrom	TokenNameIdentifier	 load From
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
textLearner	TokenNameIdentifier	 text Learner
=	TokenNameEQUAL	
new	TokenNamenew	
OnlineBinaryTextClassifierLearner	TokenNameIdentifier	 Online Binary Text Classifier Learner
(	TokenNameLPAREN	
(	TokenNameLPAREN	
OnlineClassifierLearner	TokenNameIdentifier	 Online Classifier Learner
)	TokenNameRPAREN	
train	TokenNameIdentifier	 train
.	TokenNameDOT	
learner	TokenNameIdentifier	 learner
,	TokenNameCOMMA	
signal	TokenNameIdentifier	 signal
.	TokenNameDOT	
spanType	TokenNameIdentifier	 span Type
,	TokenNameCOMMA	
labeledData	TokenNameIdentifier	 labeled Data
.	TokenNameDOT	
labeledData	TokenNameIdentifier	 labeled Data
,	TokenNameCOMMA	
train	TokenNameIdentifier	 train
.	TokenNameDOT	
fe	TokenNameIdentifier	 fe
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
OnlineBinaryTextClassifierLearner	TokenNameIdentifier	 Online Binary Text Classifier Learner
obtcl	TokenNameIdentifier	 obtcl
=	TokenNameEQUAL	
(	TokenNameLPAREN	
OnlineBinaryTextClassifierLearner	TokenNameIdentifier	 Online Binary Text Classifier Learner
)	TokenNameRPAREN	
IOUtil	TokenNameIdentifier	 IO Util
.	TokenNameDOT	
loadSerialized	TokenNameIdentifier	 load Serialized
(	TokenNameLPAREN	
test	TokenNameIdentifier	 test
.	TokenNameDOT	
loadFrom	TokenNameIdentifier	 load From
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
textLearner	TokenNameIdentifier	 text Learner
=	TokenNameEQUAL	
obtcl	TokenNameIdentifier	 obtcl
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"can't load annotator from "	TokenNameStringLiteral	can't load annotator from 
+	TokenNamePLUS	
test	TokenNameIdentifier	 test
.	TokenNameDOT	
loadFrom	TokenNameIdentifier	 load From
+	TokenNamePLUS	
": "	TokenNameStringLiteral	: 
+	TokenNamePLUS	
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// TextLabels annLabels; 	TokenNameCOMMENT_LINE	TextLabels annLabels; 
// annLabels=textLearner.annotatedCopy((TextLabels)base.labels); 	TokenNameCOMMENT_LINE	annLabels=textLearner.annotatedCopy((TextLabels)base.labels); 
// OnlineLearnerEditor editor= 	TokenNameCOMMENT_LINE	OnlineLearnerEditor editor= 
// OnlineLearnerEditor.edit(annLabels,(MutableTextLabels)base.labels, 	TokenNameCOMMENT_LINE	OnlineLearnerEditor.edit(annLabels,(MutableTextLabels)base.labels, 
// base.repositoryKey,textLearner); 	TokenNameCOMMENT_LINE	base.repositoryKey,textLearner); 
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
getMainResult	TokenNameIdentifier	 get Main Result
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
textLearner	TokenNameIdentifier	 text Learner
.	TokenNameDOT	
getClassifier	TokenNameIdentifier	 get Classifier
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
main	TokenNameIdentifier	 main
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
new	TokenNamenew	
OnlineLearner	TokenNameIdentifier	 Online Learner
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
callMain	TokenNameIdentifier	 call Main
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
