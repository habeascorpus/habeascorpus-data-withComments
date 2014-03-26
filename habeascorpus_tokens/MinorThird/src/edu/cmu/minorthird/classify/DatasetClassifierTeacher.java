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
io	TokenNameIdentifier	 io
.	TokenNameDOT	
File	TokenNameIdentifier	 File
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
Serializable	TokenNameIdentifier	 Serializable
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Collections	TokenNameIdentifier	 Collections
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
experiments	TokenNameIdentifier	 experiments
.	TokenNameDOT	
Expt	TokenNameIdentifier	 Expt
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
gui	TokenNameIdentifier	 gui
.	TokenNameDOT	
ViewerFrame	TokenNameIdentifier	 Viewer Frame
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
/** * Trains a ClassifierLearner using the information in a labeled Dataset. * * @author William Cohen * */	TokenNameCOMMENT_JAVADOC	 Trains a ClassifierLearner using the information in a labeled Dataset. * @author William Cohen 
public	TokenNamepublic	
class	TokenNameclass	
DatasetClassifierTeacher	TokenNameIdentifier	 Dataset Classifier Teacher
extends	TokenNameextends	
ClassifierTeacher	TokenNameIdentifier	 Classifier Teacher
{	TokenNameLBRACE	
private	TokenNameprivate	
Dataset	TokenNameIdentifier	 Dataset
dataset	TokenNameIdentifier	 dataset
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
activeLearning	TokenNameIdentifier	 active Learning
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
DatasetClassifierTeacher	TokenNameIdentifier	 Dataset Classifier Teacher
(	TokenNameLPAREN	
Dataset	TokenNameIdentifier	 Dataset
dataset	TokenNameIdentifier	 dataset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
dataset	TokenNameIdentifier	 dataset
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @param activeLearning if true, all learning is active - ie nothing is * pushed at the learner, everything must be 'pulled' via queries. * if false, all examples fron the dataset are 'pushed' at the learner * via addExample. */	TokenNameCOMMENT_JAVADOC	 @param activeLearning if true, all learning is active - ie nothing is pushed at the learner, everything must be 'pulled' via queries. if false, all examples fron the dataset are 'pushed' at the learner via addExample. 
public	TokenNamepublic	
DatasetClassifierTeacher	TokenNameIdentifier	 Dataset Classifier Teacher
(	TokenNameLPAREN	
Dataset	TokenNameIdentifier	 Dataset
dataset	TokenNameIdentifier	 dataset
,	TokenNameCOMMA	
boolean	TokenNameboolean	
activeLearning	TokenNameIdentifier	 active Learning
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
dataset	TokenNameIdentifier	 dataset
=	TokenNameEQUAL	
dataset	TokenNameIdentifier	 dataset
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
activeLearning	TokenNameIdentifier	 active Learning
=	TokenNameEQUAL	
activeLearning	TokenNameIdentifier	 active Learning
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
ExampleSchema	TokenNameIdentifier	 Example Schema
schema	TokenNameIdentifier	 schema
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
dataset	TokenNameIdentifier	 dataset
.	TokenNameDOT	
getSchema	TokenNameIdentifier	 get Schema
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Example	TokenNameIdentifier	 Example
>	TokenNameGREATER	
examplePool	TokenNameIdentifier	 example Pool
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
activeLearning	TokenNameIdentifier	 active Learning
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
<	TokenNameLESS	
Example	TokenNameIdentifier	 Example
>	TokenNameGREATER	
emptySet	TokenNameIdentifier	 empty Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
dataset	TokenNameIdentifier	 dataset
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Instance	TokenNameIdentifier	 Instance
>	TokenNameGREATER	
instancePool	TokenNameIdentifier	 instance Pool
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
activeLearning	TokenNameIdentifier	 active Learning
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
Util	TokenNameIdentifier	 Util
.	TokenNameDOT	
toInstanceIterator	TokenNameIdentifier	 to Instance Iterator
(	TokenNameLPAREN	
dataset	TokenNameIdentifier	 dataset
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
dataset	TokenNameIdentifier	 dataset
instanceof	TokenNameinstanceof	
BasicDataset	TokenNameIdentifier	 Basic Dataset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// (Edoardo Airoldi) this itearator is empty whenever there are no 	TokenNameCOMMENT_LINE	(Edoardo Airoldi) this itearator is empty whenever there are no 
// unlabeled examples available for semi-supervised learning. 	TokenNameCOMMENT_LINE	unlabeled examples available for semi-supervised learning. 
return	TokenNamereturn	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
BasicDataset	TokenNameIdentifier	 Basic Dataset
)	TokenNameRPAREN	
dataset	TokenNameIdentifier	 dataset
)	TokenNameRPAREN	
.	TokenNameDOT	
iteratorOverUnlabeled	TokenNameIdentifier	 iterator Over Unlabeled
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
<	TokenNameLESS	
Instance	TokenNameIdentifier	 Instance
>	TokenNameGREATER	
emptySet	TokenNameIdentifier	 empty Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
Example	TokenNameIdentifier	 Example
labelInstance	TokenNameIdentifier	 label Instance
(	TokenNameLPAREN	
Instance	TokenNameIdentifier	 Instance
query	TokenNameIdentifier	 query
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// the label was hidden by just hiding the type 	TokenNameCOMMENT_LINE	the label was hidden by just hiding the type 
if	TokenNameif	
(	TokenNameLPAREN	
query	TokenNameIdentifier	 query
instanceof	TokenNameinstanceof	
Example	TokenNameIdentifier	 Example
)	TokenNameRPAREN	
return	TokenNamereturn	
(	TokenNameLPAREN	
Example	TokenNameIdentifier	 Example
)	TokenNameRPAREN	
query	TokenNameIdentifier	 query
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
boolean	TokenNameboolean	
hasAnswers	TokenNameIdentifier	 has Answers
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
activeLearning	TokenNameIdentifier	 active Learning
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
static	TokenNamestatic	
public	TokenNamepublic	
void	TokenNamevoid	
main	TokenNameIdentifier	 main
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
argv	TokenNameIdentifier	 argv
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
Dataset	TokenNameIdentifier	 Dataset
dataset	TokenNameIdentifier	 dataset
=	TokenNameEQUAL	
Expt	TokenNameIdentifier	 Expt
.	TokenNameDOT	
toDataset	TokenNameIdentifier	 to Dataset
(	TokenNameLPAREN	
argv	TokenNameIdentifier	 argv
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ClassifierLearner	TokenNameIdentifier	 Classifier Learner
learner	TokenNameIdentifier	 learner
=	TokenNameEQUAL	
Expt	TokenNameIdentifier	 Expt
.	TokenNameDOT	
toLearner	TokenNameIdentifier	 to Learner
(	TokenNameLPAREN	
argv	TokenNameIdentifier	 argv
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Classifier	TokenNameIdentifier	 Classifier
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
new	TokenNamenew	
DatasetClassifierTeacher	TokenNameIdentifier	 Dataset Classifier Teacher
(	TokenNameLPAREN	
dataset	TokenNameIdentifier	 dataset
)	TokenNameRPAREN	
.	TokenNameDOT	
train	TokenNameIdentifier	 train
(	TokenNameLPAREN	
learner	TokenNameIdentifier	 learner
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
instanceof	TokenNameinstanceof	
Visible	TokenNameIdentifier	 Visible
)	TokenNameRPAREN	
{	TokenNameLBRACE	
new	TokenNamenew	
ViewerFrame	TokenNameIdentifier	 Viewer Frame
(	TokenNameLPAREN	
"from "	TokenNameStringLiteral	from 
+	TokenNamePLUS	
argv	TokenNameIdentifier	 argv
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+	TokenNamePLUS	
" and "	TokenNameStringLiteral	 and 
+	TokenNamePLUS	
argv	TokenNameIdentifier	 argv
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Visible	TokenNameIdentifier	 Visible
)	TokenNameRPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
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
"Learnt classifier: "	TokenNameStringLiteral	Learnt classifier: 
+	TokenNamePLUS	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Training error: "	TokenNameStringLiteral	Training error: 
+	TokenNamePLUS	
Tester	TokenNameIdentifier	 Tester
.	TokenNameDOT	
errorRate	TokenNameIdentifier	 error Rate
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
,	TokenNameCOMMA	
dataset	TokenNameIdentifier	 dataset
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
instanceof	TokenNameinstanceof	
BinaryClassifier	TokenNameIdentifier	 Binary Classifier
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Average log loss: "	TokenNameStringLiteral	Average log loss: 
+	TokenNamePLUS	
Tester	TokenNameIdentifier	 Tester
.	TokenNameDOT	
logLoss	TokenNameIdentifier	 log Loss
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
BinaryClassifier	TokenNameIdentifier	 Binary Classifier
)	TokenNameRPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
,	TokenNameCOMMA	
dataset	TokenNameIdentifier	 dataset
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
argv	TokenNameIdentifier	 argv
.	TokenNameDOT	
length	TokenNameIdentifier	 length
>=	TokenNameGREATER_EQUAL	
3	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
instanceof	TokenNameinstanceof	
Serializable	TokenNameIdentifier	 Serializable
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
IOUtil	TokenNameIdentifier	 IO Util
.	TokenNameDOT	
saveSerialized	TokenNameIdentifier	 save Serialized
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Serializable	TokenNameIdentifier	 Serializable
)	TokenNameRPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
argv	TokenNameIdentifier	 argv
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
printStackTrace	TokenNameIdentifier	 print Stack Trace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"usage: dataset learner [classifierFile]"	TokenNameStringLiteral	usage: dataset learner [classifierFile]
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
