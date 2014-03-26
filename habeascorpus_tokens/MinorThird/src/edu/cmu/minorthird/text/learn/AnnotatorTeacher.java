package	TokenNamepackage	
edu	TokenNameIdentifier	 edu
.	TokenNameDOT	
cmu	TokenNameIdentifier	 cmu
.	TokenNameDOT	
minorthird	TokenNameIdentifier	 minorthird
.	TokenNameDOT	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
learn	TokenNameIdentifier	 learn
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
text	TokenNameIdentifier	 text
.	TokenNameDOT	
*	TokenNameMULTIPLY	
;	TokenNameSEMICOLON	
import	TokenNameimport	
edu	TokenNameIdentifier	 edu
.	TokenNameDOT	
cmu	TokenNameIdentifier	 cmu
.	TokenNameDOT	
minorthird	TokenNameIdentifier	 minorthird
.	TokenNameDOT	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
learn	TokenNameIdentifier	 learn
.	TokenNameDOT	
AnnotatorLearner	TokenNameIdentifier	 Annotator Learner
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
/** * Train a AnnotatorLearner and return the learned * Annotator, using some unspecified source of information to * get AnnotationExample's to train the learner. * * @author William Cohen */	TokenNameCOMMENT_JAVADOC	 Train a AnnotatorLearner and return the learned Annotator, using some unspecified source of information to get AnnotationExample's to train the learner. * @author William Cohen 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
AnnotatorTeacher	TokenNameIdentifier	 Annotator Teacher
{	TokenNameLBRACE	
final	TokenNamefinal	
public	TokenNamepublic	
Annotator	TokenNameIdentifier	 Annotator
train	TokenNameIdentifier	 train
(	TokenNameLPAREN	
AnnotatorLearner	TokenNameIdentifier	 Annotator Learner
learner	TokenNameIdentifier	 learner
)	TokenNameRPAREN	
{	TokenNameLBRACE	
learner	TokenNameIdentifier	 learner
.	TokenNameDOT	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// unsupervised training 	TokenNameCOMMENT_LINE	unsupervised training 
learner	TokenNameIdentifier	 learner
.	TokenNameDOT	
setDocumentPool	TokenNameIdentifier	 set Document Pool
(	TokenNameLPAREN	
documentPool	TokenNameIdentifier	 document Pool
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ProgressCounter	TokenNameIdentifier	 Progress Counter
pc	TokenNameIdentifier	 pc
=	TokenNameEQUAL	
new	TokenNamenew	
ProgressCounter	TokenNameIdentifier	 Progress Counter
(	TokenNameLPAREN	
"presenting examples to AnnotatorLearner"	TokenNameStringLiteral	presenting examples to AnnotatorLearner
,	TokenNameCOMMA	
"document"	TokenNameStringLiteral	document
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// active or passive learning from labeled data 	TokenNameCOMMENT_LINE	active or passive learning from labeled data 
while	TokenNamewhile	
(	TokenNameLPAREN	
learner	TokenNameIdentifier	 learner
.	TokenNameDOT	
hasNextQuery	TokenNameIdentifier	 has Next Query
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
hasAnswers	TokenNameIdentifier	 has Answers
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Span	TokenNameIdentifier	 Span
query	TokenNameIdentifier	 query
=	TokenNameEQUAL	
learner	TokenNameIdentifier	 learner
.	TokenNameDOT	
nextQuery	TokenNameIdentifier	 next Query
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//answeredQuery different between commandline and mixup spanProp creation? 	TokenNameCOMMENT_LINE	answeredQuery different between commandline and mixup spanProp creation? 
AnnotationExample	TokenNameIdentifier	 Annotation Example
answeredQuery	TokenNameIdentifier	 answered Query
=	TokenNameEQUAL	
labelInstance	TokenNameIdentifier	 label Instance
(	TokenNameLPAREN	
query	TokenNameIdentifier	 query
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
answeredQuery	TokenNameIdentifier	 answered Query
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//answeredquery does not include mixup created spanProp 	TokenNameCOMMENT_LINE	answeredquery does not include mixup created spanProp 
learner	TokenNameIdentifier	 learner
.	TokenNameDOT	
setAnswer	TokenNameIdentifier	 set Answer
(	TokenNameLPAREN	
answeredQuery	TokenNameIdentifier	 answered Query
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pc	TokenNameIdentifier	 pc
.	TokenNameDOT	
progress	TokenNameIdentifier	 progress
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
pc	TokenNameIdentifier	 pc
.	TokenNameDOT	
finished	TokenNameIdentifier	 finished
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// final result 	TokenNameCOMMENT_LINE	final result 
return	TokenNamereturn	
learner	TokenNameIdentifier	 learner
.	TokenNameDOT	
getAnnotator	TokenNameIdentifier	 get Annotator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Labels available for training, testing */	TokenNameCOMMENT_JAVADOC	 Labels available for training, testing 
abstract	TokenNameabstract	
public	TokenNamepublic	
TextLabels	TokenNameIdentifier	 Text Labels
availableLabels	TokenNameIdentifier	 available Labels
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Unlabeled instances. */	TokenNameCOMMENT_JAVADOC	 Unlabeled instances. 
abstract	TokenNameabstract	
public	TokenNamepublic	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Span	TokenNameIdentifier	 Span
>	TokenNameGREATER	
documentPool	TokenNameIdentifier	 document Pool
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Label an Span queried by the learner. Return null if the query * can't be answered, otherwise return an AnnotationExample. */	TokenNameCOMMENT_JAVADOC	 Label an Span queried by the learner. Return null if the query can't be answered, otherwise return an AnnotationExample. 
abstract	TokenNameabstract	
public	TokenNamepublic	
AnnotationExample	TokenNameIdentifier	 Annotation Example
labelInstance	TokenNameIdentifier	 label Instance
(	TokenNameLPAREN	
Span	TokenNameIdentifier	 Span
query	TokenNameIdentifier	 query
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Return true if this teacher can answer more queries. */	TokenNameCOMMENT_JAVADOC	 Return true if this teacher can answer more queries. 
abstract	TokenNameabstract	
public	TokenNamepublic	
boolean	TokenNameboolean	
hasAnswers	TokenNameIdentifier	 has Answers
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
