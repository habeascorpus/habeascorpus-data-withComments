package	TokenNamepackage	
edu	TokenNameIdentifier	 edu
.	TokenNameDOT	
cmu	TokenNameIdentifier	 cmu
.	TokenNameDOT	
minorthird	TokenNameIdentifier	 minorthird
.	TokenNameDOT	
classify	TokenNameIdentifier	 classify
.	TokenNameDOT	
experiments	TokenNameIdentifier	 experiments
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
trees	TokenNameIdentifier	 trees
.	TokenNameDOT	
DecisionTreeLearner	TokenNameIdentifier	 Decision Tree Learner
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
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
Logger	TokenNameIdentifier	 Logger
;	TokenNameSEMICOLON	
/** * View result of some sort of train/test experiment. * * @author William Cohen */	TokenNameCOMMENT_JAVADOC	 View result of some sort of train/test experiment. * @author William Cohen 
public	TokenNamepublic	
class	TokenNameclass	
CrossValidatedDataset	TokenNameIdentifier	 Cross Validated Dataset
implements	TokenNameimplements	
Visible	TokenNameIdentifier	 Visible
{	TokenNameLBRACE	
static	TokenNamestatic	
private	TokenNameprivate	
Logger	TokenNameIdentifier	 Logger
log	TokenNameIdentifier	 log
=	TokenNameEQUAL	
Logger	TokenNameIdentifier	 Logger
.	TokenNameDOT	
getLogger	TokenNameIdentifier	 get Logger
(	TokenNameLPAREN	
CrossValidatedDataset	TokenNameIdentifier	 Cross Validated Dataset
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
ClassifiedDataset	TokenNameIdentifier	 Classified Dataset
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
cds	TokenNameIdentifier	 cds
;	TokenNameSEMICOLON	
private	TokenNameprivate	
ClassifiedDataset	TokenNameIdentifier	 Classified Dataset
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
trainCds	TokenNameIdentifier	 train Cds
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Evaluation	TokenNameIdentifier	 Evaluation
v	TokenNameIdentifier	 v
;	TokenNameSEMICOLON	
public	TokenNamepublic	
CrossValidatedDataset	TokenNameIdentifier	 Cross Validated Dataset
(	TokenNameLPAREN	
ClassifierLearner	TokenNameIdentifier	 Classifier Learner
learner	TokenNameIdentifier	 learner
,	TokenNameCOMMA	
Dataset	TokenNameIdentifier	 Dataset
d	TokenNameIdentifier	 d
,	TokenNameCOMMA	
Splitter	TokenNameIdentifier	 Splitter
<	TokenNameLESS	
Example	TokenNameIdentifier	 Example
>	TokenNameGREATER	
splitter	TokenNameIdentifier	 splitter
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
learner	TokenNameIdentifier	 learner
,	TokenNameCOMMA	
d	TokenNameIdentifier	 d
,	TokenNameCOMMA	
splitter	TokenNameIdentifier	 splitter
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
CrossValidatedDataset	TokenNameIdentifier	 Cross Validated Dataset
(	TokenNameLPAREN	
ClassifierLearner	TokenNameIdentifier	 Classifier Learner
learner	TokenNameIdentifier	 learner
,	TokenNameCOMMA	
Dataset	TokenNameIdentifier	 Dataset
d	TokenNameIdentifier	 d
,	TokenNameCOMMA	
Splitter	TokenNameIdentifier	 Splitter
<	TokenNameLESS	
Example	TokenNameIdentifier	 Example
>	TokenNameGREATER	
splitter	TokenNameIdentifier	 splitter
,	TokenNameCOMMA	
boolean	TokenNameboolean	
saveTrainPartitions	TokenNameIdentifier	 save Train Partitions
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Dataset	TokenNameIdentifier	 Dataset
.	TokenNameDOT	
Split	TokenNameIdentifier	 Split
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
d	TokenNameIdentifier	 d
.	TokenNameDOT	
split	TokenNameIdentifier	 split
(	TokenNameLPAREN	
splitter	TokenNameIdentifier	 splitter
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cds	TokenNameIdentifier	 cds
=	TokenNameEQUAL	
new	TokenNamenew	
ClassifiedDataset	TokenNameIdentifier	 Classified Dataset
[	TokenNameLBRACKET	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
getNumPartitions	TokenNameIdentifier	 get Num Partitions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
trainCds	TokenNameIdentifier	 train Cds
=	TokenNameEQUAL	
saveTrainPartitions	TokenNameIdentifier	 save Train Partitions
?	TokenNameQUESTION	
new	TokenNamenew	
ClassifiedDataset	TokenNameIdentifier	 Classified Dataset
[	TokenNameLBRACKET	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
getNumPartitions	TokenNameIdentifier	 get Num Partitions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
:	TokenNameCOLON	
null	TokenNamenull	
;	TokenNameSEMICOLON	
v	TokenNameIdentifier	 v
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
ProgressCounter	TokenNameIdentifier	 Progress Counter
pc	TokenNameIdentifier	 pc
=	TokenNameEQUAL	
new	TokenNamenew	
ProgressCounter	TokenNameIdentifier	 Progress Counter
(	TokenNameLPAREN	
"train/test"	TokenNameStringLiteral	train/test
,	TokenNameCOMMA	
"fold"	TokenNameStringLiteral	fold
,	TokenNameCOMMA	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
getNumPartitions	TokenNameIdentifier	 get Num Partitions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
log	TokenNameIdentifier	 log
.	TokenNameDOT	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
"Number of splits: "	TokenNameStringLiteral	Number of splits: 
+	TokenNamePLUS	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
getNumPartitions	TokenNameIdentifier	 get Num Partitions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
s	TokenNameIdentifier	 s
.	TokenNameDOT	
getNumPartitions	TokenNameIdentifier	 get Num Partitions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
k	TokenNameIdentifier	 k
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Dataset	TokenNameIdentifier	 Dataset
trainData	TokenNameIdentifier	 train Data
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
getTrain	TokenNameIdentifier	 get Train
(	TokenNameLPAREN	
k	TokenNameIdentifier	 k
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Dataset	TokenNameIdentifier	 Dataset
testData	TokenNameIdentifier	 test Data
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
getTest	TokenNameIdentifier	 get Test
(	TokenNameLPAREN	
k	TokenNameIdentifier	 k
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
log	TokenNameIdentifier	 log
.	TokenNameDOT	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
"Split with "	TokenNameStringLiteral	Split with 
+	TokenNamePLUS	
splitter	TokenNameIdentifier	 splitter
+	TokenNamePLUS	
": training on "	TokenNameStringLiteral	: training on 
+	TokenNamePLUS	
trainData	TokenNameIdentifier	 train Data
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" and testing on "	TokenNameStringLiteral	 and testing on 
+	TokenNamePLUS	
testData	TokenNameIdentifier	 test Data
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Classifier	TokenNameIdentifier	 Classifier
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
new	TokenNamenew	
DatasetClassifierTeacher	TokenNameIdentifier	 Dataset Classifier Teacher
(	TokenNameLPAREN	
trainData	TokenNameIdentifier	 train Data
)	TokenNameRPAREN	
.	TokenNameDOT	
train	TokenNameIdentifier	 train
(	TokenNameLPAREN	
learner	TokenNameIdentifier	 learner
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
DatasetIndex	TokenNameIdentifier	 Dataset Index
testIndex	TokenNameIdentifier	 test Index
=	TokenNameEQUAL	
new	TokenNamenew	
DatasetIndex	TokenNameIdentifier	 Dataset Index
(	TokenNameLPAREN	
testData	TokenNameIdentifier	 test Data
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cds	TokenNameIdentifier	 cds
[	TokenNameLBRACKET	
k	TokenNameIdentifier	 k
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
ClassifiedDataset	TokenNameIdentifier	 Classified Dataset
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
,	TokenNameCOMMA	
testData	TokenNameIdentifier	 test Data
,	TokenNameCOMMA	
testIndex	TokenNameIdentifier	 test Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
trainCds	TokenNameIdentifier	 train Cds
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
trainCds	TokenNameIdentifier	 train Cds
[	TokenNameLBRACKET	
k	TokenNameIdentifier	 k
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
ClassifiedDataset	TokenNameIdentifier	 Classified Dataset
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
,	TokenNameCOMMA	
trainData	TokenNameIdentifier	 train Data
,	TokenNameCOMMA	
testIndex	TokenNameIdentifier	 test Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
v	TokenNameIdentifier	 v
.	TokenNameDOT	
extend	TokenNameIdentifier	 extend
(	TokenNameLPAREN	
cds	TokenNameIdentifier	 cds
[	TokenNameLBRACKET	
k	TokenNameIdentifier	 k
]	TokenNameRBRACKET	
.	TokenNameDOT	
getClassifier	TokenNameIdentifier	 get Classifier
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
testData	TokenNameIdentifier	 test Data
,	TokenNameCOMMA	
k	TokenNameIdentifier	 k
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
v	TokenNameIdentifier	 v
.	TokenNameDOT	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
"classesInFold"	TokenNameStringLiteral	classesInFold
+	TokenNamePLUS	
(	TokenNameLPAREN	
k	TokenNameIdentifier	 k
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"train: "	TokenNameStringLiteral	train: 
+	TokenNamePLUS	
classDistributionString	TokenNameIdentifier	 class Distribution String
(	TokenNameLPAREN	
trainData	TokenNameIdentifier	 train Data
.	TokenNameDOT	
getSchema	TokenNameIdentifier	 get Schema
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
DatasetIndex	TokenNameIdentifier	 Dataset Index
(	TokenNameLPAREN	
trainData	TokenNameIdentifier	 train Data
)	TokenNameRPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" test: "	TokenNameStringLiteral	 test: 
+	TokenNamePLUS	
classDistributionString	TokenNameIdentifier	 class Distribution String
(	TokenNameLPAREN	
testData	TokenNameIdentifier	 test Data
.	TokenNameDOT	
getSchema	TokenNameIdentifier	 get Schema
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
testIndex	TokenNameIdentifier	 test Index
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
log	TokenNameIdentifier	 log
.	TokenNameDOT	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
"Stored classified dataset"	TokenNameStringLiteral	Stored classified dataset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pc	TokenNameIdentifier	 pc
.	TokenNameDOT	
progress	TokenNameIdentifier	 progress
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
pc	TokenNameIdentifier	 pc
.	TokenNameDOT	
finished	TokenNameIdentifier	 finished
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
classDistributionString	TokenNameIdentifier	 class Distribution String
(	TokenNameLPAREN	
ExampleSchema	TokenNameIdentifier	 Example Schema
schema	TokenNameIdentifier	 schema
,	TokenNameCOMMA	
DatasetIndex	TokenNameIdentifier	 Dataset Index
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StringBuffer	TokenNameIdentifier	 String Buffer
buf	TokenNameIdentifier	 buf
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
DecimalFormat	TokenNameIdentifier	 Decimal Format
fmt	TokenNameIdentifier	 fmt
=	TokenNameEQUAL	
new	TokenNamenew	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
DecimalFormat	TokenNameIdentifier	 Decimal Format
(	TokenNameLPAREN	
"#####"	TokenNameStringLiteral	#####
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
schema	TokenNameIdentifier	 schema
.	TokenNameDOT	
getNumberOfClasses	TokenNameIdentifier	 get Number Of Classes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"; "	TokenNameStringLiteral	; 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
label	TokenNameIdentifier	 label
=	TokenNameEQUAL	
schema	TokenNameIdentifier	 schema
.	TokenNameDOT	
getClassName	TokenNameIdentifier	 get Class Name
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
fmt	TokenNameIdentifier	 fmt
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
label	TokenNameIdentifier	 label
)	TokenNameRPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
label	TokenNameIdentifier	 label
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
Viewer	TokenNameIdentifier	 Viewer
toGUI	TokenNameIdentifier	 to GUI
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ParallelViewer	TokenNameIdentifier	 Parallel Viewer
main	TokenNameIdentifier	 main
=	TokenNameEQUAL	
new	TokenNamenew	
ParallelViewer	TokenNameIdentifier	 Parallel Viewer
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
cds	TokenNameIdentifier	 cds
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
k	TokenNameIdentifier	 k
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
main	TokenNameIdentifier	 main
.	TokenNameDOT	
addSubView	TokenNameIdentifier	 add Sub View
(	TokenNameLPAREN	
"Test Partition "	TokenNameStringLiteral	Test Partition 
+	TokenNamePLUS	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
TransformedViewer	TokenNameIdentifier	 Transformed Viewer
(	TokenNameLPAREN	
cds	TokenNameIdentifier	 cds
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
toGUI	TokenNameIdentifier	 to GUI
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
20080130L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
transform	TokenNameIdentifier	 transform
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//what is this for? - frank 	TokenNameCOMMENT_LINE	what is this for? - frank 
//CrossValidatedDataset cvd = (CrossValidatedDataset)o; 	TokenNameCOMMENT_LINE	CrossValidatedDataset cvd = (CrossValidatedDataset)o; 
return	TokenNamereturn	
cds	TokenNameIdentifier	 cds
[	TokenNameLBRACKET	
k	TokenNameIdentifier	 k
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
trainCds	TokenNameIdentifier	 train Cds
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
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
trainCds	TokenNameIdentifier	 train Cds
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
k	TokenNameIdentifier	 k
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
main	TokenNameIdentifier	 main
.	TokenNameDOT	
addSubView	TokenNameIdentifier	 add Sub View
(	TokenNameLPAREN	
"Train Partition "	TokenNameStringLiteral	Train Partition 
+	TokenNamePLUS	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
TransformedViewer	TokenNameIdentifier	 Transformed Viewer
(	TokenNameLPAREN	
cds	TokenNameIdentifier	 cds
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
toGUI	TokenNameIdentifier	 to GUI
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
20080130L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
transform	TokenNameIdentifier	 transform
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//what is this for? - frank 	TokenNameCOMMENT_LINE	what is this for? - frank 
//CrossValidatedDataset cvd = (CrossValidatedDataset)o; 	TokenNameCOMMENT_LINE	CrossValidatedDataset cvd = (CrossValidatedDataset)o; 
return	TokenNamereturn	
trainCds	TokenNameIdentifier	 train Cds
[	TokenNameLBRACKET	
k	TokenNameIdentifier	 k
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
main	TokenNameIdentifier	 main
.	TokenNameDOT	
addSubView	TokenNameIdentifier	 add Sub View
(	TokenNameLPAREN	
"Overall Evaluation"	TokenNameStringLiteral	Overall Evaluation
,	TokenNameCOMMA	
new	TokenNamenew	
TransformedViewer	TokenNameIdentifier	 Transformed Viewer
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
.	TokenNameDOT	
toGUI	TokenNameIdentifier	 to GUI
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
20080130L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
transform	TokenNameIdentifier	 transform
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
{	TokenNameLBRACE	
CrossValidatedDataset	TokenNameIdentifier	 Cross Validated Dataset
cvd	TokenNameIdentifier	 cvd
=	TokenNameEQUAL	
(	TokenNameLPAREN	
CrossValidatedDataset	TokenNameIdentifier	 Cross Validated Dataset
)	TokenNameRPAREN	
o	TokenNameIdentifier	 o
;	TokenNameSEMICOLON	
return	TokenNamereturn	
cvd	TokenNameIdentifier	 cvd
.	TokenNameDOT	
v	TokenNameIdentifier	 v
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
main	TokenNameIdentifier	 main
.	TokenNameDOT	
setContent	TokenNameIdentifier	 set Content
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
main	TokenNameIdentifier	 main
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Evaluation	TokenNameIdentifier	 Evaluation
getEvaluation	TokenNameIdentifier	 get Evaluation
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
v	TokenNameIdentifier	 v
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
Dataset	TokenNameIdentifier	 Dataset
train	TokenNameIdentifier	 train
=	TokenNameEQUAL	
SampleDatasets	TokenNameIdentifier	 Sample Datasets
.	TokenNameDOT	
sampleData	TokenNameIdentifier	 sample Data
(	TokenNameLPAREN	
"toy"	TokenNameStringLiteral	toy
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ClassifierLearner	TokenNameIdentifier	 Classifier Learner
learner	TokenNameIdentifier	 learner
=	TokenNameEQUAL	
new	TokenNamenew	
DecisionTreeLearner	TokenNameIdentifier	 Decision Tree Learner
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//ClassifierLearner learner = new NaiveBayes(); 	TokenNameCOMMENT_LINE	ClassifierLearner learner = new NaiveBayes(); 
CrossValidatedDataset	TokenNameIdentifier	 Cross Validated Dataset
cd	TokenNameIdentifier	 cd
=	TokenNameEQUAL	
new	TokenNamenew	
CrossValidatedDataset	TokenNameIdentifier	 Cross Validated Dataset
(	TokenNameLPAREN	
learner	TokenNameIdentifier	 learner
,	TokenNameCOMMA	
train	TokenNameIdentifier	 train
,	TokenNameCOMMA	
new	TokenNamenew	
CrossValSplitter	TokenNameIdentifier	 Cross Val Splitter
<	TokenNameLESS	
Example	TokenNameIdentifier	 Example
>	TokenNameGREATER	
(	TokenNameLPAREN	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
new	TokenNamenew	
ViewerFrame	TokenNameIdentifier	 Viewer Frame
(	TokenNameLPAREN	
"CrossValidatedDataset"	TokenNameStringLiteral	CrossValidatedDataset
,	TokenNameCOMMA	
cd	TokenNameIdentifier	 cd
.	TokenNameDOT	
toGUI	TokenNameIdentifier	 to GUI
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
