package	TokenNamepackage	
edu	TokenNameIdentifier	 edu
.	TokenNameDOT	
cmu	TokenNameIdentifier	 cmu
.	TokenNameDOT	
minorthird	TokenNameIdentifier	 minorthird
.	TokenNameDOT	
text	TokenNameIdentifier	 text
;	TokenNameSEMICOLON	
/** * Generic implementation of an annotator. * * * @author William Cohen */	TokenNameCOMMENT_JAVADOC	 Generic implementation of an annotator. * @author William Cohen 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
AbstractAnnotator	TokenNameIdentifier	 Abstract Annotator
implements	TokenNameimplements	
Annotator	TokenNameIdentifier	 Annotator
{	TokenNameLBRACE	
/** The implementation for this method annotates labels in-line. */	TokenNameCOMMENT_JAVADOC	 The implementation for this method annotates labels in-line. 
abstract	TokenNameabstract	
protected	TokenNameprotected	
void	TokenNamevoid	
doAnnotate	TokenNameIdentifier	 do Annotate
(	TokenNameLPAREN	
MonotonicTextLabels	TokenNameIdentifier	 Monotonic Text Labels
labels	TokenNameIdentifier	 labels
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** The implementation for this method should explain how annotation * would be added to some part of the text base. */	TokenNameCOMMENT_JAVADOC	 The implementation for this method should explain how annotation would be added to some part of the text base. 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
abstract	TokenNameabstract	
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
;	TokenNameSEMICOLON	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
final	TokenNamefinal	
public	TokenNamepublic	
void	TokenNamevoid	
annotate	TokenNameIdentifier	 annotate
(	TokenNameLPAREN	
MonotonicTextLabels	TokenNameIdentifier	 Monotonic Text Labels
labels	TokenNameIdentifier	 labels
)	TokenNameRPAREN	
{	TokenNameLBRACE	
doAnnotate	TokenNameIdentifier	 do Annotate
(	TokenNameLPAREN	
labels	TokenNameIdentifier	 labels
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
final	TokenNamefinal	
public	TokenNamepublic	
TextLabels	TokenNameIdentifier	 Text Labels
annotatedCopy	TokenNameIdentifier	 annotated Copy
(	TokenNameLPAREN	
TextLabels	TokenNameIdentifier	 Text Labels
labels	TokenNameIdentifier	 labels
)	TokenNameRPAREN	
{	TokenNameLBRACE	
MonotonicTextLabels	TokenNameIdentifier	 Monotonic Text Labels
copy	TokenNameIdentifier	 copy
=	TokenNameEQUAL	
new	TokenNamenew	
NestedTextLabels	TokenNameIdentifier	 Nested Text Labels
(	TokenNameLPAREN	
labels	TokenNameIdentifier	 labels
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
annotate	TokenNameIdentifier	 annotate
(	TokenNameLPAREN	
copy	TokenNameIdentifier	 copy
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
copy	TokenNameIdentifier	 copy
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
