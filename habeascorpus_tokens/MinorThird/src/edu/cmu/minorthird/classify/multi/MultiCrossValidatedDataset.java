package	TokenNamepackage	
edu	TokenNameIdentifier	 edu
.	TokenNameDOT	
cmu	TokenNameIdentifier	 cmu
.	TokenNameDOT	
minorthird	TokenNameIdentifier	 minorthird
.	TokenNameDOT	
classify	TokenNameIdentifier	 classify
.	TokenNameDOT	
multi	TokenNameIdentifier	 multi
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
Splitter	TokenNameIdentifier	 Splitter
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
CrossValidatedDataset	TokenNameIdentifier	 Cross Validated Dataset
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
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
AbstractInstanceTransform	TokenNameIdentifier	 Abstract Instance Transform
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
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
PredictedClassTransform	TokenNameIdentifier	 Predicted Class Transform
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
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
TransformingMultiClassifier	TokenNameIdentifier	 Transforming Multi Classifier
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
ParallelViewer	TokenNameIdentifier	 Parallel Viewer
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
TransformedViewer	TokenNameIdentifier	 Transformed Viewer
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
Visible	TokenNameIdentifier	 Visible
;	TokenNameSEMICOLON	
/** * View result of some sort of train/test experiment for Data with Multiple Labels. * * @author Cameron Williams */	TokenNameCOMMENT_JAVADOC	 View result of some sort of train/test experiment for Data with Multiple Labels. * @author Cameron Williams 
public	TokenNamepublic	
class	TokenNameclass	
MultiCrossValidatedDataset	TokenNameIdentifier	 Multi Cross Validated Dataset
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
MultiClassifiedDataset	TokenNameIdentifier	 Multi Classified Dataset
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
cds	TokenNameIdentifier	 cds
;	TokenNameSEMICOLON	
private	TokenNameprivate	
MultiClassifiedDataset	TokenNameIdentifier	 Multi Classified Dataset
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
trainCds	TokenNameIdentifier	 train Cds
;	TokenNameSEMICOLON	
private	TokenNameprivate	
MultiEvaluation	TokenNameIdentifier	 Multi Evaluation
v	TokenNameIdentifier	 v
;	TokenNameSEMICOLON	
public	TokenNamepublic	
MultiCrossValidatedDataset	TokenNameIdentifier	 Multi Cross Validated Dataset
(	TokenNameLPAREN	
ClassifierLearner	TokenNameIdentifier	 Classifier Learner
learner	TokenNameIdentifier	 learner
,	TokenNameCOMMA	
MultiDataset	TokenNameIdentifier	 Multi Dataset
d	TokenNameIdentifier	 d
,	TokenNameCOMMA	
Splitter	TokenNameIdentifier	 Splitter
<	TokenNameLESS	
MultiExample	TokenNameIdentifier	 Multi Example
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
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
MultiCrossValidatedDataset	TokenNameIdentifier	 Multi Cross Validated Dataset
(	TokenNameLPAREN	
ClassifierLearner	TokenNameIdentifier	 Classifier Learner
learner	TokenNameIdentifier	 learner
,	TokenNameCOMMA	
MultiDataset	TokenNameIdentifier	 Multi Dataset
d	TokenNameIdentifier	 d
,	TokenNameCOMMA	
Splitter	TokenNameIdentifier	 Splitter
<	TokenNameLESS	
MultiExample	TokenNameIdentifier	 Multi Example
>	TokenNameGREATER	
splitter	TokenNameIdentifier	 splitter
,	TokenNameCOMMA	
boolean	TokenNameboolean	
saveTrainPartitions	TokenNameIdentifier	 save Train Partitions
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
saveTrainPartitions	TokenNameIdentifier	 save Train Partitions
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
MultiCrossValidatedDataset	TokenNameIdentifier	 Multi Cross Validated Dataset
(	TokenNameLPAREN	
ClassifierLearner	TokenNameIdentifier	 Classifier Learner
learner	TokenNameIdentifier	 learner
,	TokenNameCOMMA	
MultiDataset	TokenNameIdentifier	 Multi Dataset
d	TokenNameIdentifier	 d
,	TokenNameCOMMA	
Splitter	TokenNameIdentifier	 Splitter
<	TokenNameLESS	
MultiExample	TokenNameIdentifier	 Multi Example
>	TokenNameGREATER	
splitter	TokenNameIdentifier	 splitter
,	TokenNameCOMMA	
boolean	TokenNameboolean	
saveTrainPartitions	TokenNameIdentifier	 save Train Partitions
,	TokenNameCOMMA	
boolean	TokenNameboolean	
cross	TokenNameIdentifier	 cross
)	TokenNameRPAREN	
{	TokenNameLBRACE	
MultiDataset	TokenNameIdentifier	 Multi Dataset
.	TokenNameDOT	
MultiSplit	TokenNameIdentifier	 Multi Split
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
d	TokenNameIdentifier	 d
.	TokenNameDOT	
MultiSplit	TokenNameIdentifier	 Multi Split
(	TokenNameLPAREN	
splitter	TokenNameIdentifier	 splitter
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cds	TokenNameIdentifier	 cds
=	TokenNameEQUAL	
new	TokenNamenew	
MultiClassifiedDataset	TokenNameIdentifier	 Multi Classified Dataset
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
MultiClassifiedDataset	TokenNameIdentifier	 Multi Classified Dataset
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
MultiEvaluation	TokenNameIdentifier	 Multi Evaluation
(	TokenNameLPAREN	
d	TokenNameIdentifier	 d
.	TokenNameDOT	
getMultiSchema	TokenNameIdentifier	 get Multi Schema
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
MultiDataset	TokenNameIdentifier	 Multi Dataset
trainData	TokenNameIdentifier	 train Data
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
getTrain	TokenNameIdentifier	 get Train
(	TokenNameLPAREN	
k	TokenNameIdentifier	 k
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
cross	TokenNameIdentifier	 cross
)	TokenNameRPAREN	
trainData	TokenNameIdentifier	 train Data
=	TokenNameEQUAL	
trainData	TokenNameIdentifier	 train Data
.	TokenNameDOT	
annotateData	TokenNameIdentifier	 annotate Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
MultiDataset	TokenNameIdentifier	 Multi Dataset
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
"splitting with "	TokenNameStringLiteral	splitting with 
+	TokenNamePLUS	
splitter	TokenNameIdentifier	 splitter
+	TokenNamePLUS	
", preparing to train on "	TokenNameStringLiteral	, preparing to train on 
+	TokenNamePLUS	
trainData	TokenNameIdentifier	 train Data
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" and test on "	TokenNameStringLiteral	 and test on 
+	TokenNamePLUS	
testData	TokenNameIdentifier	 test Data
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
MultiClassifier	TokenNameIdentifier	 Multi Classifier
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
new	TokenNamenew	
MultiDatasetClassifierTeacher	TokenNameIdentifier	 Multi Dataset Classifier Teacher
(	TokenNameLPAREN	
trainData	TokenNameIdentifier	 train Data
)	TokenNameRPAREN	
.	TokenNameDOT	
train	TokenNameIdentifier	 train
(	TokenNameLPAREN	
learner	TokenNameIdentifier	 learner
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//if(cross) testData=testData.annotateData(c); 	TokenNameCOMMENT_LINE	if(cross) testData=testData.annotateData(c); 
if	TokenNameif	
(	TokenNameLPAREN	
cross	TokenNameIdentifier	 cross
)	TokenNameRPAREN	
{	TokenNameLBRACE	
AbstractInstanceTransform	TokenNameIdentifier	 Abstract Instance Transform
transformer	TokenNameIdentifier	 transformer
=	TokenNameEQUAL	
new	TokenNamenew	
PredictedClassTransform	TokenNameIdentifier	 Predicted Class Transform
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
new	TokenNamenew	
TransformingMultiClassifier	TokenNameIdentifier	 Transforming Multi Classifier
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
,	TokenNameCOMMA	
transformer	TokenNameIdentifier	 transformer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
MultiDatasetIndex	TokenNameIdentifier	 Multi Dataset Index
testIndex	TokenNameIdentifier	 test Index
=	TokenNameEQUAL	
new	TokenNamenew	
MultiDatasetIndex	TokenNameIdentifier	 Multi Dataset Index
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
MultiClassifiedDataset	TokenNameIdentifier	 Multi Classified Dataset
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
MultiClassifiedDataset	TokenNameIdentifier	 Multi Classified Dataset
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
c	TokenNameIdentifier	 c
,	TokenNameCOMMA	
testData	TokenNameIdentifier	 test Data
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//v.setProperty("classesInFold"+(k+1), "train: "+classDistributionString(trainData.getSchema(),new MultiDatasetIndex(trainData)) 	TokenNameCOMMENT_LINE	v.setProperty("classesInFold"+(k+1), "train: "+classDistributionString(trainData.getSchema(),new MultiDatasetIndex(trainData)) 
// +" test: "+classDistributionString(testData.getSchema(),testIndex)); 	TokenNameCOMMENT_LINE	+" test: "+classDistributionString(testData.getSchema(),testIndex)); 
log	TokenNameIdentifier	 log
.	TokenNameDOT	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
"splitting with "	TokenNameStringLiteral	splitting with 
+	TokenNamePLUS	
splitter	TokenNameIdentifier	 splitter
+	TokenNamePLUS	
", stored classified dataset"	TokenNameStringLiteral	, stored classified dataset
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
// private String classDistributionString(MultiExampleSchema multiSchema, 	TokenNameCOMMENT_LINE	private String classDistributionString(MultiExampleSchema multiSchema, 
// MultiDatasetIndex index){ 	TokenNameCOMMENT_LINE	MultiDatasetIndex index){ 
// StringBuffer buf=new StringBuffer(""); 	TokenNameCOMMENT_LINE	StringBuffer buf=new StringBuffer(""); 
// java.text.DecimalFormat fmt=new java.text.DecimalFormat("#####"); 	TokenNameCOMMENT_LINE	java.text.DecimalFormat fmt=new java.text.DecimalFormat("#####"); 
// ExampleSchema[] schemas=multiSchema.getSchemas(); 	TokenNameCOMMENT_LINE	ExampleSchema[] schemas=multiSchema.getSchemas(); 
// for(int x=0;x<schemas.length;x++){ 	TokenNameCOMMENT_LINE	for(int x=0;x<schemas.length;x++){ 
// ExampleSchema schema=schemas[x]; 	TokenNameCOMMENT_LINE	ExampleSchema schema=schemas[x]; 
// for(int i=0;i<schema.getNumberOfClasses();i++){ 	TokenNameCOMMENT_LINE	for(int i=0;i<schema.getNumberOfClasses();i++){ 
// if(buf.length()>0) 	TokenNameCOMMENT_LINE	if(buf.length()>0) 
// buf.append("; "); 	TokenNameCOMMENT_LINE	buf.append("; "); 
// String label=schema.getClassName(i); 	TokenNameCOMMENT_LINE	String label=schema.getClassName(i); 
// buf.append(fmt.format(index.size(label))+" "+label); 	TokenNameCOMMENT_LINE	buf.append(fmt.format(index.size(label))+" "+label); 
// } 	TokenNameCOMMENT_LINE	} 
// } 	TokenNameCOMMENT_LINE	} 
// return buf.toString(); 	TokenNameCOMMENT_LINE	return buf.toString(); 
// } 	TokenNameCOMMENT_LINE	} 
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
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
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
// MultiCrossValidatedDataset cvd=(MultiCrossValidatedDataset)o; 	TokenNameCOMMENT_LINE	MultiCrossValidatedDataset cvd=(MultiCrossValidatedDataset)o; 
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
// MultiCrossValidatedDataset cvd=(MultiCrossValidatedDataset)o; 	TokenNameCOMMENT_LINE	MultiCrossValidatedDataset cvd=(MultiCrossValidatedDataset)o; 
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
MultiCrossValidatedDataset	TokenNameIdentifier	 Multi Cross Validated Dataset
cvd	TokenNameIdentifier	 cvd
=	TokenNameEQUAL	
(	TokenNameLPAREN	
MultiCrossValidatedDataset	TokenNameIdentifier	 Multi Cross Validated Dataset
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
MultiEvaluation	TokenNameIdentifier	 Multi Evaluation
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
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"CrossValidatedDataset"	TokenNameStringLiteral	CrossValidatedDataset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
