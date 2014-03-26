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
Annotator	TokenNameIdentifier	 Annotator
;	TokenNameSEMICOLON	
/** * Learn an Annotator from AnnotationExample's. * * @author William Cohen */	TokenNameCOMMENT_JAVADOC	 Learn an Annotator from AnnotationExample's. * @author William Cohen 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
AnnotatorLearner	TokenNameIdentifier	 Annotator Learner
{	TokenNameLBRACE	
abstract	TokenNameabstract	
public	TokenNamepublic	
void	TokenNamevoid	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Accept a pool of documents. */	TokenNameCOMMENT_JAVADOC	 Accept a pool of documents. 
abstract	TokenNameabstract	
public	TokenNamepublic	
void	TokenNamevoid	
setDocumentPool	TokenNameIdentifier	 set Document Pool
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Span	TokenNameIdentifier	 Span
>	TokenNameGREATER	
documents	TokenNameIdentifier	 documents
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Returns true if the learner has more queries to answer. */	TokenNameCOMMENT_JAVADOC	 Returns true if the learner has more queries to answer. 
abstract	TokenNameabstract	
public	TokenNamepublic	
boolean	TokenNameboolean	
hasNextQuery	TokenNameIdentifier	 has Next Query
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Returns an Span which the learner would like labeled. */	TokenNameCOMMENT_JAVADOC	 Returns an Span which the learner would like labeled. 
abstract	TokenNameabstract	
public	TokenNamepublic	
Span	TokenNameIdentifier	 Span
nextQuery	TokenNameIdentifier	 next Query
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Accept the answer to the last query. */	TokenNameCOMMENT_JAVADOC	 Accept the answer to the last query. 
abstract	TokenNameabstract	
public	TokenNamepublic	
void	TokenNamevoid	
setAnswer	TokenNameIdentifier	 set Answer
(	TokenNameLPAREN	
AnnotationExample	TokenNameIdentifier	 Annotation Example
answeredQuery	TokenNameIdentifier	 answered Query
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Set the label used for annotations produced by the learner. */	TokenNameCOMMENT_JAVADOC	 Set the label used for annotations produced by the learner. 
abstract	TokenNameabstract	
public	TokenNamepublic	
void	TokenNamevoid	
setAnnotationType	TokenNameIdentifier	 set Annotation Type
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Get the label used for annotations produced by the learner. */	TokenNameCOMMENT_JAVADOC	 Get the label used for annotations produced by the learner. 
abstract	TokenNameabstract	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getAnnotationType	TokenNameIdentifier	 get Annotation Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Return the learned annotator */	TokenNameCOMMENT_JAVADOC	 Return the learned annotator 
abstract	TokenNameabstract	
public	TokenNamepublic	
Annotator	TokenNameIdentifier	 Annotator
getAnnotator	TokenNameIdentifier	 get Annotator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Return the span feature extractor used by this annotator. This could be null * if no such feature extractor exists. */	TokenNameCOMMENT_JAVADOC	 Return the span feature extractor used by this annotator. This could be null if no such feature extractor exists. 
abstract	TokenNameabstract	
public	TokenNamepublic	
SpanFeatureExtractor	TokenNameIdentifier	 Span Feature Extractor
getSpanFeatureExtractor	TokenNameIdentifier	 get Span Feature Extractor
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Set the feature extractor used by this annotator. This may * have no action if no such feature extractor exists. */	TokenNameCOMMENT_JAVADOC	 Set the feature extractor used by this annotator. This may have no action if no such feature extractor exists. 
abstract	TokenNameabstract	
public	TokenNamepublic	
void	TokenNamevoid	
setSpanFeatureExtractor	TokenNameIdentifier	 set Span Feature Extractor
(	TokenNameLPAREN	
SpanFeatureExtractor	TokenNameIdentifier	 Span Feature Extractor
fe	TokenNameIdentifier	 fe
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getAnnotationTypeHelp	TokenNameIdentifier	 get Annotation Type Help
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"Get the label used for annotations produced by the learner"	TokenNameStringLiteral	Get the label used for annotations produced by the learner
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getSpanFeatureExtractorHelp	TokenNameIdentifier	 get Span Feature Extractor Help
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"<html> Set the feature extractor used by this learner <br> "	TokenNameStringLiteral	<html> Set the feature extractor used by this learner <br> 
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
