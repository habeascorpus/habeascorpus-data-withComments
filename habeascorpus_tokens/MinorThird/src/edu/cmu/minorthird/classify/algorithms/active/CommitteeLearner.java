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
Random	TokenNameIdentifier	 Random
;	TokenNameSEMICOLON	
/** * Routines for forming and working with committees. * * @author William Cohen */	TokenNameCOMMENT_JAVADOC	 Routines for forming and working with committees. * @author William Cohen 
public	TokenNamepublic	
class	TokenNameclass	
CommitteeLearner	TokenNameIdentifier	 Committee Learner
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
CommitteeLearner	TokenNameIdentifier	 Committee Learner
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
BatchClassifierLearner	TokenNameIdentifier	 Batch Classifier Learner
learner	TokenNameIdentifier	 learner
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
committeeSize	TokenNameIdentifier	 committee Size
;	TokenNameSEMICOLON	
public	TokenNamepublic	
CommitteeLearner	TokenNameIdentifier	 Committee Learner
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
learner	TokenNameIdentifier	 learner
=	TokenNameEQUAL	
learner	TokenNameIdentifier	 learner
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
committeeSize	TokenNameIdentifier	 committee Size
=	TokenNameEQUAL	
committeeSize	TokenNameIdentifier	 committee Size
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Learn a committee */	TokenNameCOMMENT_JAVADOC	 Learn a committee 
public	TokenNamepublic	
Classifier	TokenNameIdentifier	 Classifier
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
batchTrainCommittee	TokenNameIdentifier	 batch Train Committee
(	TokenNameLPAREN	
RandomAccessDataset	TokenNameIdentifier	 Random Access Dataset
data	TokenNameIdentifier	 data
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// build the committee 	TokenNameCOMMENT_LINE	build the committee 
Classifier	TokenNameIdentifier	 Classifier
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
committee	TokenNameIdentifier	 committee
=	TokenNameEQUAL	
new	TokenNamenew	
Classifier	TokenNameIdentifier	 Classifier
[	TokenNameLBRACKET	
committeeSize	TokenNameIdentifier	 committee Size
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
Random	TokenNameIdentifier	 Random
rand	TokenNameIdentifier	 rand
=	TokenNameEQUAL	
new	TokenNamenew	
Random	TokenNameIdentifier	 Random
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
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
committee	TokenNameIdentifier	 committee
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Dataset	TokenNameIdentifier	 Dataset
ithBag	TokenNameIdentifier	 ith Bag
=	TokenNameEQUAL	
bag	TokenNameIdentifier	 bag
(	TokenNameLPAREN	
rand	TokenNameIdentifier	 rand
,	TokenNameCOMMA	
data	TokenNameIdentifier	 data
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
log	TokenNameIdentifier	 log
.	TokenNameDOT	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
"training committee member on "	TokenNameStringLiteral	training committee member on 
+	TokenNamePLUS	
ithBag	TokenNameIdentifier	 ith Bag
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" examples"	TokenNameStringLiteral	 examples
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
committee	TokenNameIdentifier	 committee
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
learner	TokenNameIdentifier	 learner
.	TokenNameDOT	
batchTrain	TokenNameIdentifier	 batch Train
(	TokenNameLPAREN	
ithBag	TokenNameIdentifier	 ith Bag
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
log	TokenNameIdentifier	 log
.	TokenNameDOT	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
"committee member #"	TokenNameStringLiteral	committee member #
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
": "	TokenNameStringLiteral	: 
+	TokenNamePLUS	
committee	TokenNameIdentifier	 committee
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
committee	TokenNameIdentifier	 committee
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
Dataset	TokenNameIdentifier	 Dataset
bag	TokenNameIdentifier	 bag
(	TokenNameLPAREN	
Random	TokenNameIdentifier	 Random
r	TokenNameIdentifier	 r
,	TokenNameCOMMA	
RandomAccessDataset	TokenNameIdentifier	 Random Access Dataset
data	TokenNameIdentifier	 data
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Dataset	TokenNameIdentifier	 Dataset
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
new	TokenNamenew	
BasicDataset	TokenNameIdentifier	 Basic Dataset
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
data	TokenNameIdentifier	 data
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
k	TokenNameIdentifier	 k
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
nextDouble	TokenNameIdentifier	 next Double
(	TokenNameLPAREN	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
log	TokenNameIdentifier	 log
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"bag: add example #"	TokenNameStringLiteral	bag: add example #
+	TokenNamePLUS	
k	TokenNameIdentifier	 k
+	TokenNamePLUS	
": "	TokenNameStringLiteral	: 
+	TokenNamePLUS	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
getExample	TokenNameIdentifier	 get Example
(	TokenNameLPAREN	
k	TokenNameIdentifier	 k
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
getExample	TokenNameIdentifier	 get Example
(	TokenNameLPAREN	
k	TokenNameIdentifier	 k
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
