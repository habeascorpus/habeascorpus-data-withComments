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
ArrayList	TokenNameIdentifier	 Array List
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
List	TokenNameIdentifier	 List
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
/** * Voted perceptron algorithm. As described in "Large Margin * Classification Using the Perceptron Algorithm", Yoav Freund and * Robert E. Schapire, Proceedings of the Eleventh Annual Conference * on Computational Learning Theory, * 1998. * * Polynomial kernel is implemented: K(x,y) = (coef0+gamma*<x,y>)^d * Both "voted" and "averaged" modes are implemented (unnormalized). Poly degree = 0 * means that no kernel is used. * * Therefore, mode "averaged" with degree=0 should be equivalent to results in * VotedPerceptron.java (file with a faster implementation of the averaged nonnormalized perceptron) * * @author Vitor Carvalho */	TokenNameCOMMENT_JAVADOC	 Voted perceptron algorithm. As described in "Large Margin Classification Using the Perceptron Algorithm", Yoav Freund and Robert E. Schapire, Proceedings of the Eleventh Annual Conference on Computational Learning Theory, 1998. * Polynomial kernel is implemented: K(x,y) = (coef0+gamma*<x,y>)^d Both "voted" and "averaged" modes are implemented (unnormalized). Poly degree = 0 means that no kernel is used. * Therefore, mode "averaged" with degree=0 should be equivalent to results in VotedPerceptron.java (file with a faster implementation of the averaged nonnormalized perceptron) * @author Vitor Carvalho 
public	TokenNamepublic	
class	TokenNameclass	
KernelVotedPerceptron	TokenNameIdentifier	 Kernel Voted Perceptron
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
20080128L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
//serialization stuff 	TokenNameCOMMENT_LINE	serialization stuff 
private	TokenNameprivate	
static	TokenNamestatic	
Logger	TokenNameIdentifier	 Logger
log	TokenNameIdentifier	 log
=	TokenNameEQUAL	
Logger	TokenNameIdentifier	 Logger
.	TokenNameDOT	
getLogger	TokenNameIdentifier	 get Logger
(	TokenNameLPAREN	
KernelVotedPerceptron	TokenNameIdentifier	 Kernel Voted Perceptron
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Hyperplane	TokenNameIdentifier	 Hyperplane
v_k	TokenNameIdentifier	 v k
;	TokenNameSEMICOLON	
//current hypothesis 	TokenNameCOMMENT_LINE	current hypothesis 
private	TokenNameprivate	
int	TokenNameint	
c_k	TokenNameIdentifier	 c k
;	TokenNameSEMICOLON	
//mistake counter 	TokenNameCOMMENT_LINE	mistake counter 
private	TokenNameprivate	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Hyperplane	TokenNameIdentifier	 Hyperplane
>	TokenNameGREATER	
listVK	TokenNameIdentifier	 list VK
;	TokenNameSEMICOLON	
//list with v_k, 	TokenNameCOMMENT_LINE	list with v_k, 
private	TokenNameprivate	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
>	TokenNameGREATER	
listCK	TokenNameIdentifier	 list CK
;	TokenNameSEMICOLON	
//and list with c_k 	TokenNameCOMMENT_LINE	and list with c_k 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
mode	TokenNameIdentifier	 mode
=	TokenNameEQUAL	
"voted"	TokenNameStringLiteral	voted
;	TokenNameSEMICOLON	
// "voted"(default) or "averaged" 	TokenNameCOMMENT_LINE	"voted"(default) or "averaged" 
//poly kernel 	TokenNameCOMMENT_LINE	poly kernel 
private	TokenNameprivate	
int	TokenNameint	
degree	TokenNameIdentifier	 degree
=	TokenNameEQUAL	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
//degree of poly kernel; default is 3 	TokenNameCOMMENT_LINE	degree of poly kernel; default is 3 
private	TokenNameprivate	
double	TokenNamedouble	
gamma	TokenNameIdentifier	 gamma
=	TokenNameEQUAL	
10	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
coef0	TokenNameIdentifier	 coef0
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
//K(x,y) = (coef0+gamma*<x,y>)^d 	TokenNameCOMMENT_LINE	K(x,y) = (coef0+gamma*<x,y>)^d 
//speeds up inference by using only last MAXVEC kernels. Approximate results. 	TokenNameCOMMENT_LINE	speeds up inference by using only last MAXVEC kernels. Approximate results. 
private	TokenNameprivate	
boolean	TokenNameboolean	
speedup	TokenNameIdentifier	 speedup
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
//false;// 	TokenNameCOMMENT_LINE	false;// 
private	TokenNameprivate	
int	TokenNameint	
MAXVEC	TokenNameIdentifier	 MAXVEC
=	TokenNameEQUAL	
300	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
//maximum of 1000 support vectors, for speed up 	TokenNameCOMMENT_LINE	maximum of 1000 support vectors, for speed up 
/** * Constructor: specifies degree of poly kernel and mode * Example KernelVotedPerceptron(3,"averaged") or (5,"voted") * @param degree * @param mode */	TokenNameCOMMENT_JAVADOC	 Constructor: specifies degree of poly kernel and mode Example KernelVotedPerceptron(3,"averaged") or (5,"voted") @param degree @param mode 
public	TokenNamepublic	
KernelVotedPerceptron	TokenNameIdentifier	 Kernel Voted Perceptron
(	TokenNameLPAREN	
int	TokenNameint	
degree	TokenNameIdentifier	 degree
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
mode	TokenNameIdentifier	 mode
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
degree	TokenNameIdentifier	 degree
=	TokenNameEQUAL	
degree	TokenNameIdentifier	 degree
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
mode	TokenNameIdentifier	 mode
=	TokenNameEQUAL	
mode	TokenNameIdentifier	 mode
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Default Constructor: degree=3 and mode="voted" */	TokenNameCOMMENT_JAVADOC	 Default Constructor: degree=3 and mode="voted" 
public	TokenNamepublic	
KernelVotedPerceptron	TokenNameIdentifier	 Kernel Voted Perceptron
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * set degree of poly kernel K(x,y) = (coef0+ gamma*<x,y>)^d * if set to 0, usual <x,v> crossproduct is used. * @param d */	TokenNameCOMMENT_JAVADOC	 set degree of poly kernel K(x,y) = (coef0+ gamma*<x,y>)^d if set to 0, usual <x,v> crossproduct is used. @param d 
public	TokenNamepublic	
void	TokenNamevoid	
setKernel	TokenNameIdentifier	 set Kernel
(	TokenNameLPAREN	
int	TokenNameint	
d	TokenNameIdentifier	 d
)	TokenNameRPAREN	
{	TokenNameLBRACE	
degree	TokenNameIdentifier	 degree
=	TokenNameEQUAL	
d	TokenNameIdentifier	 d
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * set params of poly kernel K(x,y) = (coef0+ gamma*<x,y>)^d * @param coef0 * @param gamma */	TokenNameCOMMENT_JAVADOC	 set params of poly kernel K(x,y) = (coef0+ gamma*<x,y>)^d @param coef0 @param gamma 
public	TokenNamepublic	
void	TokenNamevoid	
setPolyKernelParams	TokenNameIdentifier	 set Poly Kernel Params
(	TokenNameLPAREN	
double	TokenNamedouble	
coef0	TokenNameIdentifier	 coef0
,	TokenNameCOMMA	
double	TokenNamedouble	
gamma	TokenNameIdentifier	 gamma
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
coef0	TokenNameIdentifier	 coef0
=	TokenNameEQUAL	
coef0	TokenNameIdentifier	 coef0
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
gamma	TokenNameIdentifier	 gamma
=	TokenNameEQUAL	
gamma	TokenNameIdentifier	 gamma
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
v_k	TokenNameIdentifier	 v k
=	TokenNameEQUAL	
new	TokenNamenew	
Hyperplane	TokenNameIdentifier	 Hyperplane
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
listVK	TokenNameIdentifier	 list VK
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
Hyperplane	TokenNameIdentifier	 Hyperplane
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
listCK	TokenNameIdentifier	 list CK
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
c_k	TokenNameIdentifier	 c k
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//set mode: voted or averaged 	TokenNameCOMMENT_LINE	set mode: voted or averaged 
public	TokenNamepublic	
void	TokenNamevoid	
setModeVoted	TokenNameIdentifier	 set Mode Voted
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
mode	TokenNameIdentifier	 mode
=	TokenNameEQUAL	
"voted"	TokenNameStringLiteral	voted
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setModeAveraged	TokenNameIdentifier	 set Mode Averaged
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
mode	TokenNameIdentifier	 mode
=	TokenNameEQUAL	
"averaged"	TokenNameStringLiteral	averaged
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set speed-up: use only last 300 support vectors in testing */	TokenNameCOMMENT_JAVADOC	 Set speed-up: use only last 300 support vectors in testing 
public	TokenNamepublic	
void	TokenNamevoid	
setSpeedUp	TokenNameIdentifier	 set Speed Up
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
speedup	TokenNameIdentifier	 speedup
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//store support vectors and their counts (number of mistakes) 	TokenNameCOMMENT_LINE	store support vectors and their counts (number of mistakes) 
private	TokenNameprivate	
void	TokenNamevoid	
store	TokenNameIdentifier	 store
(	TokenNameLPAREN	
Hyperplane	TokenNameIdentifier	 Hyperplane
h	TokenNameIdentifier	 h
,	TokenNameCOMMA	
int	TokenNameint	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Hyperplane	TokenNameIdentifier	 Hyperplane
hh	TokenNameIdentifier	 hh
=	TokenNameEQUAL	
new	TokenNamenew	
Hyperplane	TokenNameIdentifier	 Hyperplane
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
hh	TokenNameIdentifier	 hh
.	TokenNameDOT	
increment	TokenNameIdentifier	 increment
(	TokenNameLPAREN	
h	TokenNameIdentifier	 h
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
listVK	TokenNameIdentifier	 list VK
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
hh	TokenNameIdentifier	 hh
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
listCK	TokenNameIdentifier	 list CK
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//update rule for training: Figure 1 in Freund & Schapire paper 	TokenNameCOMMENT_LINE	update rule for training: Figure 1 in Freund & Schapire paper 
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
if	TokenNameif	
(	TokenNameLPAREN	
Kernel	TokenNameIdentifier	 Kernel
(	TokenNameLPAREN	
v_k	TokenNameIdentifier	 v k
,	TokenNameCOMMA	
example	TokenNameIdentifier	 example
.	TokenNameDOT	
asInstance	TokenNameIdentifier	 as Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
y_t	TokenNameIdentifier	 y t
<=	TokenNameLESS_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//prediction error occurred 	TokenNameCOMMENT_LINE	prediction error occurred 
store	TokenNameIdentifier	 store
(	TokenNameLPAREN	
v_k	TokenNameIdentifier	 v k
,	TokenNameCOMMA	
c_k	TokenNameIdentifier	 c k
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
v_k	TokenNameIdentifier	 v k
.	TokenNameDOT	
increment	TokenNameIdentifier	 increment
(	TokenNameLPAREN	
example	TokenNameIdentifier	 example
,	TokenNameCOMMA	
y_t	TokenNameIdentifier	 y t
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
c_k	TokenNameIdentifier	 c k
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
c_k	TokenNameIdentifier	 c k
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// poly kernel function 	TokenNameCOMMENT_LINE	poly kernel function 
double	TokenNamedouble	
Kernel	TokenNameIdentifier	 Kernel
(	TokenNameLPAREN	
Hyperplane	TokenNameIdentifier	 Hyperplane
h	TokenNameIdentifier	 h
,	TokenNameCOMMA	
Instance	TokenNameIdentifier	 Instance
ins	TokenNameIdentifier	 ins
)	TokenNameRPAREN	
{	TokenNameLBRACE	
double	TokenNamedouble	
score	TokenNameIdentifier	 score
=	TokenNameEQUAL	
h	TokenNameIdentifier	 h
.	TokenNameDOT	
score	TokenNameIdentifier	 score
(	TokenNameLPAREN	
ins	TokenNameIdentifier	 ins
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
degree	TokenNameIdentifier	 degree
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
score	TokenNameIdentifier	 score
;	TokenNameSEMICOLON	
//no kernels 	TokenNameCOMMENT_LINE	no kernels 
else	TokenNameelse	
return	TokenNamereturn	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
pow	TokenNameIdentifier	 pow
(	TokenNameLPAREN	
coef0	TokenNameIdentifier	 coef0
+	TokenNamePLUS	
(	TokenNameLPAREN	
score	TokenNameIdentifier	 score
*	TokenNameMULTIPLY	
gamma	TokenNameIdentifier	 gamma
)	TokenNameRPAREN	
,	TokenNameCOMMA	
degree	TokenNameIdentifier	 degree
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//TESTING ------------------------------------------------------------ 	TokenNameCOMMENT_LINE	TESTING ------------------------------------------------------------ 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
Classifier	TokenNameIdentifier	 Classifier
getClassifier	TokenNameIdentifier	 get Classifier
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
MyClassifier	TokenNameIdentifier	 My Classifier
(	TokenNameLPAREN	
listVK	TokenNameIdentifier	 list VK
,	TokenNameCOMMA	
listCK	TokenNameIdentifier	 list CK
)	TokenNameRPAREN	
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
private	TokenNameprivate	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Hyperplane	TokenNameIdentifier	 Hyperplane
>	TokenNameGREATER	
listVK	TokenNameIdentifier	 list VK
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
>	TokenNameGREATER	
counts	TokenNameIdentifier	 counts
;	TokenNameSEMICOLON	
public	TokenNamepublic	
MyClassifier	TokenNameIdentifier	 My Classifier
(	TokenNameLPAREN	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Hyperplane	TokenNameIdentifier	 Hyperplane
>	TokenNameGREATER	
li	TokenNameIdentifier	 li
,	TokenNameCOMMA	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
>	TokenNameGREATER	
cc	TokenNameIdentifier	 cc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
listVK	TokenNameIdentifier	 list VK
=	TokenNameEQUAL	
li	TokenNameIdentifier	 li
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
counts	TokenNameIdentifier	 counts
=	TokenNameEQUAL	
cc	TokenNameIdentifier	 cc
;	TokenNameSEMICOLON	
log	TokenNameIdentifier	 log
.	TokenNameDOT	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
"info: KernelVotedPerceptron: number sup vectors = "	TokenNameStringLiteral	info: KernelVotedPerceptron: number sup vectors = 
+	TokenNamePLUS	
listVK	TokenNameIdentifier	 list VK
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" mode="	TokenNameStringLiteral	 mode=
+	TokenNamePLUS	
mode	TokenNameIdentifier	 mode
+	TokenNamePLUS	
" kernel="	TokenNameStringLiteral	 kernel=
+	TokenNamePLUS	
degree	TokenNameIdentifier	 degree
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//implements decision rule 	TokenNameCOMMENT_LINE	implements decision rule 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
ClassLabel	TokenNameIdentifier	 Class Label
classification	TokenNameIdentifier	 classification
(	TokenNameLPAREN	
Instance	TokenNameIdentifier	 Instance
ins	TokenNameIdentifier	 ins
)	TokenNameRPAREN	
{	TokenNameLBRACE	
double	TokenNamedouble	
dec	TokenNameIdentifier	 dec
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
mode	TokenNameIdentifier	 mode
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
"voted"	TokenNameStringLiteral	voted
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
dec	TokenNameIdentifier	 dec
=	TokenNameEQUAL	
calculateVoted	TokenNameIdentifier	 calculate Voted
(	TokenNameLPAREN	
ins	TokenNameIdentifier	 ins
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
mode	TokenNameIdentifier	 mode
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
"averaged"	TokenNameStringLiteral	averaged
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
dec	TokenNameIdentifier	 dec
=	TokenNameEQUAL	
calculateAveraged	TokenNameIdentifier	 calculate Averaged
(	TokenNameLPAREN	
ins	TokenNameIdentifier	 ins
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Mode("	TokenNameStringLiteral	Mode(
+	TokenNamePLUS	
mode	TokenNameIdentifier	 mode
+	TokenNamePLUS	
") is not allowed Please use either "voted" or "averaged""	TokenNameStringLiteral	) is not allowed Please use either "voted" or "averaged"
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
exit	TokenNameIdentifier	 exit
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
//voted mode 	TokenNameCOMMENT_LINE	voted mode 
private	TokenNameprivate	
double	TokenNamedouble	
calculateVoted	TokenNameIdentifier	 calculate Voted
(	TokenNameLPAREN	
Instance	TokenNameIdentifier	 Instance
ins	TokenNameIdentifier	 ins
)	TokenNameRPAREN	
{	TokenNameLBRACE	
double	TokenNamedouble	
score	TokenNameIdentifier	 score
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
FIRSTVEC	TokenNameIdentifier	 FIRSTVEC
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
speedup	TokenNameIdentifier	 speedup
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
MAX	TokenNameIdentifier	 MAX
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
min	TokenNameIdentifier	 min
(	TokenNameLPAREN	
MAXVEC	TokenNameIdentifier	 MAXVEC
,	TokenNameCOMMA	
listVK	TokenNameIdentifier	 list VK
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FIRSTVEC	TokenNameIdentifier	 FIRSTVEC
=	TokenNameEQUAL	
listVK	TokenNameIdentifier	 list VK
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
MAX	TokenNameIdentifier	 MAX
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
FIRSTVEC	TokenNameIdentifier	 FIRSTVEC
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
listVK	TokenNameIdentifier	 list VK
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Hyperplane	TokenNameIdentifier	 Hyperplane
v_k	TokenNameIdentifier	 v k
=	TokenNameEQUAL	
listVK	TokenNameIdentifier	 list VK
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//v_k 	TokenNameCOMMENT_LINE	v_k 
int	TokenNameint	
countt	TokenNameIdentifier	 countt
=	TokenNameEQUAL	
(	TokenNameLPAREN	
counts	TokenNameIdentifier	 counts
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
intValue	TokenNameIdentifier	 int Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//c_k counts 	TokenNameCOMMENT_LINE	c_k counts 
double	TokenNamedouble	
kernelScore	TokenNameIdentifier	 kernel Score
=	TokenNameEQUAL	
Kernel	TokenNameIdentifier	 Kernel
(	TokenNameLPAREN	
v_k	TokenNameIdentifier	 v k
,	TokenNameCOMMA	
(	TokenNameLPAREN	
ins	TokenNameIdentifier	 ins
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
sign	TokenNameIdentifier	 sign
=	TokenNameEQUAL	
(	TokenNameLPAREN	
kernelScore	TokenNameIdentifier	 kernel Score
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
//voting 	TokenNameCOMMENT_LINE	voting 
score	TokenNameIdentifier	 score
+=	TokenNamePLUS_EQUAL	
countt	TokenNameIdentifier	 countt
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
sign	TokenNameIdentifier	 sign
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
score	TokenNameIdentifier	 score
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//average unnormalized mode 	TokenNameCOMMENT_LINE	average unnormalized mode 
private	TokenNameprivate	
double	TokenNamedouble	
calculateAveraged	TokenNameIdentifier	 calculate Averaged
(	TokenNameLPAREN	
Instance	TokenNameIdentifier	 Instance
ins	TokenNameIdentifier	 ins
)	TokenNameRPAREN	
{	TokenNameLBRACE	
double	TokenNamedouble	
score	TokenNameIdentifier	 score
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
FIRSTVEC	TokenNameIdentifier	 FIRSTVEC
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
speedup	TokenNameIdentifier	 speedup
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
MAX	TokenNameIdentifier	 MAX
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
min	TokenNameIdentifier	 min
(	TokenNameLPAREN	
MAXVEC	TokenNameIdentifier	 MAXVEC
,	TokenNameCOMMA	
listVK	TokenNameIdentifier	 list VK
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FIRSTVEC	TokenNameIdentifier	 FIRSTVEC
=	TokenNameEQUAL	
listVK	TokenNameIdentifier	 list VK
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
MAX	TokenNameIdentifier	 MAX
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
FIRSTVEC	TokenNameIdentifier	 FIRSTVEC
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
listVK	TokenNameIdentifier	 list VK
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Hyperplane	TokenNameIdentifier	 Hyperplane
hp	TokenNameIdentifier	 hp
=	TokenNameEQUAL	
listVK	TokenNameIdentifier	 list VK
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
countt	TokenNameIdentifier	 countt
=	TokenNameEQUAL	
(	TokenNameLPAREN	
counts	TokenNameIdentifier	 counts
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
intValue	TokenNameIdentifier	 int Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
score	TokenNameIdentifier	 score
+=	TokenNamePLUS_EQUAL	
countt	TokenNameIdentifier	 countt
*	TokenNameMULTIPLY	
Kernel	TokenNameIdentifier	 Kernel
(	TokenNameLPAREN	
hp	TokenNameIdentifier	 hp
,	TokenNameCOMMA	
ins	TokenNameIdentifier	 ins
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// System.out.println(score); 	TokenNameCOMMENT_LINE	System.out.println(score); 
}	TokenNameRBRACE	
// System.out.println("----------------------------"); 	TokenNameCOMMENT_LINE	System.out.println("----------------------------"); 
return	TokenNamereturn	
score	TokenNameIdentifier	 score
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
"KernelVotedPerceptron: Not implemented yet"	TokenNameStringLiteral	KernelVotedPerceptron: Not implemented yet
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
"Kernel Perceptron Explanation (not valid!)"	TokenNameStringLiteral	Kernel Perceptron Explanation (not valid!)
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
20080128L	TokenNameLongLiteral	
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
//dummy hyperplane: return last perceptron 	TokenNameCOMMENT_LINE	dummy hyperplane: return last perceptron 
Hyperplane	TokenNameIdentifier	 Hyperplane
hh	TokenNameIdentifier	 hh
=	TokenNameEQUAL	
mycl	TokenNameIdentifier	 mycl
.	TokenNameDOT	
listVK	TokenNameIdentifier	 list VK
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
listVK	TokenNameIdentifier	 list VK
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
hh	TokenNameIdentifier	 hh
;	TokenNameSEMICOLON	
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
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"Kernel Voted Perceptron"	TokenNameStringLiteral	Kernel Voted Perceptron
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
