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
io	TokenNameIdentifier	 io
.	TokenNameDOT	
Serializable	TokenNameIdentifier	 Serializable
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
Logger	TokenNameIdentifier	 Logger
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
gui	TokenNameIdentifier	 gui
.	TokenNameDOT	
SpanViewer	TokenNameIdentifier	 Span Viewer
;	TokenNameSEMICOLON	
import	TokenNameimport	
edu	TokenNameIdentifier	 edu
.	TokenNameDOT	
cmu	TokenNameIdentifier	 cmu
.	TokenNameDOT	
minorthird	TokenNameIdentifier	 minorthird
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
gui	TokenNameIdentifier	 gui
.	TokenNameDOT	
Viewer	TokenNameIdentifier	 Viewer
;	TokenNameSEMICOLON	
import	TokenNameimport	
edu	TokenNameIdentifier	 edu
.	TokenNameDOT	
cmu	TokenNameIdentifier	 cmu
.	TokenNameDOT	
minorthird	TokenNameIdentifier	 minorthird
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
gui	TokenNameIdentifier	 gui
.	TokenNameDOT	
Visible	TokenNameIdentifier	 Visible
;	TokenNameSEMICOLON	
/** Implements the Span interface. * * @author William Cohen */	TokenNameCOMMENT_JAVADOC	 Implements the Span interface. * @author William Cohen 
public	TokenNamepublic	
class	TokenNameclass	
BasicSpan	TokenNameIdentifier	 Basic Span
implements	TokenNameimplements	
Span	TokenNameIdentifier	 Span
,	TokenNameCOMMA	
Serializable	TokenNameIdentifier	 Serializable
,	TokenNameCOMMA	
Visible	TokenNameIdentifier	 Visible
{	TokenNameLBRACE	
static	TokenNamestatic	
private	TokenNameprivate	
Logger	TokenNameIdentifier	 Logger
log	TokenNameIdentifier	 log
=	TokenNameEQUAL	
Logger	TokenNameIdentifier	 Logger
.	TokenNameDOT	
getLogger	TokenNameIdentifier	 get Logger
(	TokenNameLPAREN	
BasicSpan	TokenNameIdentifier	 Basic Span
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
private	TokenNameprivate	
final	TokenNamefinal	
boolean	TokenNameboolean	
DEBUG	TokenNameIdentifier	 DEBUG
=	TokenNameEQUAL	
log	TokenNameIdentifier	 log
.	TokenNameDOT	
isDebugEnabled	TokenNameIdentifier	 is Debug Enabled
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
private	TokenNameprivate	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
20080303L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
documentId	TokenNameIdentifier	 document Id
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
documentGroupId	TokenNameIdentifier	 document Group Id
;	TokenNameSEMICOLON	
public	TokenNamepublic	
int	TokenNameint	
loTextTokenIndex	TokenNameIdentifier	 lo Text Token Index
,	TokenNameCOMMA	
loCharIndex	TokenNameIdentifier	 lo Char Index
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
hiCharIndex	TokenNameIdentifier	 hi Char Index
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
charOffset	TokenNameIdentifier	 char Offset
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
spanLen	TokenNameIdentifier	 span Len
;	TokenNameSEMICOLON	
// The number of tokens in the span. 	TokenNameCOMMENT_LINE	The number of tokens in the span. 
private	TokenNameprivate	
TextToken	TokenNameIdentifier	 Text Token
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
textTokens	TokenNameIdentifier	 text Tokens
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
text	TokenNameIdentifier	 text
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** Constructor assumes that the textTokens are all from the documentId. */	TokenNameCOMMENT_JAVADOC	 Constructor assumes that the textTokens are all from the documentId. 
public	TokenNamepublic	
BasicSpan	TokenNameIdentifier	 Basic Span
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
documentId	TokenNameIdentifier	 document Id
,	TokenNameCOMMA	
TextToken	TokenNameIdentifier	 Text Token
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
textTokens	TokenNameIdentifier	 text Tokens
,	TokenNameCOMMA	
int	TokenNameint	
loTextTokenIndex	TokenNameIdentifier	 lo Text Token Index
,	TokenNameCOMMA	
int	TokenNameint	
spanLen	TokenNameIdentifier	 span Len
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
documentGroupId	TokenNameIdentifier	 document Group Id
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
documentId	TokenNameIdentifier	 document Id
=	TokenNameEQUAL	
documentId	TokenNameIdentifier	 document Id
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
textTokens	TokenNameIdentifier	 text Tokens
=	TokenNameEQUAL	
textTokens	TokenNameIdentifier	 text Tokens
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
loTextTokenIndex	TokenNameIdentifier	 lo Text Token Index
=	TokenNameEQUAL	
loTextTokenIndex	TokenNameIdentifier	 lo Text Token Index
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
spanLen	TokenNameIdentifier	 span Len
=	TokenNameEQUAL	
spanLen	TokenNameIdentifier	 span Len
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
documentGroupId	TokenNameIdentifier	 document Group Id
=	TokenNameEQUAL	
documentGroupId	TokenNameIdentifier	 document Group Id
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
documentId	TokenNameIdentifier	 document Id
:	TokenNameCOLON	
documentGroupId	TokenNameIdentifier	 document Group Id
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getDocumentId	TokenNameIdentifier	 get Document Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
documentId	TokenNameIdentifier	 document Id
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getDocumentGroupId	TokenNameIdentifier	 get Document Group Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
documentGroupId	TokenNameIdentifier	 document Group Id
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getDocumentContents	TokenNameIdentifier	 get Document Contents
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
textTokens	TokenNameIdentifier	 text Tokens
.	TokenNameDOT	
length	TokenNameIdentifier	 length
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
textTokens	TokenNameIdentifier	 text Tokens
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
getDocument	TokenNameIdentifier	 get Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns the number of tokens in the span. */	TokenNameCOMMENT_JAVADOC	 Returns the number of tokens in the span. 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
spanLen	TokenNameIdentifier	 span Len
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Retrieves the ith TextToken in the span */	TokenNameCOMMENT_JAVADOC	 Retrieves the ith TextToken in the span 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
TextToken	TokenNameIdentifier	 Text Token
getTextToken	TokenNameIdentifier	 get Text Token
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
i	TokenNameIdentifier	 i
>=	TokenNameGREATER_EQUAL	
spanLen	TokenNameIdentifier	 span Len
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"out of range: "	TokenNameStringLiteral	out of range: 
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
textTokens	TokenNameIdentifier	 text Tokens
[	TokenNameLBRACKET	
loTextTokenIndex	TokenNameIdentifier	 lo Text Token Index
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Retrieves the ith TextToken in the span */	TokenNameCOMMENT_JAVADOC	 Retrieves the ith TextToken in the span 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
Token	TokenNameIdentifier	 Token
getToken	TokenNameIdentifier	 get Token
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//return getTextToken(i); 	TokenNameCOMMENT_LINE	return getTextToken(i); 
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
i	TokenNameIdentifier	 i
>=	TokenNameGREATER_EQUAL	
spanLen	TokenNameIdentifier	 span Len
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"out of range: "	TokenNameStringLiteral	out of range: 
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
textTokens	TokenNameIdentifier	 text Tokens
[	TokenNameLBRACKET	
loTextTokenIndex	TokenNameIdentifier	 lo Text Token Index
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Create a new BasicSpan, covering the indicated TextToken's. */	TokenNameCOMMENT_JAVADOC	 Create a new BasicSpan, covering the indicated TextToken's. 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
Span	TokenNameIdentifier	 Span
subSpan	TokenNameIdentifier	 sub Span
(	TokenNameLPAREN	
int	TokenNameint	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
int	TokenNameint	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
start	TokenNameIdentifier	 start
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
start	TokenNameIdentifier	 start
+	TokenNamePLUS	
len	TokenNameIdentifier	 len
>	TokenNameGREATER	
spanLen	TokenNameIdentifier	 span Len
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"out of range: "	TokenNameStringLiteral	out of range: 
+	TokenNamePLUS	
start	TokenNameIdentifier	 start
+	TokenNamePLUS	
","	TokenNameStringLiteral	,
+	TokenNamePLUS	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
BasicSpan	TokenNameIdentifier	 Basic Span
(	TokenNameLPAREN	
documentId	TokenNameIdentifier	 document Id
,	TokenNameCOMMA	
textTokens	TokenNameIdentifier	 text Tokens
,	TokenNameCOMMA	
loTextTokenIndex	TokenNameIdentifier	 lo Text Token Index
+	TokenNamePLUS	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
,	TokenNameCOMMA	
documentGroupId	TokenNameIdentifier	 document Group Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Create a SubSpan of this span, covering the indicated TextToken's. */	TokenNameCOMMENT_JAVADOC	 Create a SubSpan of this span, covering the indicated TextToken's. 
public	TokenNamepublic	
SubSpan	TokenNameIdentifier	 Sub Span
subSpan	TokenNameIdentifier	 sub Span
(	TokenNameLPAREN	
int	TokenNameint	
startIndex	TokenNameIdentifier	 start Index
,	TokenNameCOMMA	
int	TokenNameint	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
int	TokenNameint	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
start	TokenNameIdentifier	 start
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
start	TokenNameIdentifier	 start
+	TokenNamePLUS	
len	TokenNameIdentifier	 len
>	TokenNameGREATER	
spanLen	TokenNameIdentifier	 span Len
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"out of range: "	TokenNameStringLiteral	out of range: 
+	TokenNamePLUS	
start	TokenNameIdentifier	 start
+	TokenNamePLUS	
","	TokenNameStringLiteral	,
+	TokenNamePLUS	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
SubSpan	TokenNameIdentifier	 Sub Span
(	TokenNameLPAREN	
documentId	TokenNameIdentifier	 document Id
,	TokenNameCOMMA	
textTokens	TokenNameIdentifier	 text Tokens
,	TokenNameCOMMA	
loTextTokenIndex	TokenNameIdentifier	 lo Text Token Index
+	TokenNamePLUS	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
,	TokenNameCOMMA	
documentGroupId	TokenNameIdentifier	 document Group Id
,	TokenNameCOMMA	
startIndex	TokenNameIdentifier	 start Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** A larger span containing this span. */	TokenNameCOMMENT_JAVADOC	 A larger span containing this span. 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
Span	TokenNameIdentifier	 Span
documentSpan	TokenNameIdentifier	 document Span
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
BasicSpan	TokenNameIdentifier	 Basic Span
(	TokenNameLPAREN	
documentId	TokenNameIdentifier	 document Id
,	TokenNameCOMMA	
textTokens	TokenNameIdentifier	 text Tokens
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
textTokens	TokenNameIdentifier	 text Tokens
.	TokenNameDOT	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
documentGroupId	TokenNameIdentifier	 document Group Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** The index of this span in the home span. */	TokenNameCOMMENT_JAVADOC	 The index of this span in the home span. 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
documentSpanStartIndex	TokenNameIdentifier	 document Span Start Index
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
loTextTokenIndex	TokenNameIdentifier	 lo Text Token Index
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
boolean	TokenNameboolean	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
Span	TokenNameIdentifier	 Span
other	TokenNameIdentifier	 other
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
getDocumentId	TokenNameIdentifier	 get Document Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
getDocumentId	TokenNameIdentifier	 get Document Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
int	TokenNameint	
myStart	TokenNameIdentifier	 my Start
=	TokenNameEQUAL	
documentSpanStartIndex	TokenNameIdentifier	 document Span Start Index
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
otherStart	TokenNameIdentifier	 other Start
=	TokenNameEQUAL	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
documentSpanStartIndex	TokenNameIdentifier	 document Span Start Index
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
myEnd	TokenNameIdentifier	 my End
=	TokenNameEQUAL	
documentSpanStartIndex	TokenNameIdentifier	 document Span Start Index
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
otherEnd	TokenNameIdentifier	 other End
=	TokenNameEQUAL	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
documentSpanStartIndex	TokenNameIdentifier	 document Span Start Index
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
myStart	TokenNameIdentifier	 my Start
<=	TokenNameLESS_EQUAL	
otherStart	TokenNameIdentifier	 other Start
&&	TokenNameAND_AND	
myEnd	TokenNameIdentifier	 my End
>=	TokenNameGREATER_EQUAL	
otherStart	TokenNameIdentifier	 other Start
&&	TokenNameAND_AND	
myStart	TokenNameIdentifier	 my Start
<=	TokenNameLESS_EQUAL	
otherEnd	TokenNameIdentifier	 other End
&&	TokenNameAND_AND	
myEnd	TokenNameIdentifier	 my End
>=	TokenNameGREATER_EQUAL	
otherEnd	TokenNameIdentifier	 other End
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
boolean	TokenNameboolean	
overlaps	TokenNameIdentifier	 overlaps
(	TokenNameLPAREN	
Span	TokenNameIdentifier	 Span
other	TokenNameIdentifier	 other
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
getDocumentId	TokenNameIdentifier	 get Document Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
getDocumentId	TokenNameIdentifier	 get Document Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
int	TokenNameint	
myStart	TokenNameIdentifier	 my Start
=	TokenNameEQUAL	
documentSpanStartIndex	TokenNameIdentifier	 document Span Start Index
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
otherStart	TokenNameIdentifier	 other Start
=	TokenNameEQUAL	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
documentSpanStartIndex	TokenNameIdentifier	 document Span Start Index
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
myEnd	TokenNameIdentifier	 my End
=	TokenNameEQUAL	
documentSpanStartIndex	TokenNameIdentifier	 document Span Start Index
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
otherEnd	TokenNameIdentifier	 other End
=	TokenNameEQUAL	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
documentSpanStartIndex	TokenNameIdentifier	 document Span Start Index
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
myStart	TokenNameIdentifier	 my Start
<=	TokenNameLESS_EQUAL	
otherStart	TokenNameIdentifier	 other Start
&&	TokenNameAND_AND	
myEnd	TokenNameIdentifier	 my End
>=	TokenNameGREATER_EQUAL	
otherStart	TokenNameIdentifier	 other Start
// [ ... ( ... ] - partial containment 1 	TokenNameCOMMENT_LINE	[ ... ( ... ] - partial containment 1 
||	TokenNameOR_OR	
myStart	TokenNameIdentifier	 my Start
<=	TokenNameLESS_EQUAL	
otherEnd	TokenNameIdentifier	 other End
&&	TokenNameAND_AND	
myEnd	TokenNameIdentifier	 my End
>=	TokenNameGREATER_EQUAL	
otherEnd	TokenNameIdentifier	 other End
// [ ... ) ... ] - partial containment 2 	TokenNameCOMMENT_LINE	[ ... ) ... ] - partial containment 2 
||	TokenNameOR_OR	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
// ( .. [ ... ] ... ) - containment 	TokenNameCOMMENT_LINE	( .. [ ... ] ... ) - containment 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Find the string contained in a Span. */	TokenNameCOMMENT_JAVADOC	 Find the string contained in a Span. 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
String	TokenNameIdentifier	 String
asString	TokenNameIdentifier	 as String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
<=	TokenNameLESS_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
TextToken	TokenNameIdentifier	 Text Token
lo	TokenNameIdentifier	 lo
=	TokenNameEQUAL	
getTextToken	TokenNameIdentifier	 get Text Token
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
TextToken	TokenNameIdentifier	 Text Token
hi	TokenNameIdentifier	 hi
=	TokenNameEQUAL	
getTextToken	TokenNameIdentifier	 get Text Token
(	TokenNameLPAREN	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
text	TokenNameIdentifier	 text
=	TokenNameEQUAL	
lo	TokenNameIdentifier	 lo
.	TokenNameDOT	
getDocument	TokenNameIdentifier	 get Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
lo	TokenNameIdentifier	 lo
.	TokenNameDOT	
getLo	TokenNameIdentifier	 get Lo
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
hi	TokenNameIdentifier	 hi
.	TokenNameDOT	
getHi	TokenNameIdentifier	 get Hi
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
text	TokenNameIdentifier	 text
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** A length-zero span for the left boundary */	TokenNameCOMMENT_JAVADOC	 A length-zero span for the left boundary 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
Span	TokenNameIdentifier	 Span
getLeftBoundary	TokenNameIdentifier	 get Left Boundary
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
BasicSpan	TokenNameIdentifier	 Basic Span
(	TokenNameLPAREN	
documentId	TokenNameIdentifier	 document Id
,	TokenNameCOMMA	
textTokens	TokenNameIdentifier	 text Tokens
,	TokenNameCOMMA	
loTextTokenIndex	TokenNameIdentifier	 lo Text Token Index
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
documentGroupId	TokenNameIdentifier	 document Group Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** A length-zero span for the left boundary */	TokenNameCOMMENT_JAVADOC	 A length-zero span for the left boundary 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
Span	TokenNameIdentifier	 Span
getRightBoundary	TokenNameIdentifier	 get Right Boundary
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
BasicSpan	TokenNameIdentifier	 Basic Span
(	TokenNameLPAREN	
documentId	TokenNameIdentifier	 document Id
,	TokenNameCOMMA	
textTokens	TokenNameIdentifier	 text Tokens
,	TokenNameCOMMA	
loTextTokenIndex	TokenNameIdentifier	 lo Text Token Index
+	TokenNamePLUS	
spanLen	TokenNameIdentifier	 span Len
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
documentGroupId	TokenNameIdentifier	 document Group Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Implement comparable 	TokenNameCOMMENT_LINE	Implement comparable 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
Span	TokenNameIdentifier	 Span
other	TokenNameIdentifier	 other
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
cmp1	TokenNameIdentifier	 cmp1
=	TokenNameEQUAL	
getDocumentId	TokenNameIdentifier	 get Document Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
getDocumentId	TokenNameIdentifier	 get Document Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
cmp1	TokenNameIdentifier	 cmp1
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
cmp1	TokenNameIdentifier	 cmp1
;	TokenNameSEMICOLON	
int	TokenNameint	
cmp2	TokenNameIdentifier	 cmp2
=	TokenNameEQUAL	
documentSpanStartIndex	TokenNameIdentifier	 document Span Start Index
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
documentSpanStartIndex	TokenNameIdentifier	 document Span Start Index
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
cmp2	TokenNameIdentifier	 cmp2
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
cmp2	TokenNameIdentifier	 cmp2
;	TokenNameSEMICOLON	
int	TokenNameint	
cmp3	TokenNameIdentifier	 cmp3
=	TokenNameEQUAL	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
cmp3	TokenNameIdentifier	 cmp3
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
cmp3	TokenNameIdentifier	 cmp3
;	TokenNameSEMICOLON	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// for safe hashing 	TokenNameCOMMENT_LINE	for safe hashing 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
documentId	TokenNameIdentifier	 document Id
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
^	TokenNameXOR	
loTextTokenIndex	TokenNameIdentifier	 lo Text Token Index
^	TokenNameXOR	
spanLen	TokenNameIdentifier	 span Len
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
boolean	TokenNameboolean	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
o	TokenNameIdentifier	 o
instanceof	TokenNameinstanceof	
BasicSpan	TokenNameIdentifier	 Basic Span
&&	TokenNameAND_AND	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Span	TokenNameIdentifier	 Span
)	TokenNameRPAREN	
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StringBuffer	TokenNameIdentifier	 String Buffer
buf	TokenNameIdentifier	 buf
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"Span '"	TokenNameStringLiteral	Span '
+	TokenNamePLUS	
asString	TokenNameIdentifier	 as String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"'"	TokenNameStringLiteral	'
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" = tokens "	TokenNameStringLiteral	 = tokens 
+	TokenNamePLUS	
loTextTokenIndex	TokenNameIdentifier	 lo Text Token Index
+	TokenNamePLUS	
":"	TokenNameStringLiteral	:
+	TokenNamePLUS	
(	TokenNameLPAREN	
loTextTokenIndex	TokenNameIdentifier	 lo Text Token Index
+	TokenNamePLUS	
spanLen	TokenNameIdentifier	 span Len
)	TokenNameRPAREN	
+	TokenNamePLUS	
" in "	TokenNameStringLiteral	 in 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
documentId	TokenNameIdentifier	 document Id
+	TokenNamePLUS	
"/"	TokenNameStringLiteral	/
+	TokenNamePLUS	
documentGroupId	TokenNameIdentifier	 document Group Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
Span	TokenNameIdentifier	 Span
charIndexSubSpan	TokenNameIdentifier	 char Index Sub Span
(	TokenNameLPAREN	
int	TokenNameint	
lo	TokenNameIdentifier	 lo
,	TokenNameCOMMA	
int	TokenNameint	
hi	TokenNameIdentifier	 hi
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
charIndexSubSpan	TokenNameIdentifier	 char Index Sub Span
(	TokenNameLPAREN	
lo	TokenNameIdentifier	 lo
,	TokenNameCOMMA	
hi	TokenNameIdentifier	 hi
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
Span	TokenNameIdentifier	 Span
charIndexProperSubSpan	TokenNameIdentifier	 char Index Proper Sub Span
(	TokenNameLPAREN	
int	TokenNameint	
lo	TokenNameIdentifier	 lo
,	TokenNameCOMMA	
int	TokenNameint	
hi	TokenNameIdentifier	 hi
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
charIndexSubSpan	TokenNameIdentifier	 char Index Sub Span
(	TokenNameLPAREN	
lo	TokenNameIdentifier	 lo
,	TokenNameCOMMA	
hi	TokenNameIdentifier	 hi
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
setCharOffset	TokenNameIdentifier	 set Char Offset
(	TokenNameLPAREN	
int	TokenNameint	
charOffset	TokenNameIdentifier	 char Offset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
charOffset	TokenNameIdentifier	 char Offset
=	TokenNameEQUAL	
charOffset	TokenNameIdentifier	 char Offset
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
getCharOffset	TokenNameIdentifier	 get Char Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
charOffset	TokenNameIdentifier	 char Offset
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Converts from a span in character offsets within a document * Span to a token span for that document Span. */	TokenNameCOMMENT_JAVADOC	 Converts from a span in character offsets within a document Span to a token span for that document Span. 
private	TokenNameprivate	
Span	TokenNameIdentifier	 Span
charIndexSubSpan	TokenNameIdentifier	 char Index Sub Span
(	TokenNameLPAREN	
int	TokenNameint	
lo	TokenNameIdentifier	 lo
,	TokenNameCOMMA	
int	TokenNameint	
hi	TokenNameIdentifier	 hi
,	TokenNameCOMMA	
boolean	TokenNameboolean	
proper	TokenNameIdentifier	 proper
)	TokenNameRPAREN	
{	TokenNameLBRACE	
loCharIndex	TokenNameIdentifier	 lo Char Index
=	TokenNameEQUAL	
lo	TokenNameIdentifier	 lo
;	TokenNameSEMICOLON	
hiCharIndex	TokenNameIdentifier	 hi Char Index
=	TokenNameEQUAL	
hi	TokenNameIdentifier	 hi
;	TokenNameSEMICOLON	
// find token that start & end closest to lo and hi 	TokenNameCOMMENT_LINE	find token that start & end closest to lo and hi 
int	TokenNameint	
minStartDist	TokenNameIdentifier	 min Start Dist
=	TokenNameEQUAL	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
;	TokenNameSEMICOLON	
int	TokenNameint	
minEndDist	TokenNameIdentifier	 min End Dist
=	TokenNameEQUAL	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
;	TokenNameSEMICOLON	
int	TokenNameint	
firstTextToken	TokenNameIdentifier	 first Text Token
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
lastTextToken	TokenNameIdentifier	 last Text Token
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
proper	TokenNameIdentifier	 proper
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG	TokenNameIdentifier	 DEBUG
)	TokenNameRPAREN	
log	TokenNameIdentifier	 log
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"considering token '"	TokenNameStringLiteral	considering token '
+	TokenNamePLUS	
getTextToken	TokenNameIdentifier	 get Text Token
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
+	TokenNamePLUS	
"' from lo="	TokenNameStringLiteral	' from lo=
+	TokenNamePLUS	
getTextToken	TokenNameIdentifier	 get Text Token
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
.	TokenNameDOT	
getLo	TokenNameIdentifier	 get Lo
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" to hi="	TokenNameStringLiteral	 to hi=
+	TokenNamePLUS	
getTextToken	TokenNameIdentifier	 get Text Token
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
.	TokenNameDOT	
getHi	TokenNameIdentifier	 get Hi
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
startDist	TokenNameIdentifier	 start Dist
=	TokenNameEQUAL	
distance	TokenNameIdentifier	 distance
(	TokenNameLPAREN	
getTextToken	TokenNameIdentifier	 get Text Token
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
.	TokenNameDOT	
getLo	TokenNameIdentifier	 get Lo
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
lo	TokenNameIdentifier	 lo
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
endDist	TokenNameIdentifier	 end Dist
=	TokenNameEQUAL	
distance	TokenNameIdentifier	 distance
(	TokenNameLPAREN	
getTextToken	TokenNameIdentifier	 get Text Token
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
.	TokenNameDOT	
getHi	TokenNameIdentifier	 get Hi
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
hi	TokenNameIdentifier	 hi
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// <= prefers later start, end tokens 	TokenNameCOMMENT_LINE	<= prefers later start, end tokens 
if	TokenNameif	
(	TokenNameLPAREN	
startDist	TokenNameIdentifier	 start Dist
<=	TokenNameLESS_EQUAL	
minStartDist	TokenNameIdentifier	 min Start Dist
)	TokenNameRPAREN	
{	TokenNameLBRACE	
minStartDist	TokenNameIdentifier	 min Start Dist
=	TokenNameEQUAL	
startDist	TokenNameIdentifier	 start Dist
;	TokenNameSEMICOLON	
firstTextToken	TokenNameIdentifier	 first Text Token
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG	TokenNameIdentifier	 DEBUG
)	TokenNameRPAREN	
log	TokenNameIdentifier	 log
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"minStartDist => "	TokenNameStringLiteral	minStartDist => 
+	TokenNamePLUS	
minStartDist	TokenNameIdentifier	 min Start Dist
+	TokenNamePLUS	
" for token "	TokenNameStringLiteral	 for token 
+	TokenNamePLUS	
getTextToken	TokenNameIdentifier	 get Text Token
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
endDist	TokenNameIdentifier	 end Dist
<=	TokenNameLESS_EQUAL	
minEndDist	TokenNameIdentifier	 min End Dist
)	TokenNameRPAREN	
{	TokenNameLBRACE	
minEndDist	TokenNameIdentifier	 min End Dist
=	TokenNameEQUAL	
endDist	TokenNameIdentifier	 end Dist
;	TokenNameSEMICOLON	
lastTextToken	TokenNameIdentifier	 last Text Token
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG	TokenNameIdentifier	 DEBUG
)	TokenNameRPAREN	
log	TokenNameIdentifier	 log
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"minEndDist => "	TokenNameStringLiteral	minEndDist => 
+	TokenNamePLUS	
minEndDist	TokenNameIdentifier	 min End Dist
+	TokenNamePLUS	
" for token "	TokenNameStringLiteral	 for token 
+	TokenNamePLUS	
getTextToken	TokenNameIdentifier	 get Text Token
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// The lo character offset may lie on a whitespace character before a token, at the 	TokenNameCOMMENT_LINE	The lo character offset may lie on a whitespace character before a token, at the 
// boundry of a token, or in the middle of a token. In any of these cases we want to 	TokenNameCOMMENT_LINE	boundry of a token, or in the middle of a token. In any of these cases we want to 
// make sure to include this token in the span. So simply check that the lo character 	TokenNameCOMMENT_LINE	make sure to include this token in the span. So simply check that the lo character 
// offset is less than the hi index of the token. That is check that at least one 	TokenNameCOMMENT_LINE	offset is less than the hi index of the token. That is check that at least one 
// character of the token is included in the char offsets. 	TokenNameCOMMENT_LINE	character of the token is included in the char offsets. 
if	TokenNameif	
(	TokenNameLPAREN	
firstTextToken	TokenNameIdentifier	 first Text Token
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
lo	TokenNameIdentifier	 lo
<=	TokenNameLESS_EQUAL	
getTextToken	TokenNameIdentifier	 get Text Token
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
.	TokenNameDOT	
getHi	TokenNameIdentifier	 get Hi
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
firstTextToken	TokenNameIdentifier	 first Text Token
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG	TokenNameIdentifier	 DEBUG
)	TokenNameRPAREN	
log	TokenNameIdentifier	 log
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"firstTextToken => "	TokenNameStringLiteral	firstTextToken => 
+	TokenNamePLUS	
getTextToken	TokenNameIdentifier	 get Text Token
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* OLD LOGIC HERE: if (getTextToken(i).getLo()>=lo && firstTextToken<0) { firstTextToken = i; if (DEBUG) log.debug("firstTextToken => "+getTextToken(i)); } */	TokenNameCOMMENT_BLOCK	 OLD LOGIC HERE: if (getTextToken(i).getLo()>=lo && firstTextToken<0) { firstTextToken = i; if (DEBUG) log.debug("firstTextToken => "+getTextToken(i)); } 
// The hi character offset may lie on a whitespace character after a token, at the 	TokenNameCOMMENT_LINE	The hi character offset may lie on a whitespace character after a token, at the 
// boundry of a token, or in the middle of a token. Again, we need to include this 	TokenNameCOMMENT_LINE	boundry of a token, or in the middle of a token. Again, we need to include this 
// token in the subspan in any of these cases. So continually increas the last 	TokenNameCOMMENT_LINE	token in the subspan in any of these cases. So continually increas the last 
// included token index (lastTextToken) for each subsequent token that is included in 	TokenNameCOMMENT_LINE	included token index (lastTextToken) for each subsequent token that is included in 
// in the span. Do this by simply checking that the hi character offset is greater 	TokenNameCOMMENT_LINE	in the span. Do this by simply checking that the hi character offset is greater 
// than the token's lo character index. 	TokenNameCOMMENT_LINE	than the token's lo character index. 
if	TokenNameif	
(	TokenNameLPAREN	
hi	TokenNameIdentifier	 hi
>	TokenNameGREATER	
getTextToken	TokenNameIdentifier	 get Text Token
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
.	TokenNameDOT	
getLo	TokenNameIdentifier	 get Lo
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
lastTextToken	TokenNameIdentifier	 last Text Token
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG	TokenNameIdentifier	 DEBUG
)	TokenNameRPAREN	
log	TokenNameIdentifier	 log
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"lastTextToken => "	TokenNameStringLiteral	lastTextToken => 
+	TokenNamePLUS	
getTextToken	TokenNameIdentifier	 get Text Token
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* OLD LOGIC HERE if (getTextToken(i).getHi()<=hi) { lastTextToken = i; if (DEBUG) log.debug("lastTextToken => "+getTextToken(i)); } */	TokenNameCOMMENT_BLOCK	 OLD LOGIC HERE if (getTextToken(i).getHi()<=hi) { lastTextToken = i; if (DEBUG) log.debug("lastTextToken => "+getTextToken(i)); } 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
firstTextToken	TokenNameIdentifier	 first Text Token
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
lastTextToken	TokenNameIdentifier	 last Text Token
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"no proper subspan for lo="	TokenNameStringLiteral	no proper subspan for lo=
+	TokenNamePLUS	
lo	TokenNameIdentifier	 lo
+	TokenNamePLUS	
" hi="	TokenNameStringLiteral	 hi=
+	TokenNamePLUS	
hi	TokenNameIdentifier	 hi
+	TokenNamePLUS	
" for: "	TokenNameStringLiteral	 for: 
+	TokenNamePLUS	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
subSpan	TokenNameIdentifier	 sub Span
(	TokenNameLPAREN	
loCharIndex	TokenNameIdentifier	 lo Char Index
,	TokenNameCOMMA	
firstTextToken	TokenNameIdentifier	 first Text Token
,	TokenNameCOMMA	
lastTextToken	TokenNameIdentifier	 last Text Token
-	TokenNameMINUS	
firstTextToken	TokenNameIdentifier	 first Text Token
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
getLoTextToken	TokenNameIdentifier	 get Lo Text Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
loTextTokenIndex	TokenNameIdentifier	 lo Text Token Index
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns how many characters are before the span in the document */	TokenNameCOMMENT_JAVADOC	 Returns how many characters are before the span in the document 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
getLoChar	TokenNameIdentifier	 get Lo Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
textTokens	TokenNameIdentifier	 text Tokens
[	TokenNameLBRACKET	
loTextTokenIndex	TokenNameIdentifier	 lo Text Token Index
]	TokenNameRBRACKET	
.	TokenNameDOT	
getLo	TokenNameIdentifier	 get Lo
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns how many characters there are up to and including the span */	TokenNameCOMMENT_JAVADOC	 Returns how many characters there are up to and including the span 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
getHiChar	TokenNameIdentifier	 get Hi Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
textTokens	TokenNameIdentifier	 text Tokens
[	TokenNameLBRACKET	
loTextTokenIndex	TokenNameIdentifier	 lo Text Token Index
+	TokenNamePLUS	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
getHi	TokenNameIdentifier	 get Hi
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
int	TokenNameint	
distance	TokenNameIdentifier	 distance
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
int	TokenNameint	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
>=	TokenNameGREATER_EQUAL	
j	TokenNameIdentifier	 j
?	TokenNameQUESTION	
i	TokenNameIdentifier	 i
-	TokenNameMINUS	
j	TokenNameIdentifier	 j
:	TokenNameCOLON	
j	TokenNameIdentifier	 j
-	TokenNameMINUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
Viewer	TokenNameIdentifier	 Viewer
toGUI	TokenNameIdentifier	 to GUI
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
SpanViewer	TokenNameIdentifier	 Span Viewer
.	TokenNameDOT	
ControlledTextViewer	TokenNameIdentifier	 Controlled Text Viewer
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//return new SpanViewer.TextViewer(this); 	TokenNameCOMMENT_LINE	return new SpanViewer.TextViewer(this); 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
