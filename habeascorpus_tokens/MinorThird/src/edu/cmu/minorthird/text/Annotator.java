package	TokenNamepackage	
edu	TokenNameIdentifier	 edu
.	TokenNameDOT	
cmu	TokenNameIdentifier	 cmu
.	TokenNameDOT	
minorthird	TokenNameIdentifier	 minorthird
.	TokenNameDOT	
text	TokenNameIdentifier	 text
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
/** * Something that extends a text labeling with additional annotations. * * @author William Cohen */	TokenNameCOMMENT_JAVADOC	 Something that extends a text labeling with additional annotations. * @author William Cohen 
public	TokenNamepublic	
interface	TokenNameinterface	
Annotator	TokenNameIdentifier	 Annotator
{	TokenNameLBRACE	
/** Add some extra information to the labels. */	TokenNameCOMMENT_JAVADOC	 Add some extra information to the labels. 
public	TokenNamepublic	
void	TokenNamevoid	
annotate	TokenNameIdentifier	 annotate
(	TokenNameLPAREN	
MonotonicTextLabels	TokenNameIdentifier	 Monotonic Text Labels
labels	TokenNameIdentifier	 labels
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Create a copy of the labels with some additional information added. */	TokenNameCOMMENT_JAVADOC	 Create a copy of the labels with some additional information added. 
public	TokenNamepublic	
TextLabels	TokenNameIdentifier	 Text Labels
annotatedCopy	TokenNameIdentifier	 annotated Copy
(	TokenNameLPAREN	
TextLabels	TokenNameIdentifier	 Text Labels
labels	TokenNameIdentifier	 labels
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Explain how annotation was added to some part of the * text base. */	TokenNameCOMMENT_JAVADOC	 Explain how annotation was added to some part of the text base. 
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
}	TokenNameRBRACE	
