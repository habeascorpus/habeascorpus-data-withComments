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
ArrayList	TokenNameIdentifier	 Array List
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
Instance	TokenNameIdentifier	 Instance
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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
ProgressCounter	TokenNameIdentifier	 Progress Counter
;	TokenNameSEMICOLON	
/** * Implements the Listwise Ranking algorithm proposed at: * Learning to Rank: From Pairwise Approach to Listwise Approach, ICML 2007. * Zhe Cao, Tao Qin, Tie-Yan Liu, Ming-Feng Tsai, Hang Li. * * Only works for binary relevance levels (i.e., revelant vs non-revevant) * * @author Vitor R. Carvalho */	TokenNameCOMMENT_JAVADOC	 Implements the Listwise Ranking algorithm proposed at: Learning to Rank: From Pairwise Approach to Listwise Approach, ICML 2007. Zhe Cao, Tao Qin, Tie-Yan Liu, Ming-Feng Tsai, Hang Li. * Only works for binary relevance levels (i.e., revelant vs non-revevant) * @author Vitor R. Carvalho 
public	TokenNamepublic	
class	TokenNameclass	
ListNet	TokenNameIdentifier	 List Net
extends	TokenNameextends	
BatchRankingLearner	TokenNameIdentifier	 Batch Ranking Learner
{	TokenNameLBRACE	
private	TokenNameprivate	
int	TokenNameint	
numEpochs	TokenNameIdentifier	 num Epochs
,	TokenNameCOMMA	
maxNumBadSteps	TokenNameIdentifier	 max Num Bad Steps
=	TokenNameEQUAL	
6	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
double	TokenNamedouble	
learnRate	TokenNameIdentifier	 learn Rate
;	TokenNameSEMICOLON	
//magic parameter 	TokenNameCOMMENT_LINE	magic parameter 
private	TokenNameprivate	
double	TokenNamedouble	
INITLearnRate	TokenNameIdentifier	 INIT Learn Rate
=	TokenNameEQUAL	
0.05	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
double	TokenNamedouble	
minCEImprovement	TokenNameIdentifier	 min CE Improvement
=	TokenNameEQUAL	
0.005	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
double	TokenNamedouble	
RELEVANT	TokenNameIdentifier	 RELEVANT
=	TokenNameEQUAL	
1.0	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
NON_RELEVANT	TokenNameIdentifier	 NON  RELEVANT
=	TokenNameEQUAL	
-	TokenNameMINUS	
1.0	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
// private double selfEntropy =0;//initial cross entropy; 	TokenNameCOMMENT_LINE	private double selfEntropy =0;//initial cross entropy; 
private	TokenNameprivate	
Dataset	TokenNameIdentifier	 Dataset
devData	TokenNameIdentifier	 dev Data
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
//development set 	TokenNameCOMMENT_LINE	development set 
private	TokenNameprivate	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
pz	TokenNameIdentifier	 pz
,	TokenNameCOMMA	
py	TokenNameIdentifier	 py
;	TokenNameSEMICOLON	
//probability distributions 	TokenNameCOMMENT_LINE	probability distributions 
public	TokenNamepublic	
ListNet	TokenNameIdentifier	 List Net
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
15	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0.05	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
ListNet	TokenNameIdentifier	 List Net
(	TokenNameLPAREN	
int	TokenNameint	
numEpochs	TokenNameIdentifier	 num Epochs
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
numEpochs	TokenNameIdentifier	 num Epochs
,	TokenNameCOMMA	
0.05	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
ListNet	TokenNameIdentifier	 List Net
(	TokenNameLPAREN	
int	TokenNameint	
epochs	TokenNameIdentifier	 epochs
,	TokenNameCOMMA	
double	TokenNamedouble	
rate	TokenNameIdentifier	 rate
)	TokenNameRPAREN	
{	TokenNameLBRACE	
numEpochs	TokenNameIdentifier	 num Epochs
=	TokenNameEQUAL	
epochs	TokenNameIdentifier	 epochs
;	TokenNameSEMICOLON	
INITLearnRate	TokenNameIdentifier	 INIT Learn Rate
=	TokenNameEQUAL	
rate	TokenNameIdentifier	 rate
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setDevData	TokenNameIdentifier	 set Dev Data
(	TokenNameLPAREN	
Dataset	TokenNameIdentifier	 Dataset
data	TokenNameIdentifier	 data
)	TokenNameRPAREN	
{	TokenNameLBRACE	
devData	TokenNameIdentifier	 dev Data
=	TokenNameEQUAL	
data	TokenNameIdentifier	 data
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
double	TokenNamedouble	
x	TokenNameIdentifier	 x
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
smallestCE	TokenNameIdentifier	 smallest CE
=	TokenNameEQUAL	
Double	TokenNameIdentifier	 Double
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
;	TokenNameSEMICOLON	
int	TokenNameint	
outcount	TokenNameIdentifier	 outcount
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
Dataset	TokenNameIdentifier	 Dataset
traindata	TokenNameIdentifier	 traindata
=	TokenNameEQUAL	
(	TokenNameLPAREN	
devData	TokenNameIdentifier	 dev Data
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
separateDevData	TokenNameIdentifier	 separate Dev Data
(	TokenNameLPAREN	
data	TokenNameIdentifier	 data
)	TokenNameRPAREN	
:	TokenNameCOLON	
data	TokenNameIdentifier	 data
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Hyperplane	TokenNameIdentifier	 Hyperplane
>	TokenNameGREATER	
ar	TokenNameIdentifier	 ar
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
Hyperplane	TokenNameIdentifier	 Hyperplane
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Hyperplane	TokenNameIdentifier	 Hyperplane
w	TokenNameIdentifier	 w
=	TokenNameEQUAL	
new	TokenNamenew	
Hyperplane	TokenNameIdentifier	 Hyperplane
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ar	TokenNameIdentifier	 ar
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
w	TokenNameIdentifier	 w
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Map queryMap = listsWithOneExampleEach( splitIntoRankings(traindata) ); 	TokenNameCOMMENT_LINE	Map queryMap = listsWithOneExampleEach( splitIntoRankings(traindata) ); 
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Example	TokenNameIdentifier	 Example
>>	TokenNameRIGHT_SHIFT	
queryMap	TokenNameIdentifier	 query Map
=	TokenNameEQUAL	
splitIntoRankings	TokenNameIdentifier	 split Into Rankings
(	TokenNameLPAREN	
traindata	TokenNameIdentifier	 traindata
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ProgressCounter	TokenNameIdentifier	 Progress Counter
pc	TokenNameIdentifier	 pc
=	TokenNameEQUAL	
new	TokenNamenew	
ProgressCounter	TokenNameIdentifier	 Progress Counter
(	TokenNameLPAREN	
"ListNet training"	TokenNameStringLiteral	ListNet training
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
setLearnRate	TokenNameIdentifier	 set Learn Rate
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
learnStep	TokenNameIdentifier	 learn Step
(	TokenNameLPAREN	
queryMap	TokenNameIdentifier	 query Map
,	TokenNameCOMMA	
w	TokenNameIdentifier	 w
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
cur_ce	TokenNameIdentifier	 cur ce
=	TokenNameEQUAL	
calculateLoss	TokenNameIdentifier	 calculate Loss
(	TokenNameLPAREN	
splitIntoRankings	TokenNameIdentifier	 split Into Rankings
(	TokenNameLPAREN	
devData	TokenNameIdentifier	 dev Data
)	TokenNameRPAREN	
,	TokenNameCOMMA	
w	TokenNameIdentifier	 w
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
x	TokenNameIdentifier	 x
=	TokenNameEQUAL	
smallestCE	TokenNameIdentifier	 smallest CE
-	TokenNameMINUS	
cur_ce	TokenNameIdentifier	 cur ce
;	TokenNameSEMICOLON	
// System.out.println(e+"\tCE/prevCE = "+cur_ce+"/"+smallestCE+"\tx="+x+"\t"+learnRate); 	TokenNameCOMMENT_LINE	System.out.println(e+"\tCE/prevCE = "+cur_ce+"/"+smallestCE+"\tx="+x+"\t"+learnRate); 
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// System.out.println("SELF-entropy = "+selfEntropy); 	TokenNameCOMMENT_LINE	System.out.println("SELF-entropy = "+selfEntropy); 
Hyperplane	TokenNameIdentifier	 Hyperplane
tmp	TokenNameIdentifier	 tmp
=	TokenNameEQUAL	
new	TokenNamenew	
Hyperplane	TokenNameIdentifier	 Hyperplane
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tmp	TokenNameIdentifier	 tmp
.	TokenNameDOT	
increment	TokenNameIdentifier	 increment
(	TokenNameLPAREN	
w	TokenNameIdentifier	 w
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ar	TokenNameIdentifier	 ar
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
tmp	TokenNameIdentifier	 tmp
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
smallestCE	TokenNameIdentifier	 smallest CE
=	TokenNameEQUAL	
cur_ce	TokenNameIdentifier	 cur ce
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
<	TokenNameLESS	
minCEImprovement	TokenNameIdentifier	 min CE Improvement
)	TokenNameRPAREN	
{	TokenNameLBRACE	
outcount	TokenNameIdentifier	 outcount
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
outcount	TokenNameIdentifier	 outcount
>	TokenNameGREATER	
maxNumBadSteps	TokenNameIdentifier	 max Num Bad Steps
)	TokenNameRPAREN	
return	TokenNamereturn	
ar	TokenNameIdentifier	 ar
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
ar	TokenNameIdentifier	 ar
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//try to find a new hypothesis by changing the learnRate 	TokenNameCOMMENT_LINE	try to find a new hypothesis by changing the learnRate 
int	TokenNameint	
count	TokenNameIdentifier	 count
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
count	TokenNameIdentifier	 count
++	TokenNamePLUS_PLUS	
<	TokenNameLESS	
maxNumBadSteps	TokenNameIdentifier	 max Num Bad Steps
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
learnRate	TokenNameIdentifier	 learn Rate
=	TokenNameEQUAL	
learnRate	TokenNameIdentifier	 learn Rate
/	TokenNameDIVIDE	
5.0	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
Hyperplane	TokenNameIdentifier	 Hyperplane
hii	TokenNameIdentifier	 hii
=	TokenNameEQUAL	
new	TokenNamenew	
Hyperplane	TokenNameIdentifier	 Hyperplane
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
hii	TokenNameIdentifier	 hii
.	TokenNameDOT	
increment	TokenNameIdentifier	 increment
(	TokenNameLPAREN	
ar	TokenNameIdentifier	 ar
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
ar	TokenNameIdentifier	 ar
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
learnStep	TokenNameIdentifier	 learn Step
(	TokenNameLPAREN	
queryMap	TokenNameIdentifier	 query Map
,	TokenNameCOMMA	
hii	TokenNameIdentifier	 hii
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//it modifies hii 	TokenNameCOMMENT_LINE	it modifies hii 
cur_ce	TokenNameIdentifier	 cur ce
=	TokenNameEQUAL	
calculateLoss	TokenNameIdentifier	 calculate Loss
(	TokenNameLPAREN	
splitIntoRankings	TokenNameIdentifier	 split Into Rankings
(	TokenNameLPAREN	
devData	TokenNameIdentifier	 dev Data
)	TokenNameRPAREN	
,	TokenNameCOMMA	
hii	TokenNameIdentifier	 hii
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
x	TokenNameIdentifier	 x
=	TokenNameEQUAL	
smallestCE	TokenNameIdentifier	 smallest CE
-	TokenNameMINUS	
cur_ce	TokenNameIdentifier	 cur ce
;	TokenNameSEMICOLON	
// System.out.println("\tCE = "+cur_ce+"\tx="+x+"\t"+learnRate); 	TokenNameCOMMENT_LINE	System.out.println("\tCE = "+cur_ce+"\tx="+x+"\t"+learnRate); 
if	TokenNameif	
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
w	TokenNameIdentifier	 w
=	TokenNameEQUAL	
hii	TokenNameIdentifier	 hii
;	TokenNameSEMICOLON	
ar	TokenNameIdentifier	 ar
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
hii	TokenNameIdentifier	 hii
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
smallestCE	TokenNameIdentifier	 smallest CE
=	TokenNameEQUAL	
cur_ce	TokenNameIdentifier	 cur ce
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
outcount	TokenNameIdentifier	 outcount
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
// System.out.println(w); 	TokenNameCOMMENT_LINE	System.out.println(w); 
return	TokenNamereturn	
ar	TokenNameIdentifier	 ar
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
ar	TokenNameIdentifier	 ar
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
learnStep	TokenNameIdentifier	 learn Step
(	TokenNameLPAREN	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Example	TokenNameIdentifier	 Example
>>	TokenNameRIGHT_SHIFT	
queryMap	TokenNameIdentifier	 query Map
,	TokenNameCOMMA	
Hyperplane	TokenNameIdentifier	 Hyperplane
w	TokenNameIdentifier	 w
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
queryMap	TokenNameIdentifier	 query Map
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
queryMap	TokenNameIdentifier	 query Map
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
subpop	TokenNameIdentifier	 subpop
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
batchTrainSubPop	TokenNameIdentifier	 batch Train Sub Pop
(	TokenNameLPAREN	
w	TokenNameIdentifier	 w
,	TokenNameCOMMA	
ranking	TokenNameIdentifier	 ranking
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// return the number of times h has been updated 	TokenNameCOMMENT_LINE	return the number of times h has been updated 
private	TokenNameprivate	
void	TokenNamevoid	
batchTrainSubPop	TokenNameIdentifier	 batch Train Sub Pop
(	TokenNameLPAREN	
Hyperplane	TokenNameIdentifier	 Hyperplane
w	TokenNameIdentifier	 w
,	TokenNameCOMMA	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Example	TokenNameIdentifier	 Example
>	TokenNameGREATER	
ranking	TokenNameIdentifier	 ranking
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//initialize normalizers and create prob distributions 	TokenNameCOMMENT_LINE	initialize normalizers and create prob distributions 
initialize	TokenNameIdentifier	 initialize
(	TokenNameLPAREN	
ranking	TokenNameIdentifier	 ranking
,	TokenNameCOMMA	
w	TokenNameIdentifier	 w
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//compute gradient: deltaW(m) 	TokenNameCOMMENT_LINE	compute gradient: deltaW(m) 
Hyperplane	TokenNameIdentifier	 Hyperplane
deltaW	TokenNameIdentifier	 delta W
=	TokenNameEQUAL	
calculateGradient	TokenNameIdentifier	 calculate Gradient
(	TokenNameLPAREN	
ranking	TokenNameIdentifier	 ranking
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//update hypothesis: w = w - deltaW*learningRate 	TokenNameCOMMENT_LINE	update hypothesis: w = w - deltaW*learningRate 
w	TokenNameIdentifier	 w
.	TokenNameDOT	
increment	TokenNameIdentifier	 increment
(	TokenNameLPAREN	
deltaW	TokenNameIdentifier	 delta W
,	TokenNameCOMMA	
-	TokenNameMINUS	
learnRate	TokenNameIdentifier	 learn Rate
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * calculates equation (6) from paper. * @param list * @return */	TokenNameCOMMENT_JAVADOC	 calculates equation (6) from paper. @param list @return 
private	TokenNameprivate	
Hyperplane	TokenNameIdentifier	 Hyperplane
calculateGradient	TokenNameIdentifier	 calculate Gradient
(	TokenNameLPAREN	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Example	TokenNameIdentifier	 Example
>	TokenNameGREATER	
list	TokenNameIdentifier	 list
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Hyperplane	TokenNameIdentifier	 Hyperplane
hyp	TokenNameIdentifier	 hyp
=	TokenNameEQUAL	
new	TokenNamenew	
Hyperplane	TokenNameIdentifier	 Hyperplane
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//calculates first term 	TokenNameCOMMENT_LINE	calculates first term 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
list	TokenNameIdentifier	 list
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Instance	TokenNameIdentifier	 Instance
ins	TokenNameIdentifier	 ins
=	TokenNameEQUAL	
list	TokenNameIdentifier	 list
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//for each feature in this example 	TokenNameCOMMENT_LINE	for each feature in this example 
for	TokenNamefor	
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Feature	TokenNameIdentifier	 Feature
>	TokenNameGREATER	
loop	TokenNameIdentifier	 loop
=	TokenNameEQUAL	
ins	TokenNameIdentifier	 ins
.	TokenNameDOT	
featureIterator	TokenNameIdentifier	 feature Iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
loop	TokenNameIdentifier	 loop
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Feature	TokenNameIdentifier	 Feature
f	TokenNameIdentifier	 f
=	TokenNameEQUAL	
loop	TokenNameIdentifier	 loop
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
term1	TokenNameIdentifier	 term1
=	TokenNameEQUAL	
py	TokenNameIdentifier	 py
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
*	TokenNameMULTIPLY	
ins	TokenNameIdentifier	 ins
.	TokenNameDOT	
getWeight	TokenNameIdentifier	 get Weight
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//first term of derivative 	TokenNameCOMMENT_LINE	first term of derivative 
hyp	TokenNameIdentifier	 hyp
.	TokenNameDOT	
increment	TokenNameIdentifier	 increment
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
,	TokenNameCOMMA	
-	TokenNameMINUS	
term1	TokenNameIdentifier	 term1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
term2	TokenNameIdentifier	 term2
=	TokenNameEQUAL	
pz	TokenNameIdentifier	 pz
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
*	TokenNameMULTIPLY	
ins	TokenNameIdentifier	 ins
.	TokenNameDOT	
getWeight	TokenNameIdentifier	 get Weight
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//second term of derivative 	TokenNameCOMMENT_LINE	second term of derivative 
hyp	TokenNameIdentifier	 hyp
.	TokenNameDOT	
increment	TokenNameIdentifier	 increment
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
,	TokenNameCOMMA	
term2	TokenNameIdentifier	 term2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
hyp	TokenNameIdentifier	 hyp
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Calculates Equation (3): cross entropy between a "base" distribution and another one. */	TokenNameCOMMENT_JAVADOC	 Calculates Equation (3): cross entropy between a "base" distribution and another one. 
public	TokenNamepublic	
double	TokenNamedouble	
crossEntropy	TokenNameIdentifier	 cross Entropy
(	TokenNameLPAREN	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
base	TokenNameIdentifier	 base
,	TokenNameCOMMA	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
base	TokenNameIdentifier	 base
.	TokenNameDOT	
length	TokenNameIdentifier	 length
!=	TokenNameNOT_EQUAL	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"Probability distributions of different sizes!"	TokenNameStringLiteral	Probability distributions of different sizes!
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
double	TokenNamedouble	
sum	TokenNameIdentifier	 sum
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
base	TokenNameIdentifier	 base
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sum	TokenNameIdentifier	 sum
+=	TokenNamePLUS_EQUAL	
base	TokenNameIdentifier	 base
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
*	TokenNameMULTIPLY	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
-	TokenNameMINUS	
sum	TokenNameIdentifier	 sum
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Initialize probability distributions. * @param list * @param w */	TokenNameCOMMENT_JAVADOC	 Initialize probability distributions. @param list @param w 
private	TokenNameprivate	
void	TokenNamevoid	
initialize	TokenNameIdentifier	 initialize
(	TokenNameLPAREN	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Example	TokenNameIdentifier	 Example
>	TokenNameGREATER	
list	TokenNameIdentifier	 list
,	TokenNameCOMMA	
Hyperplane	TokenNameIdentifier	 Hyperplane
w	TokenNameIdentifier	 w
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//create new probability distribution 	TokenNameCOMMENT_LINE	create new probability distribution 
pz	TokenNameIdentifier	 pz
=	TokenNameEQUAL	
new	TokenNamenew	
double	TokenNamedouble	
[	TokenNameLBRACKET	
list	TokenNameIdentifier	 list
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
py	TokenNameIdentifier	 py
=	TokenNameEQUAL	
new	TokenNamenew	
double	TokenNamedouble	
[	TokenNameLBRACKET	
list	TokenNameIdentifier	 list
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
sumY	TokenNameIdentifier	 sum Y
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
sumZ	TokenNameIdentifier	 sum Z
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
//normalizers 	TokenNameCOMMENT_LINE	normalizers 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
list	TokenNameIdentifier	 list
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
list	TokenNameIdentifier	 list
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
isPositive	TokenNameIdentifier	 is Positive
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
sumY	TokenNameIdentifier	 sum Y
+=	TokenNamePLUS_EQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
exp	TokenNameIdentifier	 exp
(	TokenNameLPAREN	
RELEVANT	TokenNameIdentifier	 RELEVANT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
sumY	TokenNameIdentifier	 sum Y
+=	TokenNamePLUS_EQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
exp	TokenNameIdentifier	 exp
(	TokenNameLPAREN	
NON_RELEVANT	TokenNameIdentifier	 NON  RELEVANT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sumZ	TokenNameIdentifier	 sum Z
+=	TokenNamePLUS_EQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
exp	TokenNameIdentifier	 exp
(	TokenNameLPAREN	
w	TokenNameIdentifier	 w
.	TokenNameDOT	
score	TokenNameIdentifier	 score
(	TokenNameLPAREN	
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
list	TokenNameIdentifier	 list
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
list	TokenNameIdentifier	 list
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
tmp	TokenNameIdentifier	 tmp
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ex	TokenNameIdentifier	 ex
.	TokenNameDOT	
getLabel	TokenNameIdentifier	 get Label
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
isPositive	TokenNameIdentifier	 is Positive
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
exp	TokenNameIdentifier	 exp
(	TokenNameLPAREN	
RELEVANT	TokenNameIdentifier	 RELEVANT
)	TokenNameRPAREN	
:	TokenNameCOLON	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
exp	TokenNameIdentifier	 exp
(	TokenNameLPAREN	
NON_RELEVANT	TokenNameIdentifier	 NON  RELEVANT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
;	TokenNameSEMICOLON	
py	TokenNameIdentifier	 py
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
tmp	TokenNameIdentifier	 tmp
/	TokenNameDIVIDE	
sumY	TokenNameIdentifier	 sum Y
;	TokenNameSEMICOLON	
pz	TokenNameIdentifier	 pz
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
exp	TokenNameIdentifier	 exp
(	TokenNameLPAREN	
w	TokenNameIdentifier	 w
.	TokenNameDOT	
score	TokenNameIdentifier	 score
(	TokenNameLPAREN	
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
sumZ	TokenNameIdentifier	 sum Z
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setLearnRate	TokenNameIdentifier	 set Learn Rate
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
learnRate	TokenNameIdentifier	 learn Rate
=	TokenNameEQUAL	
INITLearnRate	TokenNameIdentifier	 INIT Learn Rate
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* * Separates 20% of the data for development tests */	TokenNameCOMMENT_BLOCK	 Separates 20% of the data for development tests 
private	TokenNameprivate	
Dataset	TokenNameIdentifier	 Dataset
separateDevData	TokenNameIdentifier	 separate Dev Data
(	TokenNameLPAREN	
Dataset	TokenNameIdentifier	 Dataset
data	TokenNameIdentifier	 data
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Dataset	TokenNameIdentifier	 Dataset
.	TokenNameDOT	
Split	TokenNameIdentifier	 Split
split	TokenNameIdentifier	 split
=	TokenNameEQUAL	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
split	TokenNameIdentifier	 split
(	TokenNameLPAREN	
new	TokenNamenew	
CrossValSplitter	TokenNameIdentifier	 Cross Val Splitter
<	TokenNameLESS	
Example	TokenNameIdentifier	 Example
>	TokenNameGREATER	
(	TokenNameLPAREN	
5	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
devData	TokenNameIdentifier	 dev Data
=	TokenNameEQUAL	
split	TokenNameIdentifier	 split
.	TokenNameDOT	
getTest	TokenNameIdentifier	 get Test
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
split	TokenNameIdentifier	 split
.	TokenNameDOT	
getTrain	TokenNameIdentifier	 get Train
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* * returns the loss over dataset: sum of cross-entropies */	TokenNameCOMMENT_BLOCK	 returns the loss over dataset: sum of cross-entropies 
double	TokenNamedouble	
calculateLoss	TokenNameIdentifier	 calculate Loss
(	TokenNameLPAREN	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Example	TokenNameIdentifier	 Example
>>	TokenNameRIGHT_SHIFT	
queryMap	TokenNameIdentifier	 query Map
,	TokenNameCOMMA	
Hyperplane	TokenNameIdentifier	 Hyperplane
w	TokenNameIdentifier	 w
)	TokenNameRPAREN	
{	TokenNameLBRACE	
double	TokenNamedouble	
ce	TokenNameIdentifier	 ce
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// selfEntropy = 0.0; 	TokenNameCOMMENT_LINE	selfEntropy = 0.0; 
for	TokenNamefor	
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
queryMap	TokenNameIdentifier	 query Map
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
queryMap	TokenNameIdentifier	 query Map
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
subpop	TokenNameIdentifier	 subpop
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
initialize	TokenNameIdentifier	 initialize
(	TokenNameLPAREN	
ranking	TokenNameIdentifier	 ranking
,	TokenNameCOMMA	
w	TokenNameIdentifier	 w
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ce	TokenNameIdentifier	 ce
+=	TokenNamePLUS_EQUAL	
crossEntropy	TokenNameIdentifier	 cross Entropy
(	TokenNameLPAREN	
py	TokenNameIdentifier	 py
,	TokenNameCOMMA	
pz	TokenNameIdentifier	 pz
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// selfEntropy += crossEntropy(py,py); 	TokenNameCOMMENT_LINE	selfEntropy += crossEntropy(py,py); 
}	TokenNameRBRACE	
return	TokenNamereturn	
ce	TokenNameIdentifier	 ce
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
