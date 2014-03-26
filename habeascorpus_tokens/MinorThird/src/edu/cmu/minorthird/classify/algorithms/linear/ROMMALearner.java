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
/** * Created on Sep 27, 2005 * * @author Vitor R. Carvalho * * ROMMA (Relaxed Online Maximum Margin Algorithm) algorithm as described in * "The Relaxed Online Maximum Margin Algorithm", by Yi Li and Philip M. Long, * Machine Learning, 46(1-3):361-387,2002. * * Additionally, it implements the Aggressive version(Aggressive ROMMA). (parameter aggressive) * Additionally, it implements optionally a voting scheme. (voted parameter) * */	TokenNameCOMMENT_JAVADOC	 Created on Sep 27, 2005 * @author Vitor R. Carvalho * ROMMA (Relaxed Online Maximum Margin Algorithm) algorithm as described in "The Relaxed Online Maximum Margin Algorithm", by Yi Li and Philip M. Long, Machine Learning, 46(1-3):361-387,2002. * Additionally, it implements the Aggressive version(Aggressive ROMMA). (parameter aggressive) Additionally, it implements optionally a voting scheme. (voted parameter) 
public	TokenNamepublic	
class	TokenNameclass	
ROMMALearner	TokenNameIdentifier	 ROMMA Learner
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
Hyperplane	TokenNameIdentifier	 Hyperplane
w_t	TokenNameIdentifier	 w t
;	TokenNameSEMICOLON	
//positive and negative hyperplanes 	TokenNameCOMMENT_LINE	positive and negative hyperplanes 
private	TokenNameprivate	
Hyperplane	TokenNameIdentifier	 Hyperplane
vpos_t	TokenNameIdentifier	 vpos t
;	TokenNameSEMICOLON	
//voted hyperplane 	TokenNameCOMMENT_LINE	voted hyperplane 
private	TokenNameprivate	
int	TokenNameint	
excount	TokenNameIdentifier	 excount
;	TokenNameSEMICOLON	
//number of examples presented to the learner so far 	TokenNameCOMMENT_LINE	number of examples presented to the learner so far 
// private int numActiveFeatures;//number of active features in first example 	TokenNameCOMMENT_LINE	private int numActiveFeatures;//number of active features in first example 
private	TokenNameprivate	
double	TokenNamedouble	
margin	TokenNameIdentifier	 margin
=	TokenNameEQUAL	
0.0	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
aggressive	TokenNameIdentifier	 aggressive
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
voted	TokenNameIdentifier	 voted
;	TokenNameSEMICOLON	
public	TokenNamepublic	
ROMMALearner	TokenNameIdentifier	 ROMMA Learner
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//this(false, false); 	TokenNameCOMMENT_LINE	this(false, false); 
//this(true, false); 	TokenNameCOMMENT_LINE	this(true, false); 
this	TokenNamethis	
(	TokenNameLPAREN	
true	TokenNametrue	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//recommended 	TokenNameCOMMENT_LINE	recommended 
}	TokenNameRBRACE	
public	TokenNamepublic	
ROMMALearner	TokenNameIdentifier	 ROMMA Learner
(	TokenNameLPAREN	
boolean	TokenNameboolean	
agg	TokenNameIdentifier	 agg
,	TokenNameCOMMA	
boolean	TokenNameboolean	
voted	TokenNameIdentifier	 voted
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
aggressive	TokenNameIdentifier	 aggressive
=	TokenNameEQUAL	
agg	TokenNameIdentifier	 agg
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
aggressive	TokenNameIdentifier	 aggressive
)	TokenNameRPAREN	
margin	TokenNameIdentifier	 margin
=	TokenNameEQUAL	
1.0	TokenNameDoubleLiteral	
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
w_t	TokenNameIdentifier	 w t
=	TokenNameEQUAL	
new	TokenNamenew	
Hyperplane	TokenNameIdentifier	 Hyperplane
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
}	TokenNameRBRACE	
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
excount	TokenNameIdentifier	 excount
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
// adding new features to hyperplane 	TokenNameCOMMENT_LINE	adding new features to hyperplane 
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
!	TokenNameNOT	
w_t	TokenNameIdentifier	 w t
.	TokenNameDOT	
hasFeature	TokenNameIdentifier	 has Feature
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
w_t	TokenNameIdentifier	 w t
.	TokenNameDOT	
increment	TokenNameIdentifier	 increment
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
,	TokenNameCOMMA	
1.0	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
//System.out.println("Hyperplane = "+w_t.toString()); 	TokenNameCOMMENT_LINE	System.out.println("Hyperplane = "+w_t.toString()); 
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
w_t	TokenNameIdentifier	 w t
.	TokenNameDOT	
score	TokenNameIdentifier	 score
(	TokenNameLPAREN	
example	TokenNameIdentifier	 example
.	TokenNameDOT	
asInstance	TokenNameIdentifier	 as Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
decision	TokenNameIdentifier	 decision
=	TokenNameEQUAL	
y_t	TokenNameIdentifier	 y t
*	TokenNameMULTIPLY	
y_t_hat	TokenNameIdentifier	 y t hat
;	TokenNameSEMICOLON	
//update rule 	TokenNameCOMMENT_LINE	update rule 
if	TokenNameif	
(	TokenNameLPAREN	
decision	TokenNameIdentifier	 decision
<	TokenNameLESS	
margin	TokenNameIdentifier	 margin
)	TokenNameRPAREN	
{	TokenNameLBRACE	
double	TokenNamedouble	
x2	TokenNameIdentifier	 x2
=	TokenNameEQUAL	
getNormSquared	TokenNameIdentifier	 get Norm Squared
(	TokenNameLPAREN	
example	TokenNameIdentifier	 example
.	TokenNameDOT	
asInstance	TokenNameIdentifier	 as Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
w2	TokenNameIdentifier	 w2
=	TokenNameEQUAL	
getHyperplaneNormSquared	TokenNameIdentifier	 get Hyperplane Norm Squared
(	TokenNameLPAREN	
w_t	TokenNameIdentifier	 w t
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
denom	TokenNameIdentifier	 denom
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
x2	TokenNameIdentifier	 x2
*	TokenNameMULTIPLY	
w2	TokenNameIdentifier	 w2
)	TokenNameRPAREN	
-	TokenNameMINUS	
(	TokenNameLPAREN	
y_t_hat	TokenNameIdentifier	 y t hat
*	TokenNameMULTIPLY	
y_t_hat	TokenNameIdentifier	 y t hat
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
c_t	TokenNameIdentifier	 c t
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
x2	TokenNameIdentifier	 x2
*	TokenNameMULTIPLY	
w2	TokenNameIdentifier	 w2
)	TokenNameRPAREN	
-	TokenNameMINUS	
(	TokenNameLPAREN	
decision	TokenNameIdentifier	 decision
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
d_t	TokenNameIdentifier	 d t
=	TokenNameEQUAL	
(	TokenNameLPAREN	
w2	TokenNameIdentifier	 w2
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
y_t	TokenNameIdentifier	 y t
-	TokenNameMINUS	
y_t_hat	TokenNameIdentifier	 y t hat
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
aggressive	TokenNameIdentifier	 aggressive
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
decision	TokenNameIdentifier	 decision
>=	TokenNameGREATER_EQUAL	
w2	TokenNameIdentifier	 w2
*	TokenNameMULTIPLY	
x2	TokenNameIdentifier	 x2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
w_t	TokenNameIdentifier	 w t
=	TokenNameEQUAL	
new	TokenNamenew	
Hyperplane	TokenNameIdentifier	 Hyperplane
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
w_t	TokenNameIdentifier	 w t
.	TokenNameDOT	
increment	TokenNameIdentifier	 increment
(	TokenNameLPAREN	
example	TokenNameIdentifier	 example
.	TokenNameDOT	
asInstance	TokenNameIdentifier	 as Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
y_t	TokenNameIdentifier	 y t
/	TokenNameDIVIDE	
x2	TokenNameIdentifier	 x2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
//System.out.println("x2,w2,ct,dt,decision ="+x2+","+w2+","+c_t+","+d_t+","+decision); 	TokenNameCOMMENT_LINE	System.out.println("x2,w2,ct,dt,decision ="+x2+","+w2+","+c_t+","+d_t+","+decision); 
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
denom	TokenNameIdentifier	 denom
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
denom	TokenNameIdentifier	 denom
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
c_t	TokenNameIdentifier	 c t
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
c_t	TokenNameIdentifier	 c t
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
w_t	TokenNameIdentifier	 w t
.	TokenNameDOT	
multiply	TokenNameIdentifier	 multiply
(	TokenNameLPAREN	
c_t	TokenNameIdentifier	 c t
/	TokenNameDIVIDE	
denom	TokenNameIdentifier	 denom
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
d_t	TokenNameIdentifier	 d t
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
d_t	TokenNameIdentifier	 d t
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
w_t	TokenNameIdentifier	 w t
.	TokenNameDOT	
increment	TokenNameIdentifier	 increment
(	TokenNameLPAREN	
example	TokenNameIdentifier	 example
.	TokenNameDOT	
asInstance	TokenNameIdentifier	 as Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
d_t	TokenNameIdentifier	 d t
/	TokenNameDIVIDE	
denom	TokenNameIdentifier	 denom
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
//averaging trick 	TokenNameCOMMENT_LINE	averaging trick 
if	TokenNameif	
(	TokenNameLPAREN	
voted	TokenNameIdentifier	 voted
)	TokenNameRPAREN	
{	TokenNameLBRACE	
vpos_t	TokenNameIdentifier	 vpos t
.	TokenNameDOT	
increment	TokenNameIdentifier	 increment
(	TokenNameLPAREN	
w_t	TokenNameIdentifier	 w t
,	TokenNameCOMMA	
1.0	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//smooth 	TokenNameCOMMENT_LINE	smooth 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
double	TokenNamedouble	
getNormSquared	TokenNameIdentifier	 get Norm Squared
(	TokenNameLPAREN	
Instance	TokenNameIdentifier	 Instance
ins	TokenNameIdentifier	 ins
)	TokenNameRPAREN	
{	TokenNameLBRACE	
double	TokenNamedouble	
tmp	TokenNameIdentifier	 tmp
=	TokenNameEQUAL	
0.0	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Feature	TokenNameIdentifier	 Feature
>	TokenNameGREATER	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
ins	TokenNameIdentifier	 ins
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
double	TokenNamedouble	
val	TokenNameIdentifier	 val
=	TokenNameEQUAL	
ins	TokenNameIdentifier	 ins
.	TokenNameDOT	
getWeight	TokenNameIdentifier	 get Weight
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tmp	TokenNameIdentifier	 tmp
+=	TokenNamePLUS_EQUAL	
val	TokenNameIdentifier	 val
*	TokenNameMULTIPLY	
val	TokenNameIdentifier	 val
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
tmp	TokenNameIdentifier	 tmp
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
double	TokenNamedouble	
getHyperplaneNormSquared	TokenNameIdentifier	 get Hyperplane Norm Squared
(	TokenNameLPAREN	
Hyperplane	TokenNameIdentifier	 Hyperplane
hyp	TokenNameIdentifier	 hyp
)	TokenNameRPAREN	
{	TokenNameLBRACE	
double	TokenNamedouble	
tmp	TokenNameIdentifier	 tmp
=	TokenNameEQUAL	
0.0	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Feature	TokenNameIdentifier	 Feature
>	TokenNameGREATER	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
hyp	TokenNameIdentifier	 hyp
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
double	TokenNamedouble	
val	TokenNameIdentifier	 val
=	TokenNameEQUAL	
hyp	TokenNameIdentifier	 hyp
.	TokenNameDOT	
featureScore	TokenNameIdentifier	 feature Score
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tmp	TokenNameIdentifier	 tmp
+=	TokenNamePLUS_EQUAL	
val	TokenNameIdentifier	 val
*	TokenNameMULTIPLY	
val	TokenNameIdentifier	 val
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
tmp	TokenNameIdentifier	 tmp
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
Hyperplane	TokenNameIdentifier	 Hyperplane
z	TokenNameIdentifier	 z
=	TokenNameEQUAL	
new	TokenNamenew	
Hyperplane	TokenNameIdentifier	 Hyperplane
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
voted	TokenNameIdentifier	 voted
)	TokenNameRPAREN	
z	TokenNameIdentifier	 z
.	TokenNameDOT	
increment	TokenNameIdentifier	 increment
(	TokenNameLPAREN	
vpos_t	TokenNameIdentifier	 vpos t
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
z	TokenNameIdentifier	 z
.	TokenNameDOT	
increment	TokenNameIdentifier	 increment
(	TokenNameLPAREN	
w_t	TokenNameIdentifier	 w t
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
z	TokenNameIdentifier	 z
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
"ROMMA Algorithm"	TokenNameStringLiteral	ROMMA Algorithm
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//main unit test routine 	TokenNameCOMMENT_LINE	main unit test routine 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
main	TokenNameIdentifier	 main
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
args	TokenNameIdentifier	 args
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ROMMALearner	TokenNameIdentifier	 ROMMA Learner
pa	TokenNameIdentifier	 pa
=	TokenNameEQUAL	
new	TokenNamenew	
ROMMALearner	TokenNameIdentifier	 ROMMA Learner
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//making examples 	TokenNameCOMMENT_LINE	making examples 
ClassLabel	TokenNameIdentifier	 Class Label
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
ClassLabel	TokenNameIdentifier	 Class Label
.	TokenNameDOT	
positiveLabel	TokenNameIdentifier	 positive Label
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
MutableInstance	TokenNameIdentifier	 Mutable Instance
instance	TokenNameIdentifier	 instance
=	TokenNameEQUAL	
new	TokenNamenew	
MutableInstance	TokenNameIdentifier	 Mutable Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
addNumeric	TokenNameIdentifier	 add Numeric
(	TokenNameLPAREN	
new	TokenNamenew	
Feature	TokenNameIdentifier	 Feature
(	TokenNameLPAREN	
"f2"	TokenNameStringLiteral	f2
)	TokenNameRPAREN	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
addNumeric	TokenNameIdentifier	 add Numeric
(	TokenNameLPAREN	
new	TokenNamenew	
Feature	TokenNameIdentifier	 Feature
(	TokenNameLPAREN	
"f3"	TokenNameStringLiteral	f3
)	TokenNameRPAREN	
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
addNumeric	TokenNameIdentifier	 add Numeric
(	TokenNameLPAREN	
new	TokenNamenew	
Feature	TokenNameIdentifier	 Feature
(	TokenNameLPAREN	
"f4"	TokenNameStringLiteral	f4
)	TokenNameRPAREN	
,	TokenNameCOMMA	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Example	TokenNameIdentifier	 Example
ex	TokenNameIdentifier	 ex
=	TokenNameEQUAL	
new	TokenNamenew	
Example	TokenNameIdentifier	 Example
(	TokenNameLPAREN	
instance	TokenNameIdentifier	 instance
,	TokenNameCOMMA	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pa	TokenNameIdentifier	 pa
.	TokenNameDOT	
addExample	TokenNameIdentifier	 add Example
(	TokenNameLPAREN	
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Classifier	TokenNameIdentifier	 Classifier
hp	TokenNameIdentifier	 hp
=	TokenNameEQUAL	
pa	TokenNameIdentifier	 pa
.	TokenNameDOT	
getClassifier	TokenNameIdentifier	 get Classifier
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Hyperplane = "	TokenNameStringLiteral	Hyperplane = 
+	TokenNamePLUS	
hp	TokenNameIdentifier	 hp
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ClassLabel	TokenNameIdentifier	 Class Label
c1	TokenNameIdentifier	 c1
=	TokenNameEQUAL	
ClassLabel	TokenNameIdentifier	 Class Label
.	TokenNameDOT	
negativeLabel	TokenNameIdentifier	 negative Label
(	TokenNameLPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
MutableInstance	TokenNameIdentifier	 Mutable Instance
instance1	TokenNameIdentifier	 instance1
=	TokenNameEQUAL	
new	TokenNamenew	
MutableInstance	TokenNameIdentifier	 Mutable Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
instance1	TokenNameIdentifier	 instance1
.	TokenNameDOT	
addNumeric	TokenNameIdentifier	 add Numeric
(	TokenNameLPAREN	
new	TokenNamenew	
Feature	TokenNameIdentifier	 Feature
(	TokenNameLPAREN	
"f3"	TokenNameStringLiteral	f3
)	TokenNameRPAREN	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
instance1	TokenNameIdentifier	 instance1
.	TokenNameDOT	
addNumeric	TokenNameIdentifier	 add Numeric
(	TokenNameLPAREN	
new	TokenNamenew	
Feature	TokenNameIdentifier	 Feature
(	TokenNameLPAREN	
"f4"	TokenNameStringLiteral	f4
)	TokenNameRPAREN	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
instance1	TokenNameIdentifier	 instance1
.	TokenNameDOT	
addNumeric	TokenNameIdentifier	 add Numeric
(	TokenNameLPAREN	
new	TokenNamenew	
Feature	TokenNameIdentifier	 Feature
(	TokenNameLPAREN	
"f5"	TokenNameStringLiteral	f5
)	TokenNameRPAREN	
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Example	TokenNameIdentifier	 Example
ex1	TokenNameIdentifier	 ex1
=	TokenNameEQUAL	
new	TokenNamenew	
Example	TokenNameIdentifier	 Example
(	TokenNameLPAREN	
instance1	TokenNameIdentifier	 instance1
,	TokenNameCOMMA	
c1	TokenNameIdentifier	 c1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pa	TokenNameIdentifier	 pa
.	TokenNameDOT	
addExample	TokenNameIdentifier	 add Example
(	TokenNameLPAREN	
ex1	TokenNameIdentifier	 ex1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
hp	TokenNameIdentifier	 hp
=	TokenNameEQUAL	
pa	TokenNameIdentifier	 pa
.	TokenNameDOT	
getClassifier	TokenNameIdentifier	 get Classifier
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Hyperplane = "	TokenNameStringLiteral	Hyperplane = 
+	TokenNamePLUS	
hp	TokenNameIdentifier	 hp
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ClassLabel	TokenNameIdentifier	 Class Label
c2	TokenNameIdentifier	 c2
=	TokenNameEQUAL	
ClassLabel	TokenNameIdentifier	 Class Label
.	TokenNameDOT	
positiveLabel	TokenNameIdentifier	 positive Label
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//ClassLabel c2 = ClassLabel.negativeLabel(-1); 	TokenNameCOMMENT_LINE	ClassLabel c2 = ClassLabel.negativeLabel(-1); 
MutableInstance	TokenNameIdentifier	 Mutable Instance
instance2	TokenNameIdentifier	 instance2
=	TokenNameEQUAL	
new	TokenNamenew	
MutableInstance	TokenNameIdentifier	 Mutable Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
instance2	TokenNameIdentifier	 instance2
.	TokenNameDOT	
addNumeric	TokenNameIdentifier	 add Numeric
(	TokenNameLPAREN	
new	TokenNamenew	
Feature	TokenNameIdentifier	 Feature
(	TokenNameLPAREN	
"f3"	TokenNameStringLiteral	f3
)	TokenNameRPAREN	
,	TokenNameCOMMA	
-	TokenNameMINUS	
5	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
instance2	TokenNameIdentifier	 instance2
.	TokenNameDOT	
addNumeric	TokenNameIdentifier	 add Numeric
(	TokenNameLPAREN	
new	TokenNamenew	
Feature	TokenNameIdentifier	 Feature
(	TokenNameLPAREN	
"f4"	TokenNameStringLiteral	f4
)	TokenNameRPAREN	
,	TokenNameCOMMA	
-	TokenNameMINUS	
12	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
instance2	TokenNameIdentifier	 instance2
.	TokenNameDOT	
addNumeric	TokenNameIdentifier	 add Numeric
(	TokenNameLPAREN	
new	TokenNamenew	
Feature	TokenNameIdentifier	 Feature
(	TokenNameLPAREN	
"f5"	TokenNameStringLiteral	f5
)	TokenNameRPAREN	
,	TokenNameCOMMA	
-	TokenNameMINUS	
34	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Example	TokenNameIdentifier	 Example
ex2	TokenNameIdentifier	 ex2
=	TokenNameEQUAL	
new	TokenNamenew	
Example	TokenNameIdentifier	 Example
(	TokenNameLPAREN	
instance2	TokenNameIdentifier	 instance2
,	TokenNameCOMMA	
c2	TokenNameIdentifier	 c2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pa	TokenNameIdentifier	 pa
.	TokenNameDOT	
addExample	TokenNameIdentifier	 add Example
(	TokenNameLPAREN	
ex2	TokenNameIdentifier	 ex2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
hp	TokenNameIdentifier	 hp
=	TokenNameEQUAL	
pa	TokenNameIdentifier	 pa
.	TokenNameDOT	
getClassifier	TokenNameIdentifier	 get Classifier
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Hyperplane = "	TokenNameStringLiteral	Hyperplane = 
+	TokenNamePLUS	
hp	TokenNameIdentifier	 hp
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ClassLabel	TokenNameIdentifier	 Class Label
c3	TokenNameIdentifier	 c3
=	TokenNameEQUAL	
ClassLabel	TokenNameIdentifier	 Class Label
.	TokenNameDOT	
positiveLabel	TokenNameIdentifier	 positive Label
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//ClassLabel c2 = ClassLabel.negativeLabel(-1); 	TokenNameCOMMENT_LINE	ClassLabel c2 = ClassLabel.negativeLabel(-1); 
MutableInstance	TokenNameIdentifier	 Mutable Instance
instance3	TokenNameIdentifier	 instance3
=	TokenNameEQUAL	
new	TokenNamenew	
MutableInstance	TokenNameIdentifier	 Mutable Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
instance3	TokenNameIdentifier	 instance3
.	TokenNameDOT	
addNumeric	TokenNameIdentifier	 add Numeric
(	TokenNameLPAREN	
new	TokenNamenew	
Feature	TokenNameIdentifier	 Feature
(	TokenNameLPAREN	
"f3"	TokenNameStringLiteral	f3
)	TokenNameRPAREN	
,	TokenNameCOMMA	
-	TokenNameMINUS	
5	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
instance3	TokenNameIdentifier	 instance3
.	TokenNameDOT	
addNumeric	TokenNameIdentifier	 add Numeric
(	TokenNameLPAREN	
new	TokenNamenew	
Feature	TokenNameIdentifier	 Feature
(	TokenNameLPAREN	
"f4"	TokenNameStringLiteral	f4
)	TokenNameRPAREN	
,	TokenNameCOMMA	
-	TokenNameMINUS	
12	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
instance3	TokenNameIdentifier	 instance3
.	TokenNameDOT	
addNumeric	TokenNameIdentifier	 add Numeric
(	TokenNameLPAREN	
new	TokenNamenew	
Feature	TokenNameIdentifier	 Feature
(	TokenNameLPAREN	
"f5"	TokenNameStringLiteral	f5
)	TokenNameRPAREN	
,	TokenNameCOMMA	
-	TokenNameMINUS	
34	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
instance	TokenNameIdentifier	 instance
.	TokenNameDOT	
addNumeric	TokenNameIdentifier	 add Numeric
(	TokenNameLPAREN	
new	TokenNamenew	
Feature	TokenNameIdentifier	 Feature
(	TokenNameLPAREN	
"f2"	TokenNameStringLiteral	f2
)	TokenNameRPAREN	
,	TokenNameCOMMA	
-	TokenNameMINUS	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Example	TokenNameIdentifier	 Example
ex3	TokenNameIdentifier	 ex3
=	TokenNameEQUAL	
new	TokenNamenew	
Example	TokenNameIdentifier	 Example
(	TokenNameLPAREN	
instance3	TokenNameIdentifier	 instance3
,	TokenNameCOMMA	
c3	TokenNameIdentifier	 c3
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pa	TokenNameIdentifier	 pa
.	TokenNameDOT	
addExample	TokenNameIdentifier	 add Example
(	TokenNameLPAREN	
ex3	TokenNameIdentifier	 ex3
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
hp	TokenNameIdentifier	 hp
=	TokenNameEQUAL	
pa	TokenNameIdentifier	 pa
.	TokenNameDOT	
getClassifier	TokenNameIdentifier	 get Classifier
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Hyperplane = "	TokenNameStringLiteral	Hyperplane = 
+	TokenNamePLUS	
hp	TokenNameIdentifier	 hp
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
