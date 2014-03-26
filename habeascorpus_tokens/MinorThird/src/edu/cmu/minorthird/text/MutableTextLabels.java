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
/** Maintains assertions about 'types' and 'properties' of Spans. * Assertions can be added or deleted. * * @author William Cohen */	TokenNameCOMMENT_JAVADOC	 Maintains assertions about 'types' and 'properties' of Spans. Assertions can be added or deleted. * @author William Cohen 
public	TokenNamepublic	
interface	TokenNameinterface	
MutableTextLabels	TokenNameIdentifier	 Mutable Text Labels
extends	TokenNameextends	
MonotonicTextLabels	TokenNameIdentifier	 Monotonic Text Labels
{	TokenNameLBRACE	
/** Make it the case that there are no spans of the given type * contained by the given span, other than those already * inserted to exist. */	TokenNameCOMMENT_JAVADOC	 Make it the case that there are no spans of the given type contained by the given span, other than those already inserted to exist. 
public	TokenNamepublic	
void	TokenNamevoid	
closeTypeInside	TokenNameIdentifier	 close Type Inside
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
Span	TokenNameIdentifier	 Span
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Make it the case that there are no spans whatsoever of the given * type contained by the given span, other than those described by * the given span looper. */	TokenNameCOMMENT_JAVADOC	 Make it the case that there are no spans whatsoever of the given type contained by the given span, other than those described by the given span looper. 
public	TokenNamepublic	
void	TokenNamevoid	
defineTypeInside	TokenNameIdentifier	 define Type Inside
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
Span	TokenNameIdentifier	 Span
s	TokenNameIdentifier	 s
,	TokenNameCOMMA	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Span	TokenNameIdentifier	 Span
>	TokenNameGREATER	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Initialize the textbase which is annotated by this TextLabels. * This produces an error if the current textbase has already been set. */	TokenNameCOMMENT_JAVADOC	 Initialize the textbase which is annotated by this TextLabels. This produces an error if the current textbase has already been set. 
public	TokenNamepublic	
void	TokenNamevoid	
setTextBase	TokenNameIdentifier	 set Text Base
(	TokenNameLPAREN	
TextBase	TokenNameIdentifier	 Text Base
textBase	TokenNameIdentifier	 text Base
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
