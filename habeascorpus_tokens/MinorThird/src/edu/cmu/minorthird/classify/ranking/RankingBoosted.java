/* Copyright 2006, Carnegie Mellon, All Rights Reserved */	TokenNameCOMMENT_BLOCK	 Copyright 2006, Carnegie Mellon, All Rights Reserved 
package	TokenNamepackage	
edu	TokenNameIdentifier	 edu
.	TokenNameDOT	
cmu	TokenNameIdentifier	 cmu
.	TokenNameDOT	
minorthird	TokenNameIdentifier	 minorthird
.	TokenNameDOT	
classify	TokenNameIdentifier	 classify
.	TokenNameDOT	
ranking	TokenNameIdentifier	 ranking
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
HashMap	TokenNameIdentifier	 Hash Map
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
HashSet	TokenNameIdentifier	 Hash Set
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Iterator	TokenNameIdentifier	 Iterator
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
LinkedList	TokenNameIdentifier	 Linked List
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
List	TokenNameIdentifier	 List
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Map	TokenNameIdentifier	 Map
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Set	TokenNameIdentifier	 Set
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
Classifier	TokenNameIdentifier	 Classifier
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
Feature	TokenNameIdentifier	 Feature
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
Hyperplane	TokenNameIdentifier	 Hyperplane
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
ViewerFrame	TokenNameIdentifier	 Viewer Frame
;	TokenNameSEMICOLON	
/** * A boosted version for ranking. * An implementation of - "Michael Collins and Terry Koo, Discriminative Reranking for Natural Language Parsing. * Computational Linguistics, March 2005", see page 45. * * Requirements of this class: * - Considers only binary features * - Requires a particular cont. feature named "walkerScore", that contains the original log-probability for an example * * To do: * - Handle multiple positive answers. * - Automatically discretize real-value features into binary. * - It is possible to incorporate example 'importance' weights, according to some 'goodness' evaluation measure. See Collins'. * * @author Einat Minkov */	TokenNameCOMMENT_JAVADOC	 A boosted version for ranking. An implementation of - "Michael Collins and Terry Koo, Discriminative Reranking for Natural Language Parsing. Computational Linguistics, March 2005", see page 45. * Requirements of this class: - Considers only binary features - Requires a particular cont. feature named "walkerScore", that contains the original log-probability for an example * To do: - Handle multiple positive answers. - Automatically discretize real-value features into binary. - It is possible to incorporate example 'importance' weights, according to some 'goodness' evaluation measure. See Collins'. * @author Einat Minkov 
public	TokenNamepublic	
class	TokenNameclass	
RankingBoosted	TokenNameIdentifier	 Ranking Boosted
extends	TokenNameextends	
BatchRankingLearner	TokenNameIdentifier	 Batch Ranking Learner
{	TokenNameLBRACE	
private	TokenNameprivate	
int	TokenNameint	
numEpochs	TokenNameIdentifier	 num Epochs
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
exampleSize	TokenNameIdentifier	 example Size
=	TokenNameEQUAL	
20	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// All examples are trimmed to have the same ranked list size. 	TokenNameCOMMENT_LINE	All examples are trimmed to have the same ranked list size. 
private	TokenNameprivate	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
Feature	TokenNameIdentifier	 Feature
,	TokenNameCOMMA	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
Index	TokenNameIdentifier	 Index
>>	TokenNameRIGHT_SHIFT	
A_pos	TokenNameIdentifier	 A pos
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
<	TokenNameLESS	
Feature	TokenNameIdentifier	 Feature
,	TokenNameCOMMA	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
Index	TokenNameIdentifier	 Index
>>	TokenNameRIGHT_SHIFT	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
Feature	TokenNameIdentifier	 Feature
,	TokenNameCOMMA	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
Index	TokenNameIdentifier	 Index
>>	TokenNameRIGHT_SHIFT	
A_neg	TokenNameIdentifier	 A neg
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
<	TokenNameLESS	
Feature	TokenNameIdentifier	 Feature
,	TokenNameCOMMA	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
Index	TokenNameIdentifier	 Index
>>	TokenNameRIGHT_SHIFT	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
Feature	TokenNameIdentifier	 Feature
>	TokenNameGREATER	
features	TokenNameIdentifier	 features
=	TokenNameEQUAL	
new	TokenNamenew	
HashSet	TokenNameIdentifier	 Hash Set
<	TokenNameLESS	
Feature	TokenNameIdentifier	 Feature
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
double	TokenNamedouble	
SMOOTH_PARAM	TokenNameIdentifier	 SMOOTH  PARAM
=	TokenNameEQUAL	
0.005	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
margins	TokenNameIdentifier	 margins
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Feature	TokenNameIdentifier	 Feature
score	TokenNameIdentifier	 score
=	TokenNameEQUAL	
new	TokenNamenew	
Feature	TokenNameIdentifier	 Feature
(	TokenNameLPAREN	
"walkerScore"	TokenNameStringLiteral	walkerScore
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// note: the initial score/prob. is turned into log(score). 	TokenNameCOMMENT_LINE	note: the initial score/prob. is turned into log(score). 
public	TokenNamepublic	
RankingBoosted	TokenNameIdentifier	 Ranking Boosted
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
500	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
20	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
RankingBoosted	TokenNameIdentifier	 Ranking Boosted
(	TokenNameLPAREN	
int	TokenNameint	
numEpochs	TokenNameIdentifier	 num Epochs
,	TokenNameCOMMA	
int	TokenNameint	
exampleSize	TokenNameIdentifier	 example Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
numEpochs	TokenNameIdentifier	 num Epochs
=	TokenNameEQUAL	
numEpochs	TokenNameIdentifier	 num Epochs
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
exampleSize	TokenNameIdentifier	 example Size
=	TokenNameEQUAL	
exampleSize	TokenNameIdentifier	 example Size
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
Classifier	TokenNameIdentifier	 Classifier
batchTrain	TokenNameIdentifier	 batch Train
(	TokenNameLPAREN	
Dataset	TokenNameIdentifier	 Dataset
data	TokenNameIdentifier	 data
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// int numUpdates = 0; 	TokenNameCOMMENT_LINE	int numUpdates = 0; 
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Example	TokenNameIdentifier	 Example
>>	TokenNameRIGHT_SHIFT	
rankingMap	TokenNameIdentifier	 ranking Map
=	TokenNameEQUAL	
splitIntoRankings	TokenNameIdentifier	 split Into Rankings
(	TokenNameLPAREN	
data	TokenNameIdentifier	 data
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//Put all ranked lists in a double array, to allow non-sequential access 	TokenNameCOMMENT_LINE	Put all ranked lists in a double array, to allow non-sequential access 
Example	TokenNameIdentifier	 Example
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
rankedExamples	TokenNameIdentifier	 ranked Examples
=	TokenNameEQUAL	
new	TokenNamenew	
Example	TokenNameIdentifier	 Example
[	TokenNameLBRACKET	
rankingMap	TokenNameIdentifier	 ranking Map
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
exampleSize	TokenNameIdentifier	 example Size
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
rankingMap	TokenNameIdentifier	 ranking Map
.	TokenNameDOT	
keySet	TokenNameIdentifier	 key Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
String	TokenNameIdentifier	 String
subpop	TokenNameIdentifier	 subpop
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Example	TokenNameIdentifier	 Example
>	TokenNameGREATER	
ranking	TokenNameIdentifier	 ranking
=	TokenNameEQUAL	
orderExamplesList	TokenNameIdentifier	 order Examples List
(	TokenNameLPAREN	
rankingMap	TokenNameIdentifier	 ranking Map
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
subpop	TokenNameIdentifier	 subpop
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
exampleSize	TokenNameIdentifier	 example Size
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
rankedExamples	TokenNameIdentifier	 ranked Examples
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
ranking	TokenNameIdentifier	 ranking
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
index	TokenNameIdentifier	 index
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Hyperplane	TokenNameIdentifier	 Hyperplane
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
populate_A	TokenNameIdentifier	 populate  A
(	TokenNameLPAREN	
rankedExamples	TokenNameIdentifier	 ranked Examples
,	TokenNameCOMMA	
new	TokenNamenew	
Hyperplane	TokenNameIdentifier	 Hyperplane
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
increment	TokenNameIdentifier	 increment
(	TokenNameLPAREN	
score	TokenNameIdentifier	 score
,	TokenNameCOMMA	
best_w0	TokenNameIdentifier	 best w0
(	TokenNameLPAREN	
rankedExamples	TokenNameIdentifier	 ranked Examples
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
margins	TokenNameIdentifier	 margins
=	TokenNameEQUAL	
initializeMargins	TokenNameIdentifier	 initialize Margins
(	TokenNameLPAREN	
rankedExamples	TokenNameIdentifier	 ranked Examples
,	TokenNameCOMMA	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ProgressCounter	TokenNameIdentifier	 Progress Counter
pc	TokenNameIdentifier	 pc
=	TokenNameEQUAL	
new	TokenNamenew	
ProgressCounter	TokenNameIdentifier	 Progress Counter
(	TokenNameLPAREN	
"boosted perceptron training"	TokenNameStringLiteral	boosted perceptron training
,	TokenNameCOMMA	
"epoch"	TokenNameStringLiteral	epoch
,	TokenNameCOMMA	
numEpochs	TokenNameIdentifier	 num Epochs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
e	TokenNameIdentifier	 e
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
e	TokenNameIdentifier	 e
<	TokenNameLESS	
numEpochs	TokenNameIdentifier	 num Epochs
;	TokenNameSEMICOLON	
e	TokenNameIdentifier	 e
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//System.out.println("epoch "+e+"/"+numEpochs); 	TokenNameCOMMENT_LINE	System.out.println("epoch "+e+"/"+numEpochs); 
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
batchTrain	TokenNameIdentifier	 batch Train
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
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
new	TokenNamenew	
ViewerFrame	TokenNameIdentifier	 Viewer Frame
(	TokenNameLPAREN	
"hyperplane"	TokenNameStringLiteral	hyperplane
,	TokenNameCOMMA	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
toGUI	TokenNameIdentifier	 to GUI
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
s	TokenNameIdentifier	 s
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Map example indexes into A_Pos, A_Neg sets per feature, where 	TokenNameCOMMENT_LINE	Map example indexes into A_Pos, A_Neg sets per feature, where 
// A_Neg: Feature that is included in example i, but no in the correct answer example. 	TokenNameCOMMENT_LINE	A_Neg: Feature that is included in example i, but no in the correct answer example. 
// A_Pos: oppositve same. 	TokenNameCOMMENT_LINE	A_Pos: oppositve same. 
private	TokenNameprivate	
Hyperplane	TokenNameIdentifier	 Hyperplane
populate_A	TokenNameIdentifier	 populate  A
(	TokenNameLPAREN	
Example	TokenNameIdentifier	 Example
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
rankedExamples	TokenNameIdentifier	 ranked Examples
,	TokenNameCOMMA	
Hyperplane	TokenNameIdentifier	 Hyperplane
s	TokenNameIdentifier	 s
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
rankedExamples	TokenNameIdentifier	 ranked Examples
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Example	TokenNameIdentifier	 Example
correctEx	TokenNameIdentifier	 correct Ex
=	TokenNameEQUAL	
rankedExamples	TokenNameIdentifier	 ranked Examples
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
Feature	TokenNameIdentifier	 Feature
>	TokenNameGREATER	
correctFtrs	TokenNameIdentifier	 correct Ftrs
=	TokenNameEQUAL	
new	TokenNamenew	
HashSet	TokenNameIdentifier	 Hash Set
<	TokenNameLESS	
Feature	TokenNameIdentifier	 Feature
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Feature	TokenNameIdentifier	 Feature
>	TokenNameGREATER	
it	TokenNameIdentifier	 it
=	TokenNameEQUAL	
correctEx	TokenNameIdentifier	 correct Ex
.	TokenNameDOT	
binaryFeatureIterator	TokenNameIdentifier	 binary Feature Iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
it	TokenNameIdentifier	 it
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
correctFtrs	TokenNameIdentifier	 correct Ftrs
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
it	TokenNameIdentifier	 it
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
exampleSize	TokenNameIdentifier	 example Size
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Example	TokenNameIdentifier	 Example
ex	TokenNameIdentifier	 ex
=	TokenNameEQUAL	
rankedExamples	TokenNameIdentifier	 ranked Examples
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
Feature	TokenNameIdentifier	 Feature
>	TokenNameGREATER	
actualFtrs	TokenNameIdentifier	 actual Ftrs
=	TokenNameEQUAL	
new	TokenNamenew	
HashSet	TokenNameIdentifier	 Hash Set
<	TokenNameLESS	
Feature	TokenNameIdentifier	 Feature
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Feature	TokenNameIdentifier	 Feature
>	TokenNameGREATER	
it	TokenNameIdentifier	 it
=	TokenNameEQUAL	
ex	TokenNameIdentifier	 ex
.	TokenNameDOT	
binaryFeatureIterator	TokenNameIdentifier	 binary Feature Iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
it	TokenNameIdentifier	 it
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Feature	TokenNameIdentifier	 Feature
ftr	TokenNameIdentifier	 ftr
=	TokenNameEQUAL	
it	TokenNameIdentifier	 it
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
correctFtrs	TokenNameIdentifier	 correct Ftrs
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
ftr	TokenNameIdentifier	 ftr
)	TokenNameRPAREN	
)	TokenNameRPAREN	
update_A	TokenNameIdentifier	 update  A
(	TokenNameLPAREN	
A_neg	TokenNameIdentifier	 A neg
,	TokenNameCOMMA	
ftr	TokenNameIdentifier	 ftr
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
actualFtrs	TokenNameIdentifier	 actual Ftrs
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
ftr	TokenNameIdentifier	 ftr
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
features	TokenNameIdentifier	 features
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
ftr	TokenNameIdentifier	 ftr
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Feature	TokenNameIdentifier	 Feature
>	TokenNameGREATER	
it	TokenNameIdentifier	 it
=	TokenNameEQUAL	
correctEx	TokenNameIdentifier	 correct Ex
.	TokenNameDOT	
binaryFeatureIterator	TokenNameIdentifier	 binary Feature Iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
it	TokenNameIdentifier	 it
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Feature	TokenNameIdentifier	 Feature
ftr	TokenNameIdentifier	 ftr
=	TokenNameEQUAL	
it	TokenNameIdentifier	 it
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
actualFtrs	TokenNameIdentifier	 actual Ftrs
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
ftr	TokenNameIdentifier	 ftr
)	TokenNameRPAREN	
)	TokenNameRPAREN	
update_A	TokenNameIdentifier	 update  A
(	TokenNameLPAREN	
A_pos	TokenNameIdentifier	 A pos
,	TokenNameCOMMA	
ftr	TokenNameIdentifier	 ftr
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
features	TokenNameIdentifier	 features
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
ftr	TokenNameIdentifier	 ftr
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
multiply	TokenNameIdentifier	 multiply
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
s	TokenNameIdentifier	 s
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
Feature	TokenNameIdentifier	 Feature
,	TokenNameCOMMA	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
Index	TokenNameIdentifier	 Index
>>	TokenNameRIGHT_SHIFT	
update_A	TokenNameIdentifier	 update  A
(	TokenNameLPAREN	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
Feature	TokenNameIdentifier	 Feature
,	TokenNameCOMMA	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
Index	TokenNameIdentifier	 Index
>>	TokenNameRIGHT_SHIFT	
map	TokenNameIdentifier	 map
,	TokenNameCOMMA	
Feature	TokenNameIdentifier	 Feature
ftr	TokenNameIdentifier	 ftr
,	TokenNameCOMMA	
int	TokenNameint	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
int	TokenNameint	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
Index	TokenNameIdentifier	 Index
>	TokenNameGREATER	
set	TokenNameIdentifier	 set
=	TokenNameEQUAL	
new	TokenNamenew	
HashSet	TokenNameIdentifier	 Hash Set
<	TokenNameLESS	
Index	TokenNameIdentifier	 Index
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
containsKey	TokenNameIdentifier	 contains Key
(	TokenNameLPAREN	
ftr	TokenNameIdentifier	 ftr
)	TokenNameRPAREN	
)	TokenNameRPAREN	
set	TokenNameIdentifier	 set
=	TokenNameEQUAL	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
ftr	TokenNameIdentifier	 ftr
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
set	TokenNameIdentifier	 set
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
Index	TokenNameIdentifier	 Index
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
ftr	TokenNameIdentifier	 ftr
,	TokenNameCOMMA	
set	TokenNameIdentifier	 set
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
map	TokenNameIdentifier	 map
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//Choose weight that minimizes the exp-loss of initial assigned probabilities, using brute-force search 	TokenNameCOMMENT_LINE	Choose weight that minimizes the exp-loss of initial assigned probabilities, using brute-force search 
// (this weight - named here as w0 - is not modified later.) 	TokenNameCOMMENT_LINE	(this weight - named here as w0 - is not modified later.) 
private	TokenNameprivate	
double	TokenNamedouble	
best_w0	TokenNameIdentifier	 best w0
(	TokenNameLPAREN	
Example	TokenNameIdentifier	 Example
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
rankedExamples	TokenNameIdentifier	 ranked Examples
)	TokenNameRPAREN	
{	TokenNameLBRACE	
double	TokenNamedouble	
w0	TokenNameIdentifier	 w0
=	TokenNameEQUAL	
0.001	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
minExpLoss	TokenNameIdentifier	 min Exp Loss
=	TokenNameEQUAL	
100000000	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
double	TokenNamedouble	
w	TokenNameIdentifier	 w
=	TokenNameEQUAL	
0.001	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
w	TokenNameIdentifier	 w
<	TokenNameLESS	
10	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
w	TokenNameIdentifier	 w
=	TokenNameEQUAL	
w	TokenNameIdentifier	 w
+	TokenNamePLUS	
0.001	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
double	TokenNamedouble	
expLoss	TokenNameIdentifier	 exp Loss
=	TokenNameEQUAL	
initialExpLoss	TokenNameIdentifier	 initial Exp Loss
(	TokenNameLPAREN	
w	TokenNameIdentifier	 w
,	TokenNameCOMMA	
rankedExamples	TokenNameIdentifier	 ranked Examples
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
expLoss	TokenNameIdentifier	 exp Loss
<	TokenNameLESS	
minExpLoss	TokenNameIdentifier	 min Exp Loss
)	TokenNameRPAREN	
{	TokenNameLBRACE	
w0	TokenNameIdentifier	 w0
=	TokenNameEQUAL	
w	TokenNameIdentifier	 w
;	TokenNameSEMICOLON	
minExpLoss	TokenNameIdentifier	 min Exp Loss
=	TokenNameEQUAL	
expLoss	TokenNameIdentifier	 exp Loss
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
w0	TokenNameIdentifier	 w0
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
double	TokenNamedouble	
initialExpLoss	TokenNameIdentifier	 initial Exp Loss
(	TokenNameLPAREN	
double	TokenNamedouble	
w0	TokenNameIdentifier	 w0
,	TokenNameCOMMA	
Example	TokenNameIdentifier	 Example
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
rankedExamples	TokenNameIdentifier	 ranked Examples
)	TokenNameRPAREN	
{	TokenNameLBRACE	
double	TokenNamedouble	
expLoss	TokenNameIdentifier	 exp Loss
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
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
rankedExamples	TokenNameIdentifier	 ranked Examples
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
exampleSize	TokenNameIdentifier	 example Size
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
rankedExamples	TokenNameIdentifier	 ranked Examples
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
.	TokenNameDOT	
getLabel	TokenNameIdentifier	 get Label
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
endsWith	TokenNameIdentifier	 ends With
(	TokenNameLPAREN	
"NEG 1.0]"	TokenNameStringLiteral	NEG 1.0]
)	TokenNameRPAREN	
)	TokenNameRPAREN	
expLoss	TokenNameIdentifier	 exp Loss
+=	TokenNamePLUS_EQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
exp	TokenNameIdentifier	 exp
(	TokenNameLPAREN	
-	TokenNameMINUS	
w0	TokenNameIdentifier	 w0
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
rankedExamples	TokenNameIdentifier	 ranked Examples
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
getWeight	TokenNameIdentifier	 get Weight
(	TokenNameLPAREN	
score	TokenNameIdentifier	 score
)	TokenNameRPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
rankedExamples	TokenNameIdentifier	 ranked Examples
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
.	TokenNameDOT	
getWeight	TokenNameIdentifier	 get Weight
(	TokenNameLPAREN	
score	TokenNameIdentifier	 score
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
expLoss	TokenNameIdentifier	 exp Loss
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
double	TokenNamedouble	
expLoss	TokenNameIdentifier	 exp Loss
(	TokenNameLPAREN	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
margins	TokenNameIdentifier	 margins
)	TokenNameRPAREN	
{	TokenNameLBRACE	
double	TokenNamedouble	
expLoss	TokenNameIdentifier	 exp Loss
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
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
margins	TokenNameIdentifier	 margins
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
exampleSize	TokenNameIdentifier	 example Size
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
expLoss	TokenNameIdentifier	 exp Loss
+=	TokenNamePLUS_EQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
exp	TokenNameIdentifier	 exp
(	TokenNameLPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
margins	TokenNameIdentifier	 margins
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
expLoss	TokenNameIdentifier	 exp Loss
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
initializeMargins	TokenNameIdentifier	 initialize Margins
(	TokenNameLPAREN	
Example	TokenNameIdentifier	 Example
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
rankedExamples	TokenNameIdentifier	 ranked Examples
,	TokenNameCOMMA	
Hyperplane	TokenNameIdentifier	 Hyperplane
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
{	TokenNameLBRACE	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
margins	TokenNameIdentifier	 margins
=	TokenNameEQUAL	
new	TokenNamenew	
double	TokenNamedouble	
[	TokenNameLBRACKET	
rankedExamples	TokenNameIdentifier	 ranked Examples
.	TokenNameDOT	
length	TokenNameIdentifier	 length
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
exampleSize	TokenNameIdentifier	 example Size
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
margins	TokenNameIdentifier	 margins
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
exampleSize	TokenNameIdentifier	 example Size
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
margins	TokenNameIdentifier	 margins
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
featureScore	TokenNameIdentifier	 feature Score
(	TokenNameLPAREN	
score	TokenNameIdentifier	 score
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
rankedExamples	TokenNameIdentifier	 ranked Examples
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
getWeight	TokenNameIdentifier	 get Weight
(	TokenNameLPAREN	
score	TokenNameIdentifier	 score
)	TokenNameRPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
rankedExamples	TokenNameIdentifier	 ranked Examples
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
.	TokenNameDOT	
getWeight	TokenNameIdentifier	 get Weight
(	TokenNameLPAREN	
score	TokenNameIdentifier	 score
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//*((rankedExamples[i][0].getWeight(score)) - (rankedExamples[i][j].getWeight(score))); 	TokenNameCOMMENT_LINE	*((rankedExamples[i][0].getWeight(score)) - (rankedExamples[i][j].getWeight(score))); 
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"margins: "	TokenNameStringLiteral	margins: 
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
j	TokenNameIdentifier	 j
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
margins	TokenNameIdentifier	 margins
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
margins	TokenNameIdentifier	 margins
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// return the number of times h has been updated 	TokenNameCOMMENT_LINE	return the number of times h has been updated 
private	TokenNameprivate	
Hyperplane	TokenNameIdentifier	 Hyperplane
batchTrain	TokenNameIdentifier	 batch Train
(	TokenNameLPAREN	
Hyperplane	TokenNameIdentifier	 Hyperplane
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// int updates = 0; 	TokenNameCOMMENT_LINE	int updates = 0; 
Feature	TokenNameIdentifier	 Feature
bestFeature	TokenNameIdentifier	 best Feature
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
maxGain	TokenNameIdentifier	 max Gain
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
W_Pos	TokenNameIdentifier	 W  Pos
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
W_Neg	TokenNameIdentifier	 W  Neg
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Feature	TokenNameIdentifier	 Feature
>	TokenNameGREATER	
it	TokenNameIdentifier	 it
=	TokenNameEQUAL	
features	TokenNameIdentifier	 features
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
it	TokenNameIdentifier	 it
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Feature	TokenNameIdentifier	 Feature
ftr	TokenNameIdentifier	 ftr
=	TokenNameEQUAL	
it	TokenNameIdentifier	 it
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
cur_W_Pos	TokenNameIdentifier	 cur  W  Pos
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
cur_W_Neg	TokenNameIdentifier	 cur  W  Neg
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
A_pos	TokenNameIdentifier	 A pos
.	TokenNameDOT	
containsKey	TokenNameIdentifier	 contains Key
(	TokenNameLPAREN	
ftr	TokenNameIdentifier	 ftr
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Index	TokenNameIdentifier	 Index
>	TokenNameGREATER	
itIndex	TokenNameIdentifier	 it Index
=	TokenNameEQUAL	
A_pos	TokenNameIdentifier	 A pos
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
ftr	TokenNameIdentifier	 ftr
)	TokenNameRPAREN	
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
itIndex	TokenNameIdentifier	 it Index
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Index	TokenNameIdentifier	 Index
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
itIndex	TokenNameIdentifier	 it Index
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cur_W_Pos	TokenNameIdentifier	 cur  W  Pos
+=	TokenNamePLUS_EQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
exp	TokenNameIdentifier	 exp
(	TokenNameLPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
margins	TokenNameIdentifier	 margins
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
.	TokenNameDOT	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
.	TokenNameDOT	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
A_neg	TokenNameIdentifier	 A neg
.	TokenNameDOT	
containsKey	TokenNameIdentifier	 contains Key
(	TokenNameLPAREN	
ftr	TokenNameIdentifier	 ftr
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Index	TokenNameIdentifier	 Index
>	TokenNameGREATER	
itIndex	TokenNameIdentifier	 it Index
=	TokenNameEQUAL	
A_neg	TokenNameIdentifier	 A neg
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
ftr	TokenNameIdentifier	 ftr
)	TokenNameRPAREN	
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
itIndex	TokenNameIdentifier	 it Index
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Index	TokenNameIdentifier	 Index
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
itIndex	TokenNameIdentifier	 it Index
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cur_W_Neg	TokenNameIdentifier	 cur  W  Neg
+=	TokenNamePLUS_EQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
exp	TokenNameIdentifier	 exp
(	TokenNameLPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
margins	TokenNameIdentifier	 margins
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
.	TokenNameDOT	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
.	TokenNameDOT	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
double	TokenNamedouble	
gain	TokenNameIdentifier	 gain
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
abs	TokenNameIdentifier	 abs
(	TokenNameLPAREN	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
sqrt	TokenNameIdentifier	 sqrt
(	TokenNameLPAREN	
cur_W_Pos	TokenNameIdentifier	 cur  W  Pos
)	TokenNameRPAREN	
-	TokenNameMINUS	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
sqrt	TokenNameIdentifier	 sqrt
(	TokenNameLPAREN	
cur_W_Neg	TokenNameIdentifier	 cur  W  Neg
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
gain	TokenNameIdentifier	 gain
>	TokenNameGREATER	
maxGain	TokenNameIdentifier	 max Gain
)	TokenNameRPAREN	
{	TokenNameLBRACE	
maxGain	TokenNameIdentifier	 max Gain
=	TokenNameEQUAL	
gain	TokenNameIdentifier	 gain
;	TokenNameSEMICOLON	
bestFeature	TokenNameIdentifier	 best Feature
=	TokenNameEQUAL	
ftr	TokenNameIdentifier	 ftr
;	TokenNameSEMICOLON	
W_Pos	TokenNameIdentifier	 W  Pos
=	TokenNameEQUAL	
cur_W_Pos	TokenNameIdentifier	 cur  W  Pos
;	TokenNameSEMICOLON	
W_Neg	TokenNameIdentifier	 W  Neg
=	TokenNameEQUAL	
cur_W_Neg	TokenNameIdentifier	 cur  W  Neg
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
bestFeature	TokenNameIdentifier	 best Feature
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
double	TokenNamedouble	
Z	TokenNameIdentifier	 Z
=	TokenNameEQUAL	
expLoss	TokenNameIdentifier	 exp Loss
(	TokenNameLPAREN	
margins	TokenNameIdentifier	 margins
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
delta	TokenNameIdentifier	 delta
=	TokenNameEQUAL	
0.5	TokenNameDoubleLiteral	
*	TokenNameMULTIPLY	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
(	TokenNameLPAREN	
W_Pos	TokenNameIdentifier	 W  Pos
+	TokenNamePLUS	
SMOOTH_PARAM	TokenNameIdentifier	 SMOOTH  PARAM
*	TokenNameMULTIPLY	
Z	TokenNameIdentifier	 Z
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
(	TokenNameLPAREN	
W_Neg	TokenNameIdentifier	 W  Neg
+	TokenNamePLUS	
SMOOTH_PARAM	TokenNameIdentifier	 SMOOTH  PARAM
*	TokenNameMULTIPLY	
Z	TokenNameIdentifier	 Z
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** System.out.println("best feature: " + bestFeature + " " + delta); System.out.println("W_Pos: " + W_Pos); System.out.println("W_Neg: " + W_Neg); System.out.println("Z: " + Z); **/	TokenNameCOMMENT_JAVADOC	 System.out.println("best feature: " + bestFeature + " " + delta); System.out.println("W_Pos: " + W_Pos); System.out.println("W_Neg: " + W_Neg); System.out.println("Z: " + Z); *
updateMargins	TokenNameIdentifier	 update Margins
(	TokenNameLPAREN	
bestFeature	TokenNameIdentifier	 best Feature
,	TokenNameCOMMA	
delta	TokenNameIdentifier	 delta
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
increment	TokenNameIdentifier	 increment
(	TokenNameLPAREN	
bestFeature	TokenNameIdentifier	 best Feature
,	TokenNameCOMMA	
delta	TokenNameIdentifier	 delta
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
s	TokenNameIdentifier	 s
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//update margins, for examples that are in A_Pos and A_Neg per the selected feature. 	TokenNameCOMMENT_LINE	update margins, for examples that are in A_Pos and A_Neg per the selected feature. 
private	TokenNameprivate	
void	TokenNamevoid	
updateMargins	TokenNameIdentifier	 update Margins
(	TokenNameLPAREN	
Feature	TokenNameIdentifier	 Feature
feature	TokenNameIdentifier	 feature
,	TokenNameCOMMA	
double	TokenNamedouble	
delta	TokenNameIdentifier	 delta
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
Index	TokenNameIdentifier	 Index
>	TokenNameGREATER	
pos	TokenNameIdentifier	 pos
=	TokenNameEQUAL	
A_pos	TokenNameIdentifier	 A pos
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
feature	TokenNameIdentifier	 feature
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
Index	TokenNameIdentifier	 Index
>	TokenNameGREATER	
neg	TokenNameIdentifier	 neg
=	TokenNameEQUAL	
A_neg	TokenNameIdentifier	 A neg
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
feature	TokenNameIdentifier	 feature
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Index	TokenNameIdentifier	 Index
>	TokenNameGREATER	
it	TokenNameIdentifier	 it
=	TokenNameEQUAL	
pos	TokenNameIdentifier	 pos
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
it	TokenNameIdentifier	 it
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Index	TokenNameIdentifier	 Index
ij	TokenNameIdentifier	 ij
=	TokenNameEQUAL	
it	TokenNameIdentifier	 it
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
margins	TokenNameIdentifier	 margins
[	TokenNameLBRACKET	
ij	TokenNameIdentifier	 ij
.	TokenNameDOT	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
ij	TokenNameIdentifier	 ij
.	TokenNameDOT	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
+=	TokenNamePLUS_EQUAL	
delta	TokenNameIdentifier	 delta
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
neg	TokenNameIdentifier	 neg
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Index	TokenNameIdentifier	 Index
>	TokenNameGREATER	
it	TokenNameIdentifier	 it
=	TokenNameEQUAL	
neg	TokenNameIdentifier	 neg
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
it	TokenNameIdentifier	 it
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Index	TokenNameIdentifier	 Index
ij	TokenNameIdentifier	 ij
=	TokenNameEQUAL	
it	TokenNameIdentifier	 it
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
margins	TokenNameIdentifier	 margins
[	TokenNameLBRACKET	
ij	TokenNameIdentifier	 ij
.	TokenNameDOT	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
ij	TokenNameIdentifier	 ij
.	TokenNameDOT	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
-=	TokenNameMINUS_EQUAL	
delta	TokenNameIdentifier	 delta
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Example	TokenNameIdentifier	 Example
>	TokenNameGREATER	
orderExamplesList	TokenNameIdentifier	 order Examples List
(	TokenNameLPAREN	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Example	TokenNameIdentifier	 Example
>	TokenNameGREATER	
ranking	TokenNameIdentifier	 ranking
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
Example	TokenNameIdentifier	 Example
>	TokenNameGREATER	
correct	TokenNameIdentifier	 correct
=	TokenNameEQUAL	
new	TokenNamenew	
HashSet	TokenNameIdentifier	 Hash Set
<	TokenNameLESS	
Example	TokenNameIdentifier	 Example
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
Example	TokenNameIdentifier	 Example
>	TokenNameGREATER	
incorrect	TokenNameIdentifier	 incorrect
=	TokenNameEQUAL	
new	TokenNamenew	
HashSet	TokenNameIdentifier	 Hash Set
<	TokenNameLESS	
Example	TokenNameIdentifier	 Example
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
ranking	TokenNameIdentifier	 ranking
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Example	TokenNameIdentifier	 Example
ex	TokenNameIdentifier	 ex
=	TokenNameEQUAL	
ranking	TokenNameIdentifier	 ranking
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ex	TokenNameIdentifier	 ex
.	TokenNameDOT	
getLabel	TokenNameIdentifier	 get Label
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
endsWith	TokenNameIdentifier	 ends With
(	TokenNameLPAREN	
"POS 1.0]"	TokenNameStringLiteral	POS 1.0]
)	TokenNameRPAREN	
)	TokenNameRPAREN	
correct	TokenNameIdentifier	 correct
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
incorrect	TokenNameIdentifier	 incorrect
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Example	TokenNameIdentifier	 Example
>	TokenNameGREATER	
ordered	TokenNameIdentifier	 ordered
=	TokenNameEQUAL	
new	TokenNamenew	
LinkedList	TokenNameIdentifier	 Linked List
<	TokenNameLESS	
Example	TokenNameIdentifier	 Example
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Example	TokenNameIdentifier	 Example
>	TokenNameGREATER	
it	TokenNameIdentifier	 it
=	TokenNameEQUAL	
correct	TokenNameIdentifier	 correct
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
it	TokenNameIdentifier	 it
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
ordered	TokenNameIdentifier	 ordered
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
it	TokenNameIdentifier	 it
.	TokenNameDOT	
next	TokenNameIdentifier	 next
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
it	TokenNameIdentifier	 it
=	TokenNameEQUAL	
incorrect	TokenNameIdentifier	 incorrect
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
it	TokenNameIdentifier	 it
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
ordered	TokenNameIdentifier	 ordered
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
it	TokenNameIdentifier	 it
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
ordered	TokenNameIdentifier	 ordered
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
class	TokenNameclass	
Index	TokenNameIdentifier	 Index
{	TokenNameLBRACE	
int	TokenNameint	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
int	TokenNameint	
j	TokenNameIdentifier	 j
;	TokenNameSEMICOLON	
public	TokenNamepublic	
Index	TokenNameIdentifier	 Index
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
int	TokenNameint	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
j	TokenNameIdentifier	 j
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
