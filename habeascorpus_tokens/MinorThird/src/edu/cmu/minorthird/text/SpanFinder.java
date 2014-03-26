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
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Iterator	TokenNameIdentifier	 Iterator
;	TokenNameSEMICOLON	
/** * Finds subspans of document spans. This is much like an annotator, * but a little more lightweight. * * @author William Cohen */	TokenNameCOMMENT_JAVADOC	 Finds subspans of document spans. This is much like an annotator, but a little more lightweight. * @author William Cohen 
public	TokenNamepublic	
interface	TokenNameinterface	
SpanFinder	TokenNameIdentifier	 Span Finder
{	TokenNameLBRACE	
/** Find subspans of each span produced by the documentSpanLooper. */	TokenNameCOMMENT_JAVADOC	 Find subspans of each span produced by the documentSpanLooper. 
public	TokenNamepublic	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Span	TokenNameIdentifier	 Span
>	TokenNameGREATER	
findSpans	TokenNameIdentifier	 find Spans
(	TokenNameLPAREN	
TextLabels	TokenNameIdentifier	 Text Labels
labels	TokenNameIdentifier	 labels
,	TokenNameCOMMA	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Span	TokenNameIdentifier	 Span
>	TokenNameGREATER	
documentSpanLooper	TokenNameIdentifier	 document Span Looper
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Find subspans of the given document span. */	TokenNameCOMMENT_JAVADOC	 Find subspans of the given document span. 
public	TokenNamepublic	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Span	TokenNameIdentifier	 Span
>	TokenNameGREATER	
findSpans	TokenNameIdentifier	 find Spans
(	TokenNameLPAREN	
TextLabels	TokenNameIdentifier	 Text Labels
labels	TokenNameIdentifier	 labels
,	TokenNameCOMMA	
Span	TokenNameIdentifier	 Span
documentSpan	TokenNameIdentifier	 document Span
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Return 'details' about some span found by the previous * call to findSpans(Span documentSpan). */	TokenNameCOMMENT_JAVADOC	 Return 'details' about some span found by the previous call to findSpans(Span documentSpan). 
public	TokenNamepublic	
Details	TokenNameIdentifier	 Details
getDetails	TokenNameIdentifier	 get Details
(	TokenNameLPAREN	
Span	TokenNameIdentifier	 Span
foundSpan	TokenNameIdentifier	 found Span
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Explain how spans were found. */	TokenNameCOMMENT_JAVADOC	 Explain how spans were found. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
explainFindSpans	TokenNameIdentifier	 explain Find Spans
(	TokenNameLPAREN	
TextLabels	TokenNameIdentifier	 Text Labels
labels	TokenNameIdentifier	 labels
,	TokenNameCOMMA	
Span	TokenNameIdentifier	 Span
documentSpan	TokenNameIdentifier	 document Span
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
