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
experiments	TokenNameIdentifier	 experiments
.	TokenNameDOT	
*	TokenNameMULTIPLY	
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
*	TokenNameMULTIPLY	
;	TokenNameSEMICOLON	
/** * Multi-class version of a binary classifier. Puts classifiers in order of ones with * the most positive examples first. * * @author Cameron Williams */	TokenNameCOMMENT_JAVADOC	 Multi-class version of a binary classifier. Puts classifiers in order of ones with the most positive examples first. * @author Cameron Williams 
public	TokenNamepublic	
class	TokenNameclass	
CascadingBinaryLearner	TokenNameIdentifier	 Cascading Binary Learner
extends	TokenNameextends	
OneVsAllLearner	TokenNameIdentifier	 One Vs All Learner
{	TokenNameLBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
sortedClassNames	TokenNameIdentifier	 sorted Class Names
;	TokenNameSEMICOLON	
private	TokenNameprivate	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Dataset	TokenNameIdentifier	 Dataset
>	TokenNameGREATER	
data	TokenNameIdentifier	 data
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Evaluation	TokenNameIdentifier	 Evaluation
>	TokenNameGREATER	
eval	TokenNameIdentifier	 eval
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
CascadingBinaryLearner	TokenNameIdentifier	 Cascading Binary Learner
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// /** 	TokenNameCOMMENT_LINE	/** 
// * @deprecated use CascadingBinaryLearner(BatchClassifierLearner learner) 	TokenNameCOMMENT_LINE	* @deprecated use CascadingBinaryLearner(BatchClassifierLearner learner) 
// * @param learnerFactory a ClassifierLearnerFactory which should produce a BinaryClassifier with each call. 	TokenNameCOMMENT_LINE	* @param learnerFactory a ClassifierLearnerFactory which should produce a BinaryClassifier with each call. 
// */ 	TokenNameCOMMENT_LINE	*/ 
// public CascadingBinaryLearner(ClassifierLearnerFactory learnerFactory){ 	TokenNameCOMMENT_LINE	public CascadingBinaryLearner(ClassifierLearnerFactory learnerFactory){ 
// super(learnerFactory); 	TokenNameCOMMENT_LINE	super(learnerFactory); 
// } 	TokenNameCOMMENT_LINE	} 
public	TokenNamepublic	
CascadingBinaryLearner	TokenNameIdentifier	 Cascading Binary Learner
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
l	TokenNameIdentifier	 l
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
l	TokenNameIdentifier	 l
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
CascadingBinaryLearner	TokenNameIdentifier	 Cascading Binary Learner
(	TokenNameLPAREN	
BatchClassifierLearner	TokenNameIdentifier	 Batch Classifier Learner
learner	TokenNameIdentifier	 learner
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
learner	TokenNameIdentifier	 learner
=	TokenNameEQUAL	
learner	TokenNameIdentifier	 learner
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
learnerName	TokenNameIdentifier	 learner Name
=	TokenNameEQUAL	
learner	TokenNameIdentifier	 learner
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
learnerFactory	TokenNameIdentifier	 learner Factory
=	TokenNameEQUAL	
new	TokenNamenew	
ClassifierLearnerFactory	TokenNameIdentifier	 Classifier Learner Factory
(	TokenNameLPAREN	
learnerName	TokenNameIdentifier	 learner Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
setSchema	TokenNameIdentifier	 set Schema
(	TokenNameLPAREN	
ExampleSchema	TokenNameIdentifier	 Example Schema
schema	TokenNameIdentifier	 schema
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
schema	TokenNameIdentifier	 schema
=	TokenNameEQUAL	
schema	TokenNameIdentifier	 schema
;	TokenNameSEMICOLON	
innerLearner	TokenNameIdentifier	 inner Learner
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
ClassifierLearner	TokenNameIdentifier	 Classifier Learner
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
data	TokenNameIdentifier	 data
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
Dataset	TokenNameIdentifier	 Dataset
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//for (int i=0; i<innerLearner.size(); i++) { 	TokenNameCOMMENT_LINE	for (int i=0; i<innerLearner.size(); i++) { 
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
innerLearner	TokenNameIdentifier	 inner Learner
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
learner	TokenNameIdentifier	 learner
.	TokenNameDOT	
copy	TokenNameIdentifier	 copy
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
innerLearner	TokenNameIdentifier	 inner Learner
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
.	TokenNameDOT	
setSchema	TokenNameIdentifier	 set Schema
(	TokenNameLPAREN	
ExampleSchema	TokenNameIdentifier	 Example Schema
.	TokenNameDOT	
BINARY_EXAMPLE_SCHEMA	TokenNameIdentifier	 BINARY  EXAMPLE  SCHEMA
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
BasicDataset	TokenNameIdentifier	 Basic Dataset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
createRankings	TokenNameIdentifier	 create Rankings
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// why 9? 	TokenNameCOMMENT_LINE	why 9? 
Splitter	TokenNameIdentifier	 Splitter
<	TokenNameLESS	
Example	TokenNameIdentifier	 Example
>	TokenNameGREATER	
splitter	TokenNameIdentifier	 splitter
=	TokenNameEQUAL	
new	TokenNamenew	
CrossValSplitter	TokenNameIdentifier	 Cross Val Splitter
<	TokenNameLESS	
Example	TokenNameIdentifier	 Example
>	TokenNameGREATER	
(	TokenNameLPAREN	
9	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
eval	TokenNameIdentifier	 eval
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
Evaluation	TokenNameIdentifier	 Evaluation
>	TokenNameGREATER	
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
innerLearner	TokenNameIdentifier	 inner Learner
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Evaluation	TokenNameIdentifier	 Evaluation
evaluation	TokenNameIdentifier	 evaluation
=	TokenNameEQUAL	
Tester	TokenNameIdentifier	 Tester
.	TokenNameDOT	
evaluate	TokenNameIdentifier	 evaluate
(	TokenNameLPAREN	
innerLearner	TokenNameIdentifier	 inner Learner
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
,	TokenNameCOMMA	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
,	TokenNameCOMMA	
splitter	TokenNameIdentifier	 splitter
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
eval	TokenNameIdentifier	 eval
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
evaluation	TokenNameIdentifier	 evaluation
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
sortLearners	TokenNameIdentifier	 sort Learners
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
BatchClassifierLearner	TokenNameIdentifier	 Batch Classifier Learner
>	TokenNameGREATER	
unsortedLearners	TokenNameIdentifier	 unsorted Learners
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
BatchClassifierLearner	TokenNameIdentifier	 Batch Classifier Learner
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
classNames	TokenNameIdentifier	 class Names
=	TokenNameEQUAL	
schema	TokenNameIdentifier	 schema
.	TokenNameDOT	
validClassNames	TokenNameIdentifier	 valid Class Names
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
unsortedClassNames	TokenNameIdentifier	 unsorted Class Names
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sortedClassNames	TokenNameIdentifier	 sorted Class Names
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
schema	TokenNameIdentifier	 schema
.	TokenNameDOT	
getNumberOfClasses	TokenNameIdentifier	 get Number Of Classes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
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
innerLearner	TokenNameIdentifier	 inner Learner
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
unsortedLearners	TokenNameIdentifier	 unsorted Learners
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
(	TokenNameLPAREN	
BatchClassifierLearner	TokenNameIdentifier	 Batch Classifier Learner
)	TokenNameRPAREN	
innerLearner	TokenNameIdentifier	 inner Learner
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
unsortedClassNames	TokenNameIdentifier	 unsorted Class Names
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
classNames	TokenNameIdentifier	 class Names
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//clear list so that it can be reconstructed in sorted order 	TokenNameCOMMENT_LINE	clear list so that it can be reconstructed in sorted order 
innerLearner	TokenNameIdentifier	 inner Learner
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
position	TokenNameIdentifier	 position
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
!	TokenNameNOT	
unsortedLearners	TokenNameIdentifier	 unsorted Learners
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
double	TokenNamedouble	
maxKappa	TokenNameIdentifier	 max Kappa
=	TokenNameEQUAL	
-	TokenNameMINUS	
10.0	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
learnerIndex	TokenNameIdentifier	 learner Index
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
//find learner with max positive examples 	TokenNameCOMMENT_LINE	find learner with max positive examples 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
unsortedLearners	TokenNameIdentifier	 unsorted Learners
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
//BatchClassifierLearner learner = ((BatchClassifierLearner)unsortedLearners.get(j)); 	TokenNameCOMMENT_LINE	BatchClassifierLearner learner = ((BatchClassifierLearner)unsortedLearners.get(j)); 
Evaluation	TokenNameIdentifier	 Evaluation
evaluation	TokenNameIdentifier	 evaluation
=	TokenNameEQUAL	
eval	TokenNameIdentifier	 eval
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
kappa	TokenNameIdentifier	 kappa
=	TokenNameEQUAL	
evaluation	TokenNameIdentifier	 evaluation
.	TokenNameDOT	
kappa	TokenNameIdentifier	 kappa
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
kappa	TokenNameIdentifier	 kappa
>=	TokenNameGREATER_EQUAL	
maxKappa	TokenNameIdentifier	 max Kappa
)	TokenNameRPAREN	
{	TokenNameLBRACE	
maxKappa	TokenNameIdentifier	 max Kappa
=	TokenNameEQUAL	
kappa	TokenNameIdentifier	 kappa
;	TokenNameSEMICOLON	
learnerIndex	TokenNameIdentifier	 learner Index
=	TokenNameEQUAL	
j	TokenNameIdentifier	 j
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
}	TokenNameRBRACE	
}	TokenNameRBRACE	
//add learner to sortedLearners 	TokenNameCOMMENT_LINE	add learner to sortedLearners 
ClassifierLearner	TokenNameIdentifier	 Classifier Learner
learner	TokenNameIdentifier	 learner
=	TokenNameEQUAL	
unsortedLearners	TokenNameIdentifier	 unsorted Learners
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
learnerIndex	TokenNameIdentifier	 learner Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
innerLearner	TokenNameIdentifier	 inner Learner
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
learner	TokenNameIdentifier	 learner
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
className	TokenNameIdentifier	 class Name
=	TokenNameEQUAL	
unsortedClassNames	TokenNameIdentifier	 unsorted Class Names
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
learnerIndex	TokenNameIdentifier	 learner Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sortedClassNames	TokenNameIdentifier	 sorted Class Names
[	TokenNameLBRACKET	
position	TokenNameIdentifier	 position
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
className	TokenNameIdentifier	 class Name
;	TokenNameSEMICOLON	
position	TokenNameIdentifier	 position
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
addExample	TokenNameIdentifier	 add Example
(	TokenNameLPAREN	
Example	TokenNameIdentifier	 Example
answeredQuery	TokenNameIdentifier	 answered Query
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
classIndex	TokenNameIdentifier	 class Index
=	TokenNameEQUAL	
schema	TokenNameIdentifier	 schema
.	TokenNameDOT	
getClassIndex	TokenNameIdentifier	 get Class Index
(	TokenNameLPAREN	
answeredQuery	TokenNameIdentifier	 answered Query
.	TokenNameDOT	
getLabel	TokenNameIdentifier	 get Label
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
bestClassName	TokenNameIdentifier	 best Class Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
innerLearner	TokenNameIdentifier	 inner Learner
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ClassLabel	TokenNameIdentifier	 Class Label
label	TokenNameIdentifier	 label
=	TokenNameEQUAL	
classIndex	TokenNameIdentifier	 class Index
==	TokenNameEQUAL_EQUAL	
i	TokenNameIdentifier	 i
?	TokenNameQUESTION	
ClassLabel	TokenNameIdentifier	 Class Label
.	TokenNameDOT	
positiveLabel	TokenNameIdentifier	 positive Label
(	TokenNameLPAREN	
1.0	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
:	TokenNameCOLON	
ClassLabel	TokenNameIdentifier	 Class Label
.	TokenNameDOT	
negativeLabel	TokenNameIdentifier	 negative Label
(	TokenNameLPAREN	
-	TokenNameMINUS	
1.0	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Example	TokenNameIdentifier	 Example
example	TokenNameIdentifier	 example
=	TokenNameEQUAL	
new	TokenNamenew	
Example	TokenNameIdentifier	 Example
(	TokenNameLPAREN	
answeredQuery	TokenNameIdentifier	 answered Query
.	TokenNameDOT	
asInstance	TokenNameIdentifier	 as Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
label	TokenNameIdentifier	 label
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
innerLearner	TokenNameIdentifier	 inner Learner
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
.	TokenNameDOT	
addExample	TokenNameIdentifier	 add Example
(	TokenNameLPAREN	
example	TokenNameIdentifier	 example
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
example	TokenNameIdentifier	 example
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
completeTraining	TokenNameIdentifier	 complete Training
(	TokenNameLPAREN	
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
innerLearner	TokenNameIdentifier	 inner Learner
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
innerLearner	TokenNameIdentifier	 inner Learner
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
.	TokenNameDOT	
completeTraining	TokenNameIdentifier	 complete Training
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
createRankings	TokenNameIdentifier	 create Rankings
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sortLearners	TokenNameIdentifier	 sort Learners
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
Classifier	TokenNameIdentifier	 Classifier
getClassifier	TokenNameIdentifier	 get Classifier
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Classifier	TokenNameIdentifier	 Classifier
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
classifiers	TokenNameIdentifier	 classifiers
=	TokenNameEQUAL	
new	TokenNamenew	
Classifier	TokenNameIdentifier	 Classifier
[	TokenNameLBRACKET	
innerLearner	TokenNameIdentifier	 inner Learner
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
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
innerLearner	TokenNameIdentifier	 inner Learner
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
classifiers	TokenNameIdentifier	 classifiers
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
innerLearner	TokenNameIdentifier	 inner Learner
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
.	TokenNameDOT	
getClassifier	TokenNameIdentifier	 get Classifier
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
new	TokenNamenew	
OneVsAllClassifier	TokenNameIdentifier	 One Vs All Classifier
(	TokenNameLPAREN	
sortedClassNames	TokenNameIdentifier	 sorted Class Names
,	TokenNameCOMMA	
classifiers	TokenNameIdentifier	 classifiers
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
