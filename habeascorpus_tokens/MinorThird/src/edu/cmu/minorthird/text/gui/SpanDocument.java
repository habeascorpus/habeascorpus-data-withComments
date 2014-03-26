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
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
swing	TokenNameIdentifier	 swing
.	TokenNameDOT	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
BadLocationException	TokenNameIdentifier	 Bad Location Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
swing	TokenNameIdentifier	 swing
.	TokenNameDOT	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
DefaultStyledDocument	TokenNameIdentifier	 Default Styled Document
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
swing	TokenNameIdentifier	 swing
.	TokenNameDOT	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
SimpleAttributeSet	TokenNameIdentifier	 Simple Attribute Set
;	TokenNameSEMICOLON	
/** A StyledDocument that holds a single span. * * @author William Cohen */	TokenNameCOMMENT_JAVADOC	 A StyledDocument that holds a single span. * @author William Cohen 
public	TokenNamepublic	
class	TokenNameclass	
SpanDocument	TokenNameIdentifier	 Span Document
extends	TokenNameextends	
DefaultStyledDocument	TokenNameIdentifier	 Default Styled Document
{	TokenNameLBRACE	
// private edu.cmu.minorthird.text.Span span; 	TokenNameCOMMENT_LINE	private edu.cmu.minorthird.text.Span span; 
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
200803014L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
edu	TokenNameIdentifier	 edu
.	TokenNameDOT	
cmu	TokenNameIdentifier	 cmu
.	TokenNameDOT	
minorthird	TokenNameIdentifier	 minorthird
.	TokenNameDOT	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
Span	TokenNameIdentifier	 Span
contextSpan	TokenNameIdentifier	 context Span
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
beginContextSpanInDocument	TokenNameIdentifier	 begin Context Span In Document
,	TokenNameCOMMA	
leftContextChars	TokenNameIdentifier	 left Context Chars
,	TokenNameCOMMA	
rightContextChars	TokenNameIdentifier	 right Context Chars
;	TokenNameSEMICOLON	
private	TokenNameprivate	
edu	TokenNameIdentifier	 edu
.	TokenNameDOT	
cmu	TokenNameIdentifier	 cmu
.	TokenNameDOT	
minorthird	TokenNameIdentifier	 minorthird
.	TokenNameDOT	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
Span	TokenNameIdentifier	 Span
leftBoundary	TokenNameIdentifier	 left Boundary
,	TokenNameCOMMA	
rightBoundary	TokenNameIdentifier	 right Boundary
;	TokenNameSEMICOLON	
// private int contextWidth = 0; 	TokenNameCOMMENT_LINE	private int contextWidth = 0; 
public	TokenNamepublic	
SpanDocument	TokenNameIdentifier	 Span Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
SpanDocument	TokenNameIdentifier	 Span Document
(	TokenNameLPAREN	
edu	TokenNameIdentifier	 edu
.	TokenNameDOT	
cmu	TokenNameIdentifier	 cmu
.	TokenNameDOT	
minorthird	TokenNameIdentifier	 minorthird
.	TokenNameDOT	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
Span	TokenNameIdentifier	 Span
span	TokenNameIdentifier	 span
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
span	TokenNameIdentifier	 span
,	TokenNameCOMMA	
5	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
SpanDocument	TokenNameIdentifier	 Span Document
(	TokenNameLPAREN	
edu	TokenNameIdentifier	 edu
.	TokenNameDOT	
cmu	TokenNameIdentifier	 cmu
.	TokenNameDOT	
minorthird	TokenNameIdentifier	 minorthird
.	TokenNameDOT	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
Span	TokenNameIdentifier	 Span
span	TokenNameIdentifier	 span
,	TokenNameCOMMA	
int	TokenNameint	
contextWidth	TokenNameIdentifier	 context Width
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// this.span = span; 	TokenNameCOMMENT_LINE	this.span = span; 
// this.contextWidth = contextWidth; 	TokenNameCOMMENT_LINE	this.contextWidth = contextWidth; 
// log.debug(span.asString()); 	TokenNameCOMMENT_LINE	log.debug(span.asString()); 
int	TokenNameint	
conLo	TokenNameIdentifier	 con Lo
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
max	TokenNameIdentifier	 max
(	TokenNameLPAREN	
span	TokenNameIdentifier	 span
.	TokenNameDOT	
documentSpanStartIndex	TokenNameIdentifier	 document Span Start Index
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
contextWidth	TokenNameIdentifier	 context Width
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
conHi	TokenNameIdentifier	 con Hi
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
min	TokenNameIdentifier	 min
(	TokenNameLPAREN	
span	TokenNameIdentifier	 span
.	TokenNameDOT	
documentSpanStartIndex	TokenNameIdentifier	 document Span Start Index
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
span	TokenNameIdentifier	 span
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
contextWidth	TokenNameIdentifier	 context Width
,	TokenNameCOMMA	
span	TokenNameIdentifier	 span
.	TokenNameDOT	
documentSpan	TokenNameIdentifier	 document Span
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
contextSpan	TokenNameIdentifier	 context Span
=	TokenNameEQUAL	
span	TokenNameIdentifier	 span
.	TokenNameDOT	
documentSpan	TokenNameIdentifier	 document Span
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
subSpan	TokenNameIdentifier	 sub Span
(	TokenNameLPAREN	
conLo	TokenNameIdentifier	 con Lo
,	TokenNameCOMMA	
conHi	TokenNameIdentifier	 con Hi
-	TokenNameMINUS	
conLo	TokenNameIdentifier	 con Lo
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
beginContextSpanInDocument	TokenNameIdentifier	 begin Context Span In Document
=	TokenNameEQUAL	
contextSpan	TokenNameIdentifier	 context Span
.	TokenNameDOT	
getTextToken	TokenNameIdentifier	 get Text Token
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
getLo	TokenNameIdentifier	 get Lo
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
leftContextChars	TokenNameIdentifier	 left Context Chars
=	TokenNameEQUAL	
span	TokenNameIdentifier	 span
.	TokenNameDOT	
getTextToken	TokenNameIdentifier	 get Text Token
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
getLo	TokenNameIdentifier	 get Lo
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
beginContextSpanInDocument	TokenNameIdentifier	 begin Context Span In Document
;	TokenNameSEMICOLON	
rightContextChars	TokenNameIdentifier	 right Context Chars
=	TokenNameEQUAL	
contextSpan	TokenNameIdentifier	 context Span
.	TokenNameDOT	
getTextToken	TokenNameIdentifier	 get Text Token
(	TokenNameLPAREN	
contextSpan	TokenNameIdentifier	 context Span
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
getHi	TokenNameIdentifier	 get Hi
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
span	TokenNameIdentifier	 span
.	TokenNameDOT	
getTextToken	TokenNameIdentifier	 get Text Token
(	TokenNameLPAREN	
span	TokenNameIdentifier	 span
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
getHi	TokenNameIdentifier	 get Hi
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
leftBoundary	TokenNameIdentifier	 left Boundary
=	TokenNameEQUAL	
contextSpan	TokenNameIdentifier	 context Span
.	TokenNameDOT	
getLeftBoundary	TokenNameIdentifier	 get Left Boundary
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
rightBoundary	TokenNameIdentifier	 right Boundary
=	TokenNameEQUAL	
contextSpan	TokenNameIdentifier	 context Span
.	TokenNameDOT	
getRightBoundary	TokenNameIdentifier	 get Right Boundary
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
insertString	TokenNameIdentifier	 insert String
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
contextSpan	TokenNameIdentifier	 context Span
.	TokenNameDOT	
asString	TokenNameIdentifier	 as String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
SimpleAttributeSet	TokenNameIdentifier	 Simple Attribute Set
.	TokenNameDOT	
EMPTY	TokenNameIdentifier	 EMPTY
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
resetHighlights	TokenNameIdentifier	 reset Highlights
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
BadLocationException	TokenNameIdentifier	 Bad Location Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalStateException	TokenNameIdentifier	 Illegal State Exception
(	TokenNameLPAREN	
"inserting: "	TokenNameStringLiteral	inserting: 
+	TokenNamePLUS	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** Overrides default insertString, since insertions are not allowed. */	TokenNameCOMMENT_JAVADOC	 Overrides default insertString, since insertions are not allowed. 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
insertString	TokenNameIdentifier	 insert String
(	TokenNameLPAREN	
int	TokenNameint	
off	TokenNameIdentifier	 off
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
,	TokenNameCOMMA	
AttributeSet	TokenNameIdentifier	 Attribute Set
attribs	TokenNameIdentifier	 attribs
)	TokenNameRPAREN	
throws	TokenNamethrows	
BadLocationException	TokenNameIdentifier	 Bad Location Exception
{	TokenNameLBRACE	
;	TokenNameSEMICOLON	
// do nothing 	TokenNameCOMMENT_LINE	do nothing 
}	TokenNameRBRACE	
/** Overrides default insertString, since insertions are not allowed. */	TokenNameCOMMENT_JAVADOC	 Overrides default insertString, since insertions are not allowed. 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
int	TokenNameint	
off	TokenNameIdentifier	 off
,	TokenNameCOMMA	
int	TokenNameint	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
throws	TokenNamethrows	
BadLocationException	TokenNameIdentifier	 Bad Location Exception
{	TokenNameLBRACE	
;	TokenNameSEMICOLON	
// do nothing 	TokenNameCOMMENT_LINE	do nothing 
}	TokenNameRBRACE	
/** Clear all highlights. */	TokenNameCOMMENT_JAVADOC	 Clear all highlights. 
public	TokenNamepublic	
void	TokenNamevoid	
resetHighlights	TokenNameIdentifier	 reset Highlights
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setCharacterAttributes	TokenNameIdentifier	 set Character Attributes
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
SimpleAttributeSet	TokenNameIdentifier	 Simple Attribute Set
.	TokenNameDOT	
EMPTY	TokenNameIdentifier	 EMPTY
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setCharacterAttributes	TokenNameIdentifier	 set Character Attributes
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
leftContextChars	TokenNameIdentifier	 left Context Chars
,	TokenNameCOMMA	
HiliteColors	TokenNameIdentifier	 Hilite Colors
.	TokenNameDOT	
gray	TokenNameIdentifier	 gray
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setCharacterAttributes	TokenNameIdentifier	 set Character Attributes
(	TokenNameLPAREN	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
rightContextChars	TokenNameIdentifier	 right Context Chars
,	TokenNameCOMMA	
rightContextChars	TokenNameIdentifier	 right Context Chars
,	TokenNameCOMMA	
HiliteColors	TokenNameIdentifier	 Hilite Colors
.	TokenNameDOT	
gray	TokenNameIdentifier	 gray
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Convert a character index in the text being displayed to a char index in the * actual document which the display is a part of */	TokenNameCOMMENT_JAVADOC	 Convert a character index in the text being displayed to a char index in the actual document which the display is a part of 
public	TokenNamepublic	
int	TokenNameint	
toLogicalCharIndex	TokenNameIdentifier	 to Logical Char Index
(	TokenNameLPAREN	
int	TokenNameint	
charIndex	TokenNameIdentifier	 char Index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
charIndex	TokenNameIdentifier	 char Index
+	TokenNamePLUS	
beginContextSpanInDocument	TokenNameIdentifier	 begin Context Span In Document
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Highlight a subspan of the current span. */	TokenNameCOMMENT_JAVADOC	 Highlight a subspan of the current span. 
public	TokenNamepublic	
void	TokenNamevoid	
highlight	TokenNameIdentifier	 highlight
(	TokenNameLPAREN	
edu	TokenNameIdentifier	 edu
.	TokenNameDOT	
cmu	TokenNameIdentifier	 cmu
.	TokenNameDOT	
minorthird	TokenNameIdentifier	 minorthird
.	TokenNameDOT	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
Span	TokenNameIdentifier	 Span
subspan	TokenNameIdentifier	 subspan
,	TokenNameCOMMA	
AttributeSet	TokenNameIdentifier	 Attribute Set
attributeSet	TokenNameIdentifier	 attribute Set
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
subspan	TokenNameIdentifier	 subspan
.	TokenNameDOT	
getDocumentId	TokenNameIdentifier	 get Document Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
contextSpan	TokenNameIdentifier	 context Span
.	TokenNameDOT	
getDocumentId	TokenNameIdentifier	 get Document Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
subspan	TokenNameIdentifier	 subspan
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
subspan	TokenNameIdentifier	 subspan
.	TokenNameDOT	
getLeftBoundary	TokenNameIdentifier	 get Left Boundary
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
leftBoundary	TokenNameIdentifier	 left Boundary
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
subspan	TokenNameIdentifier	 subspan
.	TokenNameDOT	
getRightBoundary	TokenNameIdentifier	 get Right Boundary
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
rightBoundary	TokenNameIdentifier	 right Boundary
)	TokenNameRPAREN	
<=	TokenNameLESS_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
beginSubspanInDocument	TokenNameIdentifier	 begin Subspan In Document
=	TokenNameEQUAL	
subspan	TokenNameIdentifier	 subspan
.	TokenNameDOT	
getTextToken	TokenNameIdentifier	 get Text Token
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
getLo	TokenNameIdentifier	 get Lo
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
subspanLength	TokenNameIdentifier	 subspan Length
=	TokenNameEQUAL	
subspan	TokenNameIdentifier	 subspan
.	TokenNameDOT	
getTextToken	TokenNameIdentifier	 get Text Token
(	TokenNameLPAREN	
subspan	TokenNameIdentifier	 subspan
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
getHi	TokenNameIdentifier	 get Hi
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
beginSubspanInDocument	TokenNameIdentifier	 begin Subspan In Document
;	TokenNameSEMICOLON	
setCharacterAttributes	TokenNameIdentifier	 set Character Attributes
(	TokenNameLPAREN	
beginSubspanInDocument	TokenNameIdentifier	 begin Subspan In Document
-	TokenNameMINUS	
beginContextSpanInDocument	TokenNameIdentifier	 begin Context Span In Document
,	TokenNameCOMMA	
subspanLength	TokenNameIdentifier	 subspan Length
,	TokenNameCOMMA	
attributeSet	TokenNameIdentifier	 attribute Set
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
