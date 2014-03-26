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
/** * Created on Sep 26, 2005 * * @author Vitor R. Carvalho * * Passive Aggressive algorithm as described in "Online Passive Agressive Algorithms" * Cramer, Dekel, Shalev-Shwartz, Singer, NIPS 2003. * * Classification mode. * * Additionally, it implements optionally a voting scheme. (voted parameter) * */	TokenNameCOMMENT_JAVADOC	 Created on Sep 26, 2005 * @author Vitor R. Carvalho * Passive Aggressive algorithm as described in "Online Passive Agressive Algorithms" Cramer, Dekel, Shalev-Shwartz, Singer, NIPS 2003. * Classification mode. * Additionally, it implements optionally a voting scheme. (voted parameter) 
public	TokenNamepublic	
class	TokenNameclass	
PassiveAggressiveLearner	TokenNameIdentifier	 Passive Aggressive Learner
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
pos_t	TokenNameIdentifier	 pos t
;	TokenNameSEMICOLON	
//positive and negative hyperplanes 	TokenNameCOMMENT_LINE	positive and negative hyperplanes 
private	TokenNameprivate	
Hyperplane	TokenNameIdentifier	 Hyperplane
vpos_t	TokenNameIdentifier	 vpos t
;	TokenNameSEMICOLON	
//voted hyperplane 	TokenNameCOMMENT_LINE	voted hyperplane 
private	TokenNameprivate	
double	TokenNamedouble	
eta	TokenNameIdentifier	 eta
;	TokenNameSEMICOLON	
//insensitivity parameter (positive value) 	TokenNameCOMMENT_LINE	insensitivity parameter (positive value) 
private	TokenNameprivate	
double	TokenNamedouble	
gamma	TokenNameIdentifier	 gamma
;	TokenNameSEMICOLON	
//parameter for the unrealizable case 	TokenNameCOMMENT_LINE	parameter for the unrealizable case 
private	TokenNameprivate	
int	TokenNameint	
excount	TokenNameIdentifier	 excount
;	TokenNameSEMICOLON	
//number of examples presented to the learner so far 	TokenNameCOMMENT_LINE	number of examples presented to the learner so far 
//private int numActiveFeatures;//number of active features in first example 	TokenNameCOMMENT_LINE	private int numActiveFeatures;//number of active features in first example 
private	TokenNameprivate	
boolean	TokenNameboolean	
voted	TokenNameIdentifier	 voted
;	TokenNameSEMICOLON	
public	TokenNamepublic	
PassiveAggressiveLearner	TokenNameIdentifier	 Passive Aggressive Learner
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//this(4, 2, 0.5, true); 	TokenNameCOMMENT_LINE	this(4, 2, 0.5, true); 
this	TokenNamethis	
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0.1	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//recommended 	TokenNameCOMMENT_LINE	recommended 
//this(10,1.1,0.9, true); 	TokenNameCOMMENT_LINE	this(10,1.1,0.9, true); 
}	TokenNameRBRACE	
public	TokenNamepublic	
PassiveAggressiveLearner	TokenNameIdentifier	 Passive Aggressive Learner
(	TokenNameLPAREN	
double	TokenNamedouble	
eta	TokenNameIdentifier	 eta
,	TokenNameCOMMA	
double	TokenNamedouble	
gamma	TokenNameIdentifier	 gamma
,	TokenNameCOMMA	
boolean	TokenNameboolean	
voted	TokenNameIdentifier	 voted
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
eta	TokenNameIdentifier	 eta
=	TokenNameEQUAL	
eta	TokenNameIdentifier	 eta
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
gamma	TokenNameIdentifier	 gamma
=	TokenNameEQUAL	
gamma	TokenNameIdentifier	 gamma
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
;	TokenNameSEMICOLON	
//update rule 	TokenNameCOMMENT_LINE	update rule 
if	TokenNameif	
(	TokenNameLPAREN	
y_t	TokenNameIdentifier	 y t
*	TokenNameMULTIPLY	
y_t_hat	TokenNameIdentifier	 y t hat
<	TokenNameLESS	
eta	TokenNameIdentifier	 eta
)	TokenNameRPAREN	
{	TokenNameLBRACE	
double	TokenNamedouble	
loss	TokenNameIdentifier	 loss
=	TokenNameEQUAL	
eta	TokenNameIdentifier	 eta
-	TokenNameMINUS	
(	TokenNameLPAREN	
y_t	TokenNameIdentifier	 y t
*	TokenNameMULTIPLY	
y_t_hat	TokenNameIdentifier	 y t hat
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
normsqr	TokenNameIdentifier	 normsqr
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
weight	TokenNameIdentifier	 weight
=	TokenNameEQUAL	
y_t	TokenNameIdentifier	 y t
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
loss	TokenNameIdentifier	 loss
/	TokenNameDIVIDE	
(	TokenNameLPAREN	
normsqr	TokenNameIdentifier	 normsqr
+	TokenNamePLUS	
gamma	TokenNameIdentifier	 gamma
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pos_t	TokenNameIdentifier	 pos t
.	TokenNameDOT	
increment	TokenNameIdentifier	 increment
(	TokenNameLPAREN	
example	TokenNameIdentifier	 example
.	TokenNameDOT	
asInstance	TokenNameIdentifier	 as Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
weight	TokenNameIdentifier	 weight
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
pos_t	TokenNameIdentifier	 pos t
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
pos_t	TokenNameIdentifier	 pos t
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
"PassiveAggressive Algorithm"	TokenNameStringLiteral	PassiveAggressive Algorithm
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
PassiveAggressiveLearner	TokenNameIdentifier	 Passive Aggressive Learner
pa	TokenNameIdentifier	 pa
=	TokenNameEQUAL	
new	TokenNamenew	
PassiveAggressiveLearner	TokenNameIdentifier	 Passive Aggressive Learner
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
"Winnow Hyperplane = "	TokenNameStringLiteral	Winnow Hyperplane = 
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
"Winnow Hyperplane = "	TokenNameStringLiteral	Winnow Hyperplane = 
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
"Winnow Hyperplane = "	TokenNameStringLiteral	Winnow Hyperplane = 
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
"Winnow Hyperplane = "	TokenNameStringLiteral	Winnow Hyperplane = 
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
