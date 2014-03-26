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
File	TokenNameIdentifier	 File
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
FileOutputStream	TokenNameIdentifier	 File Output Stream
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
PrintStream	TokenNameIdentifier	 Print Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Iterator	TokenNameIdentifier	 Iterator
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
DatasetLoader	TokenNameIdentifier	 Dataset Loader
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
text	TokenNameIdentifier	 text
.	TokenNameDOT	
Span	TokenNameIdentifier	 Span
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
SpanFeatureExtractor	TokenNameIdentifier	 Span Feature Extractor
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
BasicCommandLineProcessor	TokenNameIdentifier	 Basic Command Line Processor
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
ViewerFrame	TokenNameIdentifier	 Viewer Frame
;	TokenNameSEMICOLON	
/** * Preprocess text data for classification. * * @author William Cohen */	TokenNameCOMMENT_JAVADOC	 Preprocess text data for classification. * @author William Cohen 
public	TokenNamepublic	
class	TokenNameclass	
PreprocessTextForClassifier	TokenNameIdentifier	 Preprocess Text For Classifier
extends	TokenNameextends	
UIMain	TokenNameIdentifier	 UI Main
{	TokenNameLBRACE	
// private static Logger log=Logger.getLogger(PreprocessTextForClassifier.class); 	TokenNameCOMMENT_LINE	private static Logger log=Logger.getLogger(PreprocessTextForClassifier.class); 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
linkFileName	TokenNameIdentifier	 link File Name
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
SpanFeatureExtractor	TokenNameIdentifier	 Span Feature Extractor
fe	TokenNameIdentifier	 fe
=	TokenNameEQUAL	
new	TokenNamenew	
Recommended	TokenNameIdentifier	 Recommended
.	TokenNameDOT	
DocumentFE	TokenNameIdentifier	 Document FE
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
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
protected	TokenNameprotected	
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
protected	TokenNameprotected	
Dataset	TokenNameIdentifier	 Dataset
dataset	TokenNameIdentifier	 dataset
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
LinkFileParams	TokenNameIdentifier	 Link File Params
extends	TokenNameextends	
BasicCommandLineProcessor	TokenNameIdentifier	 Basic Command Line Processor
{	TokenNameLBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
linkFileHelp	TokenNameIdentifier	 link File Help
=	TokenNameEQUAL	
"file to save mapping between examples and spans they correspond to"	TokenNameStringLiteral	file to save mapping between examples and spans they correspond to
;	TokenNameSEMICOLON	
public	TokenNamepublic	
void	TokenNamevoid	
linkFile	TokenNameIdentifier	 link File
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
{	TokenNameLBRACE	
linkFileName	TokenNameIdentifier	 link File Name
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
CommandLineProcessor	TokenNameIdentifier	 Command Line Processor
fe	TokenNameIdentifier	 fe
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fe	TokenNameIdentifier	 fe
=	TokenNameEQUAL	
(	TokenNameLPAREN	
SpanFeatureExtractor	TokenNameIdentifier	 Span Feature Extractor
)	TokenNameRPAREN	
CommandLineUtil	TokenNameIdentifier	 Command Line Util
.	TokenNameDOT	
newObjectFromBSH	TokenNameIdentifier	 new Object From BSH
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
,	TokenNameCOMMA	
SpanFeatureExtractor	TokenNameIdentifier	 Span Feature Extractor
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
fe	TokenNameIdentifier	 fe
instanceof	TokenNameinstanceof	
CommandLineProcessor	TokenNameIdentifier	 Command Line Processor
.	TokenNameDOT	
Configurable	TokenNameIdentifier	 Configurable
)	TokenNameRPAREN	
?	TokenNameQUESTION	
tryToGetCLP	TokenNameIdentifier	 try To Get CLP
(	TokenNameLPAREN	
fe	TokenNameIdentifier	 fe
)	TokenNameRPAREN	
:	TokenNameCOLON	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
CommandLineProcessor	TokenNameIdentifier	 Command Line Processor
feOp	TokenNameIdentifier	 fe Op
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
tryToGetCLP	TokenNameIdentifier	 try To Get CLP
(	TokenNameLPAREN	
fe	TokenNameIdentifier	 fe
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
usage	TokenNameIdentifier	 usage
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"special parameters:"	TokenNameStringLiteral	special parameters:
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
" [-linkFile FILE] "	TokenNameStringLiteral	 [-linkFile FILE] 
+	TokenNamePLUS	
linkFileHelp	TokenNameIdentifier	 link File Help
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
" [-fe beanshell] "	TokenNameStringLiteral	 [-fe beanshell] 
+	TokenNamePLUS	
"feature extractor"	TokenNameStringLiteral	feature extractor
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
" [-feOp opt1 ...] "	TokenNameStringLiteral	 [-feOp opt1 ...] 
+	TokenNamePLUS	
"options for feature extractor"	TokenNameStringLiteral	options for feature extractor
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getLinkFileHelp	TokenNameIdentifier	 get Link File Help
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
linkFileHelp	TokenNameIdentifier	 link File Help
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
new	TokenNamenew	
LinkFileParams	TokenNameIdentifier	 Link File Params
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
gui	TokenNameIdentifier	 gui
,	TokenNameCOMMA	
base	TokenNameIdentifier	 base
,	TokenNameCOMMA	
signal	TokenNameIdentifier	 signal
,	TokenNameCOMMA	
save	TokenNameIdentifier	 save
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getLinkFile	TokenNameIdentifier	 get Link File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
linkFileName	TokenNameIdentifier	 link File Name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setLinkFile	TokenNameIdentifier	 set Link File
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
{	TokenNameLBRACE	
linkFileName	TokenNameIdentifier	 link File Name
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
SpanFeatureExtractor	TokenNameIdentifier	 Span Feature Extractor
getFeatureExtractor	TokenNameIdentifier	 get Feature Extractor
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fe	TokenNameIdentifier	 fe
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setFeatureExtractor	TokenNameIdentifier	 set Feature Extractor
(	TokenNameLPAREN	
SpanFeatureExtractor	TokenNameIdentifier	 Span Feature Extractor
fe	TokenNameIdentifier	 fe
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
fe	TokenNameIdentifier	 fe
=	TokenNameEQUAL	
fe	TokenNameIdentifier	 fe
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
// 	TokenNameCOMMENT_LINE	 
// do it 	TokenNameCOMMENT_LINE	do it 
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
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"one of -spanProp or -spanType must be specified"	TokenNameStringLiteral	one of -spanProp or -spanType must be specified
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"only one of -spanProp or -spanType can be specified"	TokenNameStringLiteral	only one of -spanProp or -spanType can be specified
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
save	TokenNameIdentifier	 save
.	TokenNameDOT	
saveAs	TokenNameIdentifier	 save As
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"-saveAs must be specified"	TokenNameStringLiteral	-saveAs must be specified
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// construct the dataset and save it 	TokenNameCOMMENT_LINE	construct the dataset and save it 
//if (tagDataFlag) { 	TokenNameCOMMENT_LINE	if (tagDataFlag) { 
// dataset = 	TokenNameCOMMENT_LINE	dataset = 
//SequenceAnnotatorLearner.prepareSequenceData(base.labels,signal.spanProp,signal.spanType,fe,historySize,reduction); 	TokenNameCOMMENT_LINE	SequenceAnnotatorLearner.prepareSequenceData(base.labels,signal.spanProp,signal.spanType,fe,historySize,reduction); 
dataset	TokenNameIdentifier	 dataset
=	TokenNameEQUAL	
CommandLineUtil	TokenNameIdentifier	 Command Line Util
.	TokenNameDOT	
toDataset	TokenNameIdentifier	 to Dataset
(	TokenNameLPAREN	
base	TokenNameIdentifier	 base
.	TokenNameDOT	
labels	TokenNameIdentifier	 labels
,	TokenNameCOMMA	
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
try	TokenNametry	
{	TokenNameLBRACE	
DatasetLoader	TokenNameIdentifier	 Dataset Loader
.	TokenNameDOT	
save	TokenNameIdentifier	 save
(	TokenNameLPAREN	
dataset	TokenNameIdentifier	 dataset
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
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"error saving dataset to '"	TokenNameStringLiteral	error saving dataset to '
+	TokenNamePLUS	
save	TokenNameIdentifier	 save
.	TokenNameDOT	
saveAs	TokenNameIdentifier	 save As
+	TokenNamePLUS	
"': "	TokenNameStringLiteral	': 
+	TokenNamePLUS	
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
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
"Dataset"	TokenNameStringLiteral	Dataset
,	TokenNameCOMMA	
dataset	TokenNameIdentifier	 dataset
.	TokenNameDOT	
toGUI	TokenNameIdentifier	 to GUI
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
linkFileName	TokenNameIdentifier	 link File Name
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
saveLinkInfo	TokenNameIdentifier	 save Link Info
(	TokenNameLPAREN	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
linkFileName	TokenNameIdentifier	 link File Name
)	TokenNameRPAREN	
,	TokenNameCOMMA	
dataset	TokenNameIdentifier	 dataset
,	TokenNameCOMMA	
save	TokenNameIdentifier	 save
.	TokenNameDOT	
getSaveAs	TokenNameIdentifier	 get Save As
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"error saving link information to '"	TokenNameStringLiteral	error saving link information to '
+	TokenNamePLUS	
linkFileName	TokenNameIdentifier	 link File Name
+	TokenNamePLUS	
"': "	TokenNameStringLiteral	': 
+	TokenNamePLUS	
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
saveLinkInfo	TokenNameIdentifier	 save Link Info
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
linkFile	TokenNameIdentifier	 link File
,	TokenNameCOMMA	
Dataset	TokenNameIdentifier	 Dataset
dataset	TokenNameIdentifier	 dataset
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
datasetFileName	TokenNameIdentifier	 dataset File Name
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
int	TokenNameint	
lineNo	TokenNameIdentifier	 line No
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
PrintStream	TokenNameIdentifier	 Print Stream
out	TokenNameIdentifier	 out
=	TokenNameEQUAL	
new	TokenNamenew	
PrintStream	TokenNameIdentifier	 Print Stream
(	TokenNameLPAREN	
new	TokenNamenew	
FileOutputStream	TokenNameIdentifier	 File Output Stream
(	TokenNameLPAREN	
linkFile	TokenNameIdentifier	 link File
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Example	TokenNameIdentifier	 Example
>	TokenNameGREATER	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
dataset	TokenNameIdentifier	 dataset
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
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
ex	TokenNameIdentifier	 ex
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lineNo	TokenNameIdentifier	 line No
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
(	TokenNameLPAREN	
ex	TokenNameIdentifier	 ex
.	TokenNameDOT	
getSource	TokenNameIdentifier	 get Source
(	TokenNameLPAREN	
)	TokenNameRPAREN	
instanceof	TokenNameinstanceof	
Span	TokenNameIdentifier	 Span
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"example not associated with a span: "	TokenNameStringLiteral	example not associated with a span: 
+	TokenNamePLUS	
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Span	TokenNameIdentifier	 Span
span	TokenNameIdentifier	 span
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Span	TokenNameIdentifier	 Span
)	TokenNameRPAREN	
ex	TokenNameIdentifier	 ex
.	TokenNameDOT	
getSource	TokenNameIdentifier	 get Source
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
DatasetLoader	TokenNameIdentifier	 Dataset Loader
.	TokenNameDOT	
getSourceAssignedToExample	TokenNameIdentifier	 get Source Assigned To Example
(	TokenNameLPAREN	
datasetFileName	TokenNameIdentifier	 dataset File Name
,	TokenNameCOMMA	
lineNo	TokenNameIdentifier	 line No
)	TokenNameRPAREN	
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
span	TokenNameIdentifier	 span
.	TokenNameDOT	
getDocumentId	TokenNameIdentifier	 get Document Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
span	TokenNameIdentifier	 span
.	TokenNameDOT	
getLoChar	TokenNameIdentifier	 get Lo Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
(	TokenNameLPAREN	
span	TokenNameIdentifier	 span
.	TokenNameDOT	
getHiChar	TokenNameIdentifier	 get Hi Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
span	TokenNameIdentifier	 span
.	TokenNameDOT	
getLoChar	TokenNameIdentifier	 get Lo Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
close	TokenNameIdentifier	 close
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
dataset	TokenNameIdentifier	 dataset
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
PreprocessTextForClassifier	TokenNameIdentifier	 Preprocess Text For Classifier
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
