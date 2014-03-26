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
io	TokenNameIdentifier	 io
.	TokenNameDOT	
Serializable	TokenNameIdentifier	 Serializable
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
BinaryClassifier	TokenNameIdentifier	 Binary Classifier
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
Explanation	TokenNameIdentifier	 Explanation
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
// java doesn't have structs..so lets try to compact memory by hand. ICK 	TokenNameCOMMENT_LINE	java doesn't have structs..so lets try to compact memory by hand. ICK 
public	TokenNamepublic	
class	TokenNameclass	
CompactDecisionTree	TokenNameIdentifier	 Compact Decision Tree
extends	TokenNameextends	
BinaryClassifier	TokenNameIdentifier	 Binary Classifier
implements	TokenNameimplements	
Serializable	TokenNameIdentifier	 Serializable
//,Visible 	TokenNameCOMMENT_LINE	,Visible 
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
20080609L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
// do we need this? 	TokenNameCOMMENT_LINE	do we need this? 
private	TokenNameprivate	
final	TokenNamefinal	
int	TokenNameint	
initialVectorSize	TokenNameIdentifier	 initial Vector Size
=	TokenNameEQUAL	
10	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
currentElt	TokenNameIdentifier	 current Elt
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
rootNode	TokenNameIdentifier	 root Node
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
void	TokenNamevoid	
setRoot	TokenNameIdentifier	 set Root
(	TokenNameLPAREN	
int	TokenNameint	
root	TokenNameIdentifier	 root
)	TokenNameRPAREN	
{	TokenNameLBRACE	
rootNode	TokenNameIdentifier	 root Node
=	TokenNameEQUAL	
root	TokenNameIdentifier	 root
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// the data 	TokenNameCOMMENT_LINE	the data 
// --------------------------------------------------------- 	TokenNameCOMMENT_LINE	--------------------------------------------------------- 
private	TokenNameprivate	
boolean	TokenNameboolean	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
isLeaf	TokenNameIdentifier	 is Leaf
=	TokenNameEQUAL	
new	TokenNamenew	
boolean	TokenNameboolean	
[	TokenNameLBRACKET	
initialVectorSize	TokenNameIdentifier	 initial Vector Size
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Feature	TokenNameIdentifier	 Feature
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
feature	TokenNameIdentifier	 feature
=	TokenNameEQUAL	
new	TokenNamenew	
Feature	TokenNameIdentifier	 Feature
[	TokenNameLBRACKET	
initialVectorSize	TokenNameIdentifier	 initial Vector Size
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
threshold	TokenNameIdentifier	 threshold
=	TokenNameEQUAL	
new	TokenNamenew	
double	TokenNamedouble	
[	TokenNameLBRACKET	
initialVectorSize	TokenNameIdentifier	 initial Vector Size
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
trueBranch	TokenNameIdentifier	 true Branch
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
initialVectorSize	TokenNameIdentifier	 initial Vector Size
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
falseBranch	TokenNameIdentifier	 false Branch
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
initialVectorSize	TokenNameIdentifier	 initial Vector Size
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
score	TokenNameIdentifier	 score
=	TokenNameEQUAL	
new	TokenNamenew	
double	TokenNamedouble	
[	TokenNameLBRACKET	
initialVectorSize	TokenNameIdentifier	 initial Vector Size
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
/** Print routine */	TokenNameCOMMENT_JAVADOC	 Print routine 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StringBuffer	TokenNameIdentifier	 String Buffer
buf	TokenNameIdentifier	 buf
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
buf	TokenNameIdentifier	 buf
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
StringBuffer	TokenNameIdentifier	 String Buffer
buf	TokenNameIdentifier	 buf
,	TokenNameCOMMA	
int	TokenNameint	
tab	TokenNameIdentifier	 tab
)	TokenNameRPAREN	
{	TokenNameLBRACE	
/* for (int i=0; i<tab; i++) buf.append("| "); if (this instanceof InternalNode) { InternalNode in = (InternalNode)this; buf.append(in.test+">="+in.threshold+":\n"); //in.getTrueBranch().toString(buf,tab+1); //in.getFalseBranch().toString(buf,tab+1); } else { Leaf leaf = (Leaf)this; buf.append(leaf.getScore()+"\n"); } */	TokenNameCOMMENT_BLOCK	 for (int i=0; i<tab; i++) buf.append("| "); if (this instanceof InternalNode) { InternalNode in = (InternalNode)this; buf.append(in.test+">="+in.threshold+":\n"); //in.getTrueBranch().toString(buf,tab+1); //in.getFalseBranch().toString(buf,tab+1); } else { Leaf leaf = (Leaf)this; buf.append(leaf.getScore()+"\n"); } 
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
compactStorage	TokenNameIdentifier	 compact Storage
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// 1.6 code 	TokenNameCOMMENT_LINE	1.6 code 
// isLeaf = Arrays.copyOf(isLeaf, currentElt); 	TokenNameCOMMENT_LINE	isLeaf = Arrays.copyOf(isLeaf, currentElt); 
// score = Arrays.copyOf(score, currentElt); 	TokenNameCOMMENT_LINE	score = Arrays.copyOf(score, currentElt); 
// feature = Arrays.copyOf(feature, currentElt); 	TokenNameCOMMENT_LINE	feature = Arrays.copyOf(feature, currentElt); 
// threshold = Arrays.copyOf(threshold, currentElt); 	TokenNameCOMMENT_LINE	threshold = Arrays.copyOf(threshold, currentElt); 
// trueBranch = Arrays.copyOf(trueBranch, currentElt); 	TokenNameCOMMENT_LINE	trueBranch = Arrays.copyOf(trueBranch, currentElt); 
// falseBranch= Arrays.copyOf(falseBranch, currentElt); 	TokenNameCOMMENT_LINE	falseBranch= Arrays.copyOf(falseBranch, currentElt); 
// Icky 1.5 code 	TokenNameCOMMENT_LINE	Icky 1.5 code 
boolean	TokenNameboolean	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
isLeafTmp	TokenNameIdentifier	 is Leaf Tmp
=	TokenNameEQUAL	
new	TokenNamenew	
boolean	TokenNameboolean	
[	TokenNameLBRACKET	
currentElt	TokenNameIdentifier	 current Elt
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
Feature	TokenNameIdentifier	 Feature
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
featureTmp	TokenNameIdentifier	 feature Tmp
=	TokenNameEQUAL	
new	TokenNamenew	
Feature	TokenNameIdentifier	 Feature
[	TokenNameLBRACKET	
currentElt	TokenNameIdentifier	 current Elt
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
thresholdTmp	TokenNameIdentifier	 threshold Tmp
=	TokenNameEQUAL	
new	TokenNamenew	
double	TokenNamedouble	
[	TokenNameLBRACKET	
currentElt	TokenNameIdentifier	 current Elt
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
trueBranchTmp	TokenNameIdentifier	 true Branch Tmp
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
currentElt	TokenNameIdentifier	 current Elt
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
falseBranchTmp	TokenNameIdentifier	 false Branch Tmp
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
currentElt	TokenNameIdentifier	 current Elt
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
scoreTmp	TokenNameIdentifier	 score Tmp
=	TokenNameEQUAL	
new	TokenNamenew	
double	TokenNamedouble	
[	TokenNameLBRACKET	
currentElt	TokenNameIdentifier	 current Elt
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
isLeaf	TokenNameIdentifier	 is Leaf
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
isLeafTmp	TokenNameIdentifier	 is Leaf Tmp
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
currentElt	TokenNameIdentifier	 current Elt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
feature	TokenNameIdentifier	 feature
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
featureTmp	TokenNameIdentifier	 feature Tmp
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
currentElt	TokenNameIdentifier	 current Elt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
threshold	TokenNameIdentifier	 threshold
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
thresholdTmp	TokenNameIdentifier	 threshold Tmp
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
currentElt	TokenNameIdentifier	 current Elt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
trueBranch	TokenNameIdentifier	 true Branch
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
trueBranchTmp	TokenNameIdentifier	 true Branch Tmp
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
currentElt	TokenNameIdentifier	 current Elt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
falseBranch	TokenNameIdentifier	 false Branch
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
falseBranchTmp	TokenNameIdentifier	 false Branch Tmp
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
currentElt	TokenNameIdentifier	 current Elt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
score	TokenNameIdentifier	 score
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
scoreTmp	TokenNameIdentifier	 score Tmp
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
currentElt	TokenNameIdentifier	 current Elt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
isLeaf	TokenNameIdentifier	 is Leaf
=	TokenNameEQUAL	
isLeafTmp	TokenNameIdentifier	 is Leaf Tmp
;	TokenNameSEMICOLON	
score	TokenNameIdentifier	 score
=	TokenNameEQUAL	
scoreTmp	TokenNameIdentifier	 score Tmp
;	TokenNameSEMICOLON	
feature	TokenNameIdentifier	 feature
=	TokenNameEQUAL	
featureTmp	TokenNameIdentifier	 feature Tmp
;	TokenNameSEMICOLON	
threshold	TokenNameIdentifier	 threshold
=	TokenNameEQUAL	
thresholdTmp	TokenNameIdentifier	 threshold Tmp
;	TokenNameSEMICOLON	
trueBranch	TokenNameIdentifier	 true Branch
=	TokenNameEQUAL	
trueBranchTmp	TokenNameIdentifier	 true Branch Tmp
;	TokenNameSEMICOLON	
falseBranch	TokenNameIdentifier	 false Branch
=	TokenNameEQUAL	
falseBranchTmp	TokenNameIdentifier	 false Branch Tmp
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
expandStorage	TokenNameIdentifier	 expand Storage
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
currentSize	TokenNameIdentifier	 current Size
=	TokenNameEQUAL	
isLeaf	TokenNameIdentifier	 is Leaf
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
// 1.6 code 	TokenNameCOMMENT_LINE	1.6 code 
// isLeaf = Arrays.copyOf(isLeaf, currentSize * 2); 	TokenNameCOMMENT_LINE	isLeaf = Arrays.copyOf(isLeaf, currentSize * 2); 
// score = Arrays.copyOf(score, currentSize * 2); 	TokenNameCOMMENT_LINE	score = Arrays.copyOf(score, currentSize * 2); 
// feature = Arrays.copyOf(feature, currentSize * 2); 	TokenNameCOMMENT_LINE	feature = Arrays.copyOf(feature, currentSize * 2); 
// threshold = Arrays.copyOf(threshold, currentSize * 2); 	TokenNameCOMMENT_LINE	threshold = Arrays.copyOf(threshold, currentSize * 2); 
// trueBranch = Arrays.copyOf(trueBranch, currentSize * 2); 	TokenNameCOMMENT_LINE	trueBranch = Arrays.copyOf(trueBranch, currentSize * 2); 
// falseBranch= Arrays.copyOf(falseBranch, currentSize * 2); 	TokenNameCOMMENT_LINE	falseBranch= Arrays.copyOf(falseBranch, currentSize * 2); 
// 1.5 code 	TokenNameCOMMENT_LINE	1.5 code 
boolean	TokenNameboolean	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
isLeafTmp	TokenNameIdentifier	 is Leaf Tmp
=	TokenNameEQUAL	
new	TokenNamenew	
boolean	TokenNameboolean	
[	TokenNameLBRACKET	
currentSize	TokenNameIdentifier	 current Size
*	TokenNameMULTIPLY	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
Feature	TokenNameIdentifier	 Feature
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
featureTmp	TokenNameIdentifier	 feature Tmp
=	TokenNameEQUAL	
new	TokenNamenew	
Feature	TokenNameIdentifier	 Feature
[	TokenNameLBRACKET	
currentSize	TokenNameIdentifier	 current Size
*	TokenNameMULTIPLY	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
thresholdTmp	TokenNameIdentifier	 threshold Tmp
=	TokenNameEQUAL	
new	TokenNamenew	
double	TokenNamedouble	
[	TokenNameLBRACKET	
currentSize	TokenNameIdentifier	 current Size
*	TokenNameMULTIPLY	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
trueBranchTmp	TokenNameIdentifier	 true Branch Tmp
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
currentSize	TokenNameIdentifier	 current Size
*	TokenNameMULTIPLY	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
falseBranchTmp	TokenNameIdentifier	 false Branch Tmp
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
currentSize	TokenNameIdentifier	 current Size
*	TokenNameMULTIPLY	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
scoreTmp	TokenNameIdentifier	 score Tmp
=	TokenNameEQUAL	
new	TokenNamenew	
double	TokenNamedouble	
[	TokenNameLBRACKET	
currentSize	TokenNameIdentifier	 current Size
*	TokenNameMULTIPLY	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
isLeaf	TokenNameIdentifier	 is Leaf
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
isLeafTmp	TokenNameIdentifier	 is Leaf Tmp
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
currentElt	TokenNameIdentifier	 current Elt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
feature	TokenNameIdentifier	 feature
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
featureTmp	TokenNameIdentifier	 feature Tmp
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
currentElt	TokenNameIdentifier	 current Elt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
threshold	TokenNameIdentifier	 threshold
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
thresholdTmp	TokenNameIdentifier	 threshold Tmp
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
currentElt	TokenNameIdentifier	 current Elt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
trueBranch	TokenNameIdentifier	 true Branch
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
trueBranchTmp	TokenNameIdentifier	 true Branch Tmp
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
currentElt	TokenNameIdentifier	 current Elt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
falseBranch	TokenNameIdentifier	 false Branch
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
falseBranchTmp	TokenNameIdentifier	 false Branch Tmp
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
currentElt	TokenNameIdentifier	 current Elt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
score	TokenNameIdentifier	 score
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
scoreTmp	TokenNameIdentifier	 score Tmp
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
currentElt	TokenNameIdentifier	 current Elt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
isLeaf	TokenNameIdentifier	 is Leaf
=	TokenNameEQUAL	
isLeafTmp	TokenNameIdentifier	 is Leaf Tmp
;	TokenNameSEMICOLON	
score	TokenNameIdentifier	 score
=	TokenNameEQUAL	
scoreTmp	TokenNameIdentifier	 score Tmp
;	TokenNameSEMICOLON	
feature	TokenNameIdentifier	 feature
=	TokenNameEQUAL	
featureTmp	TokenNameIdentifier	 feature Tmp
;	TokenNameSEMICOLON	
threshold	TokenNameIdentifier	 threshold
=	TokenNameEQUAL	
thresholdTmp	TokenNameIdentifier	 threshold Tmp
;	TokenNameSEMICOLON	
trueBranch	TokenNameIdentifier	 true Branch
=	TokenNameEQUAL	
trueBranchTmp	TokenNameIdentifier	 true Branch Tmp
;	TokenNameSEMICOLON	
falseBranch	TokenNameIdentifier	 false Branch
=	TokenNameEQUAL	
falseBranchTmp	TokenNameIdentifier	 false Branch Tmp
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
addInternalNode	TokenNameIdentifier	 add Internal Node
(	TokenNameLPAREN	
Feature	TokenNameIdentifier	 Feature
test	TokenNameIdentifier	 test
,	TokenNameCOMMA	
int	TokenNameint	
ifTrue	TokenNameIdentifier	 if True
,	TokenNameCOMMA	
int	TokenNameint	
ifFalse	TokenNameIdentifier	 if False
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
addInternalNode	TokenNameIdentifier	 add Internal Node
(	TokenNameLPAREN	
test	TokenNameIdentifier	 test
,	TokenNameCOMMA	
0.5	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
ifTrue	TokenNameIdentifier	 if True
,	TokenNameCOMMA	
ifFalse	TokenNameIdentifier	 if False
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
addInternalNode	TokenNameIdentifier	 add Internal Node
(	TokenNameLPAREN	
Feature	TokenNameIdentifier	 Feature
test	TokenNameIdentifier	 test
,	TokenNameCOMMA	
double	TokenNamedouble	
thresh	TokenNameIdentifier	 thresh
,	TokenNameCOMMA	
int	TokenNameint	
ifTrue	TokenNameIdentifier	 if True
,	TokenNameCOMMA	
int	TokenNameint	
ifFalse	TokenNameIdentifier	 if False
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
currentElt	TokenNameIdentifier	 current Elt
==	TokenNameEQUAL_EQUAL	
isLeaf	TokenNameIdentifier	 is Leaf
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
expandStorage	TokenNameIdentifier	 expand Storage
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
isLeaf	TokenNameIdentifier	 is Leaf
[	TokenNameLBRACKET	
currentElt	TokenNameIdentifier	 current Elt
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
score	TokenNameIdentifier	 score
[	TokenNameLBRACKET	
currentElt	TokenNameIdentifier	 current Elt
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
0.0	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
feature	TokenNameIdentifier	 feature
[	TokenNameLBRACKET	
currentElt	TokenNameIdentifier	 current Elt
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
test	TokenNameIdentifier	 test
;	TokenNameSEMICOLON	
threshold	TokenNameIdentifier	 threshold
[	TokenNameLBRACKET	
currentElt	TokenNameIdentifier	 current Elt
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
thresh	TokenNameIdentifier	 thresh
;	TokenNameSEMICOLON	
trueBranch	TokenNameIdentifier	 true Branch
[	TokenNameLBRACKET	
currentElt	TokenNameIdentifier	 current Elt
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
ifTrue	TokenNameIdentifier	 if True
;	TokenNameSEMICOLON	
falseBranch	TokenNameIdentifier	 false Branch
[	TokenNameLBRACKET	
currentElt	TokenNameIdentifier	 current Elt
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
ifFalse	TokenNameIdentifier	 if False
;	TokenNameSEMICOLON	
currentElt	TokenNameIdentifier	 current Elt
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
currentElt	TokenNameIdentifier	 current Elt
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
addLeafNode	TokenNameIdentifier	 add Leaf Node
(	TokenNameLPAREN	
double	TokenNamedouble	
myScore	TokenNameIdentifier	 my Score
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
currentElt	TokenNameIdentifier	 current Elt
==	TokenNameEQUAL_EQUAL	
isLeaf	TokenNameIdentifier	 is Leaf
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
expandStorage	TokenNameIdentifier	 expand Storage
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
isLeaf	TokenNameIdentifier	 is Leaf
[	TokenNameLBRACKET	
currentElt	TokenNameIdentifier	 current Elt
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
score	TokenNameIdentifier	 score
[	TokenNameLBRACKET	
currentElt	TokenNameIdentifier	 current Elt
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
myScore	TokenNameIdentifier	 my Score
;	TokenNameSEMICOLON	
feature	TokenNameIdentifier	 feature
[	TokenNameLBRACKET	
currentElt	TokenNameIdentifier	 current Elt
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
threshold	TokenNameIdentifier	 threshold
[	TokenNameLBRACKET	
currentElt	TokenNameIdentifier	 current Elt
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
trueBranch	TokenNameIdentifier	 true Branch
[	TokenNameLBRACKET	
currentElt	TokenNameIdentifier	 current Elt
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
falseBranch	TokenNameIdentifier	 false Branch
[	TokenNameLBRACKET	
currentElt	TokenNameIdentifier	 current Elt
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
currentElt	TokenNameIdentifier	 current Elt
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
currentElt	TokenNameIdentifier	 current Elt
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
double	TokenNamedouble	
score	TokenNameIdentifier	 score
(	TokenNameLPAREN	
Instance	TokenNameIdentifier	 Instance
instance	TokenNameIdentifier	 instance
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
score	TokenNameIdentifier	 score
(	TokenNameLPAREN	
instance	TokenNameIdentifier	 instance
,	TokenNameCOMMA	
rootNode	TokenNameIdentifier	 root Node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
double	TokenNamedouble	
score	TokenNameIdentifier	 score
(	TokenNameLPAREN	
Instance	TokenNameIdentifier	 Instance
instance	TokenNameIdentifier	 instance
,	TokenNameCOMMA	
int	TokenNameint	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isLeaf	TokenNameIdentifier	 is Leaf
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
score	TokenNameIdentifier	 score
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
getWeight	TokenNameIdentifier	 get Weight
(	TokenNameLPAREN	
feature	TokenNameIdentifier	 feature
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
threshold	TokenNameIdentifier	 threshold
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
score	TokenNameIdentifier	 score
(	TokenNameLPAREN	
instance	TokenNameIdentifier	 instance
,	TokenNameCOMMA	
trueBranch	TokenNameIdentifier	 true Branch
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
score	TokenNameIdentifier	 score
(	TokenNameLPAREN	
instance	TokenNameIdentifier	 instance
,	TokenNameCOMMA	
falseBranch	TokenNameIdentifier	 false Branch
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
String	TokenNameIdentifier	 String
explain	TokenNameIdentifier	 explain
(	TokenNameLPAREN	
Instance	TokenNameIdentifier	 Instance
instance	TokenNameIdentifier	 instance
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
/* if (instance.getWeight(test)>=threshold) { return test+"="+instance.getWeight(test)+">="+threshold+"\n"+ifTrue.explain(instance); } else { return test+"="+instance.getWeight(test)+"<"+threshold+"\n"+ifFalse.explain(instance); }*/	TokenNameCOMMENT_BLOCK	 if (instance.getWeight(test)>=threshold) { return test+"="+instance.getWeight(test)+">="+threshold+"\n"+ifTrue.explain(instance); } else { return test+"="+instance.getWeight(test)+"<"+threshold+"\n"+ifFalse.explain(instance); }
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
Explanation	TokenNameIdentifier	 Explanation
getExplanation	TokenNameIdentifier	 get Explanation
(	TokenNameLPAREN	
Instance	TokenNameIdentifier	 Instance
instance	TokenNameIdentifier	 instance
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Explanation	TokenNameIdentifier	 Explanation
.	TokenNameDOT	
Node	TokenNameIdentifier	 Node
top	TokenNameIdentifier	 top
=	TokenNameEQUAL	
new	TokenNamenew	
Explanation	TokenNameIdentifier	 Explanation
.	TokenNameDOT	
Node	TokenNameIdentifier	 Node
(	TokenNameLPAREN	
"DecisionTree Explanation"	TokenNameStringLiteral	DecisionTree Explanation
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/* if (instance.getWeight(test)>=threshold) { Explanation.Node node = new Explanation.Node( test+"="+instance.getWeight(test)+">="+threshold ); Explanation.Node childEx = ifTrue.getExplanation(instance).getTopNode(); node.add(childEx); top.add(node); } else { Explanation.Node node = new Explanation.Node(test+"="+instance.getWeight(test)+"<"+threshold); Explanation.Node childEx = ifFalse.getExplanation(instance).getTopNode(); node.add(childEx); top.add(node); } */	TokenNameCOMMENT_BLOCK	 if (instance.getWeight(test)>=threshold) { Explanation.Node node = new Explanation.Node( test+"="+instance.getWeight(test)+">="+threshold ); Explanation.Node childEx = ifTrue.getExplanation(instance).getTopNode(); node.add(childEx); top.add(node); } else { Explanation.Node node = new Explanation.Node(test+"="+instance.getWeight(test)+"<"+threshold); Explanation.Node childEx = ifFalse.getExplanation(instance).getTopNode(); node.add(childEx); top.add(node); } 
Explanation	TokenNameIdentifier	 Explanation
ex	TokenNameIdentifier	 ex
=	TokenNameEQUAL	
new	TokenNamenew	
Explanation	TokenNameIdentifier	 Explanation
(	TokenNameLPAREN	
top	TokenNameIdentifier	 top
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
ex	TokenNameIdentifier	 ex
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* public Viewer toGUI() { Viewer v = new TreeViewer(); v.setContent(this); return v; } */	TokenNameCOMMENT_BLOCK	 public Viewer toGUI() { Viewer v = new TreeViewer(); v.setContent(this); return v; } 
/* public Explanation getExplanation(Instance instance) { Explanation.Node top = new Explanation.Node("leaf: " +myScore); Explanation ex = new Explanation(top); return ex; } */	TokenNameCOMMENT_BLOCK	 public Explanation getExplanation(Instance instance) { Explanation.Node top = new Explanation.Node("leaf: " +myScore); Explanation ex = new Explanation(top); return ex; } 
/* public static class TreeViewer extends ComponentViewer { public JComponent componentFor(Object o) { DecisionTree dtree = (DecisionTree)o; DefaultMutableTreeNode top = createNodes(dtree); final JTree jtree = new JTree(top); jtree.addTreeSelectionListener(new TreeSelectionListener() { public void valueChanged(TreeSelectionEvent e) { DefaultMutableTreeNode node = (DefaultMutableTreeNode)jtree.getLastSelectedPathComponent(); Object nodeInfo = node.getUserObject(); if (nodeInfo instanceof InternalNode) { sendSignal(OBJECT_SELECTED, ((InternalNode)nodeInfo).test); } } }); return new JScrollPane(jtree); } private DefaultMutableTreeNode createNodes(DecisionTree dtree) { if (dtree instanceof Leaf) { return new DefaultMutableTreeNode(dtree); } else { InternalNode internal = (InternalNode)dtree; DefaultMutableTreeNode n = new DefaultMutableTreeNode(internal); n.add( createNodes(internal.ifTrue) ); n.add( createNodes(internal.ifFalse) ); return n; } } } */	TokenNameCOMMENT_BLOCK	 public static class TreeViewer extends ComponentViewer { public JComponent componentFor(Object o) { DecisionTree dtree = (DecisionTree)o; DefaultMutableTreeNode top = createNodes(dtree); final JTree jtree = new JTree(top); jtree.addTreeSelectionListener(new TreeSelectionListener() { public void valueChanged(TreeSelectionEvent e) { DefaultMutableTreeNode node = (DefaultMutableTreeNode)jtree.getLastSelectedPathComponent(); Object nodeInfo = node.getUserObject(); if (nodeInfo instanceof InternalNode) { sendSignal(OBJECT_SELECTED, ((InternalNode)nodeInfo).test); } } }); return new JScrollPane(jtree); } private DefaultMutableTreeNode createNodes(DecisionTree dtree) { if (dtree instanceof Leaf) { return new DefaultMutableTreeNode(dtree); } else { InternalNode internal = (InternalNode)dtree; DefaultMutableTreeNode n = new DefaultMutableTreeNode(internal); n.add( createNodes(internal.ifTrue) ); n.add( createNodes(internal.ifFalse) ); return n; } } } 
}	TokenNameRBRACE	
