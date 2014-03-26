/* Copyright 2007, Carnegie Mellon, All Rights Reserved */	TokenNameCOMMENT_BLOCK	 Copyright 2007, Carnegie Mellon, All Rights Reserved 
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
SortedSet	TokenNameIdentifier	 Sorted Set
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
TreeSet	TokenNameIdentifier	 Tree Set
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
/** * This implementation of the Tokenizer interface is used for filtering a text base based on * a specified spantype. It is a trivial tokenizer in the sense that it takes a document from * the new text base, maps it to the old text base and copies over the tokens. If the mapping * is not found (ie if the document being added is not in the parent text base) then the * parent tokenizer is used. * * @author Quinten Mercer */	TokenNameCOMMENT_JAVADOC	 This implementation of the Tokenizer interface is used for filtering a text base based on a specified spantype. It is a trivial tokenizer in the sense that it takes a document from the new text base, maps it to the old text base and copies over the tokens. If the mapping is not found (ie if the document being added is not in the parent text base) then the parent tokenizer is used. * @author Quinten Mercer 
public	TokenNamepublic	
class	TokenNameclass	
FilterTokenizer	TokenNameIdentifier	 Filter Tokenizer
extends	TokenNameextends	
CompoundTokenizer	TokenNameIdentifier	 Compound Tokenizer
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
Logger	TokenNameIdentifier	 Logger
log	TokenNameIdentifier	 log
=	TokenNameEQUAL	
Logger	TokenNameIdentifier	 Logger
.	TokenNameDOT	
getLogger	TokenNameIdentifier	 get Logger
(	TokenNameLPAREN	
FilterTokenizer	TokenNameIdentifier	 Filter Tokenizer
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
TextBaseManager	TokenNameIdentifier	 Text Base Manager
textBaseManager	TokenNameIdentifier	 text Base Manager
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
parentLevelName	TokenNameIdentifier	 parent Level Name
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
levelName	TokenNameIdentifier	 level Name
;	TokenNameSEMICOLON	
public	TokenNamepublic	
FilterTokenizer	TokenNameIdentifier	 Filter Tokenizer
(	TokenNameLPAREN	
TextBaseManager	TokenNameIdentifier	 Text Base Manager
tbMan	TokenNameIdentifier	 tb Man
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
levelName	TokenNameIdentifier	 level Name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
parentLevelName	TokenNameIdentifier	 parent Level Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
textBaseManager	TokenNameIdentifier	 text Base Manager
=	TokenNameEQUAL	
tbMan	TokenNameIdentifier	 tb Man
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
levelName	TokenNameIdentifier	 level Name
=	TokenNameEQUAL	
levelName	TokenNameIdentifier	 level Name
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
parentLevelName	TokenNameIdentifier	 parent Level Name
=	TokenNameEQUAL	
parentLevelName	TokenNameIdentifier	 parent Level Name
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
parentTokenizer	TokenNameIdentifier	 parent Tokenizer
=	TokenNameEQUAL	
tbMan	TokenNameIdentifier	 tb Man
.	TokenNameDOT	
getTextBase	TokenNameIdentifier	 get Text Base
(	TokenNameLPAREN	
parentLevelName	TokenNameIdentifier	 parent Level Name
)	TokenNameRPAREN	
.	TokenNameDOT	
getTokenizer	TokenNameIdentifier	 get Tokenizer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Tokenize a string */	TokenNameCOMMENT_JAVADOC	 Tokenize a string 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
splitIntoTokens	TokenNameIdentifier	 split Into Tokens
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
string	TokenNameIdentifier	 string
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
parentTokenizer	TokenNameIdentifier	 parent Tokenizer
.	TokenNameDOT	
splitIntoTokens	TokenNameIdentifier	 split Into Tokens
(	TokenNameLPAREN	
string	TokenNameIdentifier	 string
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Tokenize a document. */	TokenNameCOMMENT_JAVADOC	 Tokenize a document. 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
TextToken	TokenNameIdentifier	 Text Token
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
splitIntoTokens	TokenNameIdentifier	 split Into Tokens
(	TokenNameLPAREN	
Document	TokenNameIdentifier	 Document
document	TokenNameIdentifier	 document
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Span	TokenNameIdentifier	 Span
matchingParentSpan	TokenNameIdentifier	 matching Parent Span
=	TokenNameEQUAL	
textBaseManager	TokenNameIdentifier	 text Base Manager
.	TokenNameDOT	
getMatchingSpan	TokenNameIdentifier	 get Matching Span
(	TokenNameLPAREN	
levelName	TokenNameIdentifier	 level Name
,	TokenNameCOMMA	
document	TokenNameIdentifier	 document
.	TokenNameDOT	
getId	TokenNameIdentifier	 get Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
document	TokenNameIdentifier	 document
.	TokenNameDOT	
getText	TokenNameIdentifier	 get Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
parentLevelName	TokenNameIdentifier	 parent Level Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
matchingParentSpan	TokenNameIdentifier	 matching Parent Span
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
SortedSet	TokenNameIdentifier	 Sorted Set
<	TokenNameLESS	
TextToken	TokenNameIdentifier	 Text Token
>	TokenNameGREATER	
tokens	TokenNameIdentifier	 tokens
=	TokenNameEQUAL	
new	TokenNamenew	
TreeSet	TokenNameIdentifier	 Tree Set
<	TokenNameLESS	
TextToken	TokenNameIdentifier	 Text Token
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
currOffset	TokenNameIdentifier	 curr Offset
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
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
matchingParentSpan	TokenNameIdentifier	 matching Parent Span
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Get the next token in the matching parent span 	TokenNameCOMMENT_LINE	Get the next token in the matching parent span 
TextToken	TokenNameIdentifier	 Text Token
currParentToken	TokenNameIdentifier	 curr Parent Token
=	TokenNameEQUAL	
matchingParentSpan	TokenNameIdentifier	 matching Parent Span
.	TokenNameDOT	
getTextToken	TokenNameIdentifier	 get Text Token
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Figure out the offset in the doc where this token begins 	TokenNameCOMMENT_LINE	Figure out the offset in the doc where this token begins 
currOffset	TokenNameIdentifier	 curr Offset
=	TokenNameEQUAL	
currParentToken	TokenNameIdentifier	 curr Parent Token
.	TokenNameDOT	
getLo	TokenNameIdentifier	 get Lo
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
matchingParentSpan	TokenNameIdentifier	 matching Parent Span
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
// Copy this token over to array of tokens for the new document. 	TokenNameCOMMENT_LINE	Copy this token over to array of tokens for the new document. 
tokens	TokenNameIdentifier	 tokens
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
TextToken	TokenNameIdentifier	 Text Token
(	TokenNameLPAREN	
document	TokenNameIdentifier	 document
,	TokenNameCOMMA	
currOffset	TokenNameIdentifier	 curr Offset
,	TokenNameCOMMA	
currParentToken	TokenNameIdentifier	 curr Parent Token
.	TokenNameDOT	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
tokens	TokenNameIdentifier	 tokens
.	TokenNameDOT	
toArray	TokenNameIdentifier	 to Array
(	TokenNameLPAREN	
new	TokenNamenew	
TextToken	TokenNameIdentifier	 Text Token
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
log	TokenNameIdentifier	 log
.	TokenNameDOT	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
"Matching span could not be found for document span for doc: "	TokenNameStringLiteral	Matching span could not be found for document span for doc: 
+	TokenNamePLUS	
document	TokenNameIdentifier	 document
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
parentTokenizer	TokenNameIdentifier	 parent Tokenizer
.	TokenNameDOT	
splitIntoTokens	TokenNameIdentifier	 split Into Tokens
(	TokenNameLPAREN	
document	TokenNameIdentifier	 document
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
