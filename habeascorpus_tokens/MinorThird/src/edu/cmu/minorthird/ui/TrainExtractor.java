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
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
Serializable	TokenNameIdentifier	 Serializable
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
Annotator	TokenNameIdentifier	 Annotator
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
AnnotatorTeacher	TokenNameIdentifier	 Annotator Teacher
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
TextLabelsAnnotatorTeacher	TokenNameIdentifier	 Text Labels Annotator Teacher
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
/** * Train a named-entity extractor. * * @author William Cohen */	TokenNameCOMMENT_JAVADOC	 Train a named-entity extractor. * @author William Cohen 
public	TokenNamepublic	
class	TokenNameclass	
TrainExtractor	TokenNameIdentifier	 Train Extractor
extends	TokenNameextends	
UIMain	TokenNameIdentifier	 UI Main
{	TokenNameLBRACE	
// private data needed to train a extractor 	TokenNameCOMMENT_LINE	private data needed to train a extractor 
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
ExtractionSignalParams	TokenNameIdentifier	 Extraction Signal Params
signal	TokenNameIdentifier	 signal
=	TokenNameEQUAL	
new	TokenNamenew	
CommandLineUtil	TokenNameIdentifier	 Command Line Util
.	TokenNameDOT	
ExtractionSignalParams	TokenNameIdentifier	 Extraction Signal Params
(	TokenNameLPAREN	
base	TokenNameIdentifier	 base
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
CommandLineUtil	TokenNameIdentifier	 Command Line Util
.	TokenNameDOT	
TrainExtractorParams	TokenNameIdentifier	 Train Extractor Params
train	TokenNameIdentifier	 train
=	TokenNameEQUAL	
new	TokenNamenew	
CommandLineUtil	TokenNameIdentifier	 Command Line Util
.	TokenNameDOT	
TrainExtractorParams	TokenNameIdentifier	 Train Extractor Params
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Annotator	TokenNameIdentifier	 Annotator
ann	TokenNameIdentifier	 ann
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
TrainExtractorParams	TokenNameIdentifier	 Train Extractor Params
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
TrainExtractorParams	TokenNameIdentifier	 Train Extractor Params
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
ExtractionSignalParams	TokenNameIdentifier	 Extraction Signal Params
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
ExtractionSignalParams	TokenNameIdentifier	 Extraction Signal Params
newSignal	TokenNameIdentifier	 new Signal
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
signal	TokenNameIdentifier	 signal
=	TokenNameEQUAL	
newSignal	TokenNameIdentifier	 new Signal
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getTrainExtractorHelp	TokenNameIdentifier	 get Train Extractor Help
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"<A HREF="http://minorthird.sourceforge.net/tutorials/TrainExtractor%20Tutorial.htm">TrainExtractor Tutorial</A></html>"	TokenNameStringLiteral	<A HREF="http://minorthird.sourceforge.net/tutorials/TrainExtractor%20Tutorial.htm">TrainExtractor Tutorial</A></html>
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
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"-learner must be specified"	TokenNameStringLiteral	-learner must be specified
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
train	TokenNameIdentifier	 train
.	TokenNameDOT	
fe	TokenNameIdentifier	 fe
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
train	TokenNameIdentifier	 train
.	TokenNameDOT	
learner	TokenNameIdentifier	 learner
.	TokenNameDOT	
setSpanFeatureExtractor	TokenNameIdentifier	 set Span Feature Extractor
(	TokenNameLPAREN	
train	TokenNameIdentifier	 train
.	TokenNameDOT	
fe	TokenNameIdentifier	 fe
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
train	TokenNameIdentifier	 train
.	TokenNameDOT	
learner	TokenNameIdentifier	 learner
.	TokenNameDOT	
setAnnotationType	TokenNameIdentifier	 set Annotation Type
(	TokenNameLPAREN	
train	TokenNameIdentifier	 train
.	TokenNameDOT	
output	TokenNameIdentifier	 output
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// do the training 	TokenNameCOMMENT_LINE	do the training 
AnnotatorTeacher	TokenNameIdentifier	 Annotator Teacher
teacher	TokenNameIdentifier	 teacher
=	TokenNameEQUAL	
new	TokenNamenew	
TextLabelsAnnotatorTeacher	TokenNameIdentifier	 Text Labels Annotator Teacher
(	TokenNameLPAREN	
base	TokenNameIdentifier	 base
.	TokenNameDOT	
labels	TokenNameIdentifier	 labels
,	TokenNameCOMMA	
signal	TokenNameIdentifier	 signal
.	TokenNameDOT	
spanType	TokenNameIdentifier	 span Type
,	TokenNameCOMMA	
signal	TokenNameIdentifier	 signal
.	TokenNameDOT	
spanProp	TokenNameIdentifier	 span Prop
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ann	TokenNameIdentifier	 ann
=	TokenNameEQUAL	
teacher	TokenNameIdentifier	 teacher
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
av	TokenNameIdentifier	 av
=	TokenNameEQUAL	
new	TokenNamenew	
SmartVanillaViewer	TokenNameIdentifier	 Smart Vanilla Viewer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
av	TokenNameIdentifier	 av
.	TokenNameDOT	
setContent	TokenNameIdentifier	 set Content
(	TokenNameLPAREN	
ann	TokenNameIdentifier	 ann
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
new	TokenNamenew	
ViewerFrame	TokenNameIdentifier	 Viewer Frame
(	TokenNameLPAREN	
"Extractor"	TokenNameStringLiteral	Extractor
,	TokenNameCOMMA	
av	TokenNameIdentifier	 av
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
(	TokenNameLPAREN	
Serializable	TokenNameIdentifier	 Serializable
)	TokenNameRPAREN	
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
ann	TokenNameIdentifier	 ann
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
TrainExtractor	TokenNameIdentifier	 Train Extractor
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
