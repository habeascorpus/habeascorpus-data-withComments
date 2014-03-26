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
linear	TokenNameIdentifier	 linear
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
Set	TokenNameIdentifier	 Set
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
*	TokenNameMULTIPLY	
;	TokenNameSEMICOLON	
/** * Naive Bayes algorithm. If feature weights are word counts then this * implements the usual multinomial naive Bayes. If feature weights * are presence/absence this implements binomial naive Bayes. * * @author William Cohen */	TokenNameCOMMENT_JAVADOC	 Naive Bayes algorithm. If feature weights are word counts then this implements the usual multinomial naive Bayes. If feature weights are presence/absence this implements binomial naive Bayes. * @author William Cohen 
/* * classify with maximum value of of Pr(class|instance) * * Pr(class|instance) = Pr(instance|class)*Pr(class) * = log Pr(instance|class)*Pr(class) * = log prod_f Pr(f|class)*Pr(class) * = sum_f log Pr(f|class) + log Pr(class) * * score is log odds = log( Pr(+|instance) / Pr(-|instance) ) * = sum_f log [Pr(f|+) - Pr(f|-)] + log Pr(+) - log Pr(-i) */	TokenNameCOMMENT_BLOCK	 classify with maximum value of of Pr(class|instance) * Pr(class|instance) = Pr(instance|class)*Pr(class) = log Pr(instance|class)*Pr(class) = log prod_f Pr(f|class)*Pr(class) = sum_f log Pr(f|class) + log Pr(class) * score is log odds = log( Pr(+|instance) / Pr(-|instance) ) = sum_f log [Pr(f|+) - Pr(f|-)] + log Pr(+) - log Pr(-i) 
public	TokenNamepublic	
class	TokenNameclass	
NaiveBayes	TokenNameIdentifier	 Naive Bayes
extends	TokenNameextends	
OnlineBinaryClassifierLearner	TokenNameIdentifier	 Online Binary Classifier Learner
implements	TokenNameimplements	
Serializable	TokenNameIdentifier	 Serializable
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
20080130L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
Logger	TokenNameIdentifier	 Logger
log	TokenNameIdentifier	 log
=	TokenNameEQUAL	
Logger	TokenNameIdentifier	 Logger
.	TokenNameDOT	
getLogger	TokenNameIdentifier	 get Logger
(	TokenNameLPAREN	
NaiveBayes	TokenNameIdentifier	 Naive Bayes
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Hyperplane	TokenNameIdentifier	 Hyperplane
numGivenPos	TokenNameIdentifier	 num Given Pos
,	TokenNameCOMMA	
numGivenNeg	TokenNameIdentifier	 num Given Neg
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
Feature	TokenNameIdentifier	 Feature
>	TokenNameGREATER	
featureSet	TokenNameIdentifier	 feature Set
;	TokenNameSEMICOLON	
private	TokenNameprivate	
double	TokenNamedouble	
numPos	TokenNameIdentifier	 num Pos
,	TokenNameCOMMA	
numNeg	TokenNameIdentifier	 num Neg
;	TokenNameSEMICOLON	
public	TokenNamepublic	
NaiveBayes	TokenNameIdentifier	 Naive Bayes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
log	TokenNameIdentifier	 log
.	TokenNameDOT	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
"resetting NaiveBayes"	TokenNameStringLiteral	resetting NaiveBayes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
numGivenPos	TokenNameIdentifier	 num Given Pos
=	TokenNameEQUAL	
new	TokenNamenew	
Hyperplane	TokenNameIdentifier	 Hyperplane
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
numGivenNeg	TokenNameIdentifier	 num Given Neg
=	TokenNameEQUAL	
new	TokenNamenew	
Hyperplane	TokenNameIdentifier	 Hyperplane
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
featureSet	TokenNameIdentifier	 feature Set
=	TokenNameEQUAL	
new	TokenNamenew	
HashSet	TokenNameIdentifier	 Hash Set
<	TokenNameLESS	
Feature	TokenNameIdentifier	 Feature
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
numPos	TokenNameIdentifier	 num Pos
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
numNeg	TokenNameIdentifier	 num Neg
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
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
boolean	TokenNameboolean	
isPos	TokenNameIdentifier	 is Pos
=	TokenNameEQUAL	
example	TokenNameIdentifier	 example
.	TokenNameDOT	
getLabel	TokenNameIdentifier	 get Label
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
isPositive	TokenNameIdentifier	 is Positive
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
isPos	TokenNameIdentifier	 is Pos
)	TokenNameRPAREN	
numPos	TokenNameIdentifier	 num Pos
+=	TokenNamePLUS_EQUAL	
example	TokenNameIdentifier	 example
.	TokenNameDOT	
getWeight	TokenNameIdentifier	 get Weight
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
numNeg	TokenNameIdentifier	 num Neg
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
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
example	TokenNameIdentifier	 example
.	TokenNameDOT	
featureIterator	TokenNameIdentifier	 feature Iterator
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
Feature	TokenNameIdentifier	 Feature
f	TokenNameIdentifier	 f
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
isPos	TokenNameIdentifier	 is Pos
)	TokenNameRPAREN	
numGivenPos	TokenNameIdentifier	 num Given Pos
.	TokenNameDOT	
increment	TokenNameIdentifier	 increment
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
numGivenNeg	TokenNameIdentifier	 num Given Neg
.	TokenNameDOT	
increment	TokenNameIdentifier	 increment
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
featureSet	TokenNameIdentifier	 feature Set
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
Classifier	TokenNameIdentifier	 Classifier
getClassifier	TokenNameIdentifier	 get Classifier
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Hyperplane	TokenNameIdentifier	 Hyperplane
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
new	TokenNamenew	
Hyperplane	TokenNameIdentifier	 Hyperplane
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Feature	TokenNameIdentifier	 Feature
>	TokenNameGREATER	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
featureSet	TokenNameIdentifier	 feature Set
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
Feature	TokenNameIdentifier	 Feature
f	TokenNameIdentifier	 f
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
featurePrior	TokenNameIdentifier	 feature Prior
=	TokenNameEQUAL	
getFeaturePrior	TokenNameIdentifier	 get Feature Prior
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
m	TokenNameIdentifier	 m
=	TokenNameEQUAL	
getFeaturePriorPseudoCount	TokenNameIdentifier	 get Feature Prior Pseudo Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
pweight	TokenNameIdentifier	 pweight
=	TokenNameEQUAL	
estimatedLogProb	TokenNameIdentifier	 estimated Log Prob
(	TokenNameLPAREN	
numGivenPos	TokenNameIdentifier	 num Given Pos
.	TokenNameDOT	
featureScore	TokenNameIdentifier	 feature Score
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
,	TokenNameCOMMA	
numPos	TokenNameIdentifier	 num Pos
,	TokenNameCOMMA	
featurePrior	TokenNameIdentifier	 feature Prior
,	TokenNameCOMMA	
m	TokenNameIdentifier	 m
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
nweight	TokenNameIdentifier	 nweight
=	TokenNameEQUAL	
estimatedLogProb	TokenNameIdentifier	 estimated Log Prob
(	TokenNameLPAREN	
numGivenNeg	TokenNameIdentifier	 num Given Neg
.	TokenNameDOT	
featureScore	TokenNameIdentifier	 feature Score
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
,	TokenNameCOMMA	
numNeg	TokenNameIdentifier	 num Neg
,	TokenNameCOMMA	
featurePrior	TokenNameIdentifier	 feature Prior
,	TokenNameCOMMA	
m	TokenNameIdentifier	 m
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
increment	TokenNameIdentifier	 increment
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
,	TokenNameCOMMA	
pweight	TokenNameIdentifier	 pweight
-	TokenNameMINUS	
nweight	TokenNameIdentifier	 nweight
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
incrementBias	TokenNameIdentifier	 increment Bias
(	TokenNameLPAREN	
+	TokenNamePLUS	
estimatedLogProb	TokenNameIdentifier	 estimated Log Prob
(	TokenNameLPAREN	
numPos	TokenNameIdentifier	 num Pos
,	TokenNameCOMMA	
numPos	TokenNameIdentifier	 num Pos
+	TokenNamePLUS	
numNeg	TokenNameIdentifier	 num Neg
,	TokenNameCOMMA	
0.5	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
1.0	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
incrementBias	TokenNameIdentifier	 increment Bias
(	TokenNameLPAREN	
-	TokenNameMINUS	
estimatedLogProb	TokenNameIdentifier	 estimated Log Prob
(	TokenNameLPAREN	
numNeg	TokenNameIdentifier	 num Neg
,	TokenNameCOMMA	
numPos	TokenNameIdentifier	 num Pos
+	TokenNamePLUS	
numNeg	TokenNameIdentifier	 num Neg
,	TokenNameCOMMA	
0.5	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
1.0	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// note these weights are multiplied by feature values when classifying, 	TokenNameCOMMENT_LINE	note these weights are multiplied by feature values when classifying, 
// which gives the multinomial Naive Bayes implementation. 	TokenNameCOMMENT_LINE	which gives the multinomial Naive Bayes implementation. 
return	TokenNamereturn	
c	TokenNameIdentifier	 c
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
double	TokenNamedouble	
estimatedLogProb	TokenNameIdentifier	 estimated Log Prob
(	TokenNameLPAREN	
double	TokenNamedouble	
k	TokenNameIdentifier	 k
,	TokenNameCOMMA	
double	TokenNamedouble	
n	TokenNameIdentifier	 n
,	TokenNameCOMMA	
double	TokenNamedouble	
prior	TokenNameIdentifier	 prior
,	TokenNameCOMMA	
double	TokenNamedouble	
pseudoCounts	TokenNameIdentifier	 pseudo Counts
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
(	TokenNameLPAREN	
k	TokenNameIdentifier	 k
+	TokenNamePLUS	
prior	TokenNameIdentifier	 prior
*	TokenNameMULTIPLY	
pseudoCounts	TokenNameIdentifier	 pseudo Counts
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
+	TokenNamePLUS	
pseudoCounts	TokenNameIdentifier	 pseudo Counts
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
double	TokenNamedouble	
getFeaturePrior	TokenNameIdentifier	 get Feature Prior
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
1.0	TokenNameDoubleLiteral	
/	TokenNameDIVIDE	
featureSet	TokenNameIdentifier	 feature Set
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
double	TokenNamedouble	
getFeaturePriorPseudoCount	TokenNameIdentifier	 get Feature Prior Pseudo Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
1.0	TokenNameDoubleLiteral	
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
"[NaiveBayes]"	TokenNameStringLiteral	[NaiveBayes]
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
