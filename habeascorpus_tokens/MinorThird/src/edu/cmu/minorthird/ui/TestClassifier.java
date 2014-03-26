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
experiments	TokenNameIdentifier	 experiments
.	TokenNameDOT	
ClassifiedDataset	TokenNameIdentifier	 Classified Dataset
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
experiments	TokenNameIdentifier	 experiments
.	TokenNameDOT	
Evaluation	TokenNameIdentifier	 Evaluation
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
ViewerFrame	TokenNameIdentifier	 Viewer Frame
;	TokenNameSEMICOLON	
/** * Test an existing text classifier. * * @author William Cohen */	TokenNameCOMMENT_JAVADOC	 Test an existing text classifier. * @author William Cohen 
public	TokenNamepublic	
class	TokenNameclass	
TestClassifier	TokenNameIdentifier	 Test Classifier
extends	TokenNameextends	
UIMain	TokenNameIdentifier	 UI Main
{	TokenNameLBRACE	
// private data needed to test a classifier 	TokenNameCOMMENT_LINE	private data needed to test a classifier 
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
private	TokenNameprivate	
Object	TokenNameIdentifier	 Object
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// for gui 	TokenNameCOMMENT_LINE	for gui 
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
TestClassifierParams	TokenNameIdentifier	 Test Classifier Params
getAdditionalParameters	TokenNameIdentifier	 get Additional Parameters
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
test	TokenNameIdentifier	 test
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setAdditionalParameters	TokenNameIdentifier	 set Additional Parameters
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
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getTestClassifierHelp	TokenNameIdentifier	 get Test Classifier Help
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"<A HREF="http://minorthird.sourceforge.net/tutorials/TestClassifier%20Tutorial.htm">TestClassifier Tutorial</A></html>"	TokenNameStringLiteral	<A HREF="http://minorthird.sourceforge.net/tutorials/TestClassifier%20Tutorial.htm">TestClassifier Tutorial</A></html>
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
test	TokenNameIdentifier	 test
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// 	TokenNameCOMMENT_LINE	 
// load and test a classifier 	TokenNameCOMMENT_LINE	load and test a classifier 
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
test	TokenNameIdentifier	 test
.	TokenNameDOT	
loadFrom	TokenNameIdentifier	 load From
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"-loadFrom must be specified"	TokenNameStringLiteral	-loadFrom must be specified
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// load the classifier 	TokenNameCOMMENT_LINE	load the classifier 
ClassifierAnnotator	TokenNameIdentifier	 Classifier Annotator
ann	TokenNameIdentifier	 ann
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
ann	TokenNameIdentifier	 ann
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ClassifierAnnotator	TokenNameIdentifier	 Classifier Annotator
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
// do the testing and show the result 	TokenNameCOMMENT_LINE	do the testing and show the result 
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
ann	TokenNameIdentifier	 ann
.	TokenNameDOT	
getFE	TokenNameIdentifier	 get FE
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
Evaluation	TokenNameIdentifier	 Evaluation
evaluation	TokenNameIdentifier	 evaluation
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
test	TokenNameIdentifier	 test
.	TokenNameDOT	
showData	TokenNameIdentifier	 show Data
)	TokenNameRPAREN	
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
if	TokenNameif	
(	TokenNameLPAREN	
test	TokenNameIdentifier	 test
.	TokenNameDOT	
showClassifier	TokenNameIdentifier	 show Classifier
)	TokenNameRPAREN	
new	TokenNamenew	
ViewerFrame	TokenNameIdentifier	 Viewer Frame
(	TokenNameLPAREN	
"Classifier"	TokenNameStringLiteral	Classifier
,	TokenNameCOMMA	
new	TokenNamenew	
SmartVanillaViewer	TokenNameIdentifier	 Smart Vanilla Viewer
(	TokenNameLPAREN	
ann	TokenNameIdentifier	 ann
.	TokenNameDOT	
getClassifier	TokenNameIdentifier	 get Classifier
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
evaluation	TokenNameIdentifier	 evaluation
=	TokenNameEQUAL	
new	TokenNamenew	
Evaluation	TokenNameIdentifier	 Evaluation
(	TokenNameLPAREN	
d	TokenNameIdentifier	 d
.	TokenNameDOT	
getSchema	TokenNameIdentifier	 get Schema
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
evaluation	TokenNameIdentifier	 evaluation
.	TokenNameDOT	
extend	TokenNameIdentifier	 extend
(	TokenNameLPAREN	
ann	TokenNameIdentifier	 ann
.	TokenNameDOT	
getClassifier	TokenNameIdentifier	 get Classifier
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
d	TokenNameIdentifier	 d
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
test	TokenNameIdentifier	 test
.	TokenNameDOT	
showTestDetails	TokenNameIdentifier	 show Test Details
)	TokenNameRPAREN	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
new	TokenNamenew	
ClassifiedDataset	TokenNameIdentifier	 Classified Dataset
(	TokenNameLPAREN	
ann	TokenNameIdentifier	 ann
.	TokenNameDOT	
getClassifier	TokenNameIdentifier	 get Classifier
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
d	TokenNameIdentifier	 d
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
evaluation	TokenNameIdentifier	 evaluation
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
base	TokenNameIdentifier	 base
.	TokenNameDOT	
showResult	TokenNameIdentifier	 show Result
)	TokenNameRPAREN	
{	TokenNameLBRACE	
new	TokenNamenew	
ViewerFrame	TokenNameIdentifier	 Viewer Frame
(	TokenNameLPAREN	
"Result"	TokenNameStringLiteral	Result
,	TokenNameCOMMA	
new	TokenNamenew	
SmartVanillaViewer	TokenNameIdentifier	 Smart Vanilla Viewer
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
evaluation	TokenNameIdentifier	 evaluation
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
evaluation	TokenNameIdentifier	 evaluation
.	TokenNameDOT	
summarize	TokenNameIdentifier	 summarize
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
result	TokenNameIdentifier	 result
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
TestClassifier	TokenNameIdentifier	 Test Classifier
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
