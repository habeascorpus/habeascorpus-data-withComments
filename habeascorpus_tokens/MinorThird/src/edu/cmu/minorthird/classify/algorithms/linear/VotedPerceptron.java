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
OnlineBinaryClassifierLearner	TokenNameIdentifier	 Online Binary Classifier Learner
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
*	TokenNameMULTIPLY	
;	TokenNameSEMICOLON	
/** * Voted perceptron algorithm. As described in "Large Margin * Classification Using the Perceptron Algorithm", Yoav Freund and * Robert E. Schapire, Proceedings of the Eleventh Annual Conference * on Computational Learning Theory, * 1998. * * @author William Cohen */	TokenNameCOMMENT_JAVADOC	 Voted perceptron algorithm. As described in "Large Margin Classification Using the Perceptron Algorithm", Yoav Freund and Robert E. Schapire, Proceedings of the Eleventh Annual Conference on Computational Learning Theory, 1998. * @author William Cohen 
/* Following the notation of F & S, the voted perceptron will maintain weight vectors S_t and W_t as follows: W_t = d_t x_t + W_{t-1} S_t = W_t + S_{t-1} where d_t = (prediction error on x_t) ? y_t : 0 the prediction score of averaged perceptron on x is inner product <S_t,x> the prediction score of perceptron on x is inner product <W_t,x> For kernels, we would compute for each x after training on x1,..,x_T for t = 1...T KW_t(x) = KW_{t-1}(x) + d_t K(x_t,x) KS_t(x) = KS_{t-1}(x) + KW_t(x) But that's not implemented here. April 2007: see KernelVotedPerceptron.java for implementation of this algorithm with kernels. */	TokenNameCOMMENT_BLOCK	 Following the notation of F & S, the voted perceptron will maintain weight vectors S_t and W_t as follows: W_t = d_t x_t + W_{t-1} S_t = W_t + S_{t-1} where d_t = (prediction error on x_t) ? y_t : 0 the prediction score of averaged perceptron on x is inner product <S_t,x> the prediction score of perceptron on x is inner product <W_t,x> For kernels, we would compute for each x after training on x1,..,x_T for t = 1...T KW_t(x) = KW_{t-1}(x) + d_t K(x_t,x) KS_t(x) = KS_{t-1}(x) + KW_t(x) But that's not implemented here. April 2007: see KernelVotedPerceptron.java for implementation of this algorithm with kernels. 
public	TokenNamepublic	
class	TokenNameclass	
VotedPerceptron	TokenNameIdentifier	 Voted Perceptron
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
s_t	TokenNameIdentifier	 s t
,	TokenNameCOMMA	
w_t	TokenNameIdentifier	 w t
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
ignoreWeights	TokenNameIdentifier	 ignore Weights
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
//private long mistakeCount; 	TokenNameCOMMENT_LINE	private long mistakeCount; 
public	TokenNamepublic	
VotedPerceptron	TokenNameIdentifier	 Voted Perceptron
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** If ignoreWeights is true, treat all weights as binary. For * backward compatibility with an older buggy version. */	TokenNameCOMMENT_JAVADOC	 If ignoreWeights is true, treat all weights as binary. For backward compatibility with an older buggy version. 
public	TokenNamepublic	
VotedPerceptron	TokenNameIdentifier	 Voted Perceptron
(	TokenNameLPAREN	
boolean	TokenNameboolean	
ignoreWeights	TokenNameIdentifier	 ignore Weights
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
ignoreWeights	TokenNameIdentifier	 ignore Weights
=	TokenNameEQUAL	
ignoreWeights	TokenNameIdentifier	 ignore Weights
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
s_t	TokenNameIdentifier	 s t
=	TokenNameEQUAL	
new	TokenNamenew	
Hyperplane	TokenNameIdentifier	 Hyperplane
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
w_t	TokenNameIdentifier	 w t
=	TokenNameEQUAL	
new	TokenNamenew	
Hyperplane	TokenNameIdentifier	 Hyperplane
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ignoreWeights	TokenNameIdentifier	 ignore Weights
)	TokenNameRPAREN	
{	TokenNameLBRACE	
s_t	TokenNameIdentifier	 s t
.	TokenNameDOT	
startIgnoringWeights	TokenNameIdentifier	 start Ignoring Weights
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
w_t	TokenNameIdentifier	 w t
.	TokenNameDOT	
startIgnoringWeights	TokenNameIdentifier	 start Ignoring Weights
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//mistakeCount=0; 	TokenNameCOMMENT_LINE	mistakeCount=0; 
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
*	TokenNameMULTIPLY	
y_t	TokenNameIdentifier	 y t
<=	TokenNameLESS_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
w_t	TokenNameIdentifier	 w t
.	TokenNameDOT	
increment	TokenNameIdentifier	 increment
(	TokenNameLPAREN	
example	TokenNameIdentifier	 example
,	TokenNameCOMMA	
y_t	TokenNameIdentifier	 y t
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
s_t	TokenNameIdentifier	 s t
.	TokenNameDOT	
increment	TokenNameIdentifier	 increment
(	TokenNameLPAREN	
w_t	TokenNameIdentifier	 w t
,	TokenNameCOMMA	
1.0	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
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
return	TokenNamereturn	
s_t	TokenNameIdentifier	 s t
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//------------------------------------------------------- 	TokenNameCOMMENT_LINE	------------------------------------------------------- 
//Faster implementation. Not tested yet. 	TokenNameCOMMENT_LINE	Faster implementation. Not tested yet. 
// 	TokenNameCOMMENT_LINE	 
// public void addExample(Example example) 	TokenNameCOMMENT_LINE	public void addExample(Example example) 
// { 	TokenNameCOMMENT_LINE	{ 
// double y_t = example.getLabel().numericLabel(); 	TokenNameCOMMENT_LINE	double y_t = example.getLabel().numericLabel(); 
// if (w_t.score(example.asInstance()) * y_t <= 0) { 	TokenNameCOMMENT_LINE	if (w_t.score(example.asInstance()) * y_t <= 0) { 
// updateVotedHyperplane(mistakeCount); 	TokenNameCOMMENT_LINE	updateVotedHyperplane(mistakeCount); 
// mistakeCount =1; 	TokenNameCOMMENT_LINE	mistakeCount =1; 
// w_t.increment( example, y_t ); 	TokenNameCOMMENT_LINE	w_t.increment( example, y_t ); 
// } 	TokenNameCOMMENT_LINE	} 
// else{ 	TokenNameCOMMENT_LINE	else{ 
// mistakeCount++; 	TokenNameCOMMENT_LINE	mistakeCount++; 
// } 	TokenNameCOMMENT_LINE	} 
// } 	TokenNameCOMMENT_LINE	} 
// public void updateVotedHyperplane(double count){ 	TokenNameCOMMENT_LINE	public void updateVotedHyperplane(double count){ 
// s_t.increment(w_t,count); 	TokenNameCOMMENT_LINE	s_t.increment(w_t,count); 
// } 	TokenNameCOMMENT_LINE	} 
// public Classifier getClassifier() 	TokenNameCOMMENT_LINE	public Classifier getClassifier() 
// { 	TokenNameCOMMENT_LINE	{ 
// updateVotedHyperplane(mistakeCount); 	TokenNameCOMMENT_LINE	updateVotedHyperplane(mistakeCount); 
// mistakeCount = 0; 	TokenNameCOMMENT_LINE	mistakeCount = 0; 
// return s_t; 	TokenNameCOMMENT_LINE	return s_t; 
// } 	TokenNameCOMMENT_LINE	} 
//--------------------------------------------------------- 	TokenNameCOMMENT_LINE	--------------------------------------------------------- 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"VotedPerceptron"	TokenNameStringLiteral	VotedPerceptron
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
