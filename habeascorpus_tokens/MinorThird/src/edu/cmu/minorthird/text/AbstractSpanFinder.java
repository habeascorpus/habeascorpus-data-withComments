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
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
TreeSet	TokenNameIdentifier	 Tree Set
;	TokenNameSEMICOLON	
/** * Abstract implementation of a SpanFinder. * * @author William Cohen */	TokenNameCOMMENT_JAVADOC	 Abstract implementation of a SpanFinder. * @author William Cohen 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
AbstractSpanFinder	TokenNameIdentifier	 Abstract Span Finder
implements	TokenNameimplements	
SpanFinder	TokenNameIdentifier	 Span Finder
{	TokenNameLBRACE	
/** Find subspans of each span produced by the documentSpanIterator. */	TokenNameCOMMENT_JAVADOC	 Find subspans of each span produced by the documentSpanIterator. 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
final	TokenNamefinal	
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
documentSpanIterator	TokenNameIdentifier	 document Span Iterator
)	TokenNameRPAREN	
{	TokenNameLBRACE	
TreeSet	TokenNameIdentifier	 Tree Set
<	TokenNameLESS	
Span	TokenNameIdentifier	 Span
>	TokenNameGREATER	
set	TokenNameIdentifier	 set
=	TokenNameEQUAL	
new	TokenNamenew	
TreeSet	TokenNameIdentifier	 Tree Set
<	TokenNameLESS	
Span	TokenNameIdentifier	 Span
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
documentSpanIterator	TokenNameIdentifier	 document Span Iterator
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Span	TokenNameIdentifier	 Span
>	TokenNameGREATER	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
findSpans	TokenNameIdentifier	 find Spans
(	TokenNameLPAREN	
labels	TokenNameIdentifier	 labels
,	TokenNameCOMMA	
documentSpanIterator	TokenNameIdentifier	 document Span Iterator
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
set	TokenNameIdentifier	 set
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
set	TokenNameIdentifier	 set
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Find subspans of the given document span. */	TokenNameCOMMENT_JAVADOC	 Find subspans of the given document span. 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
abstract	TokenNameabstract	
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
/** Explain how spans were found. */	TokenNameCOMMENT_JAVADOC	 Explain how spans were found. 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
abstract	TokenNameabstract	
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
