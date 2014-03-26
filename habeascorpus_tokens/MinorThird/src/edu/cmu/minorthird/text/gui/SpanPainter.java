package	TokenNamepackage	
edu	TokenNameIdentifier	 edu
.	TokenNameDOT	
cmu	TokenNameIdentifier	 cmu
.	TokenNameDOT	
minorthird	TokenNameIdentifier	 minorthird
.	TokenNameDOT	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
gui	TokenNameIdentifier	 gui
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
swing	TokenNameIdentifier	 swing
.	TokenNameDOT	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
AttributeSet	TokenNameIdentifier	 Attribute Set
;	TokenNameSEMICOLON	
/** Repaint a document. * * @author William Cohen */	TokenNameCOMMENT_JAVADOC	 Repaint a document. * @author William Cohen 
/*package*/	TokenNameCOMMENT_BLOCK	package
interface	TokenNameinterface	
SpanPainter	TokenNameIdentifier	 Span Painter
{	TokenNameLBRACE	
/** Repaint the specified document. * Null means to repaint all documents. */	TokenNameCOMMENT_JAVADOC	 Repaint the specified document. Null means to repaint all documents. 
public	TokenNamepublic	
void	TokenNamevoid	
paintDocument	TokenNameIdentifier	 paint Document
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
documentId	TokenNameIdentifier	 document Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Find span differences associated with the document. */	TokenNameCOMMENT_JAVADOC	 Find span differences associated with the document. 
public	TokenNamepublic	
edu	TokenNameIdentifier	 edu
.	TokenNameDOT	
cmu	TokenNameIdentifier	 cmu
.	TokenNameDOT	
minorthird	TokenNameIdentifier	 minorthird
.	TokenNameDOT	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
SpanDifference	TokenNameIdentifier	 Span Difference
.	TokenNameDOT	
Looper	TokenNameIdentifier	 Looper
differenceIterator	TokenNameIdentifier	 difference Iterator
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
documentId	TokenNameIdentifier	 document Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Color for false positive spans. */	TokenNameCOMMENT_JAVADOC	 Color for false positive spans. 
public	TokenNamepublic	
AttributeSet	TokenNameIdentifier	 Attribute Set
fpColor	TokenNameIdentifier	 fp Color
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Color for false negative spans. */	TokenNameCOMMENT_JAVADOC	 Color for false negative spans. 
public	TokenNamepublic	
AttributeSet	TokenNameIdentifier	 Attribute Set
fnColor	TokenNameIdentifier	 fn Color
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Color for true positive spans. */	TokenNameCOMMENT_JAVADOC	 Color for true positive spans. 
public	TokenNamepublic	
AttributeSet	TokenNameIdentifier	 Attribute Set
tpColor	TokenNameIdentifier	 tp Color
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Color for spans that might be positive */	TokenNameCOMMENT_JAVADOC	 Color for spans that might be positive 
public	TokenNamepublic	
AttributeSet	TokenNameIdentifier	 Attribute Set
mpColor	TokenNameIdentifier	 mp Color
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
