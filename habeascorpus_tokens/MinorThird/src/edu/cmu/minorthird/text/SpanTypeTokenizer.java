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
ArrayList	TokenNameIdentifier	 Array List
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
List	TokenNameIdentifier	 List
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
/** * This implementation of the Tokenizer interface is used for re-tokenizing documents based on * a specified spantype. All tokens inside the spantype are put together to create a single * "pseudotoken". All other tokens remain as originally tokenized. * * @author Quinten Mercer */	TokenNameCOMMENT_JAVADOC	 This implementation of the Tokenizer interface is used for re-tokenizing documents based on a specified spantype. All tokens inside the spantype are put together to create a single "pseudotoken". All other tokens remain as originally tokenized. * @author Quinten Mercer 
public	TokenNamepublic	
class	TokenNameclass	
SpanTypeTokenizer	TokenNameIdentifier	 Span Type Tokenizer
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
SpanTypeTokenizer	TokenNameIdentifier	 Span Type Tokenizer
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
spanType	TokenNameIdentifier	 span Type
;	TokenNameSEMICOLON	
private	TokenNameprivate	
TextLabels	TokenNameIdentifier	 Text Labels
labels	TokenNameIdentifier	 labels
;	TokenNameSEMICOLON	
public	TokenNamepublic	
SpanTypeTokenizer	TokenNameIdentifier	 Span Type Tokenizer
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
,	TokenNameCOMMA	
TextLabels	TokenNameIdentifier	 Text Labels
l	TokenNameIdentifier	 l
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
spanType	TokenNameIdentifier	 span Type
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
labels	TokenNameIdentifier	 labels
=	TokenNameEQUAL	
l	TokenNameIdentifier	 l
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
parentTokenizer	TokenNameIdentifier	 parent Tokenizer
=	TokenNameEQUAL	
l	TokenNameIdentifier	 l
.	TokenNameDOT	
getTextBase	TokenNameIdentifier	 get Text Base
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getTokenizer	TokenNameIdentifier	 get Tokenizer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getSpanType	TokenNameIdentifier	 get Span Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
spanType	TokenNameIdentifier	 span Type
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
TextLabels	TokenNameIdentifier	 Text Labels
getTextLabels	TokenNameIdentifier	 get Text Labels
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
labels	TokenNameIdentifier	 labels
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
//TextToken[] parentTokens; 	TokenNameCOMMENT_LINE	TextToken[] parentTokens; 
// If there is no document in the textbase related to the labels that we know, just use the base tokenizer 	TokenNameCOMMENT_LINE	If there is no document in the textbase related to the labels that we know, just use the base tokenizer 
if	TokenNameif	
(	TokenNameLPAREN	
labels	TokenNameIdentifier	 labels
.	TokenNameDOT	
getTextBase	TokenNameIdentifier	 get Text Base
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getDocument	TokenNameIdentifier	 get Document
(	TokenNameLPAREN	
document	TokenNameIdentifier	 document
.	TokenNameDOT	
getId	TokenNameIdentifier	 get Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
log	TokenNameIdentifier	 log
.	TokenNameDOT	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
"Labels for document with id: "	TokenNameStringLiteral	Labels for document with id: 
+	TokenNamePLUS	
document	TokenNameIdentifier	 document
.	TokenNameDOT	
getId	TokenNameIdentifier	 get Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" are not available, will tokenize using base tokenizer."	TokenNameStringLiteral	 are not available, will tokenize using base tokenizer.
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
// If the document passed in has the same doc id as a document in our labels set, but has 	TokenNameCOMMENT_LINE	If the document passed in has the same doc id as a document in our labels set, but has 
// different actual text, then just use the parent tokenizer. 	TokenNameCOMMENT_LINE	different actual text, then just use the parent tokenizer. 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
labels	TokenNameIdentifier	 labels
.	TokenNameDOT	
getTextBase	TokenNameIdentifier	 get Text Base
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getDocument	TokenNameIdentifier	 get Document
(	TokenNameLPAREN	
document	TokenNameIdentifier	 document
.	TokenNameDOT	
getId	TokenNameIdentifier	 get Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getText	TokenNameIdentifier	 get Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
document	TokenNameIdentifier	 document
.	TokenNameDOT	
getText	TokenNameIdentifier	 get Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
log	TokenNameIdentifier	 log
.	TokenNameDOT	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
"Document with id: "	TokenNameStringLiteral	Document with id: 
+	TokenNamePLUS	
document	TokenNameIdentifier	 document
.	TokenNameDOT	
getId	TokenNameIdentifier	 get Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" differs from the document in the labels set with the same ID. Will tokenize using base tokenizer."	TokenNameStringLiteral	 differs from the document in the labels set with the same ID. Will tokenize using base tokenizer.
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
// Get the tokens for the matching document in our labels set. 	TokenNameCOMMENT_LINE	Get the tokens for the matching document in our labels set. 
TextToken	TokenNameIdentifier	 Text Token
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
parentTokens	TokenNameIdentifier	 parent Tokens
=	TokenNameEQUAL	
labels	TokenNameIdentifier	 labels
.	TokenNameDOT	
getTextBase	TokenNameIdentifier	 get Text Base
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getDocument	TokenNameIdentifier	 get Document
(	TokenNameLPAREN	
document	TokenNameIdentifier	 document
.	TokenNameDOT	
getId	TokenNameIdentifier	 get Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getTokens	TokenNameIdentifier	 get Tokens
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Sort the old tokens to guarantee that we can access them in order. 	TokenNameCOMMENT_LINE	Sort the old tokens to guarantee that we can access them in order. 
SortedSet	TokenNameIdentifier	 Sorted Set
<	TokenNameLESS	
TextToken	TokenNameIdentifier	 Text Token
>	TokenNameGREATER	
sortedTokens	TokenNameIdentifier	 sorted Tokens
=	TokenNameEQUAL	
new	TokenNamenew	
TreeSet	TokenNameIdentifier	 Tree Set
<	TokenNameLESS	
TextToken	TokenNameIdentifier	 Text Token
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
parentTokens	TokenNameIdentifier	 parent Tokens
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sortedTokens	TokenNameIdentifier	 sorted Tokens
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
parentTokens	TokenNameIdentifier	 parent Tokens
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Create the new list of tokens by copying all the old tokens outside of instances of spanType and 	TokenNameCOMMENT_LINE	Create the new list of tokens by copying all the old tokens outside of instances of spanType and 
// combining all the old tokens inside each instance into a single new token. The idea with this 	TokenNameCOMMENT_LINE	combining all the old tokens inside each instance into a single new token. The idea with this 
// implementation is that currOldToken holds the *next* token from the parent document to be looked at. 	TokenNameCOMMENT_LINE	implementation is that currOldToken holds the *next* token from the parent document to be looked at. 
// This token will either be added as is, or skipped over so that a new custom token that includes its 	TokenNameCOMMENT_LINE	This token will either be added as is, or skipped over so that a new custom token that includes its 
// characters can be created in its place. 	TokenNameCOMMENT_LINE	characters can be created in its place. 
List	TokenNameIdentifier	 List
<	TokenNameLESS	
TextToken	TokenNameIdentifier	 Text Token
>	TokenNameGREATER	
tokenList	TokenNameIdentifier	 token List
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
TextToken	TokenNameIdentifier	 Text Token
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
TextToken	TokenNameIdentifier	 Text Token
>	TokenNameGREATER	
oldTokenIterator	TokenNameIdentifier	 old Token Iterator
=	TokenNameEQUAL	
sortedTokens	TokenNameIdentifier	 sorted Tokens
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
TextToken	TokenNameIdentifier	 Text Token
currOldToken	TokenNameIdentifier	 curr Old Token
=	TokenNameEQUAL	
oldTokenIterator	TokenNameIdentifier	 old Token Iterator
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Span	TokenNameIdentifier	 Span
>	TokenNameGREATER	
typeIterator	TokenNameIdentifier	 type Iterator
=	TokenNameEQUAL	
labels	TokenNameIdentifier	 labels
.	TokenNameDOT	
instanceIterator	TokenNameIdentifier	 instance Iterator
(	TokenNameLPAREN	
spanType	TokenNameIdentifier	 span Type
,	TokenNameCOMMA	
document	TokenNameIdentifier	 document
.	TokenNameDOT	
getId	TokenNameIdentifier	 get Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
typeIterator	TokenNameIdentifier	 type Iterator
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Span	TokenNameIdentifier	 Span
currSpan	TokenNameIdentifier	 curr Span
=	TokenNameEQUAL	
typeIterator	TokenNameIdentifier	 type Iterator
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Copy over the tokens for the text that came before the current instance of spanType 	TokenNameCOMMENT_LINE	Copy over the tokens for the text that came before the current instance of spanType 
while	TokenNamewhile	
(	TokenNameLPAREN	
currOldToken	TokenNameIdentifier	 curr Old Token
.	TokenNameDOT	
getLo	TokenNameIdentifier	 get Lo
(	TokenNameLPAREN	
)	TokenNameRPAREN	
<	TokenNameLESS	
currSpan	TokenNameIdentifier	 curr Span
.	TokenNameDOT	
getTextToken	TokenNameIdentifier	 get Text Token
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
getLo	TokenNameIdentifier	 get Lo
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
tokenList	TokenNameIdentifier	 token List
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
TextToken	TokenNameIdentifier	 Text Token
(	TokenNameLPAREN	
document	TokenNameIdentifier	 document
,	TokenNameCOMMA	
currOldToken	TokenNameIdentifier	 curr Old Token
.	TokenNameDOT	
getLo	TokenNameIdentifier	 get Lo
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
currOldToken	TokenNameIdentifier	 curr Old Token
.	TokenNameDOT	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
currOldToken	TokenNameIdentifier	 curr Old Token
=	TokenNameEQUAL	
oldTokenIterator	TokenNameIdentifier	 old Token Iterator
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
tokenList	TokenNameIdentifier	 token List
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
TextToken	TokenNameIdentifier	 Text Token
(	TokenNameLPAREN	
document	TokenNameIdentifier	 document
,	TokenNameCOMMA	
currSpan	TokenNameIdentifier	 curr Span
.	TokenNameDOT	
getTextToken	TokenNameIdentifier	 get Text Token
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
getLo	TokenNameIdentifier	 get Lo
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
currSpan	TokenNameIdentifier	 curr Span
.	TokenNameDOT	
asString	TokenNameIdentifier	 as String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Skip past the tokens in the iterator that correspond to this instance of spanType; 	TokenNameCOMMENT_LINE	Skip past the tokens in the iterator that correspond to this instance of spanType; 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
currSpan	TokenNameIdentifier	 curr Span
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
currOldToken	TokenNameIdentifier	 curr Old Token
=	TokenNameEQUAL	
oldTokenIterator	TokenNameIdentifier	 old Token Iterator
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
(	TokenNameLPAREN	
TextToken	TokenNameIdentifier	 Text Token
)	TokenNameRPAREN	
oldTokenIterator	TokenNameIdentifier	 old Token Iterator
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// Copy any remaining tokens. 	TokenNameCOMMENT_LINE	Copy any remaining tokens. 
if	TokenNameif	
(	TokenNameLPAREN	
currOldToken	TokenNameIdentifier	 curr Old Token
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
tokenList	TokenNameIdentifier	 token List
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
TextToken	TokenNameIdentifier	 Text Token
(	TokenNameLPAREN	
document	TokenNameIdentifier	 document
,	TokenNameCOMMA	
currOldToken	TokenNameIdentifier	 curr Old Token
.	TokenNameDOT	
getLo	TokenNameIdentifier	 get Lo
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
currOldToken	TokenNameIdentifier	 curr Old Token
.	TokenNameDOT	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
oldTokenIterator	TokenNameIdentifier	 old Token Iterator
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
currOldToken	TokenNameIdentifier	 curr Old Token
=	TokenNameEQUAL	
oldTokenIterator	TokenNameIdentifier	 old Token Iterator
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tokenList	TokenNameIdentifier	 token List
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
TextToken	TokenNameIdentifier	 Text Token
(	TokenNameLPAREN	
document	TokenNameIdentifier	 document
,	TokenNameCOMMA	
currOldToken	TokenNameIdentifier	 curr Old Token
.	TokenNameDOT	
getLo	TokenNameIdentifier	 get Lo
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
currOldToken	TokenNameIdentifier	 curr Old Token
.	TokenNameDOT	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Convert the ArrayList into a TextToken[] to return 	TokenNameCOMMENT_LINE	Convert the ArrayList into a TextToken[] to return 
TextToken	TokenNameIdentifier	 Text Token
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
tokenArray	TokenNameIdentifier	 token Array
=	TokenNameEQUAL	
tokenList	TokenNameIdentifier	 token List
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
return	TokenNamereturn	
tokenArray	TokenNameIdentifier	 token Array
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
