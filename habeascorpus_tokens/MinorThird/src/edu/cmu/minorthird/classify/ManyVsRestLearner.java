/** * Created on May 18, 2006 * @author Vitor R. Carvalho */	TokenNameCOMMENT_JAVADOC	 Created on May 18, 2006 @author Vitor R. Carvalho 
package	TokenNamepackage	
edu	TokenNameIdentifier	 edu
.	TokenNameDOT	
cmu	TokenNameIdentifier	 cmu
.	TokenNameDOT	
minorthird	TokenNameIdentifier	 minorthird
.	TokenNameDOT	
classify	TokenNameIdentifier	 classify
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
*	TokenNameMULTIPLY	
;	TokenNameSEMICOLON	
/** * Multi-class version of a binary classifier; Generalizes OneVsAllLearner. * OneVsAll allows one class with positive labels for each example, and the rest with negative labels. * In ManyVsRest, in each example many classes may be positive. * * @author Vitor Carvalho. */	TokenNameCOMMENT_JAVADOC	 Multi-class version of a binary classifier; Generalizes OneVsAllLearner. OneVsAll allows one class with positive labels for each example, and the rest with negative labels. In ManyVsRest, in each example many classes may be positive. * @author Vitor Carvalho. 
public	TokenNamepublic	
class	TokenNameclass	
ManyVsRestLearner	TokenNameIdentifier	 Many Vs Rest Learner
extends	TokenNameextends	
OneVsAllLearner	TokenNameIdentifier	 One Vs All Learner
{	TokenNameLBRACE	
public	TokenNamepublic	
ManyVsRestLearner	TokenNameIdentifier	 Many Vs Rest Learner
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
ManyVsRestLearner	TokenNameIdentifier	 Many Vs Rest Learner
(	TokenNameLPAREN	
BatchClassifierLearner	TokenNameIdentifier	 Batch Classifier Learner
learner1	TokenNameIdentifier	 learner1
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
learner1	TokenNameIdentifier	 learner1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
ManyVsRestLearner	TokenNameIdentifier	 Many Vs Rest Learner
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
learnerName	TokenNameIdentifier	 learner Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
learnerName	TokenNameIdentifier	 learner Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
ClassifierLearner	TokenNameIdentifier	 Classifier Learner
copy	TokenNameIdentifier	 copy
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ManyVsRestLearner	TokenNameIdentifier	 Many Vs Rest Learner
learner	TokenNameIdentifier	 learner
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
learner	TokenNameIdentifier	 learner
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ManyVsRestLearner	TokenNameIdentifier	 Many Vs Rest Learner
)	TokenNameRPAREN	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
innerLearner	TokenNameIdentifier	 inner Learner
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
learner	TokenNameIdentifier	 learner
.	TokenNameDOT	
innerLearner	TokenNameIdentifier	 inner Learner
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
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
innerLearner	TokenNameIdentifier	 inner Learner
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ClassifierLearner	TokenNameIdentifier	 Classifier Learner
inner	TokenNameIdentifier	 inner
=	TokenNameEQUAL	
(	TokenNameLPAREN	
innerLearner	TokenNameIdentifier	 inner Learner
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
learner	TokenNameIdentifier	 learner
.	TokenNameDOT	
innerLearner	TokenNameIdentifier	 inner Learner
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
inner	TokenNameIdentifier	 inner
.	TokenNameDOT	
copy	TokenNameIdentifier	 copy
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Can't CLONE ManyVsRestLearner!!"	TokenNameStringLiteral	Can't CLONE ManyVsRestLearner!!
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
printStackTrace	TokenNameIdentifier	 print Stack Trace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
learner	TokenNameIdentifier	 learner
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
addExample	TokenNameIdentifier	 add Example
(	TokenNameLPAREN	
Example	TokenNameIdentifier	 Example
answeredQuery	TokenNameIdentifier	 answered Query
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
possibleLabels	TokenNameIdentifier	 possible Labels
=	TokenNameEQUAL	
answeredQuery	TokenNameIdentifier	 answered Query
.	TokenNameDOT	
getLabel	TokenNameIdentifier	 get Label
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
possibleLabels	TokenNameIdentifier	 possible Labels
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
innerLearner	TokenNameIdentifier	 inner Learner
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
boolean	TokenNameboolean	
positive	TokenNameIdentifier	 positive
=	TokenNameEQUAL	
possibleLabels	TokenNameIdentifier	 possible Labels
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
schema	TokenNameIdentifier	 schema
.	TokenNameDOT	
getClassName	TokenNameIdentifier	 get Class Name
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ClassLabel	TokenNameIdentifier	 Class Label
label	TokenNameIdentifier	 label
=	TokenNameEQUAL	
positive	TokenNameIdentifier	 positive
?	TokenNameQUESTION	
ClassLabel	TokenNameIdentifier	 Class Label
.	TokenNameDOT	
positiveLabel	TokenNameIdentifier	 positive Label
(	TokenNameLPAREN	
1.0	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
:	TokenNameCOLON	
ClassLabel	TokenNameIdentifier	 Class Label
.	TokenNameDOT	
negativeLabel	TokenNameIdentifier	 negative Label
(	TokenNameLPAREN	
-	TokenNameMINUS	
1.0	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
innerLearner	TokenNameIdentifier	 inner Learner
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
addExample	TokenNameIdentifier	 add Example
(	TokenNameLPAREN	
new	TokenNamenew	
Example	TokenNameIdentifier	 Example
(	TokenNameLPAREN	
answeredQuery	TokenNameIdentifier	 answered Query
.	TokenNameDOT	
asInstance	TokenNameIdentifier	 as Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
label	TokenNameIdentifier	 label
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
