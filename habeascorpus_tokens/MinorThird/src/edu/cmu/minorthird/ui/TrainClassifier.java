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
DatasetClassifierTeacher	TokenNameIdentifier	 Dataset Classifier Teacher
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
ClassifierAnnotator	TokenNameIdentifier	 Classifier Annotator
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
SmartVanillaViewer	TokenNameIdentifier	 Smart Vanilla Viewer
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
ViewerFrame	TokenNameIdentifier	 Viewer Frame
;	TokenNameSEMICOLON	
/** * Train a text classifier. * * @author William Cohen */	TokenNameCOMMENT_JAVADOC	 Train a text classifier. * @author William Cohen 
public	TokenNamepublic	
class	TokenNameclass	
TrainClassifier	TokenNameIdentifier	 Train Classifier
extends	TokenNameextends	
UIMain	TokenNameIdentifier	 UI Main
{	TokenNameLBRACE	
// private data needed to train a classifier 	TokenNameCOMMENT_LINE	private data needed to train a classifier 
private	TokenNameprivate	
CommandLineUtil	TokenNameIdentifier	 Command Line Util
.	TokenNameDOT	
SaveParams	TokenNameIdentifier	 Save Params
save	TokenNameIdentifier	 save
=	TokenNameEQUAL	
new	TokenNamenew	
CommandLineUtil	TokenNameIdentifier	 Command Line Util
.	TokenNameDOT	
SaveParams	TokenNameIdentifier	 Save Params
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
CommandLineUtil	TokenNameIdentifier	 Command Line Util
.	TokenNameDOT	
ClassificationSignalParams	TokenNameIdentifier	 Classification Signal Params
signal	TokenNameIdentifier	 signal
=	TokenNameEQUAL	
new	TokenNamenew	
CommandLineUtil	TokenNameIdentifier	 Command Line Util
.	TokenNameDOT	
ClassificationSignalParams	TokenNameIdentifier	 Classification Signal Params
(	TokenNameLPAREN	
base	TokenNameIdentifier	 base
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
Classifier	TokenNameIdentifier	 Classifier
classifier	TokenNameIdentifier	 classifier
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
CommandLineUtil	TokenNameIdentifier	 Command Line Util
.	TokenNameDOT	
SaveParams	TokenNameIdentifier	 Save Params
getSaveParameters	TokenNameIdentifier	 get Save Parameters
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
save	TokenNameIdentifier	 save
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setSaveParameters	TokenNameIdentifier	 set Save Parameters
(	TokenNameLPAREN	
CommandLineUtil	TokenNameIdentifier	 Command Line Util
.	TokenNameDOT	
SaveParams	TokenNameIdentifier	 Save Params
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
{	TokenNameLBRACE	
save	TokenNameIdentifier	 save
=	TokenNameEQUAL	
p	TokenNameIdentifier	 p
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
CommandLineUtil	TokenNameIdentifier	 Command Line Util
.	TokenNameDOT	
ClassificationSignalParams	TokenNameIdentifier	 Classification Signal Params
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
ClassificationSignalParams	TokenNameIdentifier	 Classification Signal Params
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
String	TokenNameIdentifier	 String
getTrainClassifierHelp	TokenNameIdentifier	 get Train Classifier Help
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"<A HREF="http://minorthird.sourceforge.net/tutorials/TrainClassifier%20Tutorial.htm">TrainClassifier Tutorial</A></html>"	TokenNameStringLiteral	<A HREF="http://minorthird.sourceforge.net/tutorials/TrainClassifier%20Tutorial.htm">TrainClassifier Tutorial</A></html>
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
save	TokenNameIdentifier	 save
,	TokenNameCOMMA	
signal	TokenNameIdentifier	 signal
,	TokenNameCOMMA	
train	TokenNameIdentifier	 train
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
spanProp	TokenNameIdentifier	 span Prop
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
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
"one of -spanProp or -spanType must be specified"	TokenNameStringLiteral	one of -spanProp or -spanType must be specified
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
signal	TokenNameIdentifier	 signal
.	TokenNameDOT	
spanProp	TokenNameIdentifier	 span Prop
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
signal	TokenNameIdentifier	 signal
.	TokenNameDOT	
spanType	TokenNameIdentifier	 span Type
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"only one of -spanProp or -spanType can be specified"	TokenNameStringLiteral	only one of -spanProp or -spanType can be specified
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// construct the dataset 	TokenNameCOMMENT_LINE	construct the dataset 
Dataset	TokenNameIdentifier	 Dataset
d	TokenNameIdentifier	 d
=	TokenNameEQUAL	
CommandLineUtil	TokenNameIdentifier	 Command Line Util
.	TokenNameDOT	
toDataset	TokenNameIdentifier	 to Dataset
(	TokenNameLPAREN	
base	TokenNameIdentifier	 base
.	TokenNameDOT	
labels	TokenNameIdentifier	 labels
,	TokenNameCOMMA	
train	TokenNameIdentifier	 train
.	TokenNameDOT	
fe	TokenNameIdentifier	 fe
,	TokenNameCOMMA	
signal	TokenNameIdentifier	 signal
.	TokenNameDOT	
spanProp	TokenNameIdentifier	 span Prop
,	TokenNameCOMMA	
signal	TokenNameIdentifier	 signal
.	TokenNameDOT	
spanType	TokenNameIdentifier	 span Type
,	TokenNameCOMMA	
signal	TokenNameIdentifier	 signal
.	TokenNameDOT	
candidateType	TokenNameIdentifier	 candidate Type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
train	TokenNameIdentifier	 train
.	TokenNameDOT	
showData	TokenNameIdentifier	 show Data
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Trying to show the Dataset"	TokenNameStringLiteral	Trying to show the Dataset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
new	TokenNamenew	
ViewerFrame	TokenNameIdentifier	 Viewer Frame
(	TokenNameLPAREN	
"Dataset"	TokenNameStringLiteral	Dataset
,	TokenNameCOMMA	
d	TokenNameIdentifier	 d
.	TokenNameDOT	
toGUI	TokenNameIdentifier	 to GUI
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/*Dataset seqDataset = CommandLineUtil.toSeqDataset(base.labels,train.fe,signal.spanProp,"combined"); if (train.showData) { System.out.println("Trying to create Sequential Dataset"); new ViewerFrame("SequenceDataset", seqDataset.toGUI()); }*/	TokenNameCOMMENT_BLOCK	Dataset seqDataset = CommandLineUtil.toSeqDataset(base.labels,train.fe,signal.spanProp,"combined"); if (train.showData) { System.out.println("Trying to create Sequential Dataset"); new ViewerFrame("SequenceDataset", seqDataset.toGUI()); }
// train the classifier 	TokenNameCOMMENT_LINE	train the classifier 
classifier	TokenNameIdentifier	 classifier
=	TokenNameEQUAL	
new	TokenNamenew	
DatasetClassifierTeacher	TokenNameIdentifier	 Dataset Classifier Teacher
(	TokenNameLPAREN	
d	TokenNameIdentifier	 d
)	TokenNameRPAREN	
.	TokenNameDOT	
train	TokenNameIdentifier	 train
(	TokenNameLPAREN	
train	TokenNameIdentifier	 train
.	TokenNameDOT	
learner	TokenNameIdentifier	 learner
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
base	TokenNameIdentifier	 base
.	TokenNameDOT	
showResult	TokenNameIdentifier	 show Result
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Viewer	TokenNameIdentifier	 Viewer
cv	TokenNameIdentifier	 cv
=	TokenNameEQUAL	
new	TokenNamenew	
SmartVanillaViewer	TokenNameIdentifier	 Smart Vanilla Viewer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cv	TokenNameIdentifier	 cv
.	TokenNameDOT	
setContent	TokenNameIdentifier	 set Content
(	TokenNameLPAREN	
classifier	TokenNameIdentifier	 classifier
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
new	TokenNamenew	
ViewerFrame	TokenNameIdentifier	 Viewer Frame
(	TokenNameLPAREN	
"Classifier"	TokenNameStringLiteral	Classifier
,	TokenNameCOMMA	
cv	TokenNameIdentifier	 cv
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
signal	TokenNameIdentifier	 signal
.	TokenNameDOT	
getOutputType	TokenNameIdentifier	 get Output Type
(	TokenNameLPAREN	
train	TokenNameIdentifier	 train
.	TokenNameDOT	
output	TokenNameIdentifier	 output
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
prop	TokenNameIdentifier	 prop
=	TokenNameEQUAL	
signal	TokenNameIdentifier	 signal
.	TokenNameDOT	
getOutputProp	TokenNameIdentifier	 get Output Prop
(	TokenNameLPAREN	
train	TokenNameIdentifier	 train
.	TokenNameDOT	
output	TokenNameIdentifier	 output
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ClassifierAnnotator	TokenNameIdentifier	 Classifier Annotator
ann	TokenNameIdentifier	 ann
=	TokenNameEQUAL	
new	TokenNamenew	
ClassifierAnnotator	TokenNameIdentifier	 Classifier Annotator
(	TokenNameLPAREN	
train	TokenNameIdentifier	 train
.	TokenNameDOT	
fe	TokenNameIdentifier	 fe
,	TokenNameCOMMA	
classifier	TokenNameIdentifier	 classifier
,	TokenNameCOMMA	
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
prop	TokenNameIdentifier	 prop
,	TokenNameCOMMA	
signal	TokenNameIdentifier	 signal
.	TokenNameDOT	
candidateType	TokenNameIdentifier	 candidate Type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
save	TokenNameIdentifier	 save
.	TokenNameDOT	
saveAs	TokenNameIdentifier	 save As
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
IOUtil	TokenNameIdentifier	 IO Util
.	TokenNameDOT	
saveSerialized	TokenNameIdentifier	 save Serialized
(	TokenNameLPAREN	
ann	TokenNameIdentifier	 ann
,	TokenNameCOMMA	
save	TokenNameIdentifier	 save
.	TokenNameDOT	
saveAs	TokenNameIdentifier	 save As
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"can't save to "	TokenNameStringLiteral	can't save to 
+	TokenNamePLUS	
save	TokenNameIdentifier	 save
.	TokenNameDOT	
saveAs	TokenNameIdentifier	 save As
+	TokenNamePLUS	
": "	TokenNameStringLiteral	: 
+	TokenNamePLUS	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
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
classifier	TokenNameIdentifier	 classifier
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
TrainClassifier	TokenNameIdentifier	 Train Classifier
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
