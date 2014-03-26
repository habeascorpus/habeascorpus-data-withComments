package	TokenNamepackage	
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
Map	TokenNameIdentifier	 Map
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
TreeMap	TokenNameIdentifier	 Tree Map
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
Level	TokenNameIdentifier	 Level
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
BasicDataset	TokenNameIdentifier	 Basic Dataset
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
BatchBinaryClassifierLearner	TokenNameIdentifier	 Batch Binary Classifier Learner
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
/** * A simple decision tree learning algorithm. * * @author William Cohen */	TokenNameCOMMENT_JAVADOC	 A simple decision tree learning algorithm. * @author William Cohen 
public	TokenNamepublic	
class	TokenNameclass	
DecisionTreeLearner	TokenNameIdentifier	 Decision Tree Learner
extends	TokenNameextends	
BatchBinaryClassifierLearner	TokenNameIdentifier	 Batch Binary Classifier Learner
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
DecisionTreeLearner	TokenNameIdentifier	 Decision Tree Learner
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
boolean	TokenNameboolean	
DEBUG	TokenNameIdentifier	 DEBUG
=	TokenNameEQUAL	
log	TokenNameIdentifier	 log
.	TokenNameDOT	
getEffectiveLevel	TokenNameIdentifier	 get Effective Level
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
isGreaterOrEqual	TokenNameIdentifier	 is Greater Or Equal
(	TokenNameLPAREN	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
DEBUG	TokenNameIdentifier	 DEBUG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
maxDepth	TokenNameIdentifier	 max Depth
=	TokenNameEQUAL	
5	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
minSplitCount	TokenNameIdentifier	 min Split Count
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
double	TokenNamedouble	
epsilon	TokenNameIdentifier	 epsilon
=	TokenNameEQUAL	
0.001	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
/** * @param maxDepth * maximum depth of the tree * @param minSplitCount * minimum number of examples to have before considering a split */	TokenNameCOMMENT_JAVADOC	 @param maxDepth maximum depth of the tree @param minSplitCount minimum number of examples to have before considering a split 
public	TokenNamepublic	
DecisionTreeLearner	TokenNameIdentifier	 Decision Tree Learner
(	TokenNameLPAREN	
int	TokenNameint	
maxDepth	TokenNameIdentifier	 max Depth
,	TokenNameCOMMA	
int	TokenNameint	
minSplitCount	TokenNameIdentifier	 min Split Count
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
maxDepth	TokenNameIdentifier	 max Depth
=	TokenNameEQUAL	
maxDepth	TokenNameIdentifier	 max Depth
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
minSplitCount	TokenNameIdentifier	 min Split Count
=	TokenNameEQUAL	
minSplitCount	TokenNameIdentifier	 min Split Count
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
DecisionTreeLearner	TokenNameIdentifier	 Decision Tree Learner
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
5	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getMaxDepth	TokenNameIdentifier	 get Max Depth
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
maxDepth	TokenNameIdentifier	 max Depth
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setMaxDepth	TokenNameIdentifier	 set Max Depth
(	TokenNameLPAREN	
int	TokenNameint	
d	TokenNameIdentifier	 d
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
maxDepth	TokenNameIdentifier	 max Depth
=	TokenNameEQUAL	
d	TokenNameIdentifier	 d
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getMinSplitCount	TokenNameIdentifier	 get Min Split Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
minSplitCount	TokenNameIdentifier	 min Split Count
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setMinSplitCount	TokenNameIdentifier	 set Min Split Count
(	TokenNameLPAREN	
int	TokenNameint	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
minSplitCount	TokenNameIdentifier	 min Split Count
=	TokenNameEQUAL	
c	TokenNameIdentifier	 c
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
epsilon	TokenNameIdentifier	 epsilon
=	TokenNameEQUAL	
0.5	TokenNameDoubleLiteral	
/	TokenNameDIVIDE	
dataset	TokenNameIdentifier	 dataset
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Classifier	TokenNameIdentifier	 Classifier
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
batchTrain	TokenNameIdentifier	 batch Train
(	TokenNameLPAREN	
dataset	TokenNameIdentifier	 dataset
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
log	TokenNameIdentifier	 log
.	TokenNameDOT	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
"built tree: "	TokenNameStringLiteral	built tree: 
+	TokenNamePLUS	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
c	TokenNameIdentifier	 c
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The real learning algorithm. * * Top-down decision tree learning, no pruning except that required by * maxDepth and minSplitCount, guided by the criterion for weak learners * proposed by Schapire and Singer in Improved boosting algorithms using * confidence-rated predictions. Machine Learning, 37(3):297-336, 1999. */	TokenNameCOMMENT_JAVADOC	 The real learning algorithm. * Top-down decision tree learning, no pruning except that required by maxDepth and minSplitCount, guided by the criterion for weak learners proposed by Schapire and Singer in Improved boosting algorithms using confidence-rated predictions. Machine Learning, 37(3):297-336, 1999. 
private	TokenNameprivate	
DecisionTree	TokenNameIdentifier	 Decision Tree
batchTrain	TokenNameIdentifier	 batch Train
(	TokenNameLPAREN	
Dataset	TokenNameIdentifier	 Dataset
dataset	TokenNameIdentifier	 dataset
,	TokenNameCOMMA	
int	TokenNameint	
depth	TokenNameIdentifier	 depth
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// see how put the dataset is 	TokenNameCOMMENT_LINE	see how put the dataset is 
double	TokenNamedouble	
posWeight	TokenNameIdentifier	 pos Weight
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
negWeight	TokenNameIdentifier	 neg Weight
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Example	TokenNameIdentifier	 Example
>	TokenNameGREATER	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
dataset	TokenNameIdentifier	 dataset
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
Example	TokenNameIdentifier	 Example
example	TokenNameIdentifier	 example
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
example	TokenNameIdentifier	 example
.	TokenNameDOT	
getLabel	TokenNameIdentifier	 get Label
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
numericLabel	TokenNameIdentifier	 numeric Label
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
posWeight	TokenNameIdentifier	 pos Weight
+=	TokenNamePLUS_EQUAL	
example	TokenNameIdentifier	 example
.	TokenNameDOT	
getWeight	TokenNameIdentifier	 get Weight
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
negWeight	TokenNameIdentifier	 neg Weight
+=	TokenNamePLUS_EQUAL	
example	TokenNameIdentifier	 example
.	TokenNameDOT	
getWeight	TokenNameIdentifier	 get Weight
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
log	TokenNameIdentifier	 log
.	TokenNameDOT	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
"build (sub)tree with posWeight: "	TokenNameStringLiteral	build (sub)tree with posWeight: 
+	TokenNamePLUS	
posWeight	TokenNameIdentifier	 pos Weight
+	TokenNamePLUS	
" negWeight: "	TokenNameStringLiteral	 negWeight: 
+	TokenNamePLUS	
negWeight	TokenNameIdentifier	 neg Weight
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// if (DEBUG) log.debug(dataset); 	TokenNameCOMMENT_LINE	if (DEBUG) log.debug(dataset); 
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
dataset	TokenNameIdentifier	 dataset
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
<	TokenNameLESS	
minSplitCount	TokenNameIdentifier	 min Split Count
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
depth	TokenNameIdentifier	 depth
>=	TokenNameGREATER_EQUAL	
maxDepth	TokenNameIdentifier	 max Depth
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
negWeight	TokenNameIdentifier	 neg Weight
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
posWeight	TokenNameIdentifier	 pos Weight
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
log	TokenNameIdentifier	 log
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"leaf"	TokenNameStringLiteral	leaf
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
DecisionTree	TokenNameIdentifier	 Decision Tree
.	TokenNameDOT	
Leaf	TokenNameIdentifier	 Leaf
(	TokenNameLPAREN	
0.5	TokenNameDoubleLiteral	
*	TokenNameMULTIPLY	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
(	TokenNameLPAREN	
posWeight	TokenNameIdentifier	 pos Weight
+	TokenNamePLUS	
epsilon	TokenNameIdentifier	 epsilon
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
(	TokenNameLPAREN	
negWeight	TokenNameIdentifier	 neg Weight
+	TokenNamePLUS	
epsilon	TokenNameIdentifier	 epsilon
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// measure value of each possible split 	TokenNameCOMMENT_LINE	measure value of each possible split 
double	TokenNamedouble	
totalPosWeight	TokenNameIdentifier	 total Pos Weight
=	TokenNameEQUAL	
0.0	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
totalNegWeight	TokenNameIdentifier	 total Neg Weight
=	TokenNameEQUAL	
0.0	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
Feature	TokenNameIdentifier	 Feature
,	TokenNameCOMMA	
BinaryFeatureStats	TokenNameIdentifier	 Binary Feature Stats
>	TokenNameGREATER	
binaryMap	TokenNameIdentifier	 binary Map
=	TokenNameEQUAL	
new	TokenNamenew	
TreeMap	TokenNameIdentifier	 Tree Map
<	TokenNameLESS	
Feature	TokenNameIdentifier	 Feature
,	TokenNameCOMMA	
BinaryFeatureStats	TokenNameIdentifier	 Binary Feature Stats
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
Feature	TokenNameIdentifier	 Feature
,	TokenNameCOMMA	
NumericFeatureStats	TokenNameIdentifier	 Numeric Feature Stats
>	TokenNameGREATER	
numericMap	TokenNameIdentifier	 numeric Map
=	TokenNameEQUAL	
new	TokenNamenew	
TreeMap	TokenNameIdentifier	 Tree Map
<	TokenNameLESS	
Feature	TokenNameIdentifier	 Feature
,	TokenNameCOMMA	
NumericFeatureStats	TokenNameIdentifier	 Numeric Feature Stats
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
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
dataset	TokenNameIdentifier	 dataset
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
Example	TokenNameIdentifier	 Example
example	TokenNameIdentifier	 example
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
example	TokenNameIdentifier	 example
.	TokenNameDOT	
getLabel	TokenNameIdentifier	 get Label
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
numericLabel	TokenNameIdentifier	 numeric Label
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
totalPosWeight	TokenNameIdentifier	 total Pos Weight
+=	TokenNamePLUS_EQUAL	
example	TokenNameIdentifier	 example
.	TokenNameDOT	
getWeight	TokenNameIdentifier	 get Weight
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
totalNegWeight	TokenNameIdentifier	 total Neg Weight
+=	TokenNamePLUS_EQUAL	
example	TokenNameIdentifier	 example
.	TokenNameDOT	
getWeight	TokenNameIdentifier	 get Weight
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Feature	TokenNameIdentifier	 Feature
>	TokenNameGREATER	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
example	TokenNameIdentifier	 example
.	TokenNameDOT	
binaryFeatureIterator	TokenNameIdentifier	 binary Feature Iterator
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
Feature	TokenNameIdentifier	 Feature
f	TokenNameIdentifier	 f
=	TokenNameEQUAL	
j	TokenNameIdentifier	 j
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
BinaryFeatureStats	TokenNameIdentifier	 Binary Feature Stats
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
binaryMap	TokenNameIdentifier	 binary Map
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
binaryMap	TokenNameIdentifier	 binary Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
,	TokenNameCOMMA	
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
new	TokenNamenew	
BinaryFeatureStats	TokenNameIdentifier	 Binary Feature Stats
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
update	TokenNameIdentifier	 update
(	TokenNameLPAREN	
example	TokenNameIdentifier	 example
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Feature	TokenNameIdentifier	 Feature
>	TokenNameGREATER	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
example	TokenNameIdentifier	 example
.	TokenNameDOT	
numericFeatureIterator	TokenNameIdentifier	 numeric Feature Iterator
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
Feature	TokenNameIdentifier	 Feature
f	TokenNameIdentifier	 f
=	TokenNameEQUAL	
j	TokenNameIdentifier	 j
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
NumericFeatureStats	TokenNameIdentifier	 Numeric Feature Stats
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
numericMap	TokenNameIdentifier	 numeric Map
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
numericMap	TokenNameIdentifier	 numeric Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
,	TokenNameCOMMA	
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
new	TokenNamenew	
NumericFeatureStats	TokenNameIdentifier	 Numeric Feature Stats
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
update	TokenNameIdentifier	 update
(	TokenNameLPAREN	
example	TokenNameIdentifier	 example
,	TokenNameCOMMA	
example	TokenNameIdentifier	 example
.	TokenNameDOT	
getWeight	TokenNameIdentifier	 get Weight
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// pick the best feature 	TokenNameCOMMENT_LINE	pick the best feature 
double	TokenNamedouble	
bestValue	TokenNameIdentifier	 best Value
=	TokenNameEQUAL	
Double	TokenNameIdentifier	 Double
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
;	TokenNameSEMICOLON	
double	TokenNamedouble	
bestThreshold	TokenNameIdentifier	 best Threshold
=	TokenNameEQUAL	
-	TokenNameMINUS	
9999	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
Feature	TokenNameIdentifier	 Feature
bestFeature	TokenNameIdentifier	 best Feature
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Feature	TokenNameIdentifier	 Feature
>	TokenNameGREATER	
k	TokenNameIdentifier	 k
=	TokenNameEQUAL	
binaryMap	TokenNameIdentifier	 binary Map
.	TokenNameDOT	
keySet	TokenNameIdentifier	 key Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
k	TokenNameIdentifier	 k
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
k	TokenNameIdentifier	 k
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
BinaryFeatureStats	TokenNameIdentifier	 Binary Feature Stats
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
binaryMap	TokenNameIdentifier	 binary Map
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
v	TokenNameIdentifier	 v
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
value	TokenNameIdentifier	 value
(	TokenNameLPAREN	
totalPosWeight	TokenNameIdentifier	 total Pos Weight
,	TokenNameCOMMA	
totalNegWeight	TokenNameIdentifier	 total Neg Weight
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG	TokenNameIdentifier	 DEBUG
)	TokenNameRPAREN	
log	TokenNameIdentifier	 log
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"feature "	TokenNameStringLiteral	feature 
+	TokenNamePLUS	
f	TokenNameIdentifier	 f
+	TokenNamePLUS	
" stats: "	TokenNameStringLiteral	 stats: 
+	TokenNamePLUS	
s	TokenNameIdentifier	 s
+	TokenNamePLUS	
" val: "	TokenNameStringLiteral	 val: 
+	TokenNamePLUS	
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
<	TokenNameLESS	
bestValue	TokenNameIdentifier	 best Value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
bestValue	TokenNameIdentifier	 best Value
=	TokenNameEQUAL	
v	TokenNameIdentifier	 v
;	TokenNameSEMICOLON	
bestFeature	TokenNameIdentifier	 best Feature
=	TokenNameEQUAL	
f	TokenNameIdentifier	 f
;	TokenNameSEMICOLON	
bestThreshold	TokenNameIdentifier	 best Threshold
=	TokenNameEQUAL	
0.5	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG	TokenNameIdentifier	 DEBUG
)	TokenNameRPAREN	
log	TokenNameIdentifier	 log
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
" ==> BEST"	TokenNameStringLiteral	 ==> BEST
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Feature	TokenNameIdentifier	 Feature
>	TokenNameGREATER	
k	TokenNameIdentifier	 k
=	TokenNameEQUAL	
numericMap	TokenNameIdentifier	 numeric Map
.	TokenNameDOT	
keySet	TokenNameIdentifier	 key Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
k	TokenNameIdentifier	 k
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
k	TokenNameIdentifier	 k
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
NumericFeatureStats	TokenNameIdentifier	 Numeric Feature Stats
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
numericMap	TokenNameIdentifier	 numeric Map
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
v	TokenNameIdentifier	 v
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
value	TokenNameIdentifier	 value
(	TokenNameLPAREN	
totalPosWeight	TokenNameIdentifier	 total Pos Weight
,	TokenNameCOMMA	
totalNegWeight	TokenNameIdentifier	 total Neg Weight
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
th	TokenNameIdentifier	 th
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
getBestThreshold	TokenNameIdentifier	 get Best Threshold
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG	TokenNameIdentifier	 DEBUG
)	TokenNameRPAREN	
log	TokenNameIdentifier	 log
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"feature "	TokenNameStringLiteral	feature 
+	TokenNamePLUS	
f	TokenNameIdentifier	 f
+	TokenNamePLUS	
"<"	TokenNameStringLiteral	<
+	TokenNamePLUS	
th	TokenNameIdentifier	 th
+	TokenNamePLUS	
" stats: "	TokenNameStringLiteral	 stats: 
+	TokenNamePLUS	
s	TokenNameIdentifier	 s
+	TokenNamePLUS	
" val: "	TokenNameStringLiteral	 val: 
+	TokenNamePLUS	
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
<	TokenNameLESS	
bestValue	TokenNameIdentifier	 best Value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
bestValue	TokenNameIdentifier	 best Value
=	TokenNameEQUAL	
v	TokenNameIdentifier	 v
;	TokenNameSEMICOLON	
bestFeature	TokenNameIdentifier	 best Feature
=	TokenNameEQUAL	
f	TokenNameIdentifier	 f
;	TokenNameSEMICOLON	
bestThreshold	TokenNameIdentifier	 best Threshold
=	TokenNameEQUAL	
th	TokenNameIdentifier	 th
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG	TokenNameIdentifier	 DEBUG
)	TokenNameRPAREN	
log	TokenNameIdentifier	 log
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
" ==> BEST"	TokenNameStringLiteral	 ==> BEST
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
bestFeature	TokenNameIdentifier	 best Feature
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// no useful split found 	TokenNameCOMMENT_LINE	no useful split found 
log	TokenNameIdentifier	 log
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"no good split found - leaf"	TokenNameStringLiteral	no good split found - leaf
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
DecisionTree	TokenNameIdentifier	 Decision Tree
.	TokenNameDOT	
Leaf	TokenNameIdentifier	 Leaf
(	TokenNameLPAREN	
0.5	TokenNameDoubleLiteral	
*	TokenNameMULTIPLY	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
(	TokenNameLPAREN	
posWeight	TokenNameIdentifier	 pos Weight
+	TokenNamePLUS	
epsilon	TokenNameIdentifier	 epsilon
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
(	TokenNameLPAREN	
negWeight	TokenNameIdentifier	 neg Weight
+	TokenNamePLUS	
epsilon	TokenNameIdentifier	 epsilon
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
log	TokenNameIdentifier	 log
.	TokenNameDOT	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
"split on "	TokenNameStringLiteral	split on 
+	TokenNamePLUS	
bestFeature	TokenNameIdentifier	 best Feature
+	TokenNamePLUS	
">"	TokenNameStringLiteral	>
+	TokenNamePLUS	
bestThreshold	TokenNameIdentifier	 best Threshold
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// split the data. No need to compress the examples again so 	TokenNameCOMMENT_LINE	split the data. No need to compress the examples again so 
// call the appropriate add method in Dataset. 	TokenNameCOMMENT_LINE	call the appropriate add method in Dataset. 
Dataset	TokenNameIdentifier	 Dataset
trueData	TokenNameIdentifier	 true Data
=	TokenNameEQUAL	
new	TokenNamenew	
BasicDataset	TokenNameIdentifier	 Basic Dataset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Dataset	TokenNameIdentifier	 Dataset
falseData	TokenNameIdentifier	 false Data
=	TokenNameEQUAL	
new	TokenNamenew	
BasicDataset	TokenNameIdentifier	 Basic Dataset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Example	TokenNameIdentifier	 Example
>	TokenNameGREATER	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
dataset	TokenNameIdentifier	 dataset
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
Example	TokenNameIdentifier	 Example
example	TokenNameIdentifier	 example
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
example	TokenNameIdentifier	 example
.	TokenNameDOT	
getWeight	TokenNameIdentifier	 get Weight
(	TokenNameLPAREN	
bestFeature	TokenNameIdentifier	 best Feature
)	TokenNameRPAREN	
>	TokenNameGREATER	
bestThreshold	TokenNameIdentifier	 best Threshold
)	TokenNameRPAREN	
{	TokenNameLBRACE	
trueData	TokenNameIdentifier	 true Data
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
example	TokenNameIdentifier	 example
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
falseData	TokenNameIdentifier	 false Data
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
example	TokenNameIdentifier	 example
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// recurse to build the subtrees 	TokenNameCOMMENT_LINE	recurse to build the subtrees 
DecisionTree	TokenNameIdentifier	 Decision Tree
trueBranch	TokenNameIdentifier	 true Branch
=	TokenNameEQUAL	
batchTrain	TokenNameIdentifier	 batch Train
(	TokenNameLPAREN	
trueData	TokenNameIdentifier	 true Data
,	TokenNameCOMMA	
depth	TokenNameIdentifier	 depth
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
DecisionTree	TokenNameIdentifier	 Decision Tree
falseBranch	TokenNameIdentifier	 false Branch
=	TokenNameEQUAL	
batchTrain	TokenNameIdentifier	 batch Train
(	TokenNameLPAREN	
falseData	TokenNameIdentifier	 false Data
,	TokenNameCOMMA	
depth	TokenNameIdentifier	 depth
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
DecisionTree	TokenNameIdentifier	 Decision Tree
.	TokenNameDOT	
InternalNode	TokenNameIdentifier	 Internal Node
(	TokenNameLPAREN	
bestFeature	TokenNameIdentifier	 best Feature
,	TokenNameCOMMA	
bestThreshold	TokenNameIdentifier	 best Threshold
,	TokenNameCOMMA	
trueBranch	TokenNameIdentifier	 true Branch
,	TokenNameCOMMA	
falseBranch	TokenNameIdentifier	 false Branch
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Track the number of pos/neg examples such that the value of this feature is * non-zero. */	TokenNameCOMMENT_JAVADOC	 Track the number of pos/neg examples such that the value of this feature is non-zero. 
private	TokenNameprivate	
class	TokenNameclass	
BinaryFeatureStats	TokenNameIdentifier	 Binary Feature Stats
{	TokenNameLBRACE	
private	TokenNameprivate	
double	TokenNamedouble	
pos	TokenNameIdentifier	 pos
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
neg	TokenNameIdentifier	 neg
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
BinaryFeatureStats	TokenNameIdentifier	 Binary Feature Stats
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// update stats for this example, assuming it's weight is nonzero 	TokenNameCOMMENT_LINE	update stats for this example, assuming it's weight is nonzero 
public	TokenNamepublic	
void	TokenNamevoid	
update	TokenNameIdentifier	 update
(	TokenNameLPAREN	
Example	TokenNameIdentifier	 Example
example	TokenNameIdentifier	 example
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
example	TokenNameIdentifier	 example
.	TokenNameDOT	
getLabel	TokenNameIdentifier	 get Label
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
numericLabel	TokenNameIdentifier	 numeric Label
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
pos	TokenNameIdentifier	 pos
+=	TokenNamePLUS_EQUAL	
example	TokenNameIdentifier	 example
.	TokenNameDOT	
getWeight	TokenNameIdentifier	 get Weight
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
neg	TokenNameIdentifier	 neg
+=	TokenNamePLUS_EQUAL	
example	TokenNameIdentifier	 example
.	TokenNameDOT	
getWeight	TokenNameIdentifier	 get Weight
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// value of splitting on this feature 	TokenNameCOMMENT_LINE	value of splitting on this feature 
public	TokenNamepublic	
double	TokenNamedouble	
value	TokenNameIdentifier	 value
(	TokenNameLPAREN	
double	TokenNamedouble	
totalPosWeight	TokenNameIdentifier	 total Pos Weight
,	TokenNameCOMMA	
double	TokenNamedouble	
totalNegWeight	TokenNameIdentifier	 total Neg Weight
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
schapireSingerValue	TokenNameIdentifier	 schapire Singer Value
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
,	TokenNameCOMMA	
neg	TokenNameIdentifier	 neg
,	TokenNameCOMMA	
totalPosWeight	TokenNameIdentifier	 total Pos Weight
,	TokenNameCOMMA	
totalNegWeight	TokenNameIdentifier	 total Neg Weight
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// return entropy(pos,neg,totalPosWeight,totalNegWeight); 	TokenNameCOMMENT_LINE	return entropy(pos,neg,totalPosWeight,totalNegWeight); 
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"[pos:"	TokenNameStringLiteral	[pos:
+	TokenNamePLUS	
pos	TokenNameIdentifier	 pos
+	TokenNamePLUS	
" neg:"	TokenNameStringLiteral	 neg:
+	TokenNamePLUS	
neg	TokenNameIdentifier	 neg
+	TokenNamePLUS	
"]"	TokenNameStringLiteral	]
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Track the pos/neg examples such that the value of this feature is non-zero, * together with the associated feature weight for these examples. */	TokenNameCOMMENT_JAVADOC	 Track the pos/neg examples such that the value of this feature is non-zero, together with the associated feature weight for these examples. 
private	TokenNameprivate	
class	TokenNameclass	
NumericFeatureStats	TokenNameIdentifier	 Numeric Feature Stats
{	TokenNameLBRACE	
// maps feature values to BinaryFeatureStats for examples with exactly that 	TokenNameCOMMENT_LINE	maps feature values to BinaryFeatureStats for examples with exactly that 
// value 	TokenNameCOMMENT_LINE	value 
private	TokenNameprivate	
TreeMap	TokenNameIdentifier	 Tree Map
<	TokenNameLESS	
Double	TokenNameIdentifier	 Double
,	TokenNameCOMMA	
BinaryFeatureStats	TokenNameIdentifier	 Binary Feature Stats
>	TokenNameGREATER	
map	TokenNameIdentifier	 map
;	TokenNameSEMICOLON	
// total pos, neg weight of examples with non-zero weights 	TokenNameCOMMENT_LINE	total pos, neg weight of examples with non-zero weights 
private	TokenNameprivate	
double	TokenNamedouble	
posNonZero	TokenNameIdentifier	 pos Non Zero
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
double	TokenNamedouble	
negNonZero	TokenNameIdentifier	 neg Non Zero
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
double	TokenNamedouble	
bestThreshold	TokenNameIdentifier	 best Threshold
;	TokenNameSEMICOLON	
private	TokenNameprivate	
double	TokenNamedouble	
bestThresholdValue	TokenNameIdentifier	 best Threshold Value
;	TokenNameSEMICOLON	
public	TokenNamepublic	
NumericFeatureStats	TokenNameIdentifier	 Numeric Feature Stats
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
map	TokenNameIdentifier	 map
=	TokenNameEQUAL	
new	TokenNamenew	
TreeMap	TokenNameIdentifier	 Tree Map
<	TokenNameLESS	
Double	TokenNameIdentifier	 Double
,	TokenNameCOMMA	
BinaryFeatureStats	TokenNameIdentifier	 Binary Feature Stats
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// update stats for this example 	TokenNameCOMMENT_LINE	update stats for this example 
public	TokenNamepublic	
void	TokenNamevoid	
update	TokenNameIdentifier	 update
(	TokenNameLPAREN	
Example	TokenNameIdentifier	 Example
example	TokenNameIdentifier	 example
,	TokenNameCOMMA	
double	TokenNamedouble	
featureWeight	TokenNameIdentifier	 feature Weight
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Double	TokenNameIdentifier	 Double
key	TokenNameIdentifier	 key
=	TokenNameEQUAL	
new	TokenNamenew	
Double	TokenNameIdentifier	 Double
(	TokenNameLPAREN	
featureWeight	TokenNameIdentifier	 feature Weight
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
BinaryFeatureStats	TokenNameIdentifier	 Binary Feature Stats
bfs	TokenNameIdentifier	 bfs
=	TokenNameEQUAL	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
bfs	TokenNameIdentifier	 bfs
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
bfs	TokenNameIdentifier	 bfs
=	TokenNameEQUAL	
new	TokenNamenew	
BinaryFeatureStats	TokenNameIdentifier	 Binary Feature Stats
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bfs	TokenNameIdentifier	 bfs
.	TokenNameDOT	
update	TokenNameIdentifier	 update
(	TokenNameLPAREN	
example	TokenNameIdentifier	 example
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
example	TokenNameIdentifier	 example
.	TokenNameDOT	
getLabel	TokenNameIdentifier	 get Label
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
numericLabel	TokenNameIdentifier	 numeric Label
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
posNonZero	TokenNameIdentifier	 pos Non Zero
+=	TokenNamePLUS_EQUAL	
example	TokenNameIdentifier	 example
.	TokenNameDOT	
getWeight	TokenNameIdentifier	 get Weight
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
negNonZero	TokenNameIdentifier	 neg Non Zero
+=	TokenNamePLUS_EQUAL	
example	TokenNameIdentifier	 example
.	TokenNameDOT	
getWeight	TokenNameIdentifier	 get Weight
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// value of this split, optimized over all thresholds 	TokenNameCOMMENT_LINE	value of this split, optimized over all thresholds 
public	TokenNamepublic	
double	TokenNamedouble	
value	TokenNameIdentifier	 value
(	TokenNameLPAREN	
double	TokenNamedouble	
totalPosWeight	TokenNameIdentifier	 total Pos Weight
,	TokenNameCOMMA	
double	TokenNamedouble	
totalNegWeight	TokenNameIdentifier	 total Neg Weight
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// insert keys for the zero-weight case, if needed 	TokenNameCOMMENT_LINE	insert keys for the zero-weight case, if needed 
if	TokenNameif	
(	TokenNameLPAREN	
totalPosWeight	TokenNameIdentifier	 total Pos Weight
+	TokenNamePLUS	
totalPosWeight	TokenNameIdentifier	 total Pos Weight
>	TokenNameGREATER	
posNonZero	TokenNameIdentifier	 pos Non Zero
+	TokenNamePLUS	
negNonZero	TokenNameIdentifier	 neg Non Zero
)	TokenNameRPAREN	
{	TokenNameLBRACE	
BinaryFeatureStats	TokenNameIdentifier	 Binary Feature Stats
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
new	TokenNamenew	
BinaryFeatureStats	TokenNameIdentifier	 Binary Feature Stats
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
pos	TokenNameIdentifier	 pos
=	TokenNameEQUAL	
totalPosWeight	TokenNameIdentifier	 total Pos Weight
-	TokenNameMINUS	
posNonZero	TokenNameIdentifier	 pos Non Zero
;	TokenNameSEMICOLON	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
neg	TokenNameIdentifier	 neg
=	TokenNameEQUAL	
totalNegWeight	TokenNameIdentifier	 total Neg Weight
-	TokenNameMINUS	
negNonZero	TokenNameIdentifier	 neg Non Zero
;	TokenNameSEMICOLON	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
Double	TokenNameIdentifier	 Double
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Double	TokenNameIdentifier	 Double
lastKey	TokenNameIdentifier	 last Key
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// incrementally track weight of pos,neg examples less than/greater than 	TokenNameCOMMENT_LINE	incrementally track weight of pos,neg examples less than/greater than 
// the threshold 	TokenNameCOMMENT_LINE	the threshold 
double	TokenNamedouble	
posGT	TokenNameIdentifier	 pos GT
=	TokenNameEQUAL	
totalPosWeight	TokenNameIdentifier	 total Pos Weight
;	TokenNameSEMICOLON	
double	TokenNamedouble	
negGT	TokenNameIdentifier	 neg GT
=	TokenNameEQUAL	
totalNegWeight	TokenNameIdentifier	 total Neg Weight
;	TokenNameSEMICOLON	
bestThresholdValue	TokenNameIdentifier	 best Threshold Value
=	TokenNameEQUAL	
Double	TokenNameIdentifier	 Double
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Double	TokenNameIdentifier	 Double
>	TokenNameGREATER	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
map	TokenNameIdentifier	 map
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
Double	TokenNameIdentifier	 Double
key	TokenNameIdentifier	 key
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
threshold	TokenNameIdentifier	 threshold
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// initialize to something lt zero 	TokenNameCOMMENT_LINE	initialize to something lt zero 
if	TokenNameif	
(	TokenNameLPAREN	
lastKey	TokenNameIdentifier	 last Key
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// the threshold is half-way between this value and the previous value 	TokenNameCOMMENT_LINE	the threshold is half-way between this value and the previous value 
// note that it will be vacuous the first time around 	TokenNameCOMMENT_LINE	note that it will be vacuous the first time around 
threshold	TokenNameIdentifier	 threshold
=	TokenNameEQUAL	
lastKey	TokenNameIdentifier	 last Key
.	TokenNameDOT	
doubleValue	TokenNameIdentifier	 double Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
0.5	TokenNameDoubleLiteral	
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
.	TokenNameDOT	
doubleValue	TokenNameIdentifier	 double Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
lastKey	TokenNameIdentifier	 last Key
.	TokenNameDOT	
doubleValue	TokenNameIdentifier	 double Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
schapireSingerValue	TokenNameIdentifier	 schapire Singer Value
(	TokenNameLPAREN	
posGT	TokenNameIdentifier	 pos GT
,	TokenNameCOMMA	
negGT	TokenNameIdentifier	 neg GT
,	TokenNameCOMMA	
totalPosWeight	TokenNameIdentifier	 total Pos Weight
,	TokenNameCOMMA	
totalNegWeight	TokenNameIdentifier	 total Neg Weight
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// double value = entropy( posGT, negGT, totalPosWeight, 	TokenNameCOMMENT_LINE	double value = entropy( posGT, negGT, totalPosWeight, 
// totalNegWeight ); 	TokenNameCOMMENT_LINE	totalNegWeight ); 
// if(DEBUG)log.debug("last:"+lastKey+" key:"+key+" th:"+threshold+" 	TokenNameCOMMENT_LINE	if(DEBUG)log.debug("last:"+lastKey+" key:"+key+" th:"+threshold+" 
// p:"+posGT+" n:"+negGT+" v:"+value); 	TokenNameCOMMENT_LINE	p:"+posGT+" n:"+negGT+" v:"+value); 
if	TokenNameif	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
<	TokenNameLESS	
bestThresholdValue	TokenNameIdentifier	 best Threshold Value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
bestThreshold	TokenNameIdentifier	 best Threshold
=	TokenNameEQUAL	
threshold	TokenNameIdentifier	 threshold
;	TokenNameSEMICOLON	
bestThresholdValue	TokenNameIdentifier	 best Threshold Value
=	TokenNameEQUAL	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
lastKey	TokenNameIdentifier	 last Key
=	TokenNameEQUAL	
key	TokenNameIdentifier	 key
;	TokenNameSEMICOLON	
// update counts 	TokenNameCOMMENT_LINE	update counts 
BinaryFeatureStats	TokenNameIdentifier	 Binary Feature Stats
bfs	TokenNameIdentifier	 bfs
=	TokenNameEQUAL	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
posGT	TokenNameIdentifier	 pos GT
-=	TokenNameMINUS_EQUAL	
bfs	TokenNameIdentifier	 bfs
.	TokenNameDOT	
pos	TokenNameIdentifier	 pos
;	TokenNameSEMICOLON	
negGT	TokenNameIdentifier	 neg GT
-=	TokenNameMINUS_EQUAL	
bfs	TokenNameIdentifier	 bfs
.	TokenNameDOT	
neg	TokenNameIdentifier	 neg
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
bestThresholdValue	TokenNameIdentifier	 best Threshold Value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// threshold that gives the optimized value 	TokenNameCOMMENT_LINE	threshold that gives the optimized value 
double	TokenNamedouble	
getBestThreshold	TokenNameIdentifier	 get Best Threshold
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
bestThreshold	TokenNameIdentifier	 best Threshold
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"[pos: "	TokenNameStringLiteral	[pos: 
+	TokenNamePLUS	
posNonZero	TokenNameIdentifier	 pos Non Zero
+	TokenNamePLUS	
" neg: "	TokenNameStringLiteral	 neg: 
+	TokenNamePLUS	
negNonZero	TokenNameIdentifier	 neg Non Zero
+	TokenNamePLUS	
" map: "	TokenNameStringLiteral	 map: 
+	TokenNamePLUS	
map	TokenNameIdentifier	 map
+	TokenNamePLUS	
"]"	TokenNameStringLiteral	]
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
double	TokenNamedouble	
schapireSingerValue	TokenNameIdentifier	 schapire Singer Value
(	TokenNameLPAREN	
double	TokenNamedouble	
pos	TokenNameIdentifier	 pos
,	TokenNameCOMMA	
double	TokenNamedouble	
neg	TokenNameIdentifier	 neg
,	TokenNameCOMMA	
double	TokenNamedouble	
totalPos	TokenNameIdentifier	 total Pos
,	TokenNameCOMMA	
double	TokenNamedouble	
totalNeg	TokenNameIdentifier	 total Neg
)	TokenNameRPAREN	
{	TokenNameLBRACE	
double	TokenNamedouble	
totalWeight	TokenNameIdentifier	 total Weight
=	TokenNameEQUAL	
totalPos	TokenNameIdentifier	 total Pos
+	TokenNamePLUS	
totalNeg	TokenNameIdentifier	 total Neg
;	TokenNameSEMICOLON	
// wpj = S&S's W_+^j, wnj = W_-^j, for j=0,1 	TokenNameCOMMENT_LINE	wpj = S&S's W_+^j, wnj = W_-^j, for j=0,1 
// block j=1 is condition true (pos,neg weights) 	TokenNameCOMMENT_LINE	block j=1 is condition true (pos,neg weights) 
// block j=0 is condition false (totalPos-pos,totalNeg-neg weights) 	TokenNameCOMMENT_LINE	block j=0 is condition false (totalPos-pos,totalNeg-neg weights) 
// W_+ is positive class (pos,totalPos-pos), W_- is negative 	TokenNameCOMMENT_LINE	W_+ is positive class (pos,totalPos-pos), W_- is negative 
double	TokenNamedouble	
wp1	TokenNameIdentifier	 wp1
=	TokenNameEQUAL	
pos	TokenNameIdentifier	 pos
/	TokenNameDIVIDE	
totalWeight	TokenNameIdentifier	 total Weight
;	TokenNameSEMICOLON	
double	TokenNamedouble	
wp0	TokenNameIdentifier	 wp0
=	TokenNameEQUAL	
(	TokenNameLPAREN	
totalPos	TokenNameIdentifier	 total Pos
-	TokenNameMINUS	
pos	TokenNameIdentifier	 pos
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
totalWeight	TokenNameIdentifier	 total Weight
;	TokenNameSEMICOLON	
double	TokenNamedouble	
wn1	TokenNameIdentifier	 wn1
=	TokenNameEQUAL	
neg	TokenNameIdentifier	 neg
/	TokenNameDIVIDE	
totalWeight	TokenNameIdentifier	 total Weight
;	TokenNameSEMICOLON	
double	TokenNamedouble	
wn0	TokenNameIdentifier	 wn0
=	TokenNameEQUAL	
(	TokenNameLPAREN	
totalNeg	TokenNameIdentifier	 total Neg
-	TokenNameMINUS	
neg	TokenNameIdentifier	 neg
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
totalWeight	TokenNameIdentifier	 total Weight
;	TokenNameSEMICOLON	
log	TokenNameIdentifier	 log
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"pos, neg, total = "	TokenNameStringLiteral	pos, neg, total = 
+	TokenNamePLUS	
pos	TokenNameIdentifier	 pos
+	TokenNamePLUS	
", "	TokenNameStringLiteral	, 
+	TokenNamePLUS	
neg	TokenNameIdentifier	 neg
+	TokenNamePLUS	
", "	TokenNameStringLiteral	, 
+	TokenNamePLUS	
totalWeight	TokenNameIdentifier	 total Weight
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
log	TokenNameIdentifier	 log
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"wp1,wp0,wn1,wn0 = "	TokenNameStringLiteral	wp1,wp0,wn1,wn0 = 
+	TokenNamePLUS	
wp1	TokenNameIdentifier	 wp1
+	TokenNamePLUS	
","	TokenNameStringLiteral	,
+	TokenNamePLUS	
wp0	TokenNameIdentifier	 wp0
+	TokenNamePLUS	
","	TokenNameStringLiteral	,
+	TokenNamePLUS	
wn1	TokenNameIdentifier	 wn1
+	TokenNamePLUS	
","	TokenNameStringLiteral	,
+	TokenNamePLUS	
wn0	TokenNameIdentifier	 wn0
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
2	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
sqrt	TokenNameIdentifier	 sqrt
(	TokenNameLPAREN	
wp1	TokenNameIdentifier	 wp1
*	TokenNameMULTIPLY	
wn1	TokenNameIdentifier	 wn1
)	TokenNameRPAREN	
+	TokenNamePLUS	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
sqrt	TokenNameIdentifier	 sqrt
(	TokenNameLPAREN	
wp0	TokenNameIdentifier	 wp0
*	TokenNameMULTIPLY	
wn0	TokenNameIdentifier	 wn0
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// private static double entropy(double pos,double neg,double totalPos, 	TokenNameCOMMENT_LINE	private static double entropy(double pos,double neg,double totalPos, 
// double totalNeg){ 	TokenNameCOMMENT_LINE	double totalNeg){ 
// // wij = feature=i,class=j 	TokenNameCOMMENT_LINE	// wij = feature=i,class=j 
// double tot=totalPos+totalNeg; 	TokenNameCOMMENT_LINE	double tot=totalPos+totalNeg; 
// double epsilon=0.1/tot; 	TokenNameCOMMENT_LINE	double epsilon=0.1/tot; 
// double w11=pos/tot+epsilon; 	TokenNameCOMMENT_LINE	double w11=pos/tot+epsilon; 
// double w10=neg/tot+epsilon; 	TokenNameCOMMENT_LINE	double w10=neg/tot+epsilon; 
// double w01=(tot-pos)/tot+epsilon; 	TokenNameCOMMENT_LINE	double w01=(tot-pos)/tot+epsilon; 
// double w00=(tot-neg)/tot+epsilon; 	TokenNameCOMMENT_LINE	double w00=(tot-neg)/tot+epsilon; 
// log.debug("pos, neg, total = "+pos+", "+neg+", "+tot); 	TokenNameCOMMENT_LINE	log.debug("pos, neg, total = "+pos+", "+neg+", "+tot); 
// log.debug("w11,w10,w01,w00 = "+w11+","+w10+","+w01+","+w00); 	TokenNameCOMMENT_LINE	log.debug("w11,w10,w01,w00 = "+w11+","+w10+","+w01+","+w00); 
// // return 2 * ( Math.sqrt((wp1)*(wp0)) + Math.sqrt((wn1)*(wn0)) ); 	TokenNameCOMMENT_LINE	// return 2 * ( Math.sqrt((wp1)*(wp0)) + Math.sqrt((wn1)*(wn0)) ); 
// return -w11*Math.log(w11)-w10*Math.log(w10)-w01*Math.log(w01)-w00* 	TokenNameCOMMENT_LINE	return -w11*Math.log(w11)-w10*Math.log(w10)-w01*Math.log(w01)-w00* 
// Math.log(w00); 	TokenNameCOMMENT_LINE	Math.log(w00); 
// } 	TokenNameCOMMENT_LINE	} 
}	TokenNameRBRACE	
