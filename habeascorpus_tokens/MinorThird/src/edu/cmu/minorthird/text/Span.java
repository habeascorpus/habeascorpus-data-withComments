package	TokenNamepackage	
edu	TokenNameIdentifier	 edu
.	TokenNameDOT	
cmu	TokenNameIdentifier	 cmu
.	TokenNameDOT	
minorthird	TokenNameIdentifier	 minorthird
.	TokenNameDOT	
text	TokenNameIdentifier	 text
;	TokenNameSEMICOLON	
/** A series of of adjacent Token's from the same document. * * @author William Cohen */	TokenNameCOMMENT_JAVADOC	 A series of of adjacent Token's from the same document. * @author William Cohen 
public	TokenNamepublic	
interface	TokenNameinterface	
Span	TokenNameIdentifier	 Span
extends	TokenNameextends	
Comparable	TokenNameIdentifier	 Comparable
<	TokenNameLESS	
Span	TokenNameIdentifier	 Span
>	TokenNameGREATER	
{	TokenNameLBRACE	
/** Number of TextToken's in the span. */	TokenNameCOMMENT_JAVADOC	 Number of TextToken's in the span. 
public	TokenNamepublic	
int	TokenNameint	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Access the i-th Token. */	TokenNameCOMMENT_JAVADOC	 Access the i-th Token. 
public	TokenNamepublic	
Token	TokenNameIdentifier	 Token
getToken	TokenNameIdentifier	 get Token
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Access the i-th Token as a TextToken */	TokenNameCOMMENT_JAVADOC	 Access the i-th Token as a TextToken 
public	TokenNamepublic	
TextToken	TokenNameIdentifier	 Text Token
getTextToken	TokenNameIdentifier	 get Text Token
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Create a new Span containing TextToken's lo, lo+1, ..., lo+len. */	TokenNameCOMMENT_JAVADOC	 Create a new Span containing TextToken's lo, lo+1, ..., lo+len. 
public	TokenNamepublic	
Span	TokenNameIdentifier	 Span
subSpan	TokenNameIdentifier	 sub Span
(	TokenNameLPAREN	
int	TokenNameint	
lo	TokenNameIdentifier	 lo
,	TokenNameCOMMA	
int	TokenNameint	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Create a new Span containing TextToken's which are as close as * possible to the character boundaries charLo, charHi of * thisspan. */	TokenNameCOMMENT_JAVADOC	 Create a new Span containing TextToken's which are as close as possible to the character boundaries charLo, charHi of thisspan. 
public	TokenNamepublic	
Span	TokenNameIdentifier	 Span
charIndexSubSpan	TokenNameIdentifier	 char Index Sub Span
(	TokenNameLPAREN	
int	TokenNameint	
charLo	TokenNameIdentifier	 char Lo
,	TokenNameCOMMA	
int	TokenNameint	
charHi	TokenNameIdentifier	 char Hi
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Create a the largest Span containing TextToken's which are * contained in the character boundaries charLo, charHi of this * span. */	TokenNameCOMMENT_JAVADOC	 Create a the largest Span containing TextToken's which are contained in the character boundaries charLo, charHi of this span. 
public	TokenNamepublic	
Span	TokenNameIdentifier	 Span
charIndexProperSubSpan	TokenNameIdentifier	 char Index Proper Sub Span
(	TokenNameLPAREN	
int	TokenNameint	
charLo	TokenNameIdentifier	 char Lo
,	TokenNameCOMMA	
int	TokenNameint	
charHi	TokenNameIdentifier	 char Hi
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Return the name of the document for these TextToken's. */	TokenNameCOMMENT_JAVADOC	 Return the name of the document for these TextToken's. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getDocumentId	TokenNameIdentifier	 get Document Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** If this was a subspan, create a copy of its parent. */	TokenNameCOMMENT_JAVADOC	 If this was a subspan, create a copy of its parent. 
public	TokenNamepublic	
Span	TokenNameIdentifier	 Span
documentSpan	TokenNameIdentifier	 document Span
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Return the id of the group of documents this span belongs to */	TokenNameCOMMENT_JAVADOC	 Return the id of the group of documents this span belongs to 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getDocumentGroupId	TokenNameIdentifier	 get Document Group Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Return a string containing the entire content of the document * that this span lives in. * <p> * <b>Note:</b> this differs subtly from documentSpan().asString(), * which returns the string between the beginning of the first * token and the end of the last token in the containing document. */	TokenNameCOMMENT_JAVADOC	 Return a string containing the entire content of the document that this span lives in. <p> <b>Note:</b> this differs subtly from documentSpan().asString(), which returns the string between the beginning of the first token and the end of the last token in the containing document. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getDocumentContents	TokenNameIdentifier	 get Document Contents
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Find the index of this span within its document. * In other words, a span can be copied with the code * <code>span.documentSpan().subSpan( span.documentSpanStartIndex(), span.length())</code> */	TokenNameCOMMENT_JAVADOC	 Find the index of this span within its document. In other words, a span can be copied with the code <code>span.documentSpan().subSpan( span.documentSpanStartIndex(), span.length())</code> 
public	TokenNamepublic	
int	TokenNameint	
documentSpanStartIndex	TokenNameIdentifier	 document Span Start Index
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Find the string contained in a Span. */	TokenNameCOMMENT_JAVADOC	 Find the string contained in a Span. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
asString	TokenNameIdentifier	 as String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** A length-zero span for the left boundary */	TokenNameCOMMENT_JAVADOC	 A length-zero span for the left boundary 
public	TokenNamepublic	
Span	TokenNameIdentifier	 Span
getLeftBoundary	TokenNameIdentifier	 get Left Boundary
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** A length-zero span for the left boundary */	TokenNameCOMMENT_JAVADOC	 A length-zero span for the left boundary 
public	TokenNamepublic	
Span	TokenNameIdentifier	 Span
getRightBoundary	TokenNameIdentifier	 get Right Boundary
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Check containment */	TokenNameCOMMENT_JAVADOC	 Check containment 
public	TokenNamepublic	
boolean	TokenNameboolean	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
Span	TokenNameIdentifier	 Span
other	TokenNameIdentifier	 other
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Check overlap */	TokenNameCOMMENT_JAVADOC	 Check overlap 
public	TokenNamepublic	
boolean	TokenNameboolean	
overlaps	TokenNameIdentifier	 overlaps
(	TokenNameLPAREN	
Span	TokenNameIdentifier	 Span
other	TokenNameIdentifier	 other
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Returns the low text token */	TokenNameCOMMENT_JAVADOC	 Returns the low text token 
public	TokenNamepublic	
int	TokenNameint	
getLoTextToken	TokenNameIdentifier	 get Lo Text Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Returns the Char index of where the span starts in the document */	TokenNameCOMMENT_JAVADOC	 Returns the Char index of where the span starts in the document 
public	TokenNamepublic	
int	TokenNameint	
getLoChar	TokenNameIdentifier	 get Lo Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Returns the Char index of where the span ends in the document */	TokenNameCOMMENT_JAVADOC	 Returns the Char index of where the span ends in the document 
public	TokenNamepublic	
int	TokenNameint	
getHiChar	TokenNameIdentifier	 get Hi Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
void	TokenNamevoid	
setCharOffset	TokenNameIdentifier	 set Char Offset
(	TokenNameLPAREN	
int	TokenNameint	
charOffset	TokenNameIdentifier	 char Offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
int	TokenNameint	
getCharOffset	TokenNameIdentifier	 get Char Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// /** An iterator over Spans. */ 	TokenNameCOMMENT_LINE	/** An iterator over Spans. */ 
// public interface Looper extends Iterator { 	TokenNameCOMMENT_LINE	public interface Looper extends Iterator { 
// public int estimatedSize(); 	TokenNameCOMMENT_LINE	public int estimatedSize(); 
// public Span nextSpan(); 	TokenNameCOMMENT_LINE	public Span nextSpan(); 
// } 	TokenNameCOMMENT_LINE	} 
}	TokenNameRBRACE	
