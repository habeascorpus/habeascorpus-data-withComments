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
sequential	TokenNameIdentifier	 sequential
.	TokenNameDOT	
SequenceDataset	TokenNameIdentifier	 Sequence Dataset
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
Annotator	TokenNameIdentifier	 Annotator
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
Span	TokenNameIdentifier	 Span
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
TextLabels	TokenNameIdentifier	 Text Labels
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
Token	TokenNameIdentifier	 Token
;	TokenNameSEMICOLON	
import	TokenNameimport	
edu	TokenNameIdentifier	 edu
.	TokenNameDOT	
cmu	TokenNameIdentifier	 cmu
.	TokenNameDOT	
minorthird	TokenNameIdentifier	 minorthird
.	TokenNameDOT	
ui	TokenNameIdentifier	 ui
.	TokenNameDOT	
Recommended	TokenNameIdentifier	 Recommended
;	TokenNameSEMICOLON	
/** * Learn an annotation model using a sequence dataset and some sort of * batch learner. * * @author William Cohen */	TokenNameCOMMENT_JAVADOC	 Learn an annotation model using a sequence dataset and some sort of batch learner. * @author William Cohen 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
AbstractBatchAnnotatorLearner	TokenNameIdentifier	 Abstract Batch Annotator Learner
extends	TokenNameextends	
AnnotatorLearner	TokenNameIdentifier	 Annotator Learner
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
Logger	TokenNameIdentifier	 Logger
log	TokenNameIdentifier	 log
=	TokenNameEQUAL	
Logger	TokenNameIdentifier	 Logger
.	TokenNameDOT	
getLogger	TokenNameIdentifier	 get Logger
(	TokenNameLPAREN	
AbstractBatchAnnotatorLearner	TokenNameIdentifier	 Abstract Batch Annotator Learner
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
SpanFeatureExtractor	TokenNameIdentifier	 Span Feature Extractor
fe	TokenNameIdentifier	 fe
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
annotationType	TokenNameIdentifier	 annotation Type
=	TokenNameEQUAL	
"_prediction"	TokenNameStringLiteral	_prediction
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
SequenceDataset	TokenNameIdentifier	 Sequence Dataset
seqData	TokenNameIdentifier	 seq Data
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
Extraction2TaggingReduction	TokenNameIdentifier	 Extraction2 Tagging Reduction
reduction	TokenNameIdentifier	 reduction
;	TokenNameSEMICOLON	
public	TokenNamepublic	
AbstractBatchAnnotatorLearner	TokenNameIdentifier	 Abstract Batch Annotator Learner
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
new	TokenNamenew	
Recommended	TokenNameIdentifier	 Recommended
.	TokenNameDOT	
TokenFE	TokenNameIdentifier	 Token FE
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
InsideOutsideReduction	TokenNameIdentifier	 Inside Outside Reduction
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
AbstractBatchAnnotatorLearner	TokenNameIdentifier	 Abstract Batch Annotator Learner
(	TokenNameLPAREN	
SpanFeatureExtractor	TokenNameIdentifier	 Span Feature Extractor
fe	TokenNameIdentifier	 fe
,	TokenNameCOMMA	
Extraction2TaggingReduction	TokenNameIdentifier	 Extraction2 Tagging Reduction
reduction	TokenNameIdentifier	 reduction
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
reduction	TokenNameIdentifier	 reduction
=	TokenNameEQUAL	
reduction	TokenNameIdentifier	 reduction
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
fe	TokenNameIdentifier	 fe
=	TokenNameEQUAL	
fe	TokenNameIdentifier	 fe
;	TokenNameSEMICOLON	
seqData	TokenNameIdentifier	 seq Data
=	TokenNameEQUAL	
new	TokenNamenew	
SequenceDataset	TokenNameIdentifier	 Sequence Dataset
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
seqData	TokenNameIdentifier	 seq Data
=	TokenNameEQUAL	
new	TokenNamenew	
SequenceDataset	TokenNameIdentifier	 Sequence Dataset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Scheme for reducing extraction to a token-classification problem */	TokenNameCOMMENT_JAVADOC	 Scheme for reducing extraction to a token-classification problem 
public	TokenNamepublic	
Extraction2TaggingReduction	TokenNameIdentifier	 Extraction2 Tagging Reduction
getTaggingReduction	TokenNameIdentifier	 get Tagging Reduction
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
reduction	TokenNameIdentifier	 reduction
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setTaggingReduction	TokenNameIdentifier	 set Tagging Reduction
(	TokenNameLPAREN	
Extraction2TaggingReduction	TokenNameIdentifier	 Extraction2 Tagging Reduction
reduction	TokenNameIdentifier	 reduction
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
reduction	TokenNameIdentifier	 reduction
=	TokenNameEQUAL	
reduction	TokenNameIdentifier	 reduction
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getTaggingReductionHelp	TokenNameIdentifier	 get Tagging Reduction Help
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"Scheme for reducing extraction to a token-classification problem"	TokenNameStringLiteral	Scheme for reducing extraction to a token-classification problem
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Feature extractor used for tokens */	TokenNameCOMMENT_JAVADOC	 Feature extractor used for tokens 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
SpanFeatureExtractor	TokenNameIdentifier	 Span Feature Extractor
getSpanFeatureExtractor	TokenNameIdentifier	 get Span Feature Extractor
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fe	TokenNameIdentifier	 fe
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
setSpanFeatureExtractor	TokenNameIdentifier	 set Span Feature Extractor
(	TokenNameLPAREN	
SpanFeatureExtractor	TokenNameIdentifier	 Span Feature Extractor
fe	TokenNameIdentifier	 fe
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
fe	TokenNameIdentifier	 fe
=	TokenNameEQUAL	
fe	TokenNameIdentifier	 fe
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** The spanType of the annotation produced by the learned annotator. */	TokenNameCOMMENT_JAVADOC	 The spanType of the annotation produced by the learned annotator. 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
setAnnotationType	TokenNameIdentifier	 set Annotation Type
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
{	TokenNameLBRACE	
annotationType	TokenNameIdentifier	 annotation Type
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getAnnotationType	TokenNameIdentifier	 get Annotation Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
annotationType	TokenNameIdentifier	 annotation Type
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// 	TokenNameCOMMENT_LINE	 
// buffer data 	TokenNameCOMMENT_LINE	buffer data 
// 	TokenNameCOMMENT_LINE	 
// temporary storage 	TokenNameCOMMENT_LINE	temporary storage 
private	TokenNameprivate	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Span	TokenNameIdentifier	 Span
>	TokenNameGREATER	
documentLooper	TokenNameIdentifier	 document Looper
;	TokenNameSEMICOLON	
/** Accept the pool of unlabeled documents. */	TokenNameCOMMENT_JAVADOC	 Accept the pool of unlabeled documents. 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
setDocumentPool	TokenNameIdentifier	 set Document Pool
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Span	TokenNameIdentifier	 Span
>	TokenNameGREATER	
documentLooper	TokenNameIdentifier	 document Looper
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
documentLooper	TokenNameIdentifier	 document Looper
=	TokenNameEQUAL	
documentLooper	TokenNameIdentifier	 document Looper
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Ask for labels on every document. */	TokenNameCOMMENT_JAVADOC	 Ask for labels on every document. 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
boolean	TokenNameboolean	
hasNextQuery	TokenNameIdentifier	 has Next Query
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
documentLooper	TokenNameIdentifier	 document Looper
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Return the next unlabeled document. */	TokenNameCOMMENT_JAVADOC	 Return the next unlabeled document. 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
Span	TokenNameIdentifier	 Span
nextQuery	TokenNameIdentifier	 next Query
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
documentLooper	TokenNameIdentifier	 document Looper
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Accept the answer to the last query. */	TokenNameCOMMENT_JAVADOC	 Accept the answer to the last query. 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
setAnswer	TokenNameIdentifier	 set Answer
(	TokenNameLPAREN	
AnnotationExample	TokenNameIdentifier	 Annotation Example
answeredQuery	TokenNameIdentifier	 answered Query
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reduction	TokenNameIdentifier	 reduction
.	TokenNameDOT	
reduceExtraction2Tagging	TokenNameIdentifier	 reduce Extraction2 Tagging
(	TokenNameLPAREN	
answeredQuery	TokenNameIdentifier	 answered Query
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
TextLabels	TokenNameIdentifier	 Text Labels
answerLabels	TokenNameIdentifier	 answer Labels
=	TokenNameEQUAL	
reduction	TokenNameIdentifier	 reduction
.	TokenNameDOT	
getTaggedLabels	TokenNameIdentifier	 get Tagged Labels
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Span	TokenNameIdentifier	 Span
document	TokenNameIdentifier	 document
=	TokenNameEQUAL	
answeredQuery	TokenNameIdentifier	 answered Query
.	TokenNameDOT	
getDocumentSpan	TokenNameIdentifier	 get Document Span
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Example	TokenNameIdentifier	 Example
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
sequence	TokenNameIdentifier	 sequence
=	TokenNameEQUAL	
new	TokenNamenew	
Example	TokenNameIdentifier	 Example
[	TokenNameLBRACKET	
document	TokenNameIdentifier	 document
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
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
document	TokenNameIdentifier	 document
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Token	TokenNameIdentifier	 Token
tok	TokenNameIdentifier	 tok
=	TokenNameEQUAL	
document	TokenNameIdentifier	 document
.	TokenNameDOT	
getToken	TokenNameIdentifier	 get Token
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
answerLabels	TokenNameIdentifier	 answer Labels
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
tok	TokenNameIdentifier	 tok
,	TokenNameCOMMA	
reduction	TokenNameIdentifier	 reduction
.	TokenNameDOT	
getTokenProp	TokenNameIdentifier	 get Token Prop
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ClassLabel	TokenNameIdentifier	 Class Label
classLabel	TokenNameIdentifier	 class Label
=	TokenNameEQUAL	
new	TokenNamenew	
ClassLabel	TokenNameIdentifier	 Class Label
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Span	TokenNameIdentifier	 Span
tokenSpan	TokenNameIdentifier	 token Span
=	TokenNameEQUAL	
document	TokenNameIdentifier	 document
.	TokenNameDOT	
subSpan	TokenNameIdentifier	 sub Span
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Example	TokenNameIdentifier	 Example
example	TokenNameIdentifier	 example
=	TokenNameEQUAL	
new	TokenNamenew	
Example	TokenNameIdentifier	 Example
(	TokenNameLPAREN	
fe	TokenNameIdentifier	 fe
.	TokenNameDOT	
extractInstance	TokenNameIdentifier	 extract Instance
(	TokenNameLPAREN	
answeredQuery	TokenNameIdentifier	 answered Query
.	TokenNameDOT	
getLabels	TokenNameIdentifier	 get Labels
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
tokenSpan	TokenNameIdentifier	 token Span
)	TokenNameRPAREN	
,	TokenNameCOMMA	
classLabel	TokenNameIdentifier	 class Label
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sequence	TokenNameIdentifier	 sequence
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
example	TokenNameIdentifier	 example
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
log	TokenNameIdentifier	 log
.	TokenNameDOT	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
"ignoring "	TokenNameStringLiteral	ignoring 
+	TokenNamePLUS	
document	TokenNameIdentifier	 document
.	TokenNameDOT	
getDocumentId	TokenNameIdentifier	 get Document Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" because token "	TokenNameStringLiteral	 because token 
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
" is not labeled"	TokenNameStringLiteral	 is not labeled
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
seqData	TokenNameIdentifier	 seq Data
.	TokenNameDOT	
addSequence	TokenNameIdentifier	 add Sequence
(	TokenNameLPAREN	
sequence	TokenNameIdentifier	 sequence
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Return the learned annotator. */	TokenNameCOMMENT_JAVADOC	 Return the learned annotator. 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
abstract	TokenNameabstract	
public	TokenNamepublic	
Annotator	TokenNameIdentifier	 Annotator
getAnnotator	TokenNameIdentifier	 get Annotator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Get the constructed sequence data. */	TokenNameCOMMENT_JAVADOC	 Get the constructed sequence data. 
public	TokenNamepublic	
SequenceDataset	TokenNameIdentifier	 Sequence Dataset
getSequenceDataset	TokenNameIdentifier	 get Sequence Dataset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
seqData	TokenNameIdentifier	 seq Data
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
