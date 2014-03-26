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
/** * Perceptron algorithm. Slighly modified to (a) update when * examples don't satisfy a margin requirement and (b) optionally, * classify with a voting scheme. * * @author William Cohen */	TokenNameCOMMENT_JAVADOC	 Perceptron algorithm. Slighly modified to (a) update when examples don't satisfy a margin requirement and (b) optionally, classify with a voting scheme. * @author William Cohen 
public	TokenNamepublic	
class	TokenNameclass	
MarginPerceptron	TokenNameIdentifier	 Margin Perceptron
extends	TokenNameextends	
OnlineBinaryClassifierLearner	TokenNameIdentifier	 Online Binary Classifier Learner
{	TokenNameLBRACE	
private	TokenNameprivate	
Hyperplane	TokenNameIdentifier	 Hyperplane
s_t	TokenNameIdentifier	 s t
,	TokenNameCOMMA	
w_t	TokenNameIdentifier	 w t
;	TokenNameSEMICOLON	
private	TokenNameprivate	
double	TokenNamedouble	
minMargin	TokenNameIdentifier	 min Margin
=	TokenNameEQUAL	
1.0	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
voteBeforeTrainingComplete	TokenNameIdentifier	 vote Before Training Complete
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
voteAfterTrainingComplete	TokenNameIdentifier	 vote After Training Complete
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
trainingComplete	TokenNameIdentifier	 training Complete
;	TokenNameSEMICOLON	
private	TokenNameprivate	
double	TokenNamedouble	
numExamples	TokenNameIdentifier	 num Examples
;	TokenNameSEMICOLON	
int	TokenNameint	
numExamplesAdded	TokenNameIdentifier	 num Examples Added
;	TokenNameSEMICOLON	
public	TokenNamepublic	
MarginPerceptron	TokenNameIdentifier	 Margin Perceptron
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
1.0	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
MarginPerceptron	TokenNameIdentifier	 Margin Perceptron
(	TokenNameLPAREN	
double	TokenNamedouble	
minMargin	TokenNameIdentifier	 min Margin
,	TokenNameCOMMA	
boolean	TokenNameboolean	
voteBeforeTrainingComplete	TokenNameIdentifier	 vote Before Training Complete
,	TokenNameCOMMA	
boolean	TokenNameboolean	
voteAfterTrainingComplete	TokenNameIdentifier	 vote After Training Complete
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
minMargin	TokenNameIdentifier	 min Margin
=	TokenNameEQUAL	
minMargin	TokenNameIdentifier	 min Margin
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
voteBeforeTrainingComplete	TokenNameIdentifier	 vote Before Training Complete
=	TokenNameEQUAL	
voteBeforeTrainingComplete	TokenNameIdentifier	 vote Before Training Complete
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
voteAfterTrainingComplete	TokenNameIdentifier	 vote After Training Complete
=	TokenNameEQUAL	
voteAfterTrainingComplete	TokenNameIdentifier	 vote After Training Complete
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
trainingComplete	TokenNameIdentifier	 training Complete
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
numExamples	TokenNameIdentifier	 num Examples
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
numExamples	TokenNameIdentifier	 num Examples
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
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
//System.out.println("add example: score "+w_t.score(example.asInstance())+" target "+y_t+" margin "+minMargin); 	TokenNameCOMMENT_LINE	System.out.println("add example: score "+w_t.score(example.asInstance())+" target "+y_t+" margin "+minMargin); 
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
minMargin	TokenNameIdentifier	 min Margin
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//System.out.println("update w_t weights"); 	TokenNameCOMMENT_LINE	System.out.println("update w_t weights"); 
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
if	TokenNameif	
(	TokenNameLPAREN	
voteAfterTrainingComplete	TokenNameIdentifier	 vote After Training Complete
||	TokenNameOR_OR	
voteBeforeTrainingComplete	TokenNameIdentifier	 vote Before Training Complete
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//System.out.println("update s_t weights"); 	TokenNameCOMMENT_LINE	System.out.println("update s_t weights"); 
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
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
completeTraining	TokenNameIdentifier	 complete Training
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
trainingComplete	TokenNameIdentifier	 training Complete
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
s_t	TokenNameIdentifier	 s t
.	TokenNameDOT	
multiply	TokenNameIdentifier	 multiply
(	TokenNameLPAREN	
1.0	TokenNameDoubleLiteral	
/	TokenNameDIVIDE	
numExamples	TokenNameIdentifier	 num Examples
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
if	TokenNameif	
(	TokenNameLPAREN	
voteBeforeTrainingComplete	TokenNameIdentifier	 vote Before Training Complete
)	TokenNameRPAREN	
return	TokenNamereturn	
s_t	TokenNameIdentifier	 s t
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
voteAfterTrainingComplete	TokenNameIdentifier	 vote After Training Complete
&&	TokenNameAND_AND	
trainingComplete	TokenNameIdentifier	 training Complete
)	TokenNameRPAREN	
return	TokenNamereturn	
s_t	TokenNameIdentifier	 s t
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
w_t	TokenNameIdentifier	 w t
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
"[MarginPerceptron "	TokenNameStringLiteral	[MarginPerceptron 
+	TokenNamePLUS	
minMargin	TokenNameIdentifier	 min Margin
+	TokenNamePLUS	
";"	TokenNameStringLiteral	;
+	TokenNamePLUS	
voteBeforeTrainingComplete	TokenNameIdentifier	 vote Before Training Complete
+	TokenNamePLUS	
";"	TokenNameStringLiteral	;
+	TokenNamePLUS	
voteAfterTrainingComplete	TokenNameIdentifier	 vote After Training Complete
+	TokenNamePLUS	
"]"	TokenNameStringLiteral	]
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
