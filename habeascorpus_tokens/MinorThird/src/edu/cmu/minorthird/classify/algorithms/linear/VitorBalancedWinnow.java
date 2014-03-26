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
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
Serializable	TokenNameIdentifier	 Serializable
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Iterator	TokenNameIdentifier	 Iterator
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
ClassLabel	TokenNameIdentifier	 Class Label
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
import	TokenNameimport	
edu	TokenNameIdentifier	 edu
.	TokenNameDOT	
cmu	TokenNameIdentifier	 cmu
.	TokenNameDOT	
minorthird	TokenNameIdentifier	 minorthird
.	TokenNameDOT	
classify	TokenNameIdentifier	 classify
.	TokenNameDOT	
MutableInstance	TokenNameIdentifier	 Mutable Instance
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
OnlineBinaryClassifierLearner	TokenNameIdentifier	 Online Binary Classifier Learner
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
SmartVanillaViewer	TokenNameIdentifier	 Smart Vanilla Viewer
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
TransformedViewer	TokenNameIdentifier	 Transformed Viewer
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
Viewer	TokenNameIdentifier	 Viewer
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
Visible	TokenNameIdentifier	 Visible
;	TokenNameSEMICOLON	
/** * Created on Sep 22, 2005 * * @author Vitor R. Carvalho * * Implements the modified version of the Balanced Winnow algorithm (MBW), following the * ideas described in "Improving Winnow for NLP Tasks: Voting Schemes, * Regret Minimization and Online Feature Selection", Vitor Carvalho, William Cohen * and Avrim Blum, CMU Technical Report 2006 * * A Modified version of the Balanced Winnow algorithm, as described in "Learning Quickly when Irrelevant * Attributes Abound: a new linear-threshold algorithm", N. Littlestone, Machine * Learning, 1988. One of the modifications is based on the "thick-Margin trick used in * "Mistake-Driven Learning in Text Categorization", I. Dagan, Y. Karov, D. Roth, EMNLP, 1997 * * Additionally, it implements the Voting scheme (averaged hypothesis). * Please check the "voted" parameter for that. * */	TokenNameCOMMENT_JAVADOC	 Created on Sep 22, 2005 * @author Vitor R. Carvalho * Implements the modified version of the Balanced Winnow algorithm (MBW), following the ideas described in "Improving Winnow for NLP Tasks: Voting Schemes, Regret Minimization and Online Feature Selection", Vitor Carvalho, William Cohen and Avrim Blum, CMU Technical Report 2006 * A Modified version of the Balanced Winnow algorithm, as described in "Learning Quickly when Irrelevant Attributes Abound: a new linear-threshold algorithm", N. Littlestone, Machine Learning, 1988. One of the modifications is based on the "thick-Margin trick used in "Mistake-Driven Learning in Text Categorization", I. Dagan, Y. Karov, D. Roth, EMNLP, 1997 * Additionally, it implements the Voting scheme (averaged hypothesis). Please check the "voted" parameter for that. 
public	TokenNamepublic	
class	TokenNameclass	
VitorBalancedWinnow	TokenNameIdentifier	 Vitor Balanced Winnow
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
20071130L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Hyperplane	TokenNameIdentifier	 Hyperplane
pos_t	TokenNameIdentifier	 pos t
,	TokenNameCOMMA	
neg_t	TokenNameIdentifier	 neg t
;	TokenNameSEMICOLON	
//positive hyperplane 	TokenNameCOMMENT_LINE	positive hyperplane 
private	TokenNameprivate	
Hyperplane	TokenNameIdentifier	 Hyperplane
vpos_t	TokenNameIdentifier	 vpos t
,	TokenNameCOMMA	
vneg_t	TokenNameIdentifier	 vneg t
;	TokenNameSEMICOLON	
//voted hyperplanes 	TokenNameCOMMENT_LINE	voted hyperplanes 
private	TokenNameprivate	
double	TokenNamedouble	
theta	TokenNameIdentifier	 theta
=	TokenNameEQUAL	
1.0	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
//threshold parameter (positive value) 	TokenNameCOMMENT_LINE	threshold parameter (positive value) 
private	TokenNameprivate	
double	TokenNamedouble	
alpha	TokenNameIdentifier	 alpha
;	TokenNameSEMICOLON	
//promotion parameter (positive value, larger than 1) 	TokenNameCOMMENT_LINE	promotion parameter (positive value, larger than 1) 
private	TokenNameprivate	
double	TokenNamedouble	
beta	TokenNameIdentifier	 beta
;	TokenNameSEMICOLON	
//demotion parameter (positive value, between 0 and 1) 	TokenNameCOMMENT_LINE	demotion parameter (positive value, between 0 and 1) 
private	TokenNameprivate	
int	TokenNameint	
excount	TokenNameIdentifier	 excount
;	TokenNameSEMICOLON	
//example counter: number of examples presented to the learner so far 	TokenNameCOMMENT_LINE	example counter: number of examples presented to the learner so far 
private	TokenNameprivate	
double	TokenNamedouble	
margin	TokenNameIdentifier	 margin
=	TokenNameEQUAL	
1.0	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
voted	TokenNameIdentifier	 voted
;	TokenNameSEMICOLON	
//voted mode 	TokenNameCOMMENT_LINE	voted mode 
private	TokenNameprivate	
double	TokenNamedouble	
W_MAX	TokenNameIdentifier	 W  MAX
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
pow	TokenNameIdentifier	 pow
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
200	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
W_MIN	TokenNameIdentifier	 W  MIN
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
/	TokenNameDIVIDE	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
pow	TokenNameIdentifier	 pow
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
200	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//over-underflow ceiling 	TokenNameCOMMENT_LINE	over-underflow ceiling 
private	TokenNameprivate	
int	TokenNameint	
votedCount	TokenNameIdentifier	 voted Count
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
//number of hyperplanes to vote 	TokenNameCOMMENT_LINE	number of hyperplanes to vote 
/** * Constructor */	TokenNameCOMMENT_JAVADOC	 Constructor 
public	TokenNamepublic	
VitorBalancedWinnow	TokenNameIdentifier	 Vitor Balanced Winnow
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
1.5	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
0.5	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//non-voted: recommended 	TokenNameCOMMENT_LINE	non-voted: recommended 
// this(1.5, 0.5, true);//voted: recommended 	TokenNameCOMMENT_LINE	this(1.5, 0.5, true);//voted: recommended 
}	TokenNameRBRACE	
/** * Constructor: voted="true" (more stable) or "false"(more aggressive) * @param voted */	TokenNameCOMMENT_JAVADOC	 Constructor: voted="true" (more stable) or "false"(more aggressive) @param voted 
public	TokenNamepublic	
VitorBalancedWinnow	TokenNameIdentifier	 Vitor Balanced Winnow
(	TokenNameLPAREN	
boolean	TokenNameboolean	
voted	TokenNameIdentifier	 voted
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
1.5	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
0.5	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
voted	TokenNameIdentifier	 voted
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
VitorBalancedWinnow	TokenNameIdentifier	 Vitor Balanced Winnow
(	TokenNameLPAREN	
double	TokenNamedouble	
alpha	TokenNameIdentifier	 alpha
,	TokenNameCOMMA	
double	TokenNamedouble	
beta	TokenNameIdentifier	 beta
,	TokenNameCOMMA	
boolean	TokenNameboolean	
voted	TokenNameIdentifier	 voted
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
alpha	TokenNameIdentifier	 alpha
<	TokenNameLESS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
beta	TokenNameIdentifier	 beta
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
beta	TokenNameIdentifier	 beta
>	TokenNameGREATER	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Error in BalancedWinnow initial parameters"	TokenNameStringLiteral	Error in BalancedWinnow initial parameters
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"invalid parameter initializing VitorBalancedWinnow. Possible Problema: (theta<0)||(alpha < 1)||(beta<0)||(beta>1)"	TokenNameStringLiteral	invalid parameter initializing VitorBalancedWinnow. Possible Problema: (theta<0)||(alpha < 1)||(beta<0)||(beta>1)
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
alpha	TokenNameIdentifier	 alpha
=	TokenNameEQUAL	
alpha	TokenNameIdentifier	 alpha
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
beta	TokenNameIdentifier	 beta
=	TokenNameEQUAL	
beta	TokenNameIdentifier	 beta
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
voted	TokenNameIdentifier	 voted
=	TokenNameEQUAL	
voted	TokenNameIdentifier	 voted
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
pos_t	TokenNameIdentifier	 pos t
=	TokenNameEQUAL	
new	TokenNamenew	
Hyperplane	TokenNameIdentifier	 Hyperplane
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
neg_t	TokenNameIdentifier	 neg t
=	TokenNameEQUAL	
new	TokenNamenew	
Hyperplane	TokenNameIdentifier	 Hyperplane
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
excount	TokenNameIdentifier	 excount
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
votedCount	TokenNameIdentifier	 voted Count
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
voted	TokenNameIdentifier	 voted
)	TokenNameRPAREN	
{	TokenNameLBRACE	
vpos_t	TokenNameIdentifier	 vpos t
=	TokenNameEQUAL	
new	TokenNamenew	
Hyperplane	TokenNameIdentifier	 Hyperplane
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
vneg_t	TokenNameIdentifier	 vneg t
=	TokenNameEQUAL	
new	TokenNamenew	
Hyperplane	TokenNameIdentifier	 Hyperplane
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
addExample	TokenNameIdentifier	 add Example
(	TokenNameLPAREN	
Example	TokenNameIdentifier	 Example
example2	TokenNameIdentifier	 example2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
excount	TokenNameIdentifier	 excount
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
//example counter 	TokenNameCOMMENT_LINE	example counter 
Example	TokenNameIdentifier	 Example
example	TokenNameIdentifier	 example
=	TokenNameEQUAL	
Winnow	TokenNameIdentifier	 Winnow
.	TokenNameDOT	
normalizeWeights	TokenNameIdentifier	 normalize Weights
(	TokenNameLPAREN	
example2	TokenNameIdentifier	 example2
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//add new feautures to hyperplane 	TokenNameCOMMENT_LINE	add new feautures to hyperplane 
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
asInstance	TokenNameIdentifier	 as Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
featureIterator	TokenNameIdentifier	 feature Iterator
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
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
pos_t	TokenNameIdentifier	 pos t
.	TokenNameDOT	
hasFeature	TokenNameIdentifier	 has Feature
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
pos_t	TokenNameIdentifier	 pos t
.	TokenNameDOT	
increment	TokenNameIdentifier	 increment
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
,	TokenNameCOMMA	
2.0	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//initialize weights to 2 	TokenNameCOMMENT_LINE	initialize weights to 2 
neg_t	TokenNameIdentifier	 neg t
.	TokenNameDOT	
increment	TokenNameIdentifier	 increment
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
,	TokenNameCOMMA	
1.0	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//initialize weights to 1 	TokenNameCOMMENT_LINE	initialize weights to 1 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
//get label and prediction 	TokenNameCOMMENT_LINE	get label and prediction 
double	TokenNamedouble	
y_t	TokenNameIdentifier	 y t
=	TokenNameEQUAL	
example	TokenNameIdentifier	 example
.	TokenNameDOT	
getLabel	TokenNameIdentifier	 get Label
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
numericLabel	TokenNameIdentifier	 numeric Label
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
y_t_hat	TokenNameIdentifier	 y t hat
=	TokenNameEQUAL	
pos_t	TokenNameIdentifier	 pos t
.	TokenNameDOT	
score	TokenNameIdentifier	 score
(	TokenNameLPAREN	
example	TokenNameIdentifier	 example
.	TokenNameDOT	
asInstance	TokenNameIdentifier	 as Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
neg_t	TokenNameIdentifier	 neg t
.	TokenNameDOT	
score	TokenNameIdentifier	 score
(	TokenNameLPAREN	
example	TokenNameIdentifier	 example
.	TokenNameDOT	
asInstance	TokenNameIdentifier	 as Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
theta	TokenNameIdentifier	 theta
;	TokenNameSEMICOLON	
//winnow update rule 	TokenNameCOMMENT_LINE	winnow update rule 
if	TokenNameif	
(	TokenNameLPAREN	
y_t	TokenNameIdentifier	 y t
*	TokenNameMULTIPLY	
y_t_hat	TokenNameIdentifier	 y t hat
<=	TokenNameLESS_EQUAL	
margin	TokenNameIdentifier	 margin
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//if error occurred 	TokenNameCOMMENT_LINE	if error occurred 
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
voted	TokenNameIdentifier	 voted
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
votedCount	TokenNameIdentifier	 voted Count
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
updateVotedHyperplane	TokenNameIdentifier	 update Voted Hyperplane
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
updateVotedHyperplane	TokenNameIdentifier	 update Voted Hyperplane
(	TokenNameLPAREN	
votedCount	TokenNameIdentifier	 voted Count
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
votedCount	TokenNameIdentifier	 voted Count
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
example	TokenNameIdentifier	 example
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
featureIterator	TokenNameIdentifier	 feature Iterator
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
//under and overflow - ceiling 	TokenNameCOMMENT_LINE	under and overflow - ceiling 
if	TokenNameif	
(	TokenNameLPAREN	
pos_t	TokenNameIdentifier	 pos t
.	TokenNameDOT	
featureScore	TokenNameIdentifier	 feature Score
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
<	TokenNameLESS	
W_MAX	TokenNameIdentifier	 W  MAX
)	TokenNameRPAREN	
pos_t	TokenNameIdentifier	 pos t
.	TokenNameDOT	
multiply	TokenNameIdentifier	 multiply
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
,	TokenNameCOMMA	
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
+	TokenNamePLUS	
example	TokenNameIdentifier	 example
.	TokenNameDOT	
getWeight	TokenNameIdentifier	 get Weight
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
alpha	TokenNameIdentifier	 alpha
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
neg_t	TokenNameIdentifier	 neg t
.	TokenNameDOT	
featureScore	TokenNameIdentifier	 feature Score
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
>	TokenNameGREATER	
W_MIN	TokenNameIdentifier	 W  MIN
)	TokenNameRPAREN	
neg_t	TokenNameIdentifier	 neg t
.	TokenNameDOT	
multiply	TokenNameIdentifier	 multiply
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
,	TokenNameCOMMA	
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
-	TokenNameMINUS	
example	TokenNameIdentifier	 example
.	TokenNameDOT	
getWeight	TokenNameIdentifier	 get Weight
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
beta	TokenNameIdentifier	 beta
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
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
featureIterator	TokenNameIdentifier	 feature Iterator
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
if	TokenNameif	
(	TokenNameLPAREN	
pos_t	TokenNameIdentifier	 pos t
.	TokenNameDOT	
featureScore	TokenNameIdentifier	 feature Score
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
>	TokenNameGREATER	
W_MIN	TokenNameIdentifier	 W  MIN
)	TokenNameRPAREN	
pos_t	TokenNameIdentifier	 pos t
.	TokenNameDOT	
multiply	TokenNameIdentifier	 multiply
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
,	TokenNameCOMMA	
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
-	TokenNameMINUS	
example	TokenNameIdentifier	 example
.	TokenNameDOT	
getWeight	TokenNameIdentifier	 get Weight
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
beta	TokenNameIdentifier	 beta
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
neg_t	TokenNameIdentifier	 neg t
.	TokenNameDOT	
featureScore	TokenNameIdentifier	 feature Score
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
<	TokenNameLESS	
W_MAX	TokenNameIdentifier	 W  MAX
)	TokenNameRPAREN	
neg_t	TokenNameIdentifier	 neg t
.	TokenNameDOT	
multiply	TokenNameIdentifier	 multiply
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
,	TokenNameCOMMA	
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
+	TokenNamePLUS	
example	TokenNameIdentifier	 example
.	TokenNameDOT	
getWeight	TokenNameIdentifier	 get Weight
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
alpha	TokenNameIdentifier	 alpha
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
//no error occurred 	TokenNameCOMMENT_LINE	no error occurred 
if	TokenNameif	
(	TokenNameLPAREN	
voted	TokenNameIdentifier	 voted
)	TokenNameRPAREN	
{	TokenNameLBRACE	
votedCount	TokenNameIdentifier	 voted Count
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
//add pos_t*count to the official hyperplane 	TokenNameCOMMENT_LINE	add pos_t*count to the official hyperplane 
public	TokenNamepublic	
void	TokenNamevoid	
updateVotedHyperplane	TokenNameIdentifier	 update Voted Hyperplane
(	TokenNameLPAREN	
int	TokenNameint	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
{	TokenNameLBRACE	
vpos_t	TokenNameIdentifier	 vpos t
.	TokenNameDOT	
increment	TokenNameIdentifier	 increment
(	TokenNameLPAREN	
pos_t	TokenNameIdentifier	 pos t
,	TokenNameCOMMA	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//vpos_t = vpos_t + (pos_t*count) 	TokenNameCOMMENT_LINE	vpos_t = vpos_t + (pos_t*count) 
vneg_t	TokenNameIdentifier	 vneg t
.	TokenNameDOT	
increment	TokenNameIdentifier	 increment
(	TokenNameLPAREN	
neg_t	TokenNameIdentifier	 neg t
,	TokenNameCOMMA	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
votedCount	TokenNameIdentifier	 voted Count
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
Classifier	TokenNameIdentifier	 Classifier
getClassifier	TokenNameIdentifier	 get Classifier
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
voted	TokenNameIdentifier	 voted
)	TokenNameRPAREN	
{	TokenNameLBRACE	
updateVotedHyperplane	TokenNameIdentifier	 update Voted Hyperplane
(	TokenNameLPAREN	
votedCount	TokenNameIdentifier	 voted Count
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//first, update it 	TokenNameCOMMENT_LINE	first, update it 
Hyperplane	TokenNameIdentifier	 Hyperplane
zpos	TokenNameIdentifier	 zpos
=	TokenNameEQUAL	
new	TokenNamenew	
Hyperplane	TokenNameIdentifier	 Hyperplane
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Hyperplane	TokenNameIdentifier	 Hyperplane
zneg	TokenNameIdentifier	 zneg
=	TokenNameEQUAL	
new	TokenNamenew	
Hyperplane	TokenNameIdentifier	 Hyperplane
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
zpos	TokenNameIdentifier	 zpos
.	TokenNameDOT	
increment	TokenNameIdentifier	 increment
(	TokenNameLPAREN	
vpos_t	TokenNameIdentifier	 vpos t
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
/	TokenNameDIVIDE	
(	TokenNameLPAREN	
double	TokenNamedouble	
)	TokenNameRPAREN	
excount	TokenNameIdentifier	 excount
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
zneg	TokenNameIdentifier	 zneg
.	TokenNameDOT	
increment	TokenNameIdentifier	 increment
(	TokenNameLPAREN	
vneg_t	TokenNameIdentifier	 vneg t
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
/	TokenNameDIVIDE	
(	TokenNameLPAREN	
double	TokenNamedouble	
)	TokenNameRPAREN	
excount	TokenNameIdentifier	 excount
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
MyClassifier	TokenNameIdentifier	 My Classifier
(	TokenNameLPAREN	
zpos	TokenNameIdentifier	 zpos
,	TokenNameCOMMA	
zneg	TokenNameIdentifier	 zneg
,	TokenNameCOMMA	
theta	TokenNameIdentifier	 theta
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
MyClassifier	TokenNameIdentifier	 My Classifier
(	TokenNameLPAREN	
pos_t	TokenNameIdentifier	 pos t
,	TokenNameCOMMA	
neg_t	TokenNameIdentifier	 neg t
,	TokenNameCOMMA	
theta	TokenNameIdentifier	 theta
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
"VitorBalancedWinnow: voted="	TokenNameStringLiteral	VitorBalancedWinnow: voted=
+	TokenNamePLUS	
voted	TokenNameIdentifier	 voted
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
class	TokenNameclass	
MyClassifier	TokenNameIdentifier	 My Classifier
implements	TokenNameimplements	
Classifier	TokenNameIdentifier	 Classifier
,	TokenNameCOMMA	
Serializable	TokenNameIdentifier	 Serializable
,	TokenNameCOMMA	
Visible	TokenNameIdentifier	 Visible
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
20071130L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Hyperplane	TokenNameIdentifier	 Hyperplane
lpos_h	TokenNameIdentifier	 lpos h
,	TokenNameCOMMA	
lneg_h	TokenNameIdentifier	 lneg h
;	TokenNameSEMICOLON	
//private ExampleSchema schema; 	TokenNameCOMMENT_LINE	private ExampleSchema schema; 
private	TokenNameprivate	
double	TokenNamedouble	
mytheta	TokenNameIdentifier	 mytheta
;	TokenNameSEMICOLON	
//theta parameter from Winnow 	TokenNameCOMMENT_LINE	theta parameter from Winnow 
public	TokenNamepublic	
MyClassifier	TokenNameIdentifier	 My Classifier
(	TokenNameLPAREN	
Hyperplane	TokenNameIdentifier	 Hyperplane
pos_h	TokenNameIdentifier	 pos h
,	TokenNameCOMMA	
Hyperplane	TokenNameIdentifier	 Hyperplane
neg_h	TokenNameIdentifier	 neg h
,	TokenNameCOMMA	
double	TokenNamedouble	
atheta	TokenNameIdentifier	 atheta
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
lpos_h	TokenNameIdentifier	 lpos h
=	TokenNameEQUAL	
pos_h	TokenNameIdentifier	 pos h
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
lneg_h	TokenNameIdentifier	 lneg h
=	TokenNameEQUAL	
neg_h	TokenNameIdentifier	 neg h
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
mytheta	TokenNameIdentifier	 mytheta
=	TokenNameEQUAL	
atheta	TokenNameIdentifier	 atheta
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//implements the balanced winnow decision rule for a new incoming instance 	TokenNameCOMMENT_LINE	implements the balanced winnow decision rule for a new incoming instance 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
ClassLabel	TokenNameIdentifier	 Class Label
classification	TokenNameIdentifier	 classification
(	TokenNameLPAREN	
Instance	TokenNameIdentifier	 Instance
instance1	TokenNameIdentifier	 instance1
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Example	TokenNameIdentifier	 Example
a1	TokenNameIdentifier	 a1
=	TokenNameEQUAL	
new	TokenNamenew	
Example	TokenNameIdentifier	 Example
(	TokenNameLPAREN	
instance1	TokenNameIdentifier	 instance1
,	TokenNameCOMMA	
new	TokenNamenew	
ClassLabel	TokenNameIdentifier	 Class Label
(	TokenNameLPAREN	
"POS"	TokenNameStringLiteral	POS
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//dummy label POS 	TokenNameCOMMENT_LINE	dummy label POS 
Example	TokenNameIdentifier	 Example
aa	TokenNameIdentifier	 aa
=	TokenNameEQUAL	
filterFeat	TokenNameIdentifier	 filter Feat
(	TokenNameLPAREN	
a1	TokenNameIdentifier	 a1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//remove features not in hyperplane lpos_h 	TokenNameCOMMENT_LINE	remove features not in hyperplane lpos_h 
Example	TokenNameIdentifier	 Example
example1	TokenNameIdentifier	 example1
=	TokenNameEQUAL	
Winnow	TokenNameIdentifier	 Winnow
.	TokenNameDOT	
normalizeWeights	TokenNameIdentifier	 normalize Weights
(	TokenNameLPAREN	
aa	TokenNameIdentifier	 aa
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Instance	TokenNameIdentifier	 Instance
instance	TokenNameIdentifier	 instance
=	TokenNameEQUAL	
example1	TokenNameIdentifier	 example1
.	TokenNameDOT	
asInstance	TokenNameIdentifier	 as Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//decision rule 	TokenNameCOMMENT_LINE	decision rule 
double	TokenNamedouble	
dec	TokenNameIdentifier	 dec
=	TokenNameEQUAL	
lpos_h	TokenNameIdentifier	 lpos h
.	TokenNameDOT	
score	TokenNameIdentifier	 score
(	TokenNameLPAREN	
instance	TokenNameIdentifier	 instance
)	TokenNameRPAREN	
-	TokenNameMINUS	
lneg_h	TokenNameIdentifier	 lneg h
.	TokenNameDOT	
score	TokenNameIdentifier	 score
(	TokenNameLPAREN	
instance	TokenNameIdentifier	 instance
)	TokenNameRPAREN	
-	TokenNameMINUS	
mytheta	TokenNameIdentifier	 mytheta
;	TokenNameSEMICOLON	
return	TokenNamereturn	
dec	TokenNameIdentifier	 dec
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
?	TokenNameQUESTION	
ClassLabel	TokenNameIdentifier	 Class Label
.	TokenNameDOT	
positiveLabel	TokenNameIdentifier	 positive Label
(	TokenNameLPAREN	
dec	TokenNameIdentifier	 dec
)	TokenNameRPAREN	
:	TokenNameCOLON	
ClassLabel	TokenNameIdentifier	 Class Label
.	TokenNameDOT	
negativeLabel	TokenNameIdentifier	 negative Label
(	TokenNameLPAREN	
dec	TokenNameIdentifier	 dec
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// only consider features if also present in the hyperplane; 	TokenNameCOMMENT_LINE	only consider features if also present in the hyperplane; 
//the features that cannot be found in hyperplane are deleted from the example. 	TokenNameCOMMENT_LINE	the features that cannot be found in hyperplane are deleted from the example. 
public	TokenNamepublic	
Example	TokenNameIdentifier	 Example
filterFeat	TokenNameIdentifier	 filter Feat
(	TokenNameLPAREN	
Example	TokenNameIdentifier	 Example
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
MutableInstance	TokenNameIdentifier	 Mutable Instance
ins	TokenNameIdentifier	 ins
=	TokenNameEQUAL	
new	TokenNamenew	
MutableInstance	TokenNameIdentifier	 Mutable Instance
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
ex	TokenNameIdentifier	 ex
.	TokenNameDOT	
asInstance	TokenNameIdentifier	 as Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
(	TokenNameLPAREN	
lpos_h	TokenNameIdentifier	 lpos h
.	TokenNameDOT	
hasFeature	TokenNameIdentifier	 has Feature
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ins	TokenNameIdentifier	 ins
.	TokenNameDOT	
addNumeric	TokenNameIdentifier	 add Numeric
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
,	TokenNameCOMMA	
ex	TokenNameIdentifier	 ex
.	TokenNameDOT	
getWeight	TokenNameIdentifier	 get Weight
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
new	TokenNamenew	
Example	TokenNameIdentifier	 Example
(	TokenNameLPAREN	
ins	TokenNameIdentifier	 ins
,	TokenNameCOMMA	
ex	TokenNameIdentifier	 ex
.	TokenNameDOT	
getLabel	TokenNameIdentifier	 get Label
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
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
"POS = "	TokenNameStringLiteral	POS = 
+	TokenNamePLUS	
lpos_h	TokenNameIdentifier	 lpos h
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" NEG = "	TokenNameStringLiteral	 NEG = 
+	TokenNamePLUS	
lneg_h	TokenNameIdentifier	 lneg h
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
"VitorBalancedWinnow: Not implemented yet"	TokenNameStringLiteral	VitorBalancedWinnow: Not implemented yet
;	TokenNameSEMICOLON	
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
"VitorBalancedWinnow Explanation"	TokenNameStringLiteral	VitorBalancedWinnow Explanation
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
Viewer	TokenNameIdentifier	 Viewer
toGUI	TokenNameIdentifier	 to GUI
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Viewer	TokenNameIdentifier	 Viewer
v	TokenNameIdentifier	 v
=	TokenNameEQUAL	
new	TokenNamenew	
TransformedViewer	TokenNameIdentifier	 Transformed Viewer
(	TokenNameLPAREN	
new	TokenNamenew	
SmartVanillaViewer	TokenNameIdentifier	 Smart Vanilla Viewer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
20071130L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
transform	TokenNameIdentifier	 transform
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
{	TokenNameLBRACE	
MyClassifier	TokenNameIdentifier	 My Classifier
mycl	TokenNameIdentifier	 mycl
=	TokenNameEQUAL	
(	TokenNameLPAREN	
MyClassifier	TokenNameIdentifier	 My Classifier
)	TokenNameRPAREN	
o	TokenNameIdentifier	 o
;	TokenNameSEMICOLON	
return	TokenNamereturn	
mycl	TokenNameIdentifier	 mycl
.	TokenNameDOT	
lpos_h	TokenNameIdentifier	 lpos h
;	TokenNameSEMICOLON	
//bug! 	TokenNameCOMMENT_LINE	bug! 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
v	TokenNameIdentifier	 v
.	TokenNameDOT	
setContent	TokenNameIdentifier	 set Content
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
v	TokenNameIdentifier	 v
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
