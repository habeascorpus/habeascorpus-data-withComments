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
HashMap	TokenNameIdentifier	 Hash Map
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
Random	TokenNameIdentifier	 Random
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
TreeMap	TokenNameIdentifier	 Tree Map
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Vector	TokenNameIdentifier	 Vector
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
/** Implements a fast version of the simplest RandomTree learner possible. Avoids memory allocation * wheverever possible, with resulting speed up of about 30% * * @author Alexander Friedman */	TokenNameCOMMENT_JAVADOC	 Implements a fast version of the simplest RandomTree learner possible. Avoids memory allocation wheverever possible, with resulting speed up of about 30% * @author Alexander Friedman 
public	TokenNamepublic	
class	TokenNameclass	
FastRandomTreeLearner	TokenNameIdentifier	 Fast Random Tree Learner
extends	TokenNameextends	
RandomTreeLearner	TokenNameIdentifier	 Random Tree Learner
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
FastRandomTreeLearner	TokenNameIdentifier	 Fast Random Tree Learner
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// private double epsilon=0.001; 	TokenNameCOMMENT_LINE	private double epsilon=0.001; 
private	TokenNameprivate	
Random	TokenNameIdentifier	 Random
rand	TokenNameIdentifier	 rand
;	TokenNameSEMICOLON	
// How many random vars to check for a split 	TokenNameCOMMENT_LINE	How many random vars to check for a split 
public	TokenNamepublic	
int	TokenNameint	
subsetSize	TokenNameIdentifier	 subset Size
;	TokenNameSEMICOLON	
public	TokenNamepublic	
FastRandomTreeLearner	TokenNameIdentifier	 Fast Random Tree Learner
setRandomSeed	TokenNameIdentifier	 set Random Seed
(	TokenNameLPAREN	
long	TokenNamelong	
seed	TokenNameIdentifier	 seed
)	TokenNameRPAREN	
{	TokenNameLBRACE	
rand	TokenNameIdentifier	 rand
=	TokenNameEQUAL	
new	TokenNamenew	
Random	TokenNameIdentifier	 Random
(	TokenNameLPAREN	
seed	TokenNameIdentifier	 seed
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
FastRandomTreeLearner	TokenNameIdentifier	 Fast Random Tree Learner
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
rand	TokenNameIdentifier	 rand
=	TokenNameEQUAL	
new	TokenNamenew	
Random	TokenNameIdentifier	 Random
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
FastRandomTreeLearner	TokenNameIdentifier	 Fast Random Tree Learner
setSubsetSize	TokenNameIdentifier	 set Subset Size
(	TokenNameLPAREN	
int	TokenNameint	
subsetSize	TokenNameIdentifier	 subset Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
subsetSize	TokenNameIdentifier	 subset Size
=	TokenNameEQUAL	
subsetSize	TokenNameIdentifier	 subset Size
;	TokenNameSEMICOLON	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
Classifier	TokenNameIdentifier	 Classifier
batchTrain	TokenNameIdentifier	 batch Train
(	TokenNameLPAREN	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Example	TokenNameIdentifier	 Example
>	TokenNameGREATER	
dataset	TokenNameIdentifier	 dataset
,	TokenNameCOMMA	
Vector	TokenNameIdentifier	 Vector
<	TokenNameLESS	
Feature	TokenNameIdentifier	 Feature
>	TokenNameGREATER	
allFeatures	TokenNameIdentifier	 all Features
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// COPIED FROM DecisionTreeLearner 	TokenNameCOMMENT_LINE	COPIED FROM DecisionTreeLearner 
// epsilon=0.5/dataset.size(); 	TokenNameCOMMENT_LINE	epsilon=0.5/dataset.size(); 
Classifier	TokenNameIdentifier	 Classifier
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
batchTrain	TokenNameIdentifier	 batch Train
(	TokenNameLPAREN	
new	TokenNamenew	
Vector	TokenNameIdentifier	 Vector
<	TokenNameLESS	
Example	TokenNameIdentifier	 Example
>	TokenNameGREATER	
(	TokenNameLPAREN	
dataset	TokenNameIdentifier	 dataset
)	TokenNameRPAREN	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
allFeatures	TokenNameIdentifier	 all Features
,	TokenNameCOMMA	
allFeatures	TokenNameIdentifier	 all Features
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
dataset	TokenNameIdentifier	 dataset
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Example	TokenNameIdentifier	 Example
>	TokenNameGREATER	
newData	TokenNameIdentifier	 new Data
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
dataset	TokenNameIdentifier	 dataset
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
newData	TokenNameIdentifier	 new Data
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
}	TokenNameRBRACE	
return	TokenNamereturn	
batchTrain	TokenNameIdentifier	 batch Train
(	TokenNameLPAREN	
newData	TokenNameIdentifier	 new Data
,	TokenNameCOMMA	
RandomForests	TokenNameIdentifier	 Random Forests
.	TokenNameDOT	
getDatasetFeatures	TokenNameIdentifier	 get Dataset Features
(	TokenNameLPAREN	
dataset	TokenNameIdentifier	 dataset
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Classifier	TokenNameIdentifier	 Classifier
batchTrain	TokenNameIdentifier	 batch Train
(	TokenNameLPAREN	
Vector	TokenNameIdentifier	 Vector
<	TokenNameLESS	
Example	TokenNameIdentifier	 Example
>	TokenNameGREATER	
dataset	TokenNameIdentifier	 dataset
,	TokenNameCOMMA	
int	TokenNameint	
depth	TokenNameIdentifier	 depth
,	TokenNameCOMMA	
Vector	TokenNameIdentifier	 Vector
<	TokenNameLESS	
Feature	TokenNameIdentifier	 Feature
>	TokenNameGREATER	
unusedFeatures	TokenNameIdentifier	 unused Features
,	TokenNameCOMMA	
int	TokenNameint	
lastFeature	TokenNameIdentifier	 last Feature
,	TokenNameCOMMA	
int	TokenNameint	
from	TokenNameIdentifier	 from
,	TokenNameCOMMA	
int	TokenNameint	
to	TokenNameIdentifier	 to
)	TokenNameRPAREN	
{	TokenNameLBRACE	
CompactDecisionTree	TokenNameIdentifier	 Compact Decision Tree
tree	TokenNameIdentifier	 tree
=	TokenNameEQUAL	
new	TokenNamenew	
CompactDecisionTree	TokenNameIdentifier	 Compact Decision Tree
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tree	TokenNameIdentifier	 tree
.	TokenNameDOT	
setRoot	TokenNameIdentifier	 set Root
(	TokenNameLPAREN	
batchTrain	TokenNameIdentifier	 batch Train
(	TokenNameLPAREN	
dataset	TokenNameIdentifier	 dataset
,	TokenNameCOMMA	
depth	TokenNameIdentifier	 depth
,	TokenNameCOMMA	
unusedFeatures	TokenNameIdentifier	 unused Features
,	TokenNameCOMMA	
lastFeature	TokenNameIdentifier	 last Feature
,	TokenNameCOMMA	
from	TokenNameIdentifier	 from
,	TokenNameCOMMA	
to	TokenNameIdentifier	 to
,	TokenNameCOMMA	
tree	TokenNameIdentifier	 tree
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tree	TokenNameIdentifier	 tree
.	TokenNameDOT	
compactStorage	TokenNameIdentifier	 compact Storage
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
tree	TokenNameIdentifier	 tree
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getSplit	TokenNameIdentifier	 get Split
(	TokenNameLPAREN	
Vector	TokenNameIdentifier	 Vector
<	TokenNameLESS	
Example	TokenNameIdentifier	 Example
>	TokenNameGREATER	
dataset	TokenNameIdentifier	 dataset
,	TokenNameCOMMA	
int	TokenNameint	
from	TokenNameIdentifier	 from
,	TokenNameCOMMA	
int	TokenNameint	
to	TokenNameIdentifier	 to
,	TokenNameCOMMA	
Vector	TokenNameIdentifier	 Vector
<	TokenNameLESS	
Feature	TokenNameIdentifier	 Feature
>	TokenNameGREATER	
unusedFeatures	TokenNameIdentifier	 unused Features
,	TokenNameCOMMA	
int	TokenNameint	
lastFeature	TokenNameIdentifier	 last Feature
,	TokenNameCOMMA	
double	TokenNamedouble	
posWeight	TokenNameIdentifier	 pos Weight
,	TokenNameCOMMA	
double	TokenNamedouble	
negWeight	TokenNameIdentifier	 neg Weight
)	TokenNameRPAREN	
{	TokenNameLBRACE	
HashMap	TokenNameIdentifier	 Hash Map
<	TokenNameLESS	
Feature	TokenNameIdentifier	 Feature
,	TokenNameCOMMA	
Integer	TokenNameIdentifier	 Integer
>	TokenNameGREATER	
features	TokenNameIdentifier	 features
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
<	TokenNameLESS	
Feature	TokenNameIdentifier	 Feature
,	TokenNameCOMMA	
Integer	TokenNameIdentifier	 Integer
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
HashMap	TokenNameIdentifier	 Hash Map
<	TokenNameLESS	
Feature	TokenNameIdentifier	 Feature
,	TokenNameCOMMA	
NumericFeatureStats	TokenNameIdentifier	 Numeric Feature Stats
>	TokenNameGREATER	
stats	TokenNameIdentifier	 stats
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
<	TokenNameLESS	
Feature	TokenNameIdentifier	 Feature
,	TokenNameCOMMA	
NumericFeatureStats	TokenNameIdentifier	 Numeric Feature Stats
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Choose some features 	TokenNameCOMMENT_LINE	Choose some features 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
subsetSize	TokenNameIdentifier	 subset Size
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
featureIndex	TokenNameIdentifier	 feature Index
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
floor	TokenNameIdentifier	 floor
(	TokenNameLPAREN	
rand	TokenNameIdentifier	 rand
.	TokenNameDOT	
nextDouble	TokenNameIdentifier	 next Double
(	TokenNameLPAREN	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
lastFeature	TokenNameIdentifier	 last Feature
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Feature	TokenNameIdentifier	 Feature
f	TokenNameIdentifier	 f
=	TokenNameEQUAL	
unusedFeatures	TokenNameIdentifier	 unused Features
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
featureIndex	TokenNameIdentifier	 feature Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
features	TokenNameIdentifier	 features
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
,	TokenNameCOMMA	
featureIndex	TokenNameIdentifier	 feature Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
stats	TokenNameIdentifier	 stats
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
,	TokenNameCOMMA	
new	TokenNamenew	
NumericFeatureStats	TokenNameIdentifier	 Numeric Feature Stats
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// update the feature stats 	TokenNameCOMMENT_LINE	update the feature stats 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
from	TokenNameIdentifier	 from
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
to	TokenNameIdentifier	 to
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Example	TokenNameIdentifier	 Example
example	TokenNameIdentifier	 example
=	TokenNameEQUAL	
dataset	TokenNameIdentifier	 dataset
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Feature	TokenNameIdentifier	 Feature
f	TokenNameIdentifier	 f
:	TokenNameCOLON	
features	TokenNameIdentifier	 features
.	TokenNameDOT	
keySet	TokenNameIdentifier	 key Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
NumericFeatureStats	TokenNameIdentifier	 Numeric Feature Stats
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
stats	TokenNameIdentifier	 stats
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
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
int	TokenNameint	
bestFeatureIndex	TokenNameIdentifier	 best Feature Index
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Feature	TokenNameIdentifier	 Feature
f	TokenNameIdentifier	 f
:	TokenNameCOLON	
features	TokenNameIdentifier	 features
.	TokenNameDOT	
keySet	TokenNameIdentifier	 key Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
NumericFeatureStats	TokenNameIdentifier	 Numeric Feature Stats
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
stats	TokenNameIdentifier	 stats
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
posWeight	TokenNameIdentifier	 pos Weight
,	TokenNameCOMMA	
negWeight	TokenNameIdentifier	 neg Weight
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
bestFeatureIndex	TokenNameIdentifier	 best Feature Index
=	TokenNameEQUAL	
features	TokenNameIdentifier	 features
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// just pick any feature - it will be thrown out if it doesn't split the tree 	TokenNameCOMMENT_LINE	just pick any feature - it will be thrown out if it doesn't split the tree 
if	TokenNameif	
(	TokenNameLPAREN	
bestFeature	TokenNameIdentifier	 best Feature
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
bestFeature	TokenNameIdentifier	 best Feature
=	TokenNameEQUAL	
features	TokenNameIdentifier	 features
.	TokenNameDOT	
keySet	TokenNameIdentifier	 key Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bestFeatureIndex	TokenNameIdentifier	 best Feature Index
=	TokenNameEQUAL	
features	TokenNameIdentifier	 features
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
bestFeature	TokenNameIdentifier	 best Feature
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
bestFeatureIndex	TokenNameIdentifier	 best Feature Index
,	TokenNameCOMMA	
bestThreshold	TokenNameIdentifier	 best Threshold
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// private static int maxDepth=0; 	TokenNameCOMMENT_LINE	private static int maxDepth=0; 
// 	TokenNameCOMMENT_LINE	 
// private void check_depth(int depth){ 	TokenNameCOMMENT_LINE	private void check_depth(int depth){ 
// if(depth>maxDepth){ 	TokenNameCOMMENT_LINE	if(depth>maxDepth){ 
// maxDepth++; 	TokenNameCOMMENT_LINE	maxDepth++; 
// log.warn("Max depth now: "+maxDepth); 	TokenNameCOMMENT_LINE	log.warn("Max depth now: "+maxDepth); 
// } 	TokenNameCOMMENT_LINE	} 
// } 	TokenNameCOMMENT_LINE	} 
// return the index of the node created 	TokenNameCOMMENT_LINE	return the index of the node created 
public	TokenNamepublic	
int	TokenNameint	
batchTrain	TokenNameIdentifier	 batch Train
(	TokenNameLPAREN	
Vector	TokenNameIdentifier	 Vector
<	TokenNameLESS	
Example	TokenNameIdentifier	 Example
>	TokenNameGREATER	
dataset	TokenNameIdentifier	 dataset
,	TokenNameCOMMA	
int	TokenNameint	
depth	TokenNameIdentifier	 depth
,	TokenNameCOMMA	
Vector	TokenNameIdentifier	 Vector
<	TokenNameLESS	
Feature	TokenNameIdentifier	 Feature
>	TokenNameGREATER	
unusedFeatures	TokenNameIdentifier	 unused Features
,	TokenNameCOMMA	
int	TokenNameint	
lastFeature	TokenNameIdentifier	 last Feature
,	TokenNameCOMMA	
int	TokenNameint	
from	TokenNameIdentifier	 from
,	TokenNameCOMMA	
int	TokenNameint	
to	TokenNameIdentifier	 to
,	TokenNameCOMMA	
CompactDecisionTree	TokenNameIdentifier	 Compact Decision Tree
tree	TokenNameIdentifier	 tree
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// check_depth(depth); 	TokenNameCOMMENT_LINE	check_depth(depth); 
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
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
from	TokenNameIdentifier	 from
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
to	TokenNameIdentifier	 to
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Example	TokenNameIdentifier	 Example
example	TokenNameIdentifier	 example
=	TokenNameEQUAL	
dataset	TokenNameIdentifier	 dataset
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
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
// We want our votes to be weighted, so lets try this instead: 	TokenNameCOMMENT_LINE	We want our votes to be weighted, so lets try this instead: 
// if (posWeight > negWeight) weight = posWeight; 	TokenNameCOMMENT_LINE	if (posWeight > negWeight) weight = posWeight; 
// else weight = - negWeight; 	TokenNameCOMMENT_LINE	else weight = - negWeight; 
double	TokenNamedouble	
weight	TokenNameIdentifier	 weight
=	TokenNameEQUAL	
posWeight	TokenNameIdentifier	 pos Weight
-	TokenNameMINUS	
negWeight	TokenNameIdentifier	 neg Weight
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
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
||	TokenNameOR_OR	
lastFeature	TokenNameIdentifier	 last Feature
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
depth	TokenNameIdentifier	 depth
>	TokenNameGREATER	
500	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
tree	TokenNameIdentifier	 tree
.	TokenNameDOT	
addLeafNode	TokenNameIdentifier	 add Leaf Node
(	TokenNameLPAREN	
weight	TokenNameIdentifier	 weight
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// return tree.addLeafNode( 0.5 * Math.log( (posWeight+epsilon)/(negWeight+epsilon))); 	TokenNameCOMMENT_LINE	return tree.addLeafNode( 0.5 * Math.log( (posWeight+epsilon)/(negWeight+epsilon))); 
// return tree.addLeafNode(Math.log( (posWeight+epsilon)/(negWeight+epsilon))); 	TokenNameCOMMENT_LINE	return tree.addLeafNode(Math.log( (posWeight+epsilon)/(negWeight+epsilon))); 
}	TokenNameRBRACE	
Object	TokenNameIdentifier	 Object
result	TokenNameIdentifier	 result
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
getSplit	TokenNameIdentifier	 get Split
(	TokenNameLPAREN	
dataset	TokenNameIdentifier	 dataset
,	TokenNameCOMMA	
from	TokenNameIdentifier	 from
,	TokenNameCOMMA	
to	TokenNameIdentifier	 to
,	TokenNameCOMMA	
unusedFeatures	TokenNameIdentifier	 unused Features
,	TokenNameCOMMA	
lastFeature	TokenNameIdentifier	 last Feature
,	TokenNameCOMMA	
posWeight	TokenNameIdentifier	 pos Weight
,	TokenNameCOMMA	
negWeight	TokenNameIdentifier	 neg Weight
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
featureIndex	TokenNameIdentifier	 feature Index
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Integer	TokenNameIdentifier	 Integer
)	TokenNameRPAREN	
result	TokenNameIdentifier	 result
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
bestThreshold	TokenNameIdentifier	 best Threshold
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Double	TokenNameIdentifier	 Double
)	TokenNameRPAREN	
result	TokenNameIdentifier	 result
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
Feature	TokenNameIdentifier	 Feature
bestFeature	TokenNameIdentifier	 best Feature
=	TokenNameEQUAL	
unusedFeatures	TokenNameIdentifier	 unused Features
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
featureIndex	TokenNameIdentifier	 feature Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
depth	TokenNameIdentifier	 depth
>	TokenNameGREATER	
1000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
log	TokenNameIdentifier	 log
.	TokenNameDOT	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
"Pos Weight: "	TokenNameStringLiteral	Pos Weight: 
+	TokenNamePLUS	
posWeight	TokenNameIdentifier	 pos Weight
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
log	TokenNameIdentifier	 log
.	TokenNameDOT	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
"Neg Weight: "	TokenNameStringLiteral	Neg Weight: 
+	TokenNamePLUS	
negWeight	TokenNameIdentifier	 neg Weight
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
log	TokenNameIdentifier	 log
.	TokenNameDOT	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
"last Feature: "	TokenNameStringLiteral	last Feature: 
+	TokenNamePLUS	
lastFeature	TokenNameIdentifier	 last Feature
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
log	TokenNameIdentifier	 log
.	TokenNameDOT	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
"from: "	TokenNameStringLiteral	from: 
+	TokenNamePLUS	
from	TokenNameIdentifier	 from
+	TokenNamePLUS	
", to: "	TokenNameStringLiteral	, to: 
+	TokenNamePLUS	
to	TokenNameIdentifier	 to
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
log	TokenNameIdentifier	 log
.	TokenNameDOT	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
"split on: "	TokenNameStringLiteral	split on: 
+	TokenNamePLUS	
bestFeature	TokenNameIdentifier	 best Feature
+	TokenNamePLUS	
" with threshold "	TokenNameStringLiteral	 with threshold 
+	TokenNamePLUS	
bestThreshold	TokenNameIdentifier	 best Threshold
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Sort the data elements in place instead of creating two sub-arrays. 	TokenNameCOMMENT_LINE	Sort the data elements in place instead of creating two sub-arrays. 
// This avoids un-nessisary memory allocation and copying 	TokenNameCOMMENT_LINE	This avoids un-nessisary memory allocation and copying 
int	TokenNameint	
storeIndex	TokenNameIdentifier	 store Index
=	TokenNameEQUAL	
from	TokenNameIdentifier	 from
;	TokenNameSEMICOLON	
Example	TokenNameIdentifier	 Example
tmp	TokenNameIdentifier	 tmp
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
from	TokenNameIdentifier	 from
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
to	TokenNameIdentifier	 to
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
dataset	TokenNameIdentifier	 dataset
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
.	TokenNameDOT	
getWeight	TokenNameIdentifier	 get Weight
(	TokenNameLPAREN	
bestFeature	TokenNameIdentifier	 best Feature
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
bestThreshold	TokenNameIdentifier	 best Threshold
)	TokenNameRPAREN	
{	TokenNameLBRACE	
tmp	TokenNameIdentifier	 tmp
=	TokenNameEQUAL	
dataset	TokenNameIdentifier	 dataset
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
storeIndex	TokenNameIdentifier	 store Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dataset	TokenNameIdentifier	 dataset
.	TokenNameDOT	
setElementAt	TokenNameIdentifier	 set Element At
(	TokenNameLPAREN	
dataset	TokenNameIdentifier	 dataset
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
,	TokenNameCOMMA	
storeIndex	TokenNameIdentifier	 store Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dataset	TokenNameIdentifier	 dataset
.	TokenNameDOT	
setElementAt	TokenNameIdentifier	 set Element At
(	TokenNameLPAREN	
tmp	TokenNameIdentifier	 tmp
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
storeIndex	TokenNameIdentifier	 store Index
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
depth	TokenNameIdentifier	 depth
>	TokenNameGREATER	
1000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
log	TokenNameIdentifier	 log
.	TokenNameDOT	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
"Pos Weight: "	TokenNameStringLiteral	Pos Weight: 
+	TokenNamePLUS	
posWeight	TokenNameIdentifier	 pos Weight
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
log	TokenNameIdentifier	 log
.	TokenNameDOT	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
"Neg Weight: "	TokenNameStringLiteral	Neg Weight: 
+	TokenNamePLUS	
negWeight	TokenNameIdentifier	 neg Weight
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
log	TokenNameIdentifier	 log
.	TokenNameDOT	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
"last Feature: "	TokenNameStringLiteral	last Feature: 
+	TokenNamePLUS	
lastFeature	TokenNameIdentifier	 last Feature
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
log	TokenNameIdentifier	 log
.	TokenNameDOT	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
"from: "	TokenNameStringLiteral	from: 
+	TokenNamePLUS	
from	TokenNameIdentifier	 from
+	TokenNamePLUS	
", to: "	TokenNameStringLiteral	, to: 
+	TokenNamePLUS	
to	TokenNameIdentifier	 to
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
log	TokenNameIdentifier	 log
.	TokenNameDOT	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
"storeIndex: "	TokenNameStringLiteral	storeIndex: 
+	TokenNamePLUS	
storeIndex	TokenNameIdentifier	 store Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
log	TokenNameIdentifier	 log
.	TokenNameDOT	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
"split on: "	TokenNameStringLiteral	split on: 
+	TokenNamePLUS	
bestFeature	TokenNameIdentifier	 best Feature
+	TokenNamePLUS	
" with threshold "	TokenNameStringLiteral	 with threshold 
+	TokenNamePLUS	
bestThreshold	TokenNameIdentifier	 best Threshold
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// swap the best feature with the last feature, again to avoid memory allocation for the 	TokenNameCOMMENT_LINE	swap the best feature with the last feature, again to avoid memory allocation for the 
// features. This optimization does almost nothing in terms of performance in practice 	TokenNameCOMMENT_LINE	features. This optimization does almost nothing in terms of performance in practice 
unusedFeatures	TokenNameIdentifier	 unused Features
.	TokenNameDOT	
setElementAt	TokenNameIdentifier	 set Element At
(	TokenNameLPAREN	
unusedFeatures	TokenNameIdentifier	 unused Features
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
lastFeature	TokenNameIdentifier	 last Feature
)	TokenNameRPAREN	
,	TokenNameCOMMA	
featureIndex	TokenNameIdentifier	 feature Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
unusedFeatures	TokenNameIdentifier	 unused Features
.	TokenNameDOT	
setElementAt	TokenNameIdentifier	 set Element At
(	TokenNameLPAREN	
bestFeature	TokenNameIdentifier	 best Feature
,	TokenNameCOMMA	
lastFeature	TokenNameIdentifier	 last Feature
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// If this feature didn't split anything, recur, and don't build a useless node 	TokenNameCOMMENT_LINE	If this feature didn't split anything, recur, and don't build a useless node 
if	TokenNameif	
(	TokenNameLPAREN	
storeIndex	TokenNameIdentifier	 store Index
==	TokenNameEQUAL_EQUAL	
from	TokenNameIdentifier	 from
||	TokenNameOR_OR	
storeIndex	TokenNameIdentifier	 store Index
==	TokenNameEQUAL_EQUAL	
to	TokenNameIdentifier	 to
)	TokenNameRPAREN	
{	TokenNameLBRACE	
log	TokenNameIdentifier	 log
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"didn't split data with this feature"	TokenNameStringLiteral	didn't split data with this feature
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
batchTrain	TokenNameIdentifier	 batch Train
(	TokenNameLPAREN	
dataset	TokenNameIdentifier	 dataset
,	TokenNameCOMMA	
depth	TokenNameIdentifier	 depth
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
unusedFeatures	TokenNameIdentifier	 unused Features
,	TokenNameCOMMA	
lastFeature	TokenNameIdentifier	 last Feature
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
from	TokenNameIdentifier	 from
,	TokenNameCOMMA	
to	TokenNameIdentifier	 to
,	TokenNameCOMMA	
tree	TokenNameIdentifier	 tree
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// This is 'without pruning' - features can be reselected 	TokenNameCOMMENT_LINE	This is 'without pruning' - features can be reselected 
int	TokenNameint	
trueBranch	TokenNameIdentifier	 true Branch
=	TokenNameEQUAL	
batchTrain	TokenNameIdentifier	 batch Train
(	TokenNameLPAREN	
dataset	TokenNameIdentifier	 dataset
,	TokenNameCOMMA	
depth	TokenNameIdentifier	 depth
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
unusedFeatures	TokenNameIdentifier	 unused Features
,	TokenNameCOMMA	
lastFeature	TokenNameIdentifier	 last Feature
,	TokenNameCOMMA	
from	TokenNameIdentifier	 from
,	TokenNameCOMMA	
storeIndex	TokenNameIdentifier	 store Index
,	TokenNameCOMMA	
tree	TokenNameIdentifier	 tree
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
falseBranch	TokenNameIdentifier	 false Branch
=	TokenNameEQUAL	
batchTrain	TokenNameIdentifier	 batch Train
(	TokenNameLPAREN	
dataset	TokenNameIdentifier	 dataset
,	TokenNameCOMMA	
depth	TokenNameIdentifier	 depth
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
unusedFeatures	TokenNameIdentifier	 unused Features
,	TokenNameCOMMA	
lastFeature	TokenNameIdentifier	 last Feature
,	TokenNameCOMMA	
storeIndex	TokenNameIdentifier	 store Index
,	TokenNameCOMMA	
to	TokenNameIdentifier	 to
,	TokenNameCOMMA	
tree	TokenNameIdentifier	 tree
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
tree	TokenNameIdentifier	 tree
.	TokenNameDOT	
addInternalNode	TokenNameIdentifier	 add Internal Node
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
private	TokenNameprivate	
static	TokenNamestatic	
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
/* // value of splitting on this feature public double value(double totalPosWeight,double totalNegWeight){ return schapireSingerValue(pos,neg,totalPosWeight,totalNegWeight); //return entropy(pos,neg,totalPosWeight,totalNegWeight); } */	TokenNameCOMMENT_BLOCK	 // value of splitting on this feature public double value(double totalPosWeight,double totalNegWeight){ return schapireSingerValue(pos,neg,totalPosWeight,totalNegWeight); //return entropy(pos,neg,totalPosWeight,totalNegWeight); } 
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
private	TokenNameprivate	
static	TokenNamestatic	
class	TokenNameclass	
NumericFeatureStats	TokenNameIdentifier	 Numeric Feature Stats
{	TokenNameLBRACE	
// maps feature values to BinaryFeatureStats for examples with exactly that value 	TokenNameCOMMENT_LINE	maps feature values to BinaryFeatureStats for examples with exactly that value 
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
// incrementally track weight of pos,neg examples less than/greater than the threshold 	TokenNameCOMMENT_LINE	incrementally track weight of pos,neg examples less than/greater than the threshold 
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
// double total=posGT+negGT; 	TokenNameCOMMENT_LINE	double total=posGT+negGT; 
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
//double value = entropy( posGT, negGT, totalPosWeight, totalNegWeight ); 	TokenNameCOMMENT_LINE	double value = entropy( posGT, negGT, totalPosWeight, totalNegWeight ); 
// // Gini value -- not sure if this is actually correct or not 	TokenNameCOMMENT_LINE	// Gini value -- not sure if this is actually correct or not 
// double value = 	TokenNameCOMMENT_LINE	double value = 
// 1 - ((posGT * posGT) + (negGT * negGT)) / (total * total); 	TokenNameCOMMENT_LINE	1 - ((posGT * posGT) + (negGT * negGT)) / (total * total); 
//if(DEBUG)log.debug("last:"+lastKey+" key:"+key+" th:"+threshold+" p:"+posGT+" n:"+negGT+" v:"+value); 	TokenNameCOMMENT_LINE	if(DEBUG)log.debug("last:"+lastKey+" key:"+key+" th:"+threshold+" p:"+posGT+" n:"+negGT+" v:"+value); 
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
// //return 2 * ( Math.sqrt((wp1)*(wp0)) + Math.sqrt((wn1)*(wn0)) ); 	TokenNameCOMMENT_LINE	//return 2 * ( Math.sqrt((wp1)*(wp0)) + Math.sqrt((wn1)*(wn0)) ); 
// return -w11*Math.log(w11)-w10*Math.log(w10)-w01*Math.log(w01)-w00* 	TokenNameCOMMENT_LINE	return -w11*Math.log(w11)-w10*Math.log(w10)-w01*Math.log(w01)-w00* 
// Math.log(w00); 	TokenNameCOMMENT_LINE	Math.log(w00); 
// } 	TokenNameCOMMENT_LINE	} 
}	TokenNameRBRACE	
