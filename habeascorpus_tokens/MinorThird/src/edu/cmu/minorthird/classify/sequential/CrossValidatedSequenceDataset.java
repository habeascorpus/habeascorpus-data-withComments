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
Evaluation	TokenNameIdentifier	 Evaluation
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
/** * View result of some sort of train/test experiment * on sequential data. * * @author William Cohen */	TokenNameCOMMENT_JAVADOC	 View result of some sort of train/test experiment on sequential data. * @author William Cohen 
public	TokenNamepublic	
class	TokenNameclass	
CrossValidatedSequenceDataset	TokenNameIdentifier	 Cross Validated Sequence Dataset
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
CrossValidatedSequenceDataset	TokenNameIdentifier	 Cross Validated Sequence Dataset
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
ClassifiedSequenceDataset	TokenNameIdentifier	 Classified Sequence Dataset
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
cds	TokenNameIdentifier	 cds
;	TokenNameSEMICOLON	
private	TokenNameprivate	
ClassifiedSequenceDataset	TokenNameIdentifier	 Classified Sequence Dataset
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
trainCds	TokenNameIdentifier	 train Cds
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Evaluation	TokenNameIdentifier	 Evaluation
v	TokenNameIdentifier	 v
;	TokenNameSEMICOLON	
public	TokenNamepublic	
CrossValidatedSequenceDataset	TokenNameIdentifier	 Cross Validated Sequence Dataset
(	TokenNameLPAREN	
SequenceClassifierLearner	TokenNameIdentifier	 Sequence Classifier Learner
learner	TokenNameIdentifier	 learner
,	TokenNameCOMMA	
SequenceDataset	TokenNameIdentifier	 Sequence Dataset
d	TokenNameIdentifier	 d
,	TokenNameCOMMA	
Splitter	TokenNameIdentifier	 Splitter
<	TokenNameLESS	
Example	TokenNameIdentifier	 Example
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
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
CrossValidatedSequenceDataset	TokenNameIdentifier	 Cross Validated Sequence Dataset
(	TokenNameLPAREN	
SequenceClassifierLearner	TokenNameIdentifier	 Sequence Classifier Learner
learner	TokenNameIdentifier	 learner
,	TokenNameCOMMA	
SequenceDataset	TokenNameIdentifier	 Sequence Dataset
d	TokenNameIdentifier	 d
,	TokenNameCOMMA	
Splitter	TokenNameIdentifier	 Splitter
<	TokenNameLESS	
Example	TokenNameIdentifier	 Example
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
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
splitSequence	TokenNameIdentifier	 split Sequence
(	TokenNameLPAREN	
splitter	TokenNameIdentifier	 splitter
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cds	TokenNameIdentifier	 cds
=	TokenNameEQUAL	
new	TokenNamenew	
ClassifiedSequenceDataset	TokenNameIdentifier	 Classified Sequence Dataset
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
ClassifiedSequenceDataset	TokenNameIdentifier	 Classified Sequence Dataset
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
SequenceDataset	TokenNameIdentifier	 Sequence Dataset
trainData	TokenNameIdentifier	 train Data
=	TokenNameEQUAL	
(	TokenNameLPAREN	
SequenceDataset	TokenNameIdentifier	 Sequence Dataset
)	TokenNameRPAREN	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
getTrain	TokenNameIdentifier	 get Train
(	TokenNameLPAREN	
k	TokenNameIdentifier	 k
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
SequenceDataset	TokenNameIdentifier	 Sequence Dataset
testData	TokenNameIdentifier	 test Data
=	TokenNameEQUAL	
(	TokenNameLPAREN	
SequenceDataset	TokenNameIdentifier	 Sequence Dataset
)	TokenNameRPAREN	
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
//showSubpops("subpops for test fold "+k+": ", testData); 	TokenNameCOMMENT_LINE	showSubpops("subpops for test fold "+k+": ", testData); 
SequenceClassifier	TokenNameIdentifier	 Sequence Classifier
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
new	TokenNamenew	
DatasetSequenceClassifierTeacher	TokenNameIdentifier	 Dataset Sequence Classifier Teacher
(	TokenNameLPAREN	
trainData	TokenNameIdentifier	 train Data
)	TokenNameRPAREN	
.	TokenNameDOT	
train	TokenNameIdentifier	 train
(	TokenNameLPAREN	
learner	TokenNameIdentifier	 learner
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cds	TokenNameIdentifier	 cds
[	TokenNameLBRACKET	
k	TokenNameIdentifier	 k
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
ClassifiedSequenceDataset	TokenNameIdentifier	 Classified Sequence Dataset
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
,	TokenNameCOMMA	
testData	TokenNameIdentifier	 test Data
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
ClassifiedSequenceDataset	TokenNameIdentifier	 Classified Sequence Dataset
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
,	TokenNameCOMMA	
trainData	TokenNameIdentifier	 train Data
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
Evaluation	TokenNameIdentifier	 Evaluation
.	TokenNameDOT	
DEFAULT_PARTITION_ID	TokenNameIdentifier	 DEFAULT  PARTITION  ID
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
// private void showSubpops(String msg,SequenceDataset d) 	TokenNameCOMMENT_LINE	private void showSubpops(String msg,SequenceDataset d) 
// { 	TokenNameCOMMENT_LINE	{ 
// Set ids = new TreeSet(); 	TokenNameCOMMENT_LINE	Set ids = new TreeSet(); 
// for (Iterator<Example> i=d.iterator(); i.hasNext(); ) { 	TokenNameCOMMENT_LINE	for (Iterator<Example> i=d.iterator(); i.hasNext(); ) { 
// Example e = i.next(); 	TokenNameCOMMENT_LINE	Example e = i.next(); 
// ids.add(e.getSubpopulationId()); 	TokenNameCOMMENT_LINE	ids.add(e.getSubpopulationId()); 
// } 	TokenNameCOMMENT_LINE	} 
// log.debug(msg+ids.toString()); 	TokenNameCOMMENT_LINE	log.debug(msg+ids.toString()); 
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
20080207L	TokenNameLongLiteral	
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
// CrossValidatedSequenceDataset cvd = (CrossValidatedSequenceDataset)o; 	TokenNameCOMMENT_LINE	CrossValidatedSequenceDataset cvd = (CrossValidatedSequenceDataset)o; 
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
20080207L	TokenNameLongLiteral	
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
// CrossValidatedSequenceDataset cvd = (CrossValidatedSequenceDataset)o; 	TokenNameCOMMENT_LINE	CrossValidatedSequenceDataset cvd = (CrossValidatedSequenceDataset)o; 
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
20080207L	TokenNameLongLiteral	
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
CrossValidatedSequenceDataset	TokenNameIdentifier	 Cross Validated Sequence Dataset
cvd	TokenNameIdentifier	 cvd
=	TokenNameEQUAL	
(	TokenNameLPAREN	
CrossValidatedSequenceDataset	TokenNameIdentifier	 Cross Validated Sequence Dataset
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
}	TokenNameRBRACE	
}	TokenNameRBRACE	
