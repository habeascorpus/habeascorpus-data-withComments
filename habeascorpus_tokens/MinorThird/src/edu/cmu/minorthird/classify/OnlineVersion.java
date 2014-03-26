/* Copyright 2003, Carnegie Mellon, All Rights Reserved */	TokenNameCOMMENT_BLOCK	 Copyright 2003, Carnegie Mellon, All Rights Reserved 
package	TokenNamepackage	
edu	TokenNameIdentifier	 edu
.	TokenNameDOT	
cmu	TokenNameIdentifier	 cmu
.	TokenNameDOT	
minorthird	TokenNameIdentifier	 minorthird
.	TokenNameDOT	
classify	TokenNameIdentifier	 classify
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
svm	TokenNameIdentifier	 svm
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
linear	TokenNameIdentifier	 linear
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
*	TokenNameMULTIPLY	
;	TokenNameSEMICOLON	
/** * Online version of a BatchClassifierLearner. * * @author William Cohen */	TokenNameCOMMENT_JAVADOC	 Online version of a BatchClassifierLearner. * @author William Cohen 
public	TokenNamepublic	
class	TokenNameclass	
OnlineVersion	TokenNameIdentifier	 Online Version
extends	TokenNameextends	
OnlineClassifierLearner	TokenNameIdentifier	 Online Classifier Learner
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
Logger	TokenNameIdentifier	 Logger
log	TokenNameIdentifier	 log
=	TokenNameEQUAL	
Logger	TokenNameIdentifier	 Logger
.	TokenNameDOT	
getLogger	TokenNameIdentifier	 get Logger
(	TokenNameLPAREN	
OnlineVersion	TokenNameIdentifier	 Online Version
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
BatchClassifierLearner	TokenNameIdentifier	 Batch Classifier Learner
innerLearner	TokenNameIdentifier	 inner Learner
;	TokenNameSEMICOLON	
private	TokenNameprivate	
OnlineClassifierLearner	TokenNameIdentifier	 Online Classifier Learner
bootstrapLearner	TokenNameIdentifier	 bootstrap Learner
;	TokenNameSEMICOLON	
private	TokenNameprivate	
double	TokenNamedouble	
loadFactor	TokenNameIdentifier	 load Factor
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
minBatchTrainingSize	TokenNameIdentifier	 min Batch Training Size
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Classifier	TokenNameIdentifier	 Classifier
storedClassifier	TokenNameIdentifier	 stored Classifier
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
lastTrainingSetSize	TokenNameIdentifier	 last Training Set Size
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Dataset	TokenNameIdentifier	 Dataset
dataset	TokenNameIdentifier	 dataset
;	TokenNameSEMICOLON	
/** * Emulate on-line learning with a batch algorithm. * * @param innerLearner batch learning algorithm * @param loadFactor re-train batch algorithm when number of available * examples is loadFactor * M, where M is the number of examples * available at the last training round. * @param bootstrapLearner on-line learner used for the first few rounds * @param minBatchTrainingSize use online bootstrapLearner until minBatchTrainingSize examples are available. */	TokenNameCOMMENT_JAVADOC	 Emulate on-line learning with a batch algorithm. * @param innerLearner batch learning algorithm @param loadFactor re-train batch algorithm when number of available examples is loadFactor M, where M is the number of examples available at the last training round. @param bootstrapLearner on-line learner used for the first few rounds @param minBatchTrainingSize use online bootstrapLearner until minBatchTrainingSize examples are available. 
public	TokenNamepublic	
OnlineVersion	TokenNameIdentifier	 Online Version
(	TokenNameLPAREN	
BatchClassifierLearner	TokenNameIdentifier	 Batch Classifier Learner
innerLearner	TokenNameIdentifier	 inner Learner
,	TokenNameCOMMA	
double	TokenNamedouble	
loadFactor	TokenNameIdentifier	 load Factor
,	TokenNameCOMMA	
OnlineClassifierLearner	TokenNameIdentifier	 Online Classifier Learner
bootstrapLearner	TokenNameIdentifier	 bootstrap Learner
,	TokenNameCOMMA	
int	TokenNameint	
minBatchTrainingSize	TokenNameIdentifier	 min Batch Training Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
innerLearner	TokenNameIdentifier	 inner Learner
=	TokenNameEQUAL	
innerLearner	TokenNameIdentifier	 inner Learner
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
loadFactor	TokenNameIdentifier	 load Factor
=	TokenNameEQUAL	
loadFactor	TokenNameIdentifier	 load Factor
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
bootstrapLearner	TokenNameIdentifier	 bootstrap Learner
=	TokenNameEQUAL	
bootstrapLearner	TokenNameIdentifier	 bootstrap Learner
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
minBatchTrainingSize	TokenNameIdentifier	 min Batch Training Size
=	TokenNameEQUAL	
minBatchTrainingSize	TokenNameIdentifier	 min Batch Training Size
;	TokenNameSEMICOLON	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
OnlineVersion	TokenNameIdentifier	 Online Version
(	TokenNameLPAREN	
BatchClassifierLearner	TokenNameIdentifier	 Batch Classifier Learner
innerLearner	TokenNameIdentifier	 inner Learner
,	TokenNameCOMMA	
double	TokenNamedouble	
loadFactor	TokenNameIdentifier	 load Factor
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
innerLearner	TokenNameIdentifier	 inner Learner
,	TokenNameCOMMA	
loadFactor	TokenNameIdentifier	 load Factor
,	TokenNameCOMMA	
new	TokenNamenew	
VotedPerceptron	TokenNameIdentifier	 Voted Perceptron
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
10	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
OnlineVersion	TokenNameIdentifier	 Online Version
(	TokenNameLPAREN	
BatchClassifierLearner	TokenNameIdentifier	 Batch Classifier Learner
innerLearner	TokenNameIdentifier	 inner Learner
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
innerLearner	TokenNameIdentifier	 inner Learner
,	TokenNameCOMMA	
1.5	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
OnlineVersion	TokenNameIdentifier	 Online Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
new	TokenNamenew	
SVMLearner	TokenNameIdentifier	 SVM Learner
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
BatchClassifierLearner	TokenNameIdentifier	 Batch Classifier Learner
getInnerLearner	TokenNameIdentifier	 get Inner Learner
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
innerLearner	TokenNameIdentifier	 inner Learner
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setInnerLearner	TokenNameIdentifier	 set Inner Learner
(	TokenNameLPAREN	
BatchClassifierLearner	TokenNameIdentifier	 Batch Classifier Learner
learner	TokenNameIdentifier	 learner
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
innerLearner	TokenNameIdentifier	 inner Learner
=	TokenNameEQUAL	
learner	TokenNameIdentifier	 learner
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
OnlineClassifierLearner	TokenNameIdentifier	 Online Classifier Learner
getBootstrapLearner	TokenNameIdentifier	 get Bootstrap Learner
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
bootstrapLearner	TokenNameIdentifier	 bootstrap Learner
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setBootstrapLearner	TokenNameIdentifier	 set Bootstrap Learner
(	TokenNameLPAREN	
OnlineClassifierLearner	TokenNameIdentifier	 Online Classifier Learner
learner	TokenNameIdentifier	 learner
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
bootstrapLearner	TokenNameIdentifier	 bootstrap Learner
=	TokenNameEQUAL	
learner	TokenNameIdentifier	 learner
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
double	TokenNamedouble	
getBatchLoadFactor	TokenNameIdentifier	 get Batch Load Factor
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
loadFactor	TokenNameIdentifier	 load Factor
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setBatchLoadFactor	TokenNameIdentifier	 set Batch Load Factor
(	TokenNameLPAREN	
double	TokenNamedouble	
d	TokenNameIdentifier	 d
)	TokenNameRPAREN	
{	TokenNameLBRACE	
loadFactor	TokenNameIdentifier	 load Factor
=	TokenNameEQUAL	
d	TokenNameIdentifier	 d
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getMinBatchTrainingSize	TokenNameIdentifier	 get Min Batch Training Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
minBatchTrainingSize	TokenNameIdentifier	 min Batch Training Size
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setMinBatchTrainingSize	TokenNameIdentifier	 set Min Batch Training Size
(	TokenNameLPAREN	
int	TokenNameint	
m	TokenNameIdentifier	 m
)	TokenNameRPAREN	
{	TokenNameLBRACE	
minBatchTrainingSize	TokenNameIdentifier	 min Batch Training Size
=	TokenNameEQUAL	
m	TokenNameIdentifier	 m
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
final	TokenNamefinal	
public	TokenNamepublic	
void	TokenNamevoid	
setSchema	TokenNameIdentifier	 set Schema
(	TokenNameLPAREN	
ExampleSchema	TokenNameIdentifier	 Example Schema
schema	TokenNameIdentifier	 schema
)	TokenNameRPAREN	
{	TokenNameLBRACE	
innerLearner	TokenNameIdentifier	 inner Learner
.	TokenNameDOT	
setSchema	TokenNameIdentifier	 set Schema
(	TokenNameLPAREN	
schema	TokenNameIdentifier	 schema
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bootstrapLearner	TokenNameIdentifier	 bootstrap Learner
.	TokenNameDOT	
setSchema	TokenNameIdentifier	 set Schema
(	TokenNameLPAREN	
schema	TokenNameIdentifier	 schema
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
final	TokenNamefinal	
public	TokenNamepublic	
ExampleSchema	TokenNameIdentifier	 Example Schema
getSchema	TokenNameIdentifier	 get Schema
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
innerLearner	TokenNameIdentifier	 inner Learner
.	TokenNameDOT	
getSchema	TokenNameIdentifier	 get Schema
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
final	TokenNamefinal	
public	TokenNamepublic	
void	TokenNamevoid	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
storedClassifier	TokenNameIdentifier	 stored Classifier
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
lastTrainingSetSize	TokenNameIdentifier	 last Training Set Size
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
dataset	TokenNameIdentifier	 dataset
=	TokenNameEQUAL	
new	TokenNamenew	
BasicDataset	TokenNameIdentifier	 Basic Dataset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
innerLearner	TokenNameIdentifier	 inner Learner
.	TokenNameDOT	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bootstrapLearner	TokenNameIdentifier	 bootstrap Learner
.	TokenNameDOT	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
final	TokenNamefinal	
public	TokenNamepublic	
void	TokenNamevoid	
addExample	TokenNameIdentifier	 add Example
(	TokenNameLPAREN	
Example	TokenNameIdentifier	 Example
example	TokenNameIdentifier	 example
)	TokenNameRPAREN	
{	TokenNameLBRACE	
dataset	TokenNameIdentifier	 dataset
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
example	TokenNameIdentifier	 example
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
dataset	TokenNameIdentifier	 dataset
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
<	TokenNameLESS	
minBatchTrainingSize	TokenNameIdentifier	 min Batch Training Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
bootstrapLearner	TokenNameIdentifier	 bootstrap Learner
.	TokenNameDOT	
addExample	TokenNameIdentifier	 add Example
(	TokenNameLPAREN	
example	TokenNameIdentifier	 example
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
final	TokenNamefinal	
public	TokenNamepublic	
void	TokenNamevoid	
completeTraining	TokenNameIdentifier	 complete Training
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
new	TokenNamenew	
ViewerFrame	TokenNameIdentifier	 Viewer Frame
(	TokenNameLPAREN	
"compete data"	TokenNameStringLiteral	compete data
,	TokenNameCOMMA	
dataset	TokenNameIdentifier	 dataset
.	TokenNameDOT	
toGUI	TokenNameIdentifier	 to GUI
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
dataset	TokenNameIdentifier	 dataset
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
lastTrainingSetSize	TokenNameIdentifier	 last Training Set Size
||	TokenNameOR_OR	
storedClassifier	TokenNameIdentifier	 stored Classifier
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
log	TokenNameIdentifier	 log
.	TokenNameDOT	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
"final training for "	TokenNameStringLiteral	final training for 
+	TokenNamePLUS	
innerLearner	TokenNameIdentifier	 inner Learner
+	TokenNamePLUS	
" on "	TokenNameStringLiteral	 on 
+	TokenNamePLUS	
dataset	TokenNameIdentifier	 dataset
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" examples"	TokenNameStringLiteral	 examples
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
storedClassifier	TokenNameIdentifier	 stored Classifier
=	TokenNameEQUAL	
innerLearner	TokenNameIdentifier	 inner Learner
.	TokenNameDOT	
batchTrain	TokenNameIdentifier	 batch Train
(	TokenNameLPAREN	
dataset	TokenNameIdentifier	 dataset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
new	TokenNamenew	
ViewerFrame	TokenNameIdentifier	 Viewer Frame
(	TokenNameLPAREN	
"classifier"	TokenNameStringLiteral	classifier
,	TokenNameCOMMA	
new	TokenNamenew	
SmartVanillaViewer	TokenNameIdentifier	 Smart Vanilla Viewer
(	TokenNameLPAREN	
storedClassifier	TokenNameIdentifier	 stored Classifier
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lastTrainingSetSize	TokenNameIdentifier	 last Training Set Size
=	TokenNameEQUAL	
dataset	TokenNameIdentifier	 dataset
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
final	TokenNamefinal	
public	TokenNamepublic	
Classifier	TokenNameIdentifier	 Classifier
getClassifier	TokenNameIdentifier	 get Classifier
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
dataset	TokenNameIdentifier	 dataset
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
<	TokenNameLESS	
minBatchTrainingSize	TokenNameIdentifier	 min Batch Training Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
bootstrapLearner	TokenNameIdentifier	 bootstrap Learner
.	TokenNameDOT	
getClassifier	TokenNameIdentifier	 get Classifier
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
dataset	TokenNameIdentifier	 dataset
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
lastTrainingSetSize	TokenNameIdentifier	 last Training Set Size
*	TokenNameMULTIPLY	
loadFactor	TokenNameIdentifier	 load Factor
||	TokenNameOR_OR	
storedClassifier	TokenNameIdentifier	 stored Classifier
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
log	TokenNameIdentifier	 log
.	TokenNameDOT	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
"re-training "	TokenNameStringLiteral	re-training 
+	TokenNamePLUS	
innerLearner	TokenNameIdentifier	 inner Learner
+	TokenNamePLUS	
" on "	TokenNameStringLiteral	 on 
+	TokenNamePLUS	
dataset	TokenNameIdentifier	 dataset
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" examples"	TokenNameStringLiteral	 examples
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
storedClassifier	TokenNameIdentifier	 stored Classifier
=	TokenNameEQUAL	
innerLearner	TokenNameIdentifier	 inner Learner
.	TokenNameDOT	
batchTrain	TokenNameIdentifier	 batch Train
(	TokenNameLPAREN	
dataset	TokenNameIdentifier	 dataset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
log	TokenNameIdentifier	 log
.	TokenNameDOT	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
"batch classifier is "	TokenNameStringLiteral	batch classifier is 
+	TokenNamePLUS	
storedClassifier	TokenNameIdentifier	 stored Classifier
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lastTrainingSetSize	TokenNameIdentifier	 last Training Set Size
=	TokenNameEQUAL	
dataset	TokenNameIdentifier	 dataset
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
storedClassifier	TokenNameIdentifier	 stored Classifier
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
storedClassifier	TokenNameIdentifier	 stored Classifier
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
