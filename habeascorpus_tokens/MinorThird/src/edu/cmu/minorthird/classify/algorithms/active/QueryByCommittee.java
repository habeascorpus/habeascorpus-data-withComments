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
active	TokenNameIdentifier	 active
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
trees	TokenNameIdentifier	 trees
.	TokenNameDOT	
DecisionTreeLearner	TokenNameIdentifier	 Decision Tree Learner
;	TokenNameSEMICOLON	
import	TokenNameimport	
gnu	TokenNameIdentifier	 gnu
.	TokenNameDOT	
trove	TokenNameIdentifier	 trove
.	TokenNameDOT	
TObjectDoubleHashMap	TokenNameIdentifier	 T Object Double Hash Map
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
Random	TokenNameIdentifier	 Random
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
TreeMap	TokenNameIdentifier	 Tree Map
;	TokenNameSEMICOLON	
/** * Implements the query-by-committee algorithm, using bagging to * generate a committee. * * @author William Cohen */	TokenNameCOMMENT_JAVADOC	 Implements the query-by-committee algorithm, using bagging to generate a committee. * @author William Cohen 
// 	TokenNameCOMMENT_LINE	 
// easily extends to k-class case 	TokenNameCOMMENT_LINE	easily extends to k-class case 
// 	TokenNameCOMMENT_LINE	 
public	TokenNamepublic	
class	TokenNameclass	
QueryByCommittee	TokenNameIdentifier	 Query By Committee
implements	TokenNameimplements	
ClassifierLearner	TokenNameIdentifier	 Classifier Learner
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
QueryByCommittee	TokenNameIdentifier	 Query By Committee
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
ClassifierLearner	TokenNameIdentifier	 Classifier Learner
innerLearner	TokenNameIdentifier	 inner Learner
;	TokenNameSEMICOLON	
/** Min number of labels to passively accept before starting to actively query */	TokenNameCOMMENT_JAVADOC	 Min number of labels to passively accept before starting to actively query 
private	TokenNameprivate	
int	TokenNameint	
minLabelsBeforeQuerying	TokenNameIdentifier	 min Labels Before Querying
=	TokenNameEQUAL	
5	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
CommitteeLearner	TokenNameIdentifier	 Committee Learner
committeeLearner	TokenNameIdentifier	 committee Learner
;	TokenNameSEMICOLON	
private	TokenNameprivate	
ExampleSchema	TokenNameIdentifier	 Example Schema
schema	TokenNameIdentifier	 schema
;	TokenNameSEMICOLON	
// need better data structure that supports easy removal, 	TokenNameCOMMENT_LINE	need better data structure that supports easy removal, 
// perhaps a treemap with random indices. 	TokenNameCOMMENT_LINE	perhaps a treemap with random indices. 
private	TokenNameprivate	
TreeMap	TokenNameIdentifier	 Tree Map
<	TokenNameLESS	
Double	TokenNameIdentifier	 Double
,	TokenNameCOMMA	
Instance	TokenNameIdentifier	 Instance
>	TokenNameGREATER	
unlabeled	TokenNameIdentifier	 unlabeled
;	TokenNameSEMICOLON	
private	TokenNameprivate	
RandomAccessDataset	TokenNameIdentifier	 Random Access Dataset
labeled	TokenNameIdentifier	 labeled
;	TokenNameSEMICOLON	
public	TokenNamepublic	
QueryByCommittee	TokenNameIdentifier	 Query By Committee
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
new	TokenNamenew	
DecisionTreeLearner	TokenNameIdentifier	 Decision Tree Learner
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
5	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
QueryByCommittee	TokenNameIdentifier	 Query By Committee
(	TokenNameLPAREN	
BatchClassifierLearner	TokenNameIdentifier	 Batch Classifier Learner
learner	TokenNameIdentifier	 learner
,	TokenNameCOMMA	
int	TokenNameint	
committeeSize	TokenNameIdentifier	 committee Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
committeeLearner	TokenNameIdentifier	 committee Learner
=	TokenNameEQUAL	
new	TokenNamenew	
CommitteeLearner	TokenNameIdentifier	 Committee Learner
(	TokenNameLPAREN	
learner	TokenNameIdentifier	 learner
,	TokenNameCOMMA	
committeeSize	TokenNameIdentifier	 committee Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
innerLearner	TokenNameIdentifier	 inner Learner
=	TokenNameEQUAL	
learner	TokenNameIdentifier	 learner
;	TokenNameSEMICOLON	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
ClassifierLearner	TokenNameIdentifier	 Classifier Learner
copy	TokenNameIdentifier	 copy
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ClassifierLearner	TokenNameIdentifier	 Classifier Learner
learner	TokenNameIdentifier	 learner
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
learner	TokenNameIdentifier	 learner
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ClassifierLearner	TokenNameIdentifier	 Classifier Learner
)	TokenNameRPAREN	
this	TokenNamethis	
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
learner	TokenNameIdentifier	 learner
.	TokenNameDOT	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
return	TokenNamereturn	
learner	TokenNameIdentifier	 learner
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
unlabeled	TokenNameIdentifier	 unlabeled
=	TokenNameEQUAL	
new	TokenNamenew	
TreeMap	TokenNameIdentifier	 Tree Map
<	TokenNameLESS	
Double	TokenNameIdentifier	 Double
,	TokenNameCOMMA	
Instance	TokenNameIdentifier	 Instance
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
labeled	TokenNameIdentifier	 labeled
=	TokenNameEQUAL	
new	TokenNamenew	
RandomAccessDataset	TokenNameIdentifier	 Random Access Dataset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
innerLearner	TokenNameIdentifier	 inner Learner
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
schema	TokenNameIdentifier	 schema
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// 	TokenNameCOMMENT_LINE	 
// active learning code 	TokenNameCOMMENT_LINE	active learning code 
// 	TokenNameCOMMENT_LINE	 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
final	TokenNamefinal	
public	TokenNamepublic	
void	TokenNamevoid	
setInstancePool	TokenNameIdentifier	 set Instance Pool
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Instance	TokenNameIdentifier	 Instance
>	TokenNameGREATER	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
unlabeled	TokenNameIdentifier	 unlabeled
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Random	TokenNameIdentifier	 Random
r	TokenNameIdentifier	 r
=	TokenNameEQUAL	
new	TokenNamenew	
Random	TokenNameIdentifier	 Random
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
unlabeled	TokenNameIdentifier	 unlabeled
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
nextDouble	TokenNameIdentifier	 next Double
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
log	TokenNameIdentifier	 log
.	TokenNameDOT	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
unlabeled	TokenNameIdentifier	 unlabeled
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" unlabeled examples available"	TokenNameStringLiteral	 unlabeled examples available
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
final	TokenNamefinal	
public	TokenNamepublic	
boolean	TokenNameboolean	
hasNextQuery	TokenNameIdentifier	 has Next Query
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
unlabeled	TokenNameIdentifier	 unlabeled
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
final	TokenNamefinal	
public	TokenNamepublic	
Instance	TokenNameIdentifier	 Instance
nextQuery	TokenNameIdentifier	 next Query
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Object	TokenNameIdentifier	 Object
key	TokenNameIdentifier	 key
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
labeled	TokenNameIdentifier	 labeled
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
<	TokenNameLESS	
minLabelsBeforeQuerying	TokenNameIdentifier	 min Labels Before Querying
)	TokenNameRPAREN	
{	TokenNameLBRACE	
log	TokenNameIdentifier	 log
.	TokenNameDOT	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
"will pick next unlabeled example"	TokenNameStringLiteral	will pick next unlabeled example
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
key	TokenNameIdentifier	 key
=	TokenNameEQUAL	
unlabeled	TokenNameIdentifier	 unlabeled
.	TokenNameDOT	
firstKey	TokenNameIdentifier	 first Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
log	TokenNameIdentifier	 log
.	TokenNameDOT	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
"will use committee to pick an unlabeled example"	TokenNameStringLiteral	will use committee to pick an unlabeled example
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Classifier	TokenNameIdentifier	 Classifier
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
committee	TokenNameIdentifier	 committee
=	TokenNameEQUAL	
committeeLearner	TokenNameIdentifier	 committee Learner
.	TokenNameDOT	
batchTrainCommittee	TokenNameIdentifier	 batch Train Committee
(	TokenNameLPAREN	
labeled	TokenNameIdentifier	 labeled
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
key	TokenNameIdentifier	 key
=	TokenNameEQUAL	
keyOfBestUnlabeledInstance	TokenNameIdentifier	 key Of Best Unlabeled Instance
(	TokenNameLPAREN	
committee	TokenNameIdentifier	 committee
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Instance	TokenNameIdentifier	 Instance
query	TokenNameIdentifier	 query
=	TokenNameEQUAL	
unlabeled	TokenNameIdentifier	 unlabeled
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
unlabeled	TokenNameIdentifier	 unlabeled
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
query	TokenNameIdentifier	 query
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
Object	TokenNameIdentifier	 Object
keyOfBestUnlabeledInstance	TokenNameIdentifier	 key Of Best Unlabeled Instance
(	TokenNameLPAREN	
Classifier	TokenNameIdentifier	 Classifier
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
committee	TokenNameIdentifier	 committee
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// find the unlabeled example with the highest level of disagreement 	TokenNameCOMMENT_LINE	find the unlabeled example with the highest level of disagreement 
double	TokenNamedouble	
worstAgreement	TokenNameIdentifier	 worst Agreement
=	TokenNameEQUAL	
2.0	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
Object	TokenNameIdentifier	 Object
queryKey	TokenNameIdentifier	 query Key
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Double	TokenNameIdentifier	 Double
>	TokenNameGREATER	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
unlabeled	TokenNameIdentifier	 unlabeled
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
Object	TokenNameIdentifier	 Object
key	TokenNameIdentifier	 key
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Instance	TokenNameIdentifier	 Instance
instance	TokenNameIdentifier	 instance
=	TokenNameEQUAL	
unlabeled	TokenNameIdentifier	 unlabeled
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
TObjectDoubleHashMap	TokenNameIdentifier	 T Object Double Hash Map
counts	TokenNameIdentifier	 counts
=	TokenNameEQUAL	
new	TokenNamenew	
TObjectDoubleHashMap	TokenNameIdentifier	 T Object Double Hash Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
biggestCount	TokenNameIdentifier	 biggest Count
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
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
committee	TokenNameIdentifier	 committee
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
best	TokenNameIdentifier	 best
=	TokenNameEQUAL	
committee	TokenNameIdentifier	 committee
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
.	TokenNameDOT	
classification	TokenNameIdentifier	 classification
(	TokenNameLPAREN	
instance	TokenNameIdentifier	 instance
)	TokenNameRPAREN	
.	TokenNameDOT	
bestClassName	TokenNameIdentifier	 best Class Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
counts	TokenNameIdentifier	 counts
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
best	TokenNameIdentifier	 best
)	TokenNameRPAREN	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
counts	TokenNameIdentifier	 counts
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
best	TokenNameIdentifier	 best
,	TokenNameCOMMA	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
>	TokenNameGREATER	
biggestCount	TokenNameIdentifier	 biggest Count
)	TokenNameRPAREN	
biggestCount	TokenNameIdentifier	 biggest Count
=	TokenNameEQUAL	
c	TokenNameIdentifier	 c
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
double	TokenNamedouble	
agreement	TokenNameIdentifier	 agreement
=	TokenNameEQUAL	
biggestCount	TokenNameIdentifier	 biggest Count
/	TokenNameDIVIDE	
committee	TokenNameIdentifier	 committee
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
log	TokenNameIdentifier	 log
.	TokenNameDOT	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
"instance: "	TokenNameStringLiteral	instance: 
+	TokenNamePLUS	
instance	TokenNameIdentifier	 instance
+	TokenNamePLUS	
" committee: "	TokenNameStringLiteral	 committee: 
+	TokenNamePLUS	
counts	TokenNameIdentifier	 counts
+	TokenNamePLUS	
" agreement: "	TokenNameStringLiteral	 agreement: 
+	TokenNamePLUS	
agreement	TokenNameIdentifier	 agreement
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
agreement	TokenNameIdentifier	 agreement
<	TokenNameLESS	
worstAgreement	TokenNameIdentifier	 worst Agreement
)	TokenNameRPAREN	
{	TokenNameLBRACE	
worstAgreement	TokenNameIdentifier	 worst Agreement
=	TokenNameEQUAL	
agreement	TokenNameIdentifier	 agreement
;	TokenNameSEMICOLON	
queryKey	TokenNameIdentifier	 query Key
=	TokenNameEQUAL	
key	TokenNameIdentifier	 key
;	TokenNameSEMICOLON	
log	TokenNameIdentifier	 log
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
" ==> best"	TokenNameStringLiteral	 ==> best
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
log	TokenNameIdentifier	 log
.	TokenNameDOT	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
"queryInstance is: "	TokenNameStringLiteral	queryInstance is: 
+	TokenNamePLUS	
unlabeled	TokenNameIdentifier	 unlabeled
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
queryKey	TokenNameIdentifier	 query Key
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
queryKey	TokenNameIdentifier	 query Key
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
addExample	TokenNameIdentifier	 add Example
(	TokenNameLPAREN	
Example	TokenNameIdentifier	 Example
example	TokenNameIdentifier	 example
)	TokenNameRPAREN	
{	TokenNameLBRACE	
log	TokenNameIdentifier	 log
.	TokenNameDOT	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
"adding example: "	TokenNameStringLiteral	adding example: 
+	TokenNamePLUS	
example	TokenNameIdentifier	 example
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
labeled	TokenNameIdentifier	 labeled
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
example	TokenNameIdentifier	 example
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
innerLearner	TokenNameIdentifier	 inner Learner
.	TokenNameDOT	
addExample	TokenNameIdentifier	 add Example
(	TokenNameLPAREN	
example	TokenNameIdentifier	 example
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
innerLearner	TokenNameIdentifier	 inner Learner
.	TokenNameDOT	
completeTraining	TokenNameIdentifier	 complete Training
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// 	TokenNameCOMMENT_LINE	 
// get trained classifier 	TokenNameCOMMENT_LINE	get trained classifier 
// 	TokenNameCOMMENT_LINE	 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
Classifier	TokenNameIdentifier	 Classifier
getClassifier	TokenNameIdentifier	 get Classifier
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
innerLearner	TokenNameIdentifier	 inner Learner
.	TokenNameDOT	
getClassifier	TokenNameIdentifier	 get Classifier
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
