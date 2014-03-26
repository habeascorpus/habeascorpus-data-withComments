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
/** * A ranking method based on a voted perceptron. */	TokenNameCOMMENT_JAVADOC	 A ranking method based on a voted perceptron. 
public	TokenNamepublic	
class	TokenNameclass	
RankingPerceptron	TokenNameIdentifier	 Ranking Perceptron
extends	TokenNameextends	
BatchRankingLearner	TokenNameIdentifier	 Batch Ranking Learner
{	TokenNameLBRACE	
private	TokenNameprivate	
int	TokenNameint	
numEpochs	TokenNameIdentifier	 num Epochs
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
double	TokenNamedouble	
MARGIN	TokenNameIdentifier	 MARGIN
=	TokenNameEQUAL	
0.1	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
RankingPerceptron	TokenNameIdentifier	 Ranking Perceptron
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
100	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
RankingPerceptron	TokenNameIdentifier	 Ranking Perceptron
(	TokenNameLPAREN	
int	TokenNameint	
numEpochs	TokenNameIdentifier	 num Epochs
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
numEpochs	TokenNameIdentifier	 num Epochs
=	TokenNameEQUAL	
numEpochs	TokenNameIdentifier	 num Epochs
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
Hyperplane	TokenNameIdentifier	 Hyperplane
h	TokenNameIdentifier	 h
=	TokenNameEQUAL	
new	TokenNamenew	
Hyperplane	TokenNameIdentifier	 Hyperplane
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Hyperplane	TokenNameIdentifier	 Hyperplane
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
new	TokenNamenew	
Hyperplane	TokenNameIdentifier	 Hyperplane
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
numUpdates	TokenNameIdentifier	 num Updates
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
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
listsWithOneExampleEach	TokenNameIdentifier	 lists With One Example Each
(	TokenNameLPAREN	
splitIntoRankings	TokenNameIdentifier	 split Into Rankings
(	TokenNameLPAREN	
data	TokenNameIdentifier	 data
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//Map rankingMap = splitIntoRankings(data); 	TokenNameCOMMENT_LINE	Map rankingMap = splitIntoRankings(data); 
ProgressCounter	TokenNameIdentifier	 Progress Counter
pc	TokenNameIdentifier	 pc
=	TokenNameEQUAL	
new	TokenNamenew	
ProgressCounter	TokenNameIdentifier	 Progress Counter
(	TokenNameLPAREN	
"perceptron training"	TokenNameStringLiteral	perceptron training
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
rankingMap	TokenNameIdentifier	 ranking Map
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
subpop	TokenNameIdentifier	 subpop
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
numUpdates	TokenNameIdentifier	 num Updates
+=	TokenNamePLUS_EQUAL	
batchTrainSubPop	TokenNameIdentifier	 batch Train Sub Pop
(	TokenNameLPAREN	
h	TokenNameIdentifier	 h
,	TokenNameCOMMA	
s	TokenNameIdentifier	 s
,	TokenNameCOMMA	
ranking	TokenNameIdentifier	 ranking
)	TokenNameRPAREN	
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
// turn sum hyperplane into an average 	TokenNameCOMMENT_LINE	turn sum hyperplane into an average 
s	TokenNameIdentifier	 s
.	TokenNameDOT	
multiply	TokenNameIdentifier	 multiply
(	TokenNameLPAREN	
1.0	TokenNameDoubleLiteral	
/	TokenNameDIVIDE	
(	TokenNameLPAREN	
numUpdates	TokenNameIdentifier	 num Updates
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//new ViewerFrame("hyperplane", s.toGUI()); 	TokenNameCOMMENT_LINE	new ViewerFrame("hyperplane", s.toGUI()); 
return	TokenNamereturn	
s	TokenNameIdentifier	 s
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// return the number of times h has been updated 	TokenNameCOMMENT_LINE	return the number of times h has been updated 
private	TokenNameprivate	
int	TokenNameint	
batchTrainSubPop	TokenNameIdentifier	 batch Train Sub Pop
(	TokenNameLPAREN	
Hyperplane	TokenNameIdentifier	 Hyperplane
h	TokenNameIdentifier	 h
,	TokenNameCOMMA	
Hyperplane	TokenNameIdentifier	 Hyperplane
s	TokenNameIdentifier	 s
,	TokenNameCOMMA	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Example	TokenNameIdentifier	 Example
>	TokenNameGREATER	
ranking	TokenNameIdentifier	 ranking
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sortByScore	TokenNameIdentifier	 sort By Score
(	TokenNameLPAREN	
h	TokenNameIdentifier	 h
,	TokenNameCOMMA	
ranking	TokenNameIdentifier	 ranking
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
updates	TokenNameIdentifier	 updates
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// int highestNegativeIndex = ranking.size(); 	TokenNameCOMMENT_LINE	int highestNegativeIndex = ranking.size(); 
Example	TokenNameIdentifier	 Example
highestNegativeExample	TokenNameIdentifier	 highest Negative Example
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
exi	TokenNameIdentifier	 exi
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
exi	TokenNameIdentifier	 exi
.	TokenNameDOT	
getLabel	TokenNameIdentifier	 get Label
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
isNegative	TokenNameIdentifier	 is Negative
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// highestNegativeIndex = i; 	TokenNameCOMMENT_LINE	highestNegativeIndex = i; 
highestNegativeExample	TokenNameIdentifier	 highest Negative Example
=	TokenNameEQUAL	
ranking	TokenNameIdentifier	 ranking
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// look for positive example, update 	TokenNameCOMMENT_LINE	look for positive example, update 
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
exi	TokenNameIdentifier	 exi
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
exi	TokenNameIdentifier	 exi
.	TokenNameDOT	
getLabel	TokenNameIdentifier	 get Label
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
isPositive	TokenNameIdentifier	 is Positive
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
highestNegativeExample	TokenNameIdentifier	 highest Negative Example
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
h	TokenNameIdentifier	 h
.	TokenNameDOT	
score	TokenNameIdentifier	 score
(	TokenNameLPAREN	
exi	TokenNameIdentifier	 exi
)	TokenNameRPAREN	
<	TokenNameLESS	
h	TokenNameIdentifier	 h
.	TokenNameDOT	
score	TokenNameIdentifier	 score
(	TokenNameLPAREN	
highestNegativeExample	TokenNameIdentifier	 highest Negative Example
)	TokenNameRPAREN	
+	TokenNamePLUS	
MARGIN	TokenNameIdentifier	 MARGIN
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//if (i>highestNegativeIndex) { 	TokenNameCOMMENT_LINE	if (i>highestNegativeIndex) { 
// the positive example is ranked below the 	TokenNameCOMMENT_LINE	the positive example is ranked below the 
// highestNegativeExample, which is incorrect 	TokenNameCOMMENT_LINE	highestNegativeExample, which is incorrect 
Example	TokenNameIdentifier	 Example
pos	TokenNameIdentifier	 pos
=	TokenNameEQUAL	
ranking	TokenNameIdentifier	 ranking
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
h	TokenNameIdentifier	 h
.	TokenNameDOT	
increment	TokenNameIdentifier	 increment
(	TokenNameLPAREN	
highestNegativeExample	TokenNameIdentifier	 highest Negative Example
,	TokenNameCOMMA	
-	TokenNameMINUS	
1.0	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
h	TokenNameIdentifier	 h
.	TokenNameDOT	
increment	TokenNameIdentifier	 increment
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
,	TokenNameCOMMA	
+	TokenNamePLUS	
1.0	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
increment	TokenNameIdentifier	 increment
(	TokenNameLPAREN	
h	TokenNameIdentifier	 h
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
updates	TokenNameIdentifier	 updates
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
updates	TokenNameIdentifier	 updates
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
