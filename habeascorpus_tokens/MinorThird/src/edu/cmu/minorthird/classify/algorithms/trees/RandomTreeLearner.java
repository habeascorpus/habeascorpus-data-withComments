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
/** * Implement a random decision tree to be used in the random forest learner. * Implements two tree splitters. Default one splits on random features. BestOfN splits on the b * best of N randomly chosen features. * * @author Alexander Friedman */	TokenNameCOMMENT_JAVADOC	 Implement a random decision tree to be used in the random forest learner. Implements two tree splitters. Default one splits on random features. BestOfN splits on the b best of N randomly chosen features. * @author Alexander Friedman 
// TODO: ADD a few more tree splitting routines. 	TokenNameCOMMENT_LINE	TODO: ADD a few more tree splitting routines. 
// Try: Linear combination of m random features 	TokenNameCOMMENT_LINE	Try: Linear combination of m random features 
public	TokenNamepublic	
class	TokenNameclass	
RandomTreeLearner	TokenNameIdentifier	 Random Tree Learner
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
RandomTreeLearner	TokenNameIdentifier	 Random Tree Learner
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// The builder that we will use to construct the tree 	TokenNameCOMMENT_LINE	The builder that we will use to construct the tree 
private	TokenNameprivate	
TreeSplitter	TokenNameIdentifier	 Tree Splitter
splitter	TokenNameIdentifier	 splitter
;	TokenNameSEMICOLON	
// The interface used to split trees 	TokenNameCOMMENT_LINE	The interface used to split trees 
public	TokenNamepublic	
interface	TokenNameinterface	
TreeSplitter	TokenNameIdentifier	 Tree Splitter
{	TokenNameLBRACE	
// Yep, lets avoid that whole type system thing entirely 	TokenNameCOMMENT_LINE	Yep, lets avoid that whole type system thing entirely 
// return [feature x threshold(double)] || 	TokenNameCOMMENT_LINE	return [feature x threshold(double)] || 
// [feature x threshold(double) x trueset(dataset) x falseset(dataset)] 	TokenNameCOMMENT_LINE	[feature x threshold(double) x trueset(dataset) x falseset(dataset)] 
// if your splitter is doing something clever/expensive/etc 	TokenNameCOMMENT_LINE	if your splitter is doing something clever/expensive/etc 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getSplit	TokenNameIdentifier	 get Split
(	TokenNameLPAREN	
List	TokenNameIdentifier	 List
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
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Selects one random feature from the unused features, then selects a random split point 	TokenNameCOMMENT_LINE	Selects one random feature from the unused features, then selects a random split point 
// between the min and max values 	TokenNameCOMMENT_LINE	between the min and max values 
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
RandomTreeSplitter	TokenNameIdentifier	 Random Tree Splitter
implements	TokenNameimplements	
TreeSplitter	TokenNameIdentifier	 Tree Splitter
{	TokenNameLBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getSplit	TokenNameIdentifier	 get Split
(	TokenNameLPAREN	
List	TokenNameIdentifier	 List
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
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Now choose a random feature from the unused features (and consider it the best feature) 	TokenNameCOMMENT_LINE	Now choose a random feature from the unused features (and consider it the best feature) 
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
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
random	TokenNameIdentifier	 random
(	TokenNameLPAREN	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
unusedFeatures	TokenNameIdentifier	 unused Features
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// This is silly - we should be using Generics 	TokenNameCOMMENT_LINE	This is silly - we should be using Generics 
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
// now get the min and max values of this feature 	TokenNameCOMMENT_LINE	now get the min and max values of this feature 
double	TokenNamedouble	
minValue	TokenNameIdentifier	 min Value
=	TokenNameEQUAL	
Double	TokenNameIdentifier	 Double
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
;	TokenNameSEMICOLON	
double	TokenNamedouble	
maxValue	TokenNameIdentifier	 max Value
=	TokenNameEQUAL	
Double	TokenNameIdentifier	 Double
.	TokenNameDOT	
MIN_VALUE	TokenNameIdentifier	 MIN  VALUE
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Example	TokenNameIdentifier	 Example
example	TokenNameIdentifier	 example
:	TokenNameCOLON	
dataset	TokenNameIdentifier	 dataset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
double	TokenNamedouble	
val	TokenNameIdentifier	 val
=	TokenNameEQUAL	
example	TokenNameIdentifier	 example
.	TokenNameDOT	
getWeight	TokenNameIdentifier	 get Weight
(	TokenNameLPAREN	
bestFeature	TokenNameIdentifier	 best Feature
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
val	TokenNameIdentifier	 val
<	TokenNameLESS	
minValue	TokenNameIdentifier	 min Value
)	TokenNameRPAREN	
minValue	TokenNameIdentifier	 min Value
=	TokenNameEQUAL	
val	TokenNameIdentifier	 val
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
val	TokenNameIdentifier	 val
>	TokenNameGREATER	
maxValue	TokenNameIdentifier	 max Value
)	TokenNameRPAREN	
maxValue	TokenNameIdentifier	 max Value
=	TokenNameEQUAL	
val	TokenNameIdentifier	 val
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
double	TokenNamedouble	
bestThreshold	TokenNameIdentifier	 best Threshold
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
random	TokenNameIdentifier	 random
(	TokenNameLPAREN	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
maxValue	TokenNameIdentifier	 max Value
-	TokenNameMINUS	
minValue	TokenNameIdentifier	 min Value
)	TokenNameRPAREN	
+	TokenNamePLUS	
minValue	TokenNameIdentifier	 min Value
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
bestFeature	TokenNameIdentifier	 best Feature
,	TokenNameCOMMA	
new	TokenNamenew	
Double	TokenNameIdentifier	 Double
(	TokenNameLPAREN	
bestThreshold	TokenNameIdentifier	 best Threshold
)	TokenNameRPAREN	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
BestOfNRandomTreeSplitter	TokenNameIdentifier	 Best Of N Random Tree Splitter
implements	TokenNameimplements	
TreeSplitter	TokenNameIdentifier	 Tree Splitter
{	TokenNameLBRACE	
public	TokenNamepublic	
BestOfNRandomTreeSplitter	TokenNameIdentifier	 Best Of N Random Tree Splitter
(	TokenNameLPAREN	
int	TokenNameint	
fc	TokenNameIdentifier	 fc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
featureCount	TokenNameIdentifier	 feature Count
=	TokenNameEQUAL	
fc	TokenNameIdentifier	 fc
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
featureCount	TokenNameIdentifier	 feature Count
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getSplit	TokenNameIdentifier	 get Split
(	TokenNameLPAREN	
List	TokenNameIdentifier	 List
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
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Feature	TokenNameIdentifier	 Feature
bestFeature	TokenNameIdentifier	 best Feature
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
bestEntropy	TokenNameIdentifier	 best Entropy
=	TokenNameEQUAL	
Double	TokenNameIdentifier	 Double
.	TokenNameDOT	
MIN_VALUE	TokenNameIdentifier	 MIN  VALUE
;	TokenNameSEMICOLON	
double	TokenNamedouble	
bestThreshold	TokenNameIdentifier	 best Threshold
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Example	TokenNameIdentifier	 Example
>	TokenNameGREATER	
bestTrueData	TokenNameIdentifier	 best True Data
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Example	TokenNameIdentifier	 Example
>	TokenNameGREATER	
bestFalseData	TokenNameIdentifier	 best False Data
=	TokenNameEQUAL	
null	TokenNamenull	
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
featureCount	TokenNameIdentifier	 feature Count
&&	TokenNameAND_AND	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
unusedFeatures	TokenNameIdentifier	 unused Features
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Now choose a random feature from the unused features (and consider it the best feature) 	TokenNameCOMMENT_LINE	Now choose a random feature from the unused features (and consider it the best feature) 
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
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
random	TokenNameIdentifier	 random
(	TokenNameLPAREN	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
unusedFeatures	TokenNameIdentifier	 unused Features
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Example	TokenNameIdentifier	 Example
>	TokenNameGREATER	
trueData	TokenNameIdentifier	 true Data
=	TokenNameEQUAL	
new	TokenNamenew	
LinkedList	TokenNameIdentifier	 Linked List
<	TokenNameLESS	
Example	TokenNameIdentifier	 Example
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Example	TokenNameIdentifier	 Example
>	TokenNameGREATER	
falseData	TokenNameIdentifier	 false Data
=	TokenNameEQUAL	
new	TokenNamenew	
LinkedList	TokenNameIdentifier	 Linked List
<	TokenNameLESS	
Example	TokenNameIdentifier	 Example
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// FIXME: copied from code above. should make a function to pick thresholds. 	TokenNameCOMMENT_LINE	FIXME: copied from code above. should make a function to pick thresholds. 
double	TokenNamedouble	
minValue	TokenNameIdentifier	 min Value
=	TokenNameEQUAL	
Double	TokenNameIdentifier	 Double
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
;	TokenNameSEMICOLON	
double	TokenNamedouble	
maxValue	TokenNameIdentifier	 max Value
=	TokenNameEQUAL	
Double	TokenNameIdentifier	 Double
.	TokenNameDOT	
MIN_VALUE	TokenNameIdentifier	 MIN  VALUE
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Example	TokenNameIdentifier	 Example
example	TokenNameIdentifier	 example
:	TokenNameCOLON	
dataset	TokenNameIdentifier	 dataset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
double	TokenNamedouble	
val	TokenNameIdentifier	 val
=	TokenNameEQUAL	
example	TokenNameIdentifier	 example
.	TokenNameDOT	
getWeight	TokenNameIdentifier	 get Weight
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
val	TokenNameIdentifier	 val
<	TokenNameLESS	
minValue	TokenNameIdentifier	 min Value
)	TokenNameRPAREN	
minValue	TokenNameIdentifier	 min Value
=	TokenNameEQUAL	
val	TokenNameIdentifier	 val
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
val	TokenNameIdentifier	 val
>	TokenNameGREATER	
maxValue	TokenNameIdentifier	 max Value
)	TokenNameRPAREN	
maxValue	TokenNameIdentifier	 max Value
=	TokenNameEQUAL	
val	TokenNameIdentifier	 val
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
double	TokenNamedouble	
threshold	TokenNameIdentifier	 threshold
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
random	TokenNameIdentifier	 random
(	TokenNameLPAREN	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
maxValue	TokenNameIdentifier	 max Value
-	TokenNameMINUS	
minValue	TokenNameIdentifier	 min Value
)	TokenNameRPAREN	
+	TokenNamePLUS	
minValue	TokenNameIdentifier	 min Value
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Example	TokenNameIdentifier	 Example
example	TokenNameIdentifier	 example
:	TokenNameCOLON	
dataset	TokenNameIdentifier	 dataset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
example	TokenNameIdentifier	 example
.	TokenNameDOT	
getWeight	TokenNameIdentifier	 get Weight
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
threshold	TokenNameIdentifier	 threshold
)	TokenNameRPAREN	
trueData	TokenNameIdentifier	 true Data
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
example	TokenNameIdentifier	 example
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
falseData	TokenNameIdentifier	 false Data
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
example	TokenNameIdentifier	 example
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
double	TokenNamedouble	
i_gain	TokenNameIdentifier	 i gain
=	TokenNameEQUAL	
entropy	TokenNameIdentifier	 entropy
(	TokenNameLPAREN	
trueData	TokenNameIdentifier	 true Data
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
falseData	TokenNameIdentifier	 false Data
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
trueData	TokenNameIdentifier	 true Data
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
falseData	TokenNameIdentifier	 false Data
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// **FIXME** think about this entropy thing! 	TokenNameCOMMENT_LINE	**FIXME** think about this entropy thing! 
if	TokenNameif	
(	TokenNameLPAREN	
i_gain	TokenNameIdentifier	 i gain
>	TokenNameGREATER	
bestEntropy	TokenNameIdentifier	 best Entropy
)	TokenNameRPAREN	
{	TokenNameLBRACE	
bestEntropy	TokenNameIdentifier	 best Entropy
=	TokenNameEQUAL	
i_gain	TokenNameIdentifier	 i gain
;	TokenNameSEMICOLON	
bestTrueData	TokenNameIdentifier	 best True Data
=	TokenNameEQUAL	
trueData	TokenNameIdentifier	 true Data
;	TokenNameSEMICOLON	
bestFalseData	TokenNameIdentifier	 best False Data
=	TokenNameEQUAL	
falseData	TokenNameIdentifier	 false Data
;	TokenNameSEMICOLON	
bestFeature	TokenNameIdentifier	 best Feature
=	TokenNameEQUAL	
f	TokenNameIdentifier	 f
;	TokenNameSEMICOLON	
bestThreshold	TokenNameIdentifier	 best Threshold
=	TokenNameEQUAL	
threshold	TokenNameIdentifier	 threshold
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
bestFeature	TokenNameIdentifier	 best Feature
,	TokenNameCOMMA	
new	TokenNamenew	
Double	TokenNameIdentifier	 Double
(	TokenNameLPAREN	
bestThreshold	TokenNameIdentifier	 best Threshold
)	TokenNameRPAREN	
,	TokenNameCOMMA	
bestTrueData	TokenNameIdentifier	 best True Data
,	TokenNameCOMMA	
bestFalseData	TokenNameIdentifier	 best False Data
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
RandomTreeLearner	TokenNameIdentifier	 Random Tree Learner
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
splitter	TokenNameIdentifier	 splitter
=	TokenNameEQUAL	
new	TokenNamenew	
RandomTreeSplitter	TokenNameIdentifier	 Random Tree Splitter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
RandomTreeLearner	TokenNameIdentifier	 Random Tree Learner
(	TokenNameLPAREN	
TreeSplitter	TokenNameIdentifier	 Tree Splitter
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
{	TokenNameLBRACE	
splitter	TokenNameIdentifier	 splitter
=	TokenNameEQUAL	
b	TokenNameIdentifier	 b
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
Classifier	TokenNameIdentifier	 Classifier
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
batchTrain	TokenNameIdentifier	 batch Train
(	TokenNameLPAREN	
dataset	TokenNameIdentifier	 dataset
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
allFeatures	TokenNameIdentifier	 all Features
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
DecisionTree	TokenNameIdentifier	 Decision Tree
batchTrain	TokenNameIdentifier	 batch Train
(	TokenNameLPAREN	
List	TokenNameIdentifier	 List
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
)	TokenNameRPAREN	
{	TokenNameLBRACE	
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
Example	TokenNameIdentifier	 Example
example	TokenNameIdentifier	 example
:	TokenNameCOLON	
dataset	TokenNameIdentifier	 dataset
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
debug	TokenNameIdentifier	 debug
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
// Random Forests will use voting to determine the outcome, 	TokenNameCOMMENT_LINE	Random Forests will use voting to determine the outcome, 
// so we will use +/- 1 for the weights, or 0 if unknown 	TokenNameCOMMENT_LINE	so we will use +/- 1 for the weights, or 0 if unknown 
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
unusedFeatures	TokenNameIdentifier	 unused Features
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
weight	TokenNameIdentifier	 weight
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
posWeight	TokenNameIdentifier	 pos Weight
>	TokenNameGREATER	
negWeight	TokenNameIdentifier	 neg Weight
)	TokenNameRPAREN	
weight	TokenNameIdentifier	 weight
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
posWeight	TokenNameIdentifier	 pos Weight
==	TokenNameEQUAL_EQUAL	
negWeight	TokenNameIdentifier	 neg Weight
)	TokenNameRPAREN	
weight	TokenNameIdentifier	 weight
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
else	TokenNameelse	
weight	TokenNameIdentifier	 weight
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
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
weight	TokenNameIdentifier	 weight
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
splitter	TokenNameIdentifier	 splitter
.	TokenNameDOT	
getSplit	TokenNameIdentifier	 get Split
(	TokenNameLPAREN	
dataset	TokenNameIdentifier	 dataset
,	TokenNameCOMMA	
depth	TokenNameIdentifier	 depth
,	TokenNameCOMMA	
unusedFeatures	TokenNameIdentifier	 unused Features
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Feature	TokenNameIdentifier	 Feature
bestFeature	TokenNameIdentifier	 best Feature
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Feature	TokenNameIdentifier	 Feature
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
(	TokenNameLPAREN	
Double	TokenNameIdentifier	 Double
)	TokenNameRPAREN	
result	TokenNameIdentifier	 result
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
.	TokenNameDOT	
doubleValue	TokenNameIdentifier	 double Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// java sucks 	TokenNameCOMMENT_LINE	java sucks 
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Example	TokenNameIdentifier	 Example
>	TokenNameGREATER	
trueData	TokenNameIdentifier	 true Data
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Example	TokenNameIdentifier	 Example
>	TokenNameGREATER	
falseData	TokenNameIdentifier	 false Data
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
length	TokenNameIdentifier	 length
==	TokenNameEQUAL_EQUAL	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// The splitter did the splitting, just use the result 	TokenNameCOMMENT_LINE	The splitter did the splitting, just use the result 
trueData	TokenNameIdentifier	 true Data
=	TokenNameEQUAL	
(	TokenNameLPAREN	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Example	TokenNameIdentifier	 Example
>	TokenNameGREATER	
)	TokenNameRPAREN	
result	TokenNameIdentifier	 result
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// Sorry Java, you need a better type system 	TokenNameCOMMENT_LINE	Sorry Java, you need a better type system 
falseData	TokenNameIdentifier	 false Data
=	TokenNameEQUAL	
(	TokenNameLPAREN	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Example	TokenNameIdentifier	 Example
>	TokenNameGREATER	
)	TokenNameRPAREN	
result	TokenNameIdentifier	 result
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
trueData	TokenNameIdentifier	 true Data
=	TokenNameEQUAL	
new	TokenNamenew	
LinkedList	TokenNameIdentifier	 Linked List
<	TokenNameLESS	
Example	TokenNameIdentifier	 Example
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
falseData	TokenNameIdentifier	 false Data
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
Example	TokenNameIdentifier	 Example
example	TokenNameIdentifier	 example
:	TokenNameCOLON	
dataset	TokenNameIdentifier	 dataset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
example	TokenNameIdentifier	 example
.	TokenNameDOT	
getWeight	TokenNameIdentifier	 get Weight
(	TokenNameLPAREN	
bestFeature	TokenNameIdentifier	 best Feature
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
bestThreshold	TokenNameIdentifier	 best Threshold
)	TokenNameRPAREN	
trueData	TokenNameIdentifier	 true Data
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
example	TokenNameIdentifier	 example
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
falseData	TokenNameIdentifier	 false Data
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
example	TokenNameIdentifier	 example
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
log	TokenNameIdentifier	 log
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
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
log	TokenNameIdentifier	 log
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"trueData size: "	TokenNameStringLiteral	trueData size: 
+	TokenNamePLUS	
trueData	TokenNameIdentifier	 true Data
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" falseData size: "	TokenNameStringLiteral	 falseData size: 
+	TokenNamePLUS	
falseData	TokenNameIdentifier	 false Data
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Vector	TokenNameIdentifier	 Vector
<	TokenNameLESS	
Feature	TokenNameIdentifier	 Feature
>	TokenNameGREATER	
newUnusedFeatures	TokenNameIdentifier	 new Unused Features
=	TokenNameEQUAL	
new	TokenNamenew	
Vector	TokenNameIdentifier	 Vector
<	TokenNameLESS	
Feature	TokenNameIdentifier	 Feature
>	TokenNameGREATER	
(	TokenNameLPAREN	
unusedFeatures	TokenNameIdentifier	 unused Features
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
newUnusedFeatures	TokenNameIdentifier	 new Unused Features
.	TokenNameDOT	
removeElement	TokenNameIdentifier	 remove Element
(	TokenNameLPAREN	
bestFeature	TokenNameIdentifier	 best Feature
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// If this feature didn't split anything, recur, and don't build a useless node 	TokenNameCOMMENT_LINE	If this feature didn't split anything, recur, and don't build a useless node 
if	TokenNameif	
(	TokenNameLPAREN	
falseData	TokenNameIdentifier	 false Data
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
trueData	TokenNameIdentifier	 true Data
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
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
,	TokenNameCOMMA	
newUnusedFeatures	TokenNameIdentifier	 new Unused Features
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// recur to build the subtrees 	TokenNameCOMMENT_LINE	recur to build the subtrees 
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
,	TokenNameCOMMA	
newUnusedFeatures	TokenNameIdentifier	 new Unused Features
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
,	TokenNameCOMMA	
newUnusedFeatures	TokenNameIdentifier	 new Unused Features
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
// FIXME -- these are copied directly from DecisionTreeLearner 	TokenNameCOMMENT_LINE	FIXME -- these are copied directly from DecisionTreeLearner 
// I would like to call these as utility functions, but they are private :~( 	TokenNameCOMMENT_LINE	I would like to call these as utility functions, but they are private :~( 
// private static double schapireSingerValue(double pos,double neg, 	TokenNameCOMMENT_LINE	private static double schapireSingerValue(double pos,double neg, 
// double totalPos,double totalNeg){ 	TokenNameCOMMENT_LINE	double totalPos,double totalNeg){ 
// double totalWeight=totalPos+totalNeg; 	TokenNameCOMMENT_LINE	double totalWeight=totalPos+totalNeg; 
// // wpj = S&S's W_+^j, wnj = W_-^j, for j=0,1 	TokenNameCOMMENT_LINE	// wpj = S&S's W_+^j, wnj = W_-^j, for j=0,1 
// // block j=1 is condition true (pos,neg weights) 	TokenNameCOMMENT_LINE	// block j=1 is condition true (pos,neg weights) 
// // block j=0 is condition false (totalPos-pos,totalNeg-neg weights) 	TokenNameCOMMENT_LINE	// block j=0 is condition false (totalPos-pos,totalNeg-neg weights) 
// // W_+ is positive class (pos,totalPos-pos), W_- is negative 	TokenNameCOMMENT_LINE	// W_+ is positive class (pos,totalPos-pos), W_- is negative 
// double wp1=pos/totalWeight; 	TokenNameCOMMENT_LINE	double wp1=pos/totalWeight; 
// double wp0=(totalPos-pos)/totalWeight; 	TokenNameCOMMENT_LINE	double wp0=(totalPos-pos)/totalWeight; 
// double wn1=neg/totalWeight; 	TokenNameCOMMENT_LINE	double wn1=neg/totalWeight; 
// double wn0=(totalNeg-neg)/totalWeight; 	TokenNameCOMMENT_LINE	double wn0=(totalNeg-neg)/totalWeight; 
// log.debug("pos, neg, total = "+pos+", "+neg+", "+totalWeight); 	TokenNameCOMMENT_LINE	log.debug("pos, neg, total = "+pos+", "+neg+", "+totalWeight); 
// log.debug("wp1,wp0,wn1,wn0 = "+wp1+","+wp0+","+wn1+","+wn0); 	TokenNameCOMMENT_LINE	log.debug("wp1,wp0,wn1,wn0 = "+wp1+","+wp0+","+wn1+","+wn0); 
// return 2*(Math.sqrt(wp1*wn1)+Math.sqrt(wp0*wn0)); 	TokenNameCOMMENT_LINE	return 2*(Math.sqrt(wp1*wn1)+Math.sqrt(wp0*wn0)); 
// } 	TokenNameCOMMENT_LINE	} 
private	TokenNameprivate	
static	TokenNamestatic	
double	TokenNamedouble	
entropy	TokenNameIdentifier	 entropy
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
// wij = feature=i,class=j 	TokenNameCOMMENT_LINE	wij = feature=i,class=j 
double	TokenNamedouble	
tot	TokenNameIdentifier	 tot
=	TokenNameEQUAL	
totalPos	TokenNameIdentifier	 total Pos
+	TokenNamePLUS	
totalNeg	TokenNameIdentifier	 total Neg
;	TokenNameSEMICOLON	
double	TokenNamedouble	
epsilon	TokenNameIdentifier	 epsilon
=	TokenNameEQUAL	
0.1	TokenNameDoubleLiteral	
/	TokenNameDIVIDE	
tot	TokenNameIdentifier	 tot
;	TokenNameSEMICOLON	
double	TokenNamedouble	
w11	TokenNameIdentifier	 w11
=	TokenNameEQUAL	
pos	TokenNameIdentifier	 pos
/	TokenNameDIVIDE	
tot	TokenNameIdentifier	 tot
+	TokenNamePLUS	
epsilon	TokenNameIdentifier	 epsilon
;	TokenNameSEMICOLON	
double	TokenNamedouble	
w10	TokenNameIdentifier	 w10
=	TokenNameEQUAL	
neg	TokenNameIdentifier	 neg
/	TokenNameDIVIDE	
tot	TokenNameIdentifier	 tot
+	TokenNamePLUS	
epsilon	TokenNameIdentifier	 epsilon
;	TokenNameSEMICOLON	
double	TokenNamedouble	
w01	TokenNameIdentifier	 w01
=	TokenNameEQUAL	
(	TokenNameLPAREN	
tot	TokenNameIdentifier	 tot
-	TokenNameMINUS	
pos	TokenNameIdentifier	 pos
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
tot	TokenNameIdentifier	 tot
+	TokenNamePLUS	
epsilon	TokenNameIdentifier	 epsilon
;	TokenNameSEMICOLON	
double	TokenNamedouble	
w00	TokenNameIdentifier	 w00
=	TokenNameEQUAL	
(	TokenNameLPAREN	
tot	TokenNameIdentifier	 tot
-	TokenNameMINUS	
neg	TokenNameIdentifier	 neg
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
tot	TokenNameIdentifier	 tot
+	TokenNamePLUS	
epsilon	TokenNameIdentifier	 epsilon
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
tot	TokenNameIdentifier	 tot
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
log	TokenNameIdentifier	 log
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"w11,w10,w01,w00 = "	TokenNameStringLiteral	w11,w10,w01,w00 = 
+	TokenNamePLUS	
w11	TokenNameIdentifier	 w11
+	TokenNamePLUS	
","	TokenNameStringLiteral	,
+	TokenNamePLUS	
w10	TokenNameIdentifier	 w10
+	TokenNamePLUS	
","	TokenNameStringLiteral	,
+	TokenNamePLUS	
w01	TokenNameIdentifier	 w01
+	TokenNamePLUS	
","	TokenNameStringLiteral	,
+	TokenNamePLUS	
w00	TokenNameIdentifier	 w00
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//return 2 * ( Math.sqrt((wp1)*(wp0)) + Math.sqrt((wn1)*(wn0)) ); 	TokenNameCOMMENT_LINE	return 2 * ( Math.sqrt((wp1)*(wp0)) + Math.sqrt((wn1)*(wn0)) ); 
return	TokenNamereturn	
-	TokenNameMINUS	
w11	TokenNameIdentifier	 w11
*	TokenNameMULTIPLY	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
w11	TokenNameIdentifier	 w11
)	TokenNameRPAREN	
-	TokenNameMINUS	
w10	TokenNameIdentifier	 w10
*	TokenNameMULTIPLY	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
w10	TokenNameIdentifier	 w10
)	TokenNameRPAREN	
-	TokenNameMINUS	
w01	TokenNameIdentifier	 w01
*	TokenNameMULTIPLY	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
w01	TokenNameIdentifier	 w01
)	TokenNameRPAREN	
-	TokenNameMINUS	
w00	TokenNameIdentifier	 w00
*	TokenNameMULTIPLY	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
w00	TokenNameIdentifier	 w00
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
