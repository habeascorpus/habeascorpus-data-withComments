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
text	TokenNameIdentifier	 text
.	TokenNameDOT	
AbstractAnnotator	TokenNameIdentifier	 Abstract Annotator
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
MonotonicTextLabels	TokenNameIdentifier	 Monotonic Text Labels
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
/** * An annotator that uses a learned Classifier to mark up document spans. */	TokenNameCOMMENT_JAVADOC	 An annotator that uses a learned Classifier to mark up document spans. 
public	TokenNamepublic	
class	TokenNameclass	
ClassifierAnnotator	TokenNameIdentifier	 Classifier Annotator
extends	TokenNameextends	
AbstractAnnotator	TokenNameIdentifier	 Abstract Annotator
implements	TokenNameimplements	
Serializable	TokenNameIdentifier	 Serializable
{	TokenNameLBRACE	
static	TokenNamestatic	
private	TokenNameprivate	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
20080306L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
SpanFeatureExtractor	TokenNameIdentifier	 Span Feature Extractor
fe	TokenNameIdentifier	 fe
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Classifier	TokenNameIdentifier	 Classifier
c	TokenNameIdentifier	 c
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
spanProp	TokenNameIdentifier	 span Prop
=	TokenNameEQUAL	
null	TokenNamenull	
,	TokenNameCOMMA	
spanType	TokenNameIdentifier	 span Type
=	TokenNameEQUAL	
null	TokenNamenull	
,	TokenNameCOMMA	
candidateType	TokenNameIdentifier	 candidate Type
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
ClassifierAnnotator	TokenNameIdentifier	 Classifier Annotator
(	TokenNameLPAREN	
SpanFeatureExtractor	TokenNameIdentifier	 Span Feature Extractor
fe	TokenNameIdentifier	 fe
,	TokenNameCOMMA	
Classifier	TokenNameIdentifier	 Classifier
c	TokenNameIdentifier	 c
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
spanType	TokenNameIdentifier	 span Type
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
spanProp	TokenNameIdentifier	 span Prop
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
candidateType	TokenNameIdentifier	 candidate Type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
fe	TokenNameIdentifier	 fe
=	TokenNameEQUAL	
fe	TokenNameIdentifier	 fe
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
c	TokenNameIdentifier	 c
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
spanType	TokenNameIdentifier	 span Type
=	TokenNameEQUAL	
spanType	TokenNameIdentifier	 span Type
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
spanProp	TokenNameIdentifier	 span Prop
=	TokenNameEQUAL	
spanProp	TokenNameIdentifier	 span Prop
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
candidateType	TokenNameIdentifier	 candidate Type
=	TokenNameEQUAL	
candidateType	TokenNameIdentifier	 candidate Type
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
ClassifierAnnotator	TokenNameIdentifier	 Classifier Annotator
(	TokenNameLPAREN	
SpanFeatureExtractor	TokenNameIdentifier	 Span Feature Extractor
fe	TokenNameIdentifier	 fe
,	TokenNameCOMMA	
Classifier	TokenNameIdentifier	 Classifier
c	TokenNameIdentifier	 c
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
spanType	TokenNameIdentifier	 span Type
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
spanProp	TokenNameIdentifier	 span Prop
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
fe	TokenNameIdentifier	 fe
,	TokenNameCOMMA	
c	TokenNameIdentifier	 c
,	TokenNameCOMMA	
spanType	TokenNameIdentifier	 span Type
,	TokenNameCOMMA	
spanProp	TokenNameIdentifier	 span Prop
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** The feature extractor applied to candidate spans. */	TokenNameCOMMENT_JAVADOC	 The feature extractor applied to candidate spans. 
public	TokenNamepublic	
SpanFeatureExtractor	TokenNameIdentifier	 Span Feature Extractor
getFE	TokenNameIdentifier	 get FE
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fe	TokenNameIdentifier	 fe
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* The classifier used on Instances extracted from candidate spans * by the SpanFeatureExtractor getFE() */	TokenNameCOMMENT_BLOCK	 The classifier used on Instances extracted from candidate spans by the SpanFeatureExtractor getFE() 
public	TokenNamepublic	
Classifier	TokenNameIdentifier	 Classifier
getClassifier	TokenNameIdentifier	 get Classifier
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
c	TokenNameIdentifier	 c
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** If non-null, the property used to encode the output of the classifier. */	TokenNameCOMMENT_JAVADOC	 If non-null, the property used to encode the output of the classifier. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getSpanProperty	TokenNameIdentifier	 get Span Property
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
spanProp	TokenNameIdentifier	 span Prop
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** If non-null, the spanType used to encode the positive predictions of * the classifier (which should be a BinaryClassifier). */	TokenNameCOMMENT_JAVADOC	 If non-null, the spanType used to encode the positive predictions of the classifier (which should be a BinaryClassifier). 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getSpanType	TokenNameIdentifier	 get Span Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
spanType	TokenNameIdentifier	 span Type
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** If non-null, the spanType corresponding to candidate spans to be * classified. If null, the document spans will be classified. */	TokenNameCOMMENT_JAVADOC	 If non-null, the spanType corresponding to candidate spans to be classified. If null, the document spans will be classified. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getCandidateType	TokenNameIdentifier	 get Candidate Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
candidateType	TokenNameIdentifier	 candidate Type
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
doAnnotate	TokenNameIdentifier	 do Annotate
(	TokenNameLPAREN	
MonotonicTextLabels	TokenNameIdentifier	 Monotonic Text Labels
labels	TokenNameIdentifier	 labels
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Span	TokenNameIdentifier	 Span
>	TokenNameGREATER	
candidateLooper	TokenNameIdentifier	 candidate Looper
=	TokenNameEQUAL	
candidateType	TokenNameIdentifier	 candidate Type
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
labels	TokenNameIdentifier	 labels
.	TokenNameDOT	
instanceIterator	TokenNameIdentifier	 instance Iterator
(	TokenNameLPAREN	
candidateType	TokenNameIdentifier	 candidate Type
)	TokenNameRPAREN	
:	TokenNameCOLON	
labels	TokenNameIdentifier	 labels
.	TokenNameDOT	
getTextBase	TokenNameIdentifier	 get Text Base
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
documentSpanIterator	TokenNameIdentifier	 document Span Iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Span	TokenNameIdentifier	 Span
>	TokenNameGREATER	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
candidateLooper	TokenNameIdentifier	 candidate Looper
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Span	TokenNameIdentifier	 Span
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ClassLabel	TokenNameIdentifier	 Class Label
classOfS	TokenNameIdentifier	 class Of S
=	TokenNameEQUAL	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
classification	TokenNameIdentifier	 classification
(	TokenNameLPAREN	
fe	TokenNameIdentifier	 fe
.	TokenNameDOT	
extractInstance	TokenNameIdentifier	 extract Instance
(	TokenNameLPAREN	
labels	TokenNameIdentifier	 labels
,	TokenNameCOMMA	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
spanProp	TokenNameIdentifier	 span Prop
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//labels.setProperty(s, spanProp, classOfS.bestClassName(),new Details(classOfS.bestWeight())); 	TokenNameCOMMENT_LINE	labels.setProperty(s, spanProp, classOfS.bestClassName(),new Details(classOfS.bestWeight())); 
labels	TokenNameIdentifier	 labels
.	TokenNameDOT	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
,	TokenNameCOMMA	
spanProp	TokenNameIdentifier	 span Prop
,	TokenNameCOMMA	
classOfS	TokenNameIdentifier	 class Of S
.	TokenNameDOT	
bestClassName	TokenNameIdentifier	 best Class Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
spanType	TokenNameIdentifier	 span Type
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
classOfS	TokenNameIdentifier	 class Of S
.	TokenNameDOT	
isPositive	TokenNameIdentifier	 is Positive
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//labels.addToType(s,spanType,new Details(classOfS.posWeight())); 	TokenNameCOMMENT_LINE	labels.addToType(s,spanType,new Details(classOfS.posWeight())); 
labels	TokenNameIdentifier	 labels
.	TokenNameDOT	
addToType	TokenNameIdentifier	 add To Type
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
,	TokenNameCOMMA	
spanType	TokenNameIdentifier	 span Type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
String	TokenNameIdentifier	 String
explainAnnotation	TokenNameIdentifier	 explain Annotation
(	TokenNameLPAREN	
TextLabels	TokenNameIdentifier	 Text Labels
labels	TokenNameIdentifier	 labels
,	TokenNameCOMMA	
Span	TokenNameIdentifier	 Span
documentSpan	TokenNameIdentifier	 document Span
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
explain	TokenNameIdentifier	 explain
(	TokenNameLPAREN	
fe	TokenNameIdentifier	 fe
.	TokenNameDOT	
extractInstance	TokenNameIdentifier	 extract Instance
(	TokenNameLPAREN	
labels	TokenNameIdentifier	 labels
,	TokenNameCOMMA	
documentSpan	TokenNameIdentifier	 document Span
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
