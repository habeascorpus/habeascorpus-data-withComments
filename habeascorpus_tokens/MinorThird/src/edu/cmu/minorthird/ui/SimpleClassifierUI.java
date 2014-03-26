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
ClassifierLearner	TokenNameIdentifier	 Classifier Learner
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
classify	TokenNameIdentifier	 classify
.	TokenNameDOT	
experiments	TokenNameIdentifier	 experiments
.	TokenNameDOT	
CrossValSplitter	TokenNameIdentifier	 Cross Val Splitter
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
classify	TokenNameIdentifier	 classify
.	TokenNameDOT	
experiments	TokenNameIdentifier	 experiments
.	TokenNameDOT	
Tester	TokenNameIdentifier	 Tester
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
/** * A simple UI for training and testing classifiers * * @author frank */	TokenNameCOMMENT_JAVADOC	 A simple UI for training and testing classifiers * @author frank 
public	TokenNamepublic	
class	TokenNameclass	
SimpleClassifierUI	TokenNameIdentifier	 Simple Classifier UI
{	TokenNameLBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
main	TokenNameIdentifier	 main
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
args	TokenNameIdentifier	 args
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
.	TokenNameDOT	
length	TokenNameIdentifier	 length
<	TokenNameLESS	
4	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
args	TokenNameIdentifier	 args
.	TokenNameDOT	
length	TokenNameIdentifier	 length
>	TokenNameGREATER	
5	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
usage	TokenNameIdentifier	 usage
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
// load parameters 	TokenNameCOMMENT_LINE	load parameters 
File	TokenNameIdentifier	 File
dataFile	TokenNameIdentifier	 data File
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
learnerName	TokenNameIdentifier	 learner Name
=	TokenNameEQUAL	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
cvFolds	TokenNameIdentifier	 cv Folds
=	TokenNameEQUAL	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
parseInt	TokenNameIdentifier	 parse Int
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
gui	TokenNameIdentifier	 gui
=	TokenNameEQUAL	
Boolean	TokenNameIdentifier	 Boolean
.	TokenNameDOT	
parseBoolean	TokenNameIdentifier	 parse Boolean
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
saveFile	TokenNameIdentifier	 save File
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
.	TokenNameDOT	
length	TokenNameIdentifier	 length
==	TokenNameEQUAL_EQUAL	
5	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
saveFile	TokenNameIdentifier	 save File
=	TokenNameEQUAL	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
4	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// load dataset 	TokenNameCOMMENT_LINE	load dataset 
Dataset	TokenNameIdentifier	 Dataset
data	TokenNameIdentifier	 data
=	TokenNameEQUAL	
DatasetLoader	TokenNameIdentifier	 Dataset Loader
.	TokenNameDOT	
loadFile	TokenNameIdentifier	 load File
(	TokenNameLPAREN	
dataFile	TokenNameIdentifier	 data File
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// create learner 	TokenNameCOMMENT_LINE	create learner 
ClassifierLearner	TokenNameIdentifier	 Classifier Learner
learner	TokenNameIdentifier	 learner
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ClassifierLearner	TokenNameIdentifier	 Classifier Learner
)	TokenNameRPAREN	
CommandLineUtil	TokenNameIdentifier	 Command Line Util
.	TokenNameDOT	
newObjectFromBSH	TokenNameIdentifier	 new Object From BSH
(	TokenNameLPAREN	
learnerName	TokenNameIdentifier	 learner Name
,	TokenNameCOMMA	
ClassifierLearner	TokenNameIdentifier	 Classifier Learner
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// evaluate 	TokenNameCOMMENT_LINE	evaluate 
Evaluation	TokenNameIdentifier	 Evaluation
eval	TokenNameIdentifier	 eval
=	TokenNameEQUAL	
Tester	TokenNameIdentifier	 Tester
.	TokenNameDOT	
evaluate	TokenNameIdentifier	 evaluate
(	TokenNameLPAREN	
learner	TokenNameIdentifier	 learner
,	TokenNameCOMMA	
data	TokenNameIdentifier	 data
,	TokenNameCOMMA	
new	TokenNamenew	
CrossValSplitter	TokenNameIdentifier	 Cross Val Splitter
<	TokenNameLESS	
Example	TokenNameIdentifier	 Example
>	TokenNameGREATER	
(	TokenNameLPAREN	
cvFolds	TokenNameIdentifier	 cv Folds
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// view results 	TokenNameCOMMENT_LINE	view results 
if	TokenNameif	
(	TokenNameLPAREN	
gui	TokenNameIdentifier	 gui
)	TokenNameRPAREN	
{	TokenNameLBRACE	
new	TokenNamenew	
ViewerFrame	TokenNameIdentifier	 Viewer Frame
(	TokenNameLPAREN	
"Evaluation Results for "	TokenNameStringLiteral	Evaluation Results for 
+	TokenNamePLUS	
dataFile	TokenNameIdentifier	 data File
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
eval	TokenNameIdentifier	 eval
.	TokenNameDOT	
toGUI	TokenNameIdentifier	 to GUI
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Error Rate: "	TokenNameStringLiteral	Error Rate: 
+	TokenNamePLUS	
eval	TokenNameIdentifier	 eval
.	TokenNameDOT	
errorRate	TokenNameIdentifier	 error Rate
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// save evaluation results 	TokenNameCOMMENT_LINE	save evaluation results 
if	TokenNameif	
(	TokenNameLPAREN	
saveFile	TokenNameIdentifier	 save File
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
eval	TokenNameIdentifier	 eval
.	TokenNameDOT	
save	TokenNameIdentifier	 save
(	TokenNameLPAREN	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
saveFile	TokenNameIdentifier	 save File
+	TokenNamePLUS	
".eval.gz"	TokenNameStringLiteral	.eval.gz
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
printStackTrace	TokenNameIdentifier	 print Stack Trace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
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
"Usage:"	TokenNameStringLiteral	Usage:
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
" SimpleClassifierUI TRAIN_FILE CLASSIFIER CV_FOLDS GUI_OP [EVAL_SAVE_FILE]"	TokenNameStringLiteral	 SimpleClassifierUI TRAIN_FILE CLASSIFIER CV_FOLDS GUI_OP [EVAL_SAVE_FILE]
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
" GUI_OP=[true|false]"	TokenNameStringLiteral	 GUI_OP=[true|false]
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
