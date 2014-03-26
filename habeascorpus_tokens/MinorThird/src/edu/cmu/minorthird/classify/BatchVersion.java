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
algorithms	TokenNameIdentifier	 algorithms
.	TokenNameDOT	
linear	TokenNameIdentifier	 linear
.	TokenNameDOT	
VotedPerceptron	TokenNameIdentifier	 Voted Perceptron
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
/** * Batch version of an OnlineClassifierLearner. * * @author William Cohen */	TokenNameCOMMENT_JAVADOC	 Batch version of an OnlineClassifierLearner. * @author William Cohen 
public	TokenNamepublic	
class	TokenNameclass	
BatchVersion	TokenNameIdentifier	 Batch Version
extends	TokenNameextends	
BatchClassifierLearner	TokenNameIdentifier	 Batch Classifier Learner
{	TokenNameLBRACE	
private	TokenNameprivate	
OnlineClassifierLearner	TokenNameIdentifier	 Online Classifier Learner
innerLearner	TokenNameIdentifier	 inner Learner
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
numberOfEpochs	TokenNameIdentifier	 number Of Epochs
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
//private List<Example> exampleList = new ArrayList<Example>(); 	TokenNameCOMMENT_LINE	private List<Example> exampleList = new ArrayList<Example>(); 
public	TokenNamepublic	
BatchVersion	TokenNameIdentifier	 Batch Version
(	TokenNameLPAREN	
OnlineClassifierLearner	TokenNameIdentifier	 Online Classifier Learner
innerLearner	TokenNameIdentifier	 inner Learner
,	TokenNameCOMMA	
int	TokenNameint	
numberOfEpochs	TokenNameIdentifier	 number Of Epochs
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
numberOfEpochs	TokenNameIdentifier	 number Of Epochs
=	TokenNameEQUAL	
numberOfEpochs	TokenNameIdentifier	 number Of Epochs
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
BatchVersion	TokenNameIdentifier	 Batch Version
(	TokenNameLPAREN	
OnlineClassifierLearner	TokenNameIdentifier	 Online Classifier Learner
innerLearner	TokenNameIdentifier	 inner Learner
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
innerLearner	TokenNameIdentifier	 inner Learner
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
BatchVersion	TokenNameIdentifier	 Batch Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
new	TokenNamenew	
VotedPerceptron	TokenNameIdentifier	 Voted Perceptron
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
5	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getNumberOfEpochs	TokenNameIdentifier	 get Number Of Epochs
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
numberOfEpochs	TokenNameIdentifier	 number Of Epochs
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setNumberOfEpochs	TokenNameIdentifier	 set Number Of Epochs
(	TokenNameLPAREN	
int	TokenNameint	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
{	TokenNameLBRACE	
numberOfEpochs	TokenNameIdentifier	 number Of Epochs
=	TokenNameEQUAL	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
OnlineClassifierLearner	TokenNameIdentifier	 Online Classifier Learner
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
OnlineClassifierLearner	TokenNameIdentifier	 Online Classifier Learner
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
public	TokenNamepublic	
Classifier	TokenNameIdentifier	 Classifier
batchTrain	TokenNameIdentifier	 batch Train
(	TokenNameLPAREN	
Dataset	TokenNameIdentifier	 Dataset
dataset	TokenNameIdentifier	 dataset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Dataset	TokenNameIdentifier	 Dataset
copy	TokenNameIdentifier	 copy
=	TokenNameEQUAL	
dataset	TokenNameIdentifier	 dataset
.	TokenNameDOT	
shallowCopy	TokenNameIdentifier	 shallow Copy
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
copy	TokenNameIdentifier	 copy
.	TokenNameDOT	
shuffle	TokenNameIdentifier	 shuffle
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
innerLearner	TokenNameIdentifier	 inner Learner
.	TokenNameDOT	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ProgressCounter	TokenNameIdentifier	 Progress Counter
pc1	TokenNameIdentifier	 pc1
=	TokenNameEQUAL	
new	TokenNamenew	
ProgressCounter	TokenNameIdentifier	 Progress Counter
(	TokenNameLPAREN	
"training "	TokenNameStringLiteral	training 
+	TokenNamePLUS	
innerLearner	TokenNameIdentifier	 inner Learner
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"epoch"	TokenNameStringLiteral	epoch
,	TokenNameCOMMA	
numberOfEpochs	TokenNameIdentifier	 number Of Epochs
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
numberOfEpochs	TokenNameIdentifier	 number Of Epochs
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ProgressCounter	TokenNameIdentifier	 Progress Counter
pc2	TokenNameIdentifier	 pc2
=	TokenNameEQUAL	
new	TokenNamenew	
ProgressCounter	TokenNameIdentifier	 Progress Counter
(	TokenNameLPAREN	
"training "	TokenNameStringLiteral	training 
+	TokenNamePLUS	
innerLearner	TokenNameIdentifier	 inner Learner
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"example"	TokenNameStringLiteral	example
,	TokenNameCOMMA	
copy	TokenNameIdentifier	 copy
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Example	TokenNameIdentifier	 Example
>	TokenNameGREATER	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
copy	TokenNameIdentifier	 copy
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
innerLearner	TokenNameIdentifier	 inner Learner
.	TokenNameDOT	
addExample	TokenNameIdentifier	 add Example
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pc2	TokenNameIdentifier	 pc2
.	TokenNameDOT	
progress	TokenNameIdentifier	 progress
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
pc2	TokenNameIdentifier	 pc2
.	TokenNameDOT	
finished	TokenNameIdentifier	 finished
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pc1	TokenNameIdentifier	 pc1
.	TokenNameDOT	
progress	TokenNameIdentifier	 progress
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
pc1	TokenNameIdentifier	 pc1
.	TokenNameDOT	
finished	TokenNameIdentifier	 finished
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
innerLearner	TokenNameIdentifier	 inner Learner
.	TokenNameDOT	
completeTraining	TokenNameIdentifier	 complete Training
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
classifier	TokenNameIdentifier	 classifier
=	TokenNameEQUAL	
innerLearner	TokenNameIdentifier	 inner Learner
.	TokenNameDOT	
getClassifier	TokenNameIdentifier	 get Classifier
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
classifier	TokenNameIdentifier	 classifier
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
